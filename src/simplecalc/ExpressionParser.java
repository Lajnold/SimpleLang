package simplecalc;

import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;

import simplecalc.generated.SimpleCalcLexer;
import simplecalc.generated.SimpleCalcParser;


public class ExpressionParser {
    
    private Map<String, Double> variables = new HashMap<>();
    private boolean doPrintTreeOnParse = false;
    
    public ExpressionParser() {
        addBuiltinVariables();
    }

    private void addBuiltinVariables() {
        variables.put("pi", Math.PI);
        variables.put("e", Math.E);
    }
    
    public void printTreeOnParse(boolean doPrint) {
        doPrintTreeOnParse = doPrint;
    }

    public Double parse(String expr)
            throws ExpressionException {
        SimpleCalcLexer lexer = new SimpleCalcLexer(new ANTLRStringStream(expr));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SimpleCalcParser parser = new SimpleCalcParser(tokenStream);
        
        try {
            SimpleCalcParser.parse_return parseReturn = parser.parse();
            Tree tree = (Tree) parseReturn.getTree();
            Double retVal = null;
            
            if (doPrintTreeOnParse) {
                printTree(tree);
            }
            
            if (tree.getType() == SimpleCalcParser.T_ASSIGN) {
                handleAssignment(tree);
            } else {
                retVal = calculateTree(tree);
            }
            
            return retVal;
        } catch (RecognitionException e) {
            throw new ExpressionException(e);
        }
    }
    
    private void handleAssignment(Tree tree) {
        String varName = tree.getChild(0).getText();
        Double value = calculateTree(tree.getChild(1));
        
        variables.put(varName, value);
    }

    private Double calculateTree(Tree tree) {
        Double value = getNodeValue(tree);
        int skipNodes = getNumberOfSpecialNodeArgs(tree);
        
        for (int i = skipNodes; i < tree.getChildCount(); i += 2) {
            Tree opTree = tree.getChild(i);
            Tree valueTree = tree.getChild(i + 1);
            Double childValue = calculateTree(valueTree);

            switch (opTree.getType()) {
                case SimpleCalcParser.PLUS:
                    value += childValue;
                    break;
                case SimpleCalcParser.MINUS:
                    value -= childValue;
                    break;
                case SimpleCalcParser.TIMES:
                    value *= childValue;
                    break;
                case SimpleCalcParser.DIVIDED_BY:
                    value /= childValue;
                    break;
            }
        }
        
        return value;
    }

    private int getNumberOfSpecialNodeArgs(Tree tree) {
        int nArgs = 0;
        
        switch (tree.getType()) {
            case SimpleCalcParser.T_CALL:
                nArgs = 1;
                while (nArgs < tree.getChildCount()
                        && tree.getChild(nArgs).getType() == SimpleCalcParser.T_ARG) {
                    nArgs += 2;
                }
                break;
            case SimpleCalcParser.T_VAR:
                nArgs = 1;
                break;
        }
        
        return nArgs;
    }

    private Double getNodeValue(Tree node) {
        Double value;
        
        switch (node.getType()) {
            case SimpleCalcParser.NUMBER:
                value = getNodeValueNumber(node);
                break;
            case SimpleCalcParser.T_CALL:
                value = getNodeValueCall(node);
                break;
            case SimpleCalcParser.T_VAR:
                value = getNodeValueVar(node);
                break;
            default:
                throw new IllegalArgumentException(
                        "Cannot get value for node of type: " + node.getType());
        }
        
        return value;
    }

    private Double getNodeValueVar(Tree node) {
        String varName = node.getChild(0).getText();
        Double value = variables.get(varName);
        
        if (value == null) {
            throw new ExpressionException("No such variable: " + varName);
        }
        
        return value;
    }

    private Double getNodeValueNumber(Tree node) {
        try {
            return Double.parseDouble(node.getText());
        } catch (NumberFormatException e) {
            throw new ExpressionException("Invalid number: " + node.getText(), e);
        }
    }

    private Double getNodeValueCall(Tree node) {
        Double value;
        String functionName = node.getChild(0).getText();
        Tree argumentTree = node.getChild(2);
        Double argumentValue = calculateTree(argumentTree);
        
        switch (functionName) {
            case "sin":
                value = Math.sin(argumentValue);
                break;
            case "cos":
                value = Math.cos(argumentValue);
                break;
            default:
                throw new ExpressionException(
                        "No such function: " + functionName);
        }
        
        return value;
    }
    
    private void printTree(Tree tree) {
        printTree(tree, 0);
    }
    
    private void printTree(Tree tree, int depth) {
        if (tree == null) {
            return;
        }
        
        for (int i = 0; i < depth; i++) {
            System.out.print("  ");
        }
        
        System.out.println(tree);
        
        for (int i = 0; i < tree.getChildCount(); i++) {
            printTree(tree.getChild(i), depth + 1);
        }
    }
}

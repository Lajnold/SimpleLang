package calculator;

import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;

import calculator.generated.CalculatorLexer;
import calculator.generated.CalculatorParser;



public class ExpressionParser {
    
    private Map<String, BigNumber> variables = new HashMap<>();
    private boolean doPrintTreeOnParse = false;
    
    public ExpressionParser() {
        addBuiltinVariables();
    }

    private void addBuiltinVariables() {
        variables.put("pi", new BigNumber(Math.PI));
        variables.put("e", new BigNumber(Math.E));
    }
    
    public void printTreeOnParse(boolean doPrint) {
        doPrintTreeOnParse = doPrint;
    }

    public BigNumber parse(String expr)
            throws ExpressionException {
        CalculatorLexer lexer = new CalculatorLexer(new ANTLRStringStream(expr));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        CalculatorParser parser = new CalculatorParser(tokenStream);
        
        try {
            CalculatorParser.parse_return parseReturn = parser.parse();
            Tree tree = (Tree) parseReturn.getTree();
            BigNumber retVal = null;
            
            if (doPrintTreeOnParse) {
                printTree(tree);
            }
            
            if (tree.getType() == CalculatorParser.T_ASSIGN) {
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
        BigNumber value = calculateTree(tree.getChild(1));
        
        variables.put(varName, value);
    }

    private BigNumber calculateTree(Tree tree) {
        BigNumber value = getNodeValue(tree);
        int skipNodes = getNumberOfSpecialNodeArgs(tree);
        
        for (int i = skipNodes; i < tree.getChildCount(); i += 2) {
            Tree opTree = tree.getChild(i);
            Tree valueTree = tree.getChild(i + 1);
            BigNumber childValue = calculateTree(valueTree);

            switch (opTree.getType()) {
                case CalculatorParser.PLUS:
                    value = value.add(childValue);
                    break;
                case CalculatorParser.MINUS:
                    value = value.subtract(childValue);
                    break;
                case CalculatorParser.TIMES:
                    value = value.multiply(childValue);
                    break;
                case CalculatorParser.DIVIDED_BY:
                    value = value.divide(childValue);
                    break;
            }
        }
        
        return value;
    }

    private int getNumberOfSpecialNodeArgs(Tree tree) {
        int nArgs = 0;
        
        switch (tree.getType()) {
            case CalculatorParser.T_CALL:
                nArgs = 1;
                while (nArgs < tree.getChildCount()
                        && tree.getChild(nArgs).getType() == CalculatorParser.T_ARG) {
                    nArgs += 2;
                }
                break;
            case CalculatorParser.T_VAR:
                nArgs = 1;
                break;
        }
        
        return nArgs;
    }

    private BigNumber getNodeValue(Tree node) {
        BigNumber value;
        
        switch (node.getType()) {
            case CalculatorParser.NUMBER:
                value = getNodeValueNumber(node);
                break;
            case CalculatorParser.T_CALL:
                value = getNodeValueCall(node);
                break;
            case CalculatorParser.T_VAR:
                value = getNodeValueVar(node);
                break;
            default:
                throw new IllegalArgumentException(
                        "Cannot get value for node of type: " + node.getType());
        }
        
        return value;
    }

    private BigNumber getNodeValueVar(Tree node) {
        String varName = node.getChild(0).getText();
        BigNumber value = variables.get(varName);
        
        if (value == null) {
            throw new ExpressionException("No such variable: " + varName);
        }
        
        return value;
    }

    private BigNumber getNodeValueNumber(Tree node) {
        try {
            return new BigNumber(node.getText());
        } catch (NumberFormatException e2) {
            throw new ExpressionException("Invalid number: " + node.getText(), e2);
        }
    }

    private BigNumber getNodeValueCall(Tree node) {
        BigNumber value;
        String functionName = node.getChild(0).getText();
        Tree argumentTree = node.getChild(2);
        BigNumber argumentValue = calculateTree(argumentTree);
        
        switch (functionName) {
            case "sin":
                value = new BigNumber(Math.sin(argumentValue.doubleValue()));
                break;
            case "cos":
                value = new BigNumber(Math.cos(argumentValue.doubleValue()));
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

package simplelang.parser;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;

import simplelang.generated.CalculatorLexer;
import simplelang.generated.CalculatorParser;
import simplelang.parser.ast.AST;
import simplelang.parser.ast.BinOpAST;
import simplelang.parser.ast.FunctionCallAST;
import simplelang.parser.ast.NumberAST;
import simplelang.parser.ast.VariableAssignmentAST;
import simplelang.parser.ast.VariableReferenceAST;


public class AntlrParser implements Parser {
    
    public void printTreeOnParse(boolean doPrint) {
        doPrintTreeOnParse = doPrint;
    }
    
    @Override
    public List<AST> parse(String input) throws SyntaxException {
        ArrayList<AST> returnValue = new ArrayList<>();
        
        CalculatorLexer lexer = new CalculatorLexer(new ANTLRStringStream(input));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        CalculatorParser parser = new CalculatorParser(tokenStream);
        
        CalculatorParser.parse_return parseReturn;
        try {
            parseReturn = parser.parse();
            Tree tree = (Tree) parseReturn.getTree();
            
            if (doPrintTreeOnParse) {
                printTree(tree);
            }
            
            if (tree.getType() == CalculatorParser.T_ASSIGN) {
                returnValue.add(makeAssignmentAST(tree));
            } else if (tree.getType() == CalculatorParser.T_EXPR) {
                returnValue.add(makeExpressionAST(tree));
            }
        } catch (RecognitionException e) {
            throw new SyntaxException(e);
        }
        
        return returnValue;
    }
    
    private AST makeAssignmentAST(Tree tree) throws SyntaxException {
        String varName = tree.getChild(0).getText();
        AST value = makeExpressionAST(tree.getChild(1));
        
        return new VariableAssignmentAST(varName, value);
    }
    
    private AST makeExpressionAST(Tree tree) throws SyntaxException {
        List<Tree> nodes = new ArrayList<>();
        for (int i = 0; i < tree.getChildCount(); i++) {
            nodes.add(tree.getChild(i));
        }
        
        return makeExpressionTreeFromNodes(nodes);
    }
    
    private AST makeExpressionTreeFromNodes(List<Tree> nodes) throws SyntaxException {
        
        if (nodes.size() == 1) {
            return makeUnaryAST(nodes.get(0));
        }
        
        int addIndex = -1;
        int subIndex = -1;
        int mulIndex = -1;
        int divIndex = -1;

        for (int i = nodes.size() - 2; i > 0; i -= 2) {
            switch (nodes.get(i).getType()) {
                case CalculatorParser.PLUS:
                    if (addIndex == -1) addIndex = i;
                    break;
                case CalculatorParser.MINUS:
                    if (subIndex == -1) subIndex = i;
                    break;
                case CalculatorParser.TIMES:
                    if (mulIndex == -1) mulIndex = i;
                    break;
                case CalculatorParser.DIVIDED_BY:
                    if (divIndex == -1) divIndex = i;
                    break;
            }
        }
        
        BinOpAST.Operation op;
        int opIndex;
        if (addIndex >= 0) {
            opIndex = addIndex;
            op = BinOpAST.Operation.ADD;
        } else if (subIndex >= 0) {
            opIndex = subIndex;
            op = BinOpAST.Operation.SUB;
        } else if (mulIndex >= 0) {
            opIndex = mulIndex;
            op = BinOpAST.Operation.MUL;
        } else {
            opIndex = divIndex;
            op = BinOpAST.Operation.DIV;
        }
        
        List<Tree> leftNodes = new ArrayList<>();
        List<Tree> rightNodes = new ArrayList<>();
        
        for (int i = 0; i < nodes.size(); i++) {
            if (i < opIndex) {
                leftNodes.add(nodes.get(i));
            } else if (i > opIndex) {
                rightNodes.add(nodes.get(i));
            }
        }
        
        AST leftTree = makeExpressionTreeFromNodes(leftNodes);
        AST rightTree = makeExpressionTreeFromNodes(rightNodes);
        
        return new BinOpAST(op, leftTree, rightTree);
    }

    private AST makeUnaryAST(Tree tree) throws SyntaxException {
        AST ast = null;
        
        switch (tree.getType()) {
            case CalculatorParser.NUMBER:
                ast = makeNumberAST(tree);
                break;
            case CalculatorParser.T_EXPR:
                ast = makeExpressionAST(tree);
                break;
            case CalculatorParser.T_CALL:
                ast = makeFunctionCallAST(tree);
                break;
            case CalculatorParser.T_VAR:
                ast = makeVarRefAST(tree);
                break;
            default:
                throw new IllegalArgumentException(
                        "Invalid unary type: " + tree.getType());
        }
        
        return ast;
    }

    private NumberAST makeNumberAST(Tree tree) throws SyntaxException {
        // For positive numbers, the tree is just a simple NUMBER node.
        // For negative numbers, it is instead a small tree:
        // -1
        //   *
        //   <number>
        
        NumberAST ast = null;
        
        if (tree.getText() == "-1" && tree.getChildCount() > 0) {
            Tree actualNumberTree = tree.getChild(1);
            ast = new NumberAST("-" + actualNumberTree.getText());
        } else {
            ast = new NumberAST(tree.getText());
        }
        
        return ast;            
    }
    
    private VariableReferenceAST makeVarRefAST(Tree tree) {
        String varName = tree.getChild(0).getText();
        return new VariableReferenceAST(varName);
    }

    private FunctionCallAST makeFunctionCallAST(Tree tree)
            throws SyntaxException {
        String functionName = tree.getChild(0).getText();
        
        ArrayList<AST> args = new ArrayList<>();
        for (int i = 1; i < tree.getChildCount(); i++) {
            Tree argumentTree = tree.getChild(i);
            args.add(makeExpressionAST(argumentTree));
        }
        
        return new FunctionCallAST(functionName, args);
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
    
    
    private boolean doPrintTreeOnParse = false;
}

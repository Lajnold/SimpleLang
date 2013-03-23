package simplelang.parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;

import simplelang.generated.CalculatorLexer;
import simplelang.generated.CalculatorParser;
import simplelang.parser.ast.AST;
import simplelang.parser.ast.BinOpAST;
import simplelang.parser.ast.BooleanAST;
import simplelang.parser.ast.FunctionCallAST;
import simplelang.parser.ast.LogicalOpAST;
import simplelang.parser.ast.LogicalNotAST;
import simplelang.parser.ast.LogicalRelOpAST;
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
        
        int opIndex = -1;
        int opPrecedence = -1;
        int opType = -1;

        for (int i = nodes.size() - 2; i > 0; i -= 2) {
            int op = nodes.get(i).getType();
            int precedence = operatorPrecedenceMap.get(op);
            if (precedence > opPrecedence) {
                opIndex = i;
                opPrecedence = precedence;
                opType = op;
            }
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
        
        return constructBinaryAST(opType, leftTree, rightTree);
    }

    private AST constructBinaryAST(int antlrOpType, AST leftTree, AST rightTree) {
        AST retval;
        switch (antlrOpType) {
            case CalculatorParser.OR:
                retval = new LogicalOpAST(LogicalOpAST.Operator.OR, leftTree, rightTree);
                break;
            case CalculatorParser.AND:
                retval = new LogicalOpAST(LogicalOpAST.Operator.AND, leftTree, rightTree);
                break;
            case CalculatorParser.EQ:
                retval = new LogicalRelOpAST(LogicalRelOpAST.Operator.EQ, leftTree, rightTree);
                break;
            case CalculatorParser.NEQ:
                retval = new LogicalRelOpAST(LogicalRelOpAST.Operator.NEQ, leftTree, rightTree);
                break;
            case CalculatorParser.LT:
                retval = new LogicalRelOpAST(LogicalRelOpAST.Operator.LT, leftTree, rightTree);
                break;
            case CalculatorParser.LTE:
                retval = new LogicalRelOpAST(LogicalRelOpAST.Operator.LTE, leftTree, rightTree);
                break;
            case CalculatorParser.GT:
                retval = new LogicalRelOpAST(LogicalRelOpAST.Operator.GT, leftTree, rightTree);
                break;
            case CalculatorParser.GTE:
                retval = new LogicalRelOpAST(LogicalRelOpAST.Operator.GTE, leftTree, rightTree);
                break;
            case CalculatorParser.PLUS:
                retval = new BinOpAST(BinOpAST.Operator.ADD, leftTree, rightTree);
                break;
            case CalculatorParser.MINUS:
                retval = new BinOpAST(BinOpAST.Operator.SUB, leftTree, rightTree);
                break;
            case CalculatorParser.TIMES:
                retval = new BinOpAST(BinOpAST.Operator.MUL, leftTree, rightTree);
                break;
            case CalculatorParser.DIVIDED_BY:
                retval = new BinOpAST(BinOpAST.Operator.DIV, leftTree, rightTree);
                break;
            default:
                throw new IllegalArgumentException("Invalid op type:" + antlrOpType);
        }
        return retval;
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
            case CalculatorParser.T_NOT:
                ast = makeNotAST(tree);
                break;
            case CalculatorParser.TRUE: /* Fall through */
            case CalculatorParser.FALSE:
                ast = makeBooleanAST(tree);
                break;
            default:
                throw new IllegalArgumentException(
                        "Invalid unary type: " + tree.getType());
        }
        
        return ast;
    }

    private BooleanAST makeBooleanAST(Tree tree) {
        BooleanAST retval = null;
        if (tree.getType() == CalculatorParser.TRUE) {
            retval = new BooleanAST(true);
        } else if (tree.getType() == CalculatorParser.FALSE) {
            retval = new BooleanAST(false);
        }
        return retval;
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
    
    private LogicalNotAST makeNotAST(Tree tree) throws SyntaxException {
        AST operand = makeExpressionAST(tree);
        return new LogicalNotAST(operand);
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
    
    /** Maps the binary operators from the ANTLR parser to their corresponding precedence values. */
    static final Map<Integer, Integer> operatorPrecedenceMap = new HashMap<>();

    // Static initialiser.
    {
        int[] operatorsByPrecedence = {
                CalculatorParser.DIVIDED_BY,
                CalculatorParser.TIMES,
                CalculatorParser.MINUS,
                CalculatorParser.PLUS,
                CalculatorParser.GTE,
                CalculatorParser.GT,
                CalculatorParser.LTE,
                CalculatorParser.LT,
                CalculatorParser.NEQ,
                CalculatorParser.EQ,
                CalculatorParser.AND,
                CalculatorParser.OR,

        };
        
        for (int i = 0; i < operatorsByPrecedence.length; i++) {
            operatorPrecedenceMap.put(operatorsByPrecedence[i], i);
        }
    }
}

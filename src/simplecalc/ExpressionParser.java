package simplecalc;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;

import simplecalc.generated.SimpleCalcLexer;
import simplecalc.generated.SimpleCalcParser;


public class ExpressionParser {

    public static double parseExpression(String expr)
            throws ExpressionException {
        SimpleCalcLexer lexer = new SimpleCalcLexer(new ANTLRStringStream(expr));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SimpleCalcParser parser = new SimpleCalcParser(tokenStream);
        
        try {
            SimpleCalcParser.parse_return parseReturn = parser.parse();
            Tree tree = (Tree) parseReturn.getTree();
            
//            preOrderPrint(tree, 0);
            
            double res = calculateTree(tree); 

            return res;
        } catch (RecognitionException e) {
            throw new ExpressionException(e);
        }
    }
    
    private static double calculateTree(Tree tree) {
        double value = Double.parseDouble(tree.getText());
        
        for (int i = 0; i < tree.getChildCount(); i += 2) {
            Tree opTree = tree.getChild(i);
            Tree valueTree = tree.getChild(i + 1);
            double childValue = calculateTree(valueTree);

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
    
    private static void preOrderPrint(Tree tree, int depth) {
        if (tree == null) {
            return;
        }
        
        for (int i = 0; i < depth; i++) {
            System.out.print("  ");
        }
        
        System.out.println(tree);
        
        for (int i = 0; i < tree.getChildCount(); i++) {
            preOrderPrint(tree.getChild(i), depth + 1);
        }
    }
}

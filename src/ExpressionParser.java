import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;


public class ExpressionParser {

    public static double parseExpression(String expr)
            throws ExpressionException {
        SimpleCalcLexer lexer = new SimpleCalcLexer(new ANTLRStringStream(expr));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SimpleCalcParser parser = new SimpleCalcParser(tokenStream);
        
        try {
            double res = parser.parse();
            return res;
        } catch (RecognitionException e) {
            throw new ExpressionException(e);
        }
    }
    
}

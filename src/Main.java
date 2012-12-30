import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

public class Main {
    
    public static void main(String[] args) {
        String input = "4 + 2 - 3 - 1 + 5";
        
        SimpleCalcLexer lexer = new SimpleCalcLexer(new ANTLRStringStream(input));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SimpleCalcParser parser = new SimpleCalcParser(tokenStream);
        
        try {
            double res = parser.parse();
            System.out.println("Result: " + res);
        } catch (RecognitionException e) {
            System.out.println("Invalid expression");
        }
    }
}

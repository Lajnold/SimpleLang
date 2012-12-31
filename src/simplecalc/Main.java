package simplecalc;

public class Main {
    
    public static void main(String[] args) {
        String input = "13 + (2 * 3) / 5 - 5 * 2";
        
        ExpressionParser.parseExpression(input);
    }
}

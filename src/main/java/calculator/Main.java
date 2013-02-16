package calculator;

public class Main {
    
    public static void main(String[] args) {
        String input = "13 + (2 * 3) / 5 - 5 * 2";
        
        ExpressionParser parser = new ExpressionParser();
        parser.parse(input);
    }
}

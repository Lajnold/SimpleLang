package simplelang;

import simplelang.parser.AntlrParser;

public class Main {
    
    public static void main(String[] args) {
        String input = "13 + (2 * 3) / 5 - 5 * 2";
        
        AntlrParser antlrParser = new AntlrParser();
        ExpressionParser parser = new ExpressionParser(antlrParser);
        parser.parse(input);
    }
}

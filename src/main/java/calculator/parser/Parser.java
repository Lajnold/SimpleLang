package calculator.parser;

import java.util.List;

import calculator.parser.ast.AST;

public interface Parser {
    
    public List<AST> parse(String input) throws SyntaxException;

}

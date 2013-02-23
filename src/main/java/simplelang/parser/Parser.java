package simplelang.parser;

import java.util.List;

import simplelang.parser.ast.AST;


public interface Parser {
    
    public List<AST> parse(String input) throws SyntaxException;

}

package simplelang.parser.ast;

/**
 * Base class for AST types whose instances represent a value,
 */
public class ValueAST extends AST {

    public ValueAST(Type type) {
        super(type);
    }
}

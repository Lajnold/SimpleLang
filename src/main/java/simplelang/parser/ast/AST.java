package simplelang.parser.ast;

/**
 * Base class for all AST types.
 */
public abstract class AST {
    
    /**
     * The different AST types.
     */
    public enum Type {
        BINARY_OP,
        NUMBER,
        VARIABLE_REF,
        VARIABLE_ASSIGNMENT,
        FUNCTION_CALL,
        LOGICAL_OP,
        LOGICAL_NOT_OP,
        RELATIONAL_OP,
        BOOLEAN
    }
    
    private Type type;
    
    public AST(Type type) {
        this.type = type;
    }
    
    public Type getType() {
        return type;
    }
}

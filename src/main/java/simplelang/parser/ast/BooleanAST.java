package simplelang.parser.ast;

public class BooleanAST extends AST {
    
    public BooleanAST(boolean value) {
        super(AST.Type.BOOLEAN);
        
        this.value = value;
    }
    
    public boolean getValue() {
        return value;
    }
    
    @Override
    public String toString() {
        return value ? "true" : "false";
    }
    
    @Override
    public boolean equals(Object rhs) {
        if (!(rhs instanceof BooleanAST)) {
            return false;
        }
        
        BooleanAST ast = (BooleanAST) rhs;
        return ast.value == value;
    }
    
    private boolean value;
}

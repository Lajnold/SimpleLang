package simplelang.parser.ast;

public class VariableReferenceAST extends AST {
    
    public VariableReferenceAST(String variableName) {
        super(AST.Type.VARIABLE_REF);
        
        if (variableName == null) throw new IllegalArgumentException("name is null");
        
        this.variableName = variableName;
    }
    
    public String getVariableName() {
        return variableName;
    }
    
    @Override
    public boolean equals(Object rhs) {
        if (!(rhs instanceof VariableReferenceAST)) {
            return false;
        }
        
        VariableReferenceAST varRefRhs = (VariableReferenceAST) rhs;
        return varRefRhs.variableName.equals(variableName);
    }
    
    @Override
    public String toString() {
        return variableName;
    }
    
    private String variableName;
}

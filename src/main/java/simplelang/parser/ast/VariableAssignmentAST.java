package simplelang.parser.ast;

public class VariableAssignmentAST extends AST {

    public VariableAssignmentAST(String variableName, ValueAST valueAst) {
        super(AST.Type.VARIABLE_ASSIGNMENT);
        
        if (variableName == null) throw new IllegalArgumentException("name is null");
        if (valueAst == null) throw new IllegalArgumentException("value is null");
        
        this.variableName = variableName;
        this.valueAst = valueAst;
    }
    
    public String getVariableName() {
        return variableName;
    }
    
    public ValueAST getValue() {
        return valueAst;
    }
    
    @Override
    public boolean equals(Object rhs) {
        if (!(rhs instanceof VariableAssignmentAST)) {
            return false;
        }
        
        VariableAssignmentAST assignmentRhs = (VariableAssignmentAST) rhs;
        return assignmentRhs.variableName.equals(variableName)
                && assignmentRhs.valueAst.equals(valueAst);
    }
    
    @Override
    public String toString() {
        return variableName + " = " + valueAst.toString();
    }
    
    private String variableName;
    private ValueAST valueAst;
}

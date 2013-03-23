package simplelang.parser.ast;

public class LogicalNotAST extends AST {

    public LogicalNotAST(AST operand) {
        super(AST.Type.LOGICAL_NOT_OP);
        
        if (operand == null) throw new IllegalArgumentException("operand is null");
        
        this.operand = operand;
    }
    
    public AST getOperand() {
        return operand;
    }
    
    @Override
    public boolean equals(Object rhs) {
        if (!(rhs instanceof LogicalNotAST)) {
            return false;
        }
        
        LogicalNotAST ast = (LogicalNotAST) rhs;
        return ast.operand.equals(operand);
    }
    
    @Override
    public String toString() {
        return "!" + operand;
    }
    
    private AST operand;
}

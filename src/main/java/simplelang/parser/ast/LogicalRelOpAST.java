package simplelang.parser.ast;

public class LogicalRelOpAST extends AST {
    
    public enum Operator {
        EQ,
        NEQ,
        LT,
        LTE,
        GT,
        GTE
    }

    public LogicalRelOpAST(Operator operator, AST left, AST right) {
        super(AST.Type.RELATIONAL_OP);
        
        if (operator == null) throw new IllegalArgumentException("operator is null");
        if (left == null) throw new IllegalArgumentException("left is null");
        if (right == null) throw new IllegalArgumentException("right is null");
        
        this.op = operator;
        this.left = left;
        this.right = right;
    }
    
    public Operator getOperator() {
        return op;
    }
    
    public AST getLeftOperand() {
        return left;
    }

    public AST getRightOperand() {
        return right;
    }
    
    @Override
    public boolean equals(Object rhs) {
        if (!(rhs instanceof LogicalRelOpAST)) {
            return false;
        }
        
        LogicalRelOpAST ast = (LogicalRelOpAST) rhs;
        return ast.op == op
                && ast.left.equals(left)
                && ast.right.equals(right);
    }
    
    @Override
    public String toString() {
        return "(" + left + opString() + right + ")";
    }
    
    private String opString() {
        switch (op) {
            case EQ:
                return "==";
            case NEQ:
                return "!=";
            case GT:
                return ">";
            case GTE:
                return ">=";
            case LT:
                return "<";
            case LTE:
                return "<=";
            default:
                throw new RuntimeException("Unhandled op: " + op);
        }
    }
    
    private Operator op;
    private AST left;
    private AST right;
}

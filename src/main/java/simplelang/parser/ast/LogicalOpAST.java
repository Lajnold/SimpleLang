package simplelang.parser.ast;

public class LogicalOpAST extends AST {
    
    public enum Operator {
        AND,
        OR
    }

    public LogicalOpAST(Operator operator, AST left, AST right) {
        super(AST.Type.LOGICAL_OP);
        
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
        if (!(rhs instanceof LogicalOpAST)) {
            return false;
        }
        
        LogicalOpAST ast = (LogicalOpAST) rhs;
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
            case AND:
                return "&&";
            case OR:
                return "||";
            default:
                throw new RuntimeException("Unhandled op: " + op);
        }
    }
    
    private Operator op;
    private AST left;
    private AST right;
}

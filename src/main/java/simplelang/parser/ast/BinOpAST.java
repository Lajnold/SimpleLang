package simplelang.parser.ast;

public class BinOpAST extends AST {
    
    public enum Operation {
        ADD,
        SUB,
        MUL,
        DIV
    }
    
    public BinOpAST(Operation op, AST left, AST right) {
        super(AST.Type.BINARY_OP);
        
        if (op == null) throw new IllegalArgumentException("op is null");
        if (left == null) throw new IllegalArgumentException("left is null");
        if (right == null) throw new IllegalArgumentException("right is null");
        
        this.op = op;
        this.left = left;
        this.right = right;
    }
    
    public Operation getOperation() {
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
        if (!(rhs instanceof BinOpAST)) {
            return false;
        }
        
        BinOpAST binOpRhs = (BinOpAST) rhs;
        return binOpRhs.op == op
                && binOpRhs.left.equals(left)
                && binOpRhs.right.equals(right);
    }
    
    @Override
    public String toString() {
        return "(" + left.toString() + opString() + right.toString() + ")";
    }
    
    private String opString() {
        switch (op) {
            case ADD:
                return "+";
            case SUB:
                return "-";
            case MUL:
                return "*";
            case DIV:
                return "/";
            default:
                throw new RuntimeException("Unhandled op: " + op);
        }
    }
    
    private Operation op;
    private AST left, right;
}

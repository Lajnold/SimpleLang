package simplelang.parser.ast;

public class NumberAST extends AST {
    
    public NumberAST(String numberString) {
        super(AST.Type.NUMBER);
        
        if (numberString == null) throw new IllegalArgumentException("value is null");
        
        this.numberString = numberString;
    }
    
    public String getNumberString() {
        return numberString;
    }
    
    @Override
    public boolean equals(Object rhs) {
        if (!(rhs instanceof NumberAST)) {
            return false;
        }
        
        NumberAST numberAstRhs = (NumberAST) rhs;
        return numberAstRhs.numberString.equals(numberString);
    }
    
    @Override
    public String toString() {
        return numberString.toString();
    }
    
    private String numberString;
}

package calculator.parser.ast;

import java.util.ArrayList;
import java.util.List;

public class FunctionCallAST extends ValueAST {

    public FunctionCallAST(String functionName, List<ValueAST> args) {
        super(AST.Type.FUNCTION_CALL);
        
        this.functionName = functionName;
        this.args = new ArrayList<>(args);
    }

    public String getFunctionName() {
        return functionName;
    }

    public List<ValueAST> getArgs() {
        return new ArrayList<ValueAST>(args);
    }
    
    @Override
    public boolean equals(Object rhs) {
        if (!(rhs instanceof FunctionCallAST)) {
            return false;
        }
        
        FunctionCallAST funCallRhs = (FunctionCallAST) rhs;
        
        if (!funCallRhs.functionName.equals(functionName)) {
            return false;
        }
        
        if (funCallRhs.args.size() != args.size()) {
            return false;
        }
        
        for (int i = 0; i < args.size(); i++) {
            if (!funCallRhs.args.get(i).equals(args.get(i))) {
                return false;
            }
        }
        
        return true;
    }
    
    @Override
    public String toString() {
        StringBuilder argsBuilder = new StringBuilder();
        for (int i = 0; i < args.size(); i++){
            if (i > 0) {
                argsBuilder.append(", ");
            }
            
            argsBuilder.append(args.toString());
        }
        
        return functionName + "(" + argsBuilder.toString() + ")";
    }

    private String functionName;
    private List<ValueAST> args;
}

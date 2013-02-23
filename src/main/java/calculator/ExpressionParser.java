package calculator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import calculator.parser.Parser;
import calculator.parser.SyntaxException;
import calculator.parser.ast.AST;
import calculator.parser.ast.BinOpAST;
import calculator.parser.ast.FunctionCallAST;
import calculator.parser.ast.NumberAST;
import calculator.parser.ast.ValueAST;
import calculator.parser.ast.VariableAssignmentAST;
import calculator.parser.ast.VariableReferenceAST;



public class ExpressionParser {
    
    public ExpressionParser(Parser parser) {
        this.parser = parser;
        
        addBuildinVariables();
    }
    
    public BigNumber parse(String input) {
        BigNumber retVal = null;
        
        try {
            List<AST> astList = parser.parse(input);
            AST astToHandle = astList.get(0);
            
            switch (astToHandle.getType()) {
                case VARIABLE_ASSIGNMENT:
                    handleAssignment((VariableAssignmentAST) astToHandle);
                    break;
                default:
                    retVal = handleExpression((ValueAST) astToHandle);
                    break;
            }
        } catch (SyntaxException e) {
            throw new ExpressionException(e.getMessage(), e);
        }
        
        return retVal;
    }
    
    private void handleAssignment(VariableAssignmentAST ast) {
        String name = ast.getVariableName();
        ValueAST valueAst = ast.getValue();
        BigNumber value = handleExpression(valueAst);
        
        variables.put(name,  value);
    }

    private BigNumber handleExpression(ValueAST ast) {
        BigNumber value = null;
        
        switch (ast.getType()) {
            case BINARY_OP:
                value = handleBinOp((BinOpAST) ast);
                break;
            case NUMBER:
                value = handleNumber((NumberAST) ast);
                break;
            case FUNCTION_CALL:
                value = handleFunctionCall((FunctionCallAST) ast);
                break;
            case VARIABLE_REF:
                value = handleVariableRef((VariableReferenceAST) ast);
                break;
            default:
                throw new IllegalArgumentException("Unhandled AST type: " + ast.getType());
        }
        
        return value;
    }

    private BigNumber handleVariableRef(VariableReferenceAST ast) {
        BigNumber value = variables.get(ast.getVariableName());
        if (value == null) {
            throw new ExpressionException("Unknown variable: " + ast.getVariableName()); 
        }
        
        return value;
    }

    private BigNumber handleFunctionCall(FunctionCallAST ast) {
        BigNumber retVal = null;

        List<ValueAST> args = ast.getArgs();
        
        switch (ast.getFunctionName()) {
            case "sin": {
                BigNumber argValue = handleExpression(args.get(0));
                retVal = new BigNumber(Math.sin(argValue.doubleValue()));
                break;
            }
            case "cos": {
                BigNumber argValue = handleExpression(args.get(0));
                retVal = new BigNumber(Math.cos(argValue.doubleValue()));
                break;
            }
            default:
                throw new ExpressionException("Unknown function: " + ast.getFunctionName());
        }
        
        return retVal;
    }

    private BigNumber handleNumber(NumberAST ast) {
        try {
            BigNumber number = new BigNumber(ast.getNumberString());
            return number;
        } catch (NumberFormatException e) {
            throw new ExpressionException("Invalid number: " + ast.getNumberString(), e);
        }
    }

    private BigNumber handleBinOp(BinOpAST ast) {
        BigNumber value = null;
        
        BigNumber left = handleExpression(ast.getLeftOperand());
        BigNumber right = handleExpression(ast.getRightOperand());
        
        switch (ast.getOperation()) {
            case ADD:
                value = left.add(right);
                break;
            case SUB:
                value = left.subtract(right);
                break;
            case MUL:
                value = left.multiply(right);
                break;
            case DIV:
                value = left.divide(right);
                break;
        }
        
        return value;
    }
    
    private void addBuildinVariables() {
        variables.put("pi", new BigNumber(Math.PI));
        variables.put("e", new BigNumber(Math.E));
    }

    private Parser parser;
    private Map<String, BigNumber> variables = new HashMap<>();
}

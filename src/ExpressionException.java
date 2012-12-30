
public class ExpressionException extends RuntimeException {

    public ExpressionException() {
        
    }
    
    public ExpressionException(String message) {
        super(message);
    }
    
    public ExpressionException(Throwable cause) {
        super(cause);
    }
    
    public ExpressionException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public ExpressionException(String message, Throwable cause,
            boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    private static final long serialVersionUID = 9002095979382312503L;
}

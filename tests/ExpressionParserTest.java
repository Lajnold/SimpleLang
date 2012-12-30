import org.junit.*;
import static org.junit.Assert.*;

public class ExpressionParserTest {
    
    @Test
    public void complex() {
        // (3 * (-2 + 4) / 4 - -5 * 2
        //  = (3 * (2 / 4)) + (5 * 2)
        //  = (3 * 0.5) + 10
        //  = 1.5 + 10
        //  = 11.5
        testExpression("3 * (-2 + 4) / 4 - -5 * 2",  11.5, EXACT_DELTA);
    }
    
    @Test
    public void number() {
        testExpression("55",  55.0, EXACT_DELTA);
    }
    
    @Test
    public void add() {
        testExpression("12 + 5",  17.0, EXACT_DELTA);
    }
    
    @Test
    public void subtract() {
        testExpression("12 - 5",  7.0, EXACT_DELTA);
    }
    
    @Test
    public void multipleAddAndSubtract() {
        testExpression("12 + 5 - 8 - 4 + 5",  10.0, EXACT_DELTA);
    }
    
    @Test
    public void negativeNumbers() {
        testExpression("-12 - -5 + -5 - 5", -17.0, EXACT_DELTA);
    }
    
    @Test
    public void multiply() {
        testExpression("5 * 7",  35.0, EXACT_DELTA);
    }

    @Test
    public void divide() {
        testExpression("5 / 7",  0.71428, 0.00001);
    }
    
    @Test
    public void addAndMultiply() {
        testExpression("5 + 6 * 4 / 2 - 4 * 3", 5.0, EXACT_DELTA);
    }

    @Test
    public void decimalsInInput() {
        testExpression("3.5 * 5.2 + 2 / 4", 18.7, EXACT_DELTA);
    }

    @Test
    public void parentheses() {
        testExpression("(5 * (2 + 3)) / 2", 12.5, EXACT_DELTA);
    }
    
    private void testExpression(String expr, double expected, double delta) {
        double res = ExpressionParser.parseExpression(expr);
        assertEquals(expected, res, delta);
    }
    
    /**
     * A delta that's quite exact, which can be used when checking for
     * exact values (unless the exact value has too many digits).
     */
    private static double EXACT_DELTA = 0.00001;
}

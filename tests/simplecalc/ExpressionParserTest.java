package simplecalc;

import org.junit.*;

import simplecalc.ExpressionParser;
import static org.junit.Assert.*;

public class ExpressionParserTest {
    
    @Test
    public void complex() {
        testExpression("3 * (-2 + 4) / 4 - -5 * 2",  11.5, EXACT_DELTA);
    }
    
    @Test
    public void singleNumber() {
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
    public void addAndMultiplySimple() {
        testExpression("6 * 3 - 2", 16.0, EXACT_DELTA);
    }

    @Test
    public void decimalsInInput() {
        testExpression("3.5 * 5.2 + 2 / 4", 18.7, EXACT_DELTA);
    }

    @Test
    public void parentheses() {
        testExpression("(5 * (2 + 3)) / 2", 12.5, EXACT_DELTA);
    }
    
    @Test
    public void oddNumberOfTermsWithSubtraction()  {
        testExpression("8 - 4 + 3", 7.0, EXACT_DELTA);
    }
    
    @Test
    public void unaryPlus() {
        testExpression("2 + +2", 4.0, EXACT_DELTA);
    }
    
    @Test
    public void unevenSpacing() {
        // (2+2) - (5 * (4 + -2)) = 4 - 10
        testExpression("2+2-  5 *(   4 +-2)", -6.0, EXACT_DELTA);
    }
    
    @Test(expected = ExpressionException.class)
    public void throwsOnExtraPlusOperator() {
        testExpression("2 +++ 3", 0, EXACT_DELTA);
    }

    @Test(expected = ExpressionException.class)
    public void throwsOnExtraMinusOperator() {
        testExpression("2 + --3", 0, EXACT_DELTA);
    }

    @Test(expected = ExpressionException.class)
    public void throwsOnMissingRightParanthesis() {
        testExpression("(2 + 4", 0, EXACT_DELTA);
    }

    @Test(expected = ExpressionException.class)
    public void throwsOnMissingLeftParanthesis() {
        testExpression("2 + 4)", 0, EXACT_DELTA);
    }

    @Test(expected = ExpressionException.class)
    public void throwsOnMissingOperand() {
        testExpression("2 +", 0, EXACT_DELTA);
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

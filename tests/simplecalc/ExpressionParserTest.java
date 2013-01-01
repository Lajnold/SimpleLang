package simplecalc;

import org.junit.*;

import simplecalc.ExpressionParser;
import static org.junit.Assert.*;

public class ExpressionParserTest {
    
    ExpressionParser parser;
    
    @Before
    public void setup() {
        parser = new ExpressionParser();
        parser.printTreeOnParse(false);
    }
    
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

    @Test
    public void negativeParantheses() {
        testExpression("2 + -(2 - 3)", 3.0, EXACT_DELTA);
    }
    
    @Test
    public void functionCallSin() {
        testExpression("sin(50)", -0.262, 0.001);
    }

    @Test
    public void functionCallCos() {
        testExpression("cos(50)", 0.964, 0.001);
    }

    @Test
    public void functionCallWithExpressionArgument() {
        // Same as sin(50)
        testExpression("sin(30 - 10 * 2 + 80 / 2)", -0.262, 0.001);
    }
    
    @Test
    public void functionCallInExpression() {
        testExpression("5 + -sin(50) + sin(20)", 6.175, 0.001);
    }

    @Test
    public void variableRefPi() {
        testExpression("pi", 3.141, 0.001);
    }

    @Test
    public void variableRefE() {
        testExpression("e", 2.718, 0.001);
    }

    @Test
    public void variableRefInBeginningOfExpr() {
        testExpression("e + 2", 4.718, 0.001);
    }

    @Test
    public void piInFunctionCall() {
        testExpression("sin(0.5 * pi)", 1.0, EXACT_DELTA);
    }

    @Test
    public void functionCallInBeginningOfExpr() {
        testExpression("sin(50) + 2", 1.738, 0.001);
    }
    
    @Test
    public void variableAssignment() {
        parser.parse("x = 2 * 3");
        testExpression("1 + x", 7.0, EXACT_DELTA);
    }
    
    
    // Failure tests
    
    @Test(expected = ExpressionException.class)
    public void throwsOnEmptyRHSInAssignment() {
        parser.parse("x =");
    }
    
    @Test(expected = ExpressionException.class)
    public void throwsOnUnknownVariable() {
        parser.parse("1 + u");
    }

    @Test(expected = ExpressionException.class)
    public void throwsOnExtraPlusOperator() {
        parser.parse("2 +++ 3");
    }

    @Test(expected = ExpressionException.class)
    public void throwsOnExtraMinusOperator() {
        parser.parse("2 + --3");
    }

    @Test(expected = ExpressionException.class)
    public void throwsOnMissingRightParanthesis() {
        parser.parse("(2 + 4");
    }

    @Test(expected = ExpressionException.class)
    public void throwsOnMissingLeftParanthesis() {
        parser.parse("2 + 4)");
    }

    @Test(expected = ExpressionException.class)
    public void throwsOnMissingOperand() {
        parser.parse("2 +");
    }
    
    
    // Helpers 
    
    private void testExpression(String expr, double expected, double delta) {
        double res = parser.parse(expr);
        assertEquals(expected, res, delta);
    }
    
    /**
     * A delta that's quite exact, which can be used when checking for
     * exact values (unless the exact value has too many digits).
     */
    private static double EXACT_DELTA = 0.00001;
}

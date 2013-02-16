package calculator;

import org.junit.*;

import calculator.ExpressionException;
import calculator.ExpressionParser;

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
        testExpression("3 * (-2 + 4) / 4 - -5 * 2",  "11.5");
    }
    
    @Test
    public void simpleInteger() {
        testExpression("55",  "55");
    }
    
    @Test
    public void simpleFloatingPoint() {
        testExpression("55.0", "55");
    }
    
    @Test
    public void add() {
        testExpression("12 + 5",  "17");
    }
    
    @Test
    public void subtract() {
        testExpression("12 - 5",  "7");
    }
    
    @Test
    public void multipleAddAndSubtract() {
        testExpression("12 + 5 - 8 - 4 + 5",  "10");
    }
    
    @Test
    public void negativeNumbers() {
        testExpression("-12 - -5 + -5 - 5", "-17");
    }
    
    @Test
    public void multiply() {
        testExpression("5 * 7",  "35");
    }

    @Test
    public void divide() {
        testExpression("5 / 7",  "0.71429", 5);
    }
    
    @Test
    public void addAndMultiply() {
        testExpression("5 + 6 * 4 / 2 - 4 * 3", "5");
    }
    
    @Test
    public void addAndMultiplySimple() {
        testExpression("6 * 3 - 2", "16");
    }

    @Test
    public void decimalsInInput() {
        testExpression("3.5 * 5.2 + 2 / 4", "18.7");
    }

    @Test
    public void parentheses() {
        testExpression("(5 * (2 + 3)) / 2", "12.5");
    }
    
    @Test
    public void oddNumberOfTermsWithSubtraction()  {
        testExpression("8 - 4 + 3", "7");
    }
    
    @Test
    public void unaryPlus() {
        testExpression("2 + +2", "4");
    }
    
    @Test
    public void unevenSpacing() {
        // (2+2) - (5 * (4 + -2)) = 4 - 10
        testExpression("2+2-  5 *(   4 +-2)", "-6");
    }

    @Test
    public void negativeParantheses() {
        testExpression("2 + -(2 - 3)", "3");
    }
    
    @Test
    public void functionCallSin() {
        testExpression("sin(50)", "-0.262", 3);
    }

    @Test
    public void functionCallCos() {
        testExpression("cos(50)", "0.965", 3);
    }

    @Test
    public void functionCallWithExpressionAsArgument() {
        // Same as sin(50)
        testExpression("sin(30 - 10 * 2 + 80 / 2)", "-0.262", 3);
    }
    
    @Test
    public void functionCallInExpression() {
        testExpression("5 + -sin(50) + sin(20)", "6.175", 3);
    }

    @Test
    public void variableRefPi() {
        testExpression("pi", "3.142", 3);
    }

    @Test
    public void variableRefE() {
        testExpression("e", "2.718", 3);
    }

    @Test
    public void variableRefInBeginningOfExpr() {
        testExpression("e + 2", "4.718", 3);
    }

    @Test
    public void piInFunctionCall() {
        testExpression("sin(0.5 * pi)", "1");
    }

    @Test
    public void functionCallInBeginningOfExpr() {
        testExpression("sin(50) + 2", "1.738", 3);
    }
    
    @Test
    public void variableAssignment() {
        parser.parse("x = 2 * 3");
        testExpression("1 + x", "7");
    }
    
    @Test
    public void hexadecimalNumberWithPositiveExp() {
        // 10.5 + 746
        testExpression("0x1.5p3 + 0x2ea", "756.5");
        testExpression("0x1.5p+3 + 0x2ea", "756.5");
    }

    @Test
    public void hexadecimalNumberWithNegativeExp() {
        // 0.328125 + 746
        testExpression("0x1.5p-2 + 0x2ea", "746.328", 3);
    }

    @Test
    public void octalNumbers() {
        // 7 - 72
        testExpression("07 - 0110", "-65");
    }

    @Test
    public void scientificNotation() {
        // 1500 + 0.03 + 112
        testExpression("1.5e3 + 3e-2 + 11.2e+1", "1612.03", 2);
    }
    
    
    // Failure tests
    
    @Test(expected = ExpressionException.class)
    public void throwsOnInvalidSpacingInHexNumber() {
        parser.parse("0x 1");
    }
    
    @Test(expected = ExpressionException.class)
    public void throwsOnBogusCharacter() {
        parser.parse(":");
    }
    
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

    @Test(expected = ExpressionException.class)
    public void throwsOnMissingOperator() {
        parser.parse("2 2");
    }
    
    
    // Helpers 
    
    private void testExpression(String expr, String expected) {
        BigNumber res = parser.parse(expr);
        BigNumber expected_ = new BigNumber(expected);
        assertEquals(expected_, res);
    }
    
    private void testExpression(String expr, String expected, int decimals) {
        BigNumber res = parser.parse(expr).truncate(decimals);
        BigNumber expected_ = new BigNumber(expected);
        assertEquals(expected_, res);
    }
}

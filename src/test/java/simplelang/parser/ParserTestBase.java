package simplelang.parser;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import simplelang.parser.Parser;
import simplelang.parser.SyntaxException;
import simplelang.parser.ast.AST;
import simplelang.parser.ast.BinOpAST;
import simplelang.parser.ast.BooleanAST;
import simplelang.parser.ast.LogicalOpAST;
import simplelang.parser.ast.FunctionCallAST;
import simplelang.parser.ast.LogicalNotAST;
import simplelang.parser.ast.NumberAST;
import simplelang.parser.ast.LogicalRelOpAST;
import simplelang.parser.ast.VariableAssignmentAST;
import simplelang.parser.ast.VariableReferenceAST;


/**
 * Base class for parser tests. This class defined a set of tests that apply
 * to all parsers.
 * 
 * An implementing class need only define a {@link Before} method that
 * instantiates the <code>parserToTest</code> field.
 */
public abstract class ParserTestBase {

    /** The parser to test, which is set by the implementing test class. */
    protected Parser parserToTest;
    
    
    // Expression tests

    @Test
    public void number() throws SyntaxException {
        String input = "10";
        
        AST expected = new NumberAST("10");
        
        test(input, expected);
    }
    
    @Test
    public void negativeNumber() throws SyntaxException {
        String input = "-10";
        
        AST expected = new NumberAST("-10");
        
        test(input, expected);
    }
    
    @Test
    public void negatedExpression() throws SyntaxException {
        String input = "-(1 + 2)";
        
        AST mulNum1 = new NumberAST("-1");
        
        AST addNum1 = new NumberAST("1");
        AST addNum2 = new NumberAST("2");
        AST mulNum2 = new BinOpAST(BinOpAST.Operator.ADD, addNum1, addNum2);
        
        AST expected = new BinOpAST(BinOpAST.Operator.MUL, mulNum1, mulNum2);
        
        test(input, expected);
    }
    
    @Test
    public void binOp() throws SyntaxException {
        // +
        //   10
        //   20
        String input = "10 + 20";
        
        NumberAST expectedLeft = new NumberAST("10");
        NumberAST expectedRight = new NumberAST("20");
        AST expected = new BinOpAST(
                BinOpAST.Operator.ADD, expectedLeft, expectedRight);
        
        test(input, expected);
    }
    
    @Test
    public void complexExpression() throws SyntaxException {
        // +
        //   1
        //   +
        //     10
        //     -
        //       *
        //         /
        //           20
        //           2
        //         3
        //       *
        //         4
        //         2
        String input = "10 + 20 / 2 * 3 - 4 * 2 + 1";
        
        // 20 / 2
        NumberAST div1Num1 = new NumberAST("20");
        NumberAST div1Num2 = new NumberAST("2");
        BinOpAST div1 = new BinOpAST(BinOpAST.Operator.DIV, div1Num1, div1Num2);
        
        // (20 / 2) * 3
        NumberAST mul1Num2 = new NumberAST("3");
        BinOpAST mul1 = new BinOpAST(BinOpAST.Operator.MUL, div1, mul1Num2);
        
        // 4 * 2
        NumberAST mul2Num1 = new NumberAST("4");
        NumberAST mul2Num2 = new NumberAST("2");
        BinOpAST mul2 = new BinOpAST(BinOpAST.Operator.MUL, mul2Num1, mul2Num2);
        
        // (20 / 2 * 3) - (4 * 2)
        BinOpAST sub1 = new BinOpAST(BinOpAST.Operator.SUB, mul1, mul2);
        
        // 10 + ((20 / 2 * 3) - (4 * 2))
        NumberAST add1Num1 = new NumberAST("10");
        BinOpAST add1 = new BinOpAST(BinOpAST.Operator.ADD, add1Num1, sub1);
        
        // (10 + ((20 / 2 * 3) - (4 * 2))) + 1
        NumberAST add2Num2 = new NumberAST("1");
        AST expected = new BinOpAST(BinOpAST.Operator.ADD, add1, add2Num2);
        
        test(input, expected);
    }
    
    @Test
    public void paranthesesInExpression() throws SyntaxException {
        // *
        //   +
        //     1
        //     3
        //   4
        String input = "(1 + 3) * 4";
        
        NumberAST add1Num1 = new NumberAST("1");
        NumberAST add1Num2 = new NumberAST("3");
        BinOpAST add1 = new BinOpAST(BinOpAST.Operator.ADD, add1Num1, add1Num2);
        
        NumberAST mul1Num2 = new NumberAST("4");
        AST expected = new BinOpAST(BinOpAST.Operator.MUL, add1, mul1Num2);
        
        test(input, expected);
    }
    
    @Test
    public void variableReference() throws SyntaxException {
        String input = "x";
        
        AST expected = new VariableReferenceAST("x");
        
        test(input, expected);
    }
    
    @Test
    public void variableReferenceInExpression() throws SyntaxException {
        // +
        //   1
        //   *
        //     2
        //     x
        String input = "1 + 2 * x";
        
        // 2 * x
        NumberAST mul1Num1 = new NumberAST("2");
        VariableReferenceAST mul1Num2 = new VariableReferenceAST("x");
        BinOpAST mul1 = new BinOpAST(BinOpAST.Operator.MUL, mul1Num1, mul1Num2);
        
        // 1 + (2 * x)
        NumberAST add1Num1 = new NumberAST("1");
        AST expected = new BinOpAST(BinOpAST.Operator.ADD, add1Num1, mul1);
        
        test(input, expected);
    }
    
    @Test
    public void functionCallWithNoParameter() throws SyntaxException {
        String input = "fun()";
        
        List<AST> args = new ArrayList<>();
        AST expected = new FunctionCallAST("fun", args);
        
        test(input, expected);
    }
    
    @Test
    public void functionCallWithOneParameter() throws SyntaxException {
        String input = "fun(10)";
        List<AST> args = new ArrayList<>();
        
        AST arg1 = new NumberAST("10");
        args.add(arg1);
        
        AST expected = new FunctionCallAST("fun", args);
        
        test(input, expected);
    }
    
    @Test
    public void functionCallWithTwoParameters() throws SyntaxException {
        String input = "fun(10 + 2, var)";
        List<AST> args = new ArrayList<>();
        
        // 10 + 2
        AST arg1Part1 = new NumberAST("10");
        AST arg1Part2 = new NumberAST("2");
        AST arg1 = new BinOpAST(BinOpAST.Operator.ADD, arg1Part1, arg1Part2);
        args.add(arg1);
        
        AST arg2 = new VariableReferenceAST("var");
        args.add(arg2);
        
        AST expected = new FunctionCallAST("fun", args);
        
        test(input, expected);
    }
    
    @Test
    public void functionCallInExpression() throws SyntaxException {
        String input = "fun() + 3";
        
        // fun()
        List<AST> add1Num1Args = new ArrayList<>();
        AST add1Num1 = new FunctionCallAST("fun", add1Num1Args);
        
        // 3
        AST add1Num2 = new NumberAST("3");
        
        // fun() + 3
        AST expected = new BinOpAST(BinOpAST.Operator.ADD, add1Num1, add1Num2);
        
        test(input, expected);
    }
    
    @Test(expected = SyntaxException.class)
    public void throwsOnInvalidSpacingInHexNumber() throws SyntaxException {
        parserToTest.parse("0x 1");
    }
    
    @Test(expected = SyntaxException.class)
    public void throwsOnBogusCharacter() throws SyntaxException {
        parserToTest.parse("¤");
    }

    @Test(expected = SyntaxException.class)
    public void throwsOnExtraPlusOperator() throws SyntaxException {
        parserToTest.parse("2 +++ 3");
    }

    @Test(expected = SyntaxException.class)
    public void throwsOnExtraMinusOperator() throws SyntaxException {
        parserToTest.parse("2 + --3");
    }

    @Test(expected = SyntaxException.class)
    public void throwsOnMissingRightParanthesis() throws SyntaxException {
        parserToTest.parse("(2 + 4");
    }

    @Test(expected = SyntaxException.class)
    public void throwsOnMissingLeftParanthesis() throws SyntaxException {
        parserToTest.parse("2 + 4)");
    }

    @Test(expected = SyntaxException.class)
    public void throwsOnMissingOperand() throws SyntaxException {
        parserToTest.parse("2 +");
    }

    @Test(expected = SyntaxException.class)
    public void throwsOnMissingOperator() throws SyntaxException {
        parserToTest.parse("2 2");
    }
    
    
    
    // Statement tests
    
    @Test
    public void variableAssignment() throws SyntaxException {
        String input = "x = 10";
        
        AST rhsAst = new NumberAST("10");
        AST expected = new VariableAssignmentAST("x", rhsAst);
        
        test(input, expected);
    }
        
    @Test(expected = SyntaxException.class)
    public void throwsOnEmptyRHSInAssignment() throws SyntaxException {
        parserToTest.parse("x =");
    }
    
    
    
    // Logical operations
    
    @Test
    public void logicalTrue() throws SyntaxException {
        String input = "true";
        AST expected = new BooleanAST(true);
        test(input, expected);
    }

    @Test
    public void logicalFalse() throws SyntaxException {
        String input = "false";
        AST expected = new BooleanAST(false);
        test(input, expected);
    }
    
    @Test
    public void logicalEquals() throws SyntaxException {
        String input = "10 == 5";
        
        AST left = new NumberAST("10");
        AST right = new NumberAST("5");
        AST expected = new LogicalRelOpAST(LogicalRelOpAST.Operator.EQ, left, right);
        
        test(input, expected);
    }
    
    @Test
    public void logicalNotEquals() throws SyntaxException {
        String input = "10 != 5";
        
        AST left = new NumberAST("10");
        AST right = new NumberAST("5");
        AST expected = new LogicalRelOpAST(LogicalRelOpAST.Operator.NEQ, left, right);
        
        test(input, expected);
    }
    
    @Test
    public void logicalLessThan() throws SyntaxException {
        String input = "10 < 5";
        
        AST left = new NumberAST("10");
        AST right = new NumberAST("5");
        AST expected = new LogicalRelOpAST(LogicalRelOpAST.Operator.LT, left, right);
        
        test(input, expected);
    }
    
    @Test
    public void logicalLessThanOrEqual() throws SyntaxException {
        String input = "10 <= 5";
        
        AST left = new NumberAST("10");
        AST right = new NumberAST("5");
        AST expected = new LogicalRelOpAST(LogicalRelOpAST.Operator.LTE, left, right);
        
        test(input, expected);
    }
    
    @Test
    public void logicalGreaterThan() throws SyntaxException {
        String input = "10 > 5";
        
        AST left = new NumberAST("10");
        AST right = new NumberAST("5");
        AST expected = new LogicalRelOpAST(LogicalRelOpAST.Operator.GT, left, right);
        
        test(input, expected);
    }
    
    @Test
    public void logicalGreaterThanOrEqual() throws SyntaxException {
        String input = "10 >= 5";
        
        AST left = new NumberAST("10");
        AST right = new NumberAST("5");
        AST expected = new LogicalRelOpAST(LogicalRelOpAST.Operator.GTE, left, right);
        
        test(input, expected);
    }
    
    @Test
    public void logicalAnd() throws SyntaxException {
        String input = "10 > 5 && 20 < 30";
        
        AST left1 = new NumberAST("10");
        AST right1 = new NumberAST("5");
        AST rel1 = new LogicalRelOpAST(LogicalRelOpAST.Operator.GT, left1, right1);
        
        AST left2 = new NumberAST("20");
        AST right2 = new NumberAST("30");
        AST rel2 = new LogicalRelOpAST(LogicalRelOpAST.Operator.LT, left2, right2);
        
        AST expected = new LogicalOpAST(LogicalOpAST.Operator.AND, rel1, rel2);
        
        test(input, expected);
    }
    
    @Test
    public void logicalOr() throws SyntaxException {
        String input = "10 > 5 || 20 < 30";
        
        AST left1 = new NumberAST("10");
        AST right1 = new NumberAST("5");
        AST rel1 = new LogicalRelOpAST(LogicalRelOpAST.Operator.GT, left1, right1);
        
        AST left2 = new NumberAST("20");
        AST right2 = new NumberAST("30");
        AST rel2 = new LogicalRelOpAST(LogicalRelOpAST.Operator.LT, left2, right2);
        
        AST expected = new LogicalOpAST(LogicalOpAST.Operator.OR, rel1, rel2);
        
        test(input, expected);
    }
    
    @Test
    public void logicalOrWithBoolean() throws SyntaxException {
        String input = "false || true";
        
        AST lhs = new BooleanAST(false);
        AST rhs = new BooleanAST(true);
        AST expected = new LogicalOpAST(LogicalOpAST.Operator.OR, lhs, rhs);
        
        test(input, expected);
    }
    
    @Test
    public void logicalNot() throws SyntaxException {
        String input = "!(10 > 5)";
        
        AST left = new NumberAST("10");
        AST right = new NumberAST("5");
        AST rel = new LogicalRelOpAST(LogicalRelOpAST.Operator.GT, left, right);
        
        AST expected = new LogicalNotAST(rel);
        
        test(input, expected);
    }
    
    @Test
    public void logicalFunctionCall() throws SyntaxException {
        String input = "isDouble(x, y) || x < 10";
        
        List<AST> leftArgs = new ArrayList<>();
        leftArgs.add(new VariableReferenceAST("x"));
        leftArgs.add(new VariableReferenceAST("y"));
        AST left = new FunctionCallAST("isDouble", leftArgs);
        
        AST rightOp1 = new VariableReferenceAST("x");
        AST rightOp2 = new NumberAST("10");
        AST right = new LogicalRelOpAST(LogicalRelOpAST.Operator.LT, rightOp1, rightOp2);
        
        AST expected = new LogicalOpAST(LogicalOpAST.Operator.OR, left, right);
        
        test(input, expected);
    }
    
    @Test
    public void logicalComplexExpression() throws SyntaxException {
        // ||
        //   ||
        //     >
        //       *
        //         y
        //         2
        //       -
        //         5
        //         z
        //     !
        //       isDouble(x, y)
        //    &&
        //      <
        //        y
        //        x
        //      ||
        //        !
        //          <
        //            10
        //            y
        //        <
        //          20
        //          x
        String input = "y * 2 > 5 - z || !isDouble(x, y) || y < x && (!(10 < y) || 20 < x)";
        
        // y * 2
        AST rel1_1_1 = new VariableReferenceAST("y");
        AST rel1_1_2 = new NumberAST("2");
        AST rel1_1 = new BinOpAST(BinOpAST.Operator.MUL, rel1_1_1, rel1_1_2);
        
        // 5 - z
        AST rel1_2_1 = new NumberAST("5");
        AST rel1_2_2 = new VariableReferenceAST("z");
        AST rel1_2 = new BinOpAST(BinOpAST.Operator.SUB, rel1_2_1, rel1_2_2);

        // (y * 2) > (5 - z)
        AST rel1 = new LogicalRelOpAST(LogicalRelOpAST.Operator.GT, rel1_1, rel1_2);
        
        // !isDouble(x, y)
        List<AST> fun1_args = new ArrayList<>();
        fun1_args.add(new VariableReferenceAST("x"));
        fun1_args.add(new VariableReferenceAST("y"));
        AST fun1 = new FunctionCallAST("isDouble", fun1_args);
        AST not1 = new LogicalNotAST(fun1);
        
        // (y > 5) || !isDouble(x, y)
        AST logical1 = new LogicalOpAST(LogicalOpAST.Operator.OR, rel1, not1);
        
        // 10 < y
        AST rel2_1 = new NumberAST("10");
        AST rel2_2 = new VariableReferenceAST("y");
        AST rel2 = new LogicalRelOpAST(LogicalRelOpAST.Operator.LT, rel2_1, rel2_2);
        
        // !(10 < y)
        AST not2 = new LogicalNotAST(rel2);
        
        // 20 < x
        AST rel3_1 = new NumberAST("20");
        AST rel3_2 = new VariableReferenceAST("x");
        AST rel3 = new LogicalRelOpAST(LogicalRelOpAST.Operator.LT, rel3_1, rel3_2);
        
        // !(10 < y) || (20 < x)
        AST logical2 = new LogicalOpAST(LogicalOpAST.Operator.OR, not2, rel3);
        
        // y < x
        AST rel4_1 = new VariableReferenceAST("y");
        AST rel4_2 = new VariableReferenceAST("x");
        AST rel4 = new LogicalRelOpAST(LogicalRelOpAST.Operator.LT, rel4_1, rel4_2);
        
        // (y < x) && (!(10 < y) || (20 < x))
        AST logical3 = new LogicalOpAST(LogicalOpAST.Operator.AND, rel4, logical2);
        
        // ((y > 5) || !isDouble(x, y)) || ((y < x) && (!(10 < y) || (20 < x)))
        AST expected = new LogicalOpAST(LogicalOpAST.Operator.OR, logical1, logical3);
        
        test(input, expected);
    }
    
    
    
    // Helper functions
    
    private void test(String input, AST expected) throws SyntaxException {
        List<AST> res = parserToTest.parse(input);
        
        assertNotNull(res);
        assertEquals(1, res.size());
        assertEquals(expected, res.get(0));
    }
}

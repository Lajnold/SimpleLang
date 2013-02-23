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
import simplelang.parser.ast.FunctionCallAST;
import simplelang.parser.ast.NumberAST;
import simplelang.parser.ast.ValueAST;
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
        
        ValueAST mulNum1 = new NumberAST("-1");
        
        ValueAST addNum1 = new NumberAST("1");
        ValueAST addNum2 = new NumberAST("2");
        ValueAST mulNum2 = new BinOpAST(BinOpAST.Operation.ADD, addNum1, addNum2);
        
        AST expected = new BinOpAST(BinOpAST.Operation.MUL, mulNum1, mulNum2);
        
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
                BinOpAST.Operation.ADD, expectedLeft, expectedRight);
        
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
        BinOpAST div1 = new BinOpAST(BinOpAST.Operation.DIV, div1Num1, div1Num2);
        
        // (20 / 2) * 3
        NumberAST mul1Num2 = new NumberAST("3");
        BinOpAST mul1 = new BinOpAST(BinOpAST.Operation.MUL, div1, mul1Num2);
        
        // 4 * 2
        NumberAST mul2Num1 = new NumberAST("4");
        NumberAST mul2Num2 = new NumberAST("2");
        BinOpAST mul2 = new BinOpAST(BinOpAST.Operation.MUL, mul2Num1, mul2Num2);
        
        // (20 / 2 * 3) - (4 * 2)
        BinOpAST sub1 = new BinOpAST(BinOpAST.Operation.SUB, mul1, mul2);
        
        // 10 + ((20 / 2 * 3) - (4 * 2))
        NumberAST add1Num1 = new NumberAST("10");
        BinOpAST add1 = new BinOpAST(BinOpAST.Operation.ADD, add1Num1, sub1);
        
        // (10 + ((20 / 2 * 3) - (4 * 2))) + 1
        NumberAST add2Num2 = new NumberAST("1");
        AST expected = new BinOpAST(BinOpAST.Operation.ADD, add1, add2Num2);
        
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
        BinOpAST add1 = new BinOpAST(BinOpAST.Operation.ADD, add1Num1, add1Num2);
        
        NumberAST mul1Num2 = new NumberAST("4");
        AST expected = new BinOpAST(BinOpAST.Operation.MUL, add1, mul1Num2);
        
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
        BinOpAST mul1 = new BinOpAST(BinOpAST.Operation.MUL, mul1Num1, mul1Num2);
        
        // 1 + (2 * x)
        NumberAST add1Num1 = new NumberAST("1");
        AST expected = new BinOpAST(BinOpAST.Operation.ADD, add1Num1, mul1);
        
        test(input, expected);
    }
    
    @Test
    public void functionCallWithNoParameter() throws SyntaxException {
        String input = "fun()";
        
        List<ValueAST> args = new ArrayList<>();
        AST expected = new FunctionCallAST("fun", args);
        
        test(input, expected);
    }
    
    @Test
    public void functionCallWithOneParameter() throws SyntaxException {
        String input = "fun(10)";
        List<ValueAST> args = new ArrayList<>();
        
        ValueAST arg1 = new NumberAST("10");
        args.add(arg1);
        
        AST expected = new FunctionCallAST("fun", args);
        
        test(input, expected);
    }
    
    @Test
    public void functionCallWithTwoParameters() throws SyntaxException {
        String input = "fun(10 + 2, var)";
        List<ValueAST> args = new ArrayList<>();
        
        // 10 + 2
        ValueAST arg1Part1 = new NumberAST("10");
        ValueAST arg1Part2 = new NumberAST("2");
        ValueAST arg1 = new BinOpAST(BinOpAST.Operation.ADD, arg1Part1, arg1Part2);
        args.add(arg1);
        
        ValueAST arg2 = new VariableReferenceAST("var");
        args.add(arg2);
        
        AST expected = new FunctionCallAST("fun", args);
        
        test(input, expected);
    }
    
    @Test
    public void functionCallInExpression() throws SyntaxException {
        String input = "fun() + 3";
        
        // fun()
        List<ValueAST> add1Num1Args = new ArrayList<>();
        ValueAST add1Num1 = new FunctionCallAST("fun", add1Num1Args);
        
        // 3
        ValueAST add1Num2 = new NumberAST("3");
        
        // fun() + 3
        AST expected = new BinOpAST(BinOpAST.Operation.ADD, add1Num1, add1Num2);
        
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
        
        ValueAST rhsAst = new NumberAST("10");
        AST expected = new VariableAssignmentAST("x", rhsAst);
        
        test(input, expected);
    }
        
    @Test(expected = SyntaxException.class)
    public void throwsOnEmptyRHSInAssignment() throws SyntaxException {
        parserToTest.parse("x =");
    }
    
    
    
    // Helper functions
    
    private void test(String input, AST expected) throws SyntaxException {
        List<AST> res = parserToTest.parse(input);
        
        assertNotNull(res);
        assertEquals(1, res.size());
        assertEquals(expected, res.get(0));
    }
}

grammar SimpleCalc;

/*options {
}*/

tokens {
    PLUS = '+';
    MINUS = '-';
    TIMES = '*';
    DIVIDED_BY = '/';
    POINT = '.';
    LPAREN = '(';
    RPAREN = ')';
}

/*@lexer::namespace { SimpleCalc }
@parser::namespace { SimpleCalc }*/

/*@header {
    using System;
}*/

@rulecatch {
    catch (Exception e)
    {
        throw e;
    }
}

@members {
    protected Object recoverFromMismatchedToken(IntStream input,
                                                int ttype,
                                                BitSet follow)
            throws RecognitionException
    {  
        throw new MismatchedTokenException(ttype, input);
    } 
}

public parse returns [double value]
  : a=addSubExpr EOF { $value = $a.value; }
  ;

addSubExpr returns [double value]
  : a=mulDivExpr { $value = $a.value; }
    ( PLUS b=mulDivExpr { $value += $b.value; }
    | MINUS b=mulDivExpr { $value -= $b.value; }
    )*
  ;
  
mulDivExpr returns [double value]
  : a=atom { $value = $a.value; }
    ( TIMES b=atom { $value *= $b.value; }
    | DIVIDED_BY b=atom { $value /= $b.value; }
    )*
  ;
  
atom returns [double value]
  : n=NUMBER { $value = Double.parseDouble($n.getText()); }
  | LPAREN a=addSubExpr RPAREN { $value = $a.value; }
  ;

NUMBER
  : MINUS? (DIGIT)+ (POINT (DIGIT)+)?
  ;
  
fragment DIGIT
  : '0'..'9'
  ;
  
/* Ignore whitespace characters. */
SPACE
  : (' ' | '\t')+ { skip(); }
  ;
  
/* Catch other characters as invalid. */
INVALID
  : .;
grammar SimpleCalc;

options {
  output = AST;
}

tokens {
  PLUS = '+';
  MINUS = '-';
  TIMES = '*';
  DIVIDED_BY = '/';
  POINT = '.';
  LPAREN = '(';
  RPAREN = ')';
  X;
}

@lexer::header {
  package simplecalc.generated;
}
@parser::header {
  package simplecalc.generated;
}

@rulecatch {
  catch (Exception e) {
    throw e;
  }
}

@members {
 protected Object recoverFromMismatchedToken(IntStream input,
                                             int ttype,
                                             BitSet follow)
        throws RecognitionException {
    throw new MismatchedTokenException(ttype, input);
  }
}

public parse
  : addSubExpr^ EOF!
  ;

addSubExpr
  : a=mulDivExpr^ ((PLUS | MINUS) mulDivExpr)*
  ;
  
mulDivExpr
  : unary^ ((TIMES | DIVIDED_BY) unary)*
  ;
  
unary
  : PLUS? atom  ->  atom
  | MINUS atom  ->  ^(NUMBER["-1"] TIMES atom)
  ;
  
atom
  : NUMBER                    ->  NUMBER
  | LPAREN addSubExpr RPAREN  ->  addSubExpr
  ;

NUMBER
  : (DIGIT)+ (POINT (DIGIT)+)?
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
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
  ASSIGN = '=';
  
  /* Special node types */
  T_ARG;
  T_CALL;
  T_VAR;
  T_ASSIGN;
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


/* Parser rulse */

public parse
  : expression^ EOF!
  | assignment^ EOF!
  ;

expression
  : a=mulDivExpression^ ((PLUS | MINUS) mulDivExpression)*
  ;
  
mulDivExpression
  : unary^ ((TIMES | DIVIDED_BY) unary)*
  ;
  
assignment
  : ID ASSIGN expression  ->  ^(T_ASSIGN ID expression)
  ;
  
unary
  : PLUS? atom  ->  atom
  | MINUS atom  ->  ^(NUMBER["-1"] TIMES atom)
  ;
  
atom
  : NUMBER                       ->  NUMBER
  | ID                           ->  ^(T_VAR ID)
  | LPAREN expression RPAREN     ->  expression
  | ID LPAREN expression RPAREN  ->  ^(T_CALL ID T_ARG expression)
  ;
  
  
/* Lexer rules */
  
ID
  : (ALPHA | '_') (ALPHA | DIGIT | '_')*
  ;

NUMBER
  : (DIGIT)+ (POINT (DIGIT)+)?
  ;
  
fragment DIGIT
  : '0'..'9'
  ;
  
fragment ALPHA
  : 'a'..'z' | 'A'..'Z'
  ;
  
/* Ignore whitespace characters. */
WHITESPACE
  : (' ' | '\t')+  { skip(); }
  ;
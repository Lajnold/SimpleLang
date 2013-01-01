grammar Calculator;

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
  package calculator.generated;
}
@parser::header {
  package calculator.generated;
}

@rulecatch {
  catch (Exception e) {
    throw e;
  }
}

@parser::members {
  @Override
  protected Object recoverFromMismatchedToken(IntStream input,
                                              int ttype,
                                              BitSet follow)
          throws RecognitionException {
      // Don't recover; throw an exception instead.
      throw new MismatchedTokenException(ttype, input);
  }
}

@lexer::members {
  @Override
  public void displayRecognitionError(String[] tokenNames,
                                      RecognitionException e) {
          // Don't display any error messages; the situation is taken care of by
          // throwing exceptions.
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
  : ('1'..'9') DIGIT*                            /* Integer */
  | DIGIT+ POINT DIGIT+                          /* Decimal floating-point number */
  | '0' ('0'..'7')+                              /* Octal integer */
  | '0x1.' HEXDIGIT+ 'p' (PLUS | MINUS)? DIGIT+  /* Hexadecimal floating-point number */
  | '0x' HEXDIGIT+                               /* Hexadecimal integer */
  | DIGIT+ (POINT DIGIT+)? 'e' (PLUS | MINUS)? DIGIT+  /* Scientific notation */
  ;
  
fragment DIGIT
  : '0'..'9'
  ;
  
fragment HEXDIGIT
  : '0'..'9' | 'a'..'f'
  ;
  
fragment ALPHA
  : 'a'..'z' | 'A'..'Z'
  ;
  
/* Ignore whitespace characters. */
WHITESPACE
  : (' ' | '\t')+  { skip(); }
  ;
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
  COMMA = ',';
  
  /* Logical and relational tokens */
  AND = '&&';
  OR = '||';
  NOT = '!';
  EQ = '==';
  NEQ = '!=';
  LT = '<';
  LTE = '<=';
  GT = '>';
  GTE = '>=';
  TRUE = 'true';
  FALSE = 'false';
  
  /* Special node types */
  T_EXPR;
  T_ARG;
  T_CALL;
  T_VAR;
  T_ASSIGN;
  T_NOT;
}

@lexer::header {
  package simplelang.generated;
}
@parser::header {
  package simplelang.generated;
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
  : expressionImpl  ->  ^(T_EXPR expressionImpl)
  ;
  
expressionImpl
  : operand ((arithmeticOp | relationalOp | logicalOp) operand)*
  ;
  
arithmeticOp
  : PLUS | MINUS | TIMES | DIVIDED_BY
  ;
  
relationalOp
  : EQ | NEQ | LT | LTE | GT | GTE
  ;
  
logicalOp
  : AND | OR
  ;
    
operand
  : PLUS? NUMBER  ->  NUMBER
  | MINUS NUMBER  ->  ^(NUMBER["-1"] TIMES NUMBER)
  | PLUS? unary   ->  unary
  | MINUS unary   ->  ^(T_EXPR NUMBER["-1"] TIMES unary)
  | TRUE          ->  TRUE
  | NOT TRUE      ->  ^(T_NOT TRUE)
  | FALSE         ->  FALSE
  | NOT FALSE     ->  ^(T_NOT FALSE)
  | NOT unary     ->  ^(T_NOT unary)
  ;
    
unary
  : varRef | parenExpression | call
  ;
  
varRef
  : ID  ->  ^(T_VAR ID)
  ;
  
parenExpression
  : LPAREN expression RPAREN  ->  expression
  ;
  
call
  : ID LPAREN (callArgument (COMMA callArgument)*)? RPAREN  ->  ^(T_CALL ID callArgument*)
  ;
  
callArgument
  : expression  ->  ^(T_ARG expression)
  ;

  
assignment
  : ID ASSIGN expression  ->  ^(T_ASSIGN ID expression)
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
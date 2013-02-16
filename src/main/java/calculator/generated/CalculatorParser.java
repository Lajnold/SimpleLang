// $ANTLR 3.4 /home/lajnold/workspace/SimpleCalc/src/main/antlr/Calculator.g 2013-02-16 19:15:49

  package calculator.generated;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class CalculatorParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALPHA", "ASSIGN", "DIGIT", "DIVIDED_BY", "HEXDIGIT", "ID", "LPAREN", "MINUS", "NUMBER", "PLUS", "POINT", "RPAREN", "TIMES", "T_ARG", "T_ASSIGN", "T_CALL", "T_VAR", "WHITESPACE"
    };

    public static final int EOF=-1;
    public static final int ALPHA=4;
    public static final int ASSIGN=5;
    public static final int DIGIT=6;
    public static final int DIVIDED_BY=7;
    public static final int HEXDIGIT=8;
    public static final int ID=9;
    public static final int LPAREN=10;
    public static final int MINUS=11;
    public static final int NUMBER=12;
    public static final int PLUS=13;
    public static final int POINT=14;
    public static final int RPAREN=15;
    public static final int TIMES=16;
    public static final int T_ARG=17;
    public static final int T_ASSIGN=18;
    public static final int T_CALL=19;
    public static final int T_VAR=20;
    public static final int WHITESPACE=21;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public CalculatorParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public CalculatorParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return CalculatorParser.tokenNames; }
    public String getGrammarFileName() { return "/home/lajnold/workspace/SimpleCalc/src/main/antlr/Calculator.g"; }


      @Override
      protected Object recoverFromMismatchedToken(IntStream input,
                                                  int ttype,
                                                  BitSet follow)
              throws RecognitionException {
          // Don't recover; throw an exception instead.
          throw new MismatchedTokenException(ttype, input);
      }


    public static class parse_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parse"
    // /home/lajnold/workspace/SimpleCalc/src/main/antlr/Calculator.g:60:8: public parse : ( expression ^ EOF !| assignment ^ EOF !);
    public final CalculatorParser.parse_return parse() throws RecognitionException {
        CalculatorParser.parse_return retval = new CalculatorParser.parse_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EOF2=null;
        Token EOF4=null;
        CalculatorParser.expression_return expression1 =null;

        CalculatorParser.assignment_return assignment3 =null;


        Object EOF2_tree=null;
        Object EOF4_tree=null;

        try {
            // /home/lajnold/workspace/SimpleCalc/src/main/antlr/Calculator.g:61:3: ( expression ^ EOF !| assignment ^ EOF !)
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0 >= LPAREN && LA1_0 <= PLUS)) ) {
                alt1=1;
            }
            else if ( (LA1_0==ID) ) {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==EOF||LA1_2==DIVIDED_BY||(LA1_2 >= LPAREN && LA1_2 <= MINUS)||LA1_2==PLUS||LA1_2==TIMES) ) {
                    alt1=1;
                }
                else if ( (LA1_2==ASSIGN) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // /home/lajnold/workspace/SimpleCalc/src/main/antlr/Calculator.g:61:5: expression ^ EOF !
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expression_in_parse177);
                    expression1=expression();

                    state._fsp--;

                    root_0 = (Object)adaptor.becomeRoot(expression1.getTree(), root_0);

                    EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_parse180); 

                    }
                    break;
                case 2 :
                    // /home/lajnold/workspace/SimpleCalc/src/main/antlr/Calculator.g:62:5: assignment ^ EOF !
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assignment_in_parse187);
                    assignment3=assignment();

                    state._fsp--;

                    root_0 = (Object)adaptor.becomeRoot(assignment3.getTree(), root_0);

                    EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_parse190); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

          catch (Exception e) {
            throw e;
          }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "parse"


    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // /home/lajnold/workspace/SimpleCalc/src/main/antlr/Calculator.g:65:1: expression : a= mulDivExpression ^ ( ( PLUS | MINUS ) mulDivExpression )* ;
    public final CalculatorParser.expression_return expression() throws RecognitionException {
        CalculatorParser.expression_return retval = new CalculatorParser.expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set5=null;
        CalculatorParser.mulDivExpression_return a =null;

        CalculatorParser.mulDivExpression_return mulDivExpression6 =null;


        Object set5_tree=null;

        try {
            // /home/lajnold/workspace/SimpleCalc/src/main/antlr/Calculator.g:66:3: (a= mulDivExpression ^ ( ( PLUS | MINUS ) mulDivExpression )* )
            // /home/lajnold/workspace/SimpleCalc/src/main/antlr/Calculator.g:66:5: a= mulDivExpression ^ ( ( PLUS | MINUS ) mulDivExpression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_mulDivExpression_in_expression206);
            a=mulDivExpression();

            state._fsp--;

            root_0 = (Object)adaptor.becomeRoot(a.getTree(), root_0);

            // /home/lajnold/workspace/SimpleCalc/src/main/antlr/Calculator.g:66:25: ( ( PLUS | MINUS ) mulDivExpression )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==MINUS||LA2_0==PLUS) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/lajnold/workspace/SimpleCalc/src/main/antlr/Calculator.g:66:26: ( PLUS | MINUS ) mulDivExpression
            	    {
            	    set5=(Token)input.LT(1);

            	    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set5)
            	        );
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_mulDivExpression_in_expression218);
            	    mulDivExpression6=mulDivExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mulDivExpression6.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

          catch (Exception e) {
            throw e;
          }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression"


    public static class mulDivExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mulDivExpression"
    // /home/lajnold/workspace/SimpleCalc/src/main/antlr/Calculator.g:69:1: mulDivExpression : unary ^ ( ( TIMES | DIVIDED_BY ) unary )* ;
    public final CalculatorParser.mulDivExpression_return mulDivExpression() throws RecognitionException {
        CalculatorParser.mulDivExpression_return retval = new CalculatorParser.mulDivExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set8=null;
        CalculatorParser.unary_return unary7 =null;

        CalculatorParser.unary_return unary9 =null;


        Object set8_tree=null;

        try {
            // /home/lajnold/workspace/SimpleCalc/src/main/antlr/Calculator.g:70:3: ( unary ^ ( ( TIMES | DIVIDED_BY ) unary )* )
            // /home/lajnold/workspace/SimpleCalc/src/main/antlr/Calculator.g:70:5: unary ^ ( ( TIMES | DIVIDED_BY ) unary )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_unary_in_mulDivExpression235);
            unary7=unary();

            state._fsp--;

            root_0 = (Object)adaptor.becomeRoot(unary7.getTree(), root_0);

            // /home/lajnold/workspace/SimpleCalc/src/main/antlr/Calculator.g:70:12: ( ( TIMES | DIVIDED_BY ) unary )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==DIVIDED_BY||LA3_0==TIMES) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/lajnold/workspace/SimpleCalc/src/main/antlr/Calculator.g:70:13: ( TIMES | DIVIDED_BY ) unary
            	    {
            	    set8=(Token)input.LT(1);

            	    if ( input.LA(1)==DIVIDED_BY||input.LA(1)==TIMES ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set8)
            	        );
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unary_in_mulDivExpression247);
            	    unary9=unary();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unary9.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

          catch (Exception e) {
            throw e;
          }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "mulDivExpression"


    public static class assignment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment"
    // /home/lajnold/workspace/SimpleCalc/src/main/antlr/Calculator.g:73:1: assignment : ID ASSIGN expression -> ^( T_ASSIGN ID expression ) ;
    public final CalculatorParser.assignment_return assignment() throws RecognitionException {
        CalculatorParser.assignment_return retval = new CalculatorParser.assignment_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID10=null;
        Token ASSIGN11=null;
        CalculatorParser.expression_return expression12 =null;


        Object ID10_tree=null;
        Object ASSIGN11_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/lajnold/workspace/SimpleCalc/src/main/antlr/Calculator.g:74:3: ( ID ASSIGN expression -> ^( T_ASSIGN ID expression ) )
            // /home/lajnold/workspace/SimpleCalc/src/main/antlr/Calculator.g:74:5: ID ASSIGN expression
            {
            ID10=(Token)match(input,ID,FOLLOW_ID_in_assignment264);  
            stream_ID.add(ID10);


            ASSIGN11=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment266);  
            stream_ASSIGN.add(ASSIGN11);


            pushFollow(FOLLOW_expression_in_assignment268);
            expression12=expression();

            state._fsp--;

            stream_expression.add(expression12.getTree());

            // AST REWRITE
            // elements: expression, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 74:27: -> ^( T_ASSIGN ID expression )
            {
                // /home/lajnold/workspace/SimpleCalc/src/main/antlr/Calculator.g:74:31: ^( T_ASSIGN ID expression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_ASSIGN, "T_ASSIGN")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

          catch (Exception e) {
            throw e;
          }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignment"


    public static class unary_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unary"
    // /home/lajnold/workspace/SimpleCalc/src/main/antlr/Calculator.g:77:1: unary : ( ( PLUS )? atom -> atom | MINUS atom -> ^( NUMBER[\"-1\"] TIMES atom ) );
    public final CalculatorParser.unary_return unary() throws RecognitionException {
        CalculatorParser.unary_return retval = new CalculatorParser.unary_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PLUS13=null;
        Token MINUS15=null;
        CalculatorParser.atom_return atom14 =null;

        CalculatorParser.atom_return atom16 =null;


        Object PLUS13_tree=null;
        Object MINUS15_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        try {
            // /home/lajnold/workspace/SimpleCalc/src/main/antlr/Calculator.g:78:3: ( ( PLUS )? atom -> atom | MINUS atom -> ^( NUMBER[\"-1\"] TIMES atom ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0 >= ID && LA5_0 <= LPAREN)||(LA5_0 >= NUMBER && LA5_0 <= PLUS)) ) {
                alt5=1;
            }
            else if ( (LA5_0==MINUS) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /home/lajnold/workspace/SimpleCalc/src/main/antlr/Calculator.g:78:5: ( PLUS )? atom
                    {
                    // /home/lajnold/workspace/SimpleCalc/src/main/antlr/Calculator.g:78:5: ( PLUS )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==PLUS) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /home/lajnold/workspace/SimpleCalc/src/main/antlr/Calculator.g:78:5: PLUS
                            {
                            PLUS13=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary295);  
                            stream_PLUS.add(PLUS13);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_atom_in_unary298);
                    atom14=atom();

                    state._fsp--;

                    stream_atom.add(atom14.getTree());

                    // AST REWRITE
                    // elements: atom
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 78:17: -> atom
                    {
                        adaptor.addChild(root_0, stream_atom.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/lajnold/workspace/SimpleCalc/src/main/antlr/Calculator.g:79:5: MINUS atom
                    {
                    MINUS15=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary310);  
                    stream_MINUS.add(MINUS15);


                    pushFollow(FOLLOW_atom_in_unary312);
                    atom16=atom();

                    state._fsp--;

                    stream_atom.add(atom16.getTree());

                    // AST REWRITE
                    // elements: atom
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 79:17: -> ^( NUMBER[\"-1\"] TIMES atom )
                    {
                        // /home/lajnold/workspace/SimpleCalc/src/main/antlr/Calculator.g:79:21: ^( NUMBER[\"-1\"] TIMES atom )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NUMBER, "-1")
                        , root_1);

                        adaptor.addChild(root_1, 
                        (Object)adaptor.create(TIMES, "TIMES")
                        );

                        adaptor.addChild(root_1, stream_atom.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

          catch (Exception e) {
            throw e;
          }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unary"


    public static class atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // /home/lajnold/workspace/SimpleCalc/src/main/antlr/Calculator.g:82:1: atom : ( NUMBER -> NUMBER | ID -> ^( T_VAR ID ) | LPAREN expression RPAREN -> expression | ID LPAREN expression RPAREN -> ^( T_CALL ID T_ARG expression ) );
    public final CalculatorParser.atom_return atom() throws RecognitionException {
        CalculatorParser.atom_return retval = new CalculatorParser.atom_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NUMBER17=null;
        Token ID18=null;
        Token LPAREN19=null;
        Token RPAREN21=null;
        Token ID22=null;
        Token LPAREN23=null;
        Token RPAREN25=null;
        CalculatorParser.expression_return expression20 =null;

        CalculatorParser.expression_return expression24 =null;


        Object NUMBER17_tree=null;
        Object ID18_tree=null;
        Object LPAREN19_tree=null;
        Object RPAREN21_tree=null;
        Object ID22_tree=null;
        Object LPAREN23_tree=null;
        Object RPAREN25_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/lajnold/workspace/SimpleCalc/src/main/antlr/Calculator.g:83:3: ( NUMBER -> NUMBER | ID -> ^( T_VAR ID ) | LPAREN expression RPAREN -> expression | ID LPAREN expression RPAREN -> ^( T_CALL ID T_ARG expression ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case NUMBER:
                {
                alt6=1;
                }
                break;
            case ID:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==LPAREN) ) {
                    alt6=4;
                }
                else if ( (LA6_2==EOF||LA6_2==DIVIDED_BY||LA6_2==MINUS||LA6_2==PLUS||(LA6_2 >= RPAREN && LA6_2 <= TIMES)) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;

                }
                }
                break;
            case LPAREN:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // /home/lajnold/workspace/SimpleCalc/src/main/antlr/Calculator.g:83:5: NUMBER
                    {
                    NUMBER17=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_atom340);  
                    stream_NUMBER.add(NUMBER17);


                    // AST REWRITE
                    // elements: NUMBER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 83:34: -> NUMBER
                    {
                        adaptor.addChild(root_0, 
                        stream_NUMBER.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/lajnold/workspace/SimpleCalc/src/main/antlr/Calculator.g:84:5: ID
                    {
                    ID18=(Token)match(input,ID,FOLLOW_ID_in_atom373);  
                    stream_ID.add(ID18);


                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 84:34: -> ^( T_VAR ID )
                    {
                        // /home/lajnold/workspace/SimpleCalc/src/main/antlr/Calculator.g:84:38: ^( T_VAR ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(T_VAR, "T_VAR")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // /home/lajnold/workspace/SimpleCalc/src/main/antlr/Calculator.g:85:5: LPAREN expression RPAREN
                    {
                    LPAREN19=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom414);  
                    stream_LPAREN.add(LPAREN19);


                    pushFollow(FOLLOW_expression_in_atom416);
                    expression20=expression();

                    state._fsp--;

                    stream_expression.add(expression20.getTree());

                    RPAREN21=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom418);  
                    stream_RPAREN.add(RPAREN21);


                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 85:34: -> expression
                    {
                        adaptor.addChild(root_0, stream_expression.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // /home/lajnold/workspace/SimpleCalc/src/main/antlr/Calculator.g:86:5: ID LPAREN expression RPAREN
                    {
                    ID22=(Token)match(input,ID,FOLLOW_ID_in_atom433);  
                    stream_ID.add(ID22);


                    LPAREN23=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom435);  
                    stream_LPAREN.add(LPAREN23);


                    pushFollow(FOLLOW_expression_in_atom437);
                    expression24=expression();

                    state._fsp--;

                    stream_expression.add(expression24.getTree());

                    RPAREN25=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom439);  
                    stream_RPAREN.add(RPAREN25);


                    // AST REWRITE
                    // elements: ID, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 86:34: -> ^( T_CALL ID T_ARG expression )
                    {
                        // /home/lajnold/workspace/SimpleCalc/src/main/antlr/Calculator.g:86:38: ^( T_CALL ID T_ARG expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(T_CALL, "T_CALL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        (Object)adaptor.create(T_ARG, "T_ARG")
                        );

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

          catch (Exception e) {
            throw e;
          }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"

    // Delegated rules


 

    public static final BitSet FOLLOW_expression_in_parse177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_parse180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_parse187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_parse190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mulDivExpression_in_expression206 = new BitSet(new long[]{0x0000000000002802L});
    public static final BitSet FOLLOW_set_in_expression210 = new BitSet(new long[]{0x0000000000003E00L});
    public static final BitSet FOLLOW_mulDivExpression_in_expression218 = new BitSet(new long[]{0x0000000000002802L});
    public static final BitSet FOLLOW_unary_in_mulDivExpression235 = new BitSet(new long[]{0x0000000000010082L});
    public static final BitSet FOLLOW_set_in_mulDivExpression239 = new BitSet(new long[]{0x0000000000003E00L});
    public static final BitSet FOLLOW_unary_in_mulDivExpression247 = new BitSet(new long[]{0x0000000000010082L});
    public static final BitSet FOLLOW_ID_in_assignment264 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_assignment266 = new BitSet(new long[]{0x0000000000003E00L});
    public static final BitSet FOLLOW_expression_in_assignment268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_unary295 = new BitSet(new long[]{0x0000000000001600L});
    public static final BitSet FOLLOW_atom_in_unary298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary310 = new BitSet(new long[]{0x0000000000001600L});
    public static final BitSet FOLLOW_atom_in_unary312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_atom340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom414 = new BitSet(new long[]{0x0000000000003E00L});
    public static final BitSet FOLLOW_expression_in_atom416 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RPAREN_in_atom418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom433 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LPAREN_in_atom435 = new BitSet(new long[]{0x0000000000003E00L});
    public static final BitSet FOLLOW_expression_in_atom437 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RPAREN_in_atom439 = new BitSet(new long[]{0x0000000000000002L});

}
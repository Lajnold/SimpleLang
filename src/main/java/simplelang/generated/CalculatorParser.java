// $ANTLR 3.4 /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g 2013-02-23 18:39:20

  package simplelang.generated;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class CalculatorParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALPHA", "ASSIGN", "DIGIT", "DIVIDED_BY", "HEXDIGIT", "ID", "LPAREN", "MINUS", "NUMBER", "PLUS", "POINT", "RPAREN", "TIMES", "T_ARG", "T_ASSIGN", "T_CALL", "T_EXPR", "T_VAR", "WHITESPACE", "','"
    };

    public static final int EOF=-1;
    public static final int T__23=23;
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
    public static final int T_EXPR=20;
    public static final int T_VAR=21;
    public static final int WHITESPACE=22;

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
    public String getGrammarFileName() { return "/home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g"; }


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
    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:61:8: public parse : ( expression ^ EOF !| assignment ^ EOF !);
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
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:62:3: ( expression ^ EOF !| assignment ^ EOF !)
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
                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:62:5: expression ^ EOF !
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expression_in_parse182);
                    expression1=expression();

                    state._fsp--;

                    root_0 = (Object)adaptor.becomeRoot(expression1.getTree(), root_0);

                    EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_parse185); 

                    }
                    break;
                case 2 :
                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:63:5: assignment ^ EOF !
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assignment_in_parse192);
                    assignment3=assignment();

                    state._fsp--;

                    root_0 = (Object)adaptor.becomeRoot(assignment3.getTree(), root_0);

                    EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_parse195); 

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
    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:66:1: expression : expressionImpl -> ^( T_EXPR expressionImpl ) ;
    public final CalculatorParser.expression_return expression() throws RecognitionException {
        CalculatorParser.expression_return retval = new CalculatorParser.expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        CalculatorParser.expressionImpl_return expressionImpl5 =null;


        RewriteRuleSubtreeStream stream_expressionImpl=new RewriteRuleSubtreeStream(adaptor,"rule expressionImpl");
        try {
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:67:3: ( expressionImpl -> ^( T_EXPR expressionImpl ) )
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:67:5: expressionImpl
            {
            pushFollow(FOLLOW_expressionImpl_in_expression211);
            expressionImpl5=expressionImpl();

            state._fsp--;

            stream_expressionImpl.add(expressionImpl5.getTree());

            // AST REWRITE
            // elements: expressionImpl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 67:21: -> ^( T_EXPR expressionImpl )
            {
                // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:67:25: ^( T_EXPR expressionImpl )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_EXPR, "T_EXPR")
                , root_1);

                adaptor.addChild(root_1, stream_expressionImpl.nextTree());

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
    // $ANTLR end "expression"


    public static class expressionImpl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expressionImpl"
    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:70:1: expressionImpl : a= unary (rest= ( ( PLUS | MINUS | TIMES | DIVIDED_BY ) unary ) )* ;
    public final CalculatorParser.expressionImpl_return expressionImpl() throws RecognitionException {
        CalculatorParser.expressionImpl_return retval = new CalculatorParser.expressionImpl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token rest=null;
        Token set6=null;
        CalculatorParser.unary_return a =null;

        CalculatorParser.unary_return unary7 =null;


        Object rest_tree=null;
        Object set6_tree=null;

        try {
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:71:3: (a= unary (rest= ( ( PLUS | MINUS | TIMES | DIVIDED_BY ) unary ) )* )
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:71:5: a= unary (rest= ( ( PLUS | MINUS | TIMES | DIVIDED_BY ) unary ) )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_unary_in_expressionImpl238);
            a=unary();

            state._fsp--;

            adaptor.addChild(root_0, a.getTree());

            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:71:17: (rest= ( ( PLUS | MINUS | TIMES | DIVIDED_BY ) unary ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==DIVIDED_BY||LA2_0==MINUS||LA2_0==PLUS||LA2_0==TIMES) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:71:17: rest= ( ( PLUS | MINUS | TIMES | DIVIDED_BY ) unary )
            	    {
            	    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:71:18: ( ( PLUS | MINUS | TIMES | DIVIDED_BY ) unary )
            	    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:71:19: ( PLUS | MINUS | TIMES | DIVIDED_BY ) unary
            	    {
            	    set6=(Token)input.LT(1);

            	    if ( input.LA(1)==DIVIDED_BY||input.LA(1)==MINUS||input.LA(1)==PLUS||input.LA(1)==TIMES ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set6)
            	        );
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unary_in_expressionImpl259);
            	    unary7=unary();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unary7.getTree());

            	    }


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
    // $ANTLR end "expressionImpl"


    public static class assignment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment"
    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:74:1: assignment : ID ASSIGN expression -> ^( T_ASSIGN ID expression ) ;
    public final CalculatorParser.assignment_return assignment() throws RecognitionException {
        CalculatorParser.assignment_return retval = new CalculatorParser.assignment_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID8=null;
        Token ASSIGN9=null;
        CalculatorParser.expression_return expression10 =null;


        Object ID8_tree=null;
        Object ASSIGN9_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:75:3: ( ID ASSIGN expression -> ^( T_ASSIGN ID expression ) )
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:75:5: ID ASSIGN expression
            {
            ID8=(Token)match(input,ID,FOLLOW_ID_in_assignment276);  
            stream_ID.add(ID8);


            ASSIGN9=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment278);  
            stream_ASSIGN.add(ASSIGN9);


            pushFollow(FOLLOW_expression_in_assignment280);
            expression10=expression();

            state._fsp--;

            stream_expression.add(expression10.getTree());

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
            // 75:27: -> ^( T_ASSIGN ID expression )
            {
                // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:75:31: ^( T_ASSIGN ID expression )
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
    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:78:1: unary : ( ( PLUS )? NUMBER -> NUMBER | MINUS NUMBER -> ^( NUMBER[\"-1\"] TIMES NUMBER ) | ( PLUS )? varRef -> varRef | MINUS varRef -> ^( T_EXPR NUMBER[\"-1\"] TIMES varRef ) | ( PLUS )? parenExpression -> parenExpression | MINUS parenExpression -> ^( T_EXPR NUMBER[\"-1\"] TIMES parenExpression ) | ( PLUS )? call -> call | MINUS call -> ^( T_EXPR NUMBER[\"-1\"] TIMES call ) );
    public final CalculatorParser.unary_return unary() throws RecognitionException {
        CalculatorParser.unary_return retval = new CalculatorParser.unary_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PLUS11=null;
        Token NUMBER12=null;
        Token MINUS13=null;
        Token NUMBER14=null;
        Token PLUS15=null;
        Token MINUS17=null;
        Token PLUS19=null;
        Token MINUS21=null;
        Token PLUS23=null;
        Token MINUS25=null;
        CalculatorParser.varRef_return varRef16 =null;

        CalculatorParser.varRef_return varRef18 =null;

        CalculatorParser.parenExpression_return parenExpression20 =null;

        CalculatorParser.parenExpression_return parenExpression22 =null;

        CalculatorParser.call_return call24 =null;

        CalculatorParser.call_return call26 =null;


        Object PLUS11_tree=null;
        Object NUMBER12_tree=null;
        Object MINUS13_tree=null;
        Object NUMBER14_tree=null;
        Object PLUS15_tree=null;
        Object MINUS17_tree=null;
        Object PLUS19_tree=null;
        Object MINUS21_tree=null;
        Object PLUS23_tree=null;
        Object MINUS25_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");
        RewriteRuleSubtreeStream stream_call=new RewriteRuleSubtreeStream(adaptor,"rule call");
        RewriteRuleSubtreeStream stream_varRef=new RewriteRuleSubtreeStream(adaptor,"rule varRef");
        RewriteRuleSubtreeStream stream_parenExpression=new RewriteRuleSubtreeStream(adaptor,"rule parenExpression");
        try {
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:79:3: ( ( PLUS )? NUMBER -> NUMBER | MINUS NUMBER -> ^( NUMBER[\"-1\"] TIMES NUMBER ) | ( PLUS )? varRef -> varRef | MINUS varRef -> ^( T_EXPR NUMBER[\"-1\"] TIMES varRef ) | ( PLUS )? parenExpression -> parenExpression | MINUS parenExpression -> ^( T_EXPR NUMBER[\"-1\"] TIMES parenExpression ) | ( PLUS )? call -> call | MINUS call -> ^( T_EXPR NUMBER[\"-1\"] TIMES call ) )
            int alt7=8;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                switch ( input.LA(2) ) {
                case NUMBER:
                    {
                    alt7=1;
                    }
                    break;
                case ID:
                    {
                    int LA7_4 = input.LA(3);

                    if ( (LA7_4==LPAREN) ) {
                        alt7=7;
                    }
                    else if ( (LA7_4==EOF||LA7_4==DIVIDED_BY||LA7_4==MINUS||LA7_4==PLUS||(LA7_4 >= RPAREN && LA7_4 <= TIMES)||LA7_4==23) ) {
                        alt7=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 4, input);

                        throw nvae;

                    }
                    }
                    break;
                case LPAREN:
                    {
                    alt7=5;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }

                }
                break;
            case NUMBER:
                {
                alt7=1;
                }
                break;
            case MINUS:
                {
                switch ( input.LA(2) ) {
                case NUMBER:
                    {
                    alt7=2;
                    }
                    break;
                case ID:
                    {
                    int LA7_7 = input.LA(3);

                    if ( (LA7_7==LPAREN) ) {
                        alt7=8;
                    }
                    else if ( (LA7_7==EOF||LA7_7==DIVIDED_BY||LA7_7==MINUS||LA7_7==PLUS||(LA7_7 >= RPAREN && LA7_7 <= TIMES)||LA7_7==23) ) {
                        alt7=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 7, input);

                        throw nvae;

                    }
                    }
                    break;
                case LPAREN:
                    {
                    alt7=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 3, input);

                    throw nvae;

                }

                }
                break;
            case ID:
                {
                int LA7_4 = input.LA(2);

                if ( (LA7_4==LPAREN) ) {
                    alt7=7;
                }
                else if ( (LA7_4==EOF||LA7_4==DIVIDED_BY||LA7_4==MINUS||LA7_4==PLUS||(LA7_4 >= RPAREN && LA7_4 <= TIMES)||LA7_4==23) ) {
                    alt7=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 4, input);

                    throw nvae;

                }
                }
                break;
            case LPAREN:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:79:5: ( PLUS )? NUMBER
                    {
                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:79:5: ( PLUS )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==PLUS) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:79:5: PLUS
                            {
                            PLUS11=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary307);  
                            stream_PLUS.add(PLUS11);


                            }
                            break;

                    }


                    NUMBER12=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_unary310);  
                    stream_NUMBER.add(NUMBER12);


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
                    // 79:19: -> NUMBER
                    {
                        adaptor.addChild(root_0, 
                        stream_NUMBER.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:80:5: MINUS NUMBER
                    {
                    MINUS13=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary322);  
                    stream_MINUS.add(MINUS13);


                    NUMBER14=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_unary324);  
                    stream_NUMBER.add(NUMBER14);


                    // AST REWRITE
                    // elements: NUMBER, NUMBER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 80:19: -> ^( NUMBER[\"-1\"] TIMES NUMBER )
                    {
                        // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:80:23: ^( NUMBER[\"-1\"] TIMES NUMBER )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NUMBER, "-1")
                        , root_1);

                        adaptor.addChild(root_1, 
                        (Object)adaptor.create(TIMES, "TIMES")
                        );

                        adaptor.addChild(root_1, 
                        stream_NUMBER.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:81:5: ( PLUS )? varRef
                    {
                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:81:5: ( PLUS )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==PLUS) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:81:5: PLUS
                            {
                            PLUS15=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary343);  
                            stream_PLUS.add(PLUS15);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_varRef_in_unary346);
                    varRef16=varRef();

                    state._fsp--;

                    stream_varRef.add(varRef16.getTree());

                    // AST REWRITE
                    // elements: varRef
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 81:19: -> varRef
                    {
                        adaptor.addChild(root_0, stream_varRef.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:82:5: MINUS varRef
                    {
                    MINUS17=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary358);  
                    stream_MINUS.add(MINUS17);


                    pushFollow(FOLLOW_varRef_in_unary360);
                    varRef18=varRef();

                    state._fsp--;

                    stream_varRef.add(varRef18.getTree());

                    // AST REWRITE
                    // elements: varRef
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 82:19: -> ^( T_EXPR NUMBER[\"-1\"] TIMES varRef )
                    {
                        // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:82:23: ^( T_EXPR NUMBER[\"-1\"] TIMES varRef )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(T_EXPR, "T_EXPR")
                        , root_1);

                        adaptor.addChild(root_1, 
                        (Object)adaptor.create(NUMBER, "-1")
                        );

                        adaptor.addChild(root_1, 
                        (Object)adaptor.create(TIMES, "TIMES")
                        );

                        adaptor.addChild(root_1, stream_varRef.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:83:5: ( PLUS )? parenExpression
                    {
                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:83:5: ( PLUS )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==PLUS) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:83:5: PLUS
                            {
                            PLUS19=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary381);  
                            stream_PLUS.add(PLUS19);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_parenExpression_in_unary384);
                    parenExpression20=parenExpression();

                    state._fsp--;

                    stream_parenExpression.add(parenExpression20.getTree());

                    // AST REWRITE
                    // elements: parenExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 83:28: -> parenExpression
                    {
                        adaptor.addChild(root_0, stream_parenExpression.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:84:5: MINUS parenExpression
                    {
                    MINUS21=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary396);  
                    stream_MINUS.add(MINUS21);


                    pushFollow(FOLLOW_parenExpression_in_unary398);
                    parenExpression22=parenExpression();

                    state._fsp--;

                    stream_parenExpression.add(parenExpression22.getTree());

                    // AST REWRITE
                    // elements: parenExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 84:28: -> ^( T_EXPR NUMBER[\"-1\"] TIMES parenExpression )
                    {
                        // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:84:32: ^( T_EXPR NUMBER[\"-1\"] TIMES parenExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(T_EXPR, "T_EXPR")
                        , root_1);

                        adaptor.addChild(root_1, 
                        (Object)adaptor.create(NUMBER, "-1")
                        );

                        adaptor.addChild(root_1, 
                        (Object)adaptor.create(TIMES, "TIMES")
                        );

                        adaptor.addChild(root_1, stream_parenExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 7 :
                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:85:5: ( PLUS )? call
                    {
                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:85:5: ( PLUS )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==PLUS) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:85:5: PLUS
                            {
                            PLUS23=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary419);  
                            stream_PLUS.add(PLUS23);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_call_in_unary422);
                    call24=call();

                    state._fsp--;

                    stream_call.add(call24.getTree());

                    // AST REWRITE
                    // elements: call
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 85:17: -> call
                    {
                        adaptor.addChild(root_0, stream_call.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 8 :
                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:86:5: MINUS call
                    {
                    MINUS25=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary434);  
                    stream_MINUS.add(MINUS25);


                    pushFollow(FOLLOW_call_in_unary436);
                    call26=call();

                    state._fsp--;

                    stream_call.add(call26.getTree());

                    // AST REWRITE
                    // elements: call
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 86:17: -> ^( T_EXPR NUMBER[\"-1\"] TIMES call )
                    {
                        // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:86:21: ^( T_EXPR NUMBER[\"-1\"] TIMES call )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(T_EXPR, "T_EXPR")
                        , root_1);

                        adaptor.addChild(root_1, 
                        (Object)adaptor.create(NUMBER, "-1")
                        );

                        adaptor.addChild(root_1, 
                        (Object)adaptor.create(TIMES, "TIMES")
                        );

                        adaptor.addChild(root_1, stream_call.nextTree());

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


    public static class varRef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varRef"
    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:89:1: varRef : ID -> ^( T_VAR ID ) ;
    public final CalculatorParser.varRef_return varRef() throws RecognitionException {
        CalculatorParser.varRef_return retval = new CalculatorParser.varRef_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID27=null;

        Object ID27_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:90:3: ( ID -> ^( T_VAR ID ) )
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:90:5: ID
            {
            ID27=(Token)match(input,ID,FOLLOW_ID_in_varRef466);  
            stream_ID.add(ID27);


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
            // 90:9: -> ^( T_VAR ID )
            {
                // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:90:13: ^( T_VAR ID )
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
    // $ANTLR end "varRef"


    public static class parenExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parenExpression"
    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:93:1: parenExpression : LPAREN expressionImpl RPAREN -> ^( T_EXPR expressionImpl ) ;
    public final CalculatorParser.parenExpression_return parenExpression() throws RecognitionException {
        CalculatorParser.parenExpression_return retval = new CalculatorParser.parenExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LPAREN28=null;
        Token RPAREN30=null;
        CalculatorParser.expressionImpl_return expressionImpl29 =null;


        Object LPAREN28_tree=null;
        Object RPAREN30_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expressionImpl=new RewriteRuleSubtreeStream(adaptor,"rule expressionImpl");
        try {
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:94:3: ( LPAREN expressionImpl RPAREN -> ^( T_EXPR expressionImpl ) )
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:94:5: LPAREN expressionImpl RPAREN
            {
            LPAREN28=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parenExpression491);  
            stream_LPAREN.add(LPAREN28);


            pushFollow(FOLLOW_expressionImpl_in_parenExpression493);
            expressionImpl29=expressionImpl();

            state._fsp--;

            stream_expressionImpl.add(expressionImpl29.getTree());

            RPAREN30=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parenExpression495);  
            stream_RPAREN.add(RPAREN30);


            // AST REWRITE
            // elements: expressionImpl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 94:35: -> ^( T_EXPR expressionImpl )
            {
                // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:94:39: ^( T_EXPR expressionImpl )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_EXPR, "T_EXPR")
                , root_1);

                adaptor.addChild(root_1, stream_expressionImpl.nextTree());

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
    // $ANTLR end "parenExpression"


    public static class call_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "call"
    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:97:1: call : ID LPAREN ( callArgument ( ',' callArgument )* )? RPAREN -> ^( T_CALL ID ( callArgument )* ) ;
    public final CalculatorParser.call_return call() throws RecognitionException {
        CalculatorParser.call_return retval = new CalculatorParser.call_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID31=null;
        Token LPAREN32=null;
        Token char_literal34=null;
        Token RPAREN36=null;
        CalculatorParser.callArgument_return callArgument33 =null;

        CalculatorParser.callArgument_return callArgument35 =null;


        Object ID31_tree=null;
        Object LPAREN32_tree=null;
        Object char_literal34_tree=null;
        Object RPAREN36_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_callArgument=new RewriteRuleSubtreeStream(adaptor,"rule callArgument");
        try {
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:98:3: ( ID LPAREN ( callArgument ( ',' callArgument )* )? RPAREN -> ^( T_CALL ID ( callArgument )* ) )
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:98:5: ID LPAREN ( callArgument ( ',' callArgument )* )? RPAREN
            {
            ID31=(Token)match(input,ID,FOLLOW_ID_in_call520);  
            stream_ID.add(ID31);


            LPAREN32=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_call522);  
            stream_LPAREN.add(LPAREN32);


            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:98:15: ( callArgument ( ',' callArgument )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0 >= ID && LA9_0 <= PLUS)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:98:16: callArgument ( ',' callArgument )*
                    {
                    pushFollow(FOLLOW_callArgument_in_call525);
                    callArgument33=callArgument();

                    state._fsp--;

                    stream_callArgument.add(callArgument33.getTree());

                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:98:29: ( ',' callArgument )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==23) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:98:30: ',' callArgument
                    	    {
                    	    char_literal34=(Token)match(input,23,FOLLOW_23_in_call528);  
                    	    stream_23.add(char_literal34);


                    	    pushFollow(FOLLOW_callArgument_in_call530);
                    	    callArgument35=callArgument();

                    	    state._fsp--;

                    	    stream_callArgument.add(callArgument35.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }


            RPAREN36=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_call536);  
            stream_RPAREN.add(RPAREN36);


            // AST REWRITE
            // elements: ID, callArgument
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 98:59: -> ^( T_CALL ID ( callArgument )* )
            {
                // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:98:63: ^( T_CALL ID ( callArgument )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_CALL, "T_CALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:98:75: ( callArgument )*
                while ( stream_callArgument.hasNext() ) {
                    adaptor.addChild(root_1, stream_callArgument.nextTree());

                }
                stream_callArgument.reset();

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
    // $ANTLR end "call"


    public static class callArgument_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "callArgument"
    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:101:1: callArgument : expression -> ^( T_ARG expression ) ;
    public final CalculatorParser.callArgument_return callArgument() throws RecognitionException {
        CalculatorParser.callArgument_return retval = new CalculatorParser.callArgument_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        CalculatorParser.expression_return expression37 =null;


        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:102:3: ( expression -> ^( T_ARG expression ) )
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:102:5: expression
            {
            pushFollow(FOLLOW_expression_in_callArgument564);
            expression37=expression();

            state._fsp--;

            stream_expression.add(expression37.getTree());

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
            // 102:17: -> ^( T_ARG expression )
            {
                // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:102:21: ^( T_ARG expression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_ARG, "T_ARG")
                , root_1);

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
    // $ANTLR end "callArgument"

    // Delegated rules


 

    public static final BitSet FOLLOW_expression_in_parse182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_parse185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_parse192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_parse195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionImpl_in_expression211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_expressionImpl238 = new BitSet(new long[]{0x0000000000012882L});
    public static final BitSet FOLLOW_set_in_expressionImpl243 = new BitSet(new long[]{0x0000000000003E00L});
    public static final BitSet FOLLOW_unary_in_expressionImpl259 = new BitSet(new long[]{0x0000000000012882L});
    public static final BitSet FOLLOW_ID_in_assignment276 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_assignment278 = new BitSet(new long[]{0x0000000000003E00L});
    public static final BitSet FOLLOW_expression_in_assignment280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_unary307 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_NUMBER_in_unary310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary322 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_NUMBER_in_unary324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_unary343 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_varRef_in_unary346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary358 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_varRef_in_unary360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_unary381 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_parenExpression_in_unary384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary396 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_parenExpression_in_unary398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_unary419 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_call_in_unary422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary434 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_call_in_unary436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_varRef466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parenExpression491 = new BitSet(new long[]{0x0000000000003E00L});
    public static final BitSet FOLLOW_expressionImpl_in_parenExpression493 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RPAREN_in_parenExpression495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_call520 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LPAREN_in_call522 = new BitSet(new long[]{0x000000000000BE00L});
    public static final BitSet FOLLOW_callArgument_in_call525 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_23_in_call528 = new BitSet(new long[]{0x0000000000003E00L});
    public static final BitSet FOLLOW_callArgument_in_call530 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_RPAREN_in_call536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_callArgument564 = new BitSet(new long[]{0x0000000000000002L});

}
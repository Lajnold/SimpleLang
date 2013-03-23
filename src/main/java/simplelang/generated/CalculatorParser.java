// $ANTLR 3.4 /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g 2013-03-23 23:03:17

  package simplelang.generated;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class CalculatorParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALPHA", "AND", "ASSIGN", "COMMA", "DIGIT", "DIVIDED_BY", "EQ", "FALSE", "GT", "GTE", "HEXDIGIT", "ID", "LPAREN", "LT", "LTE", "MINUS", "NEQ", "NOT", "NUMBER", "OR", "PLUS", "POINT", "RPAREN", "TIMES", "TRUE", "T_ARG", "T_ASSIGN", "T_CALL", "T_EXPR", "T_NOT", "T_VAR", "WHITESPACE"
    };

    public static final int EOF=-1;
    public static final int ALPHA=4;
    public static final int AND=5;
    public static final int ASSIGN=6;
    public static final int COMMA=7;
    public static final int DIGIT=8;
    public static final int DIVIDED_BY=9;
    public static final int EQ=10;
    public static final int FALSE=11;
    public static final int GT=12;
    public static final int GTE=13;
    public static final int HEXDIGIT=14;
    public static final int ID=15;
    public static final int LPAREN=16;
    public static final int LT=17;
    public static final int LTE=18;
    public static final int MINUS=19;
    public static final int NEQ=20;
    public static final int NOT=21;
    public static final int NUMBER=22;
    public static final int OR=23;
    public static final int PLUS=24;
    public static final int POINT=25;
    public static final int RPAREN=26;
    public static final int TIMES=27;
    public static final int TRUE=28;
    public static final int T_ARG=29;
    public static final int T_ASSIGN=30;
    public static final int T_CALL=31;
    public static final int T_EXPR=32;
    public static final int T_NOT=33;
    public static final int T_VAR=34;
    public static final int WHITESPACE=35;

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
    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:76:8: public parse : ( expression ^ EOF !| assignment ^ EOF !);
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
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:77:3: ( expression ^ EOF !| assignment ^ EOF !)
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==FALSE||LA1_0==LPAREN||LA1_0==MINUS||(LA1_0 >= NOT && LA1_0 <= NUMBER)||LA1_0==PLUS||LA1_0==TRUE) ) {
                alt1=1;
            }
            else if ( (LA1_0==ID) ) {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==EOF||LA1_2==AND||(LA1_2 >= DIVIDED_BY && LA1_2 <= EQ)||(LA1_2 >= GT && LA1_2 <= GTE)||(LA1_2 >= LPAREN && LA1_2 <= NEQ)||(LA1_2 >= OR && LA1_2 <= PLUS)||LA1_2==TIMES) ) {
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
                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:77:5: expression ^ EOF !
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expression_in_parse302);
                    expression1=expression();

                    state._fsp--;

                    root_0 = (Object)adaptor.becomeRoot(expression1.getTree(), root_0);

                    EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_parse305); 

                    }
                    break;
                case 2 :
                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:78:5: assignment ^ EOF !
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assignment_in_parse312);
                    assignment3=assignment();

                    state._fsp--;

                    root_0 = (Object)adaptor.becomeRoot(assignment3.getTree(), root_0);

                    EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_parse315); 

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
    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:81:1: expression : expressionImpl -> ^( T_EXPR expressionImpl ) ;
    public final CalculatorParser.expression_return expression() throws RecognitionException {
        CalculatorParser.expression_return retval = new CalculatorParser.expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        CalculatorParser.expressionImpl_return expressionImpl5 =null;


        RewriteRuleSubtreeStream stream_expressionImpl=new RewriteRuleSubtreeStream(adaptor,"rule expressionImpl");
        try {
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:82:3: ( expressionImpl -> ^( T_EXPR expressionImpl ) )
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:82:5: expressionImpl
            {
            pushFollow(FOLLOW_expressionImpl_in_expression331);
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
            // 82:21: -> ^( T_EXPR expressionImpl )
            {
                // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:82:25: ^( T_EXPR expressionImpl )
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
    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:85:1: expressionImpl : operand ( ( arithmeticOp | relationalOp | logicalOp ) operand )* ;
    public final CalculatorParser.expressionImpl_return expressionImpl() throws RecognitionException {
        CalculatorParser.expressionImpl_return retval = new CalculatorParser.expressionImpl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        CalculatorParser.operand_return operand6 =null;

        CalculatorParser.arithmeticOp_return arithmeticOp7 =null;

        CalculatorParser.relationalOp_return relationalOp8 =null;

        CalculatorParser.logicalOp_return logicalOp9 =null;

        CalculatorParser.operand_return operand10 =null;



        try {
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:86:3: ( operand ( ( arithmeticOp | relationalOp | logicalOp ) operand )* )
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:86:5: operand ( ( arithmeticOp | relationalOp | logicalOp ) operand )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_operand_in_expressionImpl356);
            operand6=operand();

            state._fsp--;

            adaptor.addChild(root_0, operand6.getTree());

            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:86:13: ( ( arithmeticOp | relationalOp | logicalOp ) operand )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==AND||(LA3_0 >= DIVIDED_BY && LA3_0 <= EQ)||(LA3_0 >= GT && LA3_0 <= GTE)||(LA3_0 >= LT && LA3_0 <= NEQ)||(LA3_0 >= OR && LA3_0 <= PLUS)||LA3_0==TIMES) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:86:14: ( arithmeticOp | relationalOp | logicalOp ) operand
            	    {
            	    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:86:14: ( arithmeticOp | relationalOp | logicalOp )
            	    int alt2=3;
            	    switch ( input.LA(1) ) {
            	    case DIVIDED_BY:
            	    case MINUS:
            	    case PLUS:
            	    case TIMES:
            	        {
            	        alt2=1;
            	        }
            	        break;
            	    case EQ:
            	    case GT:
            	    case GTE:
            	    case LT:
            	    case LTE:
            	    case NEQ:
            	        {
            	        alt2=2;
            	        }
            	        break;
            	    case AND:
            	    case OR:
            	        {
            	        alt2=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 2, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt2) {
            	        case 1 :
            	            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:86:15: arithmeticOp
            	            {
            	            pushFollow(FOLLOW_arithmeticOp_in_expressionImpl360);
            	            arithmeticOp7=arithmeticOp();

            	            state._fsp--;

            	            adaptor.addChild(root_0, arithmeticOp7.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:86:30: relationalOp
            	            {
            	            pushFollow(FOLLOW_relationalOp_in_expressionImpl364);
            	            relationalOp8=relationalOp();

            	            state._fsp--;

            	            adaptor.addChild(root_0, relationalOp8.getTree());

            	            }
            	            break;
            	        case 3 :
            	            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:86:45: logicalOp
            	            {
            	            pushFollow(FOLLOW_logicalOp_in_expressionImpl368);
            	            logicalOp9=logicalOp();

            	            state._fsp--;

            	            adaptor.addChild(root_0, logicalOp9.getTree());

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_operand_in_expressionImpl371);
            	    operand10=operand();

            	    state._fsp--;

            	    adaptor.addChild(root_0, operand10.getTree());

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
    // $ANTLR end "expressionImpl"


    public static class arithmeticOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arithmeticOp"
    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:89:1: arithmeticOp : ( PLUS | MINUS | TIMES | DIVIDED_BY );
    public final CalculatorParser.arithmeticOp_return arithmeticOp() throws RecognitionException {
        CalculatorParser.arithmeticOp_return retval = new CalculatorParser.arithmeticOp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set11=null;

        Object set11_tree=null;

        try {
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:90:3: ( PLUS | MINUS | TIMES | DIVIDED_BY )
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:
            {
            root_0 = (Object)adaptor.nil();


            set11=(Token)input.LT(1);

            if ( input.LA(1)==DIVIDED_BY||input.LA(1)==MINUS||input.LA(1)==PLUS||input.LA(1)==TIMES ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set11)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "arithmeticOp"


    public static class relationalOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relationalOp"
    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:93:1: relationalOp : ( EQ | NEQ | LT | LTE | GT | GTE );
    public final CalculatorParser.relationalOp_return relationalOp() throws RecognitionException {
        CalculatorParser.relationalOp_return retval = new CalculatorParser.relationalOp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set12=null;

        Object set12_tree=null;

        try {
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:94:3: ( EQ | NEQ | LT | LTE | GT | GTE )
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:
            {
            root_0 = (Object)adaptor.nil();


            set12=(Token)input.LT(1);

            if ( input.LA(1)==EQ||(input.LA(1) >= GT && input.LA(1) <= GTE)||(input.LA(1) >= LT && input.LA(1) <= LTE)||input.LA(1)==NEQ ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set12)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "relationalOp"


    public static class logicalOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logicalOp"
    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:97:1: logicalOp : ( AND | OR );
    public final CalculatorParser.logicalOp_return logicalOp() throws RecognitionException {
        CalculatorParser.logicalOp_return retval = new CalculatorParser.logicalOp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set13=null;

        Object set13_tree=null;

        try {
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:98:3: ( AND | OR )
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:
            {
            root_0 = (Object)adaptor.nil();


            set13=(Token)input.LT(1);

            if ( input.LA(1)==AND||input.LA(1)==OR ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set13)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "logicalOp"


    public static class operand_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "operand"
    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:101:1: operand : ( ( PLUS )? NUMBER -> NUMBER | MINUS NUMBER -> ^( NUMBER[\"-1\"] TIMES NUMBER ) | ( PLUS )? unary -> unary | MINUS unary -> ^( T_EXPR NUMBER[\"-1\"] TIMES unary ) | TRUE -> TRUE | NOT TRUE -> ^( T_NOT TRUE ) | FALSE -> FALSE | NOT FALSE -> ^( T_NOT FALSE ) | NOT unary -> ^( T_NOT unary ) );
    public final CalculatorParser.operand_return operand() throws RecognitionException {
        CalculatorParser.operand_return retval = new CalculatorParser.operand_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PLUS14=null;
        Token NUMBER15=null;
        Token MINUS16=null;
        Token NUMBER17=null;
        Token PLUS18=null;
        Token MINUS20=null;
        Token TRUE22=null;
        Token NOT23=null;
        Token TRUE24=null;
        Token FALSE25=null;
        Token NOT26=null;
        Token FALSE27=null;
        Token NOT28=null;
        CalculatorParser.unary_return unary19 =null;

        CalculatorParser.unary_return unary21 =null;

        CalculatorParser.unary_return unary29 =null;


        Object PLUS14_tree=null;
        Object NUMBER15_tree=null;
        Object MINUS16_tree=null;
        Object NUMBER17_tree=null;
        Object PLUS18_tree=null;
        Object MINUS20_tree=null;
        Object TRUE22_tree=null;
        Object NOT23_tree=null;
        Object TRUE24_tree=null;
        Object FALSE25_tree=null;
        Object NOT26_tree=null;
        Object FALSE27_tree=null;
        Object NOT28_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");
        RewriteRuleSubtreeStream stream_unary=new RewriteRuleSubtreeStream(adaptor,"rule unary");
        try {
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:102:3: ( ( PLUS )? NUMBER -> NUMBER | MINUS NUMBER -> ^( NUMBER[\"-1\"] TIMES NUMBER ) | ( PLUS )? unary -> unary | MINUS unary -> ^( T_EXPR NUMBER[\"-1\"] TIMES unary ) | TRUE -> TRUE | NOT TRUE -> ^( T_NOT TRUE ) | FALSE -> FALSE | NOT FALSE -> ^( T_NOT FALSE ) | NOT unary -> ^( T_NOT unary ) )
            int alt6=9;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==NUMBER) ) {
                    alt6=1;
                }
                else if ( ((LA6_1 >= ID && LA6_1 <= LPAREN)) ) {
                    alt6=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
                }
                break;
            case NUMBER:
                {
                alt6=1;
                }
                break;
            case MINUS:
                {
                int LA6_3 = input.LA(2);

                if ( (LA6_3==NUMBER) ) {
                    alt6=2;
                }
                else if ( ((LA6_3 >= ID && LA6_3 <= LPAREN)) ) {
                    alt6=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;

                }
                }
                break;
            case ID:
            case LPAREN:
                {
                alt6=3;
                }
                break;
            case TRUE:
                {
                alt6=5;
                }
                break;
            case NOT:
                {
                switch ( input.LA(2) ) {
                case TRUE:
                    {
                    alt6=6;
                    }
                    break;
                case FALSE:
                    {
                    alt6=8;
                    }
                    break;
                case ID:
                case LPAREN:
                    {
                    alt6=9;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 6, input);

                    throw nvae;

                }

                }
                break;
            case FALSE:
                {
                alt6=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:102:5: ( PLUS )? NUMBER
                    {
                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:102:5: ( PLUS )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==PLUS) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:102:5: PLUS
                            {
                            PLUS14=(Token)match(input,PLUS,FOLLOW_PLUS_in_operand471);  
                            stream_PLUS.add(PLUS14);


                            }
                            break;

                    }


                    NUMBER15=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_operand474);  
                    stream_NUMBER.add(NUMBER15);


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
                    // 102:19: -> NUMBER
                    {
                        adaptor.addChild(root_0, 
                        stream_NUMBER.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:103:5: MINUS NUMBER
                    {
                    MINUS16=(Token)match(input,MINUS,FOLLOW_MINUS_in_operand486);  
                    stream_MINUS.add(MINUS16);


                    NUMBER17=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_operand488);  
                    stream_NUMBER.add(NUMBER17);


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
                    // 103:19: -> ^( NUMBER[\"-1\"] TIMES NUMBER )
                    {
                        // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:103:23: ^( NUMBER[\"-1\"] TIMES NUMBER )
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
                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:104:5: ( PLUS )? unary
                    {
                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:104:5: ( PLUS )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==PLUS) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:104:5: PLUS
                            {
                            PLUS18=(Token)match(input,PLUS,FOLLOW_PLUS_in_operand507);  
                            stream_PLUS.add(PLUS18);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_unary_in_operand510);
                    unary19=unary();

                    state._fsp--;

                    stream_unary.add(unary19.getTree());

                    // AST REWRITE
                    // elements: unary
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 104:19: -> unary
                    {
                        adaptor.addChild(root_0, stream_unary.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:105:5: MINUS unary
                    {
                    MINUS20=(Token)match(input,MINUS,FOLLOW_MINUS_in_operand523);  
                    stream_MINUS.add(MINUS20);


                    pushFollow(FOLLOW_unary_in_operand525);
                    unary21=unary();

                    state._fsp--;

                    stream_unary.add(unary21.getTree());

                    // AST REWRITE
                    // elements: unary
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 105:19: -> ^( T_EXPR NUMBER[\"-1\"] TIMES unary )
                    {
                        // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:105:23: ^( T_EXPR NUMBER[\"-1\"] TIMES unary )
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

                        adaptor.addChild(root_1, stream_unary.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:106:5: TRUE
                    {
                    TRUE22=(Token)match(input,TRUE,FOLLOW_TRUE_in_operand547);  
                    stream_TRUE.add(TRUE22);


                    // AST REWRITE
                    // elements: TRUE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 106:19: -> TRUE
                    {
                        adaptor.addChild(root_0, 
                        stream_TRUE.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:107:5: NOT TRUE
                    {
                    NOT23=(Token)match(input,NOT,FOLLOW_NOT_in_operand567);  
                    stream_NOT.add(NOT23);


                    TRUE24=(Token)match(input,TRUE,FOLLOW_TRUE_in_operand569);  
                    stream_TRUE.add(TRUE24);


                    // AST REWRITE
                    // elements: TRUE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 107:19: -> ^( T_NOT TRUE )
                    {
                        // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:107:23: ^( T_NOT TRUE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(T_NOT, "T_NOT")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_TRUE.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 7 :
                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:108:5: FALSE
                    {
                    FALSE25=(Token)match(input,FALSE,FOLLOW_FALSE_in_operand589);  
                    stream_FALSE.add(FALSE25);


                    // AST REWRITE
                    // elements: FALSE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 108:19: -> FALSE
                    {
                        adaptor.addChild(root_0, 
                        stream_FALSE.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 8 :
                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:109:5: NOT FALSE
                    {
                    NOT26=(Token)match(input,NOT,FOLLOW_NOT_in_operand608);  
                    stream_NOT.add(NOT26);


                    FALSE27=(Token)match(input,FALSE,FOLLOW_FALSE_in_operand610);  
                    stream_FALSE.add(FALSE27);


                    // AST REWRITE
                    // elements: FALSE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 109:19: -> ^( T_NOT FALSE )
                    {
                        // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:109:23: ^( T_NOT FALSE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(T_NOT, "T_NOT")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_FALSE.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 9 :
                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:110:5: NOT unary
                    {
                    NOT28=(Token)match(input,NOT,FOLLOW_NOT_in_operand629);  
                    stream_NOT.add(NOT28);


                    pushFollow(FOLLOW_unary_in_operand631);
                    unary29=unary();

                    state._fsp--;

                    stream_unary.add(unary29.getTree());

                    // AST REWRITE
                    // elements: unary
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 110:19: -> ^( T_NOT unary )
                    {
                        // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:110:23: ^( T_NOT unary )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(T_NOT, "T_NOT")
                        , root_1);

                        adaptor.addChild(root_1, stream_unary.nextTree());

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
    // $ANTLR end "operand"


    public static class unary_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unary"
    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:113:1: unary : ( varRef | parenExpression | call );
    public final CalculatorParser.unary_return unary() throws RecognitionException {
        CalculatorParser.unary_return retval = new CalculatorParser.unary_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        CalculatorParser.varRef_return varRef30 =null;

        CalculatorParser.parenExpression_return parenExpression31 =null;

        CalculatorParser.call_return call32 =null;



        try {
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:114:3: ( varRef | parenExpression | call )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==LPAREN) ) {
                    alt7=3;
                }
                else if ( (LA7_1==EOF||LA7_1==AND||LA7_1==COMMA||(LA7_1 >= DIVIDED_BY && LA7_1 <= EQ)||(LA7_1 >= GT && LA7_1 <= GTE)||(LA7_1 >= LT && LA7_1 <= NEQ)||(LA7_1 >= OR && LA7_1 <= PLUS)||(LA7_1 >= RPAREN && LA7_1 <= TIMES)) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA7_0==LPAREN) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:114:5: varRef
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varRef_in_unary661);
                    varRef30=varRef();

                    state._fsp--;

                    adaptor.addChild(root_0, varRef30.getTree());

                    }
                    break;
                case 2 :
                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:114:14: parenExpression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_parenExpression_in_unary665);
                    parenExpression31=parenExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, parenExpression31.getTree());

                    }
                    break;
                case 3 :
                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:114:32: call
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_call_in_unary669);
                    call32=call();

                    state._fsp--;

                    adaptor.addChild(root_0, call32.getTree());

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
    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:117:1: varRef : ID -> ^( T_VAR ID ) ;
    public final CalculatorParser.varRef_return varRef() throws RecognitionException {
        CalculatorParser.varRef_return retval = new CalculatorParser.varRef_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID33=null;

        Object ID33_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:118:3: ( ID -> ^( T_VAR ID ) )
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:118:5: ID
            {
            ID33=(Token)match(input,ID,FOLLOW_ID_in_varRef684);  
            stream_ID.add(ID33);


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
            // 118:9: -> ^( T_VAR ID )
            {
                // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:118:13: ^( T_VAR ID )
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
    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:121:1: parenExpression : LPAREN expression RPAREN -> expression ;
    public final CalculatorParser.parenExpression_return parenExpression() throws RecognitionException {
        CalculatorParser.parenExpression_return retval = new CalculatorParser.parenExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LPAREN34=null;
        Token RPAREN36=null;
        CalculatorParser.expression_return expression35 =null;


        Object LPAREN34_tree=null;
        Object RPAREN36_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:122:3: ( LPAREN expression RPAREN -> expression )
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:122:5: LPAREN expression RPAREN
            {
            LPAREN34=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parenExpression709);  
            stream_LPAREN.add(LPAREN34);


            pushFollow(FOLLOW_expression_in_parenExpression711);
            expression35=expression();

            state._fsp--;

            stream_expression.add(expression35.getTree());

            RPAREN36=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parenExpression713);  
            stream_RPAREN.add(RPAREN36);


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
            // 122:31: -> expression
            {
                adaptor.addChild(root_0, stream_expression.nextTree());

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
    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:125:1: call : ID LPAREN ( callArgument ( COMMA callArgument )* )? RPAREN -> ^( T_CALL ID ( callArgument )* ) ;
    public final CalculatorParser.call_return call() throws RecognitionException {
        CalculatorParser.call_return retval = new CalculatorParser.call_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID37=null;
        Token LPAREN38=null;
        Token COMMA40=null;
        Token RPAREN42=null;
        CalculatorParser.callArgument_return callArgument39 =null;

        CalculatorParser.callArgument_return callArgument41 =null;


        Object ID37_tree=null;
        Object LPAREN38_tree=null;
        Object COMMA40_tree=null;
        Object RPAREN42_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_callArgument=new RewriteRuleSubtreeStream(adaptor,"rule callArgument");
        try {
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:126:3: ( ID LPAREN ( callArgument ( COMMA callArgument )* )? RPAREN -> ^( T_CALL ID ( callArgument )* ) )
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:126:5: ID LPAREN ( callArgument ( COMMA callArgument )* )? RPAREN
            {
            ID37=(Token)match(input,ID,FOLLOW_ID_in_call734);  
            stream_ID.add(ID37);


            LPAREN38=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_call736);  
            stream_LPAREN.add(LPAREN38);


            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:126:15: ( callArgument ( COMMA callArgument )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==FALSE||(LA9_0 >= ID && LA9_0 <= LPAREN)||LA9_0==MINUS||(LA9_0 >= NOT && LA9_0 <= NUMBER)||LA9_0==PLUS||LA9_0==TRUE) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:126:16: callArgument ( COMMA callArgument )*
                    {
                    pushFollow(FOLLOW_callArgument_in_call739);
                    callArgument39=callArgument();

                    state._fsp--;

                    stream_callArgument.add(callArgument39.getTree());

                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:126:29: ( COMMA callArgument )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==COMMA) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:126:30: COMMA callArgument
                    	    {
                    	    COMMA40=(Token)match(input,COMMA,FOLLOW_COMMA_in_call742);  
                    	    stream_COMMA.add(COMMA40);


                    	    pushFollow(FOLLOW_callArgument_in_call744);
                    	    callArgument41=callArgument();

                    	    state._fsp--;

                    	    stream_callArgument.add(callArgument41.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }


            RPAREN42=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_call750);  
            stream_RPAREN.add(RPAREN42);


            // AST REWRITE
            // elements: callArgument, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 126:61: -> ^( T_CALL ID ( callArgument )* )
            {
                // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:126:65: ^( T_CALL ID ( callArgument )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_CALL, "T_CALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:126:77: ( callArgument )*
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
    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:129:1: callArgument : expression -> ^( T_ARG expression ) ;
    public final CalculatorParser.callArgument_return callArgument() throws RecognitionException {
        CalculatorParser.callArgument_return retval = new CalculatorParser.callArgument_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        CalculatorParser.expression_return expression43 =null;


        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:130:3: ( expression -> ^( T_ARG expression ) )
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:130:5: expression
            {
            pushFollow(FOLLOW_expression_in_callArgument778);
            expression43=expression();

            state._fsp--;

            stream_expression.add(expression43.getTree());

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
            // 130:17: -> ^( T_ARG expression )
            {
                // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:130:21: ^( T_ARG expression )
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


    public static class assignment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment"
    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:134:1: assignment : ID ASSIGN expression -> ^( T_ASSIGN ID expression ) ;
    public final CalculatorParser.assignment_return assignment() throws RecognitionException {
        CalculatorParser.assignment_return retval = new CalculatorParser.assignment_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID44=null;
        Token ASSIGN45=null;
        CalculatorParser.expression_return expression46 =null;


        Object ID44_tree=null;
        Object ASSIGN45_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:135:3: ( ID ASSIGN expression -> ^( T_ASSIGN ID expression ) )
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:135:5: ID ASSIGN expression
            {
            ID44=(Token)match(input,ID,FOLLOW_ID_in_assignment804);  
            stream_ID.add(ID44);


            ASSIGN45=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment806);  
            stream_ASSIGN.add(ASSIGN45);


            pushFollow(FOLLOW_expression_in_assignment808);
            expression46=expression();

            state._fsp--;

            stream_expression.add(expression46.getTree());

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
            // 135:27: -> ^( T_ASSIGN ID expression )
            {
                // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:135:31: ^( T_ASSIGN ID expression )
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

    // Delegated rules


 

    public static final BitSet FOLLOW_expression_in_parse302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_parse305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_parse312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_parse315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionImpl_in_expression331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operand_in_expressionImpl356 = new BitSet(new long[]{0x00000000099E3622L});
    public static final BitSet FOLLOW_arithmeticOp_in_expressionImpl360 = new BitSet(new long[]{0x0000000011698800L});
    public static final BitSet FOLLOW_relationalOp_in_expressionImpl364 = new BitSet(new long[]{0x0000000011698800L});
    public static final BitSet FOLLOW_logicalOp_in_expressionImpl368 = new BitSet(new long[]{0x0000000011698800L});
    public static final BitSet FOLLOW_operand_in_expressionImpl371 = new BitSet(new long[]{0x00000000099E3622L});
    public static final BitSet FOLLOW_PLUS_in_operand471 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_NUMBER_in_operand474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_operand486 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_NUMBER_in_operand488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_operand507 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_unary_in_operand510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_operand523 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_unary_in_operand525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_operand547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_operand567 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_TRUE_in_operand569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_operand589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_operand608 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_FALSE_in_operand610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_operand629 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_unary_in_operand631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varRef_in_unary661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenExpression_in_unary665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_unary669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_varRef684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parenExpression709 = new BitSet(new long[]{0x0000000011698800L});
    public static final BitSet FOLLOW_expression_in_parenExpression711 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RPAREN_in_parenExpression713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_call734 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_LPAREN_in_call736 = new BitSet(new long[]{0x0000000015698800L});
    public static final BitSet FOLLOW_callArgument_in_call739 = new BitSet(new long[]{0x0000000004000080L});
    public static final BitSet FOLLOW_COMMA_in_call742 = new BitSet(new long[]{0x0000000011698800L});
    public static final BitSet FOLLOW_callArgument_in_call744 = new BitSet(new long[]{0x0000000004000080L});
    public static final BitSet FOLLOW_RPAREN_in_call750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_callArgument778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignment804 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ASSIGN_in_assignment806 = new BitSet(new long[]{0x0000000011698800L});
    public static final BitSet FOLLOW_expression_in_assignment808 = new BitSet(new long[]{0x0000000000000002L});

}
// $ANTLR 3.4 /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g 2012-12-31 20:21:10

  package simplecalc.generated;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SimpleCalcParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DIGIT", "DIVIDED_BY", "INVALID", "LPAREN", "MINUS", "NUMBER", "PLUS", "POINT", "RPAREN", "SPACE", "TIMES", "X"
    };

    public static final int EOF=-1;
    public static final int DIGIT=4;
    public static final int DIVIDED_BY=5;
    public static final int INVALID=6;
    public static final int LPAREN=7;
    public static final int MINUS=8;
    public static final int NUMBER=9;
    public static final int PLUS=10;
    public static final int POINT=11;
    public static final int RPAREN=12;
    public static final int SPACE=13;
    public static final int TIMES=14;
    public static final int X=15;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public SimpleCalcParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public SimpleCalcParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return SimpleCalcParser.tokenNames; }
    public String getGrammarFileName() { return "/home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g"; }


     protected Object recoverFromMismatchedToken(IntStream input,
                                                 int ttype,
                                                 BitSet follow)
            throws RecognitionException {
        throw new MismatchedTokenException(ttype, input);
      }


    public static class parse_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parse"
    // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:40:8: public parse : addSubExpr ^ EOF !;
    public final SimpleCalcParser.parse_return parse() throws RecognitionException {
        SimpleCalcParser.parse_return retval = new SimpleCalcParser.parse_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EOF2=null;
        SimpleCalcParser.addSubExpr_return addSubExpr1 =null;


        Object EOF2_tree=null;

        try {
            // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:41:3: ( addSubExpr ^ EOF !)
            // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:41:5: addSubExpr ^ EOF !
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_addSubExpr_in_parse130);
            addSubExpr1=addSubExpr();

            state._fsp--;

            root_0 = (Object)adaptor.becomeRoot(addSubExpr1.getTree(), root_0);

            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_parse133); 

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


    public static class addSubExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "addSubExpr"
    // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:44:1: addSubExpr : a= mulDivExpr ^ ( ( PLUS | MINUS ) mulDivExpr )* ;
    public final SimpleCalcParser.addSubExpr_return addSubExpr() throws RecognitionException {
        SimpleCalcParser.addSubExpr_return retval = new SimpleCalcParser.addSubExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set3=null;
        SimpleCalcParser.mulDivExpr_return a =null;

        SimpleCalcParser.mulDivExpr_return mulDivExpr4 =null;


        Object set3_tree=null;

        try {
            // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:45:3: (a= mulDivExpr ^ ( ( PLUS | MINUS ) mulDivExpr )* )
            // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:45:5: a= mulDivExpr ^ ( ( PLUS | MINUS ) mulDivExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_mulDivExpr_in_addSubExpr149);
            a=mulDivExpr();

            state._fsp--;

            root_0 = (Object)adaptor.becomeRoot(a.getTree(), root_0);

            // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:45:19: ( ( PLUS | MINUS ) mulDivExpr )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==MINUS||LA1_0==PLUS) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:45:20: ( PLUS | MINUS ) mulDivExpr
            	    {
            	    set3=(Token)input.LT(1);

            	    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set3)
            	        );
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_mulDivExpr_in_addSubExpr161);
            	    mulDivExpr4=mulDivExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mulDivExpr4.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "addSubExpr"


    public static class mulDivExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mulDivExpr"
    // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:48:1: mulDivExpr : atom ^ ( ( TIMES | DIVIDED_BY ) atom )* ;
    public final SimpleCalcParser.mulDivExpr_return mulDivExpr() throws RecognitionException {
        SimpleCalcParser.mulDivExpr_return retval = new SimpleCalcParser.mulDivExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set6=null;
        SimpleCalcParser.atom_return atom5 =null;

        SimpleCalcParser.atom_return atom7 =null;


        Object set6_tree=null;

        try {
            // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:49:3: ( atom ^ ( ( TIMES | DIVIDED_BY ) atom )* )
            // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:49:5: atom ^ ( ( TIMES | DIVIDED_BY ) atom )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_atom_in_mulDivExpr178);
            atom5=atom();

            state._fsp--;

            root_0 = (Object)adaptor.becomeRoot(atom5.getTree(), root_0);

            // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:49:11: ( ( TIMES | DIVIDED_BY ) atom )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==DIVIDED_BY||LA2_0==TIMES) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:49:12: ( TIMES | DIVIDED_BY ) atom
            	    {
            	    set6=(Token)input.LT(1);

            	    if ( input.LA(1)==DIVIDED_BY||input.LA(1)==TIMES ) {
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


            	    pushFollow(FOLLOW_atom_in_mulDivExpr190);
            	    atom7=atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, atom7.getTree());

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
    // $ANTLR end "mulDivExpr"


    public static class atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:52:1: atom : ( NUMBER -> ^( PLUS NUMBER ) | (sign= MINUS |sign= PLUS ) NUMBER -> ^( $sign NUMBER ) | LPAREN addSubExpr RPAREN -> addSubExpr );
    public final SimpleCalcParser.atom_return atom() throws RecognitionException {
        SimpleCalcParser.atom_return retval = new SimpleCalcParser.atom_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token sign=null;
        Token NUMBER8=null;
        Token NUMBER9=null;
        Token LPAREN10=null;
        Token RPAREN12=null;
        SimpleCalcParser.addSubExpr_return addSubExpr11 =null;


        Object sign_tree=null;
        Object NUMBER8_tree=null;
        Object NUMBER9_tree=null;
        Object LPAREN10_tree=null;
        Object RPAREN12_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");
        RewriteRuleSubtreeStream stream_addSubExpr=new RewriteRuleSubtreeStream(adaptor,"rule addSubExpr");
        try {
            // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:53:3: ( NUMBER -> ^( PLUS NUMBER ) | (sign= MINUS |sign= PLUS ) NUMBER -> ^( $sign NUMBER ) | LPAREN addSubExpr RPAREN -> addSubExpr )
            int alt4=3;
            switch ( input.LA(1) ) {
            case NUMBER:
                {
                alt4=1;
                }
                break;
            case MINUS:
            case PLUS:
                {
                alt4=2;
                }
                break;
            case LPAREN:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:53:5: NUMBER
                    {
                    NUMBER8=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_atom207);  
                    stream_NUMBER.add(NUMBER8);


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
                    // 53:38: -> ^( PLUS NUMBER )
                    {
                        // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:53:42: ^( PLUS NUMBER )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PLUS, "PLUS")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_NUMBER.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:54:5: (sign= MINUS |sign= PLUS ) NUMBER
                    {
                    // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:54:5: (sign= MINUS |sign= PLUS )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==MINUS) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==PLUS) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;

                    }
                    switch (alt3) {
                        case 1 :
                            // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:54:6: sign= MINUS
                            {
                            sign=(Token)match(input,MINUS,FOLLOW_MINUS_in_atom251);  
                            stream_MINUS.add(sign);


                            }
                            break;
                        case 2 :
                            // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:54:19: sign= PLUS
                            {
                            sign=(Token)match(input,PLUS,FOLLOW_PLUS_in_atom257);  
                            stream_PLUS.add(sign);


                            }
                            break;

                    }


                    NUMBER9=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_atom260);  
                    stream_NUMBER.add(NUMBER9);


                    // AST REWRITE
                    // elements: NUMBER, sign
                    // token labels: sign
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_sign=new RewriteRuleTokenStream(adaptor,"token sign",sign);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 54:38: -> ^( $sign NUMBER )
                    {
                        // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:54:42: ^( $sign NUMBER )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_sign.nextNode(), root_1);

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
                    // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:55:5: LPAREN addSubExpr RPAREN
                    {
                    LPAREN10=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom277);  
                    stream_LPAREN.add(LPAREN10);


                    pushFollow(FOLLOW_addSubExpr_in_atom279);
                    addSubExpr11=addSubExpr();

                    state._fsp--;

                    stream_addSubExpr.add(addSubExpr11.getTree());

                    RPAREN12=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom281);  
                    stream_RPAREN.add(RPAREN12);


                    // AST REWRITE
                    // elements: addSubExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 55:38: -> addSubExpr
                    {
                        adaptor.addChild(root_0, stream_addSubExpr.nextTree());

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


 

    public static final BitSet FOLLOW_addSubExpr_in_parse130 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_parse133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mulDivExpr_in_addSubExpr149 = new BitSet(new long[]{0x0000000000000502L});
    public static final BitSet FOLLOW_set_in_addSubExpr153 = new BitSet(new long[]{0x0000000000000780L});
    public static final BitSet FOLLOW_mulDivExpr_in_addSubExpr161 = new BitSet(new long[]{0x0000000000000502L});
    public static final BitSet FOLLOW_atom_in_mulDivExpr178 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_set_in_mulDivExpr182 = new BitSet(new long[]{0x0000000000000780L});
    public static final BitSet FOLLOW_atom_in_mulDivExpr190 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_NUMBER_in_atom207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_atom251 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PLUS_in_atom257 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NUMBER_in_atom260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom277 = new BitSet(new long[]{0x0000000000000780L});
    public static final BitSet FOLLOW_addSubExpr_in_atom279 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RPAREN_in_atom281 = new BitSet(new long[]{0x0000000000000002L});

}
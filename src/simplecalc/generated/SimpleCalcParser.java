// $ANTLR 3.4 /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g 2013-01-01 12:23:21

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
    // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:48:1: mulDivExpr : unary ^ ( ( TIMES | DIVIDED_BY ) unary )* ;
    public final SimpleCalcParser.mulDivExpr_return mulDivExpr() throws RecognitionException {
        SimpleCalcParser.mulDivExpr_return retval = new SimpleCalcParser.mulDivExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set6=null;
        SimpleCalcParser.unary_return unary5 =null;

        SimpleCalcParser.unary_return unary7 =null;


        Object set6_tree=null;

        try {
            // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:49:3: ( unary ^ ( ( TIMES | DIVIDED_BY ) unary )* )
            // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:49:5: unary ^ ( ( TIMES | DIVIDED_BY ) unary )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_unary_in_mulDivExpr178);
            unary5=unary();

            state._fsp--;

            root_0 = (Object)adaptor.becomeRoot(unary5.getTree(), root_0);

            // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:49:12: ( ( TIMES | DIVIDED_BY ) unary )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==DIVIDED_BY||LA2_0==TIMES) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:49:13: ( TIMES | DIVIDED_BY ) unary
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


            	    pushFollow(FOLLOW_unary_in_mulDivExpr190);
            	    unary7=unary();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unary7.getTree());

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


    public static class unary_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unary"
    // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:52:1: unary : ( ( PLUS )? atom -> atom | MINUS atom -> ^( NUMBER[\"-1\"] TIMES atom ) );
    public final SimpleCalcParser.unary_return unary() throws RecognitionException {
        SimpleCalcParser.unary_return retval = new SimpleCalcParser.unary_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PLUS8=null;
        Token MINUS10=null;
        SimpleCalcParser.atom_return atom9 =null;

        SimpleCalcParser.atom_return atom11 =null;


        Object PLUS8_tree=null;
        Object MINUS10_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        try {
            // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:53:3: ( ( PLUS )? atom -> atom | MINUS atom -> ^( NUMBER[\"-1\"] TIMES atom ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==LPAREN||(LA4_0 >= NUMBER && LA4_0 <= PLUS)) ) {
                alt4=1;
            }
            else if ( (LA4_0==MINUS) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:53:5: ( PLUS )? atom
                    {
                    // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:53:5: ( PLUS )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==PLUS) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:53:5: PLUS
                            {
                            PLUS8=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary207);  
                            stream_PLUS.add(PLUS8);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_atom_in_unary210);
                    atom9=atom();

                    state._fsp--;

                    stream_atom.add(atom9.getTree());

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
                    // 53:17: -> atom
                    {
                        adaptor.addChild(root_0, stream_atom.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:54:5: MINUS atom
                    {
                    MINUS10=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary222);  
                    stream_MINUS.add(MINUS10);


                    pushFollow(FOLLOW_atom_in_unary224);
                    atom11=atom();

                    state._fsp--;

                    stream_atom.add(atom11.getTree());

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
                    // 54:17: -> ^( NUMBER[\"-1\"] TIMES atom )
                    {
                        // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:54:21: ^( NUMBER[\"-1\"] TIMES atom )
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
    // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:57:1: atom : ( NUMBER -> NUMBER | LPAREN addSubExpr RPAREN -> addSubExpr );
    public final SimpleCalcParser.atom_return atom() throws RecognitionException {
        SimpleCalcParser.atom_return retval = new SimpleCalcParser.atom_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NUMBER12=null;
        Token LPAREN13=null;
        Token RPAREN15=null;
        SimpleCalcParser.addSubExpr_return addSubExpr14 =null;


        Object NUMBER12_tree=null;
        Object LPAREN13_tree=null;
        Object RPAREN15_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");
        RewriteRuleSubtreeStream stream_addSubExpr=new RewriteRuleSubtreeStream(adaptor,"rule addSubExpr");
        try {
            // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:58:3: ( NUMBER -> NUMBER | LPAREN addSubExpr RPAREN -> addSubExpr )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==NUMBER) ) {
                alt5=1;
            }
            else if ( (LA5_0==LPAREN) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:58:5: NUMBER
                    {
                    NUMBER12=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_atom252);  
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
                    // 58:31: -> NUMBER
                    {
                        adaptor.addChild(root_0, 
                        stream_NUMBER.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:59:5: LPAREN addSubExpr RPAREN
                    {
                    LPAREN13=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom282);  
                    stream_LPAREN.add(LPAREN13);


                    pushFollow(FOLLOW_addSubExpr_in_atom284);
                    addSubExpr14=addSubExpr();

                    state._fsp--;

                    stream_addSubExpr.add(addSubExpr14.getTree());

                    RPAREN15=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom286);  
                    stream_RPAREN.add(RPAREN15);


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
                    // 59:31: -> addSubExpr
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
    public static final BitSet FOLLOW_unary_in_mulDivExpr178 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_set_in_mulDivExpr182 = new BitSet(new long[]{0x0000000000000780L});
    public static final BitSet FOLLOW_unary_in_mulDivExpr190 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_PLUS_in_unary207 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_atom_in_unary210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary222 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_atom_in_unary224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_atom252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom282 = new BitSet(new long[]{0x0000000000000780L});
    public static final BitSet FOLLOW_addSubExpr_in_atom284 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RPAREN_in_atom286 = new BitSet(new long[]{0x0000000000000002L});

}
// $ANTLR 3.4 /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g 2013-01-01 12:23:21

  package simplecalc.generated;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SimpleCalcLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public SimpleCalcLexer() {} 
    public SimpleCalcLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SimpleCalcLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g"; }

    // $ANTLR start "DIVIDED_BY"
    public final void mDIVIDED_BY() throws RecognitionException {
        try {
            int _type = DIVIDED_BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:6:12: ( '/' )
            // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:6:14: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIVIDED_BY"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:7:8: ( '(' )
            // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:7:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:8:7: ( '-' )
            // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:8:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:9:6: ( '+' )
            // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:9:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "POINT"
    public final void mPOINT() throws RecognitionException {
        try {
            int _type = POINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:10:7: ( '.' )
            // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:10:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "POINT"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:11:8: ( ')' )
            // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:11:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "TIMES"
    public final void mTIMES() throws RecognitionException {
        try {
            int _type = TIMES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:12:7: ( '*' )
            // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:12:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TIMES"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:63:3: ( ( DIGIT )+ ( POINT ( DIGIT )+ )? )
            // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:63:5: ( DIGIT )+ ( POINT ( DIGIT )+ )?
            {
            // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:63:5: ( DIGIT )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:63:14: ( POINT ( DIGIT )+ )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='.') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:63:15: POINT ( DIGIT )+
                    {
                    mPOINT(); 


                    // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:63:21: ( DIGIT )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:67:3: ( '0' .. '9' )
            // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "SPACE"
    public final void mSPACE() throws RecognitionException {
        try {
            int _type = SPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:72:3: ( ( ' ' | '\\t' )+ )
            // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:72:5: ( ' ' | '\\t' )+
            {
            // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:72:5: ( ' ' | '\\t' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\t'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


             skip(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SPACE"

    // $ANTLR start "INVALID"
    public final void mINVALID() throws RecognitionException {
        try {
            int _type = INVALID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:77:3: ( . )
            // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:77:5: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INVALID"

    public void mTokens() throws RecognitionException {
        // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:1:8: ( DIVIDED_BY | LPAREN | MINUS | PLUS | POINT | RPAREN | TIMES | NUMBER | SPACE | INVALID )
        int alt5=10;
        int LA5_0 = input.LA(1);

        if ( (LA5_0=='/') ) {
            alt5=1;
        }
        else if ( (LA5_0=='(') ) {
            alt5=2;
        }
        else if ( (LA5_0=='-') ) {
            alt5=3;
        }
        else if ( (LA5_0=='+') ) {
            alt5=4;
        }
        else if ( (LA5_0=='.') ) {
            alt5=5;
        }
        else if ( (LA5_0==')') ) {
            alt5=6;
        }
        else if ( (LA5_0=='*') ) {
            alt5=7;
        }
        else if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
            alt5=8;
        }
        else if ( (LA5_0=='\t'||LA5_0==' ') ) {
            alt5=9;
        }
        else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\b')||(LA5_0 >= '\n' && LA5_0 <= '\u001F')||(LA5_0 >= '!' && LA5_0 <= '\'')||LA5_0==','||(LA5_0 >= ':' && LA5_0 <= '\uFFFF')) ) {
            alt5=10;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("", 5, 0, input);

            throw nvae;

        }
        switch (alt5) {
            case 1 :
                // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:1:10: DIVIDED_BY
                {
                mDIVIDED_BY(); 


                }
                break;
            case 2 :
                // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:1:21: LPAREN
                {
                mLPAREN(); 


                }
                break;
            case 3 :
                // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:1:28: MINUS
                {
                mMINUS(); 


                }
                break;
            case 4 :
                // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:1:34: PLUS
                {
                mPLUS(); 


                }
                break;
            case 5 :
                // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:1:39: POINT
                {
                mPOINT(); 


                }
                break;
            case 6 :
                // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:1:45: RPAREN
                {
                mRPAREN(); 


                }
                break;
            case 7 :
                // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:1:52: TIMES
                {
                mTIMES(); 


                }
                break;
            case 8 :
                // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:1:58: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 9 :
                // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:1:65: SPACE
                {
                mSPACE(); 


                }
                break;
            case 10 :
                // /home/lajnold/workspace/SimpleCalc/antlr/SimpleCalc.g:1:71: INVALID
                {
                mINVALID(); 


                }
                break;

        }

    }


 

}
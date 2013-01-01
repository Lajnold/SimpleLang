// $ANTLR 3.4 /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g 2013-01-01 16:29:49

  package calculator.generated;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class CalculatorLexer extends Lexer {
    public static final int EOF=-1;
    public static final int ALPHA=4;
    public static final int ASSIGN=5;
    public static final int DIGIT=6;
    public static final int DIVIDED_BY=7;
    public static final int ID=8;
    public static final int LPAREN=9;
    public static final int MINUS=10;
    public static final int NUMBER=11;
    public static final int PLUS=12;
    public static final int POINT=13;
    public static final int RPAREN=14;
    public static final int TIMES=15;
    public static final int T_ARG=16;
    public static final int T_ASSIGN=17;
    public static final int T_CALL=18;
    public static final int T_VAR=19;
    public static final int WHITESPACE=20;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public CalculatorLexer() {} 
    public CalculatorLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CalculatorLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/home/lajnold/workspace/SimpleCalc/antlr/Calculator.g"; }

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:6:8: ( '=' )
            // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:6:10: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "DIVIDED_BY"
    public final void mDIVIDED_BY() throws RecognitionException {
        try {
            int _type = DIVIDED_BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:7:12: ( '/' )
            // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:7:14: '/'
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
            // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:8:8: ( '(' )
            // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:8:10: '('
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
            // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:9:7: ( '-' )
            // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:9:9: '-'
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
            // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:10:6: ( '+' )
            // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:10:8: '+'
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
            // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:11:7: ( '.' )
            // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:11:9: '.'
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
            // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:12:8: ( ')' )
            // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:12:10: ')'
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
            // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:13:7: ( '*' )
            // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:13:9: '*'
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

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:82:3: ( ( ALPHA | '_' ) ( ALPHA | DIGIT | '_' )* )
            // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:82:5: ( ALPHA | '_' ) ( ALPHA | DIGIT | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:82:19: ( ALPHA | DIGIT | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:86:3: ( ( DIGIT )+ ( POINT ( DIGIT )+ )? )
            // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:86:5: ( DIGIT )+ ( POINT ( DIGIT )+ )?
            {
            // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:86:5: ( DIGIT )+
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
            	    // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:
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


            // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:86:14: ( POINT ( DIGIT )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='.') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:86:15: POINT ( DIGIT )+
                    {
                    mPOINT(); 


                    // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:86:21: ( DIGIT )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:
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
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
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
            // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:90:3: ( '0' .. '9' )
            // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:
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

    // $ANTLR start "ALPHA"
    public final void mALPHA() throws RecognitionException {
        try {
            // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:94:3: ( 'a' .. 'z' | 'A' .. 'Z' )
            // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
    // $ANTLR end "ALPHA"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:99:3: ( ( ' ' | '\\t' )+ )
            // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:99:5: ( ' ' | '\\t' )+
            {
            // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:99:5: ( ' ' | '\\t' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\t'||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
    // $ANTLR end "WHITESPACE"

    public void mTokens() throws RecognitionException {
        // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:1:8: ( ASSIGN | DIVIDED_BY | LPAREN | MINUS | PLUS | POINT | RPAREN | TIMES | ID | NUMBER | WHITESPACE )
        int alt6=11;
        switch ( input.LA(1) ) {
        case '=':
            {
            alt6=1;
            }
            break;
        case '/':
            {
            alt6=2;
            }
            break;
        case '(':
            {
            alt6=3;
            }
            break;
        case '-':
            {
            alt6=4;
            }
            break;
        case '+':
            {
            alt6=5;
            }
            break;
        case '.':
            {
            alt6=6;
            }
            break;
        case ')':
            {
            alt6=7;
            }
            break;
        case '*':
            {
            alt6=8;
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case '_':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt6=9;
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt6=10;
            }
            break;
        case '\t':
        case ' ':
            {
            alt6=11;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 6, 0, input);

            throw nvae;

        }

        switch (alt6) {
            case 1 :
                // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:1:10: ASSIGN
                {
                mASSIGN(); 


                }
                break;
            case 2 :
                // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:1:17: DIVIDED_BY
                {
                mDIVIDED_BY(); 


                }
                break;
            case 3 :
                // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:1:28: LPAREN
                {
                mLPAREN(); 


                }
                break;
            case 4 :
                // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:1:35: MINUS
                {
                mMINUS(); 


                }
                break;
            case 5 :
                // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:1:41: PLUS
                {
                mPLUS(); 


                }
                break;
            case 6 :
                // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:1:46: POINT
                {
                mPOINT(); 


                }
                break;
            case 7 :
                // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:1:52: RPAREN
                {
                mRPAREN(); 


                }
                break;
            case 8 :
                // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:1:59: TIMES
                {
                mTIMES(); 


                }
                break;
            case 9 :
                // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:1:65: ID
                {
                mID(); 


                }
                break;
            case 10 :
                // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:1:68: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 11 :
                // /home/lajnold/workspace/SimpleCalc/antlr/Calculator.g:1:75: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;

        }

    }


 

}
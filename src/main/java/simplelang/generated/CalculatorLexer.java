// $ANTLR 3.4 /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g 2013-02-24 12:26:25

  package simplelang.generated;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class CalculatorLexer extends Lexer {
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

      @Override
      public void displayRecognitionError(String[] tokenNames,
                                          RecognitionException e) {
              // Don't display any error messages; the situation is taken care of by
              // throwing exceptions.
          }


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
    public String getGrammarFileName() { return "/home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g"; }

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:14:8: ( '=' )
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:14:10: '='
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
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:15:12: ( '/' )
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:15:14: '/'
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
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:16:8: ( '(' )
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:16:10: '('
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
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:17:7: ( '-' )
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:17:9: '-'
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
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:18:6: ( '+' )
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:18:8: '+'
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
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:19:7: ( '.' )
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:19:9: '.'
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
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:20:8: ( ')' )
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:20:10: ')'
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
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:21:7: ( '*' )
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:21:9: '*'
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

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:22:7: ( ',' )
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:22:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:109:3: ( ( ALPHA | '_' ) ( ALPHA | DIGIT | '_' )* )
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:109:5: ( ALPHA | '_' ) ( ALPHA | DIGIT | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:109:19: ( ALPHA | DIGIT | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:
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
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:113:3: ( ( '1' .. '9' ) ( DIGIT )* | ( DIGIT )+ POINT ( DIGIT )+ | '0' ( '0' .. '7' )+ | '0x1.' ( HEXDIGIT )+ 'p' ( PLUS | MINUS )? ( DIGIT )+ | '0x' ( HEXDIGIT )+ | ( DIGIT )+ ( POINT ( DIGIT )+ )? 'e' ( PLUS | MINUS )? ( DIGIT )+ )
            int alt15=6;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:113:5: ( '1' .. '9' ) ( DIGIT )*
                    {
                    if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:113:16: ( DIGIT )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:
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
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:114:5: ( DIGIT )+ POINT ( DIGIT )+
                    {
                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:114:5: ( DIGIT )+
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
                    	    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:
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


                    mPOINT(); 


                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:114:18: ( DIGIT )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:
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
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    }
                    break;
                case 3 :
                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:115:5: '0' ( '0' .. '7' )+
                    {
                    match('0'); 

                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:115:9: ( '0' .. '7' )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0 >= '0' && LA5_0 <= '7')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
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


                    }
                    break;
                case 4 :
                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:116:5: '0x1.' ( HEXDIGIT )+ 'p' ( PLUS | MINUS )? ( DIGIT )+
                    {
                    match("0x1."); 



                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:116:12: ( HEXDIGIT )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'a' && LA6_0 <= 'f')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
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
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    match('p'); 

                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:116:26: ( PLUS | MINUS )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='+'||LA7_0=='-') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:116:42: ( DIGIT )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:
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
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    }
                    break;
                case 5 :
                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:117:5: '0x' ( HEXDIGIT )+
                    {
                    match("0x"); 



                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:117:10: ( HEXDIGIT )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0 >= '0' && LA9_0 <= '9')||(LA9_0 >= 'a' && LA9_0 <= 'f')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
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
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    }
                    break;
                case 6 :
                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:118:5: ( DIGIT )+ ( POINT ( DIGIT )+ )? 'e' ( PLUS | MINUS )? ( DIGIT )+
                    {
                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:118:5: ( DIGIT )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:
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
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);


                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:118:12: ( POINT ( DIGIT )+ )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='.') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:118:13: POINT ( DIGIT )+
                            {
                            mPOINT(); 


                            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:118:19: ( DIGIT )+
                            int cnt11=0;
                            loop11:
                            do {
                                int alt11=2;
                                int LA11_0 = input.LA(1);

                                if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
                                    alt11=1;
                                }


                                switch (alt11) {
                            	case 1 :
                            	    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:
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
                            	    if ( cnt11 >= 1 ) break loop11;
                                        EarlyExitException eee =
                                            new EarlyExitException(11, input);
                                        throw eee;
                                }
                                cnt11++;
                            } while (true);


                            }
                            break;

                    }


                    match('e'); 

                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:118:32: ( PLUS | MINUS )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='+'||LA13_0=='-') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:118:48: ( DIGIT )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0 >= '0' && LA14_0 <= '9')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:
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
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);


                    }
                    break;

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
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:122:3: ( '0' .. '9' )
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:
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

    // $ANTLR start "HEXDIGIT"
    public final void mHEXDIGIT() throws RecognitionException {
        try {
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:126:3: ( '0' .. '9' | 'a' .. 'f' )
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
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
    // $ANTLR end "HEXDIGIT"

    // $ANTLR start "ALPHA"
    public final void mALPHA() throws RecognitionException {
        try {
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:130:3: ( 'a' .. 'z' | 'A' .. 'Z' )
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:
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
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:135:3: ( ( ' ' | '\\t' )+ )
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:135:5: ( ' ' | '\\t' )+
            {
            // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:135:5: ( ' ' | '\\t' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='\t'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
        // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:1:8: ( ASSIGN | DIVIDED_BY | LPAREN | MINUS | PLUS | POINT | RPAREN | TIMES | T__23 | ID | NUMBER | WHITESPACE )
        int alt17=12;
        switch ( input.LA(1) ) {
        case '=':
            {
            alt17=1;
            }
            break;
        case '/':
            {
            alt17=2;
            }
            break;
        case '(':
            {
            alt17=3;
            }
            break;
        case '-':
            {
            alt17=4;
            }
            break;
        case '+':
            {
            alt17=5;
            }
            break;
        case '.':
            {
            alt17=6;
            }
            break;
        case ')':
            {
            alt17=7;
            }
            break;
        case '*':
            {
            alt17=8;
            }
            break;
        case ',':
            {
            alt17=9;
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
            alt17=10;
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
            alt17=11;
            }
            break;
        case '\t':
        case ' ':
            {
            alt17=12;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 17, 0, input);

            throw nvae;

        }

        switch (alt17) {
            case 1 :
                // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:1:10: ASSIGN
                {
                mASSIGN(); 


                }
                break;
            case 2 :
                // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:1:17: DIVIDED_BY
                {
                mDIVIDED_BY(); 


                }
                break;
            case 3 :
                // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:1:28: LPAREN
                {
                mLPAREN(); 


                }
                break;
            case 4 :
                // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:1:35: MINUS
                {
                mMINUS(); 


                }
                break;
            case 5 :
                // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:1:41: PLUS
                {
                mPLUS(); 


                }
                break;
            case 6 :
                // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:1:46: POINT
                {
                mPOINT(); 


                }
                break;
            case 7 :
                // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:1:52: RPAREN
                {
                mRPAREN(); 


                }
                break;
            case 8 :
                // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:1:59: TIMES
                {
                mTIMES(); 


                }
                break;
            case 9 :
                // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:1:65: T__23
                {
                mT__23(); 


                }
                break;
            case 10 :
                // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:1:71: ID
                {
                mID(); 


                }
                break;
            case 11 :
                // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:1:74: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 12 :
                // /home/lajnold/workspace/SimpleLang/src/main/antlr/Calculator.g:1:81: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\1\4\1\uffff\1\4\4\uffff\1\15\1\uffff\1\16\1\14\4\uffff";
    static final String DFA15_eofS =
        "\20\uffff";
    static final String DFA15_minS =
        "\1\60\3\56\1\uffff\1\60\1\uffff\1\60\2\56\1\60\1\56\4\uffff";
    static final String DFA15_maxS =
        "\1\71\1\145\1\170\1\145\1\uffff\1\71\1\uffff\1\146\3\145\1\56\4"+
        "\uffff";
    static final String DFA15_acceptS =
        "\4\uffff\1\1\1\uffff\1\6\5\uffff\1\5\1\3\1\2\1\4";
    static final String DFA15_specialS =
        "\20\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\2\11\1",
            "\1\5\1\uffff\12\3\53\uffff\1\6",
            "\1\5\1\uffff\10\10\2\11\53\uffff\1\6\22\uffff\1\7",
            "\1\5\1\uffff\12\3\53\uffff\1\6",
            "",
            "\12\12",
            "",
            "\1\14\1\13\10\14\47\uffff\6\14",
            "\1\5\1\uffff\10\10\2\11\53\uffff\1\6",
            "\1\5\1\uffff\12\11\53\uffff\1\6",
            "\12\12\53\uffff\1\6",
            "\1\17",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "112:1: NUMBER : ( ( '1' .. '9' ) ( DIGIT )* | ( DIGIT )+ POINT ( DIGIT )+ | '0' ( '0' .. '7' )+ | '0x1.' ( HEXDIGIT )+ 'p' ( PLUS | MINUS )? ( DIGIT )+ | '0x' ( HEXDIGIT )+ | ( DIGIT )+ ( POINT ( DIGIT )+ )? 'e' ( PLUS | MINUS )? ( DIGIT )+ );";
        }
    }
 

}
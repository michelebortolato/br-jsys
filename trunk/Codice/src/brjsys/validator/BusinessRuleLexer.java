// $ANTLR 3.0.1 /../../media/sda1/ids/src/compiler/BusinessRule.g 2008-02-25 23:47:42
package brjsys.validator;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class BusinessRuleLexer extends Lexer {
    public static final int Count=17;
    public static final int OpRule=4;
    public static final int BOOL=14;
    public static final int CHAR=18;
    public static final int WHITESPACE=20;
    public static final int Conf=5;
    public static final int FLOAT=13;
    public static final int Tokens=23;
    public static final int EOF=-1;
    public static final int OpBool=11;
    public static final int Msg=7;
    public static final int T22=22;
    public static final int T21=21;
    public static final int Bconf=6;
    public static final int SUBFIELD=19;
    public static final int FlFun=16;
    public static final int FIELD=12;
    public static final int OpM=10;
    public static final int BoFun=15;
    public static final int OpA=9;
    public static final int STRING=8;
    public BusinessRuleLexer() {;} 
    public BusinessRuleLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "/../../media/sda1/ids/src/compiler/BusinessRule.g"; }

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // /../../media/sda1/ids/src/compiler/BusinessRule.g:4:5: ( '(' )
            // /../../media/sda1/ids/src/compiler/BusinessRule.g:4:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // /../../media/sda1/ids/src/compiler/BusinessRule.g:5:5: ( ')' )
            // /../../media/sda1/ids/src/compiler/BusinessRule.g:5:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start FlFun
    public final void mFlFun() throws RecognitionException {
        try {
            int _type = FlFun;
            // /../../media/sda1/ids/src/compiler/BusinessRule.g:136:7: ( 'SUM' | 'AVG' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='S') ) {
                alt1=1;
            }
            else if ( (LA1_0=='A') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("136:1: FlFun : ( 'SUM' | 'AVG' );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /../../media/sda1/ids/src/compiler/BusinessRule.g:136:9: 'SUM'
                    {
                    match("SUM"); 


                    }
                    break;
                case 2 :
                    // /../../media/sda1/ids/src/compiler/BusinessRule.g:136:15: 'AVG'
                    {
                    match("AVG"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FlFun

    // $ANTLR start BoFun
    public final void mBoFun() throws RecognitionException {
        try {
            int _type = BoFun;
            // /../../media/sda1/ids/src/compiler/BusinessRule.g:138:7: ( 'NOT' )
            // /../../media/sda1/ids/src/compiler/BusinessRule.g:138:9: 'NOT'
            {
            match("NOT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BoFun

    // $ANTLR start Count
    public final void mCount() throws RecognitionException {
        try {
            int _type = Count;
            // /../../media/sda1/ids/src/compiler/BusinessRule.g:140:7: ( 'COUNT' )
            // /../../media/sda1/ids/src/compiler/BusinessRule.g:140:9: 'COUNT'
            {
            match("COUNT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end Count

    // $ANTLR start Msg
    public final void mMsg() throws RecognitionException {
        try {
            int _type = Msg;
            // /../../media/sda1/ids/src/compiler/BusinessRule.g:142:5: ( 'message' )
            // /../../media/sda1/ids/src/compiler/BusinessRule.g:142:7: 'message'
            {
            match("message"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end Msg

    // $ANTLR start OpRule
    public final void mOpRule() throws RecognitionException {
        try {
            int _type = OpRule;
            // /../../media/sda1/ids/src/compiler/BusinessRule.g:144:8: ( 'AND' | 'OR' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='A') ) {
                alt2=1;
            }
            else if ( (LA2_0=='O') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("144:1: OpRule : ( 'AND' | 'OR' );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /../../media/sda1/ids/src/compiler/BusinessRule.g:144:10: 'AND'
                    {
                    match("AND"); 


                    }
                    break;
                case 2 :
                    // /../../media/sda1/ids/src/compiler/BusinessRule.g:144:16: 'OR'
                    {
                    match("OR"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end OpRule

    // $ANTLR start OpBool
    public final void mOpBool() throws RecognitionException {
        try {
            int _type = OpBool;
            // /../../media/sda1/ids/src/compiler/BusinessRule.g:146:8: ( '||' | '&&' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='|') ) {
                alt3=1;
            }
            else if ( (LA3_0=='&') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("146:1: OpBool : ( '||' | '&&' );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /../../media/sda1/ids/src/compiler/BusinessRule.g:146:10: '||'
                    {
                    match("||"); 


                    }
                    break;
                case 2 :
                    // /../../media/sda1/ids/src/compiler/BusinessRule.g:146:15: '&&'
                    {
                    match("&&"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end OpBool

    // $ANTLR start OpA
    public final void mOpA() throws RecognitionException {
        try {
            int _type = OpA;
            // /../../media/sda1/ids/src/compiler/BusinessRule.g:148:5: ( '+' | '-' )
            // /../../media/sda1/ids/src/compiler/BusinessRule.g:
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end OpA

    // $ANTLR start OpM
    public final void mOpM() throws RecognitionException {
        try {
            int _type = OpM;
            // /../../media/sda1/ids/src/compiler/BusinessRule.g:150:5: ( '*' | '/' )
            // /../../media/sda1/ids/src/compiler/BusinessRule.g:
            {
            if ( input.LA(1)=='*'||input.LA(1)=='/' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end OpM

    // $ANTLR start Conf
    public final void mConf() throws RecognitionException {
        try {
            int _type = Conf;
            // /../../media/sda1/ids/src/compiler/BusinessRule.g:152:6: ( '<' | '>' | '<=' | '>=' )
            int alt4=4;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='<') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='=') ) {
                    alt4=3;
                }
                else {
                    alt4=1;}
            }
            else if ( (LA4_0=='>') ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2=='=') ) {
                    alt4=4;
                }
                else {
                    alt4=2;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("152:1: Conf : ( '<' | '>' | '<=' | '>=' );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /../../media/sda1/ids/src/compiler/BusinessRule.g:152:8: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 2 :
                    // /../../media/sda1/ids/src/compiler/BusinessRule.g:152:12: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 3 :
                    // /../../media/sda1/ids/src/compiler/BusinessRule.g:152:16: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 4 :
                    // /../../media/sda1/ids/src/compiler/BusinessRule.g:152:21: '>='
                    {
                    match(">="); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end Conf

    // $ANTLR start Bconf
    public final void mBconf() throws RecognitionException {
        try {
            int _type = Bconf;
            // /../../media/sda1/ids/src/compiler/BusinessRule.g:154:7: ( '=' | '!=' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='=') ) {
                alt5=1;
            }
            else if ( (LA5_0=='!') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("154:1: Bconf : ( '=' | '!=' );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /../../media/sda1/ids/src/compiler/BusinessRule.g:154:9: '='
                    {
                    match('='); 

                    }
                    break;
                case 2 :
                    // /../../media/sda1/ids/src/compiler/BusinessRule.g:154:13: '!='
                    {
                    match("!="); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end Bconf

    // $ANTLR start STRING
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            // /../../media/sda1/ids/src/compiler/BusinessRule.g:156:8: ( '\"' ( CHAR | ' ' )* '\"' )
            // /../../media/sda1/ids/src/compiler/BusinessRule.g:156:10: '\"' ( CHAR | ' ' )* '\"'
            {
            match('\"'); 
            // /../../media/sda1/ids/src/compiler/BusinessRule.g:156:13: ( CHAR | ' ' )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }
                else if ( (LA6_0==' ') ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // /../../media/sda1/ids/src/compiler/BusinessRule.g:156:14: CHAR
            	    {
            	    mCHAR(); 

            	    }
            	    break;
            	case 2 :
            	    // /../../media/sda1/ids/src/compiler/BusinessRule.g:156:19: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match('\"'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STRING

    // $ANTLR start BOOL
    public final void mBOOL() throws RecognitionException {
        try {
            int _type = BOOL;
            // /../../media/sda1/ids/src/compiler/BusinessRule.g:158:6: ( 'true' | 'false' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='t') ) {
                alt7=1;
            }
            else if ( (LA7_0=='f') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("158:1: BOOL : ( 'true' | 'false' );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /../../media/sda1/ids/src/compiler/BusinessRule.g:158:8: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // /../../media/sda1/ids/src/compiler/BusinessRule.g:158:15: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BOOL

    // $ANTLR start FLOAT
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            // /../../media/sda1/ids/src/compiler/BusinessRule.g:160:7: ( ( '~' )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
            // /../../media/sda1/ids/src/compiler/BusinessRule.g:160:9: ( '~' )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
            {
            // /../../media/sda1/ids/src/compiler/BusinessRule.g:160:9: ( '~' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='~') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /../../media/sda1/ids/src/compiler/BusinessRule.g:160:10: '~'
                    {
                    match('~'); 

                    }
                    break;

            }

            // /../../media/sda1/ids/src/compiler/BusinessRule.g:160:15: ( '0' .. '9' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /../../media/sda1/ids/src/compiler/BusinessRule.g:160:16: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            // /../../media/sda1/ids/src/compiler/BusinessRule.g:160:26: ( '.' ( '0' .. '9' )+ )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='.') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /../../media/sda1/ids/src/compiler/BusinessRule.g:160:27: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // /../../media/sda1/ids/src/compiler/BusinessRule.g:160:30: ( '0' .. '9' )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /../../media/sda1/ids/src/compiler/BusinessRule.g:160:31: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

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


                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FLOAT

    // $ANTLR start FIELD
    public final void mFIELD() throws RecognitionException {
        try {
            int _type = FIELD;
            // /../../media/sda1/ids/src/compiler/BusinessRule.g:162:7: ( SUBFIELD ( '.' SUBFIELD )* )
            // /../../media/sda1/ids/src/compiler/BusinessRule.g:162:9: SUBFIELD ( '.' SUBFIELD )*
            {
            mSUBFIELD(); 
            // /../../media/sda1/ids/src/compiler/BusinessRule.g:162:17: ( '.' SUBFIELD )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='.') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /../../media/sda1/ids/src/compiler/BusinessRule.g:162:18: '.' SUBFIELD
            	    {
            	    match('.'); 
            	    mSUBFIELD(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FIELD

    // $ANTLR start WHITESPACE
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            // /../../media/sda1/ids/src/compiler/BusinessRule.g:164:12: ( ( ' ' | '\\n' | '\\t' | '\\r' )+ )
            // /../../media/sda1/ids/src/compiler/BusinessRule.g:164:14: ( ' ' | '\\n' | '\\t' | '\\r' )+
            {
            // /../../media/sda1/ids/src/compiler/BusinessRule.g:164:14: ( ' ' | '\\n' | '\\t' | '\\r' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /../../media/sda1/ids/src/compiler/BusinessRule.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

             skip();

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WHITESPACE

    // $ANTLR start SUBFIELD
    public final void mSUBFIELD() throws RecognitionException {
        try {
            // /../../media/sda1/ids/src/compiler/BusinessRule.g:166:19: ( CHAR ( CHAR | ( '0' .. '9' ) )* )
            // /../../media/sda1/ids/src/compiler/BusinessRule.g:166:21: CHAR ( CHAR | ( '0' .. '9' ) )*
            {
            mCHAR(); 
            // /../../media/sda1/ids/src/compiler/BusinessRule.g:166:25: ( CHAR | ( '0' .. '9' ) )*
            loop14:
            do {
                int alt14=3;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='z')) ) {
                    alt14=1;
                }
                else if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                    alt14=2;
                }


                switch (alt14) {
            	case 1 :
            	    // /../../media/sda1/ids/src/compiler/BusinessRule.g:166:26: CHAR
            	    {
            	    mCHAR(); 

            	    }
            	    break;
            	case 2 :
            	    // /../../media/sda1/ids/src/compiler/BusinessRule.g:166:31: ( '0' .. '9' )
            	    {
            	    // /../../media/sda1/ids/src/compiler/BusinessRule.g:166:31: ( '0' .. '9' )
            	    // /../../media/sda1/ids/src/compiler/BusinessRule.g:166:32: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end SUBFIELD

    // $ANTLR start CHAR
    public final void mCHAR() throws RecognitionException {
        try {
            // /../../media/sda1/ids/src/compiler/BusinessRule.g:168:15: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | '_' )
            int alt15=3;
            switch ( input.LA(1) ) {
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
                alt15=1;
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
                {
                alt15=2;
                }
                break;
            case '_':
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("168:10: fragment CHAR : ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | '_' );", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // /../../media/sda1/ids/src/compiler/BusinessRule.g:168:17: ( 'a' .. 'z' )
                    {
                    // /../../media/sda1/ids/src/compiler/BusinessRule.g:168:17: ( 'a' .. 'z' )
                    // /../../media/sda1/ids/src/compiler/BusinessRule.g:168:18: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }


                    }
                    break;
                case 2 :
                    // /../../media/sda1/ids/src/compiler/BusinessRule.g:168:28: ( 'A' .. 'Z' )
                    {
                    // /../../media/sda1/ids/src/compiler/BusinessRule.g:168:28: ( 'A' .. 'Z' )
                    // /../../media/sda1/ids/src/compiler/BusinessRule.g:168:29: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }


                    }
                    break;
                case 3 :
                    // /../../media/sda1/ids/src/compiler/BusinessRule.g:168:39: '_'
                    {
                    match('_'); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end CHAR

    public void mTokens() throws RecognitionException {
        // /../../media/sda1/ids/src/compiler/BusinessRule.g:1:8: ( T21 | T22 | FlFun | BoFun | Count | Msg | OpRule | OpBool | OpA | OpM | Conf | Bconf | STRING | BOOL | FLOAT | FIELD | WHITESPACE )
        int alt16=17;
        switch ( input.LA(1) ) {
        case '(':
            {
            alt16=1;
            }
            break;
        case ')':
            {
            alt16=2;
            }
            break;
        case 'S':
            {
            int LA16_3 = input.LA(2);

            if ( (LA16_3=='U') ) {
                int LA16_20 = input.LA(3);

                if ( (LA16_20=='M') ) {
                    int LA16_29 = input.LA(4);

                    if ( (LA16_29=='.'||(LA16_29>='0' && LA16_29<='9')||(LA16_29>='A' && LA16_29<='Z')||LA16_29=='_'||(LA16_29>='a' && LA16_29<='z')) ) {
                        alt16=16;
                    }
                    else {
                        alt16=3;}
                }
                else {
                    alt16=16;}
            }
            else {
                alt16=16;}
            }
            break;
        case 'A':
            {
            switch ( input.LA(2) ) {
            case 'V':
                {
                int LA16_21 = input.LA(3);

                if ( (LA16_21=='G') ) {
                    int LA16_30 = input.LA(4);

                    if ( (LA16_30=='.'||(LA16_30>='0' && LA16_30<='9')||(LA16_30>='A' && LA16_30<='Z')||LA16_30=='_'||(LA16_30>='a' && LA16_30<='z')) ) {
                        alt16=16;
                    }
                    else {
                        alt16=3;}
                }
                else {
                    alt16=16;}
                }
                break;
            case 'N':
                {
                int LA16_22 = input.LA(3);

                if ( (LA16_22=='D') ) {
                    int LA16_31 = input.LA(4);

                    if ( (LA16_31=='.'||(LA16_31>='0' && LA16_31<='9')||(LA16_31>='A' && LA16_31<='Z')||LA16_31=='_'||(LA16_31>='a' && LA16_31<='z')) ) {
                        alt16=16;
                    }
                    else {
                        alt16=7;}
                }
                else {
                    alt16=16;}
                }
                break;
            default:
                alt16=16;}

            }
            break;
        case 'N':
            {
            int LA16_5 = input.LA(2);

            if ( (LA16_5=='O') ) {
                int LA16_23 = input.LA(3);

                if ( (LA16_23=='T') ) {
                    int LA16_32 = input.LA(4);

                    if ( (LA16_32=='.'||(LA16_32>='0' && LA16_32<='9')||(LA16_32>='A' && LA16_32<='Z')||LA16_32=='_'||(LA16_32>='a' && LA16_32<='z')) ) {
                        alt16=16;
                    }
                    else {
                        alt16=4;}
                }
                else {
                    alt16=16;}
            }
            else {
                alt16=16;}
            }
            break;
        case 'C':
            {
            int LA16_6 = input.LA(2);

            if ( (LA16_6=='O') ) {
                int LA16_24 = input.LA(3);

                if ( (LA16_24=='U') ) {
                    int LA16_33 = input.LA(4);

                    if ( (LA16_33=='N') ) {
                        int LA16_40 = input.LA(5);

                        if ( (LA16_40=='T') ) {
                            int LA16_44 = input.LA(6);

                            if ( (LA16_44=='.'||(LA16_44>='0' && LA16_44<='9')||(LA16_44>='A' && LA16_44<='Z')||LA16_44=='_'||(LA16_44>='a' && LA16_44<='z')) ) {
                                alt16=16;
                            }
                            else {
                                alt16=5;}
                        }
                        else {
                            alt16=16;}
                    }
                    else {
                        alt16=16;}
                }
                else {
                    alt16=16;}
            }
            else {
                alt16=16;}
            }
            break;
        case 'm':
            {
            int LA16_7 = input.LA(2);

            if ( (LA16_7=='e') ) {
                int LA16_25 = input.LA(3);

                if ( (LA16_25=='s') ) {
                    int LA16_34 = input.LA(4);

                    if ( (LA16_34=='s') ) {
                        int LA16_41 = input.LA(5);

                        if ( (LA16_41=='a') ) {
                            int LA16_45 = input.LA(6);

                            if ( (LA16_45=='g') ) {
                                int LA16_49 = input.LA(7);

                                if ( (LA16_49=='e') ) {
                                    int LA16_50 = input.LA(8);

                                    if ( (LA16_50=='.'||(LA16_50>='0' && LA16_50<='9')||(LA16_50>='A' && LA16_50<='Z')||LA16_50=='_'||(LA16_50>='a' && LA16_50<='z')) ) {
                                        alt16=16;
                                    }
                                    else {
                                        alt16=6;}
                                }
                                else {
                                    alt16=16;}
                            }
                            else {
                                alt16=16;}
                        }
                        else {
                            alt16=16;}
                    }
                    else {
                        alt16=16;}
                }
                else {
                    alt16=16;}
            }
            else {
                alt16=16;}
            }
            break;
        case 'O':
            {
            int LA16_8 = input.LA(2);

            if ( (LA16_8=='R') ) {
                int LA16_26 = input.LA(3);

                if ( (LA16_26=='.'||(LA16_26>='0' && LA16_26<='9')||(LA16_26>='A' && LA16_26<='Z')||LA16_26=='_'||(LA16_26>='a' && LA16_26<='z')) ) {
                    alt16=16;
                }
                else {
                    alt16=7;}
            }
            else {
                alt16=16;}
            }
            break;
        case '&':
        case '|':
            {
            alt16=8;
            }
            break;
        case '+':
        case '-':
            {
            alt16=9;
            }
            break;
        case '*':
        case '/':
            {
            alt16=10;
            }
            break;
        case '<':
        case '>':
            {
            alt16=11;
            }
            break;
        case '!':
        case '=':
            {
            alt16=12;
            }
            break;
        case '\"':
            {
            alt16=13;
            }
            break;
        case 't':
            {
            int LA16_15 = input.LA(2);

            if ( (LA16_15=='r') ) {
                int LA16_27 = input.LA(3);

                if ( (LA16_27=='u') ) {
                    int LA16_36 = input.LA(4);

                    if ( (LA16_36=='e') ) {
                        int LA16_42 = input.LA(5);

                        if ( (LA16_42=='.'||(LA16_42>='0' && LA16_42<='9')||(LA16_42>='A' && LA16_42<='Z')||LA16_42=='_'||(LA16_42>='a' && LA16_42<='z')) ) {
                            alt16=16;
                        }
                        else {
                            alt16=14;}
                    }
                    else {
                        alt16=16;}
                }
                else {
                    alt16=16;}
            }
            else {
                alt16=16;}
            }
            break;
        case 'f':
            {
            int LA16_16 = input.LA(2);

            if ( (LA16_16=='a') ) {
                int LA16_28 = input.LA(3);

                if ( (LA16_28=='l') ) {
                    int LA16_37 = input.LA(4);

                    if ( (LA16_37=='s') ) {
                        int LA16_43 = input.LA(5);

                        if ( (LA16_43=='e') ) {
                            int LA16_47 = input.LA(6);

                            if ( (LA16_47=='.'||(LA16_47>='0' && LA16_47<='9')||(LA16_47>='A' && LA16_47<='Z')||LA16_47=='_'||(LA16_47>='a' && LA16_47<='z')) ) {
                                alt16=16;
                            }
                            else {
                                alt16=14;}
                        }
                        else {
                            alt16=16;}
                    }
                    else {
                        alt16=16;}
                }
                else {
                    alt16=16;}
            }
            else {
                alt16=16;}
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
        case '~':
            {
            alt16=15;
            }
            break;
        case 'B':
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
        case 'P':
        case 'Q':
        case 'R':
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
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt16=16;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt16=17;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T21 | T22 | FlFun | BoFun | Count | Msg | OpRule | OpBool | OpA | OpM | Conf | Bconf | STRING | BOOL | FLOAT | FIELD | WHITESPACE );", 16, 0, input);

            throw nvae;
        }

        switch (alt16) {
            case 1 :
                // /../../media/sda1/ids/src/compiler/BusinessRule.g:1:10: T21
                {
                mT21(); 

                }
                break;
            case 2 :
                // /../../media/sda1/ids/src/compiler/BusinessRule.g:1:14: T22
                {
                mT22(); 

                }
                break;
            case 3 :
                // /../../media/sda1/ids/src/compiler/BusinessRule.g:1:18: FlFun
                {
                mFlFun(); 

                }
                break;
            case 4 :
                // /../../media/sda1/ids/src/compiler/BusinessRule.g:1:24: BoFun
                {
                mBoFun(); 

                }
                break;
            case 5 :
                // /../../media/sda1/ids/src/compiler/BusinessRule.g:1:30: Count
                {
                mCount(); 

                }
                break;
            case 6 :
                // /../../media/sda1/ids/src/compiler/BusinessRule.g:1:36: Msg
                {
                mMsg(); 

                }
                break;
            case 7 :
                // /../../media/sda1/ids/src/compiler/BusinessRule.g:1:40: OpRule
                {
                mOpRule(); 

                }
                break;
            case 8 :
                // /../../media/sda1/ids/src/compiler/BusinessRule.g:1:47: OpBool
                {
                mOpBool(); 

                }
                break;
            case 9 :
                // /../../media/sda1/ids/src/compiler/BusinessRule.g:1:54: OpA
                {
                mOpA(); 

                }
                break;
            case 10 :
                // /../../media/sda1/ids/src/compiler/BusinessRule.g:1:58: OpM
                {
                mOpM(); 

                }
                break;
            case 11 :
                // /../../media/sda1/ids/src/compiler/BusinessRule.g:1:62: Conf
                {
                mConf(); 

                }
                break;
            case 12 :
                // /../../media/sda1/ids/src/compiler/BusinessRule.g:1:67: Bconf
                {
                mBconf(); 

                }
                break;
            case 13 :
                // /../../media/sda1/ids/src/compiler/BusinessRule.g:1:73: STRING
                {
                mSTRING(); 

                }
                break;
            case 14 :
                // /../../media/sda1/ids/src/compiler/BusinessRule.g:1:80: BOOL
                {
                mBOOL(); 

                }
                break;
            case 15 :
                // /../../media/sda1/ids/src/compiler/BusinessRule.g:1:85: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 16 :
                // /../../media/sda1/ids/src/compiler/BusinessRule.g:1:91: FIELD
                {
                mFIELD(); 

                }
                break;
            case 17 :
                // /../../media/sda1/ids/src/compiler/BusinessRule.g:1:97: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;

        }

    }


 

}
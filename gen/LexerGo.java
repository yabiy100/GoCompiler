// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LexerGo extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMMENT=2, BIG_COMMENT=3, PACKAGE=4, IMPORT=5, FUNC=6, L_BRACKET=7, 
		R_BRACKET=8, L_BRACE=9, R_BRACE=10, COMMA=11, POINT=12, EQUALS=13, IF=14, 
		ELSE=15, RETURN=16, TYPE=17, NUMBER=18, INT=19, FLOAT64=20, STRING=21, 
		VAR=22, NEWLINE=23, MULT=24, NOT=25, PLUS=26, MINUS=27, COMPAIR=28, LOGICAL_AND=29, 
		LOGICAL_OR=30, BOOLEAN=31, IDENTIFIER=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "COMMENT", "BIG_COMMENT", "PACKAGE", "IMPORT", "FUNC", "L_BRACKET", 
			"R_BRACKET", "L_BRACE", "R_BRACE", "COMMA", "POINT", "EQUALS", "IF", 
			"ELSE", "RETURN", "TYPE", "NUMBER", "INT", "FLOAT64", "STRING", "VAR", 
			"NEWLINE", "MULT", "NOT", "PLUS", "MINUS", "COMPAIR", "LOGICAL_AND", 
			"LOGICAL_OR", "BOOLEAN", "IDENTIFIER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'package'", "'import'", "'func'", "'{'", "'}'", 
			"'('", "')'", "','", "'.'", "'='", "'if'", "'else'", "'return'", null, 
			null, null, null, null, "'var'", null, null, "'!'", "'+'", "'-'", null, 
			"'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMMENT", "BIG_COMMENT", "PACKAGE", "IMPORT", "FUNC", "L_BRACKET", 
			"R_BRACKET", "L_BRACE", "R_BRACE", "COMMA", "POINT", "EQUALS", "IF", 
			"ELSE", "RETURN", "TYPE", "NUMBER", "INT", "FLOAT64", "STRING", "VAR", 
			"NEWLINE", "MULT", "NOT", "PLUS", "MINUS", "COMPAIR", "LOGICAL_AND", 
			"LOGICAL_OR", "BOOLEAN", "IDENTIFIER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public LexerGo(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LexerGo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000 \u00f9\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001I\b"+
		"\u0001\n\u0001\f\u0001L\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002U\b\u0002\n\u0002"+
		"\f\u0002X\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00a7\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u00ab\b\u0011\u0001\u0012\u0004\u0012\u00ae\b"+
		"\u0012\u000b\u0012\f\u0012\u00af\u0001\u0013\u0004\u0013\u00b3\b\u0013"+
		"\u000b\u0013\f\u0013\u00b4\u0001\u0013\u0001\u0013\u0004\u0013\u00b9\b"+
		"\u0013\u000b\u0013\f\u0013\u00ba\u0001\u0014\u0001\u0014\u0005\u0014\u00bf"+
		"\b\u0014\n\u0014\f\u0014\u00c2\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u00cd\b\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u00e0\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u00f1\b\u001e\u0001\u001f\u0001\u001f\u0005\u001f\u00f5\b"+
		"\u001f\n\u001f\f\u001f\u00f8\t\u001f\u0002JV\u0000 \u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a"+
		"5\u001b7\u001c9\u001d;\u001e=\u001f? \u0001\u0000\b\u0002\u0000\t\t  "+
		"\u0001\u000009\u0001\u0000 ~\u0002\u0000\n\n\r\r\u0003\u0000%%**//\u0002"+
		"\u0000<<>>\u0002\u0000AZaz\u0004\u000009AZ__az\u0109\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000"+
		"\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005"+
		"\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000"+
		"\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000"+
		"\u0000?\u0001\u0000\u0000\u0000\u0001A\u0001\u0000\u0000\u0000\u0003E"+
		"\u0001\u0000\u0000\u0000\u0005Q\u0001\u0000\u0000\u0000\u0007^\u0001\u0000"+
		"\u0000\u0000\tf\u0001\u0000\u0000\u0000\u000bm\u0001\u0000\u0000\u0000"+
		"\rr\u0001\u0000\u0000\u0000\u000ft\u0001\u0000\u0000\u0000\u0011v\u0001"+
		"\u0000\u0000\u0000\u0013x\u0001\u0000\u0000\u0000\u0015z\u0001\u0000\u0000"+
		"\u0000\u0017|\u0001\u0000\u0000\u0000\u0019~\u0001\u0000\u0000\u0000\u001b"+
		"\u0080\u0001\u0000\u0000\u0000\u001d\u0083\u0001\u0000\u0000\u0000\u001f"+
		"\u0088\u0001\u0000\u0000\u0000!\u00a6\u0001\u0000\u0000\u0000#\u00aa\u0001"+
		"\u0000\u0000\u0000%\u00ad\u0001\u0000\u0000\u0000\'\u00b2\u0001\u0000"+
		"\u0000\u0000)\u00bc\u0001\u0000\u0000\u0000+\u00c5\u0001\u0000\u0000\u0000"+
		"-\u00cc\u0001\u0000\u0000\u0000/\u00ce\u0001\u0000\u0000\u00001\u00d0"+
		"\u0001\u0000\u0000\u00003\u00d2\u0001\u0000\u0000\u00005\u00d4\u0001\u0000"+
		"\u0000\u00007\u00df\u0001\u0000\u0000\u00009\u00e1\u0001\u0000\u0000\u0000"+
		";\u00e4\u0001\u0000\u0000\u0000=\u00f0\u0001\u0000\u0000\u0000?\u00f2"+
		"\u0001\u0000\u0000\u0000AB\u0007\u0000\u0000\u0000BC\u0001\u0000\u0000"+
		"\u0000CD\u0006\u0000\u0000\u0000D\u0002\u0001\u0000\u0000\u0000EF\u0005"+
		"/\u0000\u0000FJ\u0005/\u0000\u0000GI\t\u0000\u0000\u0000HG\u0001\u0000"+
		"\u0000\u0000IL\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000JH\u0001"+
		"\u0000\u0000\u0000KM\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000"+
		"MN\u0005\n\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0006\u0001\u0000\u0000"+
		"P\u0004\u0001\u0000\u0000\u0000QR\u0005/\u0000\u0000RV\u0005*\u0000\u0000"+
		"SU\t\u0000\u0000\u0000TS\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000"+
		"VW\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000WY\u0001\u0000\u0000"+
		"\u0000XV\u0001\u0000\u0000\u0000YZ\u0005*\u0000\u0000Z[\u0005/\u0000\u0000"+
		"[\\\u0001\u0000\u0000\u0000\\]\u0006\u0002\u0000\u0000]\u0006\u0001\u0000"+
		"\u0000\u0000^_\u0005p\u0000\u0000_`\u0005a\u0000\u0000`a\u0005c\u0000"+
		"\u0000ab\u0005k\u0000\u0000bc\u0005a\u0000\u0000cd\u0005g\u0000\u0000"+
		"de\u0005e\u0000\u0000e\b\u0001\u0000\u0000\u0000fg\u0005i\u0000\u0000"+
		"gh\u0005m\u0000\u0000hi\u0005p\u0000\u0000ij\u0005o\u0000\u0000jk\u0005"+
		"r\u0000\u0000kl\u0005t\u0000\u0000l\n\u0001\u0000\u0000\u0000mn\u0005"+
		"f\u0000\u0000no\u0005u\u0000\u0000op\u0005n\u0000\u0000pq\u0005c\u0000"+
		"\u0000q\f\u0001\u0000\u0000\u0000rs\u0005{\u0000\u0000s\u000e\u0001\u0000"+
		"\u0000\u0000tu\u0005}\u0000\u0000u\u0010\u0001\u0000\u0000\u0000vw\u0005"+
		"(\u0000\u0000w\u0012\u0001\u0000\u0000\u0000xy\u0005)\u0000\u0000y\u0014"+
		"\u0001\u0000\u0000\u0000z{\u0005,\u0000\u0000{\u0016\u0001\u0000\u0000"+
		"\u0000|}\u0005.\u0000\u0000}\u0018\u0001\u0000\u0000\u0000~\u007f\u0005"+
		"=\u0000\u0000\u007f\u001a\u0001\u0000\u0000\u0000\u0080\u0081\u0005i\u0000"+
		"\u0000\u0081\u0082\u0005f\u0000\u0000\u0082\u001c\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0005e\u0000\u0000\u0084\u0085\u0005l\u0000\u0000\u0085\u0086"+
		"\u0005s\u0000\u0000\u0086\u0087\u0005e\u0000\u0000\u0087\u001e\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0005r\u0000\u0000\u0089\u008a\u0005e\u0000\u0000"+
		"\u008a\u008b\u0005t\u0000\u0000\u008b\u008c\u0005u\u0000\u0000\u008c\u008d"+
		"\u0005r\u0000\u0000\u008d\u008e\u0005n\u0000\u0000\u008e \u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0005i\u0000\u0000\u0090\u0091\u0005n\u0000\u0000"+
		"\u0091\u00a7\u0005t\u0000\u0000\u0092\u0093\u0005f\u0000\u0000\u0093\u0094"+
		"\u0005l\u0000\u0000\u0094\u0095\u0005o\u0000\u0000\u0095\u0096\u0005a"+
		"\u0000\u0000\u0096\u0097\u0005t\u0000\u0000\u0097\u0098\u00056\u0000\u0000"+
		"\u0098\u00a7\u00054\u0000\u0000\u0099\u009a\u0005s\u0000\u0000\u009a\u009b"+
		"\u0005t\u0000\u0000\u009b\u009c\u0005r\u0000\u0000\u009c\u009d\u0005i"+
		"\u0000\u0000\u009d\u009e\u0005n\u0000\u0000\u009e\u00a7\u0005g\u0000\u0000"+
		"\u009f\u00a0\u0005b\u0000\u0000\u00a0\u00a1\u0005o\u0000\u0000\u00a1\u00a2"+
		"\u0005o\u0000\u0000\u00a2\u00a3\u0005l\u0000\u0000\u00a3\u00a4\u0005e"+
		"\u0000\u0000\u00a4\u00a5\u0005a\u0000\u0000\u00a5\u00a7\u0005n\u0000\u0000"+
		"\u00a6\u008f\u0001\u0000\u0000\u0000\u00a6\u0092\u0001\u0000\u0000\u0000"+
		"\u00a6\u0099\u0001\u0000\u0000\u0000\u00a6\u009f\u0001\u0000\u0000\u0000"+
		"\u00a7\"\u0001\u0000\u0000\u0000\u00a8\u00ab\u0003%\u0012\u0000\u00a9"+
		"\u00ab\u0003\'\u0013\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00a9"+
		"\u0001\u0000\u0000\u0000\u00ab$\u0001\u0000\u0000\u0000\u00ac\u00ae\u0007"+
		"\u0001\u0000\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001"+
		"\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b0&\u0001\u0000\u0000\u0000\u00b1\u00b3\u0007\u0001"+
		"\u0000\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b8\u0005.\u0000"+
		"\u0000\u00b7\u00b9\u0007\u0001\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb(\u0001\u0000\u0000\u0000"+
		"\u00bc\u00c0\u0005\"\u0000\u0000\u00bd\u00bf\u0007\u0002\u0000\u0000\u00be"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0"+
		"\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c4\u0005\"\u0000\u0000\u00c4*\u0001\u0000\u0000\u0000\u00c5\u00c6"+
		"\u0005v\u0000\u0000\u00c6\u00c7\u0005a\u0000\u0000\u00c7\u00c8\u0005r"+
		"\u0000\u0000\u00c8,\u0001\u0000\u0000\u0000\u00c9\u00cd\u0007\u0003\u0000"+
		"\u0000\u00ca\u00cb\u0005\r\u0000\u0000\u00cb\u00cd\u0005\n\u0000\u0000"+
		"\u00cc\u00c9\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000"+
		"\u00cd.\u0001\u0000\u0000\u0000\u00ce\u00cf\u0007\u0004\u0000\u0000\u00cf"+
		"0\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005!\u0000\u0000\u00d12\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d3\u0005+\u0000\u0000\u00d34\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d5\u0005-\u0000\u0000\u00d56\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d7\u0005!\u0000\u0000\u00d7\u00e0\u0005=\u0000\u0000\u00d8\u00d9\u0005"+
		"=\u0000\u0000\u00d9\u00e0\u0005=\u0000\u0000\u00da\u00e0\u0007\u0005\u0000"+
		"\u0000\u00db\u00dc\u0005<\u0000\u0000\u00dc\u00e0\u0005=\u0000\u0000\u00dd"+
		"\u00de\u0005>\u0000\u0000\u00de\u00e0\u0005=\u0000\u0000\u00df\u00d6\u0001"+
		"\u0000\u0000\u0000\u00df\u00d8\u0001\u0000\u0000\u0000\u00df\u00da\u0001"+
		"\u0000\u0000\u0000\u00df\u00db\u0001\u0000\u0000\u0000\u00df\u00dd\u0001"+
		"\u0000\u0000\u0000\u00e08\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005&\u0000"+
		"\u0000\u00e2\u00e3\u0005&\u0000\u0000\u00e3:\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e5\u0005|\u0000\u0000\u00e5\u00e6\u0005|\u0000\u0000\u00e6<\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e8\u0005t\u0000\u0000\u00e8\u00e9\u0005r\u0000"+
		"\u0000\u00e9\u00ea\u0005u\u0000\u0000\u00ea\u00f1\u0005e\u0000\u0000\u00eb"+
		"\u00ec\u0005f\u0000\u0000\u00ec\u00ed\u0005a\u0000\u0000\u00ed\u00ee\u0005"+
		"l\u0000\u0000\u00ee\u00ef\u0005s\u0000\u0000\u00ef\u00f1\u0005e\u0000"+
		"\u0000\u00f0\u00e7\u0001\u0000\u0000\u0000\u00f0\u00eb\u0001\u0000\u0000"+
		"\u0000\u00f1>\u0001\u0000\u0000\u0000\u00f2\u00f6\u0007\u0006\u0000\u0000"+
		"\u00f3\u00f5\u0007\u0007\u0000\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f8\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7@\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f6\u0001\u0000\u0000\u0000\r\u0000JV\u00a6\u00aa\u00af\u00b4\u00ba"+
		"\u00c0\u00cc\u00df\u00f0\u00f6\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
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
		PACKAGE=1, IMPORT=2, IMPORTNAME=3, FUNC=4, MAIN=5, L_BRACKET=6, R_BRACKET=7, 
		L_BRACE=8, R_BRACE=9, COMMA=10, WS=11, NEWLINE=12, INT=13, ADD=14, TYPE=15, 
		IDENTIFIER=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PACKAGE", "IMPORT", "IMPORTNAME", "FUNC", "MAIN", "L_BRACKET", "R_BRACKET", 
			"L_BRACE", "R_BRACE", "COMMA", "WS", "NEWLINE", "INT", "ADD", "TYPE", 
			"IDENTIFIER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'main'", "'{'", "'}'", "'('", null, null, 
			null, "'\\n'", null, "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PACKAGE", "IMPORT", "IMPORTNAME", "FUNC", "MAIN", "L_BRACKET", 
			"R_BRACKET", "L_BRACE", "R_BRACE", "COMMA", "WS", "NEWLINE", "INT", "ADD", 
			"TYPE", "IDENTIFIER"
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
		"\u0004\u0000\u0010{\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0004\fV\b\f\u000b\f\f\fW\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"s\b\u000e\u0001\u000f\u0001\u000f\u0005\u000fw\b\u000f\n\u000f\f\u000f"+
		"z\t\u000f\u0000\u0000\u0010\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010\u0001\u0000\u0004"+
		"\u0002\u0000\t\t  \u0001\u000009\u0001\u0000az\u0003\u000009__az\u007f"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0001!\u0001"+
		"\u0000\u0000\u0000\u0003+\u0001\u0000\u0000\u0000\u00054\u0001\u0000\u0000"+
		"\u0000\u00078\u0001\u0000\u0000\u0000\t?\u0001\u0000\u0000\u0000\u000b"+
		"D\u0001\u0000\u0000\u0000\rF\u0001\u0000\u0000\u0000\u000fH\u0001\u0000"+
		"\u0000\u0000\u0011J\u0001\u0000\u0000\u0000\u0013M\u0001\u0000\u0000\u0000"+
		"\u0015P\u0001\u0000\u0000\u0000\u0017R\u0001\u0000\u0000\u0000\u0019U"+
		"\u0001\u0000\u0000\u0000\u001bY\u0001\u0000\u0000\u0000\u001dr\u0001\u0000"+
		"\u0000\u0000\u001ft\u0001\u0000\u0000\u0000!\"\u0005p\u0000\u0000\"#\u0005"+
		"a\u0000\u0000#$\u0005c\u0000\u0000$%\u0005k\u0000\u0000%&\u0005a\u0000"+
		"\u0000&\'\u0005g\u0000\u0000\'(\u0005e\u0000\u0000()\u0001\u0000\u0000"+
		"\u0000)*\u0003\u0015\n\u0000*\u0002\u0001\u0000\u0000\u0000+,\u0005i\u0000"+
		"\u0000,-\u0005m\u0000\u0000-.\u0005p\u0000\u0000./\u0005o\u0000\u0000"+
		"/0\u0005r\u0000\u000001\u0005t\u0000\u000012\u0001\u0000\u0000\u00002"+
		"3\u0003\u0015\n\u00003\u0004\u0001\u0000\u0000\u000045\u0005\"\u0000\u0000"+
		"56\u0003\u001f\u000f\u000067\u0005\"\u0000\u00007\u0006\u0001\u0000\u0000"+
		"\u000089\u0005f\u0000\u00009:\u0005u\u0000\u0000:;\u0005n\u0000\u0000"+
		";<\u0005c\u0000\u0000<=\u0001\u0000\u0000\u0000=>\u0003\u0015\n\u0000"+
		">\b\u0001\u0000\u0000\u0000?@\u0005m\u0000\u0000@A\u0005a\u0000\u0000"+
		"AB\u0005i\u0000\u0000BC\u0005n\u0000\u0000C\n\u0001\u0000\u0000\u0000"+
		"DE\u0005{\u0000\u0000E\f\u0001\u0000\u0000\u0000FG\u0005}\u0000\u0000"+
		"G\u000e\u0001\u0000\u0000\u0000HI\u0005(\u0000\u0000I\u0010\u0001\u0000"+
		"\u0000\u0000JK\u0005)\u0000\u0000KL\u0003\u0015\n\u0000L\u0012\u0001\u0000"+
		"\u0000\u0000MN\u0005,\u0000\u0000NO\u0003\u0015\n\u0000O\u0014\u0001\u0000"+
		"\u0000\u0000PQ\u0007\u0000\u0000\u0000Q\u0016\u0001\u0000\u0000\u0000"+
		"RS\u0005\n\u0000\u0000S\u0018\u0001\u0000\u0000\u0000TV\u0007\u0001\u0000"+
		"\u0000UT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WU\u0001\u0000"+
		"\u0000\u0000WX\u0001\u0000\u0000\u0000X\u001a\u0001\u0000\u0000\u0000"+
		"YZ\u0005+\u0000\u0000Z\u001c\u0001\u0000\u0000\u0000[\\\u0005i\u0000\u0000"+
		"\\]\u0005n\u0000\u0000]s\u0005t\u0000\u0000^_\u0005f\u0000\u0000_`\u0005"+
		"l\u0000\u0000`a\u0005o\u0000\u0000ab\u0005a\u0000\u0000bc\u0005t\u0000"+
		"\u0000cd\u00056\u0000\u0000ds\u00054\u0000\u0000ef\u0005s\u0000\u0000"+
		"fg\u0005t\u0000\u0000gh\u0005r\u0000\u0000hi\u0005i\u0000\u0000ij\u0005"+
		"n\u0000\u0000js\u0005g\u0000\u0000kl\u0005b\u0000\u0000lm\u0005o\u0000"+
		"\u0000mn\u0005o\u0000\u0000no\u0005l\u0000\u0000op\u0005e\u0000\u0000"+
		"pq\u0005a\u0000\u0000qs\u0005n\u0000\u0000r[\u0001\u0000\u0000\u0000r"+
		"^\u0001\u0000\u0000\u0000re\u0001\u0000\u0000\u0000rk\u0001\u0000\u0000"+
		"\u0000s\u001e\u0001\u0000\u0000\u0000tx\u0007\u0002\u0000\u0000uw\u0007"+
		"\u0003\u0000\u0000vu\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000"+
		"xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y \u0001\u0000\u0000"+
		"\u0000zx\u0001\u0000\u0000\u0000\u0004\u0000Wrx\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
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
		WS=1, PACKAGE=2, IMPORT=3, IMPORTNAME=4, FUNC=5, L_BRACKET=6, R_BRACKET=7, 
		L_BRACE=8, R_BRACE=9, COMMA=10, NEWLINE=11, INT=12, ADD=13, TYPE=14, IDENTIFIER=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "PACKAGE", "IMPORT", "IMPORTNAME", "FUNC", "L_BRACKET", "R_BRACKET", 
			"L_BRACE", "R_BRACE", "COMMA", "NEWLINE", "INT", "ADD", "TYPE", "IDENTIFIER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'package'", "'import'", null, "'func'", "'{'", "'}'", "'('", 
			"')'", "','", null, null, "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "PACKAGE", "IMPORT", "IMPORTNAME", "FUNC", "L_BRACKET", "R_BRACKET", 
			"L_BRACE", "R_BRACE", "COMMA", "NEWLINE", "INT", "ADD", "TYPE", "IDENTIFIER"
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
		"\u0004\u0000\u000fw\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u00036\b\u0003\n\u0003"+
		"\f\u00039\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\n\u0003\nO\b\n\u0001\u000b\u0004\u000bR\b\u000b\u000b\u000b"+
		"\f\u000bS\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\ro\b\r\u0001\u000e\u0001\u000e\u0005\u000es\b\u000e\n\u000e\f\u000ev"+
		"\t\u000e\u0000\u0000\u000f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u0001\u0000\u0005\u0002\u0000\t\t "+
		" \u0001\u0000az\u0003\u000009__az\u0002\u0000\n\n\r\r\u0001\u000009}\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0001\u001f\u0001\u0000\u0000\u0000\u0003#\u0001"+
		"\u0000\u0000\u0000\u0005+\u0001\u0000\u0000\u0000\u00072\u0001\u0000\u0000"+
		"\u0000\t<\u0001\u0000\u0000\u0000\u000bA\u0001\u0000\u0000\u0000\rC\u0001"+
		"\u0000\u0000\u0000\u000fE\u0001\u0000\u0000\u0000\u0011G\u0001\u0000\u0000"+
		"\u0000\u0013I\u0001\u0000\u0000\u0000\u0015N\u0001\u0000\u0000\u0000\u0017"+
		"Q\u0001\u0000\u0000\u0000\u0019U\u0001\u0000\u0000\u0000\u001bn\u0001"+
		"\u0000\u0000\u0000\u001dp\u0001\u0000\u0000\u0000\u001f \u0007\u0000\u0000"+
		"\u0000 !\u0001\u0000\u0000\u0000!\"\u0006\u0000\u0000\u0000\"\u0002\u0001"+
		"\u0000\u0000\u0000#$\u0005p\u0000\u0000$%\u0005a\u0000\u0000%&\u0005c"+
		"\u0000\u0000&\'\u0005k\u0000\u0000\'(\u0005a\u0000\u0000()\u0005g\u0000"+
		"\u0000)*\u0005e\u0000\u0000*\u0004\u0001\u0000\u0000\u0000+,\u0005i\u0000"+
		"\u0000,-\u0005m\u0000\u0000-.\u0005p\u0000\u0000./\u0005o\u0000\u0000"+
		"/0\u0005r\u0000\u000001\u0005t\u0000\u00001\u0006\u0001\u0000\u0000\u0000"+
		"23\u0005\"\u0000\u000037\u0007\u0001\u0000\u000046\u0007\u0002\u0000\u0000"+
		"54\u0001\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001\u0000\u0000"+
		"\u000078\u0001\u0000\u0000\u00008:\u0001\u0000\u0000\u000097\u0001\u0000"+
		"\u0000\u0000:;\u0005\"\u0000\u0000;\b\u0001\u0000\u0000\u0000<=\u0005"+
		"f\u0000\u0000=>\u0005u\u0000\u0000>?\u0005n\u0000\u0000?@\u0005c\u0000"+
		"\u0000@\n\u0001\u0000\u0000\u0000AB\u0005{\u0000\u0000B\f\u0001\u0000"+
		"\u0000\u0000CD\u0005}\u0000\u0000D\u000e\u0001\u0000\u0000\u0000EF\u0005"+
		"(\u0000\u0000F\u0010\u0001\u0000\u0000\u0000GH\u0005)\u0000\u0000H\u0012"+
		"\u0001\u0000\u0000\u0000IJ\u0005,\u0000\u0000J\u0014\u0001\u0000\u0000"+
		"\u0000KO\u0007\u0003\u0000\u0000LM\u0005\r\u0000\u0000MO\u0005\n\u0000"+
		"\u0000NK\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000O\u0016\u0001"+
		"\u0000\u0000\u0000PR\u0007\u0004\u0000\u0000QP\u0001\u0000\u0000\u0000"+
		"RS\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000T\u0018\u0001\u0000\u0000\u0000UV\u0005+\u0000\u0000V\u001a\u0001"+
		"\u0000\u0000\u0000WX\u0005i\u0000\u0000XY\u0005n\u0000\u0000Yo\u0005t"+
		"\u0000\u0000Z[\u0005f\u0000\u0000[\\\u0005l\u0000\u0000\\]\u0005o\u0000"+
		"\u0000]^\u0005a\u0000\u0000^_\u0005t\u0000\u0000_`\u00056\u0000\u0000"+
		"`o\u00054\u0000\u0000ab\u0005s\u0000\u0000bc\u0005t\u0000\u0000cd\u0005"+
		"r\u0000\u0000de\u0005i\u0000\u0000ef\u0005n\u0000\u0000fo\u0005g\u0000"+
		"\u0000gh\u0005b\u0000\u0000hi\u0005o\u0000\u0000ij\u0005o\u0000\u0000"+
		"jk\u0005l\u0000\u0000kl\u0005e\u0000\u0000lm\u0005a\u0000\u0000mo\u0005"+
		"n\u0000\u0000nW\u0001\u0000\u0000\u0000nZ\u0001\u0000\u0000\u0000na\u0001"+
		"\u0000\u0000\u0000ng\u0001\u0000\u0000\u0000o\u001c\u0001\u0000\u0000"+
		"\u0000pt\u0007\u0001\u0000\u0000qs\u0007\u0002\u0000\u0000rq\u0001\u0000"+
		"\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001"+
		"\u0000\u0000\u0000u\u001e\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000"+
		"\u0000\u0006\u00007NSnt\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
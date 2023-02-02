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
		ELSE=15, FOR=16, RETURN=17, TYPE=18, NUMBER=19, INT=20, FLOAT64=21, STRING=22, 
		VAR=23, NEWLINE=24, MULT=25, NOT=26, PLUS=27, MINUS=28, COMPAIR=29, LOGICAL_AND=30, 
		LOGICAL_OR=31, BOOL=32, IDENTIFIER=33;
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
			"ELSE", "FOR", "RETURN", "TYPE", "NUMBER", "INT", "FLOAT64", "STRING", 
			"VAR", "NEWLINE", "MULT", "NOT", "PLUS", "MINUS", "COMPAIR", "LOGICAL_AND", 
			"LOGICAL_OR", "BOOL", "IDENTIFIER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'package'", "'import'", "'func'", "'{'", "'}'", 
			"'('", "')'", "','", "'.'", "'='", "'if'", "'else'", "'for'", "'return'", 
			null, null, null, null, null, "'var'", null, null, "'!'", "'+'", "'-'", 
			null, "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMMENT", "BIG_COMMENT", "PACKAGE", "IMPORT", "FUNC", "L_BRACKET", 
			"R_BRACKET", "L_BRACE", "R_BRACE", "COMMA", "POINT", "EQUALS", "IF", 
			"ELSE", "FOR", "RETURN", "TYPE", "NUMBER", "INT", "FLOAT64", "STRING", 
			"VAR", "NEWLINE", "MULT", "NOT", "PLUS", "MINUS", "COMPAIR", "LOGICAL_AND", 
			"LOGICAL_OR", "BOOL", "IDENTIFIER"
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
		"\u0004\u0000!\u00fc\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001K\b\u0001\n\u0001\f\u0001N\t\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002W\b"+
		"\u0002\n\u0002\f\u0002Z\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u00aa\b\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u00ae\b\u0012\u0001"+
		"\u0013\u0004\u0013\u00b1\b\u0013\u000b\u0013\f\u0013\u00b2\u0001\u0014"+
		"\u0004\u0014\u00b6\b\u0014\u000b\u0014\f\u0014\u00b7\u0001\u0014\u0001"+
		"\u0014\u0004\u0014\u00bc\b\u0014\u000b\u0014\f\u0014\u00bd\u0001\u0015"+
		"\u0001\u0015\u0005\u0015\u00c2\b\u0015\n\u0015\f\u0015\u00c5\t\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u00d0\b\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u00e3\b\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u00f4\b\u001f\u0001 \u0001"+
		" \u0005 \u00f8\b \n \f \u00fb\t \u0002LX\u0000!\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b"+
		"7\u001c9\u001d;\u001e=\u001f? A!\u0001\u0000\b\u0002\u0000\t\t  \u0001"+
		"\u000009\u0001\u0000 ~\u0002\u0000\n\n\r\r\u0003\u0000%%**//\u0002\u0000"+
		"<<>>\u0002\u0000AZaz\u0004\u000009AZ__az\u010c\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000"+
		"\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u0000"+
		"1\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001"+
		"\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000"+
		"\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000"+
		"?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0001C\u0001"+
		"\u0000\u0000\u0000\u0003G\u0001\u0000\u0000\u0000\u0005S\u0001\u0000\u0000"+
		"\u0000\u0007`\u0001\u0000\u0000\u0000\th\u0001\u0000\u0000\u0000\u000b"+
		"o\u0001\u0000\u0000\u0000\rt\u0001\u0000\u0000\u0000\u000fv\u0001\u0000"+
		"\u0000\u0000\u0011x\u0001\u0000\u0000\u0000\u0013z\u0001\u0000\u0000\u0000"+
		"\u0015|\u0001\u0000\u0000\u0000\u0017~\u0001\u0000\u0000\u0000\u0019\u0080"+
		"\u0001\u0000\u0000\u0000\u001b\u0082\u0001\u0000\u0000\u0000\u001d\u0085"+
		"\u0001\u0000\u0000\u0000\u001f\u008a\u0001\u0000\u0000\u0000!\u008e\u0001"+
		"\u0000\u0000\u0000#\u00a9\u0001\u0000\u0000\u0000%\u00ad\u0001\u0000\u0000"+
		"\u0000\'\u00b0\u0001\u0000\u0000\u0000)\u00b5\u0001\u0000\u0000\u0000"+
		"+\u00bf\u0001\u0000\u0000\u0000-\u00c8\u0001\u0000\u0000\u0000/\u00cf"+
		"\u0001\u0000\u0000\u00001\u00d1\u0001\u0000\u0000\u00003\u00d3\u0001\u0000"+
		"\u0000\u00005\u00d5\u0001\u0000\u0000\u00007\u00d7\u0001\u0000\u0000\u0000"+
		"9\u00e2\u0001\u0000\u0000\u0000;\u00e4\u0001\u0000\u0000\u0000=\u00e7"+
		"\u0001\u0000\u0000\u0000?\u00f3\u0001\u0000\u0000\u0000A\u00f5\u0001\u0000"+
		"\u0000\u0000CD\u0007\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EF\u0006"+
		"\u0000\u0000\u0000F\u0002\u0001\u0000\u0000\u0000GH\u0005/\u0000\u0000"+
		"HL\u0005/\u0000\u0000IK\t\u0000\u0000\u0000JI\u0001\u0000\u0000\u0000"+
		"KN\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000"+
		"\u0000MO\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000OP\u0005\n\u0000"+
		"\u0000PQ\u0001\u0000\u0000\u0000QR\u0006\u0001\u0000\u0000R\u0004\u0001"+
		"\u0000\u0000\u0000ST\u0005/\u0000\u0000TX\u0005*\u0000\u0000UW\t\u0000"+
		"\u0000\u0000VU\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XY\u0001"+
		"\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000Y[\u0001\u0000\u0000\u0000"+
		"ZX\u0001\u0000\u0000\u0000[\\\u0005*\u0000\u0000\\]\u0005/\u0000\u0000"+
		"]^\u0001\u0000\u0000\u0000^_\u0006\u0002\u0000\u0000_\u0006\u0001\u0000"+
		"\u0000\u0000`a\u0005p\u0000\u0000ab\u0005a\u0000\u0000bc\u0005c\u0000"+
		"\u0000cd\u0005k\u0000\u0000de\u0005a\u0000\u0000ef\u0005g\u0000\u0000"+
		"fg\u0005e\u0000\u0000g\b\u0001\u0000\u0000\u0000hi\u0005i\u0000\u0000"+
		"ij\u0005m\u0000\u0000jk\u0005p\u0000\u0000kl\u0005o\u0000\u0000lm\u0005"+
		"r\u0000\u0000mn\u0005t\u0000\u0000n\n\u0001\u0000\u0000\u0000op\u0005"+
		"f\u0000\u0000pq\u0005u\u0000\u0000qr\u0005n\u0000\u0000rs\u0005c\u0000"+
		"\u0000s\f\u0001\u0000\u0000\u0000tu\u0005{\u0000\u0000u\u000e\u0001\u0000"+
		"\u0000\u0000vw\u0005}\u0000\u0000w\u0010\u0001\u0000\u0000\u0000xy\u0005"+
		"(\u0000\u0000y\u0012\u0001\u0000\u0000\u0000z{\u0005)\u0000\u0000{\u0014"+
		"\u0001\u0000\u0000\u0000|}\u0005,\u0000\u0000}\u0016\u0001\u0000\u0000"+
		"\u0000~\u007f\u0005.\u0000\u0000\u007f\u0018\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0005=\u0000\u0000\u0081\u001a\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0005i\u0000\u0000\u0083\u0084\u0005f\u0000\u0000\u0084\u001c\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0005e\u0000\u0000\u0086\u0087\u0005l\u0000\u0000"+
		"\u0087\u0088\u0005s\u0000\u0000\u0088\u0089\u0005e\u0000\u0000\u0089\u001e"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0005f\u0000\u0000\u008b\u008c\u0005"+
		"o\u0000\u0000\u008c\u008d\u0005r\u0000\u0000\u008d \u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0005r\u0000\u0000\u008f\u0090\u0005e\u0000\u0000\u0090"+
		"\u0091\u0005t\u0000\u0000\u0091\u0092\u0005u\u0000\u0000\u0092\u0093\u0005"+
		"r\u0000\u0000\u0093\u0094\u0005n\u0000\u0000\u0094\"\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0005i\u0000\u0000\u0096\u0097\u0005n\u0000\u0000\u0097"+
		"\u00aa\u0005t\u0000\u0000\u0098\u0099\u0005f\u0000\u0000\u0099\u009a\u0005"+
		"l\u0000\u0000\u009a\u009b\u0005o\u0000\u0000\u009b\u009c\u0005a\u0000"+
		"\u0000\u009c\u009d\u0005t\u0000\u0000\u009d\u009e\u00056\u0000\u0000\u009e"+
		"\u00aa\u00054\u0000\u0000\u009f\u00a0\u0005s\u0000\u0000\u00a0\u00a1\u0005"+
		"t\u0000\u0000\u00a1\u00a2\u0005r\u0000\u0000\u00a2\u00a3\u0005i\u0000"+
		"\u0000\u00a3\u00a4\u0005n\u0000\u0000\u00a4\u00aa\u0005g\u0000\u0000\u00a5"+
		"\u00a6\u0005b\u0000\u0000\u00a6\u00a7\u0005o\u0000\u0000\u00a7\u00a8\u0005"+
		"o\u0000\u0000\u00a8\u00aa\u0005l\u0000\u0000\u00a9\u0095\u0001\u0000\u0000"+
		"\u0000\u00a9\u0098\u0001\u0000\u0000\u0000\u00a9\u009f\u0001\u0000\u0000"+
		"\u0000\u00a9\u00a5\u0001\u0000\u0000\u0000\u00aa$\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ae\u0003\'\u0013\u0000\u00ac\u00ae\u0003)\u0014\u0000\u00ad"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae"+
		"&\u0001\u0000\u0000\u0000\u00af\u00b1\u0007\u0001\u0000\u0000\u00b0\u00af"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3(\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b6\u0007\u0001\u0000\u0000\u00b5\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001"+
		"\u0000\u0000\u0000\u00b9\u00bb\u0005.\u0000\u0000\u00ba\u00bc\u0007\u0001"+
		"\u0000\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000"+
		"\u0000\u0000\u00be*\u0001\u0000\u0000\u0000\u00bf\u00c3\u0005\"\u0000"+
		"\u0000\u00c0\u00c2\u0007\u0002\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c5\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005\"\u0000\u0000"+
		"\u00c7,\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005v\u0000\u0000\u00c9\u00ca"+
		"\u0005a\u0000\u0000\u00ca\u00cb\u0005r\u0000\u0000\u00cb.\u0001\u0000"+
		"\u0000\u0000\u00cc\u00d0\u0007\u0003\u0000\u0000\u00cd\u00ce\u0005\r\u0000"+
		"\u0000\u00ce\u00d0\u0005\n\u0000\u0000\u00cf\u00cc\u0001\u0000\u0000\u0000"+
		"\u00cf\u00cd\u0001\u0000\u0000\u0000\u00d00\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d2\u0007\u0004\u0000\u0000\u00d22\u0001\u0000\u0000\u0000\u00d3\u00d4"+
		"\u0005!\u0000\u0000\u00d44\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005+"+
		"\u0000\u0000\u00d66\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005-\u0000\u0000"+
		"\u00d88\u0001\u0000\u0000\u0000\u00d9\u00da\u0005!\u0000\u0000\u00da\u00e3"+
		"\u0005=\u0000\u0000\u00db\u00dc\u0005=\u0000\u0000\u00dc\u00e3\u0005="+
		"\u0000\u0000\u00dd\u00e3\u0007\u0005\u0000\u0000\u00de\u00df\u0005<\u0000"+
		"\u0000\u00df\u00e3\u0005=\u0000\u0000\u00e0\u00e1\u0005>\u0000\u0000\u00e1"+
		"\u00e3\u0005=\u0000\u0000\u00e2\u00d9\u0001\u0000\u0000\u0000\u00e2\u00db"+
		"\u0001\u0000\u0000\u0000\u00e2\u00dd\u0001\u0000\u0000\u0000\u00e2\u00de"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e3:\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e5\u0005&\u0000\u0000\u00e5\u00e6\u0005&\u0000"+
		"\u0000\u00e6<\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005|\u0000\u0000\u00e8"+
		"\u00e9\u0005|\u0000\u0000\u00e9>\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005"+
		"t\u0000\u0000\u00eb\u00ec\u0005r\u0000\u0000\u00ec\u00ed\u0005u\u0000"+
		"\u0000\u00ed\u00f4\u0005e\u0000\u0000\u00ee\u00ef\u0005f\u0000\u0000\u00ef"+
		"\u00f0\u0005a\u0000\u0000\u00f0\u00f1\u0005l\u0000\u0000\u00f1\u00f2\u0005"+
		"s\u0000\u0000\u00f2\u00f4\u0005e\u0000\u0000\u00f3\u00ea\u0001\u0000\u0000"+
		"\u0000\u00f3\u00ee\u0001\u0000\u0000\u0000\u00f4@\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f9\u0007\u0006\u0000\u0000\u00f6\u00f8\u0007\u0007\u0000\u0000"+
		"\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f8\u00fb\u0001\u0000\u0000\u0000"+
		"\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000"+
		"\u00faB\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\r"+
		"\u0000LX\u00a9\u00ad\u00b2\u00b7\u00bd\u00c3\u00cf\u00e2\u00f3\u00f9\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
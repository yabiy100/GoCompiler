// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ParserGo extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMMENT=2, BIG_COMMENT=3, PACKAGE=4, IMPORT=5, FUNC=6, L_BRACKET=7, 
		R_BRACKET=8, L_BRACE=9, R_BRACE=10, COMMA=11, POINT=12, EQUALS=13, TYPE=14, 
		NUMBER=15, INT=16, FLOAT64=17, STRING=18, VAR=19, NEWLINE=20, MULT=21, 
		NOT=22, PLUS=23, MINUS=24, COMPAIR=25, LOGICAL_AND=26, LOGICAL_OR=27, 
		BOOLEAN=28, IDENTIFIER=29;
	public static final int
		RULE_s = 0, RULE_package = 1, RULE_imports = 2, RULE_function = 3, RULE_functionHead = 4, 
		RULE_params = 5, RULE_returnType = 6, RULE_functionBody = 7, RULE_declaration = 8, 
		RULE_expr = 9, RULE_unary = 10, RULE_unaryExpr = 11, RULE_methodCall = 12, 
		RULE_methodParams = 13, RULE_param = 14, RULE_newLine = 15, RULE_optNewLine = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "package", "imports", "function", "functionHead", "params", "returnType", 
			"functionBody", "declaration", "expr", "unary", "unaryExpr", "methodCall", 
			"methodParams", "param", "newLine", "optNewLine"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'package'", "'import'", "'func'", "'{'", "'}'", 
			"'('", "')'", "','", "'.'", "'='", null, null, null, null, null, "'var'", 
			null, null, "'!'", "'+'", "'-'", null, "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMMENT", "BIG_COMMENT", "PACKAGE", "IMPORT", "FUNC", "L_BRACKET", 
			"R_BRACKET", "L_BRACE", "R_BRACE", "COMMA", "POINT", "EQUALS", "TYPE", 
			"NUMBER", "INT", "FLOAT64", "STRING", "VAR", "NEWLINE", "MULT", "NOT", 
			"PLUS", "MINUS", "COMPAIR", "LOGICAL_AND", "LOGICAL_OR", "BOOLEAN", "IDENTIFIER"
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserGo(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SContext extends ParserRuleContext {
		public PackageContext package_() {
			return getRuleContext(PackageContext.class,0);
		}
		public ImportsContext imports() {
			return getRuleContext(ImportsContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGoListener ) ((ParserGoListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGoListener ) ((ParserGoListener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			package_();
			setState(35);
			imports();
			setState(36);
			function();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PackageContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(ParserGo.PACKAGE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ParserGo.IDENTIFIER, 0); }
		public NewLineContext newLine() {
			return getRuleContext(NewLineContext.class,0);
		}
		public PackageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGoListener ) ((ParserGoListener)listener).enterPackage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGoListener ) ((ParserGoListener)listener).exitPackage(this);
		}
	}

	public final PackageContext package_() throws RecognitionException {
		PackageContext _localctx = new PackageContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_package);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(PACKAGE);
			setState(39);
			match(IDENTIFIER);
			setState(40);
			newLine();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportsContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(ParserGo.IMPORT, 0); }
		public TerminalNode STRING() { return getToken(ParserGo.STRING, 0); }
		public NewLineContext newLine() {
			return getRuleContext(NewLineContext.class,0);
		}
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGoListener ) ((ParserGoListener)listener).enterImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGoListener ) ((ParserGoListener)listener).exitImports(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_imports);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(IMPORT);
			setState(43);
			match(STRING);
			setState(44);
			newLine();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public FunctionHeadContext functionHead() {
			return getRuleContext(FunctionHeadContext.class,0);
		}
		public List<OptNewLineContext> optNewLine() {
			return getRuleContexts(OptNewLineContext.class);
		}
		public OptNewLineContext optNewLine(int i) {
			return getRuleContext(OptNewLineContext.class,i);
		}
		public TerminalNode L_BRACKET() { return getToken(ParserGo.L_BRACKET, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(ParserGo.R_BRACKET, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGoListener ) ((ParserGoListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGoListener ) ((ParserGoListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function);
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				functionHead();
				setState(47);
				optNewLine();
				setState(48);
				match(L_BRACKET);
				setState(49);
				optNewLine();
				setState(50);
				functionBody();
				setState(51);
				match(R_BRACKET);
				setState(52);
				optNewLine();
				setState(53);
				function();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionHeadContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(ParserGo.FUNC, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ParserGo.IDENTIFIER, 0); }
		public TerminalNode L_BRACE() { return getToken(ParserGo.L_BRACE, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(ParserGo.R_BRACE, 0); }
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public FunctionHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGoListener ) ((ParserGoListener)listener).enterFunctionHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGoListener ) ((ParserGoListener)listener).exitFunctionHead(this);
		}
	}

	public final FunctionHeadContext functionHead() throws RecognitionException {
		FunctionHeadContext _localctx = new FunctionHeadContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(FUNC);
			setState(59);
			match(IDENTIFIER);
			setState(60);
			match(L_BRACE);
			setState(61);
			params();
			setState(62);
			match(R_BRACE);
			setState(63);
			returnType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ParserGo.IDENTIFIER, 0); }
		public TerminalNode TYPE() { return getToken(ParserGo.TYPE, 0); }
		public TerminalNode COMMA() { return getToken(ParserGo.COMMA, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGoListener ) ((ParserGoListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGoListener ) ((ParserGoListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_params);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(IDENTIFIER);
				setState(66);
				match(TYPE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(IDENTIFIER);
				setState(68);
				match(TYPE);
				setState(69);
				match(COMMA);
				setState(70);
				params();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnTypeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(ParserGo.TYPE, 0); }
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGoListener ) ((ParserGoListener)listener).enterReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGoListener ) ((ParserGoListener)listener).exitReturnType(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_returnType);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(TYPE);
				}
				break;
			case L_BRACKET:
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionBodyContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGoListener ) ((ParserGoListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGoListener ) ((ParserGoListener)listener).exitFunctionBody(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(ParserGo.VAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ParserGo.IDENTIFIER, 0); }
		public TerminalNode TYPE() { return getToken(ParserGo.TYPE, 0); }
		public TerminalNode EQUALS() { return getToken(ParserGo.EQUALS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NewLineContext newLine() {
			return getRuleContext(NewLineContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGoListener ) ((ParserGoListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGoListener ) ((ParserGoListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaration);
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(VAR);
				setState(81);
				match(IDENTIFIER);
				setState(82);
				match(TYPE);
				setState(83);
				match(EQUALS);
				setState(84);
				expr(0);
				setState(85);
				newLine();
				setState(86);
				declaration();
				}
				break;
			case R_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public TerminalNode L_BRACE() { return getToken(ParserGo.L_BRACE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode R_BRACE() { return getToken(ParserGo.R_BRACE, 0); }
		public TerminalNode NUMBER() { return getToken(ParserGo.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(ParserGo.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(ParserGo.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ParserGo.IDENTIFIER, 0); }
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode MULT() { return getToken(ParserGo.MULT, 0); }
		public TerminalNode PLUS() { return getToken(ParserGo.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ParserGo.MINUS, 0); }
		public TerminalNode COMPAIR() { return getToken(ParserGo.COMPAIR, 0); }
		public TerminalNode LOGICAL_AND() { return getToken(ParserGo.LOGICAL_AND, 0); }
		public TerminalNode LOGICAL_OR() { return getToken(ParserGo.LOGICAL_OR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGoListener ) ((ParserGoListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGoListener ) ((ParserGoListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(92);
				unary();
				}
				break;
			case 2:
				{
				setState(93);
				match(L_BRACE);
				setState(94);
				expr(0);
				setState(95);
				match(R_BRACE);
				}
				break;
			case 3:
				{
				setState(97);
				match(NUMBER);
				}
				break;
			case 4:
				{
				setState(98);
				match(BOOLEAN);
				}
				break;
			case 5:
				{
				setState(99);
				match(STRING);
				}
				break;
			case 6:
				{
				setState(100);
				match(IDENTIFIER);
				}
				break;
			case 7:
				{
				setState(101);
				unary();
				}
				break;
			case 8:
				{
				setState(102);
				methodCall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(123);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(105);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(106);
						match(MULT);
						setState(107);
						expr(14);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(108);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(109);
						match(PLUS);
						setState(110);
						expr(13);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(111);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(112);
						match(MINUS);
						setState(113);
						expr(12);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(114);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(115);
						match(COMPAIR);
						setState(116);
						expr(11);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(117);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(118);
						match(LOGICAL_AND);
						setState(119);
						expr(10);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(120);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(121);
						match(LOGICAL_OR);
						setState(122);
						expr(9);
						}
						break;
					}
					} 
				}
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(ParserGo.NOT, 0); }
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(ParserGo.PLUS, 0); }
		public TerminalNode NUMBER() { return getToken(ParserGo.NUMBER, 0); }
		public TerminalNode MINUS() { return getToken(ParserGo.MINUS, 0); }
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGoListener ) ((ParserGoListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGoListener ) ((ParserGoListener)listener).exitUnary(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_unary);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(NOT);
				setState(129);
				unaryExpr();
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(PLUS);
				setState(131);
				match(NUMBER);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				match(MINUS);
				setState(133);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExprContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ParserGo.IDENTIFIER, 0); }
		public TerminalNode BOOLEAN() { return getToken(ParserGo.BOOLEAN, 0); }
		public TerminalNode L_BRACE() { return getToken(ParserGo.L_BRACE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(ParserGo.R_BRACE, 0); }
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGoListener ) ((ParserGoListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGoListener ) ((ParserGoListener)listener).exitUnaryExpr(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_unaryExpr);
		try {
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(IDENTIFIER);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(BOOLEAN);
				}
				break;
			case L_BRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				match(L_BRACE);
				setState(139);
				expr(0);
				setState(140);
				match(R_BRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodCallContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ParserGo.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ParserGo.IDENTIFIER, i);
		}
		public TerminalNode L_BRACE() { return getToken(ParserGo.L_BRACE, 0); }
		public MethodParamsContext methodParams() {
			return getRuleContext(MethodParamsContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(ParserGo.R_BRACE, 0); }
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode POINT() { return getToken(ParserGo.POINT, 0); }
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGoListener ) ((ParserGoListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGoListener ) ((ParserGoListener)listener).exitMethodCall(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_methodCall);
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(IDENTIFIER);
				setState(145);
				match(L_BRACE);
				setState(146);
				methodParams();
				setState(147);
				match(R_BRACE);
				setState(148);
				methodCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(IDENTIFIER);
				setState(151);
				match(POINT);
				setState(152);
				match(IDENTIFIER);
				setState(153);
				match(L_BRACE);
				setState(154);
				methodParams();
				setState(155);
				match(R_BRACE);
				setState(156);
				methodCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				match(POINT);
				setState(159);
				match(IDENTIFIER);
				setState(160);
				match(L_BRACE);
				setState(161);
				methodParams();
				setState(162);
				match(R_BRACE);
				setState(163);
				methodCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(ParserGo.COMMA, 0); }
		public MethodParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGoListener ) ((ParserGoListener)listener).enterMethodParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGoListener ) ((ParserGoListener)listener).exitMethodParams(this);
		}
	}

	public final MethodParamsContext methodParams() throws RecognitionException {
		MethodParamsContext _localctx = new MethodParamsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_methodParams);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				param();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				param();
				setState(170);
				match(COMMA);
				setState(171);
				param();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ParserGo.IDENTIFIER, 0); }
		public TerminalNode STRING() { return getToken(ParserGo.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(ParserGo.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(ParserGo.BOOLEAN, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGoListener ) ((ParserGoListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGoListener ) ((ParserGoListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_param);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				methodCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(179);
				match(NUMBER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(180);
				match(BOOLEAN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NewLineContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(ParserGo.NEWLINE, 0); }
		public NewLineContext newLine() {
			return getRuleContext(NewLineContext.class,0);
		}
		public NewLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGoListener ) ((ParserGoListener)listener).enterNewLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGoListener ) ((ParserGoListener)listener).exitNewLine(this);
		}
	}

	public final NewLineContext newLine() throws RecognitionException {
		NewLineContext _localctx = new NewLineContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_newLine);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				match(NEWLINE);
				setState(185);
				newLine();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OptNewLineContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(ParserGo.NEWLINE, 0); }
		public NewLineContext newLine() {
			return getRuleContext(NewLineContext.class,0);
		}
		public OptNewLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optNewLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGoListener ) ((ParserGoListener)listener).enterOptNewLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGoListener ) ((ParserGoListener)listener).exitOptNewLine(this);
		}
	}

	public final OptNewLineContext optNewLine() throws RecognitionException {
		OptNewLineContext _localctx = new OptNewLineContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_optNewLine);
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(NEWLINE);
				setState(190);
				newLine();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001d\u00c3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u00039\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005I\b"+
		"\u0005\u0001\u0006\u0001\u0006\u0003\u0006M\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0003\bZ\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\th\b\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005"+
		"\t|\b\t\n\t\f\t\u007f\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u0087\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u008f\b\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u00a7\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00af\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00b6\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u00bb\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00c1\b\u0010\u0001\u0010\u0000\u0001\u0012\u0011\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \u0000\u0000"+
		"\u00d3\u0000\"\u0001\u0000\u0000\u0000\u0002&\u0001\u0000\u0000\u0000"+
		"\u0004*\u0001\u0000\u0000\u0000\u00068\u0001\u0000\u0000\u0000\b:\u0001"+
		"\u0000\u0000\u0000\nH\u0001\u0000\u0000\u0000\fL\u0001\u0000\u0000\u0000"+
		"\u000eN\u0001\u0000\u0000\u0000\u0010Y\u0001\u0000\u0000\u0000\u0012g"+
		"\u0001\u0000\u0000\u0000\u0014\u0086\u0001\u0000\u0000\u0000\u0016\u008e"+
		"\u0001\u0000\u0000\u0000\u0018\u00a6\u0001\u0000\u0000\u0000\u001a\u00ae"+
		"\u0001\u0000\u0000\u0000\u001c\u00b5\u0001\u0000\u0000\u0000\u001e\u00ba"+
		"\u0001\u0000\u0000\u0000 \u00c0\u0001\u0000\u0000\u0000\"#\u0003\u0002"+
		"\u0001\u0000#$\u0003\u0004\u0002\u0000$%\u0003\u0006\u0003\u0000%\u0001"+
		"\u0001\u0000\u0000\u0000&\'\u0005\u0004\u0000\u0000\'(\u0005\u001d\u0000"+
		"\u0000()\u0003\u001e\u000f\u0000)\u0003\u0001\u0000\u0000\u0000*+\u0005"+
		"\u0005\u0000\u0000+,\u0005\u0012\u0000\u0000,-\u0003\u001e\u000f\u0000"+
		"-\u0005\u0001\u0000\u0000\u0000./\u0003\b\u0004\u0000/0\u0003 \u0010\u0000"+
		"01\u0005\u0007\u0000\u000012\u0003 \u0010\u000023\u0003\u000e\u0007\u0000"+
		"34\u0005\b\u0000\u000045\u0003 \u0010\u000056\u0003\u0006\u0003\u0000"+
		"69\u0001\u0000\u0000\u000079\u0001\u0000\u0000\u00008.\u0001\u0000\u0000"+
		"\u000087\u0001\u0000\u0000\u00009\u0007\u0001\u0000\u0000\u0000:;\u0005"+
		"\u0006\u0000\u0000;<\u0005\u001d\u0000\u0000<=\u0005\t\u0000\u0000=>\u0003"+
		"\n\u0005\u0000>?\u0005\n\u0000\u0000?@\u0003\f\u0006\u0000@\t\u0001\u0000"+
		"\u0000\u0000AB\u0005\u001d\u0000\u0000BI\u0005\u000e\u0000\u0000CD\u0005"+
		"\u001d\u0000\u0000DE\u0005\u000e\u0000\u0000EF\u0005\u000b\u0000\u0000"+
		"FI\u0003\n\u0005\u0000GI\u0001\u0000\u0000\u0000HA\u0001\u0000\u0000\u0000"+
		"HC\u0001\u0000\u0000\u0000HG\u0001\u0000\u0000\u0000I\u000b\u0001\u0000"+
		"\u0000\u0000JM\u0005\u000e\u0000\u0000KM\u0001\u0000\u0000\u0000LJ\u0001"+
		"\u0000\u0000\u0000LK\u0001\u0000\u0000\u0000M\r\u0001\u0000\u0000\u0000"+
		"NO\u0003\u0010\b\u0000O\u000f\u0001\u0000\u0000\u0000PQ\u0005\u0013\u0000"+
		"\u0000QR\u0005\u001d\u0000\u0000RS\u0005\u000e\u0000\u0000ST\u0005\r\u0000"+
		"\u0000TU\u0003\u0012\t\u0000UV\u0003\u001e\u000f\u0000VW\u0003\u0010\b"+
		"\u0000WZ\u0001\u0000\u0000\u0000XZ\u0001\u0000\u0000\u0000YP\u0001\u0000"+
		"\u0000\u0000YX\u0001\u0000\u0000\u0000Z\u0011\u0001\u0000\u0000\u0000"+
		"[\\\u0006\t\uffff\uffff\u0000\\h\u0003\u0014\n\u0000]^\u0005\t\u0000\u0000"+
		"^_\u0003\u0012\t\u0000_`\u0005\n\u0000\u0000`h\u0001\u0000\u0000\u0000"+
		"ah\u0005\u000f\u0000\u0000bh\u0005\u001c\u0000\u0000ch\u0005\u0012\u0000"+
		"\u0000dh\u0005\u001d\u0000\u0000eh\u0003\u0014\n\u0000fh\u0003\u0018\f"+
		"\u0000g[\u0001\u0000\u0000\u0000g]\u0001\u0000\u0000\u0000ga\u0001\u0000"+
		"\u0000\u0000gb\u0001\u0000\u0000\u0000gc\u0001\u0000\u0000\u0000gd\u0001"+
		"\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gf\u0001\u0000\u0000\u0000"+
		"h}\u0001\u0000\u0000\u0000ij\n\r\u0000\u0000jk\u0005\u0015\u0000\u0000"+
		"k|\u0003\u0012\t\u000elm\n\f\u0000\u0000mn\u0005\u0017\u0000\u0000n|\u0003"+
		"\u0012\t\rop\n\u000b\u0000\u0000pq\u0005\u0018\u0000\u0000q|\u0003\u0012"+
		"\t\frs\n\n\u0000\u0000st\u0005\u0019\u0000\u0000t|\u0003\u0012\t\u000b"+
		"uv\n\t\u0000\u0000vw\u0005\u001a\u0000\u0000w|\u0003\u0012\t\nxy\n\b\u0000"+
		"\u0000yz\u0005\u001b\u0000\u0000z|\u0003\u0012\t\t{i\u0001\u0000\u0000"+
		"\u0000{l\u0001\u0000\u0000\u0000{o\u0001\u0000\u0000\u0000{r\u0001\u0000"+
		"\u0000\u0000{u\u0001\u0000\u0000\u0000{x\u0001\u0000\u0000\u0000|\u007f"+
		"\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000"+
		"\u0000~\u0013\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0005\u0016\u0000\u0000\u0081\u0087\u0003\u0016\u000b\u0000\u0082"+
		"\u0083\u0005\u0017\u0000\u0000\u0083\u0087\u0005\u000f\u0000\u0000\u0084"+
		"\u0085\u0005\u0018\u0000\u0000\u0085\u0087\u0005\u000f\u0000\u0000\u0086"+
		"\u0080\u0001\u0000\u0000\u0000\u0086\u0082\u0001\u0000\u0000\u0000\u0086"+
		"\u0084\u0001\u0000\u0000\u0000\u0087\u0015\u0001\u0000\u0000\u0000\u0088"+
		"\u008f\u0005\u001d\u0000\u0000\u0089\u008f\u0005\u001c\u0000\u0000\u008a"+
		"\u008b\u0005\t\u0000\u0000\u008b\u008c\u0003\u0012\t\u0000\u008c\u008d"+
		"\u0005\n\u0000\u0000\u008d\u008f\u0001\u0000\u0000\u0000\u008e\u0088\u0001"+
		"\u0000\u0000\u0000\u008e\u0089\u0001\u0000\u0000\u0000\u008e\u008a\u0001"+
		"\u0000\u0000\u0000\u008f\u0017\u0001\u0000\u0000\u0000\u0090\u0091\u0005"+
		"\u001d\u0000\u0000\u0091\u0092\u0005\t\u0000\u0000\u0092\u0093\u0003\u001a"+
		"\r\u0000\u0093\u0094\u0005\n\u0000\u0000\u0094\u0095\u0003\u0018\f\u0000"+
		"\u0095\u00a7\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u001d\u0000\u0000"+
		"\u0097\u0098\u0005\f\u0000\u0000\u0098\u0099\u0005\u001d\u0000\u0000\u0099"+
		"\u009a\u0005\t\u0000\u0000\u009a\u009b\u0003\u001a\r\u0000\u009b\u009c"+
		"\u0005\n\u0000\u0000\u009c\u009d\u0003\u0018\f\u0000\u009d\u00a7\u0001"+
		"\u0000\u0000\u0000\u009e\u009f\u0005\f\u0000\u0000\u009f\u00a0\u0005\u001d"+
		"\u0000\u0000\u00a0\u00a1\u0005\t\u0000\u0000\u00a1\u00a2\u0003\u001a\r"+
		"\u0000\u00a2\u00a3\u0005\n\u0000\u0000\u00a3\u00a4\u0003\u0018\f\u0000"+
		"\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a6\u0090\u0001\u0000\u0000\u0000\u00a6\u0096\u0001\u0000\u0000\u0000"+
		"\u00a6\u009e\u0001\u0000\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a7\u0019\u0001\u0000\u0000\u0000\u00a8\u00af\u0003\u001c\u000e\u0000"+
		"\u00a9\u00aa\u0003\u001c\u000e\u0000\u00aa\u00ab\u0005\u000b\u0000\u0000"+
		"\u00ab\u00ac\u0003\u001c\u000e\u0000\u00ac\u00af\u0001\u0000\u0000\u0000"+
		"\u00ad\u00af\u0001\u0000\u0000\u0000\u00ae\u00a8\u0001\u0000\u0000\u0000"+
		"\u00ae\u00a9\u0001\u0000\u0000\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000"+
		"\u00af\u001b\u0001\u0000\u0000\u0000\u00b0\u00b6\u0003\u0018\f\u0000\u00b1"+
		"\u00b6\u0005\u001d\u0000\u0000\u00b2\u00b6\u0005\u0012\u0000\u0000\u00b3"+
		"\u00b6\u0005\u000f\u0000\u0000\u00b4\u00b6\u0005\u001c\u0000\u0000\u00b5"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b5\u00b1\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b6\u001d\u0001\u0000\u0000\u0000\u00b7"+
		"\u00bb\u0005\u0014\u0000\u0000\u00b8\u00b9\u0005\u0014\u0000\u0000\u00b9"+
		"\u00bb\u0003\u001e\u000f\u0000\u00ba\u00b7\u0001\u0000\u0000\u0000\u00ba"+
		"\u00b8\u0001\u0000\u0000\u0000\u00bb\u001f\u0001\u0000\u0000\u0000\u00bc"+
		"\u00c1\u0005\u0014\u0000\u0000\u00bd\u00be\u0005\u0014\u0000\u0000\u00be"+
		"\u00c1\u0003\u001e\u000f\u0000\u00bf\u00c1\u0001\u0000\u0000\u0000\u00c0"+
		"\u00bc\u0001\u0000\u0000\u0000\u00c0\u00bd\u0001\u0000\u0000\u0000\u00c0"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c1!\u0001\u0000\u0000\u0000\u000e8H"+
		"LYg{}\u0086\u008e\u00a6\u00ae\u00b5\u00ba\u00c0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
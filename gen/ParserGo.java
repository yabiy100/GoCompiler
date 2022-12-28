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
		R_BRACKET=8, L_BRACE=9, R_BRACE=10, COMMA=11, POINT=12, EQUALS=13, IF=14, 
		TYPE=15, NUMBER=16, INT=17, FLOAT64=18, STRING=19, VAR=20, NEWLINE=21, 
		MULT=22, NOT=23, PLUS=24, MINUS=25, COMPAIR=26, LOGICAL_AND=27, LOGICAL_OR=28, 
		BOOLEAN=29, IDENTIFIER=30, ELSE=31, RETURN=32;
	public static final int
		RULE_s = 0, RULE_package = 1, RULE_imports = 2, RULE_function = 3, RULE_functionHead = 4, 
		RULE_params = 5, RULE_returnType = 6, RULE_functionBody = 7, RULE_declaration = 8, 
		RULE_expr = 9, RULE_unary = 10, RULE_unaryExpr = 11, RULE_methodCall = 12, 
		RULE_methodParams = 13, RULE_param = 14, RULE_expressions = 15, RULE_variableAssignment = 16, 
		RULE_if = 17, RULE_else = 18, RULE_return = 19, RULE_newLine = 20, RULE_optNewLine = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "package", "imports", "function", "functionHead", "params", "returnType", 
			"functionBody", "declaration", "expr", "unary", "unaryExpr", "methodCall", 
			"methodParams", "param", "expressions", "variableAssignment", "if", "else", 
			"return", "newLine", "optNewLine"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'package'", "'import'", "'func'", "'{'", "'}'", 
			"'('", "')'", "','", "'.'", "'='", "'if'", null, null, null, null, null, 
			"'var'", null, null, "'!'", "'+'", "'-'", null, "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMMENT", "BIG_COMMENT", "PACKAGE", "IMPORT", "FUNC", "L_BRACKET", 
			"R_BRACKET", "L_BRACE", "R_BRACE", "COMMA", "POINT", "EQUALS", "IF", 
			"TYPE", "NUMBER", "INT", "FLOAT64", "STRING", "VAR", "NEWLINE", "MULT", 
			"NOT", "PLUS", "MINUS", "COMPAIR", "LOGICAL_AND", "LOGICAL_OR", "BOOLEAN", 
			"IDENTIFIER", "ELSE", "RETURN"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserGoVisitor ) return ((ParserGoVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			package_();
			setState(45);
			imports();
			setState(46);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserGoVisitor ) return ((ParserGoVisitor<? extends T>)visitor).visitPackage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageContext package_() throws RecognitionException {
		PackageContext _localctx = new PackageContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_package);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(PACKAGE);
			setState(49);
			match(IDENTIFIER);
			setState(50);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserGoVisitor ) return ((ParserGoVisitor<? extends T>)visitor).visitImports(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_imports);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(IMPORT);
			setState(53);
			match(STRING);
			setState(54);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserGoVisitor ) return ((ParserGoVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				functionHead();
				setState(57);
				optNewLine();
				setState(58);
				match(L_BRACKET);
				setState(59);
				optNewLine();
				setState(60);
				functionBody();
				setState(61);
				match(R_BRACKET);
				setState(62);
				optNewLine();
				setState(63);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserGoVisitor ) return ((ParserGoVisitor<? extends T>)visitor).visitFunctionHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionHeadContext functionHead() throws RecognitionException {
		FunctionHeadContext _localctx = new FunctionHeadContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(FUNC);
			setState(69);
			match(IDENTIFIER);
			setState(70);
			match(L_BRACE);
			setState(71);
			params();
			setState(72);
			match(R_BRACE);
			setState(73);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserGoVisitor ) return ((ParserGoVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_params);
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(IDENTIFIER);
				setState(76);
				match(TYPE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(IDENTIFIER);
				setState(78);
				match(TYPE);
				setState(79);
				match(COMMA);
				setState(80);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserGoVisitor ) return ((ParserGoVisitor<? extends T>)visitor).visitReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_returnType);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
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
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserGoVisitor ) return ((ParserGoVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			declaration();
			setState(89);
			expressions();
			setState(90);
			return_();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserGoVisitor ) return ((ParserGoVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaration);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(VAR);
				setState(93);
				match(IDENTIFIER);
				setState(94);
				match(TYPE);
				setState(95);
				match(EQUALS);
				setState(96);
				expr(0);
				setState(97);
				newLine();
				setState(98);
				declaration();
				}
				break;
			case R_BRACKET:
			case IF:
			case IDENTIFIER:
			case RETURN:
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserGoVisitor ) return ((ParserGoVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
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
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(104);
				unary();
				}
				break;
			case 2:
				{
				setState(105);
				match(L_BRACE);
				setState(106);
				expr(0);
				setState(107);
				match(R_BRACE);
				}
				break;
			case 3:
				{
				setState(109);
				match(NUMBER);
				}
				break;
			case 4:
				{
				setState(110);
				match(BOOLEAN);
				}
				break;
			case 5:
				{
				setState(111);
				match(STRING);
				}
				break;
			case 6:
				{
				setState(112);
				match(IDENTIFIER);
				}
				break;
			case 7:
				{
				setState(113);
				unary();
				}
				break;
			case 8:
				{
				setState(114);
				methodCall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(135);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(117);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(118);
						match(MULT);
						setState(119);
						expr(14);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(120);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(121);
						match(PLUS);
						setState(122);
						expr(13);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(123);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(124);
						match(MINUS);
						setState(125);
						expr(12);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(126);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(127);
						match(COMPAIR);
						setState(128);
						expr(11);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(129);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(130);
						match(LOGICAL_AND);
						setState(131);
						expr(10);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(132);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(133);
						match(LOGICAL_OR);
						setState(134);
						expr(9);
						}
						break;
					}
					} 
				}
				setState(139);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserGoVisitor ) return ((ParserGoVisitor<? extends T>)visitor).visitUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_unary);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(NOT);
				setState(141);
				unaryExpr();
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(PLUS);
				setState(143);
				match(NUMBER);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				match(MINUS);
				setState(145);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserGoVisitor ) return ((ParserGoVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_unaryExpr);
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(IDENTIFIER);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(BOOLEAN);
				}
				break;
			case L_BRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				match(L_BRACE);
				setState(151);
				expr(0);
				setState(152);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserGoVisitor ) return ((ParserGoVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_methodCall);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(IDENTIFIER);
				setState(157);
				match(L_BRACE);
				setState(158);
				methodParams();
				setState(159);
				match(R_BRACE);
				setState(160);
				methodCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(IDENTIFIER);
				setState(163);
				match(POINT);
				setState(164);
				match(IDENTIFIER);
				setState(165);
				match(L_BRACE);
				setState(166);
				methodParams();
				setState(167);
				match(R_BRACE);
				setState(168);
				methodCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				match(POINT);
				setState(171);
				match(IDENTIFIER);
				setState(172);
				match(L_BRACE);
				setState(173);
				methodParams();
				setState(174);
				match(R_BRACE);
				setState(175);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserGoVisitor ) return ((ParserGoVisitor<? extends T>)visitor).visitMethodParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodParamsContext methodParams() throws RecognitionException {
		MethodParamsContext _localctx = new MethodParamsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_methodParams);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				param();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				param();
				setState(182);
				match(COMMA);
				setState(183);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserGoVisitor ) return ((ParserGoVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_param);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				methodCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(191);
				match(NUMBER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(192);
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
	public static class ExpressionsContext extends ParserRuleContext {
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public NewLineContext newLine() {
			return getRuleContext(NewLineContext.class,0);
		}
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGoListener ) ((ParserGoListener)listener).enterExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGoListener ) ((ParserGoListener)listener).exitExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserGoVisitor ) return ((ParserGoVisitor<? extends T>)visitor).visitExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expressions);
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				variableAssignment();
				setState(196);
				newLine();
				setState(197);
				expressions();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				if_();
				setState(200);
				newLine();
				setState(201);
				expressions();
				}
				break;
			case R_BRACKET:
			case RETURN:
				enterOuterAlt(_localctx, 3);
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
	public static class VariableAssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ParserGo.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(ParserGo.EQUALS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGoListener ) ((ParserGoListener)listener).enterVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGoListener ) ((ParserGoListener)listener).exitVariableAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserGoVisitor ) return ((ParserGoVisitor<? extends T>)visitor).visitVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variableAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(IDENTIFIER);
			setState(207);
			match(EQUALS);
			setState(208);
			expr(0);
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
	public static class IfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ParserGo.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode L_BRACKET() { return getToken(ParserGo.L_BRACKET, 0); }
		public NewLineContext newLine() {
			return getRuleContext(NewLineContext.class,0);
		}
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(ParserGo.R_BRACKET, 0); }
		public OptNewLineContext optNewLine() {
			return getRuleContext(OptNewLineContext.class,0);
		}
		public ElseContext else_() {
			return getRuleContext(ElseContext.class,0);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGoListener ) ((ParserGoListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGoListener ) ((ParserGoListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserGoVisitor ) return ((ParserGoVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(IF);
			setState(211);
			expr(0);
			setState(212);
			match(L_BRACKET);
			setState(213);
			newLine();
			setState(214);
			expressions();
			setState(215);
			match(R_BRACKET);
			setState(216);
			optNewLine();
			setState(217);
			else_();
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
	public static class ElseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(ParserGo.ELSE, 0); }
		public TerminalNode L_BRACKET() { return getToken(ParserGo.L_BRACKET, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(ParserGo.R_BRACKET, 0); }
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGoListener ) ((ParserGoListener)listener).enterElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGoListener ) ((ParserGoListener)listener).exitElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserGoVisitor ) return ((ParserGoVisitor<? extends T>)visitor).visitElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_else);
		try {
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(ELSE);
				setState(220);
				match(L_BRACKET);
				setState(221);
				expressions();
				setState(222);
				match(R_BRACKET);
				}
				break;
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
	public static class ReturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(ParserGo.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGoListener ) ((ParserGoListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGoListener ) ((ParserGoListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserGoVisitor ) return ((ParserGoVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_return);
		try {
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(RETURN);
				setState(228);
				expr(0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserGoVisitor ) return ((ParserGoVisitor<? extends T>)visitor).visitNewLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewLineContext newLine() throws RecognitionException {
		NewLineContext _localctx = new NewLineContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_newLine);
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				match(NEWLINE);
				setState(234);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserGoVisitor ) return ((ParserGoVisitor<? extends T>)visitor).visitOptNewLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptNewLineContext optNewLine() throws RecognitionException {
		OptNewLineContext _localctx = new OptNewLineContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_optNewLine);
		try {
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(NEWLINE);
				setState(239);
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
		"\u0004\u0001 \u00f4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003C\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005S\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0003\u0006W\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\bf\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tt\b\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0088"+
		"\b\t\n\t\f\t\u008b\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0003\n\u0093\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u009b\b\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u00b3\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00bb\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00c2\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u00cd\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u00e2\b\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u00e7\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u00ec\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u00f2\b\u0015\u0001\u0015\u0000\u0001\u0012\u0016\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*\u0000\u0000\u0103\u0000,\u0001\u0000\u0000\u0000\u00020\u0001"+
		"\u0000\u0000\u0000\u00044\u0001\u0000\u0000\u0000\u0006B\u0001\u0000\u0000"+
		"\u0000\bD\u0001\u0000\u0000\u0000\nR\u0001\u0000\u0000\u0000\fV\u0001"+
		"\u0000\u0000\u0000\u000eX\u0001\u0000\u0000\u0000\u0010e\u0001\u0000\u0000"+
		"\u0000\u0012s\u0001\u0000\u0000\u0000\u0014\u0092\u0001\u0000\u0000\u0000"+
		"\u0016\u009a\u0001\u0000\u0000\u0000\u0018\u00b2\u0001\u0000\u0000\u0000"+
		"\u001a\u00ba\u0001\u0000\u0000\u0000\u001c\u00c1\u0001\u0000\u0000\u0000"+
		"\u001e\u00cc\u0001\u0000\u0000\u0000 \u00ce\u0001\u0000\u0000\u0000\""+
		"\u00d2\u0001\u0000\u0000\u0000$\u00e1\u0001\u0000\u0000\u0000&\u00e6\u0001"+
		"\u0000\u0000\u0000(\u00eb\u0001\u0000\u0000\u0000*\u00f1\u0001\u0000\u0000"+
		"\u0000,-\u0003\u0002\u0001\u0000-.\u0003\u0004\u0002\u0000./\u0003\u0006"+
		"\u0003\u0000/\u0001\u0001\u0000\u0000\u000001\u0005\u0004\u0000\u0000"+
		"12\u0005\u001e\u0000\u000023\u0003(\u0014\u00003\u0003\u0001\u0000\u0000"+
		"\u000045\u0005\u0005\u0000\u000056\u0005\u0013\u0000\u000067\u0003(\u0014"+
		"\u00007\u0005\u0001\u0000\u0000\u000089\u0003\b\u0004\u00009:\u0003*\u0015"+
		"\u0000:;\u0005\u0007\u0000\u0000;<\u0003*\u0015\u0000<=\u0003\u000e\u0007"+
		"\u0000=>\u0005\b\u0000\u0000>?\u0003*\u0015\u0000?@\u0003\u0006\u0003"+
		"\u0000@C\u0001\u0000\u0000\u0000AC\u0001\u0000\u0000\u0000B8\u0001\u0000"+
		"\u0000\u0000BA\u0001\u0000\u0000\u0000C\u0007\u0001\u0000\u0000\u0000"+
		"DE\u0005\u0006\u0000\u0000EF\u0005\u001e\u0000\u0000FG\u0005\t\u0000\u0000"+
		"GH\u0003\n\u0005\u0000HI\u0005\n\u0000\u0000IJ\u0003\f\u0006\u0000J\t"+
		"\u0001\u0000\u0000\u0000KL\u0005\u001e\u0000\u0000LS\u0005\u000f\u0000"+
		"\u0000MN\u0005\u001e\u0000\u0000NO\u0005\u000f\u0000\u0000OP\u0005\u000b"+
		"\u0000\u0000PS\u0003\n\u0005\u0000QS\u0001\u0000\u0000\u0000RK\u0001\u0000"+
		"\u0000\u0000RM\u0001\u0000\u0000\u0000RQ\u0001\u0000\u0000\u0000S\u000b"+
		"\u0001\u0000\u0000\u0000TW\u0005\u000f\u0000\u0000UW\u0001\u0000\u0000"+
		"\u0000VT\u0001\u0000\u0000\u0000VU\u0001\u0000\u0000\u0000W\r\u0001\u0000"+
		"\u0000\u0000XY\u0003\u0010\b\u0000YZ\u0003\u001e\u000f\u0000Z[\u0003&"+
		"\u0013\u0000[\u000f\u0001\u0000\u0000\u0000\\]\u0005\u0014\u0000\u0000"+
		"]^\u0005\u001e\u0000\u0000^_\u0005\u000f\u0000\u0000_`\u0005\r\u0000\u0000"+
		"`a\u0003\u0012\t\u0000ab\u0003(\u0014\u0000bc\u0003\u0010\b\u0000cf\u0001"+
		"\u0000\u0000\u0000df\u0001\u0000\u0000\u0000e\\\u0001\u0000\u0000\u0000"+
		"ed\u0001\u0000\u0000\u0000f\u0011\u0001\u0000\u0000\u0000gh\u0006\t\uffff"+
		"\uffff\u0000ht\u0003\u0014\n\u0000ij\u0005\t\u0000\u0000jk\u0003\u0012"+
		"\t\u0000kl\u0005\n\u0000\u0000lt\u0001\u0000\u0000\u0000mt\u0005\u0010"+
		"\u0000\u0000nt\u0005\u001d\u0000\u0000ot\u0005\u0013\u0000\u0000pt\u0005"+
		"\u001e\u0000\u0000qt\u0003\u0014\n\u0000rt\u0003\u0018\f\u0000sg\u0001"+
		"\u0000\u0000\u0000si\u0001\u0000\u0000\u0000sm\u0001\u0000\u0000\u0000"+
		"sn\u0001\u0000\u0000\u0000so\u0001\u0000\u0000\u0000sp\u0001\u0000\u0000"+
		"\u0000sq\u0001\u0000\u0000\u0000sr\u0001\u0000\u0000\u0000t\u0089\u0001"+
		"\u0000\u0000\u0000uv\n\r\u0000\u0000vw\u0005\u0016\u0000\u0000w\u0088"+
		"\u0003\u0012\t\u000exy\n\f\u0000\u0000yz\u0005\u0018\u0000\u0000z\u0088"+
		"\u0003\u0012\t\r{|\n\u000b\u0000\u0000|}\u0005\u0019\u0000\u0000}\u0088"+
		"\u0003\u0012\t\f~\u007f\n\n\u0000\u0000\u007f\u0080\u0005\u001a\u0000"+
		"\u0000\u0080\u0088\u0003\u0012\t\u000b\u0081\u0082\n\t\u0000\u0000\u0082"+
		"\u0083\u0005\u001b\u0000\u0000\u0083\u0088\u0003\u0012\t\n\u0084\u0085"+
		"\n\b\u0000\u0000\u0085\u0086\u0005\u001c\u0000\u0000\u0086\u0088\u0003"+
		"\u0012\t\t\u0087u\u0001\u0000\u0000\u0000\u0087x\u0001\u0000\u0000\u0000"+
		"\u0087{\u0001\u0000\u0000\u0000\u0087~\u0001\u0000\u0000\u0000\u0087\u0081"+
		"\u0001\u0000\u0000\u0000\u0087\u0084\u0001\u0000\u0000\u0000\u0088\u008b"+
		"\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0001\u0000\u0000\u0000\u008a\u0013\u0001\u0000\u0000\u0000\u008b\u0089"+
		"\u0001\u0000\u0000\u0000\u008c\u008d\u0005\u0017\u0000\u0000\u008d\u0093"+
		"\u0003\u0016\u000b\u0000\u008e\u008f\u0005\u0018\u0000\u0000\u008f\u0093"+
		"\u0005\u0010\u0000\u0000\u0090\u0091\u0005\u0019\u0000\u0000\u0091\u0093"+
		"\u0005\u0010\u0000\u0000\u0092\u008c\u0001\u0000\u0000\u0000\u0092\u008e"+
		"\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0015"+
		"\u0001\u0000\u0000\u0000\u0094\u009b\u0005\u001e\u0000\u0000\u0095\u009b"+
		"\u0005\u001d\u0000\u0000\u0096\u0097\u0005\t\u0000\u0000\u0097\u0098\u0003"+
		"\u0012\t\u0000\u0098\u0099\u0005\n\u0000\u0000\u0099\u009b\u0001\u0000"+
		"\u0000\u0000\u009a\u0094\u0001\u0000\u0000\u0000\u009a\u0095\u0001\u0000"+
		"\u0000\u0000\u009a\u0096\u0001\u0000\u0000\u0000\u009b\u0017\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0005\u001e\u0000\u0000\u009d\u009e\u0005\t\u0000"+
		"\u0000\u009e\u009f\u0003\u001a\r\u0000\u009f\u00a0\u0005\n\u0000\u0000"+
		"\u00a0\u00a1\u0003\u0018\f\u0000\u00a1\u00b3\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0005\u001e\u0000\u0000\u00a3\u00a4\u0005\f\u0000\u0000\u00a4\u00a5"+
		"\u0005\u001e\u0000\u0000\u00a5\u00a6\u0005\t\u0000\u0000\u00a6\u00a7\u0003"+
		"\u001a\r\u0000\u00a7\u00a8\u0005\n\u0000\u0000\u00a8\u00a9\u0003\u0018"+
		"\f\u0000\u00a9\u00b3\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\f\u0000"+
		"\u0000\u00ab\u00ac\u0005\u001e\u0000\u0000\u00ac\u00ad\u0005\t\u0000\u0000"+
		"\u00ad\u00ae\u0003\u001a\r\u0000\u00ae\u00af\u0005\n\u0000\u0000\u00af"+
		"\u00b0\u0003\u0018\f\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b2\u009c\u0001\u0000\u0000\u0000\u00b2\u00a2"+
		"\u0001\u0000\u0000\u0000\u00b2\u00aa\u0001\u0000\u0000\u0000\u00b2\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b3\u0019\u0001\u0000\u0000\u0000\u00b4\u00bb"+
		"\u0003\u001c\u000e\u0000\u00b5\u00b6\u0003\u001c\u000e\u0000\u00b6\u00b7"+
		"\u0005\u000b\u0000\u0000\u00b7\u00b8\u0003\u001c\u000e\u0000\u00b8\u00bb"+
		"\u0001\u0000\u0000\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba\u00b4"+
		"\u0001\u0000\u0000\u0000\u00ba\u00b5\u0001\u0000\u0000\u0000\u00ba\u00b9"+
		"\u0001\u0000\u0000\u0000\u00bb\u001b\u0001\u0000\u0000\u0000\u00bc\u00c2"+
		"\u0003\u0018\f\u0000\u00bd\u00c2\u0005\u001e\u0000\u0000\u00be\u00c2\u0005"+
		"\u0013\u0000\u0000\u00bf\u00c2\u0005\u0010\u0000\u0000\u00c0\u00c2\u0005"+
		"\u001d\u0000\u0000\u00c1\u00bc\u0001\u0000\u0000\u0000\u00c1\u00bd\u0001"+
		"\u0000\u0000\u0000\u00c1\u00be\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2\u001d\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c4\u0003 \u0010\u0000\u00c4\u00c5\u0003(\u0014"+
		"\u0000\u00c5\u00c6\u0003\u001e\u000f\u0000\u00c6\u00cd\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c8\u0003\"\u0011\u0000\u00c8\u00c9\u0003(\u0014\u0000"+
		"\u00c9\u00ca\u0003\u001e\u000f\u0000\u00ca\u00cd\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cd\u0001\u0000\u0000\u0000\u00cc\u00c3\u0001\u0000\u0000\u0000"+
		"\u00cc\u00c7\u0001\u0000\u0000\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cd\u001f\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\u001e\u0000\u0000"+
		"\u00cf\u00d0\u0005\r\u0000\u0000\u00d0\u00d1\u0003\u0012\t\u0000\u00d1"+
		"!\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\u000e\u0000\u0000\u00d3\u00d4"+
		"\u0003\u0012\t\u0000\u00d4\u00d5\u0005\u0007\u0000\u0000\u00d5\u00d6\u0003"+
		"(\u0014\u0000\u00d6\u00d7\u0003\u001e\u000f\u0000\u00d7\u00d8\u0005\b"+
		"\u0000\u0000\u00d8\u00d9\u0003*\u0015\u0000\u00d9\u00da\u0003$\u0012\u0000"+
		"\u00da#\u0001\u0000\u0000\u0000\u00db\u00dc\u0005\u001f\u0000\u0000\u00dc"+
		"\u00dd\u0005\u0007\u0000\u0000\u00dd\u00de\u0003\u001e\u000f\u0000\u00de"+
		"\u00df\u0005\b\u0000\u0000\u00df\u00e2\u0001\u0000\u0000\u0000\u00e0\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e1\u00db\u0001\u0000\u0000\u0000\u00e1\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e2%\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005"+
		" \u0000\u0000\u00e4\u00e7\u0003\u0012\t\u0000\u00e5\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e7\'\u0001\u0000\u0000\u0000\u00e8\u00ec\u0005\u0015\u0000"+
		"\u0000\u00e9\u00ea\u0005\u0015\u0000\u0000\u00ea\u00ec\u0003(\u0014\u0000"+
		"\u00eb\u00e8\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000"+
		"\u00ec)\u0001\u0000\u0000\u0000\u00ed\u00f2\u0005\u0015\u0000\u0000\u00ee"+
		"\u00ef\u0005\u0015\u0000\u0000\u00ef\u00f2\u0003(\u0014\u0000\u00f0\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f1\u00ed\u0001\u0000\u0000\u0000\u00f1\u00ee"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f2+\u0001"+
		"\u0000\u0000\u0000\u0011BRVes\u0087\u0089\u0092\u009a\u00b2\u00ba\u00c1"+
		"\u00cc\u00e1\u00e6\u00eb\u00f1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
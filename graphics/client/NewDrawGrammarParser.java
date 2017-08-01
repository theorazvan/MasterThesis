package graphics.client;
// Generated from /home/dabija/Java/GeoDraw/src/graphics/client/NewDrawGrammar.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NewDrawGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, DRAW=2, MOVE=3, FILL=4, DELETE=5, REMOVE=6, CIRCLE=7, SQUARE=8, 
		RECTANGLE=9, TRIANGLE=10, ELLIPSE=11, DIMENSION=12, POSITION=13, COLOR=14, 
		LEFT=15, RIGHT=16, UP=17, DOWN=18, INSIDE=19, BORDER=20, LPAREN=21, RPAREN=22, 
		LBRACE=23, RBRACE=24, SEMI=25, COMMA=26, ID=27, NEWLINE=28, WS=29;
	public static final String[] tokenNames = {
		"<INVALID>", "'line'", "'draw'", "'move'", "'fill'", "'delete'", "'remove'", 
		"'circle'", "'square'", "'rectangle'", "'triangle'", "'ellipse'", "'dimension'", 
		"'position'", "'color'", "'left'", "'right'", "'up'", "'down'", "'inside'", 
		"'border'", "'('", "')'", "'{'", "'}'", "','", "';'", "ID", "'\n'", "WS"
	};
	public static final int
		RULE_drawSentence = 0, RULE_action = 1, RULE_objects = 2, RULE_object = 3, 
		RULE_arguments = 4, RULE_methods = 5, RULE_methodName = 6;
	public static final String[] ruleNames = {
		"drawSentence", "action", "objects", "object", "arguments", "methods", 
		"methodName"
	};

	@Override
	public String getGrammarFileName() { return "NewDrawGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NewDrawGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DrawSentenceContext extends ParserRuleContext {
		public MethodsContext methods(int i) {
			return getRuleContext(MethodsContext.class,i);
		}
		public ObjectsContext objects() {
			return getRuleContext(ObjectsContext.class,0);
		}
		public List<MethodsContext> methods() {
			return getRuleContexts(MethodsContext.class);
		}
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public DrawSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drawSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewDrawGrammarListener ) ((NewDrawGrammarListener)listener).enterDrawSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewDrawGrammarListener ) ((NewDrawGrammarListener)listener).exitDrawSentence(this);
		}
	}

	public final DrawSentenceContext drawSentence() throws RecognitionException {
		DrawSentenceContext _localctx = new DrawSentenceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_drawSentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14); action();
			setState(15); objects();
			setState(16); match(LBRACE);
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(17); methods();
				}
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(23); match(RBRACE);
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

	public static class ActionContext extends ParserRuleContext {
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewDrawGrammarListener ) ((NewDrawGrammarListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewDrawGrammarListener ) ((NewDrawGrammarListener)listener).exitAction(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DRAW) | (1L << MOVE) | (1L << FILL) | (1L << DELETE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ObjectsContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ObjectsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objects; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewDrawGrammarListener ) ((NewDrawGrammarListener)listener).enterObjects(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewDrawGrammarListener ) ((NewDrawGrammarListener)listener).exitObjects(this);
		}
	}

	public final ObjectsContext objects() throws RecognitionException {
		ObjectsContext _localctx = new ObjectsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_objects);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); object();
			setState(28); arguments();
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

	public static class ObjectContext extends ParserRuleContext {
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewDrawGrammarListener ) ((NewDrawGrammarListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewDrawGrammarListener ) ((NewDrawGrammarListener)listener).exitObject(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << CIRCLE) | (1L << SQUARE) | (1L << RECTANGLE) | (1L << TRIANGLE) | (1L << ELLIPSE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ArgumentsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(NewDrawGrammarParser.ID); }
		public List<TerminalNode> SEMI() { return getTokens(NewDrawGrammarParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(NewDrawGrammarParser.SEMI, i);
		}
		public TerminalNode ID(int i) {
			return getToken(NewDrawGrammarParser.ID, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewDrawGrammarListener ) ((NewDrawGrammarListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewDrawGrammarListener ) ((NewDrawGrammarListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32); match(LPAREN);
			setState(33); match(ID);
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(34); match(SEMI);
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(40); match(ID);
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46); match(RPAREN);
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

	public static class MethodsContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(NewDrawGrammarParser.SEMI, 0); }
		public TerminalNode NEWLINE() { return getToken(NewDrawGrammarParser.NEWLINE, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public MethodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methods; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewDrawGrammarListener ) ((NewDrawGrammarListener)listener).enterMethods(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewDrawGrammarListener ) ((NewDrawGrammarListener)listener).exitMethods(this);
		}
	}

	public final MethodsContext methods() throws RecognitionException {
		MethodsContext _localctx = new MethodsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_methods);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); match(NEWLINE);
			setState(49); methodName();
			setState(50); arguments();
			setState(51); match(SEMI);
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

	public static class MethodNameContext extends ParserRuleContext {
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewDrawGrammarListener ) ((NewDrawGrammarListener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewDrawGrammarListener ) ((NewDrawGrammarListener)listener).exitMethodName(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIMENSION) | (1L << POSITION) | (1L << COLOR) | (1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << INSIDE) | (1L << BORDER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\37:\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\7\2\25\n\2"+
		"\f\2\16\2\30\13\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\7\6"+
		"&\n\6\f\6\16\6)\13\6\3\6\7\6,\n\6\f\6\16\6/\13\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f\16\2\5\3\2\4\7\4\2\3\3\t\r\3\2\16"+
		"\26\65\2\20\3\2\2\2\4\33\3\2\2\2\6\35\3\2\2\2\b \3\2\2\2\n\"\3\2\2\2\f"+
		"\62\3\2\2\2\16\67\3\2\2\2\20\21\5\4\3\2\21\22\5\6\4\2\22\26\7\31\2\2\23"+
		"\25\5\f\7\2\24\23\3\2\2\2\25\30\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27"+
		"\31\3\2\2\2\30\26\3\2\2\2\31\32\7\32\2\2\32\3\3\2\2\2\33\34\t\2\2\2\34"+
		"\5\3\2\2\2\35\36\5\b\5\2\36\37\5\n\6\2\37\7\3\2\2\2 !\t\3\2\2!\t\3\2\2"+
		"\2\"#\7\27\2\2#\'\7\35\2\2$&\7\33\2\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'"+
		"(\3\2\2\2(-\3\2\2\2)\'\3\2\2\2*,\7\35\2\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2"+
		"\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60\61\7\30\2\2\61\13\3\2\2\2\62\63"+
		"\7\36\2\2\63\64\5\16\b\2\64\65\5\n\6\2\65\66\7\33\2\2\66\r\3\2\2\2\67"+
		"8\t\4\2\28\17\3\2\2\2\5\26\'-";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
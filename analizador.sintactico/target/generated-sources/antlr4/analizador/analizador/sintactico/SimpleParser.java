// Generated from Simple.g4 by ANTLR 4.4
package analizador.analizador.sintactico;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, VAR=2, PRINTLN=3, PLUS=4, MINUS=5, MULT=6, DIV=7, AND=8, OR=9, 
		NOT=10, GT=11, LT=12, GEQ=13, LEQ=14, EQ=15, NEQ=16, ASSIGN=17, BRACKET_OPEN=18, 
		BRACKET_CLOSE=19, PAR_OPEN=20, PAR_CLOSE=21, SEMICOLON=22, ID=23, NUMBER=24, 
		WS=25;
	public static final String[] tokenNames = {
		"<INVALID>", "'program'", "'var'", "'println'", "'+'", "'-'", "'*'", "'/'", 
		"'&&'", "'ǀǀ'", "'!'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'='", 
		"'{'", "'}'", "'('", "')'", "';'", "ID", "NUMBER", "WS"
	};
	public static final int
		RULE_program = 0, RULE_sentence = 1, RULE_sentence1 = 2, RULE_sentence2 = 3, 
		RULE_var_decl = 4, RULE_var_assign = 5, RULE_println = 6;
	public static final String[] ruleNames = {
		"program", "sentence", "sentence1", "sentence2", "var_decl", "var_assign", 
		"println"
	};

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public List<Sentence1Context> sentence1() {
			return getRuleContexts(Sentence1Context.class);
		}
		public Sentence1Context sentence1(int i) {
			return getRuleContext(Sentence1Context.class,i);
		}
		public Sentence2Context sentence2(int i) {
			return getRuleContext(Sentence2Context.class,i);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(SimpleParser.BRACKET_CLOSE, 0); }
		public List<Sentence2Context> sentence2() {
			return getRuleContexts(Sentence2Context.class);
		}
		public TerminalNode BRACKET_OPEN() { return getToken(SimpleParser.BRACKET_OPEN, 0); }
		public TerminalNode PROGRAM() { return getToken(SimpleParser.PROGRAM, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14); match(PROGRAM);
			setState(15); match(ID);
			setState(16); match(BRACKET_OPEN);
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(17); sentence();
				}
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(23); sentence1();
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PRINTLN) {
				{
				{
				setState(29); sentence2();
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35); match(BRACKET_CLOSE);
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

	public static class SentenceContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitSentence(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); var_decl();
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

	public static class Sentence1Context extends ParserRuleContext {
		public Var_assignContext var_assign() {
			return getRuleContext(Var_assignContext.class,0);
		}
		public Sentence1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterSentence1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitSentence1(this);
		}
	}

	public final Sentence1Context sentence1() throws RecognitionException {
		Sentence1Context _localctx = new Sentence1Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_sentence1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); var_assign();
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

	public static class Sentence2Context extends ParserRuleContext {
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
		}
		public Sentence2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterSentence2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitSentence2(this);
		}
	}

	public final Sentence2Context sentence2() throws RecognitionException {
		Sentence2Context _localctx = new Sentence2Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_sentence2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); println();
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

	public static class Var_declContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
		public TerminalNode VAR() { return getToken(SimpleParser.VAR, 0); }
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); match(VAR);
			setState(44); match(ID);
			setState(45); match(SEMICOLON);
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

	public static class Var_assignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(SimpleParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
		public TerminalNode NUMBER() { return getToken(SimpleParser.NUMBER, 0); }
		public Var_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterVar_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitVar_assign(this);
		}
	}

	public final Var_assignContext var_assign() throws RecognitionException {
		Var_assignContext _localctx = new Var_assignContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); match(ID);
			setState(48); match(ASSIGN);
			setState(49); match(NUMBER);
			setState(50); match(SEMICOLON);
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

	public static class PrintlnContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
		public TerminalNode PRINTLN() { return getToken(SimpleParser.PRINTLN, 0); }
		public TerminalNode NUMBER() { return getToken(SimpleParser.NUMBER, 0); }
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterPrintln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitPrintln(this);
		}
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_println);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); match(PRINTLN);
			setState(53); match(NUMBER);
			setState(54); match(SEMICOLON);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\33;\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\7\2\25\n\2"+
		"\f\2\16\2\30\13\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\3\2\7\2!\n\2\f\2\16"+
		"\2$\13\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f\16\2\2\66\2\20\3\2\2\2\4"+
		"\'\3\2\2\2\6)\3\2\2\2\b+\3\2\2\2\n-\3\2\2\2\f\61\3\2\2\2\16\66\3\2\2\2"+
		"\20\21\7\3\2\2\21\22\7\31\2\2\22\26\7\24\2\2\23\25\5\4\3\2\24\23\3\2\2"+
		"\2\25\30\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\34\3\2\2\2\30\26\3\2\2"+
		"\2\31\33\5\6\4\2\32\31\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2"+
		"\2\35\"\3\2\2\2\36\34\3\2\2\2\37!\5\b\5\2 \37\3\2\2\2!$\3\2\2\2\" \3\2"+
		"\2\2\"#\3\2\2\2#%\3\2\2\2$\"\3\2\2\2%&\7\25\2\2&\3\3\2\2\2\'(\5\n\6\2"+
		"(\5\3\2\2\2)*\5\f\7\2*\7\3\2\2\2+,\5\16\b\2,\t\3\2\2\2-.\7\4\2\2./\7\31"+
		"\2\2/\60\7\30\2\2\60\13\3\2\2\2\61\62\7\31\2\2\62\63\7\23\2\2\63\64\7"+
		"\32\2\2\64\65\7\30\2\2\65\r\3\2\2\2\66\67\7\5\2\2\678\7\32\2\289\7\30"+
		"\2\29\17\3\2\2\2\5\26\34\"";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
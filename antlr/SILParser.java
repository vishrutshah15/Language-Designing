// Generated from E:/APL Assignments/SILAntlr/SILAntlr/src/main/java/apl\SIL.g4 by ANTLR 4.6
package apl.antlr;

import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SILParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, ID=15, INT=16, NEWLINE=17, 
		WS=18, COMMENT=19, LITERAL=20;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_integer = 2, RULE_let = 3, RULE_input = 4, 
		RULE_exLit = 5, RULE_exprLit1 = 6, RULE_expr = 7, RULE_mulEx = 8, RULE_at = 9;
	public static final String[] ruleNames = {
		"program", "stat", "integer", "let", "input", "exLit", "exprLit1", "expr", 
		"mulEx", "at"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'PRINT'", "'PRINTLN'", "'INTEGER'", "'INPUT'", "'LET'", "'END'", 
		"','", "'='", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "ID", "INT", "NEWLINE", "WS", "COMMENT", "LITERAL"
	};
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
	public String getGrammarFileName() { return "SIL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	/** Map variable name to Integer object holding value */
	HashMap memory = new HashMap();
	Scanner keyboard = new Scanner(System.in);


	public SILParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SILListener ) ((SILListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SILListener ) ((SILListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				stat();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << NEWLINE))) != 0) );
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

	public static class StatContext extends ParserRuleContext {
		public ExLitContext exLit;
		public TerminalNode NEWLINE() { return getToken(SILParser.NEWLINE, 0); }
		public List<ExLitContext> exLit() {
			return getRuleContexts(ExLitContext.class);
		}
		public ExLitContext exLit(int i) {
			return getRuleContext(ExLitContext.class,i);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public LetContext let() {
			return getRuleContext(LetContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SILListener ) ((SILListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SILListener ) ((SILListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				match(T__0);
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(26);
					((StatContext)_localctx).exLit = exLit();
					}
					}
					setState(29); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << ID) | (1L << INT) | (1L << LITERAL))) != 0) );
				setState(31);
				match(NEWLINE);
				System.out.print(((StatContext)_localctx).exLit.value);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(T__1);
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(35);
					((StatContext)_localctx).exLit = exLit();
					}
					}
					setState(38); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << ID) | (1L << INT) | (1L << LITERAL))) != 0) );
				setState(40);
				match(NEWLINE);
				System.out.println(((StatContext)_localctx).exLit.value);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				match(T__2);
				setState(44);
				integer();
				setState(45);
				match(NEWLINE);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				match(T__3);
				setState(48);
				input();
				setState(49);
				match(NEWLINE);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 5);
				{
				setState(51);
				match(T__4);
				setState(52);
				let();
				setState(53);
				match(NEWLINE);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 6);
				{
				setState(55);
				match(T__5);
				System.exit(0);
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 7);
				{
				setState(57);
				match(NEWLINE);
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

	public static class IntegerContext extends ParserRuleContext {
		public Token ID;
		public List<Token> ids = new ArrayList<Token>();
		public List<TerminalNode> ID() { return getTokens(SILParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SILParser.ID, i);
		}
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SILListener ) ((SILListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SILListener ) ((SILListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			((IntegerContext)_localctx).ID = match(ID);
			((IntegerContext)_localctx).ids.add(((IntegerContext)_localctx).ID);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(61);
				match(T__6);
				setState(62);
				((IntegerContext)_localctx).ID = match(ID);
				((IntegerContext)_localctx).ids.add(((IntegerContext)_localctx).ID);
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			            for(Token idT : ((IntegerContext)_localctx).ids) {
			                String id=idT.getText();
			                if(!memory.containsKey(id)) memory.put(id, null);
			                else {
			                    System.err.println("variable already defined: "+id);
			                    System.exit(0);
			                }
			            }
			        
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

	public static class LetContext extends ParserRuleContext {
		public Token ID;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(SILParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SILListener ) ((SILListener)listener).enterLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SILListener ) ((SILListener)listener).exitLet(this);
		}
	}

	public final LetContext let() throws RecognitionException {
		LetContext _localctx = new LetContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_let);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			((LetContext)_localctx).ID = match(ID);
			setState(71);
			match(T__7);
			setState(72);
			((LetContext)_localctx).expr = expr();

			            if(memory.containsKey((((LetContext)_localctx).ID!=null?((LetContext)_localctx).ID.getText():null))) memory.put((((LetContext)_localctx).ID!=null?((LetContext)_localctx).ID.getText():null), new Integer(((LetContext)_localctx).expr.value));
			            else {
			              System.err.println("variable not defined: "+(((LetContext)_localctx).ID!=null?((LetContext)_localctx).ID.getText():null));
			              System.exit(0);
			            }
			        
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

	public static class InputContext extends ParserRuleContext {
		public Token ID;
		public List<Token> ids = new ArrayList<Token>();
		public List<TerminalNode> ID() { return getTokens(SILParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SILParser.ID, i);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SILListener ) ((SILListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SILListener ) ((SILListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			((InputContext)_localctx).ID = match(ID);
			((InputContext)_localctx).ids.add(((InputContext)_localctx).ID);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(76);
				match(T__6);
				setState(77);
				((InputContext)_localctx).ID = match(ID);
				((InputContext)_localctx).ids.add(((InputContext)_localctx).ID);
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			            for(Token idT : ((InputContext)_localctx).ids) {
			                String id=idT.getText();
			                if(memory.containsKey(id)) {
			                    int a = keyboard.nextInt();
			                    memory.put(id, a);
			                } else {
			                    System.err.println("variable not defined: "+(((InputContext)_localctx).ID!=null?((InputContext)_localctx).ID.getText():null));
			                    System.exit(0);
			                }
			            }
			        
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

	public static class ExLitContext extends ParserRuleContext {
		public String value;
		public ExprLit1Context e;
		public List<ExprLit1Context> exprLit1() {
			return getRuleContexts(ExprLit1Context.class);
		}
		public ExprLit1Context exprLit1(int i) {
			return getRuleContext(ExprLit1Context.class,i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(SILParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(SILParser.COMMENT, i);
		}
		public ExLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SILListener ) ((SILListener)listener).enterExLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SILListener ) ((SILListener)listener).exitExLit(this);
		}
	}

	public final ExLitContext exLit() throws RecognitionException {
		ExLitContext _localctx = new ExLitContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_exLit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			((ExLitContext)_localctx).e = exprLit1();
			((ExLitContext)_localctx).value = ((ExLitContext)_localctx).e.value;
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==COMMENT) {
				{
				setState(92);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
					{
					setState(87);
					match(T__8);
					setState(88);
					((ExLitContext)_localctx).e = exprLit1();
					_localctx.value+=((ExLitContext)_localctx).e.value;
					}
					break;
				case COMMENT:
					{
					setState(91);
					match(COMMENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ExprLit1Context extends ParserRuleContext {
		public String value;
		public ExprContext e;
		public Token LITERAL;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LITERAL() { return getToken(SILParser.LITERAL, 0); }
		public ExprLit1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprLit1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SILListener ) ((SILListener)listener).enterExprLit1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SILListener ) ((SILListener)listener).exitExprLit1(this);
		}
	}

	public final ExprLit1Context exprLit1() throws RecognitionException {
		ExprLit1Context _localctx = new ExprLit1Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_exprLit1);
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case ID:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				((ExprLit1Context)_localctx).e = expr();
				((ExprLit1Context)_localctx).value = String.valueOf(((ExprLit1Context)_localctx).e.value);
				}
				break;
			case LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				((ExprLit1Context)_localctx).LITERAL = match(LITERAL);
				((ExprLit1Context)_localctx).value =  (((ExprLit1Context)_localctx).LITERAL!=null?((ExprLit1Context)_localctx).LITERAL.getText():null).substring(1,(((ExprLit1Context)_localctx).LITERAL!=null?((ExprLit1Context)_localctx).LITERAL.getText():null).length()-1);
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

	public static class ExprContext extends ParserRuleContext {
		public int value;
		public MulExContext e;
		public List<MulExContext> mulEx() {
			return getRuleContexts(MulExContext.class);
		}
		public MulExContext mulEx(int i) {
			return getRuleContext(MulExContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SILListener ) ((SILListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SILListener ) ((SILListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			((ExprContext)_localctx).e = mulEx();
			((ExprContext)_localctx).value =  ((ExprContext)_localctx).e.value;
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(114);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__8:
						{
						setState(106);
						match(T__8);
						setState(107);
						((ExprContext)_localctx).e = mulEx();
						_localctx.value += ((ExprContext)_localctx).e.value;
						}
						break;
					case T__9:
						{
						setState(110);
						match(T__9);
						setState(111);
						((ExprContext)_localctx).e = mulEx();
						_localctx.value -= ((ExprContext)_localctx).e.value;
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
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

	public static class MulExContext extends ParserRuleContext {
		public int value;
		public AtContext e;
		public List<AtContext> at() {
			return getRuleContexts(AtContext.class);
		}
		public AtContext at(int i) {
			return getRuleContext(AtContext.class,i);
		}
		public MulExContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulEx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SILListener ) ((SILListener)listener).enterMulEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SILListener ) ((SILListener)listener).exitMulEx(this);
		}
	}

	public final MulExContext mulEx() throws RecognitionException {
		MulExContext _localctx = new MulExContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mulEx);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			((MulExContext)_localctx).e = at();
			((MulExContext)_localctx).value =  ((MulExContext)_localctx).e.value;
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10 || _la==T__11) {
				{
				setState(129);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__10:
					{
					setState(121);
					match(T__10);
					setState(122);
					((MulExContext)_localctx).e = at();
					_localctx.value *= ((MulExContext)_localctx).e.value;
					}
					break;
				case T__11:
					{
					setState(125);
					match(T__11);
					setState(126);
					((MulExContext)_localctx).e = at();
					_localctx.value /= ((MulExContext)_localctx).e.value;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class AtContext extends ParserRuleContext {
		public int value;
		public Token INT;
		public Token ID;
		public ExprContext expr;
		public TerminalNode INT() { return getToken(SILParser.INT, 0); }
		public TerminalNode ID() { return getToken(SILParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_at; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SILListener ) ((SILListener)listener).enterAt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SILListener ) ((SILListener)listener).exitAt(this);
		}
	}

	public final AtContext at() throws RecognitionException {
		AtContext _localctx = new AtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_at);
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				((AtContext)_localctx).INT = match(INT);
				((AtContext)_localctx).value =  Integer.parseInt((((AtContext)_localctx).INT!=null?((AtContext)_localctx).INT.getText():null));
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				((AtContext)_localctx).ID = match(ID);

				        Integer v = (Integer)memory.get((((AtContext)_localctx).ID!=null?((AtContext)_localctx).ID.getText():null));
				        if ( v==null ) System.err.println("variable not defined: "+(((AtContext)_localctx).ID!=null?((AtContext)_localctx).ID.getText():null));
				        else ((AtContext)_localctx).value =  v.intValue();
				        
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				match(T__12);
				setState(139);
				((AtContext)_localctx).expr = expr();
				setState(140);
				match(T__13);
				((AtContext)_localctx).value =  ((AtContext)_localctx).expr.value;
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\26\u0094\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\6\2\30\n\2\r\2\16\2\31\3\3\3\3\6\3\36\n\3\r\3\16\3\37\3\3\3"+
		"\3\3\3\3\3\3\3\6\3\'\n\3\r\3\16\3(\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3=\n\3\3\4\3\4\3\4\7\4B\n\4\f\4"+
		"\16\4E\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6Q\n\6\f\6\16\6"+
		"T\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7_\n\7\f\7\16\7b\13\7\3\b"+
		"\3\b\3\b\3\b\3\b\5\bi\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t"+
		"u\n\t\f\t\16\tx\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0084"+
		"\n\n\f\n\16\n\u0087\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u0092\n\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\2\u009d\2\27\3\2"+
		"\2\2\4<\3\2\2\2\6>\3\2\2\2\bH\3\2\2\2\nM\3\2\2\2\fW\3\2\2\2\16h\3\2\2"+
		"\2\20j\3\2\2\2\22y\3\2\2\2\24\u0091\3\2\2\2\26\30\5\4\3\2\27\26\3\2\2"+
		"\2\30\31\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\3\3\2\2\2\33\35\7\3\2"+
		"\2\34\36\5\f\7\2\35\34\3\2\2\2\36\37\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2"+
		" !\3\2\2\2!\"\7\23\2\2\"#\b\3\1\2#=\3\2\2\2$&\7\4\2\2%\'\5\f\7\2&%\3\2"+
		"\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)*\3\2\2\2*+\7\23\2\2+,\b\3\1\2,=\3"+
		"\2\2\2-.\7\5\2\2./\5\6\4\2/\60\7\23\2\2\60=\3\2\2\2\61\62\7\6\2\2\62\63"+
		"\5\n\6\2\63\64\7\23\2\2\64=\3\2\2\2\65\66\7\7\2\2\66\67\5\b\5\2\678\7"+
		"\23\2\28=\3\2\2\29:\7\b\2\2:=\b\3\1\2;=\7\23\2\2<\33\3\2\2\2<$\3\2\2\2"+
		"<-\3\2\2\2<\61\3\2\2\2<\65\3\2\2\2<9\3\2\2\2<;\3\2\2\2=\5\3\2\2\2>C\7"+
		"\21\2\2?@\7\t\2\2@B\7\21\2\2A?\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2D"+
		"F\3\2\2\2EC\3\2\2\2FG\b\4\1\2G\7\3\2\2\2HI\7\21\2\2IJ\7\n\2\2JK\5\20\t"+
		"\2KL\b\5\1\2L\t\3\2\2\2MR\7\21\2\2NO\7\t\2\2OQ\7\21\2\2PN\3\2\2\2QT\3"+
		"\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\b\6\1\2V\13\3\2\2\2W"+
		"X\5\16\b\2X`\b\7\1\2YZ\7\13\2\2Z[\5\16\b\2[\\\b\7\1\2\\_\3\2\2\2]_\7\25"+
		"\2\2^Y\3\2\2\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\r\3\2\2\2b`\3"+
		"\2\2\2cd\5\20\t\2de\b\b\1\2ei\3\2\2\2fg\7\26\2\2gi\b\b\1\2hc\3\2\2\2h"+
		"f\3\2\2\2i\17\3\2\2\2jk\5\22\n\2kv\b\t\1\2lm\7\13\2\2mn\5\22\n\2no\b\t"+
		"\1\2ou\3\2\2\2pq\7\f\2\2qr\5\22\n\2rs\b\t\1\2su\3\2\2\2tl\3\2\2\2tp\3"+
		"\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\21\3\2\2\2xv\3\2\2\2yz\5\24\13\2"+
		"z\u0085\b\n\1\2{|\7\r\2\2|}\5\24\13\2}~\b\n\1\2~\u0084\3\2\2\2\177\u0080"+
		"\7\16\2\2\u0080\u0081\5\24\13\2\u0081\u0082\b\n\1\2\u0082\u0084\3\2\2"+
		"\2\u0083{\3\2\2\2\u0083\177\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3"+
		"\2\2\2\u0085\u0086\3\2\2\2\u0086\23\3\2\2\2\u0087\u0085\3\2\2\2\u0088"+
		"\u0089\7\22\2\2\u0089\u0092\b\13\1\2\u008a\u008b\7\21\2\2\u008b\u0092"+
		"\b\13\1\2\u008c\u008d\7\17\2\2\u008d\u008e\5\20\t\2\u008e\u008f\7\20\2"+
		"\2\u008f\u0090\b\13\1\2\u0090\u0092\3\2\2\2\u0091\u0088\3\2\2\2\u0091"+
		"\u008a\3\2\2\2\u0091\u008c\3\2\2\2\u0092\25\3\2\2\2\20\31\37(<CR^`htv"+
		"\u0083\u0085\u0091";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
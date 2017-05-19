// Generated from E:/APL Assignments/SILAntlr/SILAntlr/src/main/java/apl\SIL.g4 by ANTLR 4.6
package apl.antlr;

import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SILLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, ID=15, INT=16, NEWLINE=17, 
		WS=18, COMMENT=19, LITERAL=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "ID", "INT", "NEWLINE", "WS", 
		"COMMENT", "LITERAL"
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


	/** Map variable name to Integer object holding value */
	HashMap memory = new HashMap();
	Scanner keyboard = new Scanner(System.in);



	public SILLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SIL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\26\u0092\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\6\20a\n\20\r\20\16\20b"+
		"\3\20\7\20f\n\20\f\20\16\20i\13\20\3\21\5\21l\n\21\3\21\6\21o\n\21\r\21"+
		"\16\21p\3\22\5\22t\n\22\3\22\3\22\3\23\6\23y\n\23\r\23\16\23z\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\7\24\u0083\n\24\f\24\16\24\u0086\13\24\3\24\3\24"+
		"\3\25\3\25\7\25\u008c\n\25\f\25\16\25\u008f\13\25\3\25\3\25\3\u008d\2"+
		"\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26\3\2\7\4\2C\\c|\6\2\62;C\\aac|\3\2\62;\4"+
		"\2\13\13\"\"\3\2\f\f\u0099\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2"+
		"\2\2\5\61\3\2\2\2\79\3\2\2\2\tA\3\2\2\2\13G\3\2\2\2\rK\3\2\2\2\17O\3\2"+
		"\2\2\21Q\3\2\2\2\23S\3\2\2\2\25U\3\2\2\2\27W\3\2\2\2\31Y\3\2\2\2\33[\3"+
		"\2\2\2\35]\3\2\2\2\37`\3\2\2\2!k\3\2\2\2#s\3\2\2\2%x\3\2\2\2\'~\3\2\2"+
		"\2)\u0089\3\2\2\2+,\7R\2\2,-\7T\2\2-.\7K\2\2./\7P\2\2/\60\7V\2\2\60\4"+
		"\3\2\2\2\61\62\7R\2\2\62\63\7T\2\2\63\64\7K\2\2\64\65\7P\2\2\65\66\7V"+
		"\2\2\66\67\7N\2\2\678\7P\2\28\6\3\2\2\29:\7K\2\2:;\7P\2\2;<\7V\2\2<=\7"+
		"G\2\2=>\7I\2\2>?\7G\2\2?@\7T\2\2@\b\3\2\2\2AB\7K\2\2BC\7P\2\2CD\7R\2\2"+
		"DE\7W\2\2EF\7V\2\2F\n\3\2\2\2GH\7N\2\2HI\7G\2\2IJ\7V\2\2J\f\3\2\2\2KL"+
		"\7G\2\2LM\7P\2\2MN\7F\2\2N\16\3\2\2\2OP\7.\2\2P\20\3\2\2\2QR\7?\2\2R\22"+
		"\3\2\2\2ST\7-\2\2T\24\3\2\2\2UV\7/\2\2V\26\3\2\2\2WX\7,\2\2X\30\3\2\2"+
		"\2YZ\7\61\2\2Z\32\3\2\2\2[\\\7*\2\2\\\34\3\2\2\2]^\7+\2\2^\36\3\2\2\2"+
		"_a\t\2\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2cg\3\2\2\2df\t\3\2\2"+
		"ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h \3\2\2\2ig\3\2\2\2jl\7/\2\2"+
		"kj\3\2\2\2kl\3\2\2\2ln\3\2\2\2mo\t\4\2\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2"+
		"pq\3\2\2\2q\"\3\2\2\2rt\7\17\2\2sr\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\7\f\2"+
		"\2v$\3\2\2\2wy\t\5\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{|\3\2\2"+
		"\2|}\b\23\2\2}&\3\2\2\2~\177\7\61\2\2\177\u0080\7\61\2\2\u0080\u0084\3"+
		"\2\2\2\u0081\u0083\n\6\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0087\u0088\b\24\2\2\u0088(\3\2\2\2\u0089\u008d\7$\2\2\u008a\u008c"+
		"\13\2\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008e\3\2\2\2"+
		"\u008d\u008b\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091"+
		"\7$\2\2\u0091*\3\2\2\2\13\2bgkpsz\u0084\u008d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
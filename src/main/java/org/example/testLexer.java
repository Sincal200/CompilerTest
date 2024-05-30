// Generated from C:/Users/sinca.SINCAL/IdeaProjects/ParserTest/src/main/java/org/example/test.g4 by ANTLR 4.13.1
package org.example;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class testLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, ID=8, NUM=9, INT_TYPE=10, 
		COMMENT=11, WS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "ID", "NUM", 
			"INT_TYPE", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'='", "'*'", "'+'", "'-'", "'/'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "ID", "NUM", "INT_TYPE", 
			"COMMENT", "WS"
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


	public testLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "test.g4"; }

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
		"\u0004\u0000\fW\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0005\u0007"+
		"*\b\u0007\n\u0007\f\u0007-\t\u0007\u0001\b\u0001\b\u0003\b1\b\b\u0001"+
		"\b\u0001\b\u0005\b5\b\b\n\b\f\b8\t\b\u0003\b:\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tD\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\nJ\b\n\n\n\f\nM\t\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0004\u000bR\b\u000b\u000b\u000b\f\u000bS\u0001\u000b\u0001\u000b\u0000"+
		"\u0000\f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0001\u0000"+
		"\u0006\u0001\u0000az\u0004\u000009AZ__az\u0001\u000019\u0001\u000009\u0002"+
		"\u0000\n\n\r\r\u0003\u0000\t\n\r\r  ]\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0001\u0019\u0001\u0000\u0000\u0000\u0003\u001b"+
		"\u0001\u0000\u0000\u0000\u0005\u001d\u0001\u0000\u0000\u0000\u0007\u001f"+
		"\u0001\u0000\u0000\u0000\t!\u0001\u0000\u0000\u0000\u000b#\u0001\u0000"+
		"\u0000\u0000\r%\u0001\u0000\u0000\u0000\u000f\'\u0001\u0000\u0000\u0000"+
		"\u00119\u0001\u0000\u0000\u0000\u0013C\u0001\u0000\u0000\u0000\u0015E"+
		"\u0001\u0000\u0000\u0000\u0017Q\u0001\u0000\u0000\u0000\u0019\u001a\u0005"+
		":\u0000\u0000\u001a\u0002\u0001\u0000\u0000\u0000\u001b\u001c\u0005=\u0000"+
		"\u0000\u001c\u0004\u0001\u0000\u0000\u0000\u001d\u001e\u0005*\u0000\u0000"+
		"\u001e\u0006\u0001\u0000\u0000\u0000\u001f \u0005+\u0000\u0000 \b\u0001"+
		"\u0000\u0000\u0000!\"\u0005-\u0000\u0000\"\n\u0001\u0000\u0000\u0000#"+
		"$\u0005/\u0000\u0000$\f\u0001\u0000\u0000\u0000%&\u0005^\u0000\u0000&"+
		"\u000e\u0001\u0000\u0000\u0000\'+\u0007\u0000\u0000\u0000(*\u0007\u0001"+
		"\u0000\u0000)(\u0001\u0000\u0000\u0000*-\u0001\u0000\u0000\u0000+)\u0001"+
		"\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,\u0010\u0001\u0000\u0000"+
		"\u0000-+\u0001\u0000\u0000\u0000.:\u00050\u0000\u0000/1\u0005-\u0000\u0000"+
		"0/\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u000012\u0001\u0000\u0000"+
		"\u000026\u0007\u0002\u0000\u000035\u0007\u0003\u0000\u000043\u0001\u0000"+
		"\u0000\u000058\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001"+
		"\u0000\u0000\u00007:\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u0000"+
		"9.\u0001\u0000\u0000\u000090\u0001\u0000\u0000\u0000:\u0012\u0001\u0000"+
		"\u0000\u0000;<\u0005I\u0000\u0000<=\u0005N\u0000\u0000=D\u0005T\u0000"+
		"\u0000>?\u0005F\u0000\u0000?@\u0005L\u0000\u0000@A\u0005O\u0000\u0000"+
		"AB\u0005A\u0000\u0000BD\u0005T\u0000\u0000C;\u0001\u0000\u0000\u0000C"+
		">\u0001\u0000\u0000\u0000D\u0014\u0001\u0000\u0000\u0000EF\u0005-\u0000"+
		"\u0000FG\u0005-\u0000\u0000GK\u0001\u0000\u0000\u0000HJ\b\u0004\u0000"+
		"\u0000IH\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000"+
		"\u0000\u0000KL\u0001\u0000\u0000\u0000LN\u0001\u0000\u0000\u0000MK\u0001"+
		"\u0000\u0000\u0000NO\u0006\n\u0000\u0000O\u0016\u0001\u0000\u0000\u0000"+
		"PR\u0007\u0005\u0000\u0000QP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000"+
		"\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0001\u0000"+
		"\u0000\u0000UV\u0006\u000b\u0000\u0000V\u0018\u0001\u0000\u0000\u0000"+
		"\b\u0000+069CKS\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
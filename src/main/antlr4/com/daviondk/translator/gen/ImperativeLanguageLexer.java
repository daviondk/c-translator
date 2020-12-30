// Generated from /Users/daviondk/IdeaProjects/c-translator/src/main/antlr4/com/daviondk/translator/ImperativeLanguageLexer.g4 by ANTLR 4.9
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ImperativeLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHILE=1, FOR=2, IN=3, READINT=4, READDOUBLE=5, READ=6, PRINT=7, PRINTINT=8, 
		PRINTDOUBLE=9, PRINTLN=10, IF=11, ELSE=12, ADD=13, SUB=14, MUL=15, DIV=16, 
		MOD=17, EQ=18, NE=19, LT=20, GT=21, GE=22, LE=23, AND=24, OR=25, XOR=26, 
		NOT=27, LPAREN=28, RPAREN=29, LBRACE=30, RBRACE=31, RANGE=32, SEMICOLON=33, 
		COLON=34, COMMA=35, NEWLINE=36, WS=37, VAR=38, VAL=39, ASSIGN=40, DEF=41, 
		RETURN=42, MAIN=43, BOOLEAN=44, TYPENAME=45, INT=46, STRING=47, DOUBLE=48, 
		NAME=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WHILE", "FOR", "IN", "READINT", "READDOUBLE", "READ", "PRINT", "PRINTINT", 
			"PRINTDOUBLE", "PRINTLN", "IF", "ELSE", "ADD", "SUB", "MUL", "DIV", "MOD", 
			"EQ", "NE", "LT", "GT", "GE", "LE", "AND", "OR", "XOR", "NOT", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "RANGE", "SEMICOLON", "COLON", "COMMA", 
			"NEWLINE", "WS", "VAR", "VAL", "ASSIGN", "DEF", "RETURN", "MAIN", "BOOLEAN", 
			"TYPENAME", "INT", "STRING", "DOUBLE", "NAME"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'while'", "'for'", "'in'", "'readInt'", "'readDouble'", "'read'", 
			"'print'", "'printInt'", "'printDouble'", "'println'", "'if'", "'else'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'=='", "'!='", "'<'", "'>'", "'>='", 
			"'<='", "'and'", "'or'", "'xor'", "'not'", "'('", "')'", "'{'", "'}'", 
			"'..'", "';'", "':'", "','", null, null, "'var'", "'val'", "'='", null, 
			"'return'", "'main'", null, null, null, "'\".*\"'", "'-*[0-9]+.[0-9]*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHILE", "FOR", "IN", "READINT", "READDOUBLE", "READ", "PRINT", 
			"PRINTINT", "PRINTDOUBLE", "PRINTLN", "IF", "ELSE", "ADD", "SUB", "MUL", 
			"DIV", "MOD", "EQ", "NE", "LT", "GT", "GE", "LE", "AND", "OR", "XOR", 
			"NOT", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "RANGE", "SEMICOLON", 
			"COLON", "COMMA", "NEWLINE", "WS", "VAR", "VAL", "ASSIGN", "DEF", "RETURN", 
			"MAIN", "BOOLEAN", "TYPENAME", "INT", "STRING", "DOUBLE", "NAME"
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


	public ImperativeLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ImperativeLanguageLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u015b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!"+
		"\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\5%\u00f3\n%\3&\6&\u00f6\n&\r&\16&"+
		"\u00f7\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\5*\u010f\n*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\5-\u0126\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0142\n.\3/\7/\u0145\n/\f/\16/\u0148"+
		"\13/\3/\6/\u014b\n/\r/\16/\u014c\3\60\3\60\3\60\3\60\3\60\3\61\3\62\3"+
		"\62\7\62\u0157\n\62\f\62\16\62\u015a\13\62\2\2\63\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63\3\2\7\4\2\f\ftt\4\2\13\13\"\"\3\2\62;\5"+
		"\2C\\aac|\6\2\62;C\\aac|\2\u0164\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3e\3\2\2\2\5k\3\2\2\2"+
		"\7o\3\2\2\2\tr\3\2\2\2\13z\3\2\2\2\r\u0085\3\2\2\2\17\u008a\3\2\2\2\21"+
		"\u0090\3\2\2\2\23\u0099\3\2\2\2\25\u00a5\3\2\2\2\27\u00ad\3\2\2\2\31\u00b0"+
		"\3\2\2\2\33\u00b5\3\2\2\2\35\u00b7\3\2\2\2\37\u00b9\3\2\2\2!\u00bb\3\2"+
		"\2\2#\u00bd\3\2\2\2%\u00bf\3\2\2\2\'\u00c2\3\2\2\2)\u00c5\3\2\2\2+\u00c7"+
		"\3\2\2\2-\u00c9\3\2\2\2/\u00cc\3\2\2\2\61\u00cf\3\2\2\2\63\u00d3\3\2\2"+
		"\2\65\u00d6\3\2\2\2\67\u00da\3\2\2\29\u00de\3\2\2\2;\u00e0\3\2\2\2=\u00e2"+
		"\3\2\2\2?\u00e4\3\2\2\2A\u00e6\3\2\2\2C\u00e9\3\2\2\2E\u00eb\3\2\2\2G"+
		"\u00ed\3\2\2\2I\u00f2\3\2\2\2K\u00f5\3\2\2\2M\u00fb\3\2\2\2O\u00ff\3\2"+
		"\2\2Q\u0103\3\2\2\2S\u010e\3\2\2\2U\u0110\3\2\2\2W\u0117\3\2\2\2Y\u0125"+
		"\3\2\2\2[\u0141\3\2\2\2]\u0146\3\2\2\2_\u014e\3\2\2\2a\u0153\3\2\2\2c"+
		"\u0154\3\2\2\2ef\7y\2\2fg\7j\2\2gh\7k\2\2hi\7n\2\2ij\7g\2\2j\4\3\2\2\2"+
		"kl\7h\2\2lm\7q\2\2mn\7t\2\2n\6\3\2\2\2op\7k\2\2pq\7p\2\2q\b\3\2\2\2rs"+
		"\7t\2\2st\7g\2\2tu\7c\2\2uv\7f\2\2vw\7K\2\2wx\7p\2\2xy\7v\2\2y\n\3\2\2"+
		"\2z{\7t\2\2{|\7g\2\2|}\7c\2\2}~\7f\2\2~\177\7F\2\2\177\u0080\7q\2\2\u0080"+
		"\u0081\7w\2\2\u0081\u0082\7d\2\2\u0082\u0083\7n\2\2\u0083\u0084\7g\2\2"+
		"\u0084\f\3\2\2\2\u0085\u0086\7t\2\2\u0086\u0087\7g\2\2\u0087\u0088\7c"+
		"\2\2\u0088\u0089\7f\2\2\u0089\16\3\2\2\2\u008a\u008b\7r\2\2\u008b\u008c"+
		"\7t\2\2\u008c\u008d\7k\2\2\u008d\u008e\7p\2\2\u008e\u008f\7v\2\2\u008f"+
		"\20\3\2\2\2\u0090\u0091\7r\2\2\u0091\u0092\7t\2\2\u0092\u0093\7k\2\2\u0093"+
		"\u0094\7p\2\2\u0094\u0095\7v\2\2\u0095\u0096\7K\2\2\u0096\u0097\7p\2\2"+
		"\u0097\u0098\7v\2\2\u0098\22\3\2\2\2\u0099\u009a\7r\2\2\u009a\u009b\7"+
		"t\2\2\u009b\u009c\7k\2\2\u009c\u009d\7p\2\2\u009d\u009e\7v\2\2\u009e\u009f"+
		"\7F\2\2\u009f\u00a0\7q\2\2\u00a0\u00a1\7w\2\2\u00a1\u00a2\7d\2\2\u00a2"+
		"\u00a3\7n\2\2\u00a3\u00a4\7g\2\2\u00a4\24\3\2\2\2\u00a5\u00a6\7r\2\2\u00a6"+
		"\u00a7\7t\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7p\2\2\u00a9\u00aa\7v\2\2"+
		"\u00aa\u00ab\7n\2\2\u00ab\u00ac\7p\2\2\u00ac\26\3\2\2\2\u00ad\u00ae\7"+
		"k\2\2\u00ae\u00af\7h\2\2\u00af\30\3\2\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2"+
		"\7n\2\2\u00b2\u00b3\7u\2\2\u00b3\u00b4\7g\2\2\u00b4\32\3\2\2\2\u00b5\u00b6"+
		"\7-\2\2\u00b6\34\3\2\2\2\u00b7\u00b8\7/\2\2\u00b8\36\3\2\2\2\u00b9\u00ba"+
		"\7,\2\2\u00ba \3\2\2\2\u00bb\u00bc\7\61\2\2\u00bc\"\3\2\2\2\u00bd\u00be"+
		"\7\'\2\2\u00be$\3\2\2\2\u00bf\u00c0\7?\2\2\u00c0\u00c1\7?\2\2\u00c1&\3"+
		"\2\2\2\u00c2\u00c3\7#\2\2\u00c3\u00c4\7?\2\2\u00c4(\3\2\2\2\u00c5\u00c6"+
		"\7>\2\2\u00c6*\3\2\2\2\u00c7\u00c8\7@\2\2\u00c8,\3\2\2\2\u00c9\u00ca\7"+
		"@\2\2\u00ca\u00cb\7?\2\2\u00cb.\3\2\2\2\u00cc\u00cd\7>\2\2\u00cd\u00ce"+
		"\7?\2\2\u00ce\60\3\2\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2"+
		"\7f\2\2\u00d2\62\3\2\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7t\2\2\u00d5\64"+
		"\3\2\2\2\u00d6\u00d7\7z\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7t\2\2\u00d9"+
		"\66\3\2\2\2\u00da\u00db\7p\2\2\u00db\u00dc\7q\2\2\u00dc\u00dd\7v\2\2\u00dd"+
		"8\3\2\2\2\u00de\u00df\7*\2\2\u00df:\3\2\2\2\u00e0\u00e1\7+\2\2\u00e1<"+
		"\3\2\2\2\u00e2\u00e3\7}\2\2\u00e3>\3\2\2\2\u00e4\u00e5\7\177\2\2\u00e5"+
		"@\3\2\2\2\u00e6\u00e7\7\60\2\2\u00e7\u00e8\7\60\2\2\u00e8B\3\2\2\2\u00e9"+
		"\u00ea\7=\2\2\u00eaD\3\2\2\2\u00eb\u00ec\7<\2\2\u00ecF\3\2\2\2\u00ed\u00ee"+
		"\7.\2\2\u00eeH\3\2\2\2\u00ef\u00f0\7\17\2\2\u00f0\u00f3\7\f\2\2\u00f1"+
		"\u00f3\t\2\2\2\u00f2\u00ef\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3J\3\2\2\2"+
		"\u00f4\u00f6\t\3\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5"+
		"\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\b&\2\2\u00fa"+
		"L\3\2\2\2\u00fb\u00fc\7x\2\2\u00fc\u00fd\7c\2\2\u00fd\u00fe\7t\2\2\u00fe"+
		"N\3\2\2\2\u00ff\u0100\7x\2\2\u0100\u0101\7c\2\2\u0101\u0102\7n\2\2\u0102"+
		"P\3\2\2\2\u0103\u0104\7?\2\2\u0104R\3\2\2\2\u0105\u0106\7f\2\2\u0106\u0107"+
		"\7g\2\2\u0107\u010f\7h\2\2\u0108\u0109\7f\2\2\u0109\u010a\7g\2\2\u010a"+
		"\u010b\7h\2\2\u010b\u010c\7k\2\2\u010c\u010d\7p\2\2\u010d\u010f\7g\2\2"+
		"\u010e\u0105\3\2\2\2\u010e\u0108\3\2\2\2\u010fT\3\2\2\2\u0110\u0111\7"+
		"t\2\2\u0111\u0112\7g\2\2\u0112\u0113\7v\2\2\u0113\u0114\7w\2\2\u0114\u0115"+
		"\7t\2\2\u0115\u0116\7p\2\2\u0116V\3\2\2\2\u0117\u0118\7o\2\2\u0118\u0119"+
		"\7c\2\2\u0119\u011a\7k\2\2\u011a\u011b\7p\2\2\u011bX\3\2\2\2\u011c\u011d"+
		"\7v\2\2\u011d\u011e\7t\2\2\u011e\u011f\7w\2\2\u011f\u0126\7g\2\2\u0120"+
		"\u0121\7h\2\2\u0121\u0122\7c\2\2\u0122\u0123\7n\2\2\u0123\u0124\7u\2\2"+
		"\u0124\u0126\7g\2\2\u0125\u011c\3\2\2\2\u0125\u0120\3\2\2\2\u0126Z\3\2"+
		"\2\2\u0127\u0128\7k\2\2\u0128\u0129\7p\2\2\u0129\u012a\7v\2\2\u012a\u012b"+
		"\7g\2\2\u012b\u012c\7i\2\2\u012c\u012d\7g\2\2\u012d\u0142\7t\2\2\u012e"+
		"\u012f\7f\2\2\u012f\u0130\7q\2\2\u0130\u0131\7w\2\2\u0131\u0132\7d\2\2"+
		"\u0132\u0133\7n\2\2\u0133\u0142\7g\2\2\u0134\u0135\7u\2\2\u0135\u0136"+
		"\7v\2\2\u0136\u0137\7t\2\2\u0137\u0138\7k\2\2\u0138\u0139\7p\2\2\u0139"+
		"\u0142\7i\2\2\u013a\u013b\7d\2\2\u013b\u013c\7q\2\2\u013c\u013d\7q\2\2"+
		"\u013d\u013e\7n\2\2\u013e\u013f\7g\2\2\u013f\u0140\7c\2\2\u0140\u0142"+
		"\7p\2\2\u0141\u0127\3\2\2\2\u0141\u012e\3\2\2\2\u0141\u0134\3\2\2\2\u0141"+
		"\u013a\3\2\2\2\u0142\\\3\2\2\2\u0143\u0145\7/\2\2\u0144\u0143\3\2\2\2"+
		"\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u014a"+
		"\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014b\t\4\2\2\u014a\u0149\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d^\3\2\2\2"+
		"\u014e\u014f\7$\2\2\u014f\u0150\7\60\2\2\u0150\u0151\7,\2\2\u0151\u0152"+
		"\7$\2\2\u0152`\3\2\2\2\u0153b\3\2\2\2\u0154\u0158\t\5\2\2\u0155\u0157"+
		"\t\6\2\2\u0156\u0155\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159d\3\2\2\2\u015a\u0158\3\2\2\2\13\2\u00f2\u00f7\u010e"+
		"\u0125\u0141\u0146\u014c\u0158\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
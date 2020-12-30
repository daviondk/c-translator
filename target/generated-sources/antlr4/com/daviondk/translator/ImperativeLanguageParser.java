// Generated from com/daviondk/translator/ImperativeLanguageParser.g4 by ANTLR 4.9
package com.daviondk.translator;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ImperativeLanguageParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_statements = 1, RULE_function = 2, RULE_args = 3, 
		RULE_type = 4, RULE_functionBody = 5, RULE_statement = 6, RULE_callUser = 7, 
		RULE_callArgs = 8, RULE_assignment = 9, RULE_value = 10, RULE_callRead = 11, 
		RULE_callReadInt = 12, RULE_callReadDouble = 13, RULE_callReadString = 14, 
		RULE_callPrint = 15, RULE_expr = 16, RULE_maxExpr = 17, RULE_unary = 18, 
		RULE_recExpr = 19, RULE_logical = 20, RULE_conditionStatement = 21, RULE_condition = 22, 
		RULE_cycleStatement = 23, RULE_whileStatement = 24, RULE_forStatement = 25, 
		RULE_defVariable = 26, RULE_returnStatement = 27, RULE_mainStatement = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statements", "function", "args", "type", "functionBody", 
			"statement", "callUser", "callArgs", "assignment", "value", "callRead", 
			"callReadInt", "callReadDouble", "callReadString", "callPrint", "expr", 
			"maxExpr", "unary", "recExpr", "logical", "conditionStatement", "condition", 
			"cycleStatement", "whileStatement", "forStatement", "defVariable", "returnStatement", 
			"mainStatement"
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
			"'return'", "'main'", null, null, null, "'\".*\"'"
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

	@Override
	public String getGrammarFileName() { return "ImperativeLanguageParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ImperativeLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ImperativeLanguageParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperativeLanguageParserVisitor ) return ((ImperativeLanguageParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			statements();
			setState(59);
			match(EOF);
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

	public static class StatementsContext extends ParserRuleContext {
		public List<DefVariableContext> defVariable() {
			return getRuleContexts(DefVariableContext.class);
		}
		public DefVariableContext defVariable(int i) {
			return getRuleContext(DefVariableContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public MainStatementContext mainStatement() {
			return getRuleContext(MainStatementContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperativeLanguageParserVisitor ) return ((ImperativeLanguageParserVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(63);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TYPENAME:
						{
						setState(61);
						defVariable();
						}
						break;
					case DEF:
						{
						setState(62);
						function();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(68);
				mainStatement();
				}
				break;
			}
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEF || _la==TYPENAME) {
				{
				setState(73);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TYPENAME:
					{
					setState(71);
					defVariable();
					}
					break;
				case DEF:
					{
					setState(72);
					function();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(77);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(ImperativeLanguageParser.DEF, 0); }
		public TerminalNode NAME() { return getToken(ImperativeLanguageParser.NAME, 0); }
		public TerminalNode LPAREN() { return getToken(ImperativeLanguageParser.LPAREN, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ImperativeLanguageParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(ImperativeLanguageParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperativeLanguageParserVisitor ) return ((ImperativeLanguageParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(DEF);
			setState(79);
			match(NAME);
			setState(80);
			match(LPAREN);
			setState(81);
			args();
			setState(82);
			match(RPAREN);
			setState(83);
			match(COLON);
			setState(84);
			type();
			setState(85);
			functionBody();
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

	public static class ArgsContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(ImperativeLanguageParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(ImperativeLanguageParser.NAME, i);
		}
		public List<TerminalNode> COLON() { return getTokens(ImperativeLanguageParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(ImperativeLanguageParser.COLON, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ImperativeLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ImperativeLanguageParser.COMMA, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperativeLanguageParserVisitor ) return ((ImperativeLanguageParserVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(87);
				match(NAME);
				setState(88);
				match(COLON);
				setState(89);
				type();
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(90);
					match(COMMA);
					setState(91);
					match(NAME);
					setState(92);
					match(COLON);
					setState(93);
					type();
					}
					}
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TYPENAME() { return getToken(ImperativeLanguageParser.TYPENAME, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperativeLanguageParserVisitor ) return ((ImperativeLanguageParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(TYPENAME);
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

	public static class FunctionBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ImperativeLanguageParser.LBRACE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ImperativeLanguageParser.RBRACE, 0); }
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperativeLanguageParserVisitor ) return ((ImperativeLanguageParserVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(LBRACE);
			setState(104);
			statement();
			setState(105);
			returnStatement();
			setState(106);
			match(RBRACE);
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

	public static class StatementContext extends ParserRuleContext {
		public List<CallUserContext> callUser() {
			return getRuleContexts(CallUserContext.class);
		}
		public CallUserContext callUser(int i) {
			return getRuleContext(CallUserContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(ImperativeLanguageParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ImperativeLanguageParser.SEMICOLON, i);
		}
		public List<DefVariableContext> defVariable() {
			return getRuleContexts(DefVariableContext.class);
		}
		public DefVariableContext defVariable(int i) {
			return getRuleContext(DefVariableContext.class,i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<CallPrintContext> callPrint() {
			return getRuleContexts(CallPrintContext.class);
		}
		public CallPrintContext callPrint(int i) {
			return getRuleContext(CallPrintContext.class,i);
		}
		public List<ConditionStatementContext> conditionStatement() {
			return getRuleContexts(ConditionStatementContext.class);
		}
		public ConditionStatementContext conditionStatement(int i) {
			return getRuleContext(ConditionStatementContext.class,i);
		}
		public List<CycleStatementContext> cycleStatement() {
			return getRuleContexts(CycleStatementContext.class);
		}
		public CycleStatementContext cycleStatement(int i) {
			return getRuleContext(CycleStatementContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperativeLanguageParserVisitor ) return ((ImperativeLanguageParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << FOR) | (1L << PRINT) | (1L << PRINTINT) | (1L << PRINTDOUBLE) | (1L << PRINTLN) | (1L << IF) | (1L << NOT) | (1L << LPAREN) | (1L << BOOLEAN) | (1L << TYPENAME) | (1L << INT) | (1L << STRING) | (1L << DOUBLE) | (1L << NAME))) != 0)) {
				{
				setState(121);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(108);
					callUser();
					setState(109);
					match(SEMICOLON);
					}
					break;
				case 2:
					{
					setState(111);
					defVariable();
					}
					break;
				case 3:
					{
					setState(112);
					assignment();
					}
					break;
				case 4:
					{
					setState(113);
					callPrint();
					setState(114);
					match(SEMICOLON);
					}
					break;
				case 5:
					{
					setState(116);
					conditionStatement();
					}
					break;
				case 6:
					{
					setState(117);
					cycleStatement();
					}
					break;
				case 7:
					{
					setState(118);
					expr(0);
					setState(119);
					match(SEMICOLON);
					}
					break;
				}
				}
				setState(125);
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

	public static class CallUserContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ImperativeLanguageParser.NAME, 0); }
		public TerminalNode LPAREN() { return getToken(ImperativeLanguageParser.LPAREN, 0); }
		public CallArgsContext callArgs() {
			return getRuleContext(CallArgsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ImperativeLanguageParser.RPAREN, 0); }
		public CallUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callUser; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).enterCallUser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).exitCallUser(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperativeLanguageParserVisitor ) return ((ImperativeLanguageParserVisitor<? extends T>)visitor).visitCallUser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallUserContext callUser() throws RecognitionException {
		CallUserContext _localctx = new CallUserContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_callUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(NAME);
			setState(127);
			match(LPAREN);
			setState(128);
			callArgs();
			setState(129);
			match(RPAREN);
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

	public static class CallArgsContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(ImperativeLanguageParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(ImperativeLanguageParser.NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ImperativeLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ImperativeLanguageParser.COMMA, i);
		}
		public CallArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).enterCallArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).exitCallArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperativeLanguageParserVisitor ) return ((ImperativeLanguageParserVisitor<? extends T>)visitor).visitCallArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallArgsContext callArgs() throws RecognitionException {
		CallArgsContext _localctx = new CallArgsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_callArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(131);
				match(NAME);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(132);
					match(COMMA);
					setState(133);
					match(NAME);
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ImperativeLanguageParser.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(ImperativeLanguageParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(ImperativeLanguageParser.SEMICOLON, 0); }
		public CallReadContext callRead() {
			return getRuleContext(CallReadContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperativeLanguageParserVisitor ) return ((ImperativeLanguageParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(NAME);
			setState(142);
			match(ASSIGN);
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READINT:
			case READDOUBLE:
			case READ:
				{
				setState(143);
				callRead();
				}
				break;
			case NOT:
			case LPAREN:
			case BOOLEAN:
			case INT:
			case STRING:
			case DOUBLE:
			case NAME:
				{
				setState(144);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(147);
			match(SEMICOLON);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ImperativeLanguageParser.INT, 0); }
		public TerminalNode STRING() { return getToken(ImperativeLanguageParser.STRING, 0); }
		public TerminalNode DOUBLE() { return getToken(ImperativeLanguageParser.DOUBLE, 0); }
		public TerminalNode BOOLEAN() { return getToken(ImperativeLanguageParser.BOOLEAN, 0); }
		public TerminalNode NAME() { return getToken(ImperativeLanguageParser.NAME, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperativeLanguageParserVisitor ) return ((ImperativeLanguageParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << STRING) | (1L << DOUBLE) | (1L << NAME))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class CallReadContext extends ParserRuleContext {
		public CallReadIntContext callReadInt() {
			return getRuleContext(CallReadIntContext.class,0);
		}
		public CallReadDoubleContext callReadDouble() {
			return getRuleContext(CallReadDoubleContext.class,0);
		}
		public CallReadStringContext callReadString() {
			return getRuleContext(CallReadStringContext.class,0);
		}
		public CallReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callRead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).enterCallRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).exitCallRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperativeLanguageParserVisitor ) return ((ImperativeLanguageParserVisitor<? extends T>)visitor).visitCallRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallReadContext callRead() throws RecognitionException {
		CallReadContext _localctx = new CallReadContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_callRead);
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				callReadInt();
				}
				break;
			case READDOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				callReadDouble();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				callReadString();
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

	public static class CallReadIntContext extends ParserRuleContext {
		public TerminalNode READINT() { return getToken(ImperativeLanguageParser.READINT, 0); }
		public TerminalNode LPAREN() { return getToken(ImperativeLanguageParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ImperativeLanguageParser.RPAREN, 0); }
		public CallReadIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callReadInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).enterCallReadInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).exitCallReadInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperativeLanguageParserVisitor ) return ((ImperativeLanguageParserVisitor<? extends T>)visitor).visitCallReadInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallReadIntContext callReadInt() throws RecognitionException {
		CallReadIntContext _localctx = new CallReadIntContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_callReadInt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(READINT);
			setState(157);
			match(LPAREN);
			setState(158);
			match(RPAREN);
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

	public static class CallReadDoubleContext extends ParserRuleContext {
		public TerminalNode READDOUBLE() { return getToken(ImperativeLanguageParser.READDOUBLE, 0); }
		public TerminalNode LPAREN() { return getToken(ImperativeLanguageParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ImperativeLanguageParser.RPAREN, 0); }
		public CallReadDoubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callReadDouble; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).enterCallReadDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).exitCallReadDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperativeLanguageParserVisitor ) return ((ImperativeLanguageParserVisitor<? extends T>)visitor).visitCallReadDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallReadDoubleContext callReadDouble() throws RecognitionException {
		CallReadDoubleContext _localctx = new CallReadDoubleContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_callReadDouble);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(READDOUBLE);
			setState(161);
			match(LPAREN);
			setState(162);
			match(RPAREN);
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

	public static class CallReadStringContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(ImperativeLanguageParser.READ, 0); }
		public TerminalNode LPAREN() { return getToken(ImperativeLanguageParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ImperativeLanguageParser.RPAREN, 0); }
		public CallReadStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callReadString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).enterCallReadString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).exitCallReadString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperativeLanguageParserVisitor ) return ((ImperativeLanguageParserVisitor<? extends T>)visitor).visitCallReadString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallReadStringContext callReadString() throws RecognitionException {
		CallReadStringContext _localctx = new CallReadStringContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_callReadString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(READ);
			setState(165);
			match(LPAREN);
			setState(166);
			match(RPAREN);
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

	public static class CallPrintContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ImperativeLanguageParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ImperativeLanguageParser.RPAREN, 0); }
		public TerminalNode PRINT() { return getToken(ImperativeLanguageParser.PRINT, 0); }
		public TerminalNode PRINTLN() { return getToken(ImperativeLanguageParser.PRINTLN, 0); }
		public TerminalNode PRINTINT() { return getToken(ImperativeLanguageParser.PRINTINT, 0); }
		public TerminalNode PRINTDOUBLE() { return getToken(ImperativeLanguageParser.PRINTDOUBLE, 0); }
		public CallPrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callPrint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).enterCallPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).exitCallPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperativeLanguageParserVisitor ) return ((ImperativeLanguageParserVisitor<? extends T>)visitor).visitCallPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallPrintContext callPrint() throws RecognitionException {
		CallPrintContext _localctx = new CallPrintContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_callPrint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << PRINTINT) | (1L << PRINTDOUBLE) | (1L << PRINTLN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(169);
			match(LPAREN);
			setState(170);
			expr(0);
			setState(171);
			match(RPAREN);
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
		public MaxExprContext maxExpr() {
			return getRuleContext(MaxExprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ADD() { return getToken(ImperativeLanguageParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ImperativeLanguageParser.SUB, 0); }
		public TerminalNode XOR() { return getToken(ImperativeLanguageParser.XOR, 0); }
		public TerminalNode OR() { return getToken(ImperativeLanguageParser.OR, 0); }
		public LogicalContext logical() {
			return getRuleContext(LogicalContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperativeLanguageParserVisitor ) return ((ImperativeLanguageParserVisitor<? extends T>)visitor).visitExpr(this);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(174);
			maxExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(192);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(176);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(177);
						match(ADD);
						setState(178);
						maxExpr(0);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(179);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(180);
						match(SUB);
						setState(181);
						maxExpr(0);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(182);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(183);
						match(XOR);
						setState(184);
						maxExpr(0);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(185);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(186);
						match(OR);
						setState(187);
						maxExpr(0);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(188);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(189);
						logical();
						setState(190);
						maxExpr(0);
						}
						break;
					}
					} 
				}
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class MaxExprContext extends ParserRuleContext {
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public MaxExprContext maxExpr() {
			return getRuleContext(MaxExprContext.class,0);
		}
		public TerminalNode MUL() { return getToken(ImperativeLanguageParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ImperativeLanguageParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(ImperativeLanguageParser.MOD, 0); }
		public TerminalNode AND() { return getToken(ImperativeLanguageParser.AND, 0); }
		public MaxExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maxExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).enterMaxExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).exitMaxExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperativeLanguageParserVisitor ) return ((ImperativeLanguageParserVisitor<? extends T>)visitor).visitMaxExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaxExprContext maxExpr() throws RecognitionException {
		return maxExpr(0);
	}

	private MaxExprContext maxExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MaxExprContext _localctx = new MaxExprContext(_ctx, _parentState);
		MaxExprContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_maxExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(198);
			unary();
			}
			_ctx.stop = _input.LT(-1);
			setState(214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(212);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new MaxExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_maxExpr);
						setState(200);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(201);
						match(MUL);
						setState(202);
						unary();
						}
						break;
					case 2:
						{
						_localctx = new MaxExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_maxExpr);
						setState(203);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(204);
						match(DIV);
						setState(205);
						unary();
						}
						break;
					case 3:
						{
						_localctx = new MaxExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_maxExpr);
						setState(206);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(207);
						match(MOD);
						setState(208);
						unary();
						}
						break;
					case 4:
						{
						_localctx = new MaxExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_maxExpr);
						setState(209);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(210);
						match(AND);
						setState(211);
						unary();
						}
						break;
					}
					} 
				}
				setState(216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class UnaryContext extends ParserRuleContext {
		public RecExprContext recExpr() {
			return getRuleContext(RecExprContext.class,0);
		}
		public TerminalNode NOT() { return getToken(ImperativeLanguageParser.NOT, 0); }
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).exitUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperativeLanguageParserVisitor ) return ((ImperativeLanguageParserVisitor<? extends T>)visitor).visitUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_unary);
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
			case BOOLEAN:
			case INT:
			case STRING:
			case DOUBLE:
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				recExpr();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(NOT);
				setState(219);
				unary();
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

	public static class RecExprContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public CallUserContext callUser() {
			return getRuleContext(CallUserContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ImperativeLanguageParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ImperativeLanguageParser.RPAREN, 0); }
		public RecExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).enterRecExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).exitRecExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperativeLanguageParserVisitor ) return ((ImperativeLanguageParserVisitor<? extends T>)visitor).visitRecExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecExprContext recExpr() throws RecognitionException {
		RecExprContext _localctx = new RecExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_recExpr);
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				callUser();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				match(LPAREN);
				setState(225);
				expr(0);
				setState(226);
				match(RPAREN);
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

	public static class LogicalContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(ImperativeLanguageParser.EQ, 0); }
		public TerminalNode NE() { return getToken(ImperativeLanguageParser.NE, 0); }
		public TerminalNode LT() { return getToken(ImperativeLanguageParser.LT, 0); }
		public TerminalNode GT() { return getToken(ImperativeLanguageParser.GT, 0); }
		public TerminalNode GE() { return getToken(ImperativeLanguageParser.GE, 0); }
		public TerminalNode LE() { return getToken(ImperativeLanguageParser.LE, 0); }
		public LogicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).enterLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).exitLogical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperativeLanguageParserVisitor ) return ((ImperativeLanguageParserVisitor<? extends T>)visitor).visitLogical(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalContext logical() throws RecognitionException {
		LogicalContext _localctx = new LogicalContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_logical);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << LT) | (1L << GT) | (1L << GE) | (1L << LE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ConditionStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ImperativeLanguageParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(ImperativeLanguageParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ImperativeLanguageParser.RPAREN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(ImperativeLanguageParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(ImperativeLanguageParser.LBRACE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(ImperativeLanguageParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(ImperativeLanguageParser.RBRACE, i);
		}
		public TerminalNode ELSE() { return getToken(ImperativeLanguageParser.ELSE, 0); }
		public ConditionStatementContext conditionStatement() {
			return getRuleContext(ConditionStatementContext.class,0);
		}
		public ConditionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).enterConditionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).exitConditionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperativeLanguageParserVisitor ) return ((ImperativeLanguageParserVisitor<? extends T>)visitor).visitConditionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionStatementContext conditionStatement() throws RecognitionException {
		ConditionStatementContext _localctx = new ConditionStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_conditionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(IF);
			setState(233);
			match(LPAREN);
			setState(234);
			expr(0);
			setState(235);
			match(RPAREN);
			setState(236);
			match(LBRACE);
			setState(237);
			statement();
			setState(238);
			match(RBRACE);
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(239);
				match(ELSE);
				setState(245);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(240);
					conditionStatement();
					}
					break;
				case LBRACE:
					{
					setState(241);
					match(LBRACE);
					setState(242);
					statement();
					setState(243);
					match(RBRACE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class ConditionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperativeLanguageParserVisitor ) return ((ImperativeLanguageParserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
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

	public static class CycleStatementContext extends ParserRuleContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public CycleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cycleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).enterCycleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).exitCycleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperativeLanguageParserVisitor ) return ((ImperativeLanguageParserVisitor<? extends T>)visitor).visitCycleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CycleStatementContext cycleStatement() throws RecognitionException {
		CycleStatementContext _localctx = new CycleStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cycleStatement);
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				whileStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				forStatement();
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ImperativeLanguageParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(ImperativeLanguageParser.LPAREN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ImperativeLanguageParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(ImperativeLanguageParser.LBRACE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ImperativeLanguageParser.RBRACE, 0); }
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperativeLanguageParserVisitor ) return ((ImperativeLanguageParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(WHILE);
			setState(256);
			match(LPAREN);
			setState(257);
			condition();
			setState(258);
			match(RPAREN);
			setState(259);
			match(LBRACE);
			setState(260);
			statement();
			setState(261);
			match(RBRACE);
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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(ImperativeLanguageParser.FOR, 0); }
		public TerminalNode NAME() { return getToken(ImperativeLanguageParser.NAME, 0); }
		public TerminalNode IN() { return getToken(ImperativeLanguageParser.IN, 0); }
		public List<TerminalNode> INT() { return getTokens(ImperativeLanguageParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ImperativeLanguageParser.INT, i);
		}
		public TerminalNode RANGE() { return getToken(ImperativeLanguageParser.RANGE, 0); }
		public TerminalNode LBRACE() { return getToken(ImperativeLanguageParser.LBRACE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ImperativeLanguageParser.RBRACE, 0); }
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperativeLanguageParserVisitor ) return ((ImperativeLanguageParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(FOR);
			setState(264);
			match(NAME);
			setState(265);
			match(IN);
			setState(266);
			match(INT);
			setState(267);
			match(RANGE);
			setState(268);
			match(INT);
			setState(269);
			match(LBRACE);
			setState(270);
			statement();
			setState(271);
			match(RBRACE);
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

	public static class DefVariableContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public DefVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).enterDefVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).exitDefVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperativeLanguageParserVisitor ) return ((ImperativeLanguageParserVisitor<? extends T>)visitor).visitDefVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefVariableContext defVariable() throws RecognitionException {
		DefVariableContext _localctx = new DefVariableContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_defVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			type();
			setState(274);
			assignment();
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(ImperativeLanguageParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ImperativeLanguageParser.SEMICOLON, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperativeLanguageParserVisitor ) return ((ImperativeLanguageParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(RETURN);
			setState(277);
			expr(0);
			setState(278);
			match(SEMICOLON);
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

	public static class MainStatementContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(ImperativeLanguageParser.DEF, 0); }
		public TerminalNode MAIN() { return getToken(ImperativeLanguageParser.MAIN, 0); }
		public TerminalNode LPAREN() { return getToken(ImperativeLanguageParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ImperativeLanguageParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(ImperativeLanguageParser.LBRACE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ImperativeLanguageParser.RBRACE, 0); }
		public MainStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).enterMainStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperativeLanguageParserListener ) ((ImperativeLanguageParserListener)listener).exitMainStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImperativeLanguageParserVisitor ) return ((ImperativeLanguageParserVisitor<? extends T>)visitor).visitMainStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainStatementContext mainStatement() throws RecognitionException {
		MainStatementContext _localctx = new MainStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_mainStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(DEF);
			setState(281);
			match(MAIN);
			setState(282);
			match(LPAREN);
			setState(283);
			match(RPAREN);
			setState(284);
			match(LBRACE);
			setState(285);
			statement();
			setState(286);
			match(RBRACE);
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
		case 16:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 17:
			return maxExpr_sempred((MaxExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean maxExpr_sempred(MaxExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u0123\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\3\3\3"+
		"\7\3B\n\3\f\3\16\3E\13\3\3\3\5\3H\n\3\3\3\3\3\7\3L\n\3\f\3\16\3O\13\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5a"+
		"\n\5\f\5\16\5d\13\5\5\5f\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b|\n\b\f\b\16\b\177\13\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\7\n\u0089\n\n\f\n\16\n\u008c\13\n\5\n\u008e"+
		"\n\n\3\13\3\13\3\13\3\13\5\13\u0094\n\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r"+
		"\5\r\u009d\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00c3\n\22"+
		"\f\22\16\22\u00c6\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\7\23\u00d7\n\23\f\23\16\23\u00da\13\23\3"+
		"\24\3\24\3\24\5\24\u00df\n\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00e7"+
		"\n\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u00f8\n\27\5\27\u00fa\n\27\3\30\3\30\3\31\3\31\5\31\u0100"+
		"\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\2\4\"$\37\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\5\4\2..\60\63\3\2\t\f\3\2\24"+
		"\31\2\u0127\2<\3\2\2\2\4C\3\2\2\2\6P\3\2\2\2\be\3\2\2\2\ng\3\2\2\2\fi"+
		"\3\2\2\2\16}\3\2\2\2\20\u0080\3\2\2\2\22\u008d\3\2\2\2\24\u008f\3\2\2"+
		"\2\26\u0097\3\2\2\2\30\u009c\3\2\2\2\32\u009e\3\2\2\2\34\u00a2\3\2\2\2"+
		"\36\u00a6\3\2\2\2 \u00aa\3\2\2\2\"\u00af\3\2\2\2$\u00c7\3\2\2\2&\u00de"+
		"\3\2\2\2(\u00e6\3\2\2\2*\u00e8\3\2\2\2,\u00ea\3\2\2\2.\u00fb\3\2\2\2\60"+
		"\u00ff\3\2\2\2\62\u0101\3\2\2\2\64\u0109\3\2\2\2\66\u0113\3\2\2\28\u0116"+
		"\3\2\2\2:\u011a\3\2\2\2<=\5\4\3\2=>\7\2\2\3>\3\3\2\2\2?B\5\66\34\2@B\5"+
		"\6\4\2A?\3\2\2\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DG\3\2\2\2EC\3"+
		"\2\2\2FH\5:\36\2GF\3\2\2\2GH\3\2\2\2HM\3\2\2\2IL\5\66\34\2JL\5\6\4\2K"+
		"I\3\2\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\5\3\2\2\2OM\3\2\2\2"+
		"PQ\7+\2\2QR\7\63\2\2RS\7\36\2\2ST\5\b\5\2TU\7\37\2\2UV\7$\2\2VW\5\n\6"+
		"\2WX\5\f\7\2X\7\3\2\2\2YZ\7\63\2\2Z[\7$\2\2[b\5\n\6\2\\]\7%\2\2]^\7\63"+
		"\2\2^_\7$\2\2_a\5\n\6\2`\\\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2cf\3\2"+
		"\2\2db\3\2\2\2eY\3\2\2\2ef\3\2\2\2f\t\3\2\2\2gh\7/\2\2h\13\3\2\2\2ij\7"+
		" \2\2jk\5\16\b\2kl\58\35\2lm\7!\2\2m\r\3\2\2\2no\5\20\t\2op\7#\2\2p|\3"+
		"\2\2\2q|\5\66\34\2r|\5\24\13\2st\5 \21\2tu\7#\2\2u|\3\2\2\2v|\5,\27\2"+
		"w|\5\60\31\2xy\5\"\22\2yz\7#\2\2z|\3\2\2\2{n\3\2\2\2{q\3\2\2\2{r\3\2\2"+
		"\2{s\3\2\2\2{v\3\2\2\2{w\3\2\2\2{x\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3"+
		"\2\2\2~\17\3\2\2\2\177}\3\2\2\2\u0080\u0081\7\63\2\2\u0081\u0082\7\36"+
		"\2\2\u0082\u0083\5\22\n\2\u0083\u0084\7\37\2\2\u0084\21\3\2\2\2\u0085"+
		"\u008a\7\63\2\2\u0086\u0087\7%\2\2\u0087\u0089\7\63\2\2\u0088\u0086\3"+
		"\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u0085\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\23\3\2\2\2\u008f\u0090\7\63\2\2\u0090\u0093\7*\2\2\u0091\u0094"+
		"\5\30\r\2\u0092\u0094\5\"\22\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2\2\2"+
		"\u0094\u0095\3\2\2\2\u0095\u0096\7#\2\2\u0096\25\3\2\2\2\u0097\u0098\t"+
		"\2\2\2\u0098\27\3\2\2\2\u0099\u009d\5\32\16\2\u009a\u009d\5\34\17\2\u009b"+
		"\u009d\5\36\20\2\u009c\u0099\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009b\3"+
		"\2\2\2\u009d\31\3\2\2\2\u009e\u009f\7\6\2\2\u009f\u00a0\7\36\2\2\u00a0"+
		"\u00a1\7\37\2\2\u00a1\33\3\2\2\2\u00a2\u00a3\7\7\2\2\u00a3\u00a4\7\36"+
		"\2\2\u00a4\u00a5\7\37\2\2\u00a5\35\3\2\2\2\u00a6\u00a7\7\b\2\2\u00a7\u00a8"+
		"\7\36\2\2\u00a8\u00a9\7\37\2\2\u00a9\37\3\2\2\2\u00aa\u00ab\t\3\2\2\u00ab"+
		"\u00ac\7\36\2\2\u00ac\u00ad\5\"\22\2\u00ad\u00ae\7\37\2\2\u00ae!\3\2\2"+
		"\2\u00af\u00b0\b\22\1\2\u00b0\u00b1\5$\23\2\u00b1\u00c4\3\2\2\2\u00b2"+
		"\u00b3\f\7\2\2\u00b3\u00b4\7\17\2\2\u00b4\u00c3\5$\23\2\u00b5\u00b6\f"+
		"\6\2\2\u00b6\u00b7\7\20\2\2\u00b7\u00c3\5$\23\2\u00b8\u00b9\f\5\2\2\u00b9"+
		"\u00ba\7\34\2\2\u00ba\u00c3\5$\23\2\u00bb\u00bc\f\4\2\2\u00bc\u00bd\7"+
		"\33\2\2\u00bd\u00c3\5$\23\2\u00be\u00bf\f\3\2\2\u00bf\u00c0\5*\26\2\u00c0"+
		"\u00c1\5$\23\2\u00c1\u00c3\3\2\2\2\u00c2\u00b2\3\2\2\2\u00c2\u00b5\3\2"+
		"\2\2\u00c2\u00b8\3\2\2\2\u00c2\u00bb\3\2\2\2\u00c2\u00be\3\2\2\2\u00c3"+
		"\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5#\3\2\2\2"+
		"\u00c6\u00c4\3\2\2\2\u00c7\u00c8\b\23\1\2\u00c8\u00c9\5&\24\2\u00c9\u00d8"+
		"\3\2\2\2\u00ca\u00cb\f\6\2\2\u00cb\u00cc\7\21\2\2\u00cc\u00d7\5&\24\2"+
		"\u00cd\u00ce\f\5\2\2\u00ce\u00cf\7\22\2\2\u00cf\u00d7\5&\24\2\u00d0\u00d1"+
		"\f\4\2\2\u00d1\u00d2\7\23\2\2\u00d2\u00d7\5&\24\2\u00d3\u00d4\f\3\2\2"+
		"\u00d4\u00d5\7\32\2\2\u00d5\u00d7\5&\24\2\u00d6\u00ca\3\2\2\2\u00d6\u00cd"+
		"\3\2\2\2\u00d6\u00d0\3\2\2\2\u00d6\u00d3\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9%\3\2\2\2\u00da\u00d8\3\2\2\2"+
		"\u00db\u00df\5(\25\2\u00dc\u00dd\7\35\2\2\u00dd\u00df\5&\24\2\u00de\u00db"+
		"\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\'\3\2\2\2\u00e0\u00e7\5\26\f\2\u00e1"+
		"\u00e7\5\20\t\2\u00e2\u00e3\7\36\2\2\u00e3\u00e4\5\"\22\2\u00e4\u00e5"+
		"\7\37\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e0\3\2\2\2\u00e6\u00e1\3\2\2\2"+
		"\u00e6\u00e2\3\2\2\2\u00e7)\3\2\2\2\u00e8\u00e9\t\4\2\2\u00e9+\3\2\2\2"+
		"\u00ea\u00eb\7\r\2\2\u00eb\u00ec\7\36\2\2\u00ec\u00ed\5\"\22\2\u00ed\u00ee"+
		"\7\37\2\2\u00ee\u00ef\7 \2\2\u00ef\u00f0\5\16\b\2\u00f0\u00f9\7!\2\2\u00f1"+
		"\u00f7\7\16\2\2\u00f2\u00f8\5,\27\2\u00f3\u00f4\7 \2\2\u00f4\u00f5\5\16"+
		"\b\2\u00f5\u00f6\7!\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f2\3\2\2\2\u00f7"+
		"\u00f3\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f1\3\2\2\2\u00f9\u00fa\3\2"+
		"\2\2\u00fa-\3\2\2\2\u00fb\u00fc\5\"\22\2\u00fc/\3\2\2\2\u00fd\u0100\5"+
		"\62\32\2\u00fe\u0100\5\64\33\2\u00ff\u00fd\3\2\2\2\u00ff\u00fe\3\2\2\2"+
		"\u0100\61\3\2\2\2\u0101\u0102\7\3\2\2\u0102\u0103\7\36\2\2\u0103\u0104"+
		"\5.\30\2\u0104\u0105\7\37\2\2\u0105\u0106\7 \2\2\u0106\u0107\5\16\b\2"+
		"\u0107\u0108\7!\2\2\u0108\63\3\2\2\2\u0109\u010a\7\4\2\2\u010a\u010b\7"+
		"\63\2\2\u010b\u010c\7\5\2\2\u010c\u010d\7\60\2\2\u010d\u010e\7\"\2\2\u010e"+
		"\u010f\7\60\2\2\u010f\u0110\7 \2\2\u0110\u0111\5\16\b\2\u0111\u0112\7"+
		"!\2\2\u0112\65\3\2\2\2\u0113\u0114\5\n\6\2\u0114\u0115\5\24\13\2\u0115"+
		"\67\3\2\2\2\u0116\u0117\7,\2\2\u0117\u0118\5\"\22\2\u0118\u0119\7#\2\2"+
		"\u01199\3\2\2\2\u011a\u011b\7+\2\2\u011b\u011c\7-\2\2\u011c\u011d\7\36"+
		"\2\2\u011d\u011e\7\37\2\2\u011e\u011f\7 \2\2\u011f\u0120\5\16\b\2\u0120"+
		"\u0121\7!\2\2\u0121;\3\2\2\2\30ACGKMbe{}\u008a\u008d\u0093\u009c\u00c2"+
		"\u00c4\u00d6\u00d8\u00de\u00e6\u00f7\u00f9\u00ff";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
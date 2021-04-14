/*
 * generated by Xtext 2.24.0
 */
grammar InternalTraceryLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package uk.ac.kcl.inf.languages.tracery.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package uk.ac.kcl.inf.languages.tracery.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.kcl.inf.languages.tracery.services.TraceryLanguageGrammarAccess;

}

@parser::members {

 	private TraceryLanguageGrammarAccess grammarAccess;

    public InternalTraceryLanguageParser(TokenStream input, TraceryLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "TraceryProgram";
   	}

   	@Override
   	protected TraceryLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleTraceryProgram
entryRuleTraceryProgram returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTraceryProgramRule()); }
	iv_ruleTraceryProgram=ruleTraceryProgram
	{ $current=$iv_ruleTraceryProgram.current; }
	EOF;

// Rule TraceryProgram
ruleTraceryProgram returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='{'
		{
			newLeafNode(otherlv_0, grammarAccess.getTraceryProgramAccess().getLeftCurlyBracketKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTraceryProgramAccess().getStatementsStatementParserRuleCall_1_0());
				}
				lv_statements_1_0=ruleStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTraceryProgramRule());
					}
					add(
						$current,
						"statements",
						lv_statements_1_0,
						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.Statement");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='}'
		{
			newLeafNode(otherlv_2, grammarAccess.getTraceryProgramAccess().getRightCurlyBracketKeyword_2());
		}
	)
;

// Entry rule entryRuleStatement
entryRuleStatement returns [EObject current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
}:
	{ newCompositeNode(grammarAccess.getStatementRule()); }
	iv_ruleStatement=ruleStatement
	{ $current=$iv_ruleStatement.current; }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule Statement
ruleStatement returns [EObject current=null]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getStatementAccess().getInitialStatementInitialJSONLinesParserRuleCall_0_0());
				}
				lv_initialStatement_0_0=ruleInitialJSONLines
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStatementRule());
					}
					add(
						$current,
						"initialStatement",
						lv_initialStatement_0_0,
						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.InitialJSONLines");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getStatementAccess().getFinalStatementFinalJSONLineParserRuleCall_1_0());
				}
				lv_finalStatement_1_0=ruleFinalJSONLine
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStatementRule());
					}
					set(
						$current,
						"finalStatement",
						lv_finalStatement_1_0,
						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.FinalJSONLine");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleInitialJSONLines
entryRuleInitialJSONLines returns [EObject current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}:
	{ newCompositeNode(grammarAccess.getInitialJSONLinesRule()); }
	iv_ruleInitialJSONLines=ruleInitialJSONLines
	{ $current=$iv_ruleInitialJSONLines.current; }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule InitialJSONLines
ruleInitialJSONLines returns [EObject current=null]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='&'
		{
			newLeafNode(otherlv_0, grammarAccess.getInitialJSONLinesAccess().getAmpersandKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getInitialJSONLinesAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInitialJSONLinesRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='&'
		{
			newLeafNode(otherlv_2, grammarAccess.getInitialJSONLinesAccess().getAmpersandKeyword_2());
		}
		otherlv_3=':'
		{
			newLeafNode(otherlv_3, grammarAccess.getInitialJSONLinesAccess().getColonKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getInitialJSONLinesAccess().getValueInitialJSONEndingParserRuleCall_4_0());
				}
				lv_value_4_0=ruleInitialJSONEnding
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInitialJSONLinesRule());
					}
					set(
						$current,
						"value",
						lv_value_4_0,
						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.InitialJSONEnding");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleFinalJSONLine
entryRuleFinalJSONLine returns [EObject current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
}:
	{ newCompositeNode(grammarAccess.getFinalJSONLineRule()); }
	iv_ruleFinalJSONLine=ruleFinalJSONLine
	{ $current=$iv_ruleFinalJSONLine.current; }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule FinalJSONLine
ruleFinalJSONLine returns [EObject current=null]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
}
@after {
	leaveRule();
}:
	(
		otherlv_0='&origin&'
		{
			newLeafNode(otherlv_0, grammarAccess.getFinalJSONLineAccess().getOriginKeyword_0());
		}
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getFinalJSONLineAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFinalJSONLineAccess().getValueFinalJSONEndingParserRuleCall_2_0());
				}
				lv_value_2_0=ruleFinalJSONEnding
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFinalJSONLineRule());
					}
					set(
						$current,
						"value",
						lv_value_2_0,
						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.FinalJSONEnding");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleInitialJSONEnding
entryRuleInitialJSONEnding returns [EObject current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}:
	{ newCompositeNode(grammarAccess.getInitialJSONEndingRule()); }
	iv_ruleInitialJSONEnding=ruleInitialJSONEnding
	{ $current=$iv_ruleInitialJSONEnding.current; }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule InitialJSONEnding
ruleInitialJSONEnding returns [EObject current=null]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='['
		{
			newLeafNode(otherlv_0, grammarAccess.getInitialJSONEndingAccess().getLeftSquareBracketKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getInitialJSONEndingAccess().getInnerValuesParserRuleCall_1());
		}
		this_InnerValues_1=ruleInnerValues
		{
			$current = $this_InnerValues_1.current;
			afterParserOrEnumRuleCall();
		}
		otherlv_2=']'
		{
			newLeafNode(otherlv_2, grammarAccess.getInitialJSONEndingAccess().getRightSquareBracketKeyword_2());
		}
		otherlv_3=','
		{
			newLeafNode(otherlv_3, grammarAccess.getInitialJSONEndingAccess().getCommaKeyword_3());
		}
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleInnerValues
entryRuleInnerValues returns [EObject current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}:
	{ newCompositeNode(grammarAccess.getInnerValuesRule()); }
	iv_ruleInnerValues=ruleInnerValues
	{ $current=$iv_ruleInnerValues.current; }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule InnerValues
ruleInnerValues returns [EObject current=null]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getInnerValuesAccess().getStartValueParserRuleCall_0());
		}
		this_StartValue_0=ruleStartValue
		{
			$current = $this_StartValue_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getInnerValuesAccess().getValsNormalValueParserRuleCall_1_0());
				}
				lv_vals_1_0=ruleNormalValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInnerValuesRule());
					}
					add(
						$current,
						"vals",
						lv_vals_1_0,
						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.NormalValue");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleFinalJSONEnding
entryRuleFinalJSONEnding returns [EObject current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
}:
	{ newCompositeNode(grammarAccess.getFinalJSONEndingRule()); }
	iv_ruleFinalJSONEnding=ruleFinalJSONEnding
	{ $current=$iv_ruleFinalJSONEnding.current; }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule FinalJSONEnding
ruleFinalJSONEnding returns [EObject current=null]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
}
@after {
	leaveRule();
}:
	(
		otherlv_0='['
		{
			newLeafNode(otherlv_0, grammarAccess.getFinalJSONEndingAccess().getLeftSquareBracketKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getFinalJSONEndingAccess().getStartValueParserRuleCall_1());
		}
		this_StartValue_1=ruleStartValue
		{
			$current = $this_StartValue_1.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFinalJSONEndingAccess().getValsNormalValueParserRuleCall_2_0());
				}
				lv_vals_2_0=ruleNormalValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFinalJSONEndingRule());
					}
					add(
						$current,
						"vals",
						lv_vals_2_0,
						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.NormalValue");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3=']'
		{
			newLeafNode(otherlv_3, grammarAccess.getFinalJSONEndingAccess().getRightSquareBracketKeyword_3());
		}
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleStartValue
entryRuleStartValue returns [EObject current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
}:
	{ newCompositeNode(grammarAccess.getStartValueRule()); }
	iv_ruleStartValue=ruleStartValue
	{ $current=$iv_ruleStartValue.current; }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule StartValue
ruleStartValue returns [EObject current=null]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
}
@after {
	leaveRule();
}:
	(
		otherlv_0='&'
		{
			newLeafNode(otherlv_0, grammarAccess.getStartValueAccess().getAmpersandKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStartValueAccess().getValueInnerStatementsInnerStatementsParserRuleCall_1_0());
				}
				lv_valueInnerStatements_1_0=ruleInnerStatements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStartValueRule());
					}
					add(
						$current,
						"valueInnerStatements",
						lv_valueInnerStatements_1_0,
						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.InnerStatements");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_2='&'
		{
			newLeafNode(otherlv_2, grammarAccess.getStartValueAccess().getAmpersandKeyword_2());
		}
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleNormalValue
entryRuleNormalValue returns [EObject current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
}:
	{ newCompositeNode(grammarAccess.getNormalValueRule()); }
	iv_ruleNormalValue=ruleNormalValue
	{ $current=$iv_ruleNormalValue.current; }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule NormalValue
ruleNormalValue returns [EObject current=null]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
}
@after {
	leaveRule();
}:
	(
		otherlv_0=','
		{
			newLeafNode(otherlv_0, grammarAccess.getNormalValueAccess().getCommaKeyword_0());
		}
		otherlv_1='&'
		{
			newLeafNode(otherlv_1, grammarAccess.getNormalValueAccess().getAmpersandKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getNormalValueAccess().getValueInnerStatementsInnerStatementsParserRuleCall_2_0());
				}
				lv_valueInnerStatements_2_0=ruleInnerStatements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNormalValueRule());
					}
					add(
						$current,
						"valueInnerStatements",
						lv_valueInnerStatements_2_0,
						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.InnerStatements");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_3='&'
		{
			newLeafNode(otherlv_3, grammarAccess.getNormalValueAccess().getAmpersandKeyword_3());
		}
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleInnerStatements
entryRuleInnerStatements returns [EObject current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}:
	{ newCompositeNode(grammarAccess.getInnerStatementsRule()); }
	iv_ruleInnerStatements=ruleInnerStatements
	{ $current=$iv_ruleInnerStatements.current; }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule InnerStatements
ruleInnerStatements returns [EObject current=null]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getInnerStatementsAccess().getStringDeclarationParserRuleCall_0());
		}
		this_StringDeclaration_0=ruleStringDeclaration
		{
			$current = $this_StringDeclaration_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInnerStatementsAccess().getDeclaredVariableParserRuleCall_1());
		}
		this_DeclaredVariable_1=ruleDeclaredVariable
		{
			$current = $this_DeclaredVariable_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleStringDeclaration
entryRuleStringDeclaration returns [EObject current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}:
	{ newCompositeNode(grammarAccess.getStringDeclarationRule()); }
	iv_ruleStringDeclaration=ruleStringDeclaration
	{ $current=$iv_ruleStringDeclaration.current; }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule StringDeclaration
ruleStringDeclaration returns [EObject current=null]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
@after {
	leaveRule();
}:
	(
		(
			lv_value_0_0=RULE_STRING
			{
				newLeafNode(lv_value_0_0, grammarAccess.getStringDeclarationAccess().getValueSTRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getStringDeclarationRule());
				}
				setWithLastConsumed(
					$current,
					"value",
					lv_value_0_0,
					"org.eclipse.xtext.common.Terminals.STRING");
			}
		)
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleDeclaredVariable
entryRuleDeclaredVariable returns [EObject current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}:
	{ newCompositeNode(grammarAccess.getDeclaredVariableRule()); }
	iv_ruleDeclaredVariable=ruleDeclaredVariable
	{ $current=$iv_ruleDeclaredVariable.current; }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule DeclaredVariable
ruleDeclaredVariable returns [EObject current=null]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#'
		{
			newLeafNode(otherlv_0, grammarAccess.getDeclaredVariableAccess().getNumberSignKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDeclaredVariableRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getDeclaredVariableAccess().getVariableInitialJSONLinesCrossReference_1_0());
				}
			)
		)
		otherlv_2='#'
		{
			newLeafNode(otherlv_2, grammarAccess.getDeclaredVariableAccess().getNumberSignKeyword_2());
		}
	)
;
finally {
	myHiddenTokenState.restore();
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

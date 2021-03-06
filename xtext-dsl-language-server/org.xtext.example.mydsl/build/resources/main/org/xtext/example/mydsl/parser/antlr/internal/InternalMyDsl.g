/*
 * generated by Xtext 2.14.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

}

@parser::members {

 	private MyDslGrammarAccess grammarAccess;

    public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Extent";
   	}

   	@Override
   	protected MyDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleExtent
entryRuleExtent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExtentRule()); }
	iv_ruleExtent=ruleExtent
	{ $current=$iv_ruleExtent.current; }
	EOF;

// Rule Extent
ruleExtent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getExtentAccess().getModulesModuleParserRuleCall_0());
			}
			lv_modules_0_0=ruleModule
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getExtentRule());
				}
				add(
					$current,
					"modules",
					lv_modules_0_0,
					"org.xtext.example.mydsl.MyDsl.Module");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleModule
entryRuleModule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModuleRule()); }
	iv_ruleModule=ruleModule
	{ $current=$iv_ruleModule.current; }
	EOF;

// Rule Module
ruleModule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getModuleAccess().getTerminologyGraphParserRuleCall());
	}
	this_TerminologyGraph_0=ruleTerminologyGraph
	{
		$current = $this_TerminologyGraph_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleTerminologyGraph
entryRuleTerminologyGraph returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTerminologyGraphRule()); }
	iv_ruleTerminologyGraph=ruleTerminologyGraph
	{ $current=$iv_ruleTerminologyGraph.current; }
	EOF;

// Rule TerminologyGraph
ruleTerminologyGraph returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='terminology'
		{
			newLeafNode(otherlv_0, grammarAccess.getTerminologyGraphAccess().getTerminologyKeyword_0());
		}
		(
			(
				lv_iri_1_0=RULE_ID
				{
					newLeafNode(lv_iri_1_0, grammarAccess.getTerminologyGraphAccess().getIriIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTerminologyGraphRule());
					}
					setWithLastConsumed(
						$current,
						"iri",
						lv_iri_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getTerminologyGraphAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTerminologyGraphAccess().getBoxStatementsTerminologyBoxStatementParserRuleCall_3_0());
				}
				lv_boxStatements_3_0=ruleTerminologyBoxStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTerminologyGraphRule());
					}
					add(
						$current,
						"boxStatements",
						lv_boxStatements_3_0,
						"org.xtext.example.mydsl.MyDsl.TerminologyBoxStatement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getTerminologyGraphAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleTerminologyBoxStatement
entryRuleTerminologyBoxStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTerminologyBoxStatementRule()); }
	iv_ruleTerminologyBoxStatement=ruleTerminologyBoxStatement
	{ $current=$iv_ruleTerminologyBoxStatement.current; }
	EOF;

// Rule TerminologyBoxStatement
ruleTerminologyBoxStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTerminologyBoxStatementAccess().getEntityParserRuleCall_0());
		}
		this_Entity_0=ruleEntity
		{
			$current = $this_Entity_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTerminologyBoxStatementAccess().getRelationParserRuleCall_1());
		}
		this_Relation_1=ruleRelation
		{
			$current = $this_Relation_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleEntity
entryRuleEntity returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityRule()); }
	iv_ruleEntity=ruleEntity
	{ $current=$iv_ruleEntity.current; }
	EOF;

// Rule Entity
ruleEntity returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getEntityAccess().getAspectParserRuleCall_0());
		}
		this_Aspect_0=ruleAspect
		{
			$current = $this_Aspect_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getEntityAccess().getConceptParserRuleCall_1());
		}
		this_Concept_1=ruleConcept
		{
			$current = $this_Concept_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAspect
entryRuleAspect returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAspectRule()); }
	iv_ruleAspect=ruleAspect
	{ $current=$iv_ruleAspect.current; }
	EOF;

// Rule Aspect
ruleAspect returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='aspect'
		{
			newLeafNode(otherlv_0, grammarAccess.getAspectAccess().getAspectKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getAspectAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAspectRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleConcept
entryRuleConcept returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConceptRule()); }
	iv_ruleConcept=ruleConcept
	{ $current=$iv_ruleConcept.current; }
	EOF;

// Rule Concept
ruleConcept returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='concept'
		{
			newLeafNode(otherlv_0, grammarAccess.getConceptAccess().getConceptKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getConceptAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConceptRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleRelation
entryRuleRelation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRelationRule()); }
	iv_ruleRelation=ruleRelation
	{ $current=$iv_ruleRelation.current; }
	EOF;

// Rule Relation
ruleRelation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='relation'
		{
			newLeafNode(otherlv_0, grammarAccess.getRelationAccess().getRelationKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRelationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='source'
		{
			newLeafNode(otherlv_3, grammarAccess.getRelationAccess().getSourceKeyword_3());
		}
		otherlv_4='='
		{
			newLeafNode(otherlv_4, grammarAccess.getRelationAccess().getEqualsSignKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRelationRule());
					}
				}
				otherlv_5=RULE_ID
				{
					newLeafNode(otherlv_5, grammarAccess.getRelationAccess().getSourceEntityCrossReference_5_0());
				}
			)
		)
		otherlv_6='target'
		{
			newLeafNode(otherlv_6, grammarAccess.getRelationAccess().getTargetKeyword_6());
		}
		otherlv_7='='
		{
			newLeafNode(otherlv_7, grammarAccess.getRelationAccess().getEqualsSignKeyword_7());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRelationRule());
					}
				}
				otherlv_8=RULE_ID
				{
					newLeafNode(otherlv_8, grammarAccess.getRelationAccess().getTargetEntityCrossReference_8_0());
				}
			)
		)
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_9());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

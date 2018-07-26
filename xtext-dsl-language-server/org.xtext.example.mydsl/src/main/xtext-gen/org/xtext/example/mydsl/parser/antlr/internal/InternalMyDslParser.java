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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'terminology'", "'{'", "'}'", "'aspect'", "'concept'", "'relation'", "'source'", "'='", "'target'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



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




    // $ANTLR start "entryRuleExtent"
    // InternalMyDsl.g:64:1: entryRuleExtent returns [EObject current=null] : iv_ruleExtent= ruleExtent EOF ;
    public final EObject entryRuleExtent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtent = null;


        try {
            // InternalMyDsl.g:64:47: (iv_ruleExtent= ruleExtent EOF )
            // InternalMyDsl.g:65:2: iv_ruleExtent= ruleExtent EOF
            {
             newCompositeNode(grammarAccess.getExtentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtent=ruleExtent();

            state._fsp--;

             current =iv_ruleExtent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExtent"


    // $ANTLR start "ruleExtent"
    // InternalMyDsl.g:71:1: ruleExtent returns [EObject current=null] : ( (lv_modules_0_0= ruleModule ) )* ;
    public final EObject ruleExtent() throws RecognitionException {
        EObject current = null;

        EObject lv_modules_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_modules_0_0= ruleModule ) )* )
            // InternalMyDsl.g:78:2: ( (lv_modules_0_0= ruleModule ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_modules_0_0= ruleModule ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_modules_0_0= ruleModule )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_modules_0_0= ruleModule )
            	    // InternalMyDsl.g:80:4: lv_modules_0_0= ruleModule
            	    {

            	    				newCompositeNode(grammarAccess.getExtentAccess().getModulesModuleParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_modules_0_0=ruleModule();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getExtentRule());
            	    				}
            	    				add(
            	    					current,
            	    					"modules",
            	    					lv_modules_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.Module");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExtent"


    // $ANTLR start "entryRuleModule"
    // InternalMyDsl.g:100:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // InternalMyDsl.g:100:47: (iv_ruleModule= ruleModule EOF )
            // InternalMyDsl.g:101:2: iv_ruleModule= ruleModule EOF
            {
             newCompositeNode(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModule=ruleModule();

            state._fsp--;

             current =iv_ruleModule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // InternalMyDsl.g:107:1: ruleModule returns [EObject current=null] : this_TerminologyGraph_0= ruleTerminologyGraph ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        EObject this_TerminologyGraph_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: (this_TerminologyGraph_0= ruleTerminologyGraph )
            // InternalMyDsl.g:114:2: this_TerminologyGraph_0= ruleTerminologyGraph
            {

            		newCompositeNode(grammarAccess.getModuleAccess().getTerminologyGraphParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_TerminologyGraph_0=ruleTerminologyGraph();

            state._fsp--;


            		current = this_TerminologyGraph_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleTerminologyGraph"
    // InternalMyDsl.g:125:1: entryRuleTerminologyGraph returns [EObject current=null] : iv_ruleTerminologyGraph= ruleTerminologyGraph EOF ;
    public final EObject entryRuleTerminologyGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminologyGraph = null;


        try {
            // InternalMyDsl.g:125:57: (iv_ruleTerminologyGraph= ruleTerminologyGraph EOF )
            // InternalMyDsl.g:126:2: iv_ruleTerminologyGraph= ruleTerminologyGraph EOF
            {
             newCompositeNode(grammarAccess.getTerminologyGraphRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminologyGraph=ruleTerminologyGraph();

            state._fsp--;

             current =iv_ruleTerminologyGraph; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminologyGraph"


    // $ANTLR start "ruleTerminologyGraph"
    // InternalMyDsl.g:132:1: ruleTerminologyGraph returns [EObject current=null] : (otherlv_0= 'terminology' ( (lv_iri_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_boxStatements_3_0= ruleTerminologyBoxStatement ) )* otherlv_4= '}' ) ;
    public final EObject ruleTerminologyGraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_iri_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_boxStatements_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:138:2: ( (otherlv_0= 'terminology' ( (lv_iri_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_boxStatements_3_0= ruleTerminologyBoxStatement ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:139:2: (otherlv_0= 'terminology' ( (lv_iri_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_boxStatements_3_0= ruleTerminologyBoxStatement ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:139:2: (otherlv_0= 'terminology' ( (lv_iri_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_boxStatements_3_0= ruleTerminologyBoxStatement ) )* otherlv_4= '}' )
            // InternalMyDsl.g:140:3: otherlv_0= 'terminology' ( (lv_iri_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_boxStatements_3_0= ruleTerminologyBoxStatement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTerminologyGraphAccess().getTerminologyKeyword_0());
            		
            // InternalMyDsl.g:144:3: ( (lv_iri_1_0= RULE_ID ) )
            // InternalMyDsl.g:145:4: (lv_iri_1_0= RULE_ID )
            {
            // InternalMyDsl.g:145:4: (lv_iri_1_0= RULE_ID )
            // InternalMyDsl.g:146:5: lv_iri_1_0= RULE_ID
            {
            lv_iri_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_iri_1_0, grammarAccess.getTerminologyGraphAccess().getIriIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTerminologyGraphRule());
            					}
            					setWithLastConsumed(
            						current,
            						"iri",
            						lv_iri_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getTerminologyGraphAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:166:3: ( (lv_boxStatements_3_0= ruleTerminologyBoxStatement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=14 && LA2_0<=16)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:167:4: (lv_boxStatements_3_0= ruleTerminologyBoxStatement )
            	    {
            	    // InternalMyDsl.g:167:4: (lv_boxStatements_3_0= ruleTerminologyBoxStatement )
            	    // InternalMyDsl.g:168:5: lv_boxStatements_3_0= ruleTerminologyBoxStatement
            	    {

            	    					newCompositeNode(grammarAccess.getTerminologyGraphAccess().getBoxStatementsTerminologyBoxStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_boxStatements_3_0=ruleTerminologyBoxStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTerminologyGraphRule());
            	    					}
            	    					add(
            	    						current,
            	    						"boxStatements",
            	    						lv_boxStatements_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.TerminologyBoxStatement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTerminologyGraphAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminologyGraph"


    // $ANTLR start "entryRuleTerminologyBoxStatement"
    // InternalMyDsl.g:193:1: entryRuleTerminologyBoxStatement returns [EObject current=null] : iv_ruleTerminologyBoxStatement= ruleTerminologyBoxStatement EOF ;
    public final EObject entryRuleTerminologyBoxStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminologyBoxStatement = null;


        try {
            // InternalMyDsl.g:193:64: (iv_ruleTerminologyBoxStatement= ruleTerminologyBoxStatement EOF )
            // InternalMyDsl.g:194:2: iv_ruleTerminologyBoxStatement= ruleTerminologyBoxStatement EOF
            {
             newCompositeNode(grammarAccess.getTerminologyBoxStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminologyBoxStatement=ruleTerminologyBoxStatement();

            state._fsp--;

             current =iv_ruleTerminologyBoxStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminologyBoxStatement"


    // $ANTLR start "ruleTerminologyBoxStatement"
    // InternalMyDsl.g:200:1: ruleTerminologyBoxStatement returns [EObject current=null] : (this_Entity_0= ruleEntity | this_Relation_1= ruleRelation ) ;
    public final EObject ruleTerminologyBoxStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_0 = null;

        EObject this_Relation_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:206:2: ( (this_Entity_0= ruleEntity | this_Relation_1= ruleRelation ) )
            // InternalMyDsl.g:207:2: (this_Entity_0= ruleEntity | this_Relation_1= ruleRelation )
            {
            // InternalMyDsl.g:207:2: (this_Entity_0= ruleEntity | this_Relation_1= ruleRelation )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=14 && LA3_0<=15)) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:208:3: this_Entity_0= ruleEntity
                    {

                    			newCompositeNode(grammarAccess.getTerminologyBoxStatementAccess().getEntityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entity_0=ruleEntity();

                    state._fsp--;


                    			current = this_Entity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:217:3: this_Relation_1= ruleRelation
                    {

                    			newCompositeNode(grammarAccess.getTerminologyBoxStatementAccess().getRelationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Relation_1=ruleRelation();

                    state._fsp--;


                    			current = this_Relation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminologyBoxStatement"


    // $ANTLR start "entryRuleEntity"
    // InternalMyDsl.g:229:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalMyDsl.g:229:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalMyDsl.g:230:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalMyDsl.g:236:1: ruleEntity returns [EObject current=null] : (this_Aspect_0= ruleAspect | this_Concept_1= ruleConcept ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        EObject this_Aspect_0 = null;

        EObject this_Concept_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:242:2: ( (this_Aspect_0= ruleAspect | this_Concept_1= ruleConcept ) )
            // InternalMyDsl.g:243:2: (this_Aspect_0= ruleAspect | this_Concept_1= ruleConcept )
            {
            // InternalMyDsl.g:243:2: (this_Aspect_0= ruleAspect | this_Concept_1= ruleConcept )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:244:3: this_Aspect_0= ruleAspect
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getAspectParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Aspect_0=ruleAspect();

                    state._fsp--;


                    			current = this_Aspect_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:253:3: this_Concept_1= ruleConcept
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getConceptParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Concept_1=ruleConcept();

                    state._fsp--;


                    			current = this_Concept_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAspect"
    // InternalMyDsl.g:265:1: entryRuleAspect returns [EObject current=null] : iv_ruleAspect= ruleAspect EOF ;
    public final EObject entryRuleAspect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAspect = null;


        try {
            // InternalMyDsl.g:265:47: (iv_ruleAspect= ruleAspect EOF )
            // InternalMyDsl.g:266:2: iv_ruleAspect= ruleAspect EOF
            {
             newCompositeNode(grammarAccess.getAspectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAspect=ruleAspect();

            state._fsp--;

             current =iv_ruleAspect; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAspect"


    // $ANTLR start "ruleAspect"
    // InternalMyDsl.g:272:1: ruleAspect returns [EObject current=null] : (otherlv_0= 'aspect' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAspect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:278:2: ( (otherlv_0= 'aspect' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:279:2: (otherlv_0= 'aspect' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:279:2: (otherlv_0= 'aspect' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:280:3: otherlv_0= 'aspect' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAspectAccess().getAspectKeyword_0());
            		
            // InternalMyDsl.g:284:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:285:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:285:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:286:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAspectAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAspectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAspect"


    // $ANTLR start "entryRuleConcept"
    // InternalMyDsl.g:306:1: entryRuleConcept returns [EObject current=null] : iv_ruleConcept= ruleConcept EOF ;
    public final EObject entryRuleConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcept = null;


        try {
            // InternalMyDsl.g:306:48: (iv_ruleConcept= ruleConcept EOF )
            // InternalMyDsl.g:307:2: iv_ruleConcept= ruleConcept EOF
            {
             newCompositeNode(grammarAccess.getConceptRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConcept=ruleConcept();

            state._fsp--;

             current =iv_ruleConcept; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConcept"


    // $ANTLR start "ruleConcept"
    // InternalMyDsl.g:313:1: ruleConcept returns [EObject current=null] : (otherlv_0= 'concept' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleConcept() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:319:2: ( (otherlv_0= 'concept' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:320:2: (otherlv_0= 'concept' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:320:2: (otherlv_0= 'concept' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:321:3: otherlv_0= 'concept' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConceptAccess().getConceptKeyword_0());
            		
            // InternalMyDsl.g:325:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:326:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:326:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:327:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConceptAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConcept"


    // $ANTLR start "entryRuleRelation"
    // InternalMyDsl.g:347:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalMyDsl.g:347:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalMyDsl.g:348:2: iv_ruleRelation= ruleRelation EOF
            {
             newCompositeNode(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelation=ruleRelation();

            state._fsp--;

             current =iv_ruleRelation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalMyDsl.g:354:1: ruleRelation returns [EObject current=null] : (otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'source' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'target' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalMyDsl.g:360:2: ( (otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'source' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'target' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' ) )
            // InternalMyDsl.g:361:2: (otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'source' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'target' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' )
            {
            // InternalMyDsl.g:361:2: (otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'source' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'target' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' )
            // InternalMyDsl.g:362:3: otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'source' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'target' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRelationAccess().getRelationKeyword_0());
            		
            // InternalMyDsl.g:366:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:367:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:367:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:368:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getRelationAccess().getSourceKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getRelationAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:396:3: ( (otherlv_5= RULE_ID ) )
            // InternalMyDsl.g:397:4: (otherlv_5= RULE_ID )
            {
            // InternalMyDsl.g:397:4: (otherlv_5= RULE_ID )
            // InternalMyDsl.g:398:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_5, grammarAccess.getRelationAccess().getSourceEntityCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getRelationAccess().getTargetKeyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getRelationAccess().getEqualsSignKeyword_7());
            		
            // InternalMyDsl.g:417:3: ( (otherlv_8= RULE_ID ) )
            // InternalMyDsl.g:418:4: (otherlv_8= RULE_ID )
            {
            // InternalMyDsl.g:418:4: (otherlv_8= RULE_ID )
            // InternalMyDsl.g:419:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_8, grammarAccess.getRelationAccess().getTargetEntityCrossReference_8_0());
            				

            }


            }

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelation"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002000L});

}
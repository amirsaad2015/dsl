package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleExtent"
    // InternalMyDsl.g:53:1: entryRuleExtent : ruleExtent EOF ;
    public final void entryRuleExtent() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleExtent EOF )
            // InternalMyDsl.g:55:1: ruleExtent EOF
            {
             before(grammarAccess.getExtentRule()); 
            pushFollow(FOLLOW_1);
            ruleExtent();

            state._fsp--;

             after(grammarAccess.getExtentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExtent"


    // $ANTLR start "ruleExtent"
    // InternalMyDsl.g:62:1: ruleExtent : ( ( rule__Extent__ModulesAssignment )* ) ;
    public final void ruleExtent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Extent__ModulesAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__Extent__ModulesAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Extent__ModulesAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__Extent__ModulesAssignment )*
            {
             before(grammarAccess.getExtentAccess().getModulesAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__Extent__ModulesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__Extent__ModulesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Extent__ModulesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getExtentAccess().getModulesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExtent"


    // $ANTLR start "entryRuleModule"
    // InternalMyDsl.g:78:1: entryRuleModule : ruleModule EOF ;
    public final void entryRuleModule() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleModule EOF )
            // InternalMyDsl.g:80:1: ruleModule EOF
            {
             before(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_1);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getModuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // InternalMyDsl.g:87:1: ruleModule : ( ruleTerminologyGraph ) ;
    public final void ruleModule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ruleTerminologyGraph ) )
            // InternalMyDsl.g:92:2: ( ruleTerminologyGraph )
            {
            // InternalMyDsl.g:92:2: ( ruleTerminologyGraph )
            // InternalMyDsl.g:93:3: ruleTerminologyGraph
            {
             before(grammarAccess.getModuleAccess().getTerminologyGraphParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleTerminologyGraph();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getTerminologyGraphParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleTerminologyGraph"
    // InternalMyDsl.g:103:1: entryRuleTerminologyGraph : ruleTerminologyGraph EOF ;
    public final void entryRuleTerminologyGraph() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleTerminologyGraph EOF )
            // InternalMyDsl.g:105:1: ruleTerminologyGraph EOF
            {
             before(grammarAccess.getTerminologyGraphRule()); 
            pushFollow(FOLLOW_1);
            ruleTerminologyGraph();

            state._fsp--;

             after(grammarAccess.getTerminologyGraphRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerminologyGraph"


    // $ANTLR start "ruleTerminologyGraph"
    // InternalMyDsl.g:112:1: ruleTerminologyGraph : ( ( rule__TerminologyGraph__Group__0 ) ) ;
    public final void ruleTerminologyGraph() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__TerminologyGraph__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__TerminologyGraph__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__TerminologyGraph__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__TerminologyGraph__Group__0 )
            {
             before(grammarAccess.getTerminologyGraphAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__TerminologyGraph__Group__0 )
            // InternalMyDsl.g:119:4: rule__TerminologyGraph__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TerminologyGraph__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTerminologyGraphAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminologyGraph"


    // $ANTLR start "entryRuleTerminologyBoxStatement"
    // InternalMyDsl.g:128:1: entryRuleTerminologyBoxStatement : ruleTerminologyBoxStatement EOF ;
    public final void entryRuleTerminologyBoxStatement() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleTerminologyBoxStatement EOF )
            // InternalMyDsl.g:130:1: ruleTerminologyBoxStatement EOF
            {
             before(grammarAccess.getTerminologyBoxStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleTerminologyBoxStatement();

            state._fsp--;

             after(grammarAccess.getTerminologyBoxStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerminologyBoxStatement"


    // $ANTLR start "ruleTerminologyBoxStatement"
    // InternalMyDsl.g:137:1: ruleTerminologyBoxStatement : ( ( rule__TerminologyBoxStatement__Alternatives ) ) ;
    public final void ruleTerminologyBoxStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__TerminologyBoxStatement__Alternatives ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__TerminologyBoxStatement__Alternatives ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__TerminologyBoxStatement__Alternatives ) )
            // InternalMyDsl.g:143:3: ( rule__TerminologyBoxStatement__Alternatives )
            {
             before(grammarAccess.getTerminologyBoxStatementAccess().getAlternatives()); 
            // InternalMyDsl.g:144:3: ( rule__TerminologyBoxStatement__Alternatives )
            // InternalMyDsl.g:144:4: rule__TerminologyBoxStatement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TerminologyBoxStatement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTerminologyBoxStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminologyBoxStatement"


    // $ANTLR start "entryRuleEntity"
    // InternalMyDsl.g:153:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleEntity EOF )
            // InternalMyDsl.g:155:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalMyDsl.g:162:1: ruleEntity : ( ( rule__Entity__Alternatives ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Entity__Alternatives ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Entity__Alternatives ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Entity__Alternatives ) )
            // InternalMyDsl.g:168:3: ( rule__Entity__Alternatives )
            {
             before(grammarAccess.getEntityAccess().getAlternatives()); 
            // InternalMyDsl.g:169:3: ( rule__Entity__Alternatives )
            // InternalMyDsl.g:169:4: rule__Entity__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAspect"
    // InternalMyDsl.g:178:1: entryRuleAspect : ruleAspect EOF ;
    public final void entryRuleAspect() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleAspect EOF )
            // InternalMyDsl.g:180:1: ruleAspect EOF
            {
             before(grammarAccess.getAspectRule()); 
            pushFollow(FOLLOW_1);
            ruleAspect();

            state._fsp--;

             after(grammarAccess.getAspectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAspect"


    // $ANTLR start "ruleAspect"
    // InternalMyDsl.g:187:1: ruleAspect : ( ( rule__Aspect__Group__0 ) ) ;
    public final void ruleAspect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Aspect__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Aspect__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Aspect__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Aspect__Group__0 )
            {
             before(grammarAccess.getAspectAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Aspect__Group__0 )
            // InternalMyDsl.g:194:4: rule__Aspect__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Aspect__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAspectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAspect"


    // $ANTLR start "entryRuleConcept"
    // InternalMyDsl.g:203:1: entryRuleConcept : ruleConcept EOF ;
    public final void entryRuleConcept() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleConcept EOF )
            // InternalMyDsl.g:205:1: ruleConcept EOF
            {
             before(grammarAccess.getConceptRule()); 
            pushFollow(FOLLOW_1);
            ruleConcept();

            state._fsp--;

             after(grammarAccess.getConceptRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConcept"


    // $ANTLR start "ruleConcept"
    // InternalMyDsl.g:212:1: ruleConcept : ( ( rule__Concept__Group__0 ) ) ;
    public final void ruleConcept() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Concept__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Concept__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Concept__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Concept__Group__0 )
            {
             before(grammarAccess.getConceptAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Concept__Group__0 )
            // InternalMyDsl.g:219:4: rule__Concept__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Concept__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConceptAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConcept"


    // $ANTLR start "entryRuleRelation"
    // InternalMyDsl.g:228:1: entryRuleRelation : ruleRelation EOF ;
    public final void entryRuleRelation() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleRelation EOF )
            // InternalMyDsl.g:230:1: ruleRelation EOF
            {
             before(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getRelationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalMyDsl.g:237:1: ruleRelation : ( ( rule__Relation__Group__0 ) ) ;
    public final void ruleRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Relation__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Relation__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Relation__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Relation__Group__0 )
            {
             before(grammarAccess.getRelationAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Relation__Group__0 )
            // InternalMyDsl.g:244:4: rule__Relation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelation"


    // $ANTLR start "rule__TerminologyBoxStatement__Alternatives"
    // InternalMyDsl.g:252:1: rule__TerminologyBoxStatement__Alternatives : ( ( ruleEntity ) | ( ruleRelation ) );
    public final void rule__TerminologyBoxStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:256:1: ( ( ruleEntity ) | ( ruleRelation ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=14 && LA2_0<=15)) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:257:2: ( ruleEntity )
                    {
                    // InternalMyDsl.g:257:2: ( ruleEntity )
                    // InternalMyDsl.g:258:3: ruleEntity
                    {
                     before(grammarAccess.getTerminologyBoxStatementAccess().getEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getTerminologyBoxStatementAccess().getEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:263:2: ( ruleRelation )
                    {
                    // InternalMyDsl.g:263:2: ( ruleRelation )
                    // InternalMyDsl.g:264:3: ruleRelation
                    {
                     before(grammarAccess.getTerminologyBoxStatementAccess().getRelationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRelation();

                    state._fsp--;

                     after(grammarAccess.getTerminologyBoxStatementAccess().getRelationParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminologyBoxStatement__Alternatives"


    // $ANTLR start "rule__Entity__Alternatives"
    // InternalMyDsl.g:273:1: rule__Entity__Alternatives : ( ( ruleAspect ) | ( ruleConcept ) );
    public final void rule__Entity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:277:1: ( ( ruleAspect ) | ( ruleConcept ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:278:2: ( ruleAspect )
                    {
                    // InternalMyDsl.g:278:2: ( ruleAspect )
                    // InternalMyDsl.g:279:3: ruleAspect
                    {
                     before(grammarAccess.getEntityAccess().getAspectParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAspect();

                    state._fsp--;

                     after(grammarAccess.getEntityAccess().getAspectParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:284:2: ( ruleConcept )
                    {
                    // InternalMyDsl.g:284:2: ( ruleConcept )
                    // InternalMyDsl.g:285:3: ruleConcept
                    {
                     before(grammarAccess.getEntityAccess().getConceptParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleConcept();

                    state._fsp--;

                     after(grammarAccess.getEntityAccess().getConceptParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Alternatives"


    // $ANTLR start "rule__TerminologyGraph__Group__0"
    // InternalMyDsl.g:294:1: rule__TerminologyGraph__Group__0 : rule__TerminologyGraph__Group__0__Impl rule__TerminologyGraph__Group__1 ;
    public final void rule__TerminologyGraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:298:1: ( rule__TerminologyGraph__Group__0__Impl rule__TerminologyGraph__Group__1 )
            // InternalMyDsl.g:299:2: rule__TerminologyGraph__Group__0__Impl rule__TerminologyGraph__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TerminologyGraph__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminologyGraph__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminologyGraph__Group__0"


    // $ANTLR start "rule__TerminologyGraph__Group__0__Impl"
    // InternalMyDsl.g:306:1: rule__TerminologyGraph__Group__0__Impl : ( 'terminology' ) ;
    public final void rule__TerminologyGraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:310:1: ( ( 'terminology' ) )
            // InternalMyDsl.g:311:1: ( 'terminology' )
            {
            // InternalMyDsl.g:311:1: ( 'terminology' )
            // InternalMyDsl.g:312:2: 'terminology'
            {
             before(grammarAccess.getTerminologyGraphAccess().getTerminologyKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getTerminologyGraphAccess().getTerminologyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminologyGraph__Group__0__Impl"


    // $ANTLR start "rule__TerminologyGraph__Group__1"
    // InternalMyDsl.g:321:1: rule__TerminologyGraph__Group__1 : rule__TerminologyGraph__Group__1__Impl rule__TerminologyGraph__Group__2 ;
    public final void rule__TerminologyGraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:325:1: ( rule__TerminologyGraph__Group__1__Impl rule__TerminologyGraph__Group__2 )
            // InternalMyDsl.g:326:2: rule__TerminologyGraph__Group__1__Impl rule__TerminologyGraph__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__TerminologyGraph__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminologyGraph__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminologyGraph__Group__1"


    // $ANTLR start "rule__TerminologyGraph__Group__1__Impl"
    // InternalMyDsl.g:333:1: rule__TerminologyGraph__Group__1__Impl : ( ( rule__TerminologyGraph__IriAssignment_1 ) ) ;
    public final void rule__TerminologyGraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:337:1: ( ( ( rule__TerminologyGraph__IriAssignment_1 ) ) )
            // InternalMyDsl.g:338:1: ( ( rule__TerminologyGraph__IriAssignment_1 ) )
            {
            // InternalMyDsl.g:338:1: ( ( rule__TerminologyGraph__IriAssignment_1 ) )
            // InternalMyDsl.g:339:2: ( rule__TerminologyGraph__IriAssignment_1 )
            {
             before(grammarAccess.getTerminologyGraphAccess().getIriAssignment_1()); 
            // InternalMyDsl.g:340:2: ( rule__TerminologyGraph__IriAssignment_1 )
            // InternalMyDsl.g:340:3: rule__TerminologyGraph__IriAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminologyGraph__IriAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTerminologyGraphAccess().getIriAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminologyGraph__Group__1__Impl"


    // $ANTLR start "rule__TerminologyGraph__Group__2"
    // InternalMyDsl.g:348:1: rule__TerminologyGraph__Group__2 : rule__TerminologyGraph__Group__2__Impl rule__TerminologyGraph__Group__3 ;
    public final void rule__TerminologyGraph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:352:1: ( rule__TerminologyGraph__Group__2__Impl rule__TerminologyGraph__Group__3 )
            // InternalMyDsl.g:353:2: rule__TerminologyGraph__Group__2__Impl rule__TerminologyGraph__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__TerminologyGraph__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminologyGraph__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminologyGraph__Group__2"


    // $ANTLR start "rule__TerminologyGraph__Group__2__Impl"
    // InternalMyDsl.g:360:1: rule__TerminologyGraph__Group__2__Impl : ( '{' ) ;
    public final void rule__TerminologyGraph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:364:1: ( ( '{' ) )
            // InternalMyDsl.g:365:1: ( '{' )
            {
            // InternalMyDsl.g:365:1: ( '{' )
            // InternalMyDsl.g:366:2: '{'
            {
             before(grammarAccess.getTerminologyGraphAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTerminologyGraphAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminologyGraph__Group__2__Impl"


    // $ANTLR start "rule__TerminologyGraph__Group__3"
    // InternalMyDsl.g:375:1: rule__TerminologyGraph__Group__3 : rule__TerminologyGraph__Group__3__Impl rule__TerminologyGraph__Group__4 ;
    public final void rule__TerminologyGraph__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:379:1: ( rule__TerminologyGraph__Group__3__Impl rule__TerminologyGraph__Group__4 )
            // InternalMyDsl.g:380:2: rule__TerminologyGraph__Group__3__Impl rule__TerminologyGraph__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__TerminologyGraph__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminologyGraph__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminologyGraph__Group__3"


    // $ANTLR start "rule__TerminologyGraph__Group__3__Impl"
    // InternalMyDsl.g:387:1: rule__TerminologyGraph__Group__3__Impl : ( ( rule__TerminologyGraph__BoxStatementsAssignment_3 )* ) ;
    public final void rule__TerminologyGraph__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:1: ( ( ( rule__TerminologyGraph__BoxStatementsAssignment_3 )* ) )
            // InternalMyDsl.g:392:1: ( ( rule__TerminologyGraph__BoxStatementsAssignment_3 )* )
            {
            // InternalMyDsl.g:392:1: ( ( rule__TerminologyGraph__BoxStatementsAssignment_3 )* )
            // InternalMyDsl.g:393:2: ( rule__TerminologyGraph__BoxStatementsAssignment_3 )*
            {
             before(grammarAccess.getTerminologyGraphAccess().getBoxStatementsAssignment_3()); 
            // InternalMyDsl.g:394:2: ( rule__TerminologyGraph__BoxStatementsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=14 && LA4_0<=16)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:394:3: rule__TerminologyGraph__BoxStatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__TerminologyGraph__BoxStatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getTerminologyGraphAccess().getBoxStatementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminologyGraph__Group__3__Impl"


    // $ANTLR start "rule__TerminologyGraph__Group__4"
    // InternalMyDsl.g:402:1: rule__TerminologyGraph__Group__4 : rule__TerminologyGraph__Group__4__Impl ;
    public final void rule__TerminologyGraph__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:406:1: ( rule__TerminologyGraph__Group__4__Impl )
            // InternalMyDsl.g:407:2: rule__TerminologyGraph__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminologyGraph__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminologyGraph__Group__4"


    // $ANTLR start "rule__TerminologyGraph__Group__4__Impl"
    // InternalMyDsl.g:413:1: rule__TerminologyGraph__Group__4__Impl : ( '}' ) ;
    public final void rule__TerminologyGraph__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:417:1: ( ( '}' ) )
            // InternalMyDsl.g:418:1: ( '}' )
            {
            // InternalMyDsl.g:418:1: ( '}' )
            // InternalMyDsl.g:419:2: '}'
            {
             before(grammarAccess.getTerminologyGraphAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTerminologyGraphAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminologyGraph__Group__4__Impl"


    // $ANTLR start "rule__Aspect__Group__0"
    // InternalMyDsl.g:429:1: rule__Aspect__Group__0 : rule__Aspect__Group__0__Impl rule__Aspect__Group__1 ;
    public final void rule__Aspect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:433:1: ( rule__Aspect__Group__0__Impl rule__Aspect__Group__1 )
            // InternalMyDsl.g:434:2: rule__Aspect__Group__0__Impl rule__Aspect__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Aspect__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aspect__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aspect__Group__0"


    // $ANTLR start "rule__Aspect__Group__0__Impl"
    // InternalMyDsl.g:441:1: rule__Aspect__Group__0__Impl : ( 'aspect' ) ;
    public final void rule__Aspect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:445:1: ( ( 'aspect' ) )
            // InternalMyDsl.g:446:1: ( 'aspect' )
            {
            // InternalMyDsl.g:446:1: ( 'aspect' )
            // InternalMyDsl.g:447:2: 'aspect'
            {
             before(grammarAccess.getAspectAccess().getAspectKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAspectAccess().getAspectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aspect__Group__0__Impl"


    // $ANTLR start "rule__Aspect__Group__1"
    // InternalMyDsl.g:456:1: rule__Aspect__Group__1 : rule__Aspect__Group__1__Impl ;
    public final void rule__Aspect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:460:1: ( rule__Aspect__Group__1__Impl )
            // InternalMyDsl.g:461:2: rule__Aspect__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Aspect__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aspect__Group__1"


    // $ANTLR start "rule__Aspect__Group__1__Impl"
    // InternalMyDsl.g:467:1: rule__Aspect__Group__1__Impl : ( ( rule__Aspect__NameAssignment_1 ) ) ;
    public final void rule__Aspect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:471:1: ( ( ( rule__Aspect__NameAssignment_1 ) ) )
            // InternalMyDsl.g:472:1: ( ( rule__Aspect__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:472:1: ( ( rule__Aspect__NameAssignment_1 ) )
            // InternalMyDsl.g:473:2: ( rule__Aspect__NameAssignment_1 )
            {
             before(grammarAccess.getAspectAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:474:2: ( rule__Aspect__NameAssignment_1 )
            // InternalMyDsl.g:474:3: rule__Aspect__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Aspect__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAspectAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aspect__Group__1__Impl"


    // $ANTLR start "rule__Concept__Group__0"
    // InternalMyDsl.g:483:1: rule__Concept__Group__0 : rule__Concept__Group__0__Impl rule__Concept__Group__1 ;
    public final void rule__Concept__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:487:1: ( rule__Concept__Group__0__Impl rule__Concept__Group__1 )
            // InternalMyDsl.g:488:2: rule__Concept__Group__0__Impl rule__Concept__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Concept__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Concept__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concept__Group__0"


    // $ANTLR start "rule__Concept__Group__0__Impl"
    // InternalMyDsl.g:495:1: rule__Concept__Group__0__Impl : ( 'concept' ) ;
    public final void rule__Concept__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:499:1: ( ( 'concept' ) )
            // InternalMyDsl.g:500:1: ( 'concept' )
            {
            // InternalMyDsl.g:500:1: ( 'concept' )
            // InternalMyDsl.g:501:2: 'concept'
            {
             before(grammarAccess.getConceptAccess().getConceptKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getConceptAccess().getConceptKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concept__Group__0__Impl"


    // $ANTLR start "rule__Concept__Group__1"
    // InternalMyDsl.g:510:1: rule__Concept__Group__1 : rule__Concept__Group__1__Impl ;
    public final void rule__Concept__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:514:1: ( rule__Concept__Group__1__Impl )
            // InternalMyDsl.g:515:2: rule__Concept__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Concept__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concept__Group__1"


    // $ANTLR start "rule__Concept__Group__1__Impl"
    // InternalMyDsl.g:521:1: rule__Concept__Group__1__Impl : ( ( rule__Concept__NameAssignment_1 ) ) ;
    public final void rule__Concept__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:525:1: ( ( ( rule__Concept__NameAssignment_1 ) ) )
            // InternalMyDsl.g:526:1: ( ( rule__Concept__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:526:1: ( ( rule__Concept__NameAssignment_1 ) )
            // InternalMyDsl.g:527:2: ( rule__Concept__NameAssignment_1 )
            {
             before(grammarAccess.getConceptAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:528:2: ( rule__Concept__NameAssignment_1 )
            // InternalMyDsl.g:528:3: rule__Concept__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Concept__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConceptAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concept__Group__1__Impl"


    // $ANTLR start "rule__Relation__Group__0"
    // InternalMyDsl.g:537:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // InternalMyDsl.g:542:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Relation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__0"


    // $ANTLR start "rule__Relation__Group__0__Impl"
    // InternalMyDsl.g:549:1: rule__Relation__Group__0__Impl : ( 'relation' ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:553:1: ( ( 'relation' ) )
            // InternalMyDsl.g:554:1: ( 'relation' )
            {
            // InternalMyDsl.g:554:1: ( 'relation' )
            // InternalMyDsl.g:555:2: 'relation'
            {
             before(grammarAccess.getRelationAccess().getRelationKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getRelationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__0__Impl"


    // $ANTLR start "rule__Relation__Group__1"
    // InternalMyDsl.g:564:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl rule__Relation__Group__2 ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:568:1: ( rule__Relation__Group__1__Impl rule__Relation__Group__2 )
            // InternalMyDsl.g:569:2: rule__Relation__Group__1__Impl rule__Relation__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Relation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__1"


    // $ANTLR start "rule__Relation__Group__1__Impl"
    // InternalMyDsl.g:576:1: rule__Relation__Group__1__Impl : ( ( rule__Relation__NameAssignment_1 ) ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:580:1: ( ( ( rule__Relation__NameAssignment_1 ) ) )
            // InternalMyDsl.g:581:1: ( ( rule__Relation__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:581:1: ( ( rule__Relation__NameAssignment_1 ) )
            // InternalMyDsl.g:582:2: ( rule__Relation__NameAssignment_1 )
            {
             before(grammarAccess.getRelationAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:583:2: ( rule__Relation__NameAssignment_1 )
            // InternalMyDsl.g:583:3: rule__Relation__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Relation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__1__Impl"


    // $ANTLR start "rule__Relation__Group__2"
    // InternalMyDsl.g:591:1: rule__Relation__Group__2 : rule__Relation__Group__2__Impl rule__Relation__Group__3 ;
    public final void rule__Relation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:595:1: ( rule__Relation__Group__2__Impl rule__Relation__Group__3 )
            // InternalMyDsl.g:596:2: rule__Relation__Group__2__Impl rule__Relation__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Relation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__2"


    // $ANTLR start "rule__Relation__Group__2__Impl"
    // InternalMyDsl.g:603:1: rule__Relation__Group__2__Impl : ( '{' ) ;
    public final void rule__Relation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:607:1: ( ( '{' ) )
            // InternalMyDsl.g:608:1: ( '{' )
            {
            // InternalMyDsl.g:608:1: ( '{' )
            // InternalMyDsl.g:609:2: '{'
            {
             before(grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__2__Impl"


    // $ANTLR start "rule__Relation__Group__3"
    // InternalMyDsl.g:618:1: rule__Relation__Group__3 : rule__Relation__Group__3__Impl rule__Relation__Group__4 ;
    public final void rule__Relation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:622:1: ( rule__Relation__Group__3__Impl rule__Relation__Group__4 )
            // InternalMyDsl.g:623:2: rule__Relation__Group__3__Impl rule__Relation__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Relation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__3"


    // $ANTLR start "rule__Relation__Group__3__Impl"
    // InternalMyDsl.g:630:1: rule__Relation__Group__3__Impl : ( 'source' ) ;
    public final void rule__Relation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:634:1: ( ( 'source' ) )
            // InternalMyDsl.g:635:1: ( 'source' )
            {
            // InternalMyDsl.g:635:1: ( 'source' )
            // InternalMyDsl.g:636:2: 'source'
            {
             before(grammarAccess.getRelationAccess().getSourceKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getSourceKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__3__Impl"


    // $ANTLR start "rule__Relation__Group__4"
    // InternalMyDsl.g:645:1: rule__Relation__Group__4 : rule__Relation__Group__4__Impl rule__Relation__Group__5 ;
    public final void rule__Relation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:649:1: ( rule__Relation__Group__4__Impl rule__Relation__Group__5 )
            // InternalMyDsl.g:650:2: rule__Relation__Group__4__Impl rule__Relation__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Relation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__4"


    // $ANTLR start "rule__Relation__Group__4__Impl"
    // InternalMyDsl.g:657:1: rule__Relation__Group__4__Impl : ( '=' ) ;
    public final void rule__Relation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:661:1: ( ( '=' ) )
            // InternalMyDsl.g:662:1: ( '=' )
            {
            // InternalMyDsl.g:662:1: ( '=' )
            // InternalMyDsl.g:663:2: '='
            {
             before(grammarAccess.getRelationAccess().getEqualsSignKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__4__Impl"


    // $ANTLR start "rule__Relation__Group__5"
    // InternalMyDsl.g:672:1: rule__Relation__Group__5 : rule__Relation__Group__5__Impl rule__Relation__Group__6 ;
    public final void rule__Relation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:676:1: ( rule__Relation__Group__5__Impl rule__Relation__Group__6 )
            // InternalMyDsl.g:677:2: rule__Relation__Group__5__Impl rule__Relation__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Relation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__5"


    // $ANTLR start "rule__Relation__Group__5__Impl"
    // InternalMyDsl.g:684:1: rule__Relation__Group__5__Impl : ( ( rule__Relation__SourceAssignment_5 ) ) ;
    public final void rule__Relation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:688:1: ( ( ( rule__Relation__SourceAssignment_5 ) ) )
            // InternalMyDsl.g:689:1: ( ( rule__Relation__SourceAssignment_5 ) )
            {
            // InternalMyDsl.g:689:1: ( ( rule__Relation__SourceAssignment_5 ) )
            // InternalMyDsl.g:690:2: ( rule__Relation__SourceAssignment_5 )
            {
             before(grammarAccess.getRelationAccess().getSourceAssignment_5()); 
            // InternalMyDsl.g:691:2: ( rule__Relation__SourceAssignment_5 )
            // InternalMyDsl.g:691:3: rule__Relation__SourceAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Relation__SourceAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getSourceAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__5__Impl"


    // $ANTLR start "rule__Relation__Group__6"
    // InternalMyDsl.g:699:1: rule__Relation__Group__6 : rule__Relation__Group__6__Impl rule__Relation__Group__7 ;
    public final void rule__Relation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:703:1: ( rule__Relation__Group__6__Impl rule__Relation__Group__7 )
            // InternalMyDsl.g:704:2: rule__Relation__Group__6__Impl rule__Relation__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Relation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__6"


    // $ANTLR start "rule__Relation__Group__6__Impl"
    // InternalMyDsl.g:711:1: rule__Relation__Group__6__Impl : ( 'target' ) ;
    public final void rule__Relation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:715:1: ( ( 'target' ) )
            // InternalMyDsl.g:716:1: ( 'target' )
            {
            // InternalMyDsl.g:716:1: ( 'target' )
            // InternalMyDsl.g:717:2: 'target'
            {
             before(grammarAccess.getRelationAccess().getTargetKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getTargetKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__6__Impl"


    // $ANTLR start "rule__Relation__Group__7"
    // InternalMyDsl.g:726:1: rule__Relation__Group__7 : rule__Relation__Group__7__Impl rule__Relation__Group__8 ;
    public final void rule__Relation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:730:1: ( rule__Relation__Group__7__Impl rule__Relation__Group__8 )
            // InternalMyDsl.g:731:2: rule__Relation__Group__7__Impl rule__Relation__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__Relation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__7"


    // $ANTLR start "rule__Relation__Group__7__Impl"
    // InternalMyDsl.g:738:1: rule__Relation__Group__7__Impl : ( '=' ) ;
    public final void rule__Relation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:742:1: ( ( '=' ) )
            // InternalMyDsl.g:743:1: ( '=' )
            {
            // InternalMyDsl.g:743:1: ( '=' )
            // InternalMyDsl.g:744:2: '='
            {
             before(grammarAccess.getRelationAccess().getEqualsSignKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getEqualsSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__7__Impl"


    // $ANTLR start "rule__Relation__Group__8"
    // InternalMyDsl.g:753:1: rule__Relation__Group__8 : rule__Relation__Group__8__Impl rule__Relation__Group__9 ;
    public final void rule__Relation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:757:1: ( rule__Relation__Group__8__Impl rule__Relation__Group__9 )
            // InternalMyDsl.g:758:2: rule__Relation__Group__8__Impl rule__Relation__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__Relation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__8"


    // $ANTLR start "rule__Relation__Group__8__Impl"
    // InternalMyDsl.g:765:1: rule__Relation__Group__8__Impl : ( ( rule__Relation__TargetAssignment_8 ) ) ;
    public final void rule__Relation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:769:1: ( ( ( rule__Relation__TargetAssignment_8 ) ) )
            // InternalMyDsl.g:770:1: ( ( rule__Relation__TargetAssignment_8 ) )
            {
            // InternalMyDsl.g:770:1: ( ( rule__Relation__TargetAssignment_8 ) )
            // InternalMyDsl.g:771:2: ( rule__Relation__TargetAssignment_8 )
            {
             before(grammarAccess.getRelationAccess().getTargetAssignment_8()); 
            // InternalMyDsl.g:772:2: ( rule__Relation__TargetAssignment_8 )
            // InternalMyDsl.g:772:3: rule__Relation__TargetAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Relation__TargetAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getTargetAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__8__Impl"


    // $ANTLR start "rule__Relation__Group__9"
    // InternalMyDsl.g:780:1: rule__Relation__Group__9 : rule__Relation__Group__9__Impl ;
    public final void rule__Relation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:784:1: ( rule__Relation__Group__9__Impl )
            // InternalMyDsl.g:785:2: rule__Relation__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__9"


    // $ANTLR start "rule__Relation__Group__9__Impl"
    // InternalMyDsl.g:791:1: rule__Relation__Group__9__Impl : ( '}' ) ;
    public final void rule__Relation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:795:1: ( ( '}' ) )
            // InternalMyDsl.g:796:1: ( '}' )
            {
            // InternalMyDsl.g:796:1: ( '}' )
            // InternalMyDsl.g:797:2: '}'
            {
             before(grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_9()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__9__Impl"


    // $ANTLR start "rule__Extent__ModulesAssignment"
    // InternalMyDsl.g:807:1: rule__Extent__ModulesAssignment : ( ruleModule ) ;
    public final void rule__Extent__ModulesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:811:1: ( ( ruleModule ) )
            // InternalMyDsl.g:812:2: ( ruleModule )
            {
            // InternalMyDsl.g:812:2: ( ruleModule )
            // InternalMyDsl.g:813:3: ruleModule
            {
             before(grammarAccess.getExtentAccess().getModulesModuleParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getExtentAccess().getModulesModuleParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extent__ModulesAssignment"


    // $ANTLR start "rule__TerminologyGraph__IriAssignment_1"
    // InternalMyDsl.g:822:1: rule__TerminologyGraph__IriAssignment_1 : ( RULE_ID ) ;
    public final void rule__TerminologyGraph__IriAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:826:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:827:2: ( RULE_ID )
            {
            // InternalMyDsl.g:827:2: ( RULE_ID )
            // InternalMyDsl.g:828:3: RULE_ID
            {
             before(grammarAccess.getTerminologyGraphAccess().getIriIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTerminologyGraphAccess().getIriIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminologyGraph__IriAssignment_1"


    // $ANTLR start "rule__TerminologyGraph__BoxStatementsAssignment_3"
    // InternalMyDsl.g:837:1: rule__TerminologyGraph__BoxStatementsAssignment_3 : ( ruleTerminologyBoxStatement ) ;
    public final void rule__TerminologyGraph__BoxStatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:841:1: ( ( ruleTerminologyBoxStatement ) )
            // InternalMyDsl.g:842:2: ( ruleTerminologyBoxStatement )
            {
            // InternalMyDsl.g:842:2: ( ruleTerminologyBoxStatement )
            // InternalMyDsl.g:843:3: ruleTerminologyBoxStatement
            {
             before(grammarAccess.getTerminologyGraphAccess().getBoxStatementsTerminologyBoxStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTerminologyBoxStatement();

            state._fsp--;

             after(grammarAccess.getTerminologyGraphAccess().getBoxStatementsTerminologyBoxStatementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminologyGraph__BoxStatementsAssignment_3"


    // $ANTLR start "rule__Aspect__NameAssignment_1"
    // InternalMyDsl.g:852:1: rule__Aspect__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Aspect__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:856:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:857:2: ( RULE_ID )
            {
            // InternalMyDsl.g:857:2: ( RULE_ID )
            // InternalMyDsl.g:858:3: RULE_ID
            {
             before(grammarAccess.getAspectAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAspectAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aspect__NameAssignment_1"


    // $ANTLR start "rule__Concept__NameAssignment_1"
    // InternalMyDsl.g:867:1: rule__Concept__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Concept__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:871:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:872:2: ( RULE_ID )
            {
            // InternalMyDsl.g:872:2: ( RULE_ID )
            // InternalMyDsl.g:873:3: RULE_ID
            {
             before(grammarAccess.getConceptAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConceptAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concept__NameAssignment_1"


    // $ANTLR start "rule__Relation__NameAssignment_1"
    // InternalMyDsl.g:882:1: rule__Relation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Relation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:886:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:887:2: ( RULE_ID )
            {
            // InternalMyDsl.g:887:2: ( RULE_ID )
            // InternalMyDsl.g:888:3: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__NameAssignment_1"


    // $ANTLR start "rule__Relation__SourceAssignment_5"
    // InternalMyDsl.g:897:1: rule__Relation__SourceAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__SourceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:901:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:902:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:902:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:903:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getSourceEntityCrossReference_5_0()); 
            // InternalMyDsl.g:904:3: ( RULE_ID )
            // InternalMyDsl.g:905:4: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getSourceEntityIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getSourceEntityIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getRelationAccess().getSourceEntityCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__SourceAssignment_5"


    // $ANTLR start "rule__Relation__TargetAssignment_8"
    // InternalMyDsl.g:916:1: rule__Relation__TargetAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__TargetAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:920:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:921:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:921:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:922:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getTargetEntityCrossReference_8_0()); 
            // InternalMyDsl.g:923:3: ( RULE_ID )
            // InternalMyDsl.g:924:4: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getTargetEntityIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getTargetEntityIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getRelationAccess().getTargetEntityCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__TargetAssignment_8"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002000L});

}
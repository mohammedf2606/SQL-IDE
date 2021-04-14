package uk.ac.kcl.inf.languages.tracery.ide.contentassist.antlr.internal;

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
import uk.ac.kcl.inf.languages.tracery.services.TraceryLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTraceryLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'&'", "':'", "'&origin&'", "'['", "']'", "','", "'#'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalTraceryLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTraceryLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTraceryLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTraceryLanguage.g"; }


    	private TraceryLanguageGrammarAccess grammarAccess;

    	public void setGrammarAccess(TraceryLanguageGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleTraceryProgram"
    // InternalTraceryLanguage.g:53:1: entryRuleTraceryProgram : ruleTraceryProgram EOF ;
    public final void entryRuleTraceryProgram() throws RecognitionException {
        try {
            // InternalTraceryLanguage.g:54:1: ( ruleTraceryProgram EOF )
            // InternalTraceryLanguage.g:55:1: ruleTraceryProgram EOF
            {
             before(grammarAccess.getTraceryProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleTraceryProgram();

            state._fsp--;

             after(grammarAccess.getTraceryProgramRule()); 
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
    // $ANTLR end "entryRuleTraceryProgram"


    // $ANTLR start "ruleTraceryProgram"
    // InternalTraceryLanguage.g:62:1: ruleTraceryProgram : ( ( rule__TraceryProgram__Group__0 ) ) ;
    public final void ruleTraceryProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:66:2: ( ( ( rule__TraceryProgram__Group__0 ) ) )
            // InternalTraceryLanguage.g:67:2: ( ( rule__TraceryProgram__Group__0 ) )
            {
            // InternalTraceryLanguage.g:67:2: ( ( rule__TraceryProgram__Group__0 ) )
            // InternalTraceryLanguage.g:68:3: ( rule__TraceryProgram__Group__0 )
            {
             before(grammarAccess.getTraceryProgramAccess().getGroup()); 
            // InternalTraceryLanguage.g:69:3: ( rule__TraceryProgram__Group__0 )
            // InternalTraceryLanguage.g:69:4: rule__TraceryProgram__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TraceryProgram__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTraceryProgramAccess().getGroup()); 

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
    // $ANTLR end "ruleTraceryProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalTraceryLanguage.g:78:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:82:1: ( ruleStatement EOF )
            // InternalTraceryLanguage.g:83:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalTraceryLanguage.g:93:1: ruleStatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:98:2: ( ( ( rule__Statement__Group__0 ) ) )
            // InternalTraceryLanguage.g:99:2: ( ( rule__Statement__Group__0 ) )
            {
            // InternalTraceryLanguage.g:99:2: ( ( rule__Statement__Group__0 ) )
            // InternalTraceryLanguage.g:100:3: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // InternalTraceryLanguage.g:101:3: ( rule__Statement__Group__0 )
            // InternalTraceryLanguage.g:101:4: rule__Statement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleInitialJSONLines"
    // InternalTraceryLanguage.g:111:1: entryRuleInitialJSONLines : ruleInitialJSONLines EOF ;
    public final void entryRuleInitialJSONLines() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:115:1: ( ruleInitialJSONLines EOF )
            // InternalTraceryLanguage.g:116:1: ruleInitialJSONLines EOF
            {
             before(grammarAccess.getInitialJSONLinesRule()); 
            pushFollow(FOLLOW_1);
            ruleInitialJSONLines();

            state._fsp--;

             after(grammarAccess.getInitialJSONLinesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleInitialJSONLines"


    // $ANTLR start "ruleInitialJSONLines"
    // InternalTraceryLanguage.g:126:1: ruleInitialJSONLines : ( ( rule__InitialJSONLines__Group__0 ) ) ;
    public final void ruleInitialJSONLines() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:131:2: ( ( ( rule__InitialJSONLines__Group__0 ) ) )
            // InternalTraceryLanguage.g:132:2: ( ( rule__InitialJSONLines__Group__0 ) )
            {
            // InternalTraceryLanguage.g:132:2: ( ( rule__InitialJSONLines__Group__0 ) )
            // InternalTraceryLanguage.g:133:3: ( rule__InitialJSONLines__Group__0 )
            {
             before(grammarAccess.getInitialJSONLinesAccess().getGroup()); 
            // InternalTraceryLanguage.g:134:3: ( rule__InitialJSONLines__Group__0 )
            // InternalTraceryLanguage.g:134:4: rule__InitialJSONLines__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InitialJSONLines__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInitialJSONLinesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleInitialJSONLines"


    // $ANTLR start "entryRuleFinalJSONLine"
    // InternalTraceryLanguage.g:144:1: entryRuleFinalJSONLine : ruleFinalJSONLine EOF ;
    public final void entryRuleFinalJSONLine() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:148:1: ( ruleFinalJSONLine EOF )
            // InternalTraceryLanguage.g:149:1: ruleFinalJSONLine EOF
            {
             before(grammarAccess.getFinalJSONLineRule()); 
            pushFollow(FOLLOW_1);
            ruleFinalJSONLine();

            state._fsp--;

             after(grammarAccess.getFinalJSONLineRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleFinalJSONLine"


    // $ANTLR start "ruleFinalJSONLine"
    // InternalTraceryLanguage.g:159:1: ruleFinalJSONLine : ( ( rule__FinalJSONLine__Group__0 ) ) ;
    public final void ruleFinalJSONLine() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:164:2: ( ( ( rule__FinalJSONLine__Group__0 ) ) )
            // InternalTraceryLanguage.g:165:2: ( ( rule__FinalJSONLine__Group__0 ) )
            {
            // InternalTraceryLanguage.g:165:2: ( ( rule__FinalJSONLine__Group__0 ) )
            // InternalTraceryLanguage.g:166:3: ( rule__FinalJSONLine__Group__0 )
            {
             before(grammarAccess.getFinalJSONLineAccess().getGroup()); 
            // InternalTraceryLanguage.g:167:3: ( rule__FinalJSONLine__Group__0 )
            // InternalTraceryLanguage.g:167:4: rule__FinalJSONLine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FinalJSONLine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFinalJSONLineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleFinalJSONLine"


    // $ANTLR start "entryRuleInitialJSONEnding"
    // InternalTraceryLanguage.g:177:1: entryRuleInitialJSONEnding : ruleInitialJSONEnding EOF ;
    public final void entryRuleInitialJSONEnding() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:181:1: ( ruleInitialJSONEnding EOF )
            // InternalTraceryLanguage.g:182:1: ruleInitialJSONEnding EOF
            {
             before(grammarAccess.getInitialJSONEndingRule()); 
            pushFollow(FOLLOW_1);
            ruleInitialJSONEnding();

            state._fsp--;

             after(grammarAccess.getInitialJSONEndingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleInitialJSONEnding"


    // $ANTLR start "ruleInitialJSONEnding"
    // InternalTraceryLanguage.g:192:1: ruleInitialJSONEnding : ( ( rule__InitialJSONEnding__Group__0 ) ) ;
    public final void ruleInitialJSONEnding() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:197:2: ( ( ( rule__InitialJSONEnding__Group__0 ) ) )
            // InternalTraceryLanguage.g:198:2: ( ( rule__InitialJSONEnding__Group__0 ) )
            {
            // InternalTraceryLanguage.g:198:2: ( ( rule__InitialJSONEnding__Group__0 ) )
            // InternalTraceryLanguage.g:199:3: ( rule__InitialJSONEnding__Group__0 )
            {
             before(grammarAccess.getInitialJSONEndingAccess().getGroup()); 
            // InternalTraceryLanguage.g:200:3: ( rule__InitialJSONEnding__Group__0 )
            // InternalTraceryLanguage.g:200:4: rule__InitialJSONEnding__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InitialJSONEnding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInitialJSONEndingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleInitialJSONEnding"


    // $ANTLR start "entryRuleInnerValues"
    // InternalTraceryLanguage.g:210:1: entryRuleInnerValues : ruleInnerValues EOF ;
    public final void entryRuleInnerValues() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:214:1: ( ruleInnerValues EOF )
            // InternalTraceryLanguage.g:215:1: ruleInnerValues EOF
            {
             before(grammarAccess.getInnerValuesRule()); 
            pushFollow(FOLLOW_1);
            ruleInnerValues();

            state._fsp--;

             after(grammarAccess.getInnerValuesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleInnerValues"


    // $ANTLR start "ruleInnerValues"
    // InternalTraceryLanguage.g:225:1: ruleInnerValues : ( ( rule__InnerValues__Group__0 ) ) ;
    public final void ruleInnerValues() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:230:2: ( ( ( rule__InnerValues__Group__0 ) ) )
            // InternalTraceryLanguage.g:231:2: ( ( rule__InnerValues__Group__0 ) )
            {
            // InternalTraceryLanguage.g:231:2: ( ( rule__InnerValues__Group__0 ) )
            // InternalTraceryLanguage.g:232:3: ( rule__InnerValues__Group__0 )
            {
             before(grammarAccess.getInnerValuesAccess().getGroup()); 
            // InternalTraceryLanguage.g:233:3: ( rule__InnerValues__Group__0 )
            // InternalTraceryLanguage.g:233:4: rule__InnerValues__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InnerValues__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInnerValuesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleInnerValues"


    // $ANTLR start "entryRuleFinalJSONEnding"
    // InternalTraceryLanguage.g:243:1: entryRuleFinalJSONEnding : ruleFinalJSONEnding EOF ;
    public final void entryRuleFinalJSONEnding() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:247:1: ( ruleFinalJSONEnding EOF )
            // InternalTraceryLanguage.g:248:1: ruleFinalJSONEnding EOF
            {
             before(grammarAccess.getFinalJSONEndingRule()); 
            pushFollow(FOLLOW_1);
            ruleFinalJSONEnding();

            state._fsp--;

             after(grammarAccess.getFinalJSONEndingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleFinalJSONEnding"


    // $ANTLR start "ruleFinalJSONEnding"
    // InternalTraceryLanguage.g:258:1: ruleFinalJSONEnding : ( ( rule__FinalJSONEnding__Group__0 ) ) ;
    public final void ruleFinalJSONEnding() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:263:2: ( ( ( rule__FinalJSONEnding__Group__0 ) ) )
            // InternalTraceryLanguage.g:264:2: ( ( rule__FinalJSONEnding__Group__0 ) )
            {
            // InternalTraceryLanguage.g:264:2: ( ( rule__FinalJSONEnding__Group__0 ) )
            // InternalTraceryLanguage.g:265:3: ( rule__FinalJSONEnding__Group__0 )
            {
             before(grammarAccess.getFinalJSONEndingAccess().getGroup()); 
            // InternalTraceryLanguage.g:266:3: ( rule__FinalJSONEnding__Group__0 )
            // InternalTraceryLanguage.g:266:4: rule__FinalJSONEnding__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FinalJSONEnding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFinalJSONEndingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleFinalJSONEnding"


    // $ANTLR start "entryRuleStartValue"
    // InternalTraceryLanguage.g:276:1: entryRuleStartValue : ruleStartValue EOF ;
    public final void entryRuleStartValue() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:280:1: ( ruleStartValue EOF )
            // InternalTraceryLanguage.g:281:1: ruleStartValue EOF
            {
             before(grammarAccess.getStartValueRule()); 
            pushFollow(FOLLOW_1);
            ruleStartValue();

            state._fsp--;

             after(grammarAccess.getStartValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleStartValue"


    // $ANTLR start "ruleStartValue"
    // InternalTraceryLanguage.g:291:1: ruleStartValue : ( ( rule__StartValue__Group__0 ) ) ;
    public final void ruleStartValue() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:296:2: ( ( ( rule__StartValue__Group__0 ) ) )
            // InternalTraceryLanguage.g:297:2: ( ( rule__StartValue__Group__0 ) )
            {
            // InternalTraceryLanguage.g:297:2: ( ( rule__StartValue__Group__0 ) )
            // InternalTraceryLanguage.g:298:3: ( rule__StartValue__Group__0 )
            {
             before(grammarAccess.getStartValueAccess().getGroup()); 
            // InternalTraceryLanguage.g:299:3: ( rule__StartValue__Group__0 )
            // InternalTraceryLanguage.g:299:4: rule__StartValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StartValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStartValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleStartValue"


    // $ANTLR start "entryRuleNormalValue"
    // InternalTraceryLanguage.g:309:1: entryRuleNormalValue : ruleNormalValue EOF ;
    public final void entryRuleNormalValue() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:313:1: ( ruleNormalValue EOF )
            // InternalTraceryLanguage.g:314:1: ruleNormalValue EOF
            {
             before(grammarAccess.getNormalValueRule()); 
            pushFollow(FOLLOW_1);
            ruleNormalValue();

            state._fsp--;

             after(grammarAccess.getNormalValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleNormalValue"


    // $ANTLR start "ruleNormalValue"
    // InternalTraceryLanguage.g:324:1: ruleNormalValue : ( ( rule__NormalValue__Group__0 ) ) ;
    public final void ruleNormalValue() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:329:2: ( ( ( rule__NormalValue__Group__0 ) ) )
            // InternalTraceryLanguage.g:330:2: ( ( rule__NormalValue__Group__0 ) )
            {
            // InternalTraceryLanguage.g:330:2: ( ( rule__NormalValue__Group__0 ) )
            // InternalTraceryLanguage.g:331:3: ( rule__NormalValue__Group__0 )
            {
             before(grammarAccess.getNormalValueAccess().getGroup()); 
            // InternalTraceryLanguage.g:332:3: ( rule__NormalValue__Group__0 )
            // InternalTraceryLanguage.g:332:4: rule__NormalValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NormalValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNormalValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleNormalValue"


    // $ANTLR start "entryRuleInnerStatements"
    // InternalTraceryLanguage.g:342:1: entryRuleInnerStatements : ruleInnerStatements EOF ;
    public final void entryRuleInnerStatements() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:346:1: ( ruleInnerStatements EOF )
            // InternalTraceryLanguage.g:347:1: ruleInnerStatements EOF
            {
             before(grammarAccess.getInnerStatementsRule()); 
            pushFollow(FOLLOW_1);
            ruleInnerStatements();

            state._fsp--;

             after(grammarAccess.getInnerStatementsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleInnerStatements"


    // $ANTLR start "ruleInnerStatements"
    // InternalTraceryLanguage.g:357:1: ruleInnerStatements : ( ( rule__InnerStatements__Alternatives ) ) ;
    public final void ruleInnerStatements() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:362:2: ( ( ( rule__InnerStatements__Alternatives ) ) )
            // InternalTraceryLanguage.g:363:2: ( ( rule__InnerStatements__Alternatives ) )
            {
            // InternalTraceryLanguage.g:363:2: ( ( rule__InnerStatements__Alternatives ) )
            // InternalTraceryLanguage.g:364:3: ( rule__InnerStatements__Alternatives )
            {
             before(grammarAccess.getInnerStatementsAccess().getAlternatives()); 
            // InternalTraceryLanguage.g:365:3: ( rule__InnerStatements__Alternatives )
            // InternalTraceryLanguage.g:365:4: rule__InnerStatements__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__InnerStatements__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInnerStatementsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleInnerStatements"


    // $ANTLR start "entryRuleStringDeclaration"
    // InternalTraceryLanguage.g:375:1: entryRuleStringDeclaration : ruleStringDeclaration EOF ;
    public final void entryRuleStringDeclaration() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:379:1: ( ruleStringDeclaration EOF )
            // InternalTraceryLanguage.g:380:1: ruleStringDeclaration EOF
            {
             before(grammarAccess.getStringDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleStringDeclaration();

            state._fsp--;

             after(grammarAccess.getStringDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleStringDeclaration"


    // $ANTLR start "ruleStringDeclaration"
    // InternalTraceryLanguage.g:390:1: ruleStringDeclaration : ( ( rule__StringDeclaration__ValueAssignment ) ) ;
    public final void ruleStringDeclaration() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:395:2: ( ( ( rule__StringDeclaration__ValueAssignment ) ) )
            // InternalTraceryLanguage.g:396:2: ( ( rule__StringDeclaration__ValueAssignment ) )
            {
            // InternalTraceryLanguage.g:396:2: ( ( rule__StringDeclaration__ValueAssignment ) )
            // InternalTraceryLanguage.g:397:3: ( rule__StringDeclaration__ValueAssignment )
            {
             before(grammarAccess.getStringDeclarationAccess().getValueAssignment()); 
            // InternalTraceryLanguage.g:398:3: ( rule__StringDeclaration__ValueAssignment )
            // InternalTraceryLanguage.g:398:4: rule__StringDeclaration__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringDeclaration__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringDeclarationAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleStringDeclaration"


    // $ANTLR start "entryRuleDeclaredVariable"
    // InternalTraceryLanguage.g:408:1: entryRuleDeclaredVariable : ruleDeclaredVariable EOF ;
    public final void entryRuleDeclaredVariable() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:412:1: ( ruleDeclaredVariable EOF )
            // InternalTraceryLanguage.g:413:1: ruleDeclaredVariable EOF
            {
             before(grammarAccess.getDeclaredVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclaredVariable();

            state._fsp--;

             after(grammarAccess.getDeclaredVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleDeclaredVariable"


    // $ANTLR start "ruleDeclaredVariable"
    // InternalTraceryLanguage.g:423:1: ruleDeclaredVariable : ( ( rule__DeclaredVariable__Group__0 ) ) ;
    public final void ruleDeclaredVariable() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:428:2: ( ( ( rule__DeclaredVariable__Group__0 ) ) )
            // InternalTraceryLanguage.g:429:2: ( ( rule__DeclaredVariable__Group__0 ) )
            {
            // InternalTraceryLanguage.g:429:2: ( ( rule__DeclaredVariable__Group__0 ) )
            // InternalTraceryLanguage.g:430:3: ( rule__DeclaredVariable__Group__0 )
            {
             before(grammarAccess.getDeclaredVariableAccess().getGroup()); 
            // InternalTraceryLanguage.g:431:3: ( rule__DeclaredVariable__Group__0 )
            // InternalTraceryLanguage.g:431:4: rule__DeclaredVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeclaredVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclaredVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleDeclaredVariable"


    // $ANTLR start "rule__InnerStatements__Alternatives"
    // InternalTraceryLanguage.g:440:1: rule__InnerStatements__Alternatives : ( ( ruleStringDeclaration ) | ( ruleDeclaredVariable ) );
    public final void rule__InnerStatements__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:444:1: ( ( ruleStringDeclaration ) | ( ruleDeclaredVariable ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==19) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalTraceryLanguage.g:445:2: ( ruleStringDeclaration )
                    {
                    // InternalTraceryLanguage.g:445:2: ( ruleStringDeclaration )
                    // InternalTraceryLanguage.g:446:3: ruleStringDeclaration
                    {
                     before(grammarAccess.getInnerStatementsAccess().getStringDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStringDeclaration();

                    state._fsp--;

                     after(grammarAccess.getInnerStatementsAccess().getStringDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryLanguage.g:451:2: ( ruleDeclaredVariable )
                    {
                    // InternalTraceryLanguage.g:451:2: ( ruleDeclaredVariable )
                    // InternalTraceryLanguage.g:452:3: ruleDeclaredVariable
                    {
                     before(grammarAccess.getInnerStatementsAccess().getDeclaredVariableParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDeclaredVariable();

                    state._fsp--;

                     after(grammarAccess.getInnerStatementsAccess().getDeclaredVariableParserRuleCall_1()); 

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
    // $ANTLR end "rule__InnerStatements__Alternatives"


    // $ANTLR start "rule__TraceryProgram__Group__0"
    // InternalTraceryLanguage.g:461:1: rule__TraceryProgram__Group__0 : rule__TraceryProgram__Group__0__Impl rule__TraceryProgram__Group__1 ;
    public final void rule__TraceryProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:465:1: ( rule__TraceryProgram__Group__0__Impl rule__TraceryProgram__Group__1 )
            // InternalTraceryLanguage.g:466:2: rule__TraceryProgram__Group__0__Impl rule__TraceryProgram__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TraceryProgram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TraceryProgram__Group__1();

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
    // $ANTLR end "rule__TraceryProgram__Group__0"


    // $ANTLR start "rule__TraceryProgram__Group__0__Impl"
    // InternalTraceryLanguage.g:473:1: rule__TraceryProgram__Group__0__Impl : ( '{' ) ;
    public final void rule__TraceryProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:477:1: ( ( '{' ) )
            // InternalTraceryLanguage.g:478:1: ( '{' )
            {
            // InternalTraceryLanguage.g:478:1: ( '{' )
            // InternalTraceryLanguage.g:479:2: '{'
            {
             before(grammarAccess.getTraceryProgramAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getTraceryProgramAccess().getLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__TraceryProgram__Group__0__Impl"


    // $ANTLR start "rule__TraceryProgram__Group__1"
    // InternalTraceryLanguage.g:488:1: rule__TraceryProgram__Group__1 : rule__TraceryProgram__Group__1__Impl rule__TraceryProgram__Group__2 ;
    public final void rule__TraceryProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:492:1: ( rule__TraceryProgram__Group__1__Impl rule__TraceryProgram__Group__2 )
            // InternalTraceryLanguage.g:493:2: rule__TraceryProgram__Group__1__Impl rule__TraceryProgram__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__TraceryProgram__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TraceryProgram__Group__2();

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
    // $ANTLR end "rule__TraceryProgram__Group__1"


    // $ANTLR start "rule__TraceryProgram__Group__1__Impl"
    // InternalTraceryLanguage.g:500:1: rule__TraceryProgram__Group__1__Impl : ( ( rule__TraceryProgram__StatementsAssignment_1 ) ) ;
    public final void rule__TraceryProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:504:1: ( ( ( rule__TraceryProgram__StatementsAssignment_1 ) ) )
            // InternalTraceryLanguage.g:505:1: ( ( rule__TraceryProgram__StatementsAssignment_1 ) )
            {
            // InternalTraceryLanguage.g:505:1: ( ( rule__TraceryProgram__StatementsAssignment_1 ) )
            // InternalTraceryLanguage.g:506:2: ( rule__TraceryProgram__StatementsAssignment_1 )
            {
             before(grammarAccess.getTraceryProgramAccess().getStatementsAssignment_1()); 
            // InternalTraceryLanguage.g:507:2: ( rule__TraceryProgram__StatementsAssignment_1 )
            // InternalTraceryLanguage.g:507:3: rule__TraceryProgram__StatementsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TraceryProgram__StatementsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTraceryProgramAccess().getStatementsAssignment_1()); 

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
    // $ANTLR end "rule__TraceryProgram__Group__1__Impl"


    // $ANTLR start "rule__TraceryProgram__Group__2"
    // InternalTraceryLanguage.g:515:1: rule__TraceryProgram__Group__2 : rule__TraceryProgram__Group__2__Impl ;
    public final void rule__TraceryProgram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:519:1: ( rule__TraceryProgram__Group__2__Impl )
            // InternalTraceryLanguage.g:520:2: rule__TraceryProgram__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TraceryProgram__Group__2__Impl();

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
    // $ANTLR end "rule__TraceryProgram__Group__2"


    // $ANTLR start "rule__TraceryProgram__Group__2__Impl"
    // InternalTraceryLanguage.g:526:1: rule__TraceryProgram__Group__2__Impl : ( '}' ) ;
    public final void rule__TraceryProgram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:530:1: ( ( '}' ) )
            // InternalTraceryLanguage.g:531:1: ( '}' )
            {
            // InternalTraceryLanguage.g:531:1: ( '}' )
            // InternalTraceryLanguage.g:532:2: '}'
            {
             before(grammarAccess.getTraceryProgramAccess().getRightCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTraceryProgramAccess().getRightCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__TraceryProgram__Group__2__Impl"


    // $ANTLR start "rule__Statement__Group__0"
    // InternalTraceryLanguage.g:542:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:546:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalTraceryLanguage.g:547:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group__1();

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
    // $ANTLR end "rule__Statement__Group__0"


    // $ANTLR start "rule__Statement__Group__0__Impl"
    // InternalTraceryLanguage.g:554:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__InitialStatementAssignment_0 )* ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:558:1: ( ( ( rule__Statement__InitialStatementAssignment_0 )* ) )
            // InternalTraceryLanguage.g:559:1: ( ( rule__Statement__InitialStatementAssignment_0 )* )
            {
            // InternalTraceryLanguage.g:559:1: ( ( rule__Statement__InitialStatementAssignment_0 )* )
            // InternalTraceryLanguage.g:560:2: ( rule__Statement__InitialStatementAssignment_0 )*
            {
             before(grammarAccess.getStatementAccess().getInitialStatementAssignment_0()); 
            // InternalTraceryLanguage.g:561:2: ( rule__Statement__InitialStatementAssignment_0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTraceryLanguage.g:561:3: rule__Statement__InitialStatementAssignment_0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Statement__InitialStatementAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getStatementAccess().getInitialStatementAssignment_0()); 

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
    // $ANTLR end "rule__Statement__Group__0__Impl"


    // $ANTLR start "rule__Statement__Group__1"
    // InternalTraceryLanguage.g:569:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:573:1: ( rule__Statement__Group__1__Impl )
            // InternalTraceryLanguage.g:574:2: rule__Statement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__1__Impl();

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
    // $ANTLR end "rule__Statement__Group__1"


    // $ANTLR start "rule__Statement__Group__1__Impl"
    // InternalTraceryLanguage.g:580:1: rule__Statement__Group__1__Impl : ( ( rule__Statement__FinalStatementAssignment_1 ) ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:584:1: ( ( ( rule__Statement__FinalStatementAssignment_1 ) ) )
            // InternalTraceryLanguage.g:585:1: ( ( rule__Statement__FinalStatementAssignment_1 ) )
            {
            // InternalTraceryLanguage.g:585:1: ( ( rule__Statement__FinalStatementAssignment_1 ) )
            // InternalTraceryLanguage.g:586:2: ( rule__Statement__FinalStatementAssignment_1 )
            {
             before(grammarAccess.getStatementAccess().getFinalStatementAssignment_1()); 
            // InternalTraceryLanguage.g:587:2: ( rule__Statement__FinalStatementAssignment_1 )
            // InternalTraceryLanguage.g:587:3: rule__Statement__FinalStatementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Statement__FinalStatementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getFinalStatementAssignment_1()); 

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
    // $ANTLR end "rule__Statement__Group__1__Impl"


    // $ANTLR start "rule__InitialJSONLines__Group__0"
    // InternalTraceryLanguage.g:596:1: rule__InitialJSONLines__Group__0 : rule__InitialJSONLines__Group__0__Impl rule__InitialJSONLines__Group__1 ;
    public final void rule__InitialJSONLines__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:600:1: ( rule__InitialJSONLines__Group__0__Impl rule__InitialJSONLines__Group__1 )
            // InternalTraceryLanguage.g:601:2: rule__InitialJSONLines__Group__0__Impl rule__InitialJSONLines__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__InitialJSONLines__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialJSONLines__Group__1();

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
    // $ANTLR end "rule__InitialJSONLines__Group__0"


    // $ANTLR start "rule__InitialJSONLines__Group__0__Impl"
    // InternalTraceryLanguage.g:608:1: rule__InitialJSONLines__Group__0__Impl : ( '&' ) ;
    public final void rule__InitialJSONLines__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:612:1: ( ( '&' ) )
            // InternalTraceryLanguage.g:613:1: ( '&' )
            {
            // InternalTraceryLanguage.g:613:1: ( '&' )
            // InternalTraceryLanguage.g:614:2: '&'
            {
             before(grammarAccess.getInitialJSONLinesAccess().getAmpersandKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getInitialJSONLinesAccess().getAmpersandKeyword_0()); 

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
    // $ANTLR end "rule__InitialJSONLines__Group__0__Impl"


    // $ANTLR start "rule__InitialJSONLines__Group__1"
    // InternalTraceryLanguage.g:623:1: rule__InitialJSONLines__Group__1 : rule__InitialJSONLines__Group__1__Impl rule__InitialJSONLines__Group__2 ;
    public final void rule__InitialJSONLines__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:627:1: ( rule__InitialJSONLines__Group__1__Impl rule__InitialJSONLines__Group__2 )
            // InternalTraceryLanguage.g:628:2: rule__InitialJSONLines__Group__1__Impl rule__InitialJSONLines__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__InitialJSONLines__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialJSONLines__Group__2();

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
    // $ANTLR end "rule__InitialJSONLines__Group__1"


    // $ANTLR start "rule__InitialJSONLines__Group__1__Impl"
    // InternalTraceryLanguage.g:635:1: rule__InitialJSONLines__Group__1__Impl : ( ( rule__InitialJSONLines__NameAssignment_1 ) ) ;
    public final void rule__InitialJSONLines__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:639:1: ( ( ( rule__InitialJSONLines__NameAssignment_1 ) ) )
            // InternalTraceryLanguage.g:640:1: ( ( rule__InitialJSONLines__NameAssignment_1 ) )
            {
            // InternalTraceryLanguage.g:640:1: ( ( rule__InitialJSONLines__NameAssignment_1 ) )
            // InternalTraceryLanguage.g:641:2: ( rule__InitialJSONLines__NameAssignment_1 )
            {
             before(grammarAccess.getInitialJSONLinesAccess().getNameAssignment_1()); 
            // InternalTraceryLanguage.g:642:2: ( rule__InitialJSONLines__NameAssignment_1 )
            // InternalTraceryLanguage.g:642:3: rule__InitialJSONLines__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InitialJSONLines__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInitialJSONLinesAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__InitialJSONLines__Group__1__Impl"


    // $ANTLR start "rule__InitialJSONLines__Group__2"
    // InternalTraceryLanguage.g:650:1: rule__InitialJSONLines__Group__2 : rule__InitialJSONLines__Group__2__Impl rule__InitialJSONLines__Group__3 ;
    public final void rule__InitialJSONLines__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:654:1: ( rule__InitialJSONLines__Group__2__Impl rule__InitialJSONLines__Group__3 )
            // InternalTraceryLanguage.g:655:2: rule__InitialJSONLines__Group__2__Impl rule__InitialJSONLines__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__InitialJSONLines__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialJSONLines__Group__3();

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
    // $ANTLR end "rule__InitialJSONLines__Group__2"


    // $ANTLR start "rule__InitialJSONLines__Group__2__Impl"
    // InternalTraceryLanguage.g:662:1: rule__InitialJSONLines__Group__2__Impl : ( '&' ) ;
    public final void rule__InitialJSONLines__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:666:1: ( ( '&' ) )
            // InternalTraceryLanguage.g:667:1: ( '&' )
            {
            // InternalTraceryLanguage.g:667:1: ( '&' )
            // InternalTraceryLanguage.g:668:2: '&'
            {
             before(grammarAccess.getInitialJSONLinesAccess().getAmpersandKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getInitialJSONLinesAccess().getAmpersandKeyword_2()); 

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
    // $ANTLR end "rule__InitialJSONLines__Group__2__Impl"


    // $ANTLR start "rule__InitialJSONLines__Group__3"
    // InternalTraceryLanguage.g:677:1: rule__InitialJSONLines__Group__3 : rule__InitialJSONLines__Group__3__Impl rule__InitialJSONLines__Group__4 ;
    public final void rule__InitialJSONLines__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:681:1: ( rule__InitialJSONLines__Group__3__Impl rule__InitialJSONLines__Group__4 )
            // InternalTraceryLanguage.g:682:2: rule__InitialJSONLines__Group__3__Impl rule__InitialJSONLines__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__InitialJSONLines__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialJSONLines__Group__4();

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
    // $ANTLR end "rule__InitialJSONLines__Group__3"


    // $ANTLR start "rule__InitialJSONLines__Group__3__Impl"
    // InternalTraceryLanguage.g:689:1: rule__InitialJSONLines__Group__3__Impl : ( ':' ) ;
    public final void rule__InitialJSONLines__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:693:1: ( ( ':' ) )
            // InternalTraceryLanguage.g:694:1: ( ':' )
            {
            // InternalTraceryLanguage.g:694:1: ( ':' )
            // InternalTraceryLanguage.g:695:2: ':'
            {
             before(grammarAccess.getInitialJSONLinesAccess().getColonKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getInitialJSONLinesAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__InitialJSONLines__Group__3__Impl"


    // $ANTLR start "rule__InitialJSONLines__Group__4"
    // InternalTraceryLanguage.g:704:1: rule__InitialJSONLines__Group__4 : rule__InitialJSONLines__Group__4__Impl ;
    public final void rule__InitialJSONLines__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:708:1: ( rule__InitialJSONLines__Group__4__Impl )
            // InternalTraceryLanguage.g:709:2: rule__InitialJSONLines__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InitialJSONLines__Group__4__Impl();

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
    // $ANTLR end "rule__InitialJSONLines__Group__4"


    // $ANTLR start "rule__InitialJSONLines__Group__4__Impl"
    // InternalTraceryLanguage.g:715:1: rule__InitialJSONLines__Group__4__Impl : ( ( rule__InitialJSONLines__ValueAssignment_4 ) ) ;
    public final void rule__InitialJSONLines__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:719:1: ( ( ( rule__InitialJSONLines__ValueAssignment_4 ) ) )
            // InternalTraceryLanguage.g:720:1: ( ( rule__InitialJSONLines__ValueAssignment_4 ) )
            {
            // InternalTraceryLanguage.g:720:1: ( ( rule__InitialJSONLines__ValueAssignment_4 ) )
            // InternalTraceryLanguage.g:721:2: ( rule__InitialJSONLines__ValueAssignment_4 )
            {
             before(grammarAccess.getInitialJSONLinesAccess().getValueAssignment_4()); 
            // InternalTraceryLanguage.g:722:2: ( rule__InitialJSONLines__ValueAssignment_4 )
            // InternalTraceryLanguage.g:722:3: rule__InitialJSONLines__ValueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__InitialJSONLines__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInitialJSONLinesAccess().getValueAssignment_4()); 

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
    // $ANTLR end "rule__InitialJSONLines__Group__4__Impl"


    // $ANTLR start "rule__FinalJSONLine__Group__0"
    // InternalTraceryLanguage.g:731:1: rule__FinalJSONLine__Group__0 : rule__FinalJSONLine__Group__0__Impl rule__FinalJSONLine__Group__1 ;
    public final void rule__FinalJSONLine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:735:1: ( rule__FinalJSONLine__Group__0__Impl rule__FinalJSONLine__Group__1 )
            // InternalTraceryLanguage.g:736:2: rule__FinalJSONLine__Group__0__Impl rule__FinalJSONLine__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__FinalJSONLine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinalJSONLine__Group__1();

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
    // $ANTLR end "rule__FinalJSONLine__Group__0"


    // $ANTLR start "rule__FinalJSONLine__Group__0__Impl"
    // InternalTraceryLanguage.g:743:1: rule__FinalJSONLine__Group__0__Impl : ( '&origin&' ) ;
    public final void rule__FinalJSONLine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:747:1: ( ( '&origin&' ) )
            // InternalTraceryLanguage.g:748:1: ( '&origin&' )
            {
            // InternalTraceryLanguage.g:748:1: ( '&origin&' )
            // InternalTraceryLanguage.g:749:2: '&origin&'
            {
             before(grammarAccess.getFinalJSONLineAccess().getOriginKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFinalJSONLineAccess().getOriginKeyword_0()); 

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
    // $ANTLR end "rule__FinalJSONLine__Group__0__Impl"


    // $ANTLR start "rule__FinalJSONLine__Group__1"
    // InternalTraceryLanguage.g:758:1: rule__FinalJSONLine__Group__1 : rule__FinalJSONLine__Group__1__Impl rule__FinalJSONLine__Group__2 ;
    public final void rule__FinalJSONLine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:762:1: ( rule__FinalJSONLine__Group__1__Impl rule__FinalJSONLine__Group__2 )
            // InternalTraceryLanguage.g:763:2: rule__FinalJSONLine__Group__1__Impl rule__FinalJSONLine__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__FinalJSONLine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinalJSONLine__Group__2();

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
    // $ANTLR end "rule__FinalJSONLine__Group__1"


    // $ANTLR start "rule__FinalJSONLine__Group__1__Impl"
    // InternalTraceryLanguage.g:770:1: rule__FinalJSONLine__Group__1__Impl : ( ':' ) ;
    public final void rule__FinalJSONLine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:774:1: ( ( ':' ) )
            // InternalTraceryLanguage.g:775:1: ( ':' )
            {
            // InternalTraceryLanguage.g:775:1: ( ':' )
            // InternalTraceryLanguage.g:776:2: ':'
            {
             before(grammarAccess.getFinalJSONLineAccess().getColonKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFinalJSONLineAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__FinalJSONLine__Group__1__Impl"


    // $ANTLR start "rule__FinalJSONLine__Group__2"
    // InternalTraceryLanguage.g:785:1: rule__FinalJSONLine__Group__2 : rule__FinalJSONLine__Group__2__Impl ;
    public final void rule__FinalJSONLine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:789:1: ( rule__FinalJSONLine__Group__2__Impl )
            // InternalTraceryLanguage.g:790:2: rule__FinalJSONLine__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FinalJSONLine__Group__2__Impl();

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
    // $ANTLR end "rule__FinalJSONLine__Group__2"


    // $ANTLR start "rule__FinalJSONLine__Group__2__Impl"
    // InternalTraceryLanguage.g:796:1: rule__FinalJSONLine__Group__2__Impl : ( ( rule__FinalJSONLine__ValueAssignment_2 ) ) ;
    public final void rule__FinalJSONLine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:800:1: ( ( ( rule__FinalJSONLine__ValueAssignment_2 ) ) )
            // InternalTraceryLanguage.g:801:1: ( ( rule__FinalJSONLine__ValueAssignment_2 ) )
            {
            // InternalTraceryLanguage.g:801:1: ( ( rule__FinalJSONLine__ValueAssignment_2 ) )
            // InternalTraceryLanguage.g:802:2: ( rule__FinalJSONLine__ValueAssignment_2 )
            {
             before(grammarAccess.getFinalJSONLineAccess().getValueAssignment_2()); 
            // InternalTraceryLanguage.g:803:2: ( rule__FinalJSONLine__ValueAssignment_2 )
            // InternalTraceryLanguage.g:803:3: rule__FinalJSONLine__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FinalJSONLine__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFinalJSONLineAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__FinalJSONLine__Group__2__Impl"


    // $ANTLR start "rule__InitialJSONEnding__Group__0"
    // InternalTraceryLanguage.g:812:1: rule__InitialJSONEnding__Group__0 : rule__InitialJSONEnding__Group__0__Impl rule__InitialJSONEnding__Group__1 ;
    public final void rule__InitialJSONEnding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:816:1: ( rule__InitialJSONEnding__Group__0__Impl rule__InitialJSONEnding__Group__1 )
            // InternalTraceryLanguage.g:817:2: rule__InitialJSONEnding__Group__0__Impl rule__InitialJSONEnding__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__InitialJSONEnding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialJSONEnding__Group__1();

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
    // $ANTLR end "rule__InitialJSONEnding__Group__0"


    // $ANTLR start "rule__InitialJSONEnding__Group__0__Impl"
    // InternalTraceryLanguage.g:824:1: rule__InitialJSONEnding__Group__0__Impl : ( '[' ) ;
    public final void rule__InitialJSONEnding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:828:1: ( ( '[' ) )
            // InternalTraceryLanguage.g:829:1: ( '[' )
            {
            // InternalTraceryLanguage.g:829:1: ( '[' )
            // InternalTraceryLanguage.g:830:2: '['
            {
             before(grammarAccess.getInitialJSONEndingAccess().getLeftSquareBracketKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getInitialJSONEndingAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__InitialJSONEnding__Group__0__Impl"


    // $ANTLR start "rule__InitialJSONEnding__Group__1"
    // InternalTraceryLanguage.g:839:1: rule__InitialJSONEnding__Group__1 : rule__InitialJSONEnding__Group__1__Impl rule__InitialJSONEnding__Group__2 ;
    public final void rule__InitialJSONEnding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:843:1: ( rule__InitialJSONEnding__Group__1__Impl rule__InitialJSONEnding__Group__2 )
            // InternalTraceryLanguage.g:844:2: rule__InitialJSONEnding__Group__1__Impl rule__InitialJSONEnding__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__InitialJSONEnding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialJSONEnding__Group__2();

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
    // $ANTLR end "rule__InitialJSONEnding__Group__1"


    // $ANTLR start "rule__InitialJSONEnding__Group__1__Impl"
    // InternalTraceryLanguage.g:851:1: rule__InitialJSONEnding__Group__1__Impl : ( ruleInnerValues ) ;
    public final void rule__InitialJSONEnding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:855:1: ( ( ruleInnerValues ) )
            // InternalTraceryLanguage.g:856:1: ( ruleInnerValues )
            {
            // InternalTraceryLanguage.g:856:1: ( ruleInnerValues )
            // InternalTraceryLanguage.g:857:2: ruleInnerValues
            {
             before(grammarAccess.getInitialJSONEndingAccess().getInnerValuesParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleInnerValues();

            state._fsp--;

             after(grammarAccess.getInitialJSONEndingAccess().getInnerValuesParserRuleCall_1()); 

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
    // $ANTLR end "rule__InitialJSONEnding__Group__1__Impl"


    // $ANTLR start "rule__InitialJSONEnding__Group__2"
    // InternalTraceryLanguage.g:866:1: rule__InitialJSONEnding__Group__2 : rule__InitialJSONEnding__Group__2__Impl rule__InitialJSONEnding__Group__3 ;
    public final void rule__InitialJSONEnding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:870:1: ( rule__InitialJSONEnding__Group__2__Impl rule__InitialJSONEnding__Group__3 )
            // InternalTraceryLanguage.g:871:2: rule__InitialJSONEnding__Group__2__Impl rule__InitialJSONEnding__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__InitialJSONEnding__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialJSONEnding__Group__3();

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
    // $ANTLR end "rule__InitialJSONEnding__Group__2"


    // $ANTLR start "rule__InitialJSONEnding__Group__2__Impl"
    // InternalTraceryLanguage.g:878:1: rule__InitialJSONEnding__Group__2__Impl : ( ']' ) ;
    public final void rule__InitialJSONEnding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:882:1: ( ( ']' ) )
            // InternalTraceryLanguage.g:883:1: ( ']' )
            {
            // InternalTraceryLanguage.g:883:1: ( ']' )
            // InternalTraceryLanguage.g:884:2: ']'
            {
             before(grammarAccess.getInitialJSONEndingAccess().getRightSquareBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getInitialJSONEndingAccess().getRightSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__InitialJSONEnding__Group__2__Impl"


    // $ANTLR start "rule__InitialJSONEnding__Group__3"
    // InternalTraceryLanguage.g:893:1: rule__InitialJSONEnding__Group__3 : rule__InitialJSONEnding__Group__3__Impl ;
    public final void rule__InitialJSONEnding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:897:1: ( rule__InitialJSONEnding__Group__3__Impl )
            // InternalTraceryLanguage.g:898:2: rule__InitialJSONEnding__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InitialJSONEnding__Group__3__Impl();

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
    // $ANTLR end "rule__InitialJSONEnding__Group__3"


    // $ANTLR start "rule__InitialJSONEnding__Group__3__Impl"
    // InternalTraceryLanguage.g:904:1: rule__InitialJSONEnding__Group__3__Impl : ( ',' ) ;
    public final void rule__InitialJSONEnding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:908:1: ( ( ',' ) )
            // InternalTraceryLanguage.g:909:1: ( ',' )
            {
            // InternalTraceryLanguage.g:909:1: ( ',' )
            // InternalTraceryLanguage.g:910:2: ','
            {
             before(grammarAccess.getInitialJSONEndingAccess().getCommaKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getInitialJSONEndingAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__InitialJSONEnding__Group__3__Impl"


    // $ANTLR start "rule__InnerValues__Group__0"
    // InternalTraceryLanguage.g:920:1: rule__InnerValues__Group__0 : rule__InnerValues__Group__0__Impl rule__InnerValues__Group__1 ;
    public final void rule__InnerValues__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:924:1: ( rule__InnerValues__Group__0__Impl rule__InnerValues__Group__1 )
            // InternalTraceryLanguage.g:925:2: rule__InnerValues__Group__0__Impl rule__InnerValues__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__InnerValues__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerValues__Group__1();

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
    // $ANTLR end "rule__InnerValues__Group__0"


    // $ANTLR start "rule__InnerValues__Group__0__Impl"
    // InternalTraceryLanguage.g:932:1: rule__InnerValues__Group__0__Impl : ( ruleStartValue ) ;
    public final void rule__InnerValues__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:936:1: ( ( ruleStartValue ) )
            // InternalTraceryLanguage.g:937:1: ( ruleStartValue )
            {
            // InternalTraceryLanguage.g:937:1: ( ruleStartValue )
            // InternalTraceryLanguage.g:938:2: ruleStartValue
            {
             before(grammarAccess.getInnerValuesAccess().getStartValueParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStartValue();

            state._fsp--;

             after(grammarAccess.getInnerValuesAccess().getStartValueParserRuleCall_0()); 

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
    // $ANTLR end "rule__InnerValues__Group__0__Impl"


    // $ANTLR start "rule__InnerValues__Group__1"
    // InternalTraceryLanguage.g:947:1: rule__InnerValues__Group__1 : rule__InnerValues__Group__1__Impl ;
    public final void rule__InnerValues__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:951:1: ( rule__InnerValues__Group__1__Impl )
            // InternalTraceryLanguage.g:952:2: rule__InnerValues__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InnerValues__Group__1__Impl();

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
    // $ANTLR end "rule__InnerValues__Group__1"


    // $ANTLR start "rule__InnerValues__Group__1__Impl"
    // InternalTraceryLanguage.g:958:1: rule__InnerValues__Group__1__Impl : ( ( rule__InnerValues__ValsAssignment_1 )* ) ;
    public final void rule__InnerValues__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:962:1: ( ( ( rule__InnerValues__ValsAssignment_1 )* ) )
            // InternalTraceryLanguage.g:963:1: ( ( rule__InnerValues__ValsAssignment_1 )* )
            {
            // InternalTraceryLanguage.g:963:1: ( ( rule__InnerValues__ValsAssignment_1 )* )
            // InternalTraceryLanguage.g:964:2: ( rule__InnerValues__ValsAssignment_1 )*
            {
             before(grammarAccess.getInnerValuesAccess().getValsAssignment_1()); 
            // InternalTraceryLanguage.g:965:2: ( rule__InnerValues__ValsAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTraceryLanguage.g:965:3: rule__InnerValues__ValsAssignment_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__InnerValues__ValsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getInnerValuesAccess().getValsAssignment_1()); 

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
    // $ANTLR end "rule__InnerValues__Group__1__Impl"


    // $ANTLR start "rule__FinalJSONEnding__Group__0"
    // InternalTraceryLanguage.g:974:1: rule__FinalJSONEnding__Group__0 : rule__FinalJSONEnding__Group__0__Impl rule__FinalJSONEnding__Group__1 ;
    public final void rule__FinalJSONEnding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:978:1: ( rule__FinalJSONEnding__Group__0__Impl rule__FinalJSONEnding__Group__1 )
            // InternalTraceryLanguage.g:979:2: rule__FinalJSONEnding__Group__0__Impl rule__FinalJSONEnding__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__FinalJSONEnding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinalJSONEnding__Group__1();

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
    // $ANTLR end "rule__FinalJSONEnding__Group__0"


    // $ANTLR start "rule__FinalJSONEnding__Group__0__Impl"
    // InternalTraceryLanguage.g:986:1: rule__FinalJSONEnding__Group__0__Impl : ( '[' ) ;
    public final void rule__FinalJSONEnding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:990:1: ( ( '[' ) )
            // InternalTraceryLanguage.g:991:1: ( '[' )
            {
            // InternalTraceryLanguage.g:991:1: ( '[' )
            // InternalTraceryLanguage.g:992:2: '['
            {
             before(grammarAccess.getFinalJSONEndingAccess().getLeftSquareBracketKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFinalJSONEndingAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__FinalJSONEnding__Group__0__Impl"


    // $ANTLR start "rule__FinalJSONEnding__Group__1"
    // InternalTraceryLanguage.g:1001:1: rule__FinalJSONEnding__Group__1 : rule__FinalJSONEnding__Group__1__Impl rule__FinalJSONEnding__Group__2 ;
    public final void rule__FinalJSONEnding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1005:1: ( rule__FinalJSONEnding__Group__1__Impl rule__FinalJSONEnding__Group__2 )
            // InternalTraceryLanguage.g:1006:2: rule__FinalJSONEnding__Group__1__Impl rule__FinalJSONEnding__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__FinalJSONEnding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinalJSONEnding__Group__2();

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
    // $ANTLR end "rule__FinalJSONEnding__Group__1"


    // $ANTLR start "rule__FinalJSONEnding__Group__1__Impl"
    // InternalTraceryLanguage.g:1013:1: rule__FinalJSONEnding__Group__1__Impl : ( ruleStartValue ) ;
    public final void rule__FinalJSONEnding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1017:1: ( ( ruleStartValue ) )
            // InternalTraceryLanguage.g:1018:1: ( ruleStartValue )
            {
            // InternalTraceryLanguage.g:1018:1: ( ruleStartValue )
            // InternalTraceryLanguage.g:1019:2: ruleStartValue
            {
             before(grammarAccess.getFinalJSONEndingAccess().getStartValueParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleStartValue();

            state._fsp--;

             after(grammarAccess.getFinalJSONEndingAccess().getStartValueParserRuleCall_1()); 

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
    // $ANTLR end "rule__FinalJSONEnding__Group__1__Impl"


    // $ANTLR start "rule__FinalJSONEnding__Group__2"
    // InternalTraceryLanguage.g:1028:1: rule__FinalJSONEnding__Group__2 : rule__FinalJSONEnding__Group__2__Impl rule__FinalJSONEnding__Group__3 ;
    public final void rule__FinalJSONEnding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1032:1: ( rule__FinalJSONEnding__Group__2__Impl rule__FinalJSONEnding__Group__3 )
            // InternalTraceryLanguage.g:1033:2: rule__FinalJSONEnding__Group__2__Impl rule__FinalJSONEnding__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__FinalJSONEnding__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinalJSONEnding__Group__3();

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
    // $ANTLR end "rule__FinalJSONEnding__Group__2"


    // $ANTLR start "rule__FinalJSONEnding__Group__2__Impl"
    // InternalTraceryLanguage.g:1040:1: rule__FinalJSONEnding__Group__2__Impl : ( ( rule__FinalJSONEnding__ValsAssignment_2 )* ) ;
    public final void rule__FinalJSONEnding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1044:1: ( ( ( rule__FinalJSONEnding__ValsAssignment_2 )* ) )
            // InternalTraceryLanguage.g:1045:1: ( ( rule__FinalJSONEnding__ValsAssignment_2 )* )
            {
            // InternalTraceryLanguage.g:1045:1: ( ( rule__FinalJSONEnding__ValsAssignment_2 )* )
            // InternalTraceryLanguage.g:1046:2: ( rule__FinalJSONEnding__ValsAssignment_2 )*
            {
             before(grammarAccess.getFinalJSONEndingAccess().getValsAssignment_2()); 
            // InternalTraceryLanguage.g:1047:2: ( rule__FinalJSONEnding__ValsAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTraceryLanguage.g:1047:3: rule__FinalJSONEnding__ValsAssignment_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__FinalJSONEnding__ValsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getFinalJSONEndingAccess().getValsAssignment_2()); 

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
    // $ANTLR end "rule__FinalJSONEnding__Group__2__Impl"


    // $ANTLR start "rule__FinalJSONEnding__Group__3"
    // InternalTraceryLanguage.g:1055:1: rule__FinalJSONEnding__Group__3 : rule__FinalJSONEnding__Group__3__Impl ;
    public final void rule__FinalJSONEnding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1059:1: ( rule__FinalJSONEnding__Group__3__Impl )
            // InternalTraceryLanguage.g:1060:2: rule__FinalJSONEnding__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FinalJSONEnding__Group__3__Impl();

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
    // $ANTLR end "rule__FinalJSONEnding__Group__3"


    // $ANTLR start "rule__FinalJSONEnding__Group__3__Impl"
    // InternalTraceryLanguage.g:1066:1: rule__FinalJSONEnding__Group__3__Impl : ( ']' ) ;
    public final void rule__FinalJSONEnding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1070:1: ( ( ']' ) )
            // InternalTraceryLanguage.g:1071:1: ( ']' )
            {
            // InternalTraceryLanguage.g:1071:1: ( ']' )
            // InternalTraceryLanguage.g:1072:2: ']'
            {
             before(grammarAccess.getFinalJSONEndingAccess().getRightSquareBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFinalJSONEndingAccess().getRightSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__FinalJSONEnding__Group__3__Impl"


    // $ANTLR start "rule__StartValue__Group__0"
    // InternalTraceryLanguage.g:1082:1: rule__StartValue__Group__0 : rule__StartValue__Group__0__Impl rule__StartValue__Group__1 ;
    public final void rule__StartValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1086:1: ( rule__StartValue__Group__0__Impl rule__StartValue__Group__1 )
            // InternalTraceryLanguage.g:1087:2: rule__StartValue__Group__0__Impl rule__StartValue__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__StartValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartValue__Group__1();

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
    // $ANTLR end "rule__StartValue__Group__0"


    // $ANTLR start "rule__StartValue__Group__0__Impl"
    // InternalTraceryLanguage.g:1094:1: rule__StartValue__Group__0__Impl : ( '&' ) ;
    public final void rule__StartValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1098:1: ( ( '&' ) )
            // InternalTraceryLanguage.g:1099:1: ( '&' )
            {
            // InternalTraceryLanguage.g:1099:1: ( '&' )
            // InternalTraceryLanguage.g:1100:2: '&'
            {
             before(grammarAccess.getStartValueAccess().getAmpersandKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getStartValueAccess().getAmpersandKeyword_0()); 

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
    // $ANTLR end "rule__StartValue__Group__0__Impl"


    // $ANTLR start "rule__StartValue__Group__1"
    // InternalTraceryLanguage.g:1109:1: rule__StartValue__Group__1 : rule__StartValue__Group__1__Impl rule__StartValue__Group__2 ;
    public final void rule__StartValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1113:1: ( rule__StartValue__Group__1__Impl rule__StartValue__Group__2 )
            // InternalTraceryLanguage.g:1114:2: rule__StartValue__Group__1__Impl rule__StartValue__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__StartValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartValue__Group__2();

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
    // $ANTLR end "rule__StartValue__Group__1"


    // $ANTLR start "rule__StartValue__Group__1__Impl"
    // InternalTraceryLanguage.g:1121:1: rule__StartValue__Group__1__Impl : ( ( ( rule__StartValue__ValueInnerStatementsAssignment_1 ) ) ( ( rule__StartValue__ValueInnerStatementsAssignment_1 )* ) ) ;
    public final void rule__StartValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1125:1: ( ( ( ( rule__StartValue__ValueInnerStatementsAssignment_1 ) ) ( ( rule__StartValue__ValueInnerStatementsAssignment_1 )* ) ) )
            // InternalTraceryLanguage.g:1126:1: ( ( ( rule__StartValue__ValueInnerStatementsAssignment_1 ) ) ( ( rule__StartValue__ValueInnerStatementsAssignment_1 )* ) )
            {
            // InternalTraceryLanguage.g:1126:1: ( ( ( rule__StartValue__ValueInnerStatementsAssignment_1 ) ) ( ( rule__StartValue__ValueInnerStatementsAssignment_1 )* ) )
            // InternalTraceryLanguage.g:1127:2: ( ( rule__StartValue__ValueInnerStatementsAssignment_1 ) ) ( ( rule__StartValue__ValueInnerStatementsAssignment_1 )* )
            {
            // InternalTraceryLanguage.g:1127:2: ( ( rule__StartValue__ValueInnerStatementsAssignment_1 ) )
            // InternalTraceryLanguage.g:1128:3: ( rule__StartValue__ValueInnerStatementsAssignment_1 )
            {
             before(grammarAccess.getStartValueAccess().getValueInnerStatementsAssignment_1()); 
            // InternalTraceryLanguage.g:1129:3: ( rule__StartValue__ValueInnerStatementsAssignment_1 )
            // InternalTraceryLanguage.g:1129:4: rule__StartValue__ValueInnerStatementsAssignment_1
            {
            pushFollow(FOLLOW_15);
            rule__StartValue__ValueInnerStatementsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStartValueAccess().getValueInnerStatementsAssignment_1()); 

            }

            // InternalTraceryLanguage.g:1132:2: ( ( rule__StartValue__ValueInnerStatementsAssignment_1 )* )
            // InternalTraceryLanguage.g:1133:3: ( rule__StartValue__ValueInnerStatementsAssignment_1 )*
            {
             before(grammarAccess.getStartValueAccess().getValueInnerStatementsAssignment_1()); 
            // InternalTraceryLanguage.g:1134:3: ( rule__StartValue__ValueInnerStatementsAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STRING||LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTraceryLanguage.g:1134:4: rule__StartValue__ValueInnerStatementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__StartValue__ValueInnerStatementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getStartValueAccess().getValueInnerStatementsAssignment_1()); 

            }


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
    // $ANTLR end "rule__StartValue__Group__1__Impl"


    // $ANTLR start "rule__StartValue__Group__2"
    // InternalTraceryLanguage.g:1143:1: rule__StartValue__Group__2 : rule__StartValue__Group__2__Impl ;
    public final void rule__StartValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1147:1: ( rule__StartValue__Group__2__Impl )
            // InternalTraceryLanguage.g:1148:2: rule__StartValue__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StartValue__Group__2__Impl();

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
    // $ANTLR end "rule__StartValue__Group__2"


    // $ANTLR start "rule__StartValue__Group__2__Impl"
    // InternalTraceryLanguage.g:1154:1: rule__StartValue__Group__2__Impl : ( '&' ) ;
    public final void rule__StartValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1158:1: ( ( '&' ) )
            // InternalTraceryLanguage.g:1159:1: ( '&' )
            {
            // InternalTraceryLanguage.g:1159:1: ( '&' )
            // InternalTraceryLanguage.g:1160:2: '&'
            {
             before(grammarAccess.getStartValueAccess().getAmpersandKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getStartValueAccess().getAmpersandKeyword_2()); 

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
    // $ANTLR end "rule__StartValue__Group__2__Impl"


    // $ANTLR start "rule__NormalValue__Group__0"
    // InternalTraceryLanguage.g:1170:1: rule__NormalValue__Group__0 : rule__NormalValue__Group__0__Impl rule__NormalValue__Group__1 ;
    public final void rule__NormalValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1174:1: ( rule__NormalValue__Group__0__Impl rule__NormalValue__Group__1 )
            // InternalTraceryLanguage.g:1175:2: rule__NormalValue__Group__0__Impl rule__NormalValue__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__NormalValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NormalValue__Group__1();

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
    // $ANTLR end "rule__NormalValue__Group__0"


    // $ANTLR start "rule__NormalValue__Group__0__Impl"
    // InternalTraceryLanguage.g:1182:1: rule__NormalValue__Group__0__Impl : ( ',' ) ;
    public final void rule__NormalValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1186:1: ( ( ',' ) )
            // InternalTraceryLanguage.g:1187:1: ( ',' )
            {
            // InternalTraceryLanguage.g:1187:1: ( ',' )
            // InternalTraceryLanguage.g:1188:2: ','
            {
             before(grammarAccess.getNormalValueAccess().getCommaKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getNormalValueAccess().getCommaKeyword_0()); 

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
    // $ANTLR end "rule__NormalValue__Group__0__Impl"


    // $ANTLR start "rule__NormalValue__Group__1"
    // InternalTraceryLanguage.g:1197:1: rule__NormalValue__Group__1 : rule__NormalValue__Group__1__Impl rule__NormalValue__Group__2 ;
    public final void rule__NormalValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1201:1: ( rule__NormalValue__Group__1__Impl rule__NormalValue__Group__2 )
            // InternalTraceryLanguage.g:1202:2: rule__NormalValue__Group__1__Impl rule__NormalValue__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__NormalValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NormalValue__Group__2();

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
    // $ANTLR end "rule__NormalValue__Group__1"


    // $ANTLR start "rule__NormalValue__Group__1__Impl"
    // InternalTraceryLanguage.g:1209:1: rule__NormalValue__Group__1__Impl : ( '&' ) ;
    public final void rule__NormalValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1213:1: ( ( '&' ) )
            // InternalTraceryLanguage.g:1214:1: ( '&' )
            {
            // InternalTraceryLanguage.g:1214:1: ( '&' )
            // InternalTraceryLanguage.g:1215:2: '&'
            {
             before(grammarAccess.getNormalValueAccess().getAmpersandKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNormalValueAccess().getAmpersandKeyword_1()); 

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
    // $ANTLR end "rule__NormalValue__Group__1__Impl"


    // $ANTLR start "rule__NormalValue__Group__2"
    // InternalTraceryLanguage.g:1224:1: rule__NormalValue__Group__2 : rule__NormalValue__Group__2__Impl rule__NormalValue__Group__3 ;
    public final void rule__NormalValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1228:1: ( rule__NormalValue__Group__2__Impl rule__NormalValue__Group__3 )
            // InternalTraceryLanguage.g:1229:2: rule__NormalValue__Group__2__Impl rule__NormalValue__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__NormalValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NormalValue__Group__3();

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
    // $ANTLR end "rule__NormalValue__Group__2"


    // $ANTLR start "rule__NormalValue__Group__2__Impl"
    // InternalTraceryLanguage.g:1236:1: rule__NormalValue__Group__2__Impl : ( ( ( rule__NormalValue__ValueInnerStatementsAssignment_2 ) ) ( ( rule__NormalValue__ValueInnerStatementsAssignment_2 )* ) ) ;
    public final void rule__NormalValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1240:1: ( ( ( ( rule__NormalValue__ValueInnerStatementsAssignment_2 ) ) ( ( rule__NormalValue__ValueInnerStatementsAssignment_2 )* ) ) )
            // InternalTraceryLanguage.g:1241:1: ( ( ( rule__NormalValue__ValueInnerStatementsAssignment_2 ) ) ( ( rule__NormalValue__ValueInnerStatementsAssignment_2 )* ) )
            {
            // InternalTraceryLanguage.g:1241:1: ( ( ( rule__NormalValue__ValueInnerStatementsAssignment_2 ) ) ( ( rule__NormalValue__ValueInnerStatementsAssignment_2 )* ) )
            // InternalTraceryLanguage.g:1242:2: ( ( rule__NormalValue__ValueInnerStatementsAssignment_2 ) ) ( ( rule__NormalValue__ValueInnerStatementsAssignment_2 )* )
            {
            // InternalTraceryLanguage.g:1242:2: ( ( rule__NormalValue__ValueInnerStatementsAssignment_2 ) )
            // InternalTraceryLanguage.g:1243:3: ( rule__NormalValue__ValueInnerStatementsAssignment_2 )
            {
             before(grammarAccess.getNormalValueAccess().getValueInnerStatementsAssignment_2()); 
            // InternalTraceryLanguage.g:1244:3: ( rule__NormalValue__ValueInnerStatementsAssignment_2 )
            // InternalTraceryLanguage.g:1244:4: rule__NormalValue__ValueInnerStatementsAssignment_2
            {
            pushFollow(FOLLOW_15);
            rule__NormalValue__ValueInnerStatementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNormalValueAccess().getValueInnerStatementsAssignment_2()); 

            }

            // InternalTraceryLanguage.g:1247:2: ( ( rule__NormalValue__ValueInnerStatementsAssignment_2 )* )
            // InternalTraceryLanguage.g:1248:3: ( rule__NormalValue__ValueInnerStatementsAssignment_2 )*
            {
             before(grammarAccess.getNormalValueAccess().getValueInnerStatementsAssignment_2()); 
            // InternalTraceryLanguage.g:1249:3: ( rule__NormalValue__ValueInnerStatementsAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_STRING||LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTraceryLanguage.g:1249:4: rule__NormalValue__ValueInnerStatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__NormalValue__ValueInnerStatementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getNormalValueAccess().getValueInnerStatementsAssignment_2()); 

            }


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
    // $ANTLR end "rule__NormalValue__Group__2__Impl"


    // $ANTLR start "rule__NormalValue__Group__3"
    // InternalTraceryLanguage.g:1258:1: rule__NormalValue__Group__3 : rule__NormalValue__Group__3__Impl ;
    public final void rule__NormalValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1262:1: ( rule__NormalValue__Group__3__Impl )
            // InternalTraceryLanguage.g:1263:2: rule__NormalValue__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NormalValue__Group__3__Impl();

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
    // $ANTLR end "rule__NormalValue__Group__3"


    // $ANTLR start "rule__NormalValue__Group__3__Impl"
    // InternalTraceryLanguage.g:1269:1: rule__NormalValue__Group__3__Impl : ( '&' ) ;
    public final void rule__NormalValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1273:1: ( ( '&' ) )
            // InternalTraceryLanguage.g:1274:1: ( '&' )
            {
            // InternalTraceryLanguage.g:1274:1: ( '&' )
            // InternalTraceryLanguage.g:1275:2: '&'
            {
             before(grammarAccess.getNormalValueAccess().getAmpersandKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNormalValueAccess().getAmpersandKeyword_3()); 

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
    // $ANTLR end "rule__NormalValue__Group__3__Impl"


    // $ANTLR start "rule__DeclaredVariable__Group__0"
    // InternalTraceryLanguage.g:1285:1: rule__DeclaredVariable__Group__0 : rule__DeclaredVariable__Group__0__Impl rule__DeclaredVariable__Group__1 ;
    public final void rule__DeclaredVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1289:1: ( rule__DeclaredVariable__Group__0__Impl rule__DeclaredVariable__Group__1 )
            // InternalTraceryLanguage.g:1290:2: rule__DeclaredVariable__Group__0__Impl rule__DeclaredVariable__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__DeclaredVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclaredVariable__Group__1();

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
    // $ANTLR end "rule__DeclaredVariable__Group__0"


    // $ANTLR start "rule__DeclaredVariable__Group__0__Impl"
    // InternalTraceryLanguage.g:1297:1: rule__DeclaredVariable__Group__0__Impl : ( '#' ) ;
    public final void rule__DeclaredVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1301:1: ( ( '#' ) )
            // InternalTraceryLanguage.g:1302:1: ( '#' )
            {
            // InternalTraceryLanguage.g:1302:1: ( '#' )
            // InternalTraceryLanguage.g:1303:2: '#'
            {
             before(grammarAccess.getDeclaredVariableAccess().getNumberSignKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDeclaredVariableAccess().getNumberSignKeyword_0()); 

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
    // $ANTLR end "rule__DeclaredVariable__Group__0__Impl"


    // $ANTLR start "rule__DeclaredVariable__Group__1"
    // InternalTraceryLanguage.g:1312:1: rule__DeclaredVariable__Group__1 : rule__DeclaredVariable__Group__1__Impl rule__DeclaredVariable__Group__2 ;
    public final void rule__DeclaredVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1316:1: ( rule__DeclaredVariable__Group__1__Impl rule__DeclaredVariable__Group__2 )
            // InternalTraceryLanguage.g:1317:2: rule__DeclaredVariable__Group__1__Impl rule__DeclaredVariable__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__DeclaredVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclaredVariable__Group__2();

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
    // $ANTLR end "rule__DeclaredVariable__Group__1"


    // $ANTLR start "rule__DeclaredVariable__Group__1__Impl"
    // InternalTraceryLanguage.g:1324:1: rule__DeclaredVariable__Group__1__Impl : ( ( rule__DeclaredVariable__VariableAssignment_1 ) ) ;
    public final void rule__DeclaredVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1328:1: ( ( ( rule__DeclaredVariable__VariableAssignment_1 ) ) )
            // InternalTraceryLanguage.g:1329:1: ( ( rule__DeclaredVariable__VariableAssignment_1 ) )
            {
            // InternalTraceryLanguage.g:1329:1: ( ( rule__DeclaredVariable__VariableAssignment_1 ) )
            // InternalTraceryLanguage.g:1330:2: ( rule__DeclaredVariable__VariableAssignment_1 )
            {
             before(grammarAccess.getDeclaredVariableAccess().getVariableAssignment_1()); 
            // InternalTraceryLanguage.g:1331:2: ( rule__DeclaredVariable__VariableAssignment_1 )
            // InternalTraceryLanguage.g:1331:3: rule__DeclaredVariable__VariableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DeclaredVariable__VariableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclaredVariableAccess().getVariableAssignment_1()); 

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
    // $ANTLR end "rule__DeclaredVariable__Group__1__Impl"


    // $ANTLR start "rule__DeclaredVariable__Group__2"
    // InternalTraceryLanguage.g:1339:1: rule__DeclaredVariable__Group__2 : rule__DeclaredVariable__Group__2__Impl ;
    public final void rule__DeclaredVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1343:1: ( rule__DeclaredVariable__Group__2__Impl )
            // InternalTraceryLanguage.g:1344:2: rule__DeclaredVariable__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeclaredVariable__Group__2__Impl();

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
    // $ANTLR end "rule__DeclaredVariable__Group__2"


    // $ANTLR start "rule__DeclaredVariable__Group__2__Impl"
    // InternalTraceryLanguage.g:1350:1: rule__DeclaredVariable__Group__2__Impl : ( '#' ) ;
    public final void rule__DeclaredVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1354:1: ( ( '#' ) )
            // InternalTraceryLanguage.g:1355:1: ( '#' )
            {
            // InternalTraceryLanguage.g:1355:1: ( '#' )
            // InternalTraceryLanguage.g:1356:2: '#'
            {
             before(grammarAccess.getDeclaredVariableAccess().getNumberSignKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDeclaredVariableAccess().getNumberSignKeyword_2()); 

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
    // $ANTLR end "rule__DeclaredVariable__Group__2__Impl"


    // $ANTLR start "rule__TraceryProgram__StatementsAssignment_1"
    // InternalTraceryLanguage.g:1366:1: rule__TraceryProgram__StatementsAssignment_1 : ( ruleStatement ) ;
    public final void rule__TraceryProgram__StatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1370:1: ( ( ruleStatement ) )
            // InternalTraceryLanguage.g:1371:2: ( ruleStatement )
            {
            // InternalTraceryLanguage.g:1371:2: ( ruleStatement )
            // InternalTraceryLanguage.g:1372:3: ruleStatement
            {
             before(grammarAccess.getTraceryProgramAccess().getStatementsStatementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getTraceryProgramAccess().getStatementsStatementParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__TraceryProgram__StatementsAssignment_1"


    // $ANTLR start "rule__Statement__InitialStatementAssignment_0"
    // InternalTraceryLanguage.g:1381:1: rule__Statement__InitialStatementAssignment_0 : ( ruleInitialJSONLines ) ;
    public final void rule__Statement__InitialStatementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1385:1: ( ( ruleInitialJSONLines ) )
            // InternalTraceryLanguage.g:1386:2: ( ruleInitialJSONLines )
            {
            // InternalTraceryLanguage.g:1386:2: ( ruleInitialJSONLines )
            // InternalTraceryLanguage.g:1387:3: ruleInitialJSONLines
            {
             before(grammarAccess.getStatementAccess().getInitialStatementInitialJSONLinesParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleInitialJSONLines();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getInitialStatementInitialJSONLinesParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Statement__InitialStatementAssignment_0"


    // $ANTLR start "rule__Statement__FinalStatementAssignment_1"
    // InternalTraceryLanguage.g:1396:1: rule__Statement__FinalStatementAssignment_1 : ( ruleFinalJSONLine ) ;
    public final void rule__Statement__FinalStatementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1400:1: ( ( ruleFinalJSONLine ) )
            // InternalTraceryLanguage.g:1401:2: ( ruleFinalJSONLine )
            {
            // InternalTraceryLanguage.g:1401:2: ( ruleFinalJSONLine )
            // InternalTraceryLanguage.g:1402:3: ruleFinalJSONLine
            {
             before(grammarAccess.getStatementAccess().getFinalStatementFinalJSONLineParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFinalJSONLine();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getFinalStatementFinalJSONLineParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Statement__FinalStatementAssignment_1"


    // $ANTLR start "rule__InitialJSONLines__NameAssignment_1"
    // InternalTraceryLanguage.g:1411:1: rule__InitialJSONLines__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InitialJSONLines__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1415:1: ( ( RULE_ID ) )
            // InternalTraceryLanguage.g:1416:2: ( RULE_ID )
            {
            // InternalTraceryLanguage.g:1416:2: ( RULE_ID )
            // InternalTraceryLanguage.g:1417:3: RULE_ID
            {
             before(grammarAccess.getInitialJSONLinesAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInitialJSONLinesAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__InitialJSONLines__NameAssignment_1"


    // $ANTLR start "rule__InitialJSONLines__ValueAssignment_4"
    // InternalTraceryLanguage.g:1426:1: rule__InitialJSONLines__ValueAssignment_4 : ( ruleInitialJSONEnding ) ;
    public final void rule__InitialJSONLines__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1430:1: ( ( ruleInitialJSONEnding ) )
            // InternalTraceryLanguage.g:1431:2: ( ruleInitialJSONEnding )
            {
            // InternalTraceryLanguage.g:1431:2: ( ruleInitialJSONEnding )
            // InternalTraceryLanguage.g:1432:3: ruleInitialJSONEnding
            {
             before(grammarAccess.getInitialJSONLinesAccess().getValueInitialJSONEndingParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleInitialJSONEnding();

            state._fsp--;

             after(grammarAccess.getInitialJSONLinesAccess().getValueInitialJSONEndingParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__InitialJSONLines__ValueAssignment_4"


    // $ANTLR start "rule__FinalJSONLine__ValueAssignment_2"
    // InternalTraceryLanguage.g:1441:1: rule__FinalJSONLine__ValueAssignment_2 : ( ruleFinalJSONEnding ) ;
    public final void rule__FinalJSONLine__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1445:1: ( ( ruleFinalJSONEnding ) )
            // InternalTraceryLanguage.g:1446:2: ( ruleFinalJSONEnding )
            {
            // InternalTraceryLanguage.g:1446:2: ( ruleFinalJSONEnding )
            // InternalTraceryLanguage.g:1447:3: ruleFinalJSONEnding
            {
             before(grammarAccess.getFinalJSONLineAccess().getValueFinalJSONEndingParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFinalJSONEnding();

            state._fsp--;

             after(grammarAccess.getFinalJSONLineAccess().getValueFinalJSONEndingParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__FinalJSONLine__ValueAssignment_2"


    // $ANTLR start "rule__InnerValues__ValsAssignment_1"
    // InternalTraceryLanguage.g:1456:1: rule__InnerValues__ValsAssignment_1 : ( ruleNormalValue ) ;
    public final void rule__InnerValues__ValsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1460:1: ( ( ruleNormalValue ) )
            // InternalTraceryLanguage.g:1461:2: ( ruleNormalValue )
            {
            // InternalTraceryLanguage.g:1461:2: ( ruleNormalValue )
            // InternalTraceryLanguage.g:1462:3: ruleNormalValue
            {
             before(grammarAccess.getInnerValuesAccess().getValsNormalValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNormalValue();

            state._fsp--;

             after(grammarAccess.getInnerValuesAccess().getValsNormalValueParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__InnerValues__ValsAssignment_1"


    // $ANTLR start "rule__FinalJSONEnding__ValsAssignment_2"
    // InternalTraceryLanguage.g:1471:1: rule__FinalJSONEnding__ValsAssignment_2 : ( ruleNormalValue ) ;
    public final void rule__FinalJSONEnding__ValsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1475:1: ( ( ruleNormalValue ) )
            // InternalTraceryLanguage.g:1476:2: ( ruleNormalValue )
            {
            // InternalTraceryLanguage.g:1476:2: ( ruleNormalValue )
            // InternalTraceryLanguage.g:1477:3: ruleNormalValue
            {
             before(grammarAccess.getFinalJSONEndingAccess().getValsNormalValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNormalValue();

            state._fsp--;

             after(grammarAccess.getFinalJSONEndingAccess().getValsNormalValueParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__FinalJSONEnding__ValsAssignment_2"


    // $ANTLR start "rule__StartValue__ValueInnerStatementsAssignment_1"
    // InternalTraceryLanguage.g:1486:1: rule__StartValue__ValueInnerStatementsAssignment_1 : ( ruleInnerStatements ) ;
    public final void rule__StartValue__ValueInnerStatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1490:1: ( ( ruleInnerStatements ) )
            // InternalTraceryLanguage.g:1491:2: ( ruleInnerStatements )
            {
            // InternalTraceryLanguage.g:1491:2: ( ruleInnerStatements )
            // InternalTraceryLanguage.g:1492:3: ruleInnerStatements
            {
             before(grammarAccess.getStartValueAccess().getValueInnerStatementsInnerStatementsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInnerStatements();

            state._fsp--;

             after(grammarAccess.getStartValueAccess().getValueInnerStatementsInnerStatementsParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__StartValue__ValueInnerStatementsAssignment_1"


    // $ANTLR start "rule__NormalValue__ValueInnerStatementsAssignment_2"
    // InternalTraceryLanguage.g:1501:1: rule__NormalValue__ValueInnerStatementsAssignment_2 : ( ruleInnerStatements ) ;
    public final void rule__NormalValue__ValueInnerStatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1505:1: ( ( ruleInnerStatements ) )
            // InternalTraceryLanguage.g:1506:2: ( ruleInnerStatements )
            {
            // InternalTraceryLanguage.g:1506:2: ( ruleInnerStatements )
            // InternalTraceryLanguage.g:1507:3: ruleInnerStatements
            {
             before(grammarAccess.getNormalValueAccess().getValueInnerStatementsInnerStatementsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInnerStatements();

            state._fsp--;

             after(grammarAccess.getNormalValueAccess().getValueInnerStatementsInnerStatementsParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__NormalValue__ValueInnerStatementsAssignment_2"


    // $ANTLR start "rule__StringDeclaration__ValueAssignment"
    // InternalTraceryLanguage.g:1516:1: rule__StringDeclaration__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringDeclaration__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1520:1: ( ( RULE_STRING ) )
            // InternalTraceryLanguage.g:1521:2: ( RULE_STRING )
            {
            // InternalTraceryLanguage.g:1521:2: ( RULE_STRING )
            // InternalTraceryLanguage.g:1522:3: RULE_STRING
            {
             before(grammarAccess.getStringDeclarationAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringDeclarationAccess().getValueSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__StringDeclaration__ValueAssignment"


    // $ANTLR start "rule__DeclaredVariable__VariableAssignment_1"
    // InternalTraceryLanguage.g:1531:1: rule__DeclaredVariable__VariableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DeclaredVariable__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1535:1: ( ( ( RULE_ID ) ) )
            // InternalTraceryLanguage.g:1536:2: ( ( RULE_ID ) )
            {
            // InternalTraceryLanguage.g:1536:2: ( ( RULE_ID ) )
            // InternalTraceryLanguage.g:1537:3: ( RULE_ID )
            {
             before(grammarAccess.getDeclaredVariableAccess().getVariableInitialJSONLinesCrossReference_1_0()); 
            // InternalTraceryLanguage.g:1538:3: ( RULE_ID )
            // InternalTraceryLanguage.g:1539:4: RULE_ID
            {
             before(grammarAccess.getDeclaredVariableAccess().getVariableInitialJSONLinesIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeclaredVariableAccess().getVariableInitialJSONLinesIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDeclaredVariableAccess().getVariableInitialJSONLinesCrossReference_1_0()); 

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
    // $ANTLR end "rule__DeclaredVariable__VariableAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080022L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});

}
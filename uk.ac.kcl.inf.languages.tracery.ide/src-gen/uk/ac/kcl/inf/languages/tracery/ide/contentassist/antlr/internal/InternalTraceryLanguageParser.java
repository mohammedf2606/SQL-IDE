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
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

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

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
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
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

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

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
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


    // $ANTLR start "entryRuleFinalJSONEnding"
    // InternalTraceryLanguage.g:210:1: entryRuleFinalJSONEnding : ruleFinalJSONEnding EOF ;
    public final void entryRuleFinalJSONEnding() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:214:1: ( ruleFinalJSONEnding EOF )
            // InternalTraceryLanguage.g:215:1: ruleFinalJSONEnding EOF
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
    // InternalTraceryLanguage.g:225:1: ruleFinalJSONEnding : ( ( rule__FinalJSONEnding__Group__0 ) ) ;
    public final void ruleFinalJSONEnding() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:230:2: ( ( ( rule__FinalJSONEnding__Group__0 ) ) )
            // InternalTraceryLanguage.g:231:2: ( ( rule__FinalJSONEnding__Group__0 ) )
            {
            // InternalTraceryLanguage.g:231:2: ( ( rule__FinalJSONEnding__Group__0 ) )
            // InternalTraceryLanguage.g:232:3: ( rule__FinalJSONEnding__Group__0 )
            {
             before(grammarAccess.getFinalJSONEndingAccess().getGroup()); 
            // InternalTraceryLanguage.g:233:3: ( rule__FinalJSONEnding__Group__0 )
            // InternalTraceryLanguage.g:233:4: rule__FinalJSONEnding__Group__0
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
    // InternalTraceryLanguage.g:243:1: entryRuleStartValue : ruleStartValue EOF ;
    public final void entryRuleStartValue() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:247:1: ( ruleStartValue EOF )
            // InternalTraceryLanguage.g:248:1: ruleStartValue EOF
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
    // InternalTraceryLanguage.g:258:1: ruleStartValue : ( ( rule__StartValue__Group__0 ) ) ;
    public final void ruleStartValue() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:263:2: ( ( ( rule__StartValue__Group__0 ) ) )
            // InternalTraceryLanguage.g:264:2: ( ( rule__StartValue__Group__0 ) )
            {
            // InternalTraceryLanguage.g:264:2: ( ( rule__StartValue__Group__0 ) )
            // InternalTraceryLanguage.g:265:3: ( rule__StartValue__Group__0 )
            {
             before(grammarAccess.getStartValueAccess().getGroup()); 
            // InternalTraceryLanguage.g:266:3: ( rule__StartValue__Group__0 )
            // InternalTraceryLanguage.g:266:4: rule__StartValue__Group__0
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
    // InternalTraceryLanguage.g:276:1: entryRuleNormalValue : ruleNormalValue EOF ;
    public final void entryRuleNormalValue() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:280:1: ( ruleNormalValue EOF )
            // InternalTraceryLanguage.g:281:1: ruleNormalValue EOF
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
    // InternalTraceryLanguage.g:291:1: ruleNormalValue : ( ( rule__NormalValue__Group__0 ) ) ;
    public final void ruleNormalValue() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:296:2: ( ( ( rule__NormalValue__Group__0 ) ) )
            // InternalTraceryLanguage.g:297:2: ( ( rule__NormalValue__Group__0 ) )
            {
            // InternalTraceryLanguage.g:297:2: ( ( rule__NormalValue__Group__0 ) )
            // InternalTraceryLanguage.g:298:3: ( rule__NormalValue__Group__0 )
            {
             before(grammarAccess.getNormalValueAccess().getGroup()); 
            // InternalTraceryLanguage.g:299:3: ( rule__NormalValue__Group__0 )
            // InternalTraceryLanguage.g:299:4: rule__NormalValue__Group__0
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
    // InternalTraceryLanguage.g:309:1: entryRuleInnerStatements : ruleInnerStatements EOF ;
    public final void entryRuleInnerStatements() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:313:1: ( ruleInnerStatements EOF )
            // InternalTraceryLanguage.g:314:1: ruleInnerStatements EOF
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
    // InternalTraceryLanguage.g:324:1: ruleInnerStatements : ( ( rule__InnerStatements__Alternatives ) ) ;
    public final void ruleInnerStatements() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:329:2: ( ( ( rule__InnerStatements__Alternatives ) ) )
            // InternalTraceryLanguage.g:330:2: ( ( rule__InnerStatements__Alternatives ) )
            {
            // InternalTraceryLanguage.g:330:2: ( ( rule__InnerStatements__Alternatives ) )
            // InternalTraceryLanguage.g:331:3: ( rule__InnerStatements__Alternatives )
            {
             before(grammarAccess.getInnerStatementsAccess().getAlternatives()); 
            // InternalTraceryLanguage.g:332:3: ( rule__InnerStatements__Alternatives )
            // InternalTraceryLanguage.g:332:4: rule__InnerStatements__Alternatives
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
    // InternalTraceryLanguage.g:342:1: entryRuleStringDeclaration : ruleStringDeclaration EOF ;
    public final void entryRuleStringDeclaration() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:346:1: ( ruleStringDeclaration EOF )
            // InternalTraceryLanguage.g:347:1: ruleStringDeclaration EOF
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
    // InternalTraceryLanguage.g:357:1: ruleStringDeclaration : ( ( rule__StringDeclaration__ValueAssignment ) ) ;
    public final void ruleStringDeclaration() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:362:2: ( ( ( rule__StringDeclaration__ValueAssignment ) ) )
            // InternalTraceryLanguage.g:363:2: ( ( rule__StringDeclaration__ValueAssignment ) )
            {
            // InternalTraceryLanguage.g:363:2: ( ( rule__StringDeclaration__ValueAssignment ) )
            // InternalTraceryLanguage.g:364:3: ( rule__StringDeclaration__ValueAssignment )
            {
             before(grammarAccess.getStringDeclarationAccess().getValueAssignment()); 
            // InternalTraceryLanguage.g:365:3: ( rule__StringDeclaration__ValueAssignment )
            // InternalTraceryLanguage.g:365:4: rule__StringDeclaration__ValueAssignment
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
    // InternalTraceryLanguage.g:375:1: entryRuleDeclaredVariable : ruleDeclaredVariable EOF ;
    public final void entryRuleDeclaredVariable() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:379:1: ( ruleDeclaredVariable EOF )
            // InternalTraceryLanguage.g:380:1: ruleDeclaredVariable EOF
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
    // InternalTraceryLanguage.g:390:1: ruleDeclaredVariable : ( ( rule__DeclaredVariable__Group__0 ) ) ;
    public final void ruleDeclaredVariable() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:395:2: ( ( ( rule__DeclaredVariable__Group__0 ) ) )
            // InternalTraceryLanguage.g:396:2: ( ( rule__DeclaredVariable__Group__0 ) )
            {
            // InternalTraceryLanguage.g:396:2: ( ( rule__DeclaredVariable__Group__0 ) )
            // InternalTraceryLanguage.g:397:3: ( rule__DeclaredVariable__Group__0 )
            {
             before(grammarAccess.getDeclaredVariableAccess().getGroup()); 
            // InternalTraceryLanguage.g:398:3: ( rule__DeclaredVariable__Group__0 )
            // InternalTraceryLanguage.g:398:4: rule__DeclaredVariable__Group__0
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
    // InternalTraceryLanguage.g:407:1: rule__InnerStatements__Alternatives : ( ( ruleStringDeclaration ) | ( ruleDeclaredVariable ) );
    public final void rule__InnerStatements__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:411:1: ( ( ruleStringDeclaration ) | ( ruleDeclaredVariable ) )
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
                    // InternalTraceryLanguage.g:412:2: ( ruleStringDeclaration )
                    {
                    // InternalTraceryLanguage.g:412:2: ( ruleStringDeclaration )
                    // InternalTraceryLanguage.g:413:3: ruleStringDeclaration
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
                    // InternalTraceryLanguage.g:418:2: ( ruleDeclaredVariable )
                    {
                    // InternalTraceryLanguage.g:418:2: ( ruleDeclaredVariable )
                    // InternalTraceryLanguage.g:419:3: ruleDeclaredVariable
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
    // InternalTraceryLanguage.g:428:1: rule__TraceryProgram__Group__0 : rule__TraceryProgram__Group__0__Impl rule__TraceryProgram__Group__1 ;
    public final void rule__TraceryProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:432:1: ( rule__TraceryProgram__Group__0__Impl rule__TraceryProgram__Group__1 )
            // InternalTraceryLanguage.g:433:2: rule__TraceryProgram__Group__0__Impl rule__TraceryProgram__Group__1
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
    // InternalTraceryLanguage.g:440:1: rule__TraceryProgram__Group__0__Impl : ( '{' ) ;
    public final void rule__TraceryProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:444:1: ( ( '{' ) )
            // InternalTraceryLanguage.g:445:1: ( '{' )
            {
            // InternalTraceryLanguage.g:445:1: ( '{' )
            // InternalTraceryLanguage.g:446:2: '{'
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
    // InternalTraceryLanguage.g:455:1: rule__TraceryProgram__Group__1 : rule__TraceryProgram__Group__1__Impl rule__TraceryProgram__Group__2 ;
    public final void rule__TraceryProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:459:1: ( rule__TraceryProgram__Group__1__Impl rule__TraceryProgram__Group__2 )
            // InternalTraceryLanguage.g:460:2: rule__TraceryProgram__Group__1__Impl rule__TraceryProgram__Group__2
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
    // InternalTraceryLanguage.g:467:1: rule__TraceryProgram__Group__1__Impl : ( ( rule__TraceryProgram__StatementsAssignment_1 ) ) ;
    public final void rule__TraceryProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:471:1: ( ( ( rule__TraceryProgram__StatementsAssignment_1 ) ) )
            // InternalTraceryLanguage.g:472:1: ( ( rule__TraceryProgram__StatementsAssignment_1 ) )
            {
            // InternalTraceryLanguage.g:472:1: ( ( rule__TraceryProgram__StatementsAssignment_1 ) )
            // InternalTraceryLanguage.g:473:2: ( rule__TraceryProgram__StatementsAssignment_1 )
            {
             before(grammarAccess.getTraceryProgramAccess().getStatementsAssignment_1()); 
            // InternalTraceryLanguage.g:474:2: ( rule__TraceryProgram__StatementsAssignment_1 )
            // InternalTraceryLanguage.g:474:3: rule__TraceryProgram__StatementsAssignment_1
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
    // InternalTraceryLanguage.g:482:1: rule__TraceryProgram__Group__2 : rule__TraceryProgram__Group__2__Impl ;
    public final void rule__TraceryProgram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:486:1: ( rule__TraceryProgram__Group__2__Impl )
            // InternalTraceryLanguage.g:487:2: rule__TraceryProgram__Group__2__Impl
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
    // InternalTraceryLanguage.g:493:1: rule__TraceryProgram__Group__2__Impl : ( '}' ) ;
    public final void rule__TraceryProgram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:497:1: ( ( '}' ) )
            // InternalTraceryLanguage.g:498:1: ( '}' )
            {
            // InternalTraceryLanguage.g:498:1: ( '}' )
            // InternalTraceryLanguage.g:499:2: '}'
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
    // InternalTraceryLanguage.g:509:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:513:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalTraceryLanguage.g:514:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
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
    // InternalTraceryLanguage.g:521:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__InitialStatementAssignment_0 )* ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:525:1: ( ( ( rule__Statement__InitialStatementAssignment_0 )* ) )
            // InternalTraceryLanguage.g:526:1: ( ( rule__Statement__InitialStatementAssignment_0 )* )
            {
            // InternalTraceryLanguage.g:526:1: ( ( rule__Statement__InitialStatementAssignment_0 )* )
            // InternalTraceryLanguage.g:527:2: ( rule__Statement__InitialStatementAssignment_0 )*
            {
             before(grammarAccess.getStatementAccess().getInitialStatementAssignment_0()); 
            // InternalTraceryLanguage.g:528:2: ( rule__Statement__InitialStatementAssignment_0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTraceryLanguage.g:528:3: rule__Statement__InitialStatementAssignment_0
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
    // InternalTraceryLanguage.g:536:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:540:1: ( rule__Statement__Group__1__Impl )
            // InternalTraceryLanguage.g:541:2: rule__Statement__Group__1__Impl
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
    // InternalTraceryLanguage.g:547:1: rule__Statement__Group__1__Impl : ( ( rule__Statement__FinalStatementAssignment_1 ) ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:551:1: ( ( ( rule__Statement__FinalStatementAssignment_1 ) ) )
            // InternalTraceryLanguage.g:552:1: ( ( rule__Statement__FinalStatementAssignment_1 ) )
            {
            // InternalTraceryLanguage.g:552:1: ( ( rule__Statement__FinalStatementAssignment_1 ) )
            // InternalTraceryLanguage.g:553:2: ( rule__Statement__FinalStatementAssignment_1 )
            {
             before(grammarAccess.getStatementAccess().getFinalStatementAssignment_1()); 
            // InternalTraceryLanguage.g:554:2: ( rule__Statement__FinalStatementAssignment_1 )
            // InternalTraceryLanguage.g:554:3: rule__Statement__FinalStatementAssignment_1
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
    // InternalTraceryLanguage.g:563:1: rule__InitialJSONLines__Group__0 : rule__InitialJSONLines__Group__0__Impl rule__InitialJSONLines__Group__1 ;
    public final void rule__InitialJSONLines__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:567:1: ( rule__InitialJSONLines__Group__0__Impl rule__InitialJSONLines__Group__1 )
            // InternalTraceryLanguage.g:568:2: rule__InitialJSONLines__Group__0__Impl rule__InitialJSONLines__Group__1
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
    // InternalTraceryLanguage.g:575:1: rule__InitialJSONLines__Group__0__Impl : ( '&' ) ;
    public final void rule__InitialJSONLines__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:579:1: ( ( '&' ) )
            // InternalTraceryLanguage.g:580:1: ( '&' )
            {
            // InternalTraceryLanguage.g:580:1: ( '&' )
            // InternalTraceryLanguage.g:581:2: '&'
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
    // InternalTraceryLanguage.g:590:1: rule__InitialJSONLines__Group__1 : rule__InitialJSONLines__Group__1__Impl rule__InitialJSONLines__Group__2 ;
    public final void rule__InitialJSONLines__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:594:1: ( rule__InitialJSONLines__Group__1__Impl rule__InitialJSONLines__Group__2 )
            // InternalTraceryLanguage.g:595:2: rule__InitialJSONLines__Group__1__Impl rule__InitialJSONLines__Group__2
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
    // InternalTraceryLanguage.g:602:1: rule__InitialJSONLines__Group__1__Impl : ( ( rule__InitialJSONLines__NameAssignment_1 ) ) ;
    public final void rule__InitialJSONLines__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:606:1: ( ( ( rule__InitialJSONLines__NameAssignment_1 ) ) )
            // InternalTraceryLanguage.g:607:1: ( ( rule__InitialJSONLines__NameAssignment_1 ) )
            {
            // InternalTraceryLanguage.g:607:1: ( ( rule__InitialJSONLines__NameAssignment_1 ) )
            // InternalTraceryLanguage.g:608:2: ( rule__InitialJSONLines__NameAssignment_1 )
            {
             before(grammarAccess.getInitialJSONLinesAccess().getNameAssignment_1()); 
            // InternalTraceryLanguage.g:609:2: ( rule__InitialJSONLines__NameAssignment_1 )
            // InternalTraceryLanguage.g:609:3: rule__InitialJSONLines__NameAssignment_1
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
    // InternalTraceryLanguage.g:617:1: rule__InitialJSONLines__Group__2 : rule__InitialJSONLines__Group__2__Impl rule__InitialJSONLines__Group__3 ;
    public final void rule__InitialJSONLines__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:621:1: ( rule__InitialJSONLines__Group__2__Impl rule__InitialJSONLines__Group__3 )
            // InternalTraceryLanguage.g:622:2: rule__InitialJSONLines__Group__2__Impl rule__InitialJSONLines__Group__3
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
    // InternalTraceryLanguage.g:629:1: rule__InitialJSONLines__Group__2__Impl : ( '&' ) ;
    public final void rule__InitialJSONLines__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:633:1: ( ( '&' ) )
            // InternalTraceryLanguage.g:634:1: ( '&' )
            {
            // InternalTraceryLanguage.g:634:1: ( '&' )
            // InternalTraceryLanguage.g:635:2: '&'
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
    // InternalTraceryLanguage.g:644:1: rule__InitialJSONLines__Group__3 : rule__InitialJSONLines__Group__3__Impl rule__InitialJSONLines__Group__4 ;
    public final void rule__InitialJSONLines__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:648:1: ( rule__InitialJSONLines__Group__3__Impl rule__InitialJSONLines__Group__4 )
            // InternalTraceryLanguage.g:649:2: rule__InitialJSONLines__Group__3__Impl rule__InitialJSONLines__Group__4
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
    // InternalTraceryLanguage.g:656:1: rule__InitialJSONLines__Group__3__Impl : ( ':' ) ;
    public final void rule__InitialJSONLines__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:660:1: ( ( ':' ) )
            // InternalTraceryLanguage.g:661:1: ( ':' )
            {
            // InternalTraceryLanguage.g:661:1: ( ':' )
            // InternalTraceryLanguage.g:662:2: ':'
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
    // InternalTraceryLanguage.g:671:1: rule__InitialJSONLines__Group__4 : rule__InitialJSONLines__Group__4__Impl ;
    public final void rule__InitialJSONLines__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:675:1: ( rule__InitialJSONLines__Group__4__Impl )
            // InternalTraceryLanguage.g:676:2: rule__InitialJSONLines__Group__4__Impl
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
    // InternalTraceryLanguage.g:682:1: rule__InitialJSONLines__Group__4__Impl : ( ( rule__InitialJSONLines__ValueAssignment_4 ) ) ;
    public final void rule__InitialJSONLines__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:686:1: ( ( ( rule__InitialJSONLines__ValueAssignment_4 ) ) )
            // InternalTraceryLanguage.g:687:1: ( ( rule__InitialJSONLines__ValueAssignment_4 ) )
            {
            // InternalTraceryLanguage.g:687:1: ( ( rule__InitialJSONLines__ValueAssignment_4 ) )
            // InternalTraceryLanguage.g:688:2: ( rule__InitialJSONLines__ValueAssignment_4 )
            {
             before(grammarAccess.getInitialJSONLinesAccess().getValueAssignment_4()); 
            // InternalTraceryLanguage.g:689:2: ( rule__InitialJSONLines__ValueAssignment_4 )
            // InternalTraceryLanguage.g:689:3: rule__InitialJSONLines__ValueAssignment_4
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
    // InternalTraceryLanguage.g:698:1: rule__FinalJSONLine__Group__0 : rule__FinalJSONLine__Group__0__Impl rule__FinalJSONLine__Group__1 ;
    public final void rule__FinalJSONLine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:702:1: ( rule__FinalJSONLine__Group__0__Impl rule__FinalJSONLine__Group__1 )
            // InternalTraceryLanguage.g:703:2: rule__FinalJSONLine__Group__0__Impl rule__FinalJSONLine__Group__1
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
    // InternalTraceryLanguage.g:710:1: rule__FinalJSONLine__Group__0__Impl : ( '&origin&' ) ;
    public final void rule__FinalJSONLine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:714:1: ( ( '&origin&' ) )
            // InternalTraceryLanguage.g:715:1: ( '&origin&' )
            {
            // InternalTraceryLanguage.g:715:1: ( '&origin&' )
            // InternalTraceryLanguage.g:716:2: '&origin&'
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
    // InternalTraceryLanguage.g:725:1: rule__FinalJSONLine__Group__1 : rule__FinalJSONLine__Group__1__Impl rule__FinalJSONLine__Group__2 ;
    public final void rule__FinalJSONLine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:729:1: ( rule__FinalJSONLine__Group__1__Impl rule__FinalJSONLine__Group__2 )
            // InternalTraceryLanguage.g:730:2: rule__FinalJSONLine__Group__1__Impl rule__FinalJSONLine__Group__2
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
    // InternalTraceryLanguage.g:737:1: rule__FinalJSONLine__Group__1__Impl : ( ':' ) ;
    public final void rule__FinalJSONLine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:741:1: ( ( ':' ) )
            // InternalTraceryLanguage.g:742:1: ( ':' )
            {
            // InternalTraceryLanguage.g:742:1: ( ':' )
            // InternalTraceryLanguage.g:743:2: ':'
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
    // InternalTraceryLanguage.g:752:1: rule__FinalJSONLine__Group__2 : rule__FinalJSONLine__Group__2__Impl ;
    public final void rule__FinalJSONLine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:756:1: ( rule__FinalJSONLine__Group__2__Impl )
            // InternalTraceryLanguage.g:757:2: rule__FinalJSONLine__Group__2__Impl
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
    // InternalTraceryLanguage.g:763:1: rule__FinalJSONLine__Group__2__Impl : ( ( rule__FinalJSONLine__ValueAssignment_2 ) ) ;
    public final void rule__FinalJSONLine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:767:1: ( ( ( rule__FinalJSONLine__ValueAssignment_2 ) ) )
            // InternalTraceryLanguage.g:768:1: ( ( rule__FinalJSONLine__ValueAssignment_2 ) )
            {
            // InternalTraceryLanguage.g:768:1: ( ( rule__FinalJSONLine__ValueAssignment_2 ) )
            // InternalTraceryLanguage.g:769:2: ( rule__FinalJSONLine__ValueAssignment_2 )
            {
             before(grammarAccess.getFinalJSONLineAccess().getValueAssignment_2()); 
            // InternalTraceryLanguage.g:770:2: ( rule__FinalJSONLine__ValueAssignment_2 )
            // InternalTraceryLanguage.g:770:3: rule__FinalJSONLine__ValueAssignment_2
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
    // InternalTraceryLanguage.g:779:1: rule__InitialJSONEnding__Group__0 : rule__InitialJSONEnding__Group__0__Impl rule__InitialJSONEnding__Group__1 ;
    public final void rule__InitialJSONEnding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:783:1: ( rule__InitialJSONEnding__Group__0__Impl rule__InitialJSONEnding__Group__1 )
            // InternalTraceryLanguage.g:784:2: rule__InitialJSONEnding__Group__0__Impl rule__InitialJSONEnding__Group__1
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
    // InternalTraceryLanguage.g:791:1: rule__InitialJSONEnding__Group__0__Impl : ( '[' ) ;
    public final void rule__InitialJSONEnding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:795:1: ( ( '[' ) )
            // InternalTraceryLanguage.g:796:1: ( '[' )
            {
            // InternalTraceryLanguage.g:796:1: ( '[' )
            // InternalTraceryLanguage.g:797:2: '['
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
    // InternalTraceryLanguage.g:806:1: rule__InitialJSONEnding__Group__1 : rule__InitialJSONEnding__Group__1__Impl rule__InitialJSONEnding__Group__2 ;
    public final void rule__InitialJSONEnding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:810:1: ( rule__InitialJSONEnding__Group__1__Impl rule__InitialJSONEnding__Group__2 )
            // InternalTraceryLanguage.g:811:2: rule__InitialJSONEnding__Group__1__Impl rule__InitialJSONEnding__Group__2
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
    // InternalTraceryLanguage.g:818:1: rule__InitialJSONEnding__Group__1__Impl : ( ruleStartValue ) ;
    public final void rule__InitialJSONEnding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:822:1: ( ( ruleStartValue ) )
            // InternalTraceryLanguage.g:823:1: ( ruleStartValue )
            {
            // InternalTraceryLanguage.g:823:1: ( ruleStartValue )
            // InternalTraceryLanguage.g:824:2: ruleStartValue
            {
             before(grammarAccess.getInitialJSONEndingAccess().getStartValueParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleStartValue();

            state._fsp--;

             after(grammarAccess.getInitialJSONEndingAccess().getStartValueParserRuleCall_1()); 

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
    // InternalTraceryLanguage.g:833:1: rule__InitialJSONEnding__Group__2 : rule__InitialJSONEnding__Group__2__Impl rule__InitialJSONEnding__Group__3 ;
    public final void rule__InitialJSONEnding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:837:1: ( rule__InitialJSONEnding__Group__2__Impl rule__InitialJSONEnding__Group__3 )
            // InternalTraceryLanguage.g:838:2: rule__InitialJSONEnding__Group__2__Impl rule__InitialJSONEnding__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalTraceryLanguage.g:845:1: rule__InitialJSONEnding__Group__2__Impl : ( ( rule__InitialJSONEnding__ValsAssignment_2 )* ) ;
    public final void rule__InitialJSONEnding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:849:1: ( ( ( rule__InitialJSONEnding__ValsAssignment_2 )* ) )
            // InternalTraceryLanguage.g:850:1: ( ( rule__InitialJSONEnding__ValsAssignment_2 )* )
            {
            // InternalTraceryLanguage.g:850:1: ( ( rule__InitialJSONEnding__ValsAssignment_2 )* )
            // InternalTraceryLanguage.g:851:2: ( rule__InitialJSONEnding__ValsAssignment_2 )*
            {
             before(grammarAccess.getInitialJSONEndingAccess().getValsAssignment_2()); 
            // InternalTraceryLanguage.g:852:2: ( rule__InitialJSONEnding__ValsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTraceryLanguage.g:852:3: rule__InitialJSONEnding__ValsAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__InitialJSONEnding__ValsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getInitialJSONEndingAccess().getValsAssignment_2()); 

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
    // InternalTraceryLanguage.g:860:1: rule__InitialJSONEnding__Group__3 : rule__InitialJSONEnding__Group__3__Impl rule__InitialJSONEnding__Group__4 ;
    public final void rule__InitialJSONEnding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:864:1: ( rule__InitialJSONEnding__Group__3__Impl rule__InitialJSONEnding__Group__4 )
            // InternalTraceryLanguage.g:865:2: rule__InitialJSONEnding__Group__3__Impl rule__InitialJSONEnding__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__InitialJSONEnding__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialJSONEnding__Group__4();

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
    // InternalTraceryLanguage.g:872:1: rule__InitialJSONEnding__Group__3__Impl : ( ']' ) ;
    public final void rule__InitialJSONEnding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:876:1: ( ( ']' ) )
            // InternalTraceryLanguage.g:877:1: ( ']' )
            {
            // InternalTraceryLanguage.g:877:1: ( ']' )
            // InternalTraceryLanguage.g:878:2: ']'
            {
             before(grammarAccess.getInitialJSONEndingAccess().getRightSquareBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getInitialJSONEndingAccess().getRightSquareBracketKeyword_3()); 

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


    // $ANTLR start "rule__InitialJSONEnding__Group__4"
    // InternalTraceryLanguage.g:887:1: rule__InitialJSONEnding__Group__4 : rule__InitialJSONEnding__Group__4__Impl ;
    public final void rule__InitialJSONEnding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:891:1: ( rule__InitialJSONEnding__Group__4__Impl )
            // InternalTraceryLanguage.g:892:2: rule__InitialJSONEnding__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InitialJSONEnding__Group__4__Impl();

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
    // $ANTLR end "rule__InitialJSONEnding__Group__4"


    // $ANTLR start "rule__InitialJSONEnding__Group__4__Impl"
    // InternalTraceryLanguage.g:898:1: rule__InitialJSONEnding__Group__4__Impl : ( ',' ) ;
    public final void rule__InitialJSONEnding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:902:1: ( ( ',' ) )
            // InternalTraceryLanguage.g:903:1: ( ',' )
            {
            // InternalTraceryLanguage.g:903:1: ( ',' )
            // InternalTraceryLanguage.g:904:2: ','
            {
             before(grammarAccess.getInitialJSONEndingAccess().getCommaKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getInitialJSONEndingAccess().getCommaKeyword_4()); 

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
    // $ANTLR end "rule__InitialJSONEnding__Group__4__Impl"


    // $ANTLR start "rule__FinalJSONEnding__Group__0"
    // InternalTraceryLanguage.g:914:1: rule__FinalJSONEnding__Group__0 : rule__FinalJSONEnding__Group__0__Impl rule__FinalJSONEnding__Group__1 ;
    public final void rule__FinalJSONEnding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:918:1: ( rule__FinalJSONEnding__Group__0__Impl rule__FinalJSONEnding__Group__1 )
            // InternalTraceryLanguage.g:919:2: rule__FinalJSONEnding__Group__0__Impl rule__FinalJSONEnding__Group__1
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
    // InternalTraceryLanguage.g:926:1: rule__FinalJSONEnding__Group__0__Impl : ( '[' ) ;
    public final void rule__FinalJSONEnding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:930:1: ( ( '[' ) )
            // InternalTraceryLanguage.g:931:1: ( '[' )
            {
            // InternalTraceryLanguage.g:931:1: ( '[' )
            // InternalTraceryLanguage.g:932:2: '['
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
    // InternalTraceryLanguage.g:941:1: rule__FinalJSONEnding__Group__1 : rule__FinalJSONEnding__Group__1__Impl rule__FinalJSONEnding__Group__2 ;
    public final void rule__FinalJSONEnding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:945:1: ( rule__FinalJSONEnding__Group__1__Impl rule__FinalJSONEnding__Group__2 )
            // InternalTraceryLanguage.g:946:2: rule__FinalJSONEnding__Group__1__Impl rule__FinalJSONEnding__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalTraceryLanguage.g:953:1: rule__FinalJSONEnding__Group__1__Impl : ( ruleStartValue ) ;
    public final void rule__FinalJSONEnding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:957:1: ( ( ruleStartValue ) )
            // InternalTraceryLanguage.g:958:1: ( ruleStartValue )
            {
            // InternalTraceryLanguage.g:958:1: ( ruleStartValue )
            // InternalTraceryLanguage.g:959:2: ruleStartValue
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
    // InternalTraceryLanguage.g:968:1: rule__FinalJSONEnding__Group__2 : rule__FinalJSONEnding__Group__2__Impl rule__FinalJSONEnding__Group__3 ;
    public final void rule__FinalJSONEnding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:972:1: ( rule__FinalJSONEnding__Group__2__Impl rule__FinalJSONEnding__Group__3 )
            // InternalTraceryLanguage.g:973:2: rule__FinalJSONEnding__Group__2__Impl rule__FinalJSONEnding__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalTraceryLanguage.g:980:1: rule__FinalJSONEnding__Group__2__Impl : ( ( rule__FinalJSONEnding__ValsAssignment_2 )* ) ;
    public final void rule__FinalJSONEnding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:984:1: ( ( ( rule__FinalJSONEnding__ValsAssignment_2 )* ) )
            // InternalTraceryLanguage.g:985:1: ( ( rule__FinalJSONEnding__ValsAssignment_2 )* )
            {
            // InternalTraceryLanguage.g:985:1: ( ( rule__FinalJSONEnding__ValsAssignment_2 )* )
            // InternalTraceryLanguage.g:986:2: ( rule__FinalJSONEnding__ValsAssignment_2 )*
            {
             before(grammarAccess.getFinalJSONEndingAccess().getValsAssignment_2()); 
            // InternalTraceryLanguage.g:987:2: ( rule__FinalJSONEnding__ValsAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTraceryLanguage.g:987:3: rule__FinalJSONEnding__ValsAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
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
    // InternalTraceryLanguage.g:995:1: rule__FinalJSONEnding__Group__3 : rule__FinalJSONEnding__Group__3__Impl ;
    public final void rule__FinalJSONEnding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:999:1: ( rule__FinalJSONEnding__Group__3__Impl )
            // InternalTraceryLanguage.g:1000:2: rule__FinalJSONEnding__Group__3__Impl
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
    // InternalTraceryLanguage.g:1006:1: rule__FinalJSONEnding__Group__3__Impl : ( ']' ) ;
    public final void rule__FinalJSONEnding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1010:1: ( ( ']' ) )
            // InternalTraceryLanguage.g:1011:1: ( ']' )
            {
            // InternalTraceryLanguage.g:1011:1: ( ']' )
            // InternalTraceryLanguage.g:1012:2: ']'
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
    // InternalTraceryLanguage.g:1022:1: rule__StartValue__Group__0 : rule__StartValue__Group__0__Impl rule__StartValue__Group__1 ;
    public final void rule__StartValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1026:1: ( rule__StartValue__Group__0__Impl rule__StartValue__Group__1 )
            // InternalTraceryLanguage.g:1027:2: rule__StartValue__Group__0__Impl rule__StartValue__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalTraceryLanguage.g:1034:1: rule__StartValue__Group__0__Impl : ( '&' ) ;
    public final void rule__StartValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1038:1: ( ( '&' ) )
            // InternalTraceryLanguage.g:1039:1: ( '&' )
            {
            // InternalTraceryLanguage.g:1039:1: ( '&' )
            // InternalTraceryLanguage.g:1040:2: '&'
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
    // InternalTraceryLanguage.g:1049:1: rule__StartValue__Group__1 : rule__StartValue__Group__1__Impl rule__StartValue__Group__2 ;
    public final void rule__StartValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1053:1: ( rule__StartValue__Group__1__Impl rule__StartValue__Group__2 )
            // InternalTraceryLanguage.g:1054:2: rule__StartValue__Group__1__Impl rule__StartValue__Group__2
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
    // InternalTraceryLanguage.g:1061:1: rule__StartValue__Group__1__Impl : ( ( ( rule__StartValue__ValueInnerStatementsAssignment_1 ) ) ( ( rule__StartValue__ValueInnerStatementsAssignment_1 )* ) ) ;
    public final void rule__StartValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1065:1: ( ( ( ( rule__StartValue__ValueInnerStatementsAssignment_1 ) ) ( ( rule__StartValue__ValueInnerStatementsAssignment_1 )* ) ) )
            // InternalTraceryLanguage.g:1066:1: ( ( ( rule__StartValue__ValueInnerStatementsAssignment_1 ) ) ( ( rule__StartValue__ValueInnerStatementsAssignment_1 )* ) )
            {
            // InternalTraceryLanguage.g:1066:1: ( ( ( rule__StartValue__ValueInnerStatementsAssignment_1 ) ) ( ( rule__StartValue__ValueInnerStatementsAssignment_1 )* ) )
            // InternalTraceryLanguage.g:1067:2: ( ( rule__StartValue__ValueInnerStatementsAssignment_1 ) ) ( ( rule__StartValue__ValueInnerStatementsAssignment_1 )* )
            {
            // InternalTraceryLanguage.g:1067:2: ( ( rule__StartValue__ValueInnerStatementsAssignment_1 ) )
            // InternalTraceryLanguage.g:1068:3: ( rule__StartValue__ValueInnerStatementsAssignment_1 )
            {
             before(grammarAccess.getStartValueAccess().getValueInnerStatementsAssignment_1()); 
            // InternalTraceryLanguage.g:1069:3: ( rule__StartValue__ValueInnerStatementsAssignment_1 )
            // InternalTraceryLanguage.g:1069:4: rule__StartValue__ValueInnerStatementsAssignment_1
            {
            pushFollow(FOLLOW_14);
            rule__StartValue__ValueInnerStatementsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStartValueAccess().getValueInnerStatementsAssignment_1()); 

            }

            // InternalTraceryLanguage.g:1072:2: ( ( rule__StartValue__ValueInnerStatementsAssignment_1 )* )
            // InternalTraceryLanguage.g:1073:3: ( rule__StartValue__ValueInnerStatementsAssignment_1 )*
            {
             before(grammarAccess.getStartValueAccess().getValueInnerStatementsAssignment_1()); 
            // InternalTraceryLanguage.g:1074:3: ( rule__StartValue__ValueInnerStatementsAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STRING||LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTraceryLanguage.g:1074:4: rule__StartValue__ValueInnerStatementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_14);
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
    // InternalTraceryLanguage.g:1083:1: rule__StartValue__Group__2 : rule__StartValue__Group__2__Impl ;
    public final void rule__StartValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1087:1: ( rule__StartValue__Group__2__Impl )
            // InternalTraceryLanguage.g:1088:2: rule__StartValue__Group__2__Impl
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
    // InternalTraceryLanguage.g:1094:1: rule__StartValue__Group__2__Impl : ( '&' ) ;
    public final void rule__StartValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1098:1: ( ( '&' ) )
            // InternalTraceryLanguage.g:1099:1: ( '&' )
            {
            // InternalTraceryLanguage.g:1099:1: ( '&' )
            // InternalTraceryLanguage.g:1100:2: '&'
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
    // InternalTraceryLanguage.g:1110:1: rule__NormalValue__Group__0 : rule__NormalValue__Group__0__Impl rule__NormalValue__Group__1 ;
    public final void rule__NormalValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1114:1: ( rule__NormalValue__Group__0__Impl rule__NormalValue__Group__1 )
            // InternalTraceryLanguage.g:1115:2: rule__NormalValue__Group__0__Impl rule__NormalValue__Group__1
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
    // InternalTraceryLanguage.g:1122:1: rule__NormalValue__Group__0__Impl : ( ',' ) ;
    public final void rule__NormalValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1126:1: ( ( ',' ) )
            // InternalTraceryLanguage.g:1127:1: ( ',' )
            {
            // InternalTraceryLanguage.g:1127:1: ( ',' )
            // InternalTraceryLanguage.g:1128:2: ','
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
    // InternalTraceryLanguage.g:1137:1: rule__NormalValue__Group__1 : rule__NormalValue__Group__1__Impl rule__NormalValue__Group__2 ;
    public final void rule__NormalValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1141:1: ( rule__NormalValue__Group__1__Impl rule__NormalValue__Group__2 )
            // InternalTraceryLanguage.g:1142:2: rule__NormalValue__Group__1__Impl rule__NormalValue__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalTraceryLanguage.g:1149:1: rule__NormalValue__Group__1__Impl : ( '&' ) ;
    public final void rule__NormalValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1153:1: ( ( '&' ) )
            // InternalTraceryLanguage.g:1154:1: ( '&' )
            {
            // InternalTraceryLanguage.g:1154:1: ( '&' )
            // InternalTraceryLanguage.g:1155:2: '&'
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
    // InternalTraceryLanguage.g:1164:1: rule__NormalValue__Group__2 : rule__NormalValue__Group__2__Impl rule__NormalValue__Group__3 ;
    public final void rule__NormalValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1168:1: ( rule__NormalValue__Group__2__Impl rule__NormalValue__Group__3 )
            // InternalTraceryLanguage.g:1169:2: rule__NormalValue__Group__2__Impl rule__NormalValue__Group__3
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
    // InternalTraceryLanguage.g:1176:1: rule__NormalValue__Group__2__Impl : ( ( ( rule__NormalValue__ValueInnerStatementsAssignment_2 ) ) ( ( rule__NormalValue__ValueInnerStatementsAssignment_2 )* ) ) ;
    public final void rule__NormalValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1180:1: ( ( ( ( rule__NormalValue__ValueInnerStatementsAssignment_2 ) ) ( ( rule__NormalValue__ValueInnerStatementsAssignment_2 )* ) ) )
            // InternalTraceryLanguage.g:1181:1: ( ( ( rule__NormalValue__ValueInnerStatementsAssignment_2 ) ) ( ( rule__NormalValue__ValueInnerStatementsAssignment_2 )* ) )
            {
            // InternalTraceryLanguage.g:1181:1: ( ( ( rule__NormalValue__ValueInnerStatementsAssignment_2 ) ) ( ( rule__NormalValue__ValueInnerStatementsAssignment_2 )* ) )
            // InternalTraceryLanguage.g:1182:2: ( ( rule__NormalValue__ValueInnerStatementsAssignment_2 ) ) ( ( rule__NormalValue__ValueInnerStatementsAssignment_2 )* )
            {
            // InternalTraceryLanguage.g:1182:2: ( ( rule__NormalValue__ValueInnerStatementsAssignment_2 ) )
            // InternalTraceryLanguage.g:1183:3: ( rule__NormalValue__ValueInnerStatementsAssignment_2 )
            {
             before(grammarAccess.getNormalValueAccess().getValueInnerStatementsAssignment_2()); 
            // InternalTraceryLanguage.g:1184:3: ( rule__NormalValue__ValueInnerStatementsAssignment_2 )
            // InternalTraceryLanguage.g:1184:4: rule__NormalValue__ValueInnerStatementsAssignment_2
            {
            pushFollow(FOLLOW_14);
            rule__NormalValue__ValueInnerStatementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNormalValueAccess().getValueInnerStatementsAssignment_2()); 

            }

            // InternalTraceryLanguage.g:1187:2: ( ( rule__NormalValue__ValueInnerStatementsAssignment_2 )* )
            // InternalTraceryLanguage.g:1188:3: ( rule__NormalValue__ValueInnerStatementsAssignment_2 )*
            {
             before(grammarAccess.getNormalValueAccess().getValueInnerStatementsAssignment_2()); 
            // InternalTraceryLanguage.g:1189:3: ( rule__NormalValue__ValueInnerStatementsAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_STRING||LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTraceryLanguage.g:1189:4: rule__NormalValue__ValueInnerStatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_14);
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
    // InternalTraceryLanguage.g:1198:1: rule__NormalValue__Group__3 : rule__NormalValue__Group__3__Impl ;
    public final void rule__NormalValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1202:1: ( rule__NormalValue__Group__3__Impl )
            // InternalTraceryLanguage.g:1203:2: rule__NormalValue__Group__3__Impl
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
    // InternalTraceryLanguage.g:1209:1: rule__NormalValue__Group__3__Impl : ( '&' ) ;
    public final void rule__NormalValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1213:1: ( ( '&' ) )
            // InternalTraceryLanguage.g:1214:1: ( '&' )
            {
            // InternalTraceryLanguage.g:1214:1: ( '&' )
            // InternalTraceryLanguage.g:1215:2: '&'
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
    // InternalTraceryLanguage.g:1225:1: rule__DeclaredVariable__Group__0 : rule__DeclaredVariable__Group__0__Impl rule__DeclaredVariable__Group__1 ;
    public final void rule__DeclaredVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1229:1: ( rule__DeclaredVariable__Group__0__Impl rule__DeclaredVariable__Group__1 )
            // InternalTraceryLanguage.g:1230:2: rule__DeclaredVariable__Group__0__Impl rule__DeclaredVariable__Group__1
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
    // InternalTraceryLanguage.g:1237:1: rule__DeclaredVariable__Group__0__Impl : ( '#' ) ;
    public final void rule__DeclaredVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1241:1: ( ( '#' ) )
            // InternalTraceryLanguage.g:1242:1: ( '#' )
            {
            // InternalTraceryLanguage.g:1242:1: ( '#' )
            // InternalTraceryLanguage.g:1243:2: '#'
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
    // InternalTraceryLanguage.g:1252:1: rule__DeclaredVariable__Group__1 : rule__DeclaredVariable__Group__1__Impl rule__DeclaredVariable__Group__2 ;
    public final void rule__DeclaredVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1256:1: ( rule__DeclaredVariable__Group__1__Impl rule__DeclaredVariable__Group__2 )
            // InternalTraceryLanguage.g:1257:2: rule__DeclaredVariable__Group__1__Impl rule__DeclaredVariable__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalTraceryLanguage.g:1264:1: rule__DeclaredVariable__Group__1__Impl : ( ( rule__DeclaredVariable__VariableAssignment_1 ) ) ;
    public final void rule__DeclaredVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1268:1: ( ( ( rule__DeclaredVariable__VariableAssignment_1 ) ) )
            // InternalTraceryLanguage.g:1269:1: ( ( rule__DeclaredVariable__VariableAssignment_1 ) )
            {
            // InternalTraceryLanguage.g:1269:1: ( ( rule__DeclaredVariable__VariableAssignment_1 ) )
            // InternalTraceryLanguage.g:1270:2: ( rule__DeclaredVariable__VariableAssignment_1 )
            {
             before(grammarAccess.getDeclaredVariableAccess().getVariableAssignment_1()); 
            // InternalTraceryLanguage.g:1271:2: ( rule__DeclaredVariable__VariableAssignment_1 )
            // InternalTraceryLanguage.g:1271:3: rule__DeclaredVariable__VariableAssignment_1
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
    // InternalTraceryLanguage.g:1279:1: rule__DeclaredVariable__Group__2 : rule__DeclaredVariable__Group__2__Impl ;
    public final void rule__DeclaredVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1283:1: ( rule__DeclaredVariable__Group__2__Impl )
            // InternalTraceryLanguage.g:1284:2: rule__DeclaredVariable__Group__2__Impl
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
    // InternalTraceryLanguage.g:1290:1: rule__DeclaredVariable__Group__2__Impl : ( '#' ) ;
    public final void rule__DeclaredVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1294:1: ( ( '#' ) )
            // InternalTraceryLanguage.g:1295:1: ( '#' )
            {
            // InternalTraceryLanguage.g:1295:1: ( '#' )
            // InternalTraceryLanguage.g:1296:2: '#'
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
    // InternalTraceryLanguage.g:1306:1: rule__TraceryProgram__StatementsAssignment_1 : ( ruleStatement ) ;
    public final void rule__TraceryProgram__StatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1310:1: ( ( ruleStatement ) )
            // InternalTraceryLanguage.g:1311:2: ( ruleStatement )
            {
            // InternalTraceryLanguage.g:1311:2: ( ruleStatement )
            // InternalTraceryLanguage.g:1312:3: ruleStatement
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
    // InternalTraceryLanguage.g:1321:1: rule__Statement__InitialStatementAssignment_0 : ( ruleInitialJSONLines ) ;
    public final void rule__Statement__InitialStatementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1325:1: ( ( ruleInitialJSONLines ) )
            // InternalTraceryLanguage.g:1326:2: ( ruleInitialJSONLines )
            {
            // InternalTraceryLanguage.g:1326:2: ( ruleInitialJSONLines )
            // InternalTraceryLanguage.g:1327:3: ruleInitialJSONLines
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
    // InternalTraceryLanguage.g:1336:1: rule__Statement__FinalStatementAssignment_1 : ( ruleFinalJSONLine ) ;
    public final void rule__Statement__FinalStatementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1340:1: ( ( ruleFinalJSONLine ) )
            // InternalTraceryLanguage.g:1341:2: ( ruleFinalJSONLine )
            {
            // InternalTraceryLanguage.g:1341:2: ( ruleFinalJSONLine )
            // InternalTraceryLanguage.g:1342:3: ruleFinalJSONLine
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
    // InternalTraceryLanguage.g:1351:1: rule__InitialJSONLines__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InitialJSONLines__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1355:1: ( ( RULE_ID ) )
            // InternalTraceryLanguage.g:1356:2: ( RULE_ID )
            {
            // InternalTraceryLanguage.g:1356:2: ( RULE_ID )
            // InternalTraceryLanguage.g:1357:3: RULE_ID
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
    // InternalTraceryLanguage.g:1366:1: rule__InitialJSONLines__ValueAssignment_4 : ( ruleInitialJSONEnding ) ;
    public final void rule__InitialJSONLines__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1370:1: ( ( ruleInitialJSONEnding ) )
            // InternalTraceryLanguage.g:1371:2: ( ruleInitialJSONEnding )
            {
            // InternalTraceryLanguage.g:1371:2: ( ruleInitialJSONEnding )
            // InternalTraceryLanguage.g:1372:3: ruleInitialJSONEnding
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
    // InternalTraceryLanguage.g:1381:1: rule__FinalJSONLine__ValueAssignment_2 : ( ruleFinalJSONEnding ) ;
    public final void rule__FinalJSONLine__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1385:1: ( ( ruleFinalJSONEnding ) )
            // InternalTraceryLanguage.g:1386:2: ( ruleFinalJSONEnding )
            {
            // InternalTraceryLanguage.g:1386:2: ( ruleFinalJSONEnding )
            // InternalTraceryLanguage.g:1387:3: ruleFinalJSONEnding
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


    // $ANTLR start "rule__InitialJSONEnding__ValsAssignment_2"
    // InternalTraceryLanguage.g:1396:1: rule__InitialJSONEnding__ValsAssignment_2 : ( ruleNormalValue ) ;
    public final void rule__InitialJSONEnding__ValsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1400:1: ( ( ruleNormalValue ) )
            // InternalTraceryLanguage.g:1401:2: ( ruleNormalValue )
            {
            // InternalTraceryLanguage.g:1401:2: ( ruleNormalValue )
            // InternalTraceryLanguage.g:1402:3: ruleNormalValue
            {
             before(grammarAccess.getInitialJSONEndingAccess().getValsNormalValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNormalValue();

            state._fsp--;

             after(grammarAccess.getInitialJSONEndingAccess().getValsNormalValueParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__InitialJSONEnding__ValsAssignment_2"


    // $ANTLR start "rule__FinalJSONEnding__ValsAssignment_2"
    // InternalTraceryLanguage.g:1411:1: rule__FinalJSONEnding__ValsAssignment_2 : ( ruleNormalValue ) ;
    public final void rule__FinalJSONEnding__ValsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1415:1: ( ( ruleNormalValue ) )
            // InternalTraceryLanguage.g:1416:2: ( ruleNormalValue )
            {
            // InternalTraceryLanguage.g:1416:2: ( ruleNormalValue )
            // InternalTraceryLanguage.g:1417:3: ruleNormalValue
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
    // InternalTraceryLanguage.g:1426:1: rule__StartValue__ValueInnerStatementsAssignment_1 : ( ruleInnerStatements ) ;
    public final void rule__StartValue__ValueInnerStatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1430:1: ( ( ruleInnerStatements ) )
            // InternalTraceryLanguage.g:1431:2: ( ruleInnerStatements )
            {
            // InternalTraceryLanguage.g:1431:2: ( ruleInnerStatements )
            // InternalTraceryLanguage.g:1432:3: ruleInnerStatements
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
    // InternalTraceryLanguage.g:1441:1: rule__NormalValue__ValueInnerStatementsAssignment_2 : ( ruleInnerStatements ) ;
    public final void rule__NormalValue__ValueInnerStatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1445:1: ( ( ruleInnerStatements ) )
            // InternalTraceryLanguage.g:1446:2: ( ruleInnerStatements )
            {
            // InternalTraceryLanguage.g:1446:2: ( ruleInnerStatements )
            // InternalTraceryLanguage.g:1447:3: ruleInnerStatements
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
    // InternalTraceryLanguage.g:1456:1: rule__StringDeclaration__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringDeclaration__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1460:1: ( ( RULE_STRING ) )
            // InternalTraceryLanguage.g:1461:2: ( RULE_STRING )
            {
            // InternalTraceryLanguage.g:1461:2: ( RULE_STRING )
            // InternalTraceryLanguage.g:1462:3: RULE_STRING
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
    // InternalTraceryLanguage.g:1471:1: rule__DeclaredVariable__VariableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DeclaredVariable__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1475:1: ( ( ( RULE_ID ) ) )
            // InternalTraceryLanguage.g:1476:2: ( ( RULE_ID ) )
            {
            // InternalTraceryLanguage.g:1476:2: ( ( RULE_ID ) )
            // InternalTraceryLanguage.g:1477:3: ( RULE_ID )
            {
             before(grammarAccess.getDeclaredVariableAccess().getVariableInitialJSONLinesCrossReference_1_0()); 
            // InternalTraceryLanguage.g:1478:3: ( RULE_ID )
            // InternalTraceryLanguage.g:1479:4: RULE_ID
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
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080022L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});

}
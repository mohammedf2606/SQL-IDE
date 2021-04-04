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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'&'", "':'", "'['", "']'", "','"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

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


    // $ANTLR start "entryRuleInitialJSONLine"
    // InternalTraceryLanguage.g:78:1: entryRuleInitialJSONLine : ruleInitialJSONLine EOF ;
    public final void entryRuleInitialJSONLine() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:82:1: ( ruleInitialJSONLine EOF )
            // InternalTraceryLanguage.g:83:1: ruleInitialJSONLine EOF
            {
             before(grammarAccess.getInitialJSONLineRule()); 
            pushFollow(FOLLOW_1);
            ruleInitialJSONLine();

            state._fsp--;

             after(grammarAccess.getInitialJSONLineRule()); 
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
    // $ANTLR end "entryRuleInitialJSONLine"


    // $ANTLR start "ruleInitialJSONLine"
    // InternalTraceryLanguage.g:93:1: ruleInitialJSONLine : ( ( rule__InitialJSONLine__Group__0 ) ) ;
    public final void ruleInitialJSONLine() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:98:2: ( ( ( rule__InitialJSONLine__Group__0 ) ) )
            // InternalTraceryLanguage.g:99:2: ( ( rule__InitialJSONLine__Group__0 ) )
            {
            // InternalTraceryLanguage.g:99:2: ( ( rule__InitialJSONLine__Group__0 ) )
            // InternalTraceryLanguage.g:100:3: ( rule__InitialJSONLine__Group__0 )
            {
             before(grammarAccess.getInitialJSONLineAccess().getGroup()); 
            // InternalTraceryLanguage.g:101:3: ( rule__InitialJSONLine__Group__0 )
            // InternalTraceryLanguage.g:101:4: rule__InitialJSONLine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InitialJSONLine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInitialJSONLineAccess().getGroup()); 

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
    // $ANTLR end "ruleInitialJSONLine"


    // $ANTLR start "entryRuleInitialJSONEnding"
    // InternalTraceryLanguage.g:111:1: entryRuleInitialJSONEnding : ruleInitialJSONEnding EOF ;
    public final void entryRuleInitialJSONEnding() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:115:1: ( ruleInitialJSONEnding EOF )
            // InternalTraceryLanguage.g:116:1: ruleInitialJSONEnding EOF
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
    // InternalTraceryLanguage.g:126:1: ruleInitialJSONEnding : ( ( rule__InitialJSONEnding__Group__0 ) ) ;
    public final void ruleInitialJSONEnding() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:131:2: ( ( ( rule__InitialJSONEnding__Group__0 ) ) )
            // InternalTraceryLanguage.g:132:2: ( ( rule__InitialJSONEnding__Group__0 ) )
            {
            // InternalTraceryLanguage.g:132:2: ( ( rule__InitialJSONEnding__Group__0 ) )
            // InternalTraceryLanguage.g:133:3: ( rule__InitialJSONEnding__Group__0 )
            {
             before(grammarAccess.getInitialJSONEndingAccess().getGroup()); 
            // InternalTraceryLanguage.g:134:3: ( rule__InitialJSONEnding__Group__0 )
            // InternalTraceryLanguage.g:134:4: rule__InitialJSONEnding__Group__0
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


    // $ANTLR start "entryRuleStartValue"
    // InternalTraceryLanguage.g:144:1: entryRuleStartValue : ruleStartValue EOF ;
    public final void entryRuleStartValue() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:148:1: ( ruleStartValue EOF )
            // InternalTraceryLanguage.g:149:1: ruleStartValue EOF
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
    // InternalTraceryLanguage.g:159:1: ruleStartValue : ( ( rule__StartValue__Group__0 ) ) ;
    public final void ruleStartValue() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:164:2: ( ( ( rule__StartValue__Group__0 ) ) )
            // InternalTraceryLanguage.g:165:2: ( ( rule__StartValue__Group__0 ) )
            {
            // InternalTraceryLanguage.g:165:2: ( ( rule__StartValue__Group__0 ) )
            // InternalTraceryLanguage.g:166:3: ( rule__StartValue__Group__0 )
            {
             before(grammarAccess.getStartValueAccess().getGroup()); 
            // InternalTraceryLanguage.g:167:3: ( rule__StartValue__Group__0 )
            // InternalTraceryLanguage.g:167:4: rule__StartValue__Group__0
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
    // InternalTraceryLanguage.g:177:1: entryRuleNormalValue : ruleNormalValue EOF ;
    public final void entryRuleNormalValue() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:181:1: ( ruleNormalValue EOF )
            // InternalTraceryLanguage.g:182:1: ruleNormalValue EOF
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
    // InternalTraceryLanguage.g:192:1: ruleNormalValue : ( ( rule__NormalValue__Group__0 ) ) ;
    public final void ruleNormalValue() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:197:2: ( ( ( rule__NormalValue__Group__0 ) ) )
            // InternalTraceryLanguage.g:198:2: ( ( rule__NormalValue__Group__0 ) )
            {
            // InternalTraceryLanguage.g:198:2: ( ( rule__NormalValue__Group__0 ) )
            // InternalTraceryLanguage.g:199:3: ( rule__NormalValue__Group__0 )
            {
             before(grammarAccess.getNormalValueAccess().getGroup()); 
            // InternalTraceryLanguage.g:200:3: ( rule__NormalValue__Group__0 )
            // InternalTraceryLanguage.g:200:4: rule__NormalValue__Group__0
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
    // InternalTraceryLanguage.g:210:1: entryRuleInnerStatements : ruleInnerStatements EOF ;
    public final void entryRuleInnerStatements() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:214:1: ( ruleInnerStatements EOF )
            // InternalTraceryLanguage.g:215:1: ruleInnerStatements EOF
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
    // InternalTraceryLanguage.g:225:1: ruleInnerStatements : ( ( rule__InnerStatements__Alternatives ) ) ;
    public final void ruleInnerStatements() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:230:2: ( ( ( rule__InnerStatements__Alternatives ) ) )
            // InternalTraceryLanguage.g:231:2: ( ( rule__InnerStatements__Alternatives ) )
            {
            // InternalTraceryLanguage.g:231:2: ( ( rule__InnerStatements__Alternatives ) )
            // InternalTraceryLanguage.g:232:3: ( rule__InnerStatements__Alternatives )
            {
             before(grammarAccess.getInnerStatementsAccess().getAlternatives()); 
            // InternalTraceryLanguage.g:233:3: ( rule__InnerStatements__Alternatives )
            // InternalTraceryLanguage.g:233:4: rule__InnerStatements__Alternatives
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


    // $ANTLR start "entryRuleDeclaredVariable"
    // InternalTraceryLanguage.g:243:1: entryRuleDeclaredVariable : ruleDeclaredVariable EOF ;
    public final void entryRuleDeclaredVariable() throws RecognitionException {
        try {
            // InternalTraceryLanguage.g:244:1: ( ruleDeclaredVariable EOF )
            // InternalTraceryLanguage.g:245:1: ruleDeclaredVariable EOF
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
        }
        return ;
    }
    // $ANTLR end "entryRuleDeclaredVariable"


    // $ANTLR start "ruleDeclaredVariable"
    // InternalTraceryLanguage.g:252:1: ruleDeclaredVariable : ( ( rule__DeclaredVariable__VarAssignment ) ) ;
    public final void ruleDeclaredVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:256:2: ( ( ( rule__DeclaredVariable__VarAssignment ) ) )
            // InternalTraceryLanguage.g:257:2: ( ( rule__DeclaredVariable__VarAssignment ) )
            {
            // InternalTraceryLanguage.g:257:2: ( ( rule__DeclaredVariable__VarAssignment ) )
            // InternalTraceryLanguage.g:258:3: ( rule__DeclaredVariable__VarAssignment )
            {
             before(grammarAccess.getDeclaredVariableAccess().getVarAssignment()); 
            // InternalTraceryLanguage.g:259:3: ( rule__DeclaredVariable__VarAssignment )
            // InternalTraceryLanguage.g:259:4: rule__DeclaredVariable__VarAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DeclaredVariable__VarAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDeclaredVariableAccess().getVarAssignment()); 

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
    // $ANTLR end "ruleDeclaredVariable"


    // $ANTLR start "rule__InnerStatements__Alternatives"
    // InternalTraceryLanguage.g:267:1: rule__InnerStatements__Alternatives : ( ( ( rule__InnerStatements__ValAssignment_0 ) ) | ( ruleDeclaredVariable ) );
    public final void rule__InnerStatements__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:271:1: ( ( ( rule__InnerStatements__ValAssignment_0 ) ) | ( ruleDeclaredVariable ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalTraceryLanguage.g:272:2: ( ( rule__InnerStatements__ValAssignment_0 ) )
                    {
                    // InternalTraceryLanguage.g:272:2: ( ( rule__InnerStatements__ValAssignment_0 ) )
                    // InternalTraceryLanguage.g:273:3: ( rule__InnerStatements__ValAssignment_0 )
                    {
                     before(grammarAccess.getInnerStatementsAccess().getValAssignment_0()); 
                    // InternalTraceryLanguage.g:274:3: ( rule__InnerStatements__ValAssignment_0 )
                    // InternalTraceryLanguage.g:274:4: rule__InnerStatements__ValAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InnerStatements__ValAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInnerStatementsAccess().getValAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryLanguage.g:278:2: ( ruleDeclaredVariable )
                    {
                    // InternalTraceryLanguage.g:278:2: ( ruleDeclaredVariable )
                    // InternalTraceryLanguage.g:279:3: ruleDeclaredVariable
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
    // InternalTraceryLanguage.g:288:1: rule__TraceryProgram__Group__0 : rule__TraceryProgram__Group__0__Impl rule__TraceryProgram__Group__1 ;
    public final void rule__TraceryProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:292:1: ( rule__TraceryProgram__Group__0__Impl rule__TraceryProgram__Group__1 )
            // InternalTraceryLanguage.g:293:2: rule__TraceryProgram__Group__0__Impl rule__TraceryProgram__Group__1
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
    // InternalTraceryLanguage.g:300:1: rule__TraceryProgram__Group__0__Impl : ( '{' ) ;
    public final void rule__TraceryProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:304:1: ( ( '{' ) )
            // InternalTraceryLanguage.g:305:1: ( '{' )
            {
            // InternalTraceryLanguage.g:305:1: ( '{' )
            // InternalTraceryLanguage.g:306:2: '{'
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
    // InternalTraceryLanguage.g:315:1: rule__TraceryProgram__Group__1 : rule__TraceryProgram__Group__1__Impl rule__TraceryProgram__Group__2 ;
    public final void rule__TraceryProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:319:1: ( rule__TraceryProgram__Group__1__Impl rule__TraceryProgram__Group__2 )
            // InternalTraceryLanguage.g:320:2: rule__TraceryProgram__Group__1__Impl rule__TraceryProgram__Group__2
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
    // InternalTraceryLanguage.g:327:1: rule__TraceryProgram__Group__1__Impl : ( ( rule__TraceryProgram__InitialStatementAssignment_1 ) ) ;
    public final void rule__TraceryProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:331:1: ( ( ( rule__TraceryProgram__InitialStatementAssignment_1 ) ) )
            // InternalTraceryLanguage.g:332:1: ( ( rule__TraceryProgram__InitialStatementAssignment_1 ) )
            {
            // InternalTraceryLanguage.g:332:1: ( ( rule__TraceryProgram__InitialStatementAssignment_1 ) )
            // InternalTraceryLanguage.g:333:2: ( rule__TraceryProgram__InitialStatementAssignment_1 )
            {
             before(grammarAccess.getTraceryProgramAccess().getInitialStatementAssignment_1()); 
            // InternalTraceryLanguage.g:334:2: ( rule__TraceryProgram__InitialStatementAssignment_1 )
            // InternalTraceryLanguage.g:334:3: rule__TraceryProgram__InitialStatementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TraceryProgram__InitialStatementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTraceryProgramAccess().getInitialStatementAssignment_1()); 

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
    // InternalTraceryLanguage.g:342:1: rule__TraceryProgram__Group__2 : rule__TraceryProgram__Group__2__Impl ;
    public final void rule__TraceryProgram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:346:1: ( rule__TraceryProgram__Group__2__Impl )
            // InternalTraceryLanguage.g:347:2: rule__TraceryProgram__Group__2__Impl
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
    // InternalTraceryLanguage.g:353:1: rule__TraceryProgram__Group__2__Impl : ( '}' ) ;
    public final void rule__TraceryProgram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:357:1: ( ( '}' ) )
            // InternalTraceryLanguage.g:358:1: ( '}' )
            {
            // InternalTraceryLanguage.g:358:1: ( '}' )
            // InternalTraceryLanguage.g:359:2: '}'
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


    // $ANTLR start "rule__InitialJSONLine__Group__0"
    // InternalTraceryLanguage.g:369:1: rule__InitialJSONLine__Group__0 : rule__InitialJSONLine__Group__0__Impl rule__InitialJSONLine__Group__1 ;
    public final void rule__InitialJSONLine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:373:1: ( rule__InitialJSONLine__Group__0__Impl rule__InitialJSONLine__Group__1 )
            // InternalTraceryLanguage.g:374:2: rule__InitialJSONLine__Group__0__Impl rule__InitialJSONLine__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__InitialJSONLine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialJSONLine__Group__1();

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
    // $ANTLR end "rule__InitialJSONLine__Group__0"


    // $ANTLR start "rule__InitialJSONLine__Group__0__Impl"
    // InternalTraceryLanguage.g:381:1: rule__InitialJSONLine__Group__0__Impl : ( '&' ) ;
    public final void rule__InitialJSONLine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:385:1: ( ( '&' ) )
            // InternalTraceryLanguage.g:386:1: ( '&' )
            {
            // InternalTraceryLanguage.g:386:1: ( '&' )
            // InternalTraceryLanguage.g:387:2: '&'
            {
             before(grammarAccess.getInitialJSONLineAccess().getAmpersandKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getInitialJSONLineAccess().getAmpersandKeyword_0()); 

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
    // $ANTLR end "rule__InitialJSONLine__Group__0__Impl"


    // $ANTLR start "rule__InitialJSONLine__Group__1"
    // InternalTraceryLanguage.g:396:1: rule__InitialJSONLine__Group__1 : rule__InitialJSONLine__Group__1__Impl rule__InitialJSONLine__Group__2 ;
    public final void rule__InitialJSONLine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:400:1: ( rule__InitialJSONLine__Group__1__Impl rule__InitialJSONLine__Group__2 )
            // InternalTraceryLanguage.g:401:2: rule__InitialJSONLine__Group__1__Impl rule__InitialJSONLine__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__InitialJSONLine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialJSONLine__Group__2();

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
    // $ANTLR end "rule__InitialJSONLine__Group__1"


    // $ANTLR start "rule__InitialJSONLine__Group__1__Impl"
    // InternalTraceryLanguage.g:408:1: rule__InitialJSONLine__Group__1__Impl : ( ( rule__InitialJSONLine__NameAssignment_1 ) ) ;
    public final void rule__InitialJSONLine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:412:1: ( ( ( rule__InitialJSONLine__NameAssignment_1 ) ) )
            // InternalTraceryLanguage.g:413:1: ( ( rule__InitialJSONLine__NameAssignment_1 ) )
            {
            // InternalTraceryLanguage.g:413:1: ( ( rule__InitialJSONLine__NameAssignment_1 ) )
            // InternalTraceryLanguage.g:414:2: ( rule__InitialJSONLine__NameAssignment_1 )
            {
             before(grammarAccess.getInitialJSONLineAccess().getNameAssignment_1()); 
            // InternalTraceryLanguage.g:415:2: ( rule__InitialJSONLine__NameAssignment_1 )
            // InternalTraceryLanguage.g:415:3: rule__InitialJSONLine__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InitialJSONLine__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInitialJSONLineAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__InitialJSONLine__Group__1__Impl"


    // $ANTLR start "rule__InitialJSONLine__Group__2"
    // InternalTraceryLanguage.g:423:1: rule__InitialJSONLine__Group__2 : rule__InitialJSONLine__Group__2__Impl rule__InitialJSONLine__Group__3 ;
    public final void rule__InitialJSONLine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:427:1: ( rule__InitialJSONLine__Group__2__Impl rule__InitialJSONLine__Group__3 )
            // InternalTraceryLanguage.g:428:2: rule__InitialJSONLine__Group__2__Impl rule__InitialJSONLine__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__InitialJSONLine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialJSONLine__Group__3();

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
    // $ANTLR end "rule__InitialJSONLine__Group__2"


    // $ANTLR start "rule__InitialJSONLine__Group__2__Impl"
    // InternalTraceryLanguage.g:435:1: rule__InitialJSONLine__Group__2__Impl : ( '&' ) ;
    public final void rule__InitialJSONLine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:439:1: ( ( '&' ) )
            // InternalTraceryLanguage.g:440:1: ( '&' )
            {
            // InternalTraceryLanguage.g:440:1: ( '&' )
            // InternalTraceryLanguage.g:441:2: '&'
            {
             before(grammarAccess.getInitialJSONLineAccess().getAmpersandKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getInitialJSONLineAccess().getAmpersandKeyword_2()); 

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
    // $ANTLR end "rule__InitialJSONLine__Group__2__Impl"


    // $ANTLR start "rule__InitialJSONLine__Group__3"
    // InternalTraceryLanguage.g:450:1: rule__InitialJSONLine__Group__3 : rule__InitialJSONLine__Group__3__Impl rule__InitialJSONLine__Group__4 ;
    public final void rule__InitialJSONLine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:454:1: ( rule__InitialJSONLine__Group__3__Impl rule__InitialJSONLine__Group__4 )
            // InternalTraceryLanguage.g:455:2: rule__InitialJSONLine__Group__3__Impl rule__InitialJSONLine__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__InitialJSONLine__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialJSONLine__Group__4();

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
    // $ANTLR end "rule__InitialJSONLine__Group__3"


    // $ANTLR start "rule__InitialJSONLine__Group__3__Impl"
    // InternalTraceryLanguage.g:462:1: rule__InitialJSONLine__Group__3__Impl : ( ':' ) ;
    public final void rule__InitialJSONLine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:466:1: ( ( ':' ) )
            // InternalTraceryLanguage.g:467:1: ( ':' )
            {
            // InternalTraceryLanguage.g:467:1: ( ':' )
            // InternalTraceryLanguage.g:468:2: ':'
            {
             before(grammarAccess.getInitialJSONLineAccess().getColonKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getInitialJSONLineAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__InitialJSONLine__Group__3__Impl"


    // $ANTLR start "rule__InitialJSONLine__Group__4"
    // InternalTraceryLanguage.g:477:1: rule__InitialJSONLine__Group__4 : rule__InitialJSONLine__Group__4__Impl ;
    public final void rule__InitialJSONLine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:481:1: ( rule__InitialJSONLine__Group__4__Impl )
            // InternalTraceryLanguage.g:482:2: rule__InitialJSONLine__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InitialJSONLine__Group__4__Impl();

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
    // $ANTLR end "rule__InitialJSONLine__Group__4"


    // $ANTLR start "rule__InitialJSONLine__Group__4__Impl"
    // InternalTraceryLanguage.g:488:1: rule__InitialJSONLine__Group__4__Impl : ( ( rule__InitialJSONLine__ValueAssignment_4 ) ) ;
    public final void rule__InitialJSONLine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:492:1: ( ( ( rule__InitialJSONLine__ValueAssignment_4 ) ) )
            // InternalTraceryLanguage.g:493:1: ( ( rule__InitialJSONLine__ValueAssignment_4 ) )
            {
            // InternalTraceryLanguage.g:493:1: ( ( rule__InitialJSONLine__ValueAssignment_4 ) )
            // InternalTraceryLanguage.g:494:2: ( rule__InitialJSONLine__ValueAssignment_4 )
            {
             before(grammarAccess.getInitialJSONLineAccess().getValueAssignment_4()); 
            // InternalTraceryLanguage.g:495:2: ( rule__InitialJSONLine__ValueAssignment_4 )
            // InternalTraceryLanguage.g:495:3: rule__InitialJSONLine__ValueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__InitialJSONLine__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInitialJSONLineAccess().getValueAssignment_4()); 

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
    // $ANTLR end "rule__InitialJSONLine__Group__4__Impl"


    // $ANTLR start "rule__InitialJSONEnding__Group__0"
    // InternalTraceryLanguage.g:504:1: rule__InitialJSONEnding__Group__0 : rule__InitialJSONEnding__Group__0__Impl rule__InitialJSONEnding__Group__1 ;
    public final void rule__InitialJSONEnding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:508:1: ( rule__InitialJSONEnding__Group__0__Impl rule__InitialJSONEnding__Group__1 )
            // InternalTraceryLanguage.g:509:2: rule__InitialJSONEnding__Group__0__Impl rule__InitialJSONEnding__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalTraceryLanguage.g:516:1: rule__InitialJSONEnding__Group__0__Impl : ( '[' ) ;
    public final void rule__InitialJSONEnding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:520:1: ( ( '[' ) )
            // InternalTraceryLanguage.g:521:1: ( '[' )
            {
            // InternalTraceryLanguage.g:521:1: ( '[' )
            // InternalTraceryLanguage.g:522:2: '['
            {
             before(grammarAccess.getInitialJSONEndingAccess().getLeftSquareBracketKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalTraceryLanguage.g:531:1: rule__InitialJSONEnding__Group__1 : rule__InitialJSONEnding__Group__1__Impl rule__InitialJSONEnding__Group__2 ;
    public final void rule__InitialJSONEnding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:535:1: ( rule__InitialJSONEnding__Group__1__Impl rule__InitialJSONEnding__Group__2 )
            // InternalTraceryLanguage.g:536:2: rule__InitialJSONEnding__Group__1__Impl rule__InitialJSONEnding__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalTraceryLanguage.g:543:1: rule__InitialJSONEnding__Group__1__Impl : ( ( rule__InitialJSONEnding__StartValAssignment_1 ) ) ;
    public final void rule__InitialJSONEnding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:547:1: ( ( ( rule__InitialJSONEnding__StartValAssignment_1 ) ) )
            // InternalTraceryLanguage.g:548:1: ( ( rule__InitialJSONEnding__StartValAssignment_1 ) )
            {
            // InternalTraceryLanguage.g:548:1: ( ( rule__InitialJSONEnding__StartValAssignment_1 ) )
            // InternalTraceryLanguage.g:549:2: ( rule__InitialJSONEnding__StartValAssignment_1 )
            {
             before(grammarAccess.getInitialJSONEndingAccess().getStartValAssignment_1()); 
            // InternalTraceryLanguage.g:550:2: ( rule__InitialJSONEnding__StartValAssignment_1 )
            // InternalTraceryLanguage.g:550:3: rule__InitialJSONEnding__StartValAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InitialJSONEnding__StartValAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInitialJSONEndingAccess().getStartValAssignment_1()); 

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
    // InternalTraceryLanguage.g:558:1: rule__InitialJSONEnding__Group__2 : rule__InitialJSONEnding__Group__2__Impl rule__InitialJSONEnding__Group__3 ;
    public final void rule__InitialJSONEnding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:562:1: ( rule__InitialJSONEnding__Group__2__Impl rule__InitialJSONEnding__Group__3 )
            // InternalTraceryLanguage.g:563:2: rule__InitialJSONEnding__Group__2__Impl rule__InitialJSONEnding__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalTraceryLanguage.g:570:1: rule__InitialJSONEnding__Group__2__Impl : ( ( rule__InitialJSONEnding__ValsAssignment_2 )* ) ;
    public final void rule__InitialJSONEnding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:574:1: ( ( ( rule__InitialJSONEnding__ValsAssignment_2 )* ) )
            // InternalTraceryLanguage.g:575:1: ( ( rule__InitialJSONEnding__ValsAssignment_2 )* )
            {
            // InternalTraceryLanguage.g:575:1: ( ( rule__InitialJSONEnding__ValsAssignment_2 )* )
            // InternalTraceryLanguage.g:576:2: ( rule__InitialJSONEnding__ValsAssignment_2 )*
            {
             before(grammarAccess.getInitialJSONEndingAccess().getValsAssignment_2()); 
            // InternalTraceryLanguage.g:577:2: ( rule__InitialJSONEnding__ValsAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTraceryLanguage.g:577:3: rule__InitialJSONEnding__ValsAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__InitialJSONEnding__ValsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // InternalTraceryLanguage.g:585:1: rule__InitialJSONEnding__Group__3 : rule__InitialJSONEnding__Group__3__Impl ;
    public final void rule__InitialJSONEnding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:589:1: ( rule__InitialJSONEnding__Group__3__Impl )
            // InternalTraceryLanguage.g:590:2: rule__InitialJSONEnding__Group__3__Impl
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
    // InternalTraceryLanguage.g:596:1: rule__InitialJSONEnding__Group__3__Impl : ( ']' ) ;
    public final void rule__InitialJSONEnding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:600:1: ( ( ']' ) )
            // InternalTraceryLanguage.g:601:1: ( ']' )
            {
            // InternalTraceryLanguage.g:601:1: ( ']' )
            // InternalTraceryLanguage.g:602:2: ']'
            {
             before(grammarAccess.getInitialJSONEndingAccess().getRightSquareBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
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


    // $ANTLR start "rule__StartValue__Group__0"
    // InternalTraceryLanguage.g:612:1: rule__StartValue__Group__0 : rule__StartValue__Group__0__Impl rule__StartValue__Group__1 ;
    public final void rule__StartValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:616:1: ( rule__StartValue__Group__0__Impl rule__StartValue__Group__1 )
            // InternalTraceryLanguage.g:617:2: rule__StartValue__Group__0__Impl rule__StartValue__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalTraceryLanguage.g:624:1: rule__StartValue__Group__0__Impl : ( '&' ) ;
    public final void rule__StartValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:628:1: ( ( '&' ) )
            // InternalTraceryLanguage.g:629:1: ( '&' )
            {
            // InternalTraceryLanguage.g:629:1: ( '&' )
            // InternalTraceryLanguage.g:630:2: '&'
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
    // InternalTraceryLanguage.g:639:1: rule__StartValue__Group__1 : rule__StartValue__Group__1__Impl rule__StartValue__Group__2 ;
    public final void rule__StartValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:643:1: ( rule__StartValue__Group__1__Impl rule__StartValue__Group__2 )
            // InternalTraceryLanguage.g:644:2: rule__StartValue__Group__1__Impl rule__StartValue__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalTraceryLanguage.g:651:1: rule__StartValue__Group__1__Impl : ( ( rule__StartValue__ValueInnerStatementsAssignment_1 ) ) ;
    public final void rule__StartValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:655:1: ( ( ( rule__StartValue__ValueInnerStatementsAssignment_1 ) ) )
            // InternalTraceryLanguage.g:656:1: ( ( rule__StartValue__ValueInnerStatementsAssignment_1 ) )
            {
            // InternalTraceryLanguage.g:656:1: ( ( rule__StartValue__ValueInnerStatementsAssignment_1 ) )
            // InternalTraceryLanguage.g:657:2: ( rule__StartValue__ValueInnerStatementsAssignment_1 )
            {
             before(grammarAccess.getStartValueAccess().getValueInnerStatementsAssignment_1()); 
            // InternalTraceryLanguage.g:658:2: ( rule__StartValue__ValueInnerStatementsAssignment_1 )
            // InternalTraceryLanguage.g:658:3: rule__StartValue__ValueInnerStatementsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StartValue__ValueInnerStatementsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStartValueAccess().getValueInnerStatementsAssignment_1()); 

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
    // InternalTraceryLanguage.g:666:1: rule__StartValue__Group__2 : rule__StartValue__Group__2__Impl ;
    public final void rule__StartValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:670:1: ( rule__StartValue__Group__2__Impl )
            // InternalTraceryLanguage.g:671:2: rule__StartValue__Group__2__Impl
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
    // InternalTraceryLanguage.g:677:1: rule__StartValue__Group__2__Impl : ( '&' ) ;
    public final void rule__StartValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:681:1: ( ( '&' ) )
            // InternalTraceryLanguage.g:682:1: ( '&' )
            {
            // InternalTraceryLanguage.g:682:1: ( '&' )
            // InternalTraceryLanguage.g:683:2: '&'
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
    // InternalTraceryLanguage.g:693:1: rule__NormalValue__Group__0 : rule__NormalValue__Group__0__Impl rule__NormalValue__Group__1 ;
    public final void rule__NormalValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:697:1: ( rule__NormalValue__Group__0__Impl rule__NormalValue__Group__1 )
            // InternalTraceryLanguage.g:698:2: rule__NormalValue__Group__0__Impl rule__NormalValue__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalTraceryLanguage.g:705:1: rule__NormalValue__Group__0__Impl : ( ',' ) ;
    public final void rule__NormalValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:709:1: ( ( ',' ) )
            // InternalTraceryLanguage.g:710:1: ( ',' )
            {
            // InternalTraceryLanguage.g:710:1: ( ',' )
            // InternalTraceryLanguage.g:711:2: ','
            {
             before(grammarAccess.getNormalValueAccess().getCommaKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalTraceryLanguage.g:720:1: rule__NormalValue__Group__1 : rule__NormalValue__Group__1__Impl rule__NormalValue__Group__2 ;
    public final void rule__NormalValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:724:1: ( rule__NormalValue__Group__1__Impl rule__NormalValue__Group__2 )
            // InternalTraceryLanguage.g:725:2: rule__NormalValue__Group__1__Impl rule__NormalValue__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalTraceryLanguage.g:732:1: rule__NormalValue__Group__1__Impl : ( '&' ) ;
    public final void rule__NormalValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:736:1: ( ( '&' ) )
            // InternalTraceryLanguage.g:737:1: ( '&' )
            {
            // InternalTraceryLanguage.g:737:1: ( '&' )
            // InternalTraceryLanguage.g:738:2: '&'
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
    // InternalTraceryLanguage.g:747:1: rule__NormalValue__Group__2 : rule__NormalValue__Group__2__Impl rule__NormalValue__Group__3 ;
    public final void rule__NormalValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:751:1: ( rule__NormalValue__Group__2__Impl rule__NormalValue__Group__3 )
            // InternalTraceryLanguage.g:752:2: rule__NormalValue__Group__2__Impl rule__NormalValue__Group__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalTraceryLanguage.g:759:1: rule__NormalValue__Group__2__Impl : ( ( rule__NormalValue__ValueInnerStatementsAssignment_2 ) ) ;
    public final void rule__NormalValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:763:1: ( ( ( rule__NormalValue__ValueInnerStatementsAssignment_2 ) ) )
            // InternalTraceryLanguage.g:764:1: ( ( rule__NormalValue__ValueInnerStatementsAssignment_2 ) )
            {
            // InternalTraceryLanguage.g:764:1: ( ( rule__NormalValue__ValueInnerStatementsAssignment_2 ) )
            // InternalTraceryLanguage.g:765:2: ( rule__NormalValue__ValueInnerStatementsAssignment_2 )
            {
             before(grammarAccess.getNormalValueAccess().getValueInnerStatementsAssignment_2()); 
            // InternalTraceryLanguage.g:766:2: ( rule__NormalValue__ValueInnerStatementsAssignment_2 )
            // InternalTraceryLanguage.g:766:3: rule__NormalValue__ValueInnerStatementsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NormalValue__ValueInnerStatementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNormalValueAccess().getValueInnerStatementsAssignment_2()); 

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
    // InternalTraceryLanguage.g:774:1: rule__NormalValue__Group__3 : rule__NormalValue__Group__3__Impl ;
    public final void rule__NormalValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:778:1: ( rule__NormalValue__Group__3__Impl )
            // InternalTraceryLanguage.g:779:2: rule__NormalValue__Group__3__Impl
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
    // InternalTraceryLanguage.g:785:1: rule__NormalValue__Group__3__Impl : ( '&' ) ;
    public final void rule__NormalValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:789:1: ( ( '&' ) )
            // InternalTraceryLanguage.g:790:1: ( '&' )
            {
            // InternalTraceryLanguage.g:790:1: ( '&' )
            // InternalTraceryLanguage.g:791:2: '&'
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


    // $ANTLR start "rule__TraceryProgram__InitialStatementAssignment_1"
    // InternalTraceryLanguage.g:801:1: rule__TraceryProgram__InitialStatementAssignment_1 : ( ruleInitialJSONLine ) ;
    public final void rule__TraceryProgram__InitialStatementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:805:1: ( ( ruleInitialJSONLine ) )
            // InternalTraceryLanguage.g:806:2: ( ruleInitialJSONLine )
            {
            // InternalTraceryLanguage.g:806:2: ( ruleInitialJSONLine )
            // InternalTraceryLanguage.g:807:3: ruleInitialJSONLine
            {
             before(grammarAccess.getTraceryProgramAccess().getInitialStatementInitialJSONLineParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInitialJSONLine();

            state._fsp--;

             after(grammarAccess.getTraceryProgramAccess().getInitialStatementInitialJSONLineParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__TraceryProgram__InitialStatementAssignment_1"


    // $ANTLR start "rule__InitialJSONLine__NameAssignment_1"
    // InternalTraceryLanguage.g:816:1: rule__InitialJSONLine__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InitialJSONLine__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:820:1: ( ( RULE_ID ) )
            // InternalTraceryLanguage.g:821:2: ( RULE_ID )
            {
            // InternalTraceryLanguage.g:821:2: ( RULE_ID )
            // InternalTraceryLanguage.g:822:3: RULE_ID
            {
             before(grammarAccess.getInitialJSONLineAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInitialJSONLineAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__InitialJSONLine__NameAssignment_1"


    // $ANTLR start "rule__InitialJSONLine__ValueAssignment_4"
    // InternalTraceryLanguage.g:831:1: rule__InitialJSONLine__ValueAssignment_4 : ( ruleInitialJSONEnding ) ;
    public final void rule__InitialJSONLine__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:835:1: ( ( ruleInitialJSONEnding ) )
            // InternalTraceryLanguage.g:836:2: ( ruleInitialJSONEnding )
            {
            // InternalTraceryLanguage.g:836:2: ( ruleInitialJSONEnding )
            // InternalTraceryLanguage.g:837:3: ruleInitialJSONEnding
            {
             before(grammarAccess.getInitialJSONLineAccess().getValueInitialJSONEndingParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleInitialJSONEnding();

            state._fsp--;

             after(grammarAccess.getInitialJSONLineAccess().getValueInitialJSONEndingParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__InitialJSONLine__ValueAssignment_4"


    // $ANTLR start "rule__InitialJSONEnding__StartValAssignment_1"
    // InternalTraceryLanguage.g:846:1: rule__InitialJSONEnding__StartValAssignment_1 : ( ruleStartValue ) ;
    public final void rule__InitialJSONEnding__StartValAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:850:1: ( ( ruleStartValue ) )
            // InternalTraceryLanguage.g:851:2: ( ruleStartValue )
            {
            // InternalTraceryLanguage.g:851:2: ( ruleStartValue )
            // InternalTraceryLanguage.g:852:3: ruleStartValue
            {
             before(grammarAccess.getInitialJSONEndingAccess().getStartValStartValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStartValue();

            state._fsp--;

             after(grammarAccess.getInitialJSONEndingAccess().getStartValStartValueParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__InitialJSONEnding__StartValAssignment_1"


    // $ANTLR start "rule__InitialJSONEnding__ValsAssignment_2"
    // InternalTraceryLanguage.g:861:1: rule__InitialJSONEnding__ValsAssignment_2 : ( ruleNormalValue ) ;
    public final void rule__InitialJSONEnding__ValsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:865:1: ( ( ruleNormalValue ) )
            // InternalTraceryLanguage.g:866:2: ( ruleNormalValue )
            {
            // InternalTraceryLanguage.g:866:2: ( ruleNormalValue )
            // InternalTraceryLanguage.g:867:3: ruleNormalValue
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


    // $ANTLR start "rule__StartValue__ValueInnerStatementsAssignment_1"
    // InternalTraceryLanguage.g:876:1: rule__StartValue__ValueInnerStatementsAssignment_1 : ( ruleInnerStatements ) ;
    public final void rule__StartValue__ValueInnerStatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:880:1: ( ( ruleInnerStatements ) )
            // InternalTraceryLanguage.g:881:2: ( ruleInnerStatements )
            {
            // InternalTraceryLanguage.g:881:2: ( ruleInnerStatements )
            // InternalTraceryLanguage.g:882:3: ruleInnerStatements
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
    // InternalTraceryLanguage.g:891:1: rule__NormalValue__ValueInnerStatementsAssignment_2 : ( ruleInnerStatements ) ;
    public final void rule__NormalValue__ValueInnerStatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:895:1: ( ( ruleInnerStatements ) )
            // InternalTraceryLanguage.g:896:2: ( ruleInnerStatements )
            {
            // InternalTraceryLanguage.g:896:2: ( ruleInnerStatements )
            // InternalTraceryLanguage.g:897:3: ruleInnerStatements
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


    // $ANTLR start "rule__InnerStatements__ValAssignment_0"
    // InternalTraceryLanguage.g:906:1: rule__InnerStatements__ValAssignment_0 : ( RULE_STRING ) ;
    public final void rule__InnerStatements__ValAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:910:1: ( ( RULE_STRING ) )
            // InternalTraceryLanguage.g:911:2: ( RULE_STRING )
            {
            // InternalTraceryLanguage.g:911:2: ( RULE_STRING )
            // InternalTraceryLanguage.g:912:3: RULE_STRING
            {
             before(grammarAccess.getInnerStatementsAccess().getValSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInnerStatementsAccess().getValSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__InnerStatements__ValAssignment_0"


    // $ANTLR start "rule__DeclaredVariable__VarAssignment"
    // InternalTraceryLanguage.g:921:1: rule__DeclaredVariable__VarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__DeclaredVariable__VarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:925:1: ( ( ( RULE_ID ) ) )
            // InternalTraceryLanguage.g:926:2: ( ( RULE_ID ) )
            {
            // InternalTraceryLanguage.g:926:2: ( ( RULE_ID ) )
            // InternalTraceryLanguage.g:927:3: ( RULE_ID )
            {
             before(grammarAccess.getDeclaredVariableAccess().getVarInitialJSONLineCrossReference_0()); 
            // InternalTraceryLanguage.g:928:3: ( RULE_ID )
            // InternalTraceryLanguage.g:929:4: RULE_ID
            {
             before(grammarAccess.getDeclaredVariableAccess().getVarInitialJSONLineIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeclaredVariableAccess().getVarInitialJSONLineIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getDeclaredVariableAccess().getVarInitialJSONLineCrossReference_0()); 

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
    // $ANTLR end "rule__DeclaredVariable__VarAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});

}
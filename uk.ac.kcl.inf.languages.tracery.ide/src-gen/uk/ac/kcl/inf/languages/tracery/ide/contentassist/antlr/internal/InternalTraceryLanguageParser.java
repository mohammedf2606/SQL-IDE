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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'&origin&'", "':'", "'['", "']'", "','", "'&'", "'#'", "'.ed#'", "'.a#'", "'.the#'", "'.capitalise#'"
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
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

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


    // $ANTLR start "entryRuleVariableDecleration"
    // InternalTraceryLanguage.g:78:1: entryRuleVariableDecleration : ruleVariableDecleration EOF ;
    public final void entryRuleVariableDecleration() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:82:1: ( ruleVariableDecleration EOF )
            // InternalTraceryLanguage.g:83:1: ruleVariableDecleration EOF
            {
             before(grammarAccess.getVariableDeclerationRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableDecleration();

            state._fsp--;

             after(grammarAccess.getVariableDeclerationRule()); 
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
    // $ANTLR end "entryRuleVariableDecleration"


    // $ANTLR start "ruleVariableDecleration"
    // InternalTraceryLanguage.g:93:1: ruleVariableDecleration : ( ( rule__VariableDecleration__NameAssignment ) ) ;
    public final void ruleVariableDecleration() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:98:2: ( ( ( rule__VariableDecleration__NameAssignment ) ) )
            // InternalTraceryLanguage.g:99:2: ( ( rule__VariableDecleration__NameAssignment ) )
            {
            // InternalTraceryLanguage.g:99:2: ( ( rule__VariableDecleration__NameAssignment ) )
            // InternalTraceryLanguage.g:100:3: ( rule__VariableDecleration__NameAssignment )
            {
             before(grammarAccess.getVariableDeclerationAccess().getNameAssignment()); 
            // InternalTraceryLanguage.g:101:3: ( rule__VariableDecleration__NameAssignment )
            // InternalTraceryLanguage.g:101:4: rule__VariableDecleration__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__VariableDecleration__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclerationAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleVariableDecleration"


    // $ANTLR start "entryRuleInitialJSONLine"
    // InternalTraceryLanguage.g:111:1: entryRuleInitialJSONLine : ruleInitialJSONLine EOF ;
    public final void entryRuleInitialJSONLine() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:115:1: ( ruleInitialJSONLine EOF )
            // InternalTraceryLanguage.g:116:1: ruleInitialJSONLine EOF
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
    // InternalTraceryLanguage.g:126:1: ruleInitialJSONLine : ( ( rule__InitialJSONLine__Group__0 ) ) ;
    public final void ruleInitialJSONLine() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:131:2: ( ( ( rule__InitialJSONLine__Group__0 ) ) )
            // InternalTraceryLanguage.g:132:2: ( ( rule__InitialJSONLine__Group__0 ) )
            {
            // InternalTraceryLanguage.g:132:2: ( ( rule__InitialJSONLine__Group__0 ) )
            // InternalTraceryLanguage.g:133:3: ( rule__InitialJSONLine__Group__0 )
            {
             before(grammarAccess.getInitialJSONLineAccess().getGroup()); 
            // InternalTraceryLanguage.g:134:3: ( rule__InitialJSONLine__Group__0 )
            // InternalTraceryLanguage.g:134:4: rule__InitialJSONLine__Group__0
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


    // $ANTLR start "entryRuleNormalJSONLine"
    // InternalTraceryLanguage.g:144:1: entryRuleNormalJSONLine : ruleNormalJSONLine EOF ;
    public final void entryRuleNormalJSONLine() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:148:1: ( ruleNormalJSONLine EOF )
            // InternalTraceryLanguage.g:149:1: ruleNormalJSONLine EOF
            {
             before(grammarAccess.getNormalJSONLineRule()); 
            pushFollow(FOLLOW_1);
            ruleNormalJSONLine();

            state._fsp--;

             after(grammarAccess.getNormalJSONLineRule()); 
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
    // $ANTLR end "entryRuleNormalJSONLine"


    // $ANTLR start "ruleNormalJSONLine"
    // InternalTraceryLanguage.g:159:1: ruleNormalJSONLine : ( ( rule__NormalJSONLine__Group__0 ) ) ;
    public final void ruleNormalJSONLine() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:164:2: ( ( ( rule__NormalJSONLine__Group__0 ) ) )
            // InternalTraceryLanguage.g:165:2: ( ( rule__NormalJSONLine__Group__0 ) )
            {
            // InternalTraceryLanguage.g:165:2: ( ( rule__NormalJSONLine__Group__0 ) )
            // InternalTraceryLanguage.g:166:3: ( rule__NormalJSONLine__Group__0 )
            {
             before(grammarAccess.getNormalJSONLineAccess().getGroup()); 
            // InternalTraceryLanguage.g:167:3: ( rule__NormalJSONLine__Group__0 )
            // InternalTraceryLanguage.g:167:4: rule__NormalJSONLine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NormalJSONLine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNormalJSONLineAccess().getGroup()); 

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
    // $ANTLR end "ruleNormalJSONLine"


    // $ANTLR start "entryRulestartValue"
    // InternalTraceryLanguage.g:177:1: entryRulestartValue : rulestartValue EOF ;
    public final void entryRulestartValue() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:181:1: ( rulestartValue EOF )
            // InternalTraceryLanguage.g:182:1: rulestartValue EOF
            {
             before(grammarAccess.getStartValueRule()); 
            pushFollow(FOLLOW_1);
            rulestartValue();

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
    // $ANTLR end "entryRulestartValue"


    // $ANTLR start "rulestartValue"
    // InternalTraceryLanguage.g:192:1: rulestartValue : ( ( rule__StartValue__Group__0 ) ) ;
    public final void rulestartValue() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:197:2: ( ( ( rule__StartValue__Group__0 ) ) )
            // InternalTraceryLanguage.g:198:2: ( ( rule__StartValue__Group__0 ) )
            {
            // InternalTraceryLanguage.g:198:2: ( ( rule__StartValue__Group__0 ) )
            // InternalTraceryLanguage.g:199:3: ( rule__StartValue__Group__0 )
            {
             before(grammarAccess.getStartValueAccess().getGroup()); 
            // InternalTraceryLanguage.g:200:3: ( rule__StartValue__Group__0 )
            // InternalTraceryLanguage.g:200:4: rule__StartValue__Group__0
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
    // $ANTLR end "rulestartValue"


    // $ANTLR start "entryRulenormalValue"
    // InternalTraceryLanguage.g:210:1: entryRulenormalValue : rulenormalValue EOF ;
    public final void entryRulenormalValue() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:214:1: ( rulenormalValue EOF )
            // InternalTraceryLanguage.g:215:1: rulenormalValue EOF
            {
             before(grammarAccess.getNormalValueRule()); 
            pushFollow(FOLLOW_1);
            rulenormalValue();

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
    // $ANTLR end "entryRulenormalValue"


    // $ANTLR start "rulenormalValue"
    // InternalTraceryLanguage.g:225:1: rulenormalValue : ( ( rule__NormalValue__Group__0 ) ) ;
    public final void rulenormalValue() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:230:2: ( ( ( rule__NormalValue__Group__0 ) ) )
            // InternalTraceryLanguage.g:231:2: ( ( rule__NormalValue__Group__0 ) )
            {
            // InternalTraceryLanguage.g:231:2: ( ( rule__NormalValue__Group__0 ) )
            // InternalTraceryLanguage.g:232:3: ( rule__NormalValue__Group__0 )
            {
             before(grammarAccess.getNormalValueAccess().getGroup()); 
            // InternalTraceryLanguage.g:233:3: ( rule__NormalValue__Group__0 )
            // InternalTraceryLanguage.g:233:4: rule__NormalValue__Group__0
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
    // $ANTLR end "rulenormalValue"


    // $ANTLR start "entryRuleInnerStatement"
    // InternalTraceryLanguage.g:243:1: entryRuleInnerStatement : ruleInnerStatement EOF ;
    public final void entryRuleInnerStatement() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:247:1: ( ruleInnerStatement EOF )
            // InternalTraceryLanguage.g:248:1: ruleInnerStatement EOF
            {
             before(grammarAccess.getInnerStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleInnerStatement();

            state._fsp--;

             after(grammarAccess.getInnerStatementRule()); 
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
    // $ANTLR end "entryRuleInnerStatement"


    // $ANTLR start "ruleInnerStatement"
    // InternalTraceryLanguage.g:258:1: ruleInnerStatement : ( ( rule__InnerStatement__Alternatives ) ) ;
    public final void ruleInnerStatement() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:263:2: ( ( ( rule__InnerStatement__Alternatives ) ) )
            // InternalTraceryLanguage.g:264:2: ( ( rule__InnerStatement__Alternatives ) )
            {
            // InternalTraceryLanguage.g:264:2: ( ( rule__InnerStatement__Alternatives ) )
            // InternalTraceryLanguage.g:265:3: ( rule__InnerStatement__Alternatives )
            {
             before(grammarAccess.getInnerStatementAccess().getAlternatives()); 
            // InternalTraceryLanguage.g:266:3: ( rule__InnerStatement__Alternatives )
            // InternalTraceryLanguage.g:266:4: rule__InnerStatement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__InnerStatement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInnerStatementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleInnerStatement"


    // $ANTLR start "entryRuleStartingJSONExpression"
    // InternalTraceryLanguage.g:276:1: entryRuleStartingJSONExpression : ruleStartingJSONExpression EOF ;
    public final void entryRuleStartingJSONExpression() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:280:1: ( ruleStartingJSONExpression EOF )
            // InternalTraceryLanguage.g:281:1: ruleStartingJSONExpression EOF
            {
             before(grammarAccess.getStartingJSONExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleStartingJSONExpression();

            state._fsp--;

             after(grammarAccess.getStartingJSONExpressionRule()); 
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
    // $ANTLR end "entryRuleStartingJSONExpression"


    // $ANTLR start "ruleStartingJSONExpression"
    // InternalTraceryLanguage.g:291:1: ruleStartingJSONExpression : ( ( rule__StartingJSONExpression__VarAssignment ) ) ;
    public final void ruleStartingJSONExpression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:296:2: ( ( ( rule__StartingJSONExpression__VarAssignment ) ) )
            // InternalTraceryLanguage.g:297:2: ( ( rule__StartingJSONExpression__VarAssignment ) )
            {
            // InternalTraceryLanguage.g:297:2: ( ( rule__StartingJSONExpression__VarAssignment ) )
            // InternalTraceryLanguage.g:298:3: ( rule__StartingJSONExpression__VarAssignment )
            {
             before(grammarAccess.getStartingJSONExpressionAccess().getVarAssignment()); 
            // InternalTraceryLanguage.g:299:3: ( rule__StartingJSONExpression__VarAssignment )
            // InternalTraceryLanguage.g:299:4: rule__StartingJSONExpression__VarAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StartingJSONExpression__VarAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStartingJSONExpressionAccess().getVarAssignment()); 

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
    // $ANTLR end "ruleStartingJSONExpression"


    // $ANTLR start "rule__InnerStatement__Alternatives"
    // InternalTraceryLanguage.g:308:1: rule__InnerStatement__Alternatives : ( ( ( rule__InnerStatement__ValueAssignment_0 ) ) | ( ( rule__InnerStatement__Group_1__0 ) ) | ( ( rule__InnerStatement__Group_2__0 ) ) | ( ( rule__InnerStatement__Group_3__0 ) ) | ( ( rule__InnerStatement__Group_4__0 ) ) | ( ( rule__InnerStatement__Group_5__0 ) ) );
    public final void rule__InnerStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:312:1: ( ( ( rule__InnerStatement__ValueAssignment_0 ) ) | ( ( rule__InnerStatement__Group_1__0 ) ) | ( ( rule__InnerStatement__Group_2__0 ) ) | ( ( rule__InnerStatement__Group_3__0 ) ) | ( ( rule__InnerStatement__Group_4__0 ) ) | ( ( rule__InnerStatement__Group_5__0 ) ) )
            int alt1=6;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==19) ) {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 22:
                        {
                        alt1=5;
                        }
                        break;
                    case 21:
                        {
                        alt1=4;
                        }
                        break;
                    case 20:
                        {
                        alt1=3;
                        }
                        break;
                    case 23:
                        {
                        alt1=6;
                        }
                        break;
                    case 19:
                        {
                        alt1=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalTraceryLanguage.g:313:2: ( ( rule__InnerStatement__ValueAssignment_0 ) )
                    {
                    // InternalTraceryLanguage.g:313:2: ( ( rule__InnerStatement__ValueAssignment_0 ) )
                    // InternalTraceryLanguage.g:314:3: ( rule__InnerStatement__ValueAssignment_0 )
                    {
                     before(grammarAccess.getInnerStatementAccess().getValueAssignment_0()); 
                    // InternalTraceryLanguage.g:315:3: ( rule__InnerStatement__ValueAssignment_0 )
                    // InternalTraceryLanguage.g:315:4: rule__InnerStatement__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InnerStatement__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInnerStatementAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryLanguage.g:319:2: ( ( rule__InnerStatement__Group_1__0 ) )
                    {
                    // InternalTraceryLanguage.g:319:2: ( ( rule__InnerStatement__Group_1__0 ) )
                    // InternalTraceryLanguage.g:320:3: ( rule__InnerStatement__Group_1__0 )
                    {
                     before(grammarAccess.getInnerStatementAccess().getGroup_1()); 
                    // InternalTraceryLanguage.g:321:3: ( rule__InnerStatement__Group_1__0 )
                    // InternalTraceryLanguage.g:321:4: rule__InnerStatement__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InnerStatement__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInnerStatementAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryLanguage.g:325:2: ( ( rule__InnerStatement__Group_2__0 ) )
                    {
                    // InternalTraceryLanguage.g:325:2: ( ( rule__InnerStatement__Group_2__0 ) )
                    // InternalTraceryLanguage.g:326:3: ( rule__InnerStatement__Group_2__0 )
                    {
                     before(grammarAccess.getInnerStatementAccess().getGroup_2()); 
                    // InternalTraceryLanguage.g:327:3: ( rule__InnerStatement__Group_2__0 )
                    // InternalTraceryLanguage.g:327:4: rule__InnerStatement__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InnerStatement__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInnerStatementAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTraceryLanguage.g:331:2: ( ( rule__InnerStatement__Group_3__0 ) )
                    {
                    // InternalTraceryLanguage.g:331:2: ( ( rule__InnerStatement__Group_3__0 ) )
                    // InternalTraceryLanguage.g:332:3: ( rule__InnerStatement__Group_3__0 )
                    {
                     before(grammarAccess.getInnerStatementAccess().getGroup_3()); 
                    // InternalTraceryLanguage.g:333:3: ( rule__InnerStatement__Group_3__0 )
                    // InternalTraceryLanguage.g:333:4: rule__InnerStatement__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InnerStatement__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInnerStatementAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTraceryLanguage.g:337:2: ( ( rule__InnerStatement__Group_4__0 ) )
                    {
                    // InternalTraceryLanguage.g:337:2: ( ( rule__InnerStatement__Group_4__0 ) )
                    // InternalTraceryLanguage.g:338:3: ( rule__InnerStatement__Group_4__0 )
                    {
                     before(grammarAccess.getInnerStatementAccess().getGroup_4()); 
                    // InternalTraceryLanguage.g:339:3: ( rule__InnerStatement__Group_4__0 )
                    // InternalTraceryLanguage.g:339:4: rule__InnerStatement__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InnerStatement__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInnerStatementAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalTraceryLanguage.g:343:2: ( ( rule__InnerStatement__Group_5__0 ) )
                    {
                    // InternalTraceryLanguage.g:343:2: ( ( rule__InnerStatement__Group_5__0 ) )
                    // InternalTraceryLanguage.g:344:3: ( rule__InnerStatement__Group_5__0 )
                    {
                     before(grammarAccess.getInnerStatementAccess().getGroup_5()); 
                    // InternalTraceryLanguage.g:345:3: ( rule__InnerStatement__Group_5__0 )
                    // InternalTraceryLanguage.g:345:4: rule__InnerStatement__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InnerStatement__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInnerStatementAccess().getGroup_5()); 

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
    // $ANTLR end "rule__InnerStatement__Alternatives"


    // $ANTLR start "rule__TraceryProgram__Group__0"
    // InternalTraceryLanguage.g:353:1: rule__TraceryProgram__Group__0 : rule__TraceryProgram__Group__0__Impl rule__TraceryProgram__Group__1 ;
    public final void rule__TraceryProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:357:1: ( rule__TraceryProgram__Group__0__Impl rule__TraceryProgram__Group__1 )
            // InternalTraceryLanguage.g:358:2: rule__TraceryProgram__Group__0__Impl rule__TraceryProgram__Group__1
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
    // InternalTraceryLanguage.g:365:1: rule__TraceryProgram__Group__0__Impl : ( '{' ) ;
    public final void rule__TraceryProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:369:1: ( ( '{' ) )
            // InternalTraceryLanguage.g:370:1: ( '{' )
            {
            // InternalTraceryLanguage.g:370:1: ( '{' )
            // InternalTraceryLanguage.g:371:2: '{'
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
    // InternalTraceryLanguage.g:380:1: rule__TraceryProgram__Group__1 : rule__TraceryProgram__Group__1__Impl rule__TraceryProgram__Group__2 ;
    public final void rule__TraceryProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:384:1: ( rule__TraceryProgram__Group__1__Impl rule__TraceryProgram__Group__2 )
            // InternalTraceryLanguage.g:385:2: rule__TraceryProgram__Group__1__Impl rule__TraceryProgram__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalTraceryLanguage.g:392:1: rule__TraceryProgram__Group__1__Impl : ( () ) ;
    public final void rule__TraceryProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:396:1: ( ( () ) )
            // InternalTraceryLanguage.g:397:1: ( () )
            {
            // InternalTraceryLanguage.g:397:1: ( () )
            // InternalTraceryLanguage.g:398:2: ()
            {
             before(grammarAccess.getTraceryProgramAccess().getTraceryProgramAction_1()); 
            // InternalTraceryLanguage.g:399:2: ()
            // InternalTraceryLanguage.g:399:3: 
            {
            }

             after(grammarAccess.getTraceryProgramAccess().getTraceryProgramAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraceryProgram__Group__1__Impl"


    // $ANTLR start "rule__TraceryProgram__Group__2"
    // InternalTraceryLanguage.g:407:1: rule__TraceryProgram__Group__2 : rule__TraceryProgram__Group__2__Impl rule__TraceryProgram__Group__3 ;
    public final void rule__TraceryProgram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:411:1: ( rule__TraceryProgram__Group__2__Impl rule__TraceryProgram__Group__3 )
            // InternalTraceryLanguage.g:412:2: rule__TraceryProgram__Group__2__Impl rule__TraceryProgram__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__TraceryProgram__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TraceryProgram__Group__3();

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
    // InternalTraceryLanguage.g:419:1: rule__TraceryProgram__Group__2__Impl : ( ( rule__TraceryProgram__InitialStatementAssignment_2 ) ) ;
    public final void rule__TraceryProgram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:423:1: ( ( ( rule__TraceryProgram__InitialStatementAssignment_2 ) ) )
            // InternalTraceryLanguage.g:424:1: ( ( rule__TraceryProgram__InitialStatementAssignment_2 ) )
            {
            // InternalTraceryLanguage.g:424:1: ( ( rule__TraceryProgram__InitialStatementAssignment_2 ) )
            // InternalTraceryLanguage.g:425:2: ( rule__TraceryProgram__InitialStatementAssignment_2 )
            {
             before(grammarAccess.getTraceryProgramAccess().getInitialStatementAssignment_2()); 
            // InternalTraceryLanguage.g:426:2: ( rule__TraceryProgram__InitialStatementAssignment_2 )
            // InternalTraceryLanguage.g:426:3: rule__TraceryProgram__InitialStatementAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TraceryProgram__InitialStatementAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTraceryProgramAccess().getInitialStatementAssignment_2()); 

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


    // $ANTLR start "rule__TraceryProgram__Group__3"
    // InternalTraceryLanguage.g:434:1: rule__TraceryProgram__Group__3 : rule__TraceryProgram__Group__3__Impl rule__TraceryProgram__Group__4 ;
    public final void rule__TraceryProgram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:438:1: ( rule__TraceryProgram__Group__3__Impl rule__TraceryProgram__Group__4 )
            // InternalTraceryLanguage.g:439:2: rule__TraceryProgram__Group__3__Impl rule__TraceryProgram__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__TraceryProgram__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TraceryProgram__Group__4();

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
    // $ANTLR end "rule__TraceryProgram__Group__3"


    // $ANTLR start "rule__TraceryProgram__Group__3__Impl"
    // InternalTraceryLanguage.g:446:1: rule__TraceryProgram__Group__3__Impl : ( ( rule__TraceryProgram__StatementsAssignment_3 )* ) ;
    public final void rule__TraceryProgram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:450:1: ( ( ( rule__TraceryProgram__StatementsAssignment_3 )* ) )
            // InternalTraceryLanguage.g:451:1: ( ( rule__TraceryProgram__StatementsAssignment_3 )* )
            {
            // InternalTraceryLanguage.g:451:1: ( ( rule__TraceryProgram__StatementsAssignment_3 )* )
            // InternalTraceryLanguage.g:452:2: ( rule__TraceryProgram__StatementsAssignment_3 )*
            {
             before(grammarAccess.getTraceryProgramAccess().getStatementsAssignment_3()); 
            // InternalTraceryLanguage.g:453:2: ( rule__TraceryProgram__StatementsAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTraceryLanguage.g:453:3: rule__TraceryProgram__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__TraceryProgram__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getTraceryProgramAccess().getStatementsAssignment_3()); 

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
    // $ANTLR end "rule__TraceryProgram__Group__3__Impl"


    // $ANTLR start "rule__TraceryProgram__Group__4"
    // InternalTraceryLanguage.g:461:1: rule__TraceryProgram__Group__4 : rule__TraceryProgram__Group__4__Impl ;
    public final void rule__TraceryProgram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:465:1: ( rule__TraceryProgram__Group__4__Impl )
            // InternalTraceryLanguage.g:466:2: rule__TraceryProgram__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TraceryProgram__Group__4__Impl();

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
    // $ANTLR end "rule__TraceryProgram__Group__4"


    // $ANTLR start "rule__TraceryProgram__Group__4__Impl"
    // InternalTraceryLanguage.g:472:1: rule__TraceryProgram__Group__4__Impl : ( '}' ) ;
    public final void rule__TraceryProgram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:476:1: ( ( '}' ) )
            // InternalTraceryLanguage.g:477:1: ( '}' )
            {
            // InternalTraceryLanguage.g:477:1: ( '}' )
            // InternalTraceryLanguage.g:478:2: '}'
            {
             before(grammarAccess.getTraceryProgramAccess().getRightCurlyBracketKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTraceryProgramAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__TraceryProgram__Group__4__Impl"


    // $ANTLR start "rule__InitialJSONLine__Group__0"
    // InternalTraceryLanguage.g:488:1: rule__InitialJSONLine__Group__0 : rule__InitialJSONLine__Group__0__Impl rule__InitialJSONLine__Group__1 ;
    public final void rule__InitialJSONLine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:492:1: ( rule__InitialJSONLine__Group__0__Impl rule__InitialJSONLine__Group__1 )
            // InternalTraceryLanguage.g:493:2: rule__InitialJSONLine__Group__0__Impl rule__InitialJSONLine__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalTraceryLanguage.g:500:1: rule__InitialJSONLine__Group__0__Impl : ( '&origin&' ) ;
    public final void rule__InitialJSONLine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:504:1: ( ( '&origin&' ) )
            // InternalTraceryLanguage.g:505:1: ( '&origin&' )
            {
            // InternalTraceryLanguage.g:505:1: ( '&origin&' )
            // InternalTraceryLanguage.g:506:2: '&origin&'
            {
             before(grammarAccess.getInitialJSONLineAccess().getOriginKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getInitialJSONLineAccess().getOriginKeyword_0()); 

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
    // InternalTraceryLanguage.g:515:1: rule__InitialJSONLine__Group__1 : rule__InitialJSONLine__Group__1__Impl rule__InitialJSONLine__Group__2 ;
    public final void rule__InitialJSONLine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:519:1: ( rule__InitialJSONLine__Group__1__Impl rule__InitialJSONLine__Group__2 )
            // InternalTraceryLanguage.g:520:2: rule__InitialJSONLine__Group__1__Impl rule__InitialJSONLine__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalTraceryLanguage.g:527:1: rule__InitialJSONLine__Group__1__Impl : ( ':' ) ;
    public final void rule__InitialJSONLine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:531:1: ( ( ':' ) )
            // InternalTraceryLanguage.g:532:1: ( ':' )
            {
            // InternalTraceryLanguage.g:532:1: ( ':' )
            // InternalTraceryLanguage.g:533:2: ':'
            {
             before(grammarAccess.getInitialJSONLineAccess().getColonKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getInitialJSONLineAccess().getColonKeyword_1()); 

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
    // InternalTraceryLanguage.g:542:1: rule__InitialJSONLine__Group__2 : rule__InitialJSONLine__Group__2__Impl rule__InitialJSONLine__Group__3 ;
    public final void rule__InitialJSONLine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:546:1: ( rule__InitialJSONLine__Group__2__Impl rule__InitialJSONLine__Group__3 )
            // InternalTraceryLanguage.g:547:2: rule__InitialJSONLine__Group__2__Impl rule__InitialJSONLine__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalTraceryLanguage.g:554:1: rule__InitialJSONLine__Group__2__Impl : ( '[' ) ;
    public final void rule__InitialJSONLine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:558:1: ( ( '[' ) )
            // InternalTraceryLanguage.g:559:1: ( '[' )
            {
            // InternalTraceryLanguage.g:559:1: ( '[' )
            // InternalTraceryLanguage.g:560:2: '['
            {
             before(grammarAccess.getInitialJSONLineAccess().getLeftSquareBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getInitialJSONLineAccess().getLeftSquareBracketKeyword_2()); 

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
    // InternalTraceryLanguage.g:569:1: rule__InitialJSONLine__Group__3 : rule__InitialJSONLine__Group__3__Impl rule__InitialJSONLine__Group__4 ;
    public final void rule__InitialJSONLine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:573:1: ( rule__InitialJSONLine__Group__3__Impl rule__InitialJSONLine__Group__4 )
            // InternalTraceryLanguage.g:574:2: rule__InitialJSONLine__Group__3__Impl rule__InitialJSONLine__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalTraceryLanguage.g:581:1: rule__InitialJSONLine__Group__3__Impl : ( ( rule__InitialJSONLine__StartValAssignment_3 ) ) ;
    public final void rule__InitialJSONLine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:585:1: ( ( ( rule__InitialJSONLine__StartValAssignment_3 ) ) )
            // InternalTraceryLanguage.g:586:1: ( ( rule__InitialJSONLine__StartValAssignment_3 ) )
            {
            // InternalTraceryLanguage.g:586:1: ( ( rule__InitialJSONLine__StartValAssignment_3 ) )
            // InternalTraceryLanguage.g:587:2: ( rule__InitialJSONLine__StartValAssignment_3 )
            {
             before(grammarAccess.getInitialJSONLineAccess().getStartValAssignment_3()); 
            // InternalTraceryLanguage.g:588:2: ( rule__InitialJSONLine__StartValAssignment_3 )
            // InternalTraceryLanguage.g:588:3: rule__InitialJSONLine__StartValAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__InitialJSONLine__StartValAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInitialJSONLineAccess().getStartValAssignment_3()); 

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
    // InternalTraceryLanguage.g:596:1: rule__InitialJSONLine__Group__4 : rule__InitialJSONLine__Group__4__Impl rule__InitialJSONLine__Group__5 ;
    public final void rule__InitialJSONLine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:600:1: ( rule__InitialJSONLine__Group__4__Impl rule__InitialJSONLine__Group__5 )
            // InternalTraceryLanguage.g:601:2: rule__InitialJSONLine__Group__4__Impl rule__InitialJSONLine__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__InitialJSONLine__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialJSONLine__Group__5();

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
    // InternalTraceryLanguage.g:608:1: rule__InitialJSONLine__Group__4__Impl : ( ( rule__InitialJSONLine__ValsAssignment_4 )* ) ;
    public final void rule__InitialJSONLine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:612:1: ( ( ( rule__InitialJSONLine__ValsAssignment_4 )* ) )
            // InternalTraceryLanguage.g:613:1: ( ( rule__InitialJSONLine__ValsAssignment_4 )* )
            {
            // InternalTraceryLanguage.g:613:1: ( ( rule__InitialJSONLine__ValsAssignment_4 )* )
            // InternalTraceryLanguage.g:614:2: ( rule__InitialJSONLine__ValsAssignment_4 )*
            {
             before(grammarAccess.getInitialJSONLineAccess().getValsAssignment_4()); 
            // InternalTraceryLanguage.g:615:2: ( rule__InitialJSONLine__ValsAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTraceryLanguage.g:615:3: rule__InitialJSONLine__ValsAssignment_4
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__InitialJSONLine__ValsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getInitialJSONLineAccess().getValsAssignment_4()); 

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


    // $ANTLR start "rule__InitialJSONLine__Group__5"
    // InternalTraceryLanguage.g:623:1: rule__InitialJSONLine__Group__5 : rule__InitialJSONLine__Group__5__Impl ;
    public final void rule__InitialJSONLine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:627:1: ( rule__InitialJSONLine__Group__5__Impl )
            // InternalTraceryLanguage.g:628:2: rule__InitialJSONLine__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InitialJSONLine__Group__5__Impl();

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
    // $ANTLR end "rule__InitialJSONLine__Group__5"


    // $ANTLR start "rule__InitialJSONLine__Group__5__Impl"
    // InternalTraceryLanguage.g:634:1: rule__InitialJSONLine__Group__5__Impl : ( ']' ) ;
    public final void rule__InitialJSONLine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:638:1: ( ( ']' ) )
            // InternalTraceryLanguage.g:639:1: ( ']' )
            {
            // InternalTraceryLanguage.g:639:1: ( ']' )
            // InternalTraceryLanguage.g:640:2: ']'
            {
             before(grammarAccess.getInitialJSONLineAccess().getRightSquareBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getInitialJSONLineAccess().getRightSquareBracketKeyword_5()); 

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
    // $ANTLR end "rule__InitialJSONLine__Group__5__Impl"


    // $ANTLR start "rule__NormalJSONLine__Group__0"
    // InternalTraceryLanguage.g:650:1: rule__NormalJSONLine__Group__0 : rule__NormalJSONLine__Group__0__Impl rule__NormalJSONLine__Group__1 ;
    public final void rule__NormalJSONLine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:654:1: ( rule__NormalJSONLine__Group__0__Impl rule__NormalJSONLine__Group__1 )
            // InternalTraceryLanguage.g:655:2: rule__NormalJSONLine__Group__0__Impl rule__NormalJSONLine__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__NormalJSONLine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NormalJSONLine__Group__1();

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
    // $ANTLR end "rule__NormalJSONLine__Group__0"


    // $ANTLR start "rule__NormalJSONLine__Group__0__Impl"
    // InternalTraceryLanguage.g:662:1: rule__NormalJSONLine__Group__0__Impl : ( ',' ) ;
    public final void rule__NormalJSONLine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:666:1: ( ( ',' ) )
            // InternalTraceryLanguage.g:667:1: ( ',' )
            {
            // InternalTraceryLanguage.g:667:1: ( ',' )
            // InternalTraceryLanguage.g:668:2: ','
            {
             before(grammarAccess.getNormalJSONLineAccess().getCommaKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getNormalJSONLineAccess().getCommaKeyword_0()); 

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
    // $ANTLR end "rule__NormalJSONLine__Group__0__Impl"


    // $ANTLR start "rule__NormalJSONLine__Group__1"
    // InternalTraceryLanguage.g:677:1: rule__NormalJSONLine__Group__1 : rule__NormalJSONLine__Group__1__Impl rule__NormalJSONLine__Group__2 ;
    public final void rule__NormalJSONLine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:681:1: ( rule__NormalJSONLine__Group__1__Impl rule__NormalJSONLine__Group__2 )
            // InternalTraceryLanguage.g:682:2: rule__NormalJSONLine__Group__1__Impl rule__NormalJSONLine__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__NormalJSONLine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NormalJSONLine__Group__2();

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
    // $ANTLR end "rule__NormalJSONLine__Group__1"


    // $ANTLR start "rule__NormalJSONLine__Group__1__Impl"
    // InternalTraceryLanguage.g:689:1: rule__NormalJSONLine__Group__1__Impl : ( '&' ) ;
    public final void rule__NormalJSONLine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:693:1: ( ( '&' ) )
            // InternalTraceryLanguage.g:694:1: ( '&' )
            {
            // InternalTraceryLanguage.g:694:1: ( '&' )
            // InternalTraceryLanguage.g:695:2: '&'
            {
             before(grammarAccess.getNormalJSONLineAccess().getAmpersandKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getNormalJSONLineAccess().getAmpersandKeyword_1()); 

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
    // $ANTLR end "rule__NormalJSONLine__Group__1__Impl"


    // $ANTLR start "rule__NormalJSONLine__Group__2"
    // InternalTraceryLanguage.g:704:1: rule__NormalJSONLine__Group__2 : rule__NormalJSONLine__Group__2__Impl rule__NormalJSONLine__Group__3 ;
    public final void rule__NormalJSONLine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:708:1: ( rule__NormalJSONLine__Group__2__Impl rule__NormalJSONLine__Group__3 )
            // InternalTraceryLanguage.g:709:2: rule__NormalJSONLine__Group__2__Impl rule__NormalJSONLine__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__NormalJSONLine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NormalJSONLine__Group__3();

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
    // $ANTLR end "rule__NormalJSONLine__Group__2"


    // $ANTLR start "rule__NormalJSONLine__Group__2__Impl"
    // InternalTraceryLanguage.g:716:1: rule__NormalJSONLine__Group__2__Impl : ( ruleStartingJSONExpression ) ;
    public final void rule__NormalJSONLine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:720:1: ( ( ruleStartingJSONExpression ) )
            // InternalTraceryLanguage.g:721:1: ( ruleStartingJSONExpression )
            {
            // InternalTraceryLanguage.g:721:1: ( ruleStartingJSONExpression )
            // InternalTraceryLanguage.g:722:2: ruleStartingJSONExpression
            {
             before(grammarAccess.getNormalJSONLineAccess().getStartingJSONExpressionParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleStartingJSONExpression();

            state._fsp--;

             after(grammarAccess.getNormalJSONLineAccess().getStartingJSONExpressionParserRuleCall_2()); 

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
    // $ANTLR end "rule__NormalJSONLine__Group__2__Impl"


    // $ANTLR start "rule__NormalJSONLine__Group__3"
    // InternalTraceryLanguage.g:731:1: rule__NormalJSONLine__Group__3 : rule__NormalJSONLine__Group__3__Impl rule__NormalJSONLine__Group__4 ;
    public final void rule__NormalJSONLine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:735:1: ( rule__NormalJSONLine__Group__3__Impl rule__NormalJSONLine__Group__4 )
            // InternalTraceryLanguage.g:736:2: rule__NormalJSONLine__Group__3__Impl rule__NormalJSONLine__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__NormalJSONLine__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NormalJSONLine__Group__4();

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
    // $ANTLR end "rule__NormalJSONLine__Group__3"


    // $ANTLR start "rule__NormalJSONLine__Group__3__Impl"
    // InternalTraceryLanguage.g:743:1: rule__NormalJSONLine__Group__3__Impl : ( '&' ) ;
    public final void rule__NormalJSONLine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:747:1: ( ( '&' ) )
            // InternalTraceryLanguage.g:748:1: ( '&' )
            {
            // InternalTraceryLanguage.g:748:1: ( '&' )
            // InternalTraceryLanguage.g:749:2: '&'
            {
             before(grammarAccess.getNormalJSONLineAccess().getAmpersandKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getNormalJSONLineAccess().getAmpersandKeyword_3()); 

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
    // $ANTLR end "rule__NormalJSONLine__Group__3__Impl"


    // $ANTLR start "rule__NormalJSONLine__Group__4"
    // InternalTraceryLanguage.g:758:1: rule__NormalJSONLine__Group__4 : rule__NormalJSONLine__Group__4__Impl rule__NormalJSONLine__Group__5 ;
    public final void rule__NormalJSONLine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:762:1: ( rule__NormalJSONLine__Group__4__Impl rule__NormalJSONLine__Group__5 )
            // InternalTraceryLanguage.g:763:2: rule__NormalJSONLine__Group__4__Impl rule__NormalJSONLine__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__NormalJSONLine__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NormalJSONLine__Group__5();

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
    // $ANTLR end "rule__NormalJSONLine__Group__4"


    // $ANTLR start "rule__NormalJSONLine__Group__4__Impl"
    // InternalTraceryLanguage.g:770:1: rule__NormalJSONLine__Group__4__Impl : ( ':' ) ;
    public final void rule__NormalJSONLine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:774:1: ( ( ':' ) )
            // InternalTraceryLanguage.g:775:1: ( ':' )
            {
            // InternalTraceryLanguage.g:775:1: ( ':' )
            // InternalTraceryLanguage.g:776:2: ':'
            {
             before(grammarAccess.getNormalJSONLineAccess().getColonKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getNormalJSONLineAccess().getColonKeyword_4()); 

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
    // $ANTLR end "rule__NormalJSONLine__Group__4__Impl"


    // $ANTLR start "rule__NormalJSONLine__Group__5"
    // InternalTraceryLanguage.g:785:1: rule__NormalJSONLine__Group__5 : rule__NormalJSONLine__Group__5__Impl rule__NormalJSONLine__Group__6 ;
    public final void rule__NormalJSONLine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:789:1: ( rule__NormalJSONLine__Group__5__Impl rule__NormalJSONLine__Group__6 )
            // InternalTraceryLanguage.g:790:2: rule__NormalJSONLine__Group__5__Impl rule__NormalJSONLine__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__NormalJSONLine__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NormalJSONLine__Group__6();

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
    // $ANTLR end "rule__NormalJSONLine__Group__5"


    // $ANTLR start "rule__NormalJSONLine__Group__5__Impl"
    // InternalTraceryLanguage.g:797:1: rule__NormalJSONLine__Group__5__Impl : ( '[' ) ;
    public final void rule__NormalJSONLine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:801:1: ( ( '[' ) )
            // InternalTraceryLanguage.g:802:1: ( '[' )
            {
            // InternalTraceryLanguage.g:802:1: ( '[' )
            // InternalTraceryLanguage.g:803:2: '['
            {
             before(grammarAccess.getNormalJSONLineAccess().getLeftSquareBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getNormalJSONLineAccess().getLeftSquareBracketKeyword_5()); 

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
    // $ANTLR end "rule__NormalJSONLine__Group__5__Impl"


    // $ANTLR start "rule__NormalJSONLine__Group__6"
    // InternalTraceryLanguage.g:812:1: rule__NormalJSONLine__Group__6 : rule__NormalJSONLine__Group__6__Impl rule__NormalJSONLine__Group__7 ;
    public final void rule__NormalJSONLine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:816:1: ( rule__NormalJSONLine__Group__6__Impl rule__NormalJSONLine__Group__7 )
            // InternalTraceryLanguage.g:817:2: rule__NormalJSONLine__Group__6__Impl rule__NormalJSONLine__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__NormalJSONLine__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NormalJSONLine__Group__7();

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
    // $ANTLR end "rule__NormalJSONLine__Group__6"


    // $ANTLR start "rule__NormalJSONLine__Group__6__Impl"
    // InternalTraceryLanguage.g:824:1: rule__NormalJSONLine__Group__6__Impl : ( ( rule__NormalJSONLine__StartValAssignment_6 ) ) ;
    public final void rule__NormalJSONLine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:828:1: ( ( ( rule__NormalJSONLine__StartValAssignment_6 ) ) )
            // InternalTraceryLanguage.g:829:1: ( ( rule__NormalJSONLine__StartValAssignment_6 ) )
            {
            // InternalTraceryLanguage.g:829:1: ( ( rule__NormalJSONLine__StartValAssignment_6 ) )
            // InternalTraceryLanguage.g:830:2: ( rule__NormalJSONLine__StartValAssignment_6 )
            {
             before(grammarAccess.getNormalJSONLineAccess().getStartValAssignment_6()); 
            // InternalTraceryLanguage.g:831:2: ( rule__NormalJSONLine__StartValAssignment_6 )
            // InternalTraceryLanguage.g:831:3: rule__NormalJSONLine__StartValAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__NormalJSONLine__StartValAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getNormalJSONLineAccess().getStartValAssignment_6()); 

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
    // $ANTLR end "rule__NormalJSONLine__Group__6__Impl"


    // $ANTLR start "rule__NormalJSONLine__Group__7"
    // InternalTraceryLanguage.g:839:1: rule__NormalJSONLine__Group__7 : rule__NormalJSONLine__Group__7__Impl rule__NormalJSONLine__Group__8 ;
    public final void rule__NormalJSONLine__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:843:1: ( rule__NormalJSONLine__Group__7__Impl rule__NormalJSONLine__Group__8 )
            // InternalTraceryLanguage.g:844:2: rule__NormalJSONLine__Group__7__Impl rule__NormalJSONLine__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__NormalJSONLine__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NormalJSONLine__Group__8();

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
    // $ANTLR end "rule__NormalJSONLine__Group__7"


    // $ANTLR start "rule__NormalJSONLine__Group__7__Impl"
    // InternalTraceryLanguage.g:851:1: rule__NormalJSONLine__Group__7__Impl : ( ( rule__NormalJSONLine__ValsAssignment_7 )* ) ;
    public final void rule__NormalJSONLine__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:855:1: ( ( ( rule__NormalJSONLine__ValsAssignment_7 )* ) )
            // InternalTraceryLanguage.g:856:1: ( ( rule__NormalJSONLine__ValsAssignment_7 )* )
            {
            // InternalTraceryLanguage.g:856:1: ( ( rule__NormalJSONLine__ValsAssignment_7 )* )
            // InternalTraceryLanguage.g:857:2: ( rule__NormalJSONLine__ValsAssignment_7 )*
            {
             before(grammarAccess.getNormalJSONLineAccess().getValsAssignment_7()); 
            // InternalTraceryLanguage.g:858:2: ( rule__NormalJSONLine__ValsAssignment_7 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTraceryLanguage.g:858:3: rule__NormalJSONLine__ValsAssignment_7
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__NormalJSONLine__ValsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getNormalJSONLineAccess().getValsAssignment_7()); 

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
    // $ANTLR end "rule__NormalJSONLine__Group__7__Impl"


    // $ANTLR start "rule__NormalJSONLine__Group__8"
    // InternalTraceryLanguage.g:866:1: rule__NormalJSONLine__Group__8 : rule__NormalJSONLine__Group__8__Impl ;
    public final void rule__NormalJSONLine__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:870:1: ( rule__NormalJSONLine__Group__8__Impl )
            // InternalTraceryLanguage.g:871:2: rule__NormalJSONLine__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NormalJSONLine__Group__8__Impl();

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
    // $ANTLR end "rule__NormalJSONLine__Group__8"


    // $ANTLR start "rule__NormalJSONLine__Group__8__Impl"
    // InternalTraceryLanguage.g:877:1: rule__NormalJSONLine__Group__8__Impl : ( ']' ) ;
    public final void rule__NormalJSONLine__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:881:1: ( ( ']' ) )
            // InternalTraceryLanguage.g:882:1: ( ']' )
            {
            // InternalTraceryLanguage.g:882:1: ( ']' )
            // InternalTraceryLanguage.g:883:2: ']'
            {
             before(grammarAccess.getNormalJSONLineAccess().getRightSquareBracketKeyword_8()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getNormalJSONLineAccess().getRightSquareBracketKeyword_8()); 

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
    // $ANTLR end "rule__NormalJSONLine__Group__8__Impl"


    // $ANTLR start "rule__StartValue__Group__0"
    // InternalTraceryLanguage.g:893:1: rule__StartValue__Group__0 : rule__StartValue__Group__0__Impl rule__StartValue__Group__1 ;
    public final void rule__StartValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:897:1: ( rule__StartValue__Group__0__Impl rule__StartValue__Group__1 )
            // InternalTraceryLanguage.g:898:2: rule__StartValue__Group__0__Impl rule__StartValue__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalTraceryLanguage.g:905:1: rule__StartValue__Group__0__Impl : ( () ) ;
    public final void rule__StartValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:909:1: ( ( () ) )
            // InternalTraceryLanguage.g:910:1: ( () )
            {
            // InternalTraceryLanguage.g:910:1: ( () )
            // InternalTraceryLanguage.g:911:2: ()
            {
             before(grammarAccess.getStartValueAccess().getStartValueAction_0()); 
            // InternalTraceryLanguage.g:912:2: ()
            // InternalTraceryLanguage.g:912:3: 
            {
            }

             after(grammarAccess.getStartValueAccess().getStartValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartValue__Group__0__Impl"


    // $ANTLR start "rule__StartValue__Group__1"
    // InternalTraceryLanguage.g:920:1: rule__StartValue__Group__1 : rule__StartValue__Group__1__Impl rule__StartValue__Group__2 ;
    public final void rule__StartValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:924:1: ( rule__StartValue__Group__1__Impl rule__StartValue__Group__2 )
            // InternalTraceryLanguage.g:925:2: rule__StartValue__Group__1__Impl rule__StartValue__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalTraceryLanguage.g:932:1: rule__StartValue__Group__1__Impl : ( '&' ) ;
    public final void rule__StartValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:936:1: ( ( '&' ) )
            // InternalTraceryLanguage.g:937:1: ( '&' )
            {
            // InternalTraceryLanguage.g:937:1: ( '&' )
            // InternalTraceryLanguage.g:938:2: '&'
            {
             before(grammarAccess.getStartValueAccess().getAmpersandKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getStartValueAccess().getAmpersandKeyword_1()); 

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
    // InternalTraceryLanguage.g:947:1: rule__StartValue__Group__2 : rule__StartValue__Group__2__Impl rule__StartValue__Group__3 ;
    public final void rule__StartValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:951:1: ( rule__StartValue__Group__2__Impl rule__StartValue__Group__3 )
            // InternalTraceryLanguage.g:952:2: rule__StartValue__Group__2__Impl rule__StartValue__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__StartValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartValue__Group__3();

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
    // InternalTraceryLanguage.g:959:1: rule__StartValue__Group__2__Impl : ( ( rule__StartValue__ValueAssignment_2 )* ) ;
    public final void rule__StartValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:963:1: ( ( ( rule__StartValue__ValueAssignment_2 )* ) )
            // InternalTraceryLanguage.g:964:1: ( ( rule__StartValue__ValueAssignment_2 )* )
            {
            // InternalTraceryLanguage.g:964:1: ( ( rule__StartValue__ValueAssignment_2 )* )
            // InternalTraceryLanguage.g:965:2: ( rule__StartValue__ValueAssignment_2 )*
            {
             before(grammarAccess.getStartValueAccess().getValueAssignment_2()); 
            // InternalTraceryLanguage.g:966:2: ( rule__StartValue__ValueAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STRING||LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTraceryLanguage.g:966:3: rule__StartValue__ValueAssignment_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__StartValue__ValueAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getStartValueAccess().getValueAssignment_2()); 

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


    // $ANTLR start "rule__StartValue__Group__3"
    // InternalTraceryLanguage.g:974:1: rule__StartValue__Group__3 : rule__StartValue__Group__3__Impl ;
    public final void rule__StartValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:978:1: ( rule__StartValue__Group__3__Impl )
            // InternalTraceryLanguage.g:979:2: rule__StartValue__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StartValue__Group__3__Impl();

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
    // $ANTLR end "rule__StartValue__Group__3"


    // $ANTLR start "rule__StartValue__Group__3__Impl"
    // InternalTraceryLanguage.g:985:1: rule__StartValue__Group__3__Impl : ( '&' ) ;
    public final void rule__StartValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:989:1: ( ( '&' ) )
            // InternalTraceryLanguage.g:990:1: ( '&' )
            {
            // InternalTraceryLanguage.g:990:1: ( '&' )
            // InternalTraceryLanguage.g:991:2: '&'
            {
             before(grammarAccess.getStartValueAccess().getAmpersandKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getStartValueAccess().getAmpersandKeyword_3()); 

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
    // $ANTLR end "rule__StartValue__Group__3__Impl"


    // $ANTLR start "rule__NormalValue__Group__0"
    // InternalTraceryLanguage.g:1001:1: rule__NormalValue__Group__0 : rule__NormalValue__Group__0__Impl rule__NormalValue__Group__1 ;
    public final void rule__NormalValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1005:1: ( rule__NormalValue__Group__0__Impl rule__NormalValue__Group__1 )
            // InternalTraceryLanguage.g:1006:2: rule__NormalValue__Group__0__Impl rule__NormalValue__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalTraceryLanguage.g:1013:1: rule__NormalValue__Group__0__Impl : ( () ) ;
    public final void rule__NormalValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1017:1: ( ( () ) )
            // InternalTraceryLanguage.g:1018:1: ( () )
            {
            // InternalTraceryLanguage.g:1018:1: ( () )
            // InternalTraceryLanguage.g:1019:2: ()
            {
             before(grammarAccess.getNormalValueAccess().getNormalValueAction_0()); 
            // InternalTraceryLanguage.g:1020:2: ()
            // InternalTraceryLanguage.g:1020:3: 
            {
            }

             after(grammarAccess.getNormalValueAccess().getNormalValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalValue__Group__0__Impl"


    // $ANTLR start "rule__NormalValue__Group__1"
    // InternalTraceryLanguage.g:1028:1: rule__NormalValue__Group__1 : rule__NormalValue__Group__1__Impl rule__NormalValue__Group__2 ;
    public final void rule__NormalValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1032:1: ( rule__NormalValue__Group__1__Impl rule__NormalValue__Group__2 )
            // InternalTraceryLanguage.g:1033:2: rule__NormalValue__Group__1__Impl rule__NormalValue__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalTraceryLanguage.g:1040:1: rule__NormalValue__Group__1__Impl : ( ',' ) ;
    public final void rule__NormalValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1044:1: ( ( ',' ) )
            // InternalTraceryLanguage.g:1045:1: ( ',' )
            {
            // InternalTraceryLanguage.g:1045:1: ( ',' )
            // InternalTraceryLanguage.g:1046:2: ','
            {
             before(grammarAccess.getNormalValueAccess().getCommaKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getNormalValueAccess().getCommaKeyword_1()); 

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
    // InternalTraceryLanguage.g:1055:1: rule__NormalValue__Group__2 : rule__NormalValue__Group__2__Impl rule__NormalValue__Group__3 ;
    public final void rule__NormalValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1059:1: ( rule__NormalValue__Group__2__Impl rule__NormalValue__Group__3 )
            // InternalTraceryLanguage.g:1060:2: rule__NormalValue__Group__2__Impl rule__NormalValue__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalTraceryLanguage.g:1067:1: rule__NormalValue__Group__2__Impl : ( '&' ) ;
    public final void rule__NormalValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1071:1: ( ( '&' ) )
            // InternalTraceryLanguage.g:1072:1: ( '&' )
            {
            // InternalTraceryLanguage.g:1072:1: ( '&' )
            // InternalTraceryLanguage.g:1073:2: '&'
            {
             before(grammarAccess.getNormalValueAccess().getAmpersandKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getNormalValueAccess().getAmpersandKeyword_2()); 

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
    // InternalTraceryLanguage.g:1082:1: rule__NormalValue__Group__3 : rule__NormalValue__Group__3__Impl rule__NormalValue__Group__4 ;
    public final void rule__NormalValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1086:1: ( rule__NormalValue__Group__3__Impl rule__NormalValue__Group__4 )
            // InternalTraceryLanguage.g:1087:2: rule__NormalValue__Group__3__Impl rule__NormalValue__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__NormalValue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NormalValue__Group__4();

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
    // InternalTraceryLanguage.g:1094:1: rule__NormalValue__Group__3__Impl : ( ( rule__NormalValue__ValueAssignment_3 )* ) ;
    public final void rule__NormalValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1098:1: ( ( ( rule__NormalValue__ValueAssignment_3 )* ) )
            // InternalTraceryLanguage.g:1099:1: ( ( rule__NormalValue__ValueAssignment_3 )* )
            {
            // InternalTraceryLanguage.g:1099:1: ( ( rule__NormalValue__ValueAssignment_3 )* )
            // InternalTraceryLanguage.g:1100:2: ( rule__NormalValue__ValueAssignment_3 )*
            {
             before(grammarAccess.getNormalValueAccess().getValueAssignment_3()); 
            // InternalTraceryLanguage.g:1101:2: ( rule__NormalValue__ValueAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_STRING||LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTraceryLanguage.g:1101:3: rule__NormalValue__ValueAssignment_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__NormalValue__ValueAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getNormalValueAccess().getValueAssignment_3()); 

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


    // $ANTLR start "rule__NormalValue__Group__4"
    // InternalTraceryLanguage.g:1109:1: rule__NormalValue__Group__4 : rule__NormalValue__Group__4__Impl ;
    public final void rule__NormalValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1113:1: ( rule__NormalValue__Group__4__Impl )
            // InternalTraceryLanguage.g:1114:2: rule__NormalValue__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NormalValue__Group__4__Impl();

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
    // $ANTLR end "rule__NormalValue__Group__4"


    // $ANTLR start "rule__NormalValue__Group__4__Impl"
    // InternalTraceryLanguage.g:1120:1: rule__NormalValue__Group__4__Impl : ( '&' ) ;
    public final void rule__NormalValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1124:1: ( ( '&' ) )
            // InternalTraceryLanguage.g:1125:1: ( '&' )
            {
            // InternalTraceryLanguage.g:1125:1: ( '&' )
            // InternalTraceryLanguage.g:1126:2: '&'
            {
             before(grammarAccess.getNormalValueAccess().getAmpersandKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getNormalValueAccess().getAmpersandKeyword_4()); 

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
    // $ANTLR end "rule__NormalValue__Group__4__Impl"


    // $ANTLR start "rule__InnerStatement__Group_1__0"
    // InternalTraceryLanguage.g:1136:1: rule__InnerStatement__Group_1__0 : rule__InnerStatement__Group_1__0__Impl rule__InnerStatement__Group_1__1 ;
    public final void rule__InnerStatement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1140:1: ( rule__InnerStatement__Group_1__0__Impl rule__InnerStatement__Group_1__1 )
            // InternalTraceryLanguage.g:1141:2: rule__InnerStatement__Group_1__0__Impl rule__InnerStatement__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__InnerStatement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerStatement__Group_1__1();

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
    // $ANTLR end "rule__InnerStatement__Group_1__0"


    // $ANTLR start "rule__InnerStatement__Group_1__0__Impl"
    // InternalTraceryLanguage.g:1148:1: rule__InnerStatement__Group_1__0__Impl : ( '#' ) ;
    public final void rule__InnerStatement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1152:1: ( ( '#' ) )
            // InternalTraceryLanguage.g:1153:1: ( '#' )
            {
            // InternalTraceryLanguage.g:1153:1: ( '#' )
            // InternalTraceryLanguage.g:1154:2: '#'
            {
             before(grammarAccess.getInnerStatementAccess().getNumberSignKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getInnerStatementAccess().getNumberSignKeyword_1_0()); 

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
    // $ANTLR end "rule__InnerStatement__Group_1__0__Impl"


    // $ANTLR start "rule__InnerStatement__Group_1__1"
    // InternalTraceryLanguage.g:1163:1: rule__InnerStatement__Group_1__1 : rule__InnerStatement__Group_1__1__Impl rule__InnerStatement__Group_1__2 ;
    public final void rule__InnerStatement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1167:1: ( rule__InnerStatement__Group_1__1__Impl rule__InnerStatement__Group_1__2 )
            // InternalTraceryLanguage.g:1168:2: rule__InnerStatement__Group_1__1__Impl rule__InnerStatement__Group_1__2
            {
            pushFollow(FOLLOW_14);
            rule__InnerStatement__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerStatement__Group_1__2();

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
    // $ANTLR end "rule__InnerStatement__Group_1__1"


    // $ANTLR start "rule__InnerStatement__Group_1__1__Impl"
    // InternalTraceryLanguage.g:1175:1: rule__InnerStatement__Group_1__1__Impl : ( ruleVariableDecleration ) ;
    public final void rule__InnerStatement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1179:1: ( ( ruleVariableDecleration ) )
            // InternalTraceryLanguage.g:1180:1: ( ruleVariableDecleration )
            {
            // InternalTraceryLanguage.g:1180:1: ( ruleVariableDecleration )
            // InternalTraceryLanguage.g:1181:2: ruleVariableDecleration
            {
             before(grammarAccess.getInnerStatementAccess().getVariableDeclerationParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleVariableDecleration();

            state._fsp--;

             after(grammarAccess.getInnerStatementAccess().getVariableDeclerationParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__InnerStatement__Group_1__1__Impl"


    // $ANTLR start "rule__InnerStatement__Group_1__2"
    // InternalTraceryLanguage.g:1190:1: rule__InnerStatement__Group_1__2 : rule__InnerStatement__Group_1__2__Impl ;
    public final void rule__InnerStatement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1194:1: ( rule__InnerStatement__Group_1__2__Impl )
            // InternalTraceryLanguage.g:1195:2: rule__InnerStatement__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InnerStatement__Group_1__2__Impl();

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
    // $ANTLR end "rule__InnerStatement__Group_1__2"


    // $ANTLR start "rule__InnerStatement__Group_1__2__Impl"
    // InternalTraceryLanguage.g:1201:1: rule__InnerStatement__Group_1__2__Impl : ( '#' ) ;
    public final void rule__InnerStatement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1205:1: ( ( '#' ) )
            // InternalTraceryLanguage.g:1206:1: ( '#' )
            {
            // InternalTraceryLanguage.g:1206:1: ( '#' )
            // InternalTraceryLanguage.g:1207:2: '#'
            {
             before(grammarAccess.getInnerStatementAccess().getNumberSignKeyword_1_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getInnerStatementAccess().getNumberSignKeyword_1_2()); 

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
    // $ANTLR end "rule__InnerStatement__Group_1__2__Impl"


    // $ANTLR start "rule__InnerStatement__Group_2__0"
    // InternalTraceryLanguage.g:1217:1: rule__InnerStatement__Group_2__0 : rule__InnerStatement__Group_2__0__Impl rule__InnerStatement__Group_2__1 ;
    public final void rule__InnerStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1221:1: ( rule__InnerStatement__Group_2__0__Impl rule__InnerStatement__Group_2__1 )
            // InternalTraceryLanguage.g:1222:2: rule__InnerStatement__Group_2__0__Impl rule__InnerStatement__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__InnerStatement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerStatement__Group_2__1();

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
    // $ANTLR end "rule__InnerStatement__Group_2__0"


    // $ANTLR start "rule__InnerStatement__Group_2__0__Impl"
    // InternalTraceryLanguage.g:1229:1: rule__InnerStatement__Group_2__0__Impl : ( '#' ) ;
    public final void rule__InnerStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1233:1: ( ( '#' ) )
            // InternalTraceryLanguage.g:1234:1: ( '#' )
            {
            // InternalTraceryLanguage.g:1234:1: ( '#' )
            // InternalTraceryLanguage.g:1235:2: '#'
            {
             before(grammarAccess.getInnerStatementAccess().getNumberSignKeyword_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getInnerStatementAccess().getNumberSignKeyword_2_0()); 

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
    // $ANTLR end "rule__InnerStatement__Group_2__0__Impl"


    // $ANTLR start "rule__InnerStatement__Group_2__1"
    // InternalTraceryLanguage.g:1244:1: rule__InnerStatement__Group_2__1 : rule__InnerStatement__Group_2__1__Impl rule__InnerStatement__Group_2__2 ;
    public final void rule__InnerStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1248:1: ( rule__InnerStatement__Group_2__1__Impl rule__InnerStatement__Group_2__2 )
            // InternalTraceryLanguage.g:1249:2: rule__InnerStatement__Group_2__1__Impl rule__InnerStatement__Group_2__2
            {
            pushFollow(FOLLOW_15);
            rule__InnerStatement__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerStatement__Group_2__2();

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
    // $ANTLR end "rule__InnerStatement__Group_2__1"


    // $ANTLR start "rule__InnerStatement__Group_2__1__Impl"
    // InternalTraceryLanguage.g:1256:1: rule__InnerStatement__Group_2__1__Impl : ( ruleVariableDecleration ) ;
    public final void rule__InnerStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1260:1: ( ( ruleVariableDecleration ) )
            // InternalTraceryLanguage.g:1261:1: ( ruleVariableDecleration )
            {
            // InternalTraceryLanguage.g:1261:1: ( ruleVariableDecleration )
            // InternalTraceryLanguage.g:1262:2: ruleVariableDecleration
            {
             before(grammarAccess.getInnerStatementAccess().getVariableDeclerationParserRuleCall_2_1()); 
            pushFollow(FOLLOW_2);
            ruleVariableDecleration();

            state._fsp--;

             after(grammarAccess.getInnerStatementAccess().getVariableDeclerationParserRuleCall_2_1()); 

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
    // $ANTLR end "rule__InnerStatement__Group_2__1__Impl"


    // $ANTLR start "rule__InnerStatement__Group_2__2"
    // InternalTraceryLanguage.g:1271:1: rule__InnerStatement__Group_2__2 : rule__InnerStatement__Group_2__2__Impl ;
    public final void rule__InnerStatement__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1275:1: ( rule__InnerStatement__Group_2__2__Impl )
            // InternalTraceryLanguage.g:1276:2: rule__InnerStatement__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InnerStatement__Group_2__2__Impl();

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
    // $ANTLR end "rule__InnerStatement__Group_2__2"


    // $ANTLR start "rule__InnerStatement__Group_2__2__Impl"
    // InternalTraceryLanguage.g:1282:1: rule__InnerStatement__Group_2__2__Impl : ( '.ed#' ) ;
    public final void rule__InnerStatement__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1286:1: ( ( '.ed#' ) )
            // InternalTraceryLanguage.g:1287:1: ( '.ed#' )
            {
            // InternalTraceryLanguage.g:1287:1: ( '.ed#' )
            // InternalTraceryLanguage.g:1288:2: '.ed#'
            {
             before(grammarAccess.getInnerStatementAccess().getEdKeyword_2_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getInnerStatementAccess().getEdKeyword_2_2()); 

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
    // $ANTLR end "rule__InnerStatement__Group_2__2__Impl"


    // $ANTLR start "rule__InnerStatement__Group_3__0"
    // InternalTraceryLanguage.g:1298:1: rule__InnerStatement__Group_3__0 : rule__InnerStatement__Group_3__0__Impl rule__InnerStatement__Group_3__1 ;
    public final void rule__InnerStatement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1302:1: ( rule__InnerStatement__Group_3__0__Impl rule__InnerStatement__Group_3__1 )
            // InternalTraceryLanguage.g:1303:2: rule__InnerStatement__Group_3__0__Impl rule__InnerStatement__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__InnerStatement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerStatement__Group_3__1();

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
    // $ANTLR end "rule__InnerStatement__Group_3__0"


    // $ANTLR start "rule__InnerStatement__Group_3__0__Impl"
    // InternalTraceryLanguage.g:1310:1: rule__InnerStatement__Group_3__0__Impl : ( '#' ) ;
    public final void rule__InnerStatement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1314:1: ( ( '#' ) )
            // InternalTraceryLanguage.g:1315:1: ( '#' )
            {
            // InternalTraceryLanguage.g:1315:1: ( '#' )
            // InternalTraceryLanguage.g:1316:2: '#'
            {
             before(grammarAccess.getInnerStatementAccess().getNumberSignKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getInnerStatementAccess().getNumberSignKeyword_3_0()); 

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
    // $ANTLR end "rule__InnerStatement__Group_3__0__Impl"


    // $ANTLR start "rule__InnerStatement__Group_3__1"
    // InternalTraceryLanguage.g:1325:1: rule__InnerStatement__Group_3__1 : rule__InnerStatement__Group_3__1__Impl rule__InnerStatement__Group_3__2 ;
    public final void rule__InnerStatement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1329:1: ( rule__InnerStatement__Group_3__1__Impl rule__InnerStatement__Group_3__2 )
            // InternalTraceryLanguage.g:1330:2: rule__InnerStatement__Group_3__1__Impl rule__InnerStatement__Group_3__2
            {
            pushFollow(FOLLOW_16);
            rule__InnerStatement__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerStatement__Group_3__2();

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
    // $ANTLR end "rule__InnerStatement__Group_3__1"


    // $ANTLR start "rule__InnerStatement__Group_3__1__Impl"
    // InternalTraceryLanguage.g:1337:1: rule__InnerStatement__Group_3__1__Impl : ( ruleVariableDecleration ) ;
    public final void rule__InnerStatement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1341:1: ( ( ruleVariableDecleration ) )
            // InternalTraceryLanguage.g:1342:1: ( ruleVariableDecleration )
            {
            // InternalTraceryLanguage.g:1342:1: ( ruleVariableDecleration )
            // InternalTraceryLanguage.g:1343:2: ruleVariableDecleration
            {
             before(grammarAccess.getInnerStatementAccess().getVariableDeclerationParserRuleCall_3_1()); 
            pushFollow(FOLLOW_2);
            ruleVariableDecleration();

            state._fsp--;

             after(grammarAccess.getInnerStatementAccess().getVariableDeclerationParserRuleCall_3_1()); 

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
    // $ANTLR end "rule__InnerStatement__Group_3__1__Impl"


    // $ANTLR start "rule__InnerStatement__Group_3__2"
    // InternalTraceryLanguage.g:1352:1: rule__InnerStatement__Group_3__2 : rule__InnerStatement__Group_3__2__Impl ;
    public final void rule__InnerStatement__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1356:1: ( rule__InnerStatement__Group_3__2__Impl )
            // InternalTraceryLanguage.g:1357:2: rule__InnerStatement__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InnerStatement__Group_3__2__Impl();

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
    // $ANTLR end "rule__InnerStatement__Group_3__2"


    // $ANTLR start "rule__InnerStatement__Group_3__2__Impl"
    // InternalTraceryLanguage.g:1363:1: rule__InnerStatement__Group_3__2__Impl : ( '.a#' ) ;
    public final void rule__InnerStatement__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1367:1: ( ( '.a#' ) )
            // InternalTraceryLanguage.g:1368:1: ( '.a#' )
            {
            // InternalTraceryLanguage.g:1368:1: ( '.a#' )
            // InternalTraceryLanguage.g:1369:2: '.a#'
            {
             before(grammarAccess.getInnerStatementAccess().getAKeyword_3_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getInnerStatementAccess().getAKeyword_3_2()); 

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
    // $ANTLR end "rule__InnerStatement__Group_3__2__Impl"


    // $ANTLR start "rule__InnerStatement__Group_4__0"
    // InternalTraceryLanguage.g:1379:1: rule__InnerStatement__Group_4__0 : rule__InnerStatement__Group_4__0__Impl rule__InnerStatement__Group_4__1 ;
    public final void rule__InnerStatement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1383:1: ( rule__InnerStatement__Group_4__0__Impl rule__InnerStatement__Group_4__1 )
            // InternalTraceryLanguage.g:1384:2: rule__InnerStatement__Group_4__0__Impl rule__InnerStatement__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__InnerStatement__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerStatement__Group_4__1();

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
    // $ANTLR end "rule__InnerStatement__Group_4__0"


    // $ANTLR start "rule__InnerStatement__Group_4__0__Impl"
    // InternalTraceryLanguage.g:1391:1: rule__InnerStatement__Group_4__0__Impl : ( '#' ) ;
    public final void rule__InnerStatement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1395:1: ( ( '#' ) )
            // InternalTraceryLanguage.g:1396:1: ( '#' )
            {
            // InternalTraceryLanguage.g:1396:1: ( '#' )
            // InternalTraceryLanguage.g:1397:2: '#'
            {
             before(grammarAccess.getInnerStatementAccess().getNumberSignKeyword_4_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getInnerStatementAccess().getNumberSignKeyword_4_0()); 

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
    // $ANTLR end "rule__InnerStatement__Group_4__0__Impl"


    // $ANTLR start "rule__InnerStatement__Group_4__1"
    // InternalTraceryLanguage.g:1406:1: rule__InnerStatement__Group_4__1 : rule__InnerStatement__Group_4__1__Impl rule__InnerStatement__Group_4__2 ;
    public final void rule__InnerStatement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1410:1: ( rule__InnerStatement__Group_4__1__Impl rule__InnerStatement__Group_4__2 )
            // InternalTraceryLanguage.g:1411:2: rule__InnerStatement__Group_4__1__Impl rule__InnerStatement__Group_4__2
            {
            pushFollow(FOLLOW_17);
            rule__InnerStatement__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerStatement__Group_4__2();

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
    // $ANTLR end "rule__InnerStatement__Group_4__1"


    // $ANTLR start "rule__InnerStatement__Group_4__1__Impl"
    // InternalTraceryLanguage.g:1418:1: rule__InnerStatement__Group_4__1__Impl : ( ruleVariableDecleration ) ;
    public final void rule__InnerStatement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1422:1: ( ( ruleVariableDecleration ) )
            // InternalTraceryLanguage.g:1423:1: ( ruleVariableDecleration )
            {
            // InternalTraceryLanguage.g:1423:1: ( ruleVariableDecleration )
            // InternalTraceryLanguage.g:1424:2: ruleVariableDecleration
            {
             before(grammarAccess.getInnerStatementAccess().getVariableDeclerationParserRuleCall_4_1()); 
            pushFollow(FOLLOW_2);
            ruleVariableDecleration();

            state._fsp--;

             after(grammarAccess.getInnerStatementAccess().getVariableDeclerationParserRuleCall_4_1()); 

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
    // $ANTLR end "rule__InnerStatement__Group_4__1__Impl"


    // $ANTLR start "rule__InnerStatement__Group_4__2"
    // InternalTraceryLanguage.g:1433:1: rule__InnerStatement__Group_4__2 : rule__InnerStatement__Group_4__2__Impl ;
    public final void rule__InnerStatement__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1437:1: ( rule__InnerStatement__Group_4__2__Impl )
            // InternalTraceryLanguage.g:1438:2: rule__InnerStatement__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InnerStatement__Group_4__2__Impl();

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
    // $ANTLR end "rule__InnerStatement__Group_4__2"


    // $ANTLR start "rule__InnerStatement__Group_4__2__Impl"
    // InternalTraceryLanguage.g:1444:1: rule__InnerStatement__Group_4__2__Impl : ( '.the#' ) ;
    public final void rule__InnerStatement__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1448:1: ( ( '.the#' ) )
            // InternalTraceryLanguage.g:1449:1: ( '.the#' )
            {
            // InternalTraceryLanguage.g:1449:1: ( '.the#' )
            // InternalTraceryLanguage.g:1450:2: '.the#'
            {
             before(grammarAccess.getInnerStatementAccess().getTheKeyword_4_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getInnerStatementAccess().getTheKeyword_4_2()); 

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
    // $ANTLR end "rule__InnerStatement__Group_4__2__Impl"


    // $ANTLR start "rule__InnerStatement__Group_5__0"
    // InternalTraceryLanguage.g:1460:1: rule__InnerStatement__Group_5__0 : rule__InnerStatement__Group_5__0__Impl rule__InnerStatement__Group_5__1 ;
    public final void rule__InnerStatement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1464:1: ( rule__InnerStatement__Group_5__0__Impl rule__InnerStatement__Group_5__1 )
            // InternalTraceryLanguage.g:1465:2: rule__InnerStatement__Group_5__0__Impl rule__InnerStatement__Group_5__1
            {
            pushFollow(FOLLOW_10);
            rule__InnerStatement__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerStatement__Group_5__1();

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
    // $ANTLR end "rule__InnerStatement__Group_5__0"


    // $ANTLR start "rule__InnerStatement__Group_5__0__Impl"
    // InternalTraceryLanguage.g:1472:1: rule__InnerStatement__Group_5__0__Impl : ( '#' ) ;
    public final void rule__InnerStatement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1476:1: ( ( '#' ) )
            // InternalTraceryLanguage.g:1477:1: ( '#' )
            {
            // InternalTraceryLanguage.g:1477:1: ( '#' )
            // InternalTraceryLanguage.g:1478:2: '#'
            {
             before(grammarAccess.getInnerStatementAccess().getNumberSignKeyword_5_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getInnerStatementAccess().getNumberSignKeyword_5_0()); 

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
    // $ANTLR end "rule__InnerStatement__Group_5__0__Impl"


    // $ANTLR start "rule__InnerStatement__Group_5__1"
    // InternalTraceryLanguage.g:1487:1: rule__InnerStatement__Group_5__1 : rule__InnerStatement__Group_5__1__Impl rule__InnerStatement__Group_5__2 ;
    public final void rule__InnerStatement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1491:1: ( rule__InnerStatement__Group_5__1__Impl rule__InnerStatement__Group_5__2 )
            // InternalTraceryLanguage.g:1492:2: rule__InnerStatement__Group_5__1__Impl rule__InnerStatement__Group_5__2
            {
            pushFollow(FOLLOW_18);
            rule__InnerStatement__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InnerStatement__Group_5__2();

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
    // $ANTLR end "rule__InnerStatement__Group_5__1"


    // $ANTLR start "rule__InnerStatement__Group_5__1__Impl"
    // InternalTraceryLanguage.g:1499:1: rule__InnerStatement__Group_5__1__Impl : ( ruleVariableDecleration ) ;
    public final void rule__InnerStatement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1503:1: ( ( ruleVariableDecleration ) )
            // InternalTraceryLanguage.g:1504:1: ( ruleVariableDecleration )
            {
            // InternalTraceryLanguage.g:1504:1: ( ruleVariableDecleration )
            // InternalTraceryLanguage.g:1505:2: ruleVariableDecleration
            {
             before(grammarAccess.getInnerStatementAccess().getVariableDeclerationParserRuleCall_5_1()); 
            pushFollow(FOLLOW_2);
            ruleVariableDecleration();

            state._fsp--;

             after(grammarAccess.getInnerStatementAccess().getVariableDeclerationParserRuleCall_5_1()); 

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
    // $ANTLR end "rule__InnerStatement__Group_5__1__Impl"


    // $ANTLR start "rule__InnerStatement__Group_5__2"
    // InternalTraceryLanguage.g:1514:1: rule__InnerStatement__Group_5__2 : rule__InnerStatement__Group_5__2__Impl ;
    public final void rule__InnerStatement__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1518:1: ( rule__InnerStatement__Group_5__2__Impl )
            // InternalTraceryLanguage.g:1519:2: rule__InnerStatement__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InnerStatement__Group_5__2__Impl();

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
    // $ANTLR end "rule__InnerStatement__Group_5__2"


    // $ANTLR start "rule__InnerStatement__Group_5__2__Impl"
    // InternalTraceryLanguage.g:1525:1: rule__InnerStatement__Group_5__2__Impl : ( '.capitalise#' ) ;
    public final void rule__InnerStatement__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1529:1: ( ( '.capitalise#' ) )
            // InternalTraceryLanguage.g:1530:1: ( '.capitalise#' )
            {
            // InternalTraceryLanguage.g:1530:1: ( '.capitalise#' )
            // InternalTraceryLanguage.g:1531:2: '.capitalise#'
            {
             before(grammarAccess.getInnerStatementAccess().getCapitaliseKeyword_5_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getInnerStatementAccess().getCapitaliseKeyword_5_2()); 

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
    // $ANTLR end "rule__InnerStatement__Group_5__2__Impl"


    // $ANTLR start "rule__TraceryProgram__InitialStatementAssignment_2"
    // InternalTraceryLanguage.g:1541:1: rule__TraceryProgram__InitialStatementAssignment_2 : ( ruleInitialJSONLine ) ;
    public final void rule__TraceryProgram__InitialStatementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1545:1: ( ( ruleInitialJSONLine ) )
            // InternalTraceryLanguage.g:1546:2: ( ruleInitialJSONLine )
            {
            // InternalTraceryLanguage.g:1546:2: ( ruleInitialJSONLine )
            // InternalTraceryLanguage.g:1547:3: ruleInitialJSONLine
            {
             before(grammarAccess.getTraceryProgramAccess().getInitialStatementInitialJSONLineParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInitialJSONLine();

            state._fsp--;

             after(grammarAccess.getTraceryProgramAccess().getInitialStatementInitialJSONLineParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__TraceryProgram__InitialStatementAssignment_2"


    // $ANTLR start "rule__TraceryProgram__StatementsAssignment_3"
    // InternalTraceryLanguage.g:1556:1: rule__TraceryProgram__StatementsAssignment_3 : ( ruleNormalJSONLine ) ;
    public final void rule__TraceryProgram__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1560:1: ( ( ruleNormalJSONLine ) )
            // InternalTraceryLanguage.g:1561:2: ( ruleNormalJSONLine )
            {
            // InternalTraceryLanguage.g:1561:2: ( ruleNormalJSONLine )
            // InternalTraceryLanguage.g:1562:3: ruleNormalJSONLine
            {
             before(grammarAccess.getTraceryProgramAccess().getStatementsNormalJSONLineParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNormalJSONLine();

            state._fsp--;

             after(grammarAccess.getTraceryProgramAccess().getStatementsNormalJSONLineParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__TraceryProgram__StatementsAssignment_3"


    // $ANTLR start "rule__VariableDecleration__NameAssignment"
    // InternalTraceryLanguage.g:1571:1: rule__VariableDecleration__NameAssignment : ( RULE_ID ) ;
    public final void rule__VariableDecleration__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1575:1: ( ( RULE_ID ) )
            // InternalTraceryLanguage.g:1576:2: ( RULE_ID )
            {
            // InternalTraceryLanguage.g:1576:2: ( RULE_ID )
            // InternalTraceryLanguage.g:1577:3: RULE_ID
            {
             before(grammarAccess.getVariableDeclerationAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableDeclerationAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__VariableDecleration__NameAssignment"


    // $ANTLR start "rule__InitialJSONLine__StartValAssignment_3"
    // InternalTraceryLanguage.g:1586:1: rule__InitialJSONLine__StartValAssignment_3 : ( rulestartValue ) ;
    public final void rule__InitialJSONLine__StartValAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1590:1: ( ( rulestartValue ) )
            // InternalTraceryLanguage.g:1591:2: ( rulestartValue )
            {
            // InternalTraceryLanguage.g:1591:2: ( rulestartValue )
            // InternalTraceryLanguage.g:1592:3: rulestartValue
            {
             before(grammarAccess.getInitialJSONLineAccess().getStartValStartValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulestartValue();

            state._fsp--;

             after(grammarAccess.getInitialJSONLineAccess().getStartValStartValueParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__InitialJSONLine__StartValAssignment_3"


    // $ANTLR start "rule__InitialJSONLine__ValsAssignment_4"
    // InternalTraceryLanguage.g:1601:1: rule__InitialJSONLine__ValsAssignment_4 : ( rulenormalValue ) ;
    public final void rule__InitialJSONLine__ValsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1605:1: ( ( rulenormalValue ) )
            // InternalTraceryLanguage.g:1606:2: ( rulenormalValue )
            {
            // InternalTraceryLanguage.g:1606:2: ( rulenormalValue )
            // InternalTraceryLanguage.g:1607:3: rulenormalValue
            {
             before(grammarAccess.getInitialJSONLineAccess().getValsNormalValueParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulenormalValue();

            state._fsp--;

             after(grammarAccess.getInitialJSONLineAccess().getValsNormalValueParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__InitialJSONLine__ValsAssignment_4"


    // $ANTLR start "rule__NormalJSONLine__StartValAssignment_6"
    // InternalTraceryLanguage.g:1616:1: rule__NormalJSONLine__StartValAssignment_6 : ( rulestartValue ) ;
    public final void rule__NormalJSONLine__StartValAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1620:1: ( ( rulestartValue ) )
            // InternalTraceryLanguage.g:1621:2: ( rulestartValue )
            {
            // InternalTraceryLanguage.g:1621:2: ( rulestartValue )
            // InternalTraceryLanguage.g:1622:3: rulestartValue
            {
             before(grammarAccess.getNormalJSONLineAccess().getStartValStartValueParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulestartValue();

            state._fsp--;

             after(grammarAccess.getNormalJSONLineAccess().getStartValStartValueParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__NormalJSONLine__StartValAssignment_6"


    // $ANTLR start "rule__NormalJSONLine__ValsAssignment_7"
    // InternalTraceryLanguage.g:1631:1: rule__NormalJSONLine__ValsAssignment_7 : ( rulenormalValue ) ;
    public final void rule__NormalJSONLine__ValsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1635:1: ( ( rulenormalValue ) )
            // InternalTraceryLanguage.g:1636:2: ( rulenormalValue )
            {
            // InternalTraceryLanguage.g:1636:2: ( rulenormalValue )
            // InternalTraceryLanguage.g:1637:3: rulenormalValue
            {
             before(grammarAccess.getNormalJSONLineAccess().getValsNormalValueParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            rulenormalValue();

            state._fsp--;

             after(grammarAccess.getNormalJSONLineAccess().getValsNormalValueParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__NormalJSONLine__ValsAssignment_7"


    // $ANTLR start "rule__StartValue__ValueAssignment_2"
    // InternalTraceryLanguage.g:1646:1: rule__StartValue__ValueAssignment_2 : ( ruleInnerStatement ) ;
    public final void rule__StartValue__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1650:1: ( ( ruleInnerStatement ) )
            // InternalTraceryLanguage.g:1651:2: ( ruleInnerStatement )
            {
            // InternalTraceryLanguage.g:1651:2: ( ruleInnerStatement )
            // InternalTraceryLanguage.g:1652:3: ruleInnerStatement
            {
             before(grammarAccess.getStartValueAccess().getValueInnerStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInnerStatement();

            state._fsp--;

             after(grammarAccess.getStartValueAccess().getValueInnerStatementParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__StartValue__ValueAssignment_2"


    // $ANTLR start "rule__NormalValue__ValueAssignment_3"
    // InternalTraceryLanguage.g:1661:1: rule__NormalValue__ValueAssignment_3 : ( ruleInnerStatement ) ;
    public final void rule__NormalValue__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1665:1: ( ( ruleInnerStatement ) )
            // InternalTraceryLanguage.g:1666:2: ( ruleInnerStatement )
            {
            // InternalTraceryLanguage.g:1666:2: ( ruleInnerStatement )
            // InternalTraceryLanguage.g:1667:3: ruleInnerStatement
            {
             before(grammarAccess.getNormalValueAccess().getValueInnerStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInnerStatement();

            state._fsp--;

             after(grammarAccess.getNormalValueAccess().getValueInnerStatementParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__NormalValue__ValueAssignment_3"


    // $ANTLR start "rule__InnerStatement__ValueAssignment_0"
    // InternalTraceryLanguage.g:1676:1: rule__InnerStatement__ValueAssignment_0 : ( RULE_STRING ) ;
    public final void rule__InnerStatement__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1680:1: ( ( RULE_STRING ) )
            // InternalTraceryLanguage.g:1681:2: ( RULE_STRING )
            {
            // InternalTraceryLanguage.g:1681:2: ( RULE_STRING )
            // InternalTraceryLanguage.g:1682:3: RULE_STRING
            {
             before(grammarAccess.getInnerStatementAccess().getValueSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInnerStatementAccess().getValueSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__InnerStatement__ValueAssignment_0"


    // $ANTLR start "rule__StartingJSONExpression__VarAssignment"
    // InternalTraceryLanguage.g:1691:1: rule__StartingJSONExpression__VarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__StartingJSONExpression__VarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1695:1: ( ( ( RULE_ID ) ) )
            // InternalTraceryLanguage.g:1696:2: ( ( RULE_ID ) )
            {
            // InternalTraceryLanguage.g:1696:2: ( ( RULE_ID ) )
            // InternalTraceryLanguage.g:1697:3: ( RULE_ID )
            {
             before(grammarAccess.getStartingJSONExpressionAccess().getVarVariableDeclerationCrossReference_0()); 
            // InternalTraceryLanguage.g:1698:3: ( RULE_ID )
            // InternalTraceryLanguage.g:1699:4: RULE_ID
            {
             before(grammarAccess.getStartingJSONExpressionAccess().getVarVariableDeclerationIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStartingJSONExpressionAccess().getVarVariableDeclerationIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getStartingJSONExpressionAccess().getVarVariableDeclerationCrossReference_0()); 

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
    // $ANTLR end "rule__StartingJSONExpression__VarAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C0020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080022L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});

}
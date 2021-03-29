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
        try {
            // InternalTraceryLanguage.g:79:1: ( ruleVariableDecleration EOF )
            // InternalTraceryLanguage.g:80:1: ruleVariableDecleration EOF
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
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableDecleration"


    // $ANTLR start "ruleVariableDecleration"
    // InternalTraceryLanguage.g:87:1: ruleVariableDecleration : ( ( rule__VariableDecleration__NameAssignment ) ) ;
    public final void ruleVariableDecleration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:91:2: ( ( ( rule__VariableDecleration__NameAssignment ) ) )
            // InternalTraceryLanguage.g:92:2: ( ( rule__VariableDecleration__NameAssignment ) )
            {
            // InternalTraceryLanguage.g:92:2: ( ( rule__VariableDecleration__NameAssignment ) )
            // InternalTraceryLanguage.g:93:3: ( rule__VariableDecleration__NameAssignment )
            {
             before(grammarAccess.getVariableDeclerationAccess().getNameAssignment()); 
            // InternalTraceryLanguage.g:94:3: ( rule__VariableDecleration__NameAssignment )
            // InternalTraceryLanguage.g:94:4: rule__VariableDecleration__NameAssignment
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

        }
        return ;
    }
    // $ANTLR end "ruleVariableDecleration"


    // $ANTLR start "entryRuleInitialStatement"
    // InternalTraceryLanguage.g:103:1: entryRuleInitialStatement : ruleInitialStatement EOF ;
    public final void entryRuleInitialStatement() throws RecognitionException {
        try {
            // InternalTraceryLanguage.g:104:1: ( ruleInitialStatement EOF )
            // InternalTraceryLanguage.g:105:1: ruleInitialStatement EOF
            {
             before(grammarAccess.getInitialStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleInitialStatement();

            state._fsp--;

             after(grammarAccess.getInitialStatementRule()); 
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
    // $ANTLR end "entryRuleInitialStatement"


    // $ANTLR start "ruleInitialStatement"
    // InternalTraceryLanguage.g:112:1: ruleInitialStatement : ( ( rule__InitialStatement__Group__0 ) ) ;
    public final void ruleInitialStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:116:2: ( ( ( rule__InitialStatement__Group__0 ) ) )
            // InternalTraceryLanguage.g:117:2: ( ( rule__InitialStatement__Group__0 ) )
            {
            // InternalTraceryLanguage.g:117:2: ( ( rule__InitialStatement__Group__0 ) )
            // InternalTraceryLanguage.g:118:3: ( rule__InitialStatement__Group__0 )
            {
             before(grammarAccess.getInitialStatementAccess().getGroup()); 
            // InternalTraceryLanguage.g:119:3: ( rule__InitialStatement__Group__0 )
            // InternalTraceryLanguage.g:119:4: rule__InitialStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InitialStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInitialStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleInitialStatement"


    // $ANTLR start "entryRuleStatement"
    // InternalTraceryLanguage.g:128:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalTraceryLanguage.g:129:1: ( ruleStatement EOF )
            // InternalTraceryLanguage.g:130:1: ruleStatement EOF
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
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalTraceryLanguage.g:137:1: ruleStatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:141:2: ( ( ( rule__Statement__Group__0 ) ) )
            // InternalTraceryLanguage.g:142:2: ( ( rule__Statement__Group__0 ) )
            {
            // InternalTraceryLanguage.g:142:2: ( ( rule__Statement__Group__0 ) )
            // InternalTraceryLanguage.g:143:3: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // InternalTraceryLanguage.g:144:3: ( rule__Statement__Group__0 )
            // InternalTraceryLanguage.g:144:4: rule__Statement__Group__0
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

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRulestartValue"
    // InternalTraceryLanguage.g:153:1: entryRulestartValue : rulestartValue EOF ;
    public final void entryRulestartValue() throws RecognitionException {
        try {
            // InternalTraceryLanguage.g:154:1: ( rulestartValue EOF )
            // InternalTraceryLanguage.g:155:1: rulestartValue EOF
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
        }
        return ;
    }
    // $ANTLR end "entryRulestartValue"


    // $ANTLR start "rulestartValue"
    // InternalTraceryLanguage.g:162:1: rulestartValue : ( ( rule__StartValue__Group__0 ) ) ;
    public final void rulestartValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:166:2: ( ( ( rule__StartValue__Group__0 ) ) )
            // InternalTraceryLanguage.g:167:2: ( ( rule__StartValue__Group__0 ) )
            {
            // InternalTraceryLanguage.g:167:2: ( ( rule__StartValue__Group__0 ) )
            // InternalTraceryLanguage.g:168:3: ( rule__StartValue__Group__0 )
            {
             before(grammarAccess.getStartValueAccess().getGroup()); 
            // InternalTraceryLanguage.g:169:3: ( rule__StartValue__Group__0 )
            // InternalTraceryLanguage.g:169:4: rule__StartValue__Group__0
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

        }
        return ;
    }
    // $ANTLR end "rulestartValue"


    // $ANTLR start "entryRulenormalValue"
    // InternalTraceryLanguage.g:178:1: entryRulenormalValue : rulenormalValue EOF ;
    public final void entryRulenormalValue() throws RecognitionException {
        try {
            // InternalTraceryLanguage.g:179:1: ( rulenormalValue EOF )
            // InternalTraceryLanguage.g:180:1: rulenormalValue EOF
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
        }
        return ;
    }
    // $ANTLR end "entryRulenormalValue"


    // $ANTLR start "rulenormalValue"
    // InternalTraceryLanguage.g:187:1: rulenormalValue : ( ( rule__NormalValue__Group__0 ) ) ;
    public final void rulenormalValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:191:2: ( ( ( rule__NormalValue__Group__0 ) ) )
            // InternalTraceryLanguage.g:192:2: ( ( rule__NormalValue__Group__0 ) )
            {
            // InternalTraceryLanguage.g:192:2: ( ( rule__NormalValue__Group__0 ) )
            // InternalTraceryLanguage.g:193:3: ( rule__NormalValue__Group__0 )
            {
             before(grammarAccess.getNormalValueAccess().getGroup()); 
            // InternalTraceryLanguage.g:194:3: ( rule__NormalValue__Group__0 )
            // InternalTraceryLanguage.g:194:4: rule__NormalValue__Group__0
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

        }
        return ;
    }
    // $ANTLR end "rulenormalValue"


    // $ANTLR start "entryRuleInnerStatement"
    // InternalTraceryLanguage.g:203:1: entryRuleInnerStatement : ruleInnerStatement EOF ;
    public final void entryRuleInnerStatement() throws RecognitionException {
        try {
            // InternalTraceryLanguage.g:204:1: ( ruleInnerStatement EOF )
            // InternalTraceryLanguage.g:205:1: ruleInnerStatement EOF
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
        }
        return ;
    }
    // $ANTLR end "entryRuleInnerStatement"


    // $ANTLR start "ruleInnerStatement"
    // InternalTraceryLanguage.g:212:1: ruleInnerStatement : ( ( rule__InnerStatement__Alternatives ) ) ;
    public final void ruleInnerStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:216:2: ( ( ( rule__InnerStatement__Alternatives ) ) )
            // InternalTraceryLanguage.g:217:2: ( ( rule__InnerStatement__Alternatives ) )
            {
            // InternalTraceryLanguage.g:217:2: ( ( rule__InnerStatement__Alternatives ) )
            // InternalTraceryLanguage.g:218:3: ( rule__InnerStatement__Alternatives )
            {
             before(grammarAccess.getInnerStatementAccess().getAlternatives()); 
            // InternalTraceryLanguage.g:219:3: ( rule__InnerStatement__Alternatives )
            // InternalTraceryLanguage.g:219:4: rule__InnerStatement__Alternatives
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

        }
        return ;
    }
    // $ANTLR end "ruleInnerStatement"


    // $ANTLR start "entryRuleStartingJSONExpression"
    // InternalTraceryLanguage.g:228:1: entryRuleStartingJSONExpression : ruleStartingJSONExpression EOF ;
    public final void entryRuleStartingJSONExpression() throws RecognitionException {
        try {
            // InternalTraceryLanguage.g:229:1: ( ruleStartingJSONExpression EOF )
            // InternalTraceryLanguage.g:230:1: ruleStartingJSONExpression EOF
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
        }
        return ;
    }
    // $ANTLR end "entryRuleStartingJSONExpression"


    // $ANTLR start "ruleStartingJSONExpression"
    // InternalTraceryLanguage.g:237:1: ruleStartingJSONExpression : ( ( rule__StartingJSONExpression__VarAssignment ) ) ;
    public final void ruleStartingJSONExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:241:2: ( ( ( rule__StartingJSONExpression__VarAssignment ) ) )
            // InternalTraceryLanguage.g:242:2: ( ( rule__StartingJSONExpression__VarAssignment ) )
            {
            // InternalTraceryLanguage.g:242:2: ( ( rule__StartingJSONExpression__VarAssignment ) )
            // InternalTraceryLanguage.g:243:3: ( rule__StartingJSONExpression__VarAssignment )
            {
             before(grammarAccess.getStartingJSONExpressionAccess().getVarAssignment()); 
            // InternalTraceryLanguage.g:244:3: ( rule__StartingJSONExpression__VarAssignment )
            // InternalTraceryLanguage.g:244:4: rule__StartingJSONExpression__VarAssignment
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

        }
        return ;
    }
    // $ANTLR end "ruleStartingJSONExpression"


    // $ANTLR start "rule__InnerStatement__Alternatives"
    // InternalTraceryLanguage.g:252:1: rule__InnerStatement__Alternatives : ( ( ( rule__InnerStatement__ValueAssignment_0 ) ) | ( ( rule__InnerStatement__Group_1__0 ) ) | ( ( rule__InnerStatement__Group_2__0 ) ) | ( ( rule__InnerStatement__Group_3__0 ) ) | ( ( rule__InnerStatement__Group_4__0 ) ) | ( ( rule__InnerStatement__Group_5__0 ) ) );
    public final void rule__InnerStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:256:1: ( ( ( rule__InnerStatement__ValueAssignment_0 ) ) | ( ( rule__InnerStatement__Group_1__0 ) ) | ( ( rule__InnerStatement__Group_2__0 ) ) | ( ( rule__InnerStatement__Group_3__0 ) ) | ( ( rule__InnerStatement__Group_4__0 ) ) | ( ( rule__InnerStatement__Group_5__0 ) ) )
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
                    // InternalTraceryLanguage.g:257:2: ( ( rule__InnerStatement__ValueAssignment_0 ) )
                    {
                    // InternalTraceryLanguage.g:257:2: ( ( rule__InnerStatement__ValueAssignment_0 ) )
                    // InternalTraceryLanguage.g:258:3: ( rule__InnerStatement__ValueAssignment_0 )
                    {
                     before(grammarAccess.getInnerStatementAccess().getValueAssignment_0()); 
                    // InternalTraceryLanguage.g:259:3: ( rule__InnerStatement__ValueAssignment_0 )
                    // InternalTraceryLanguage.g:259:4: rule__InnerStatement__ValueAssignment_0
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
                    // InternalTraceryLanguage.g:263:2: ( ( rule__InnerStatement__Group_1__0 ) )
                    {
                    // InternalTraceryLanguage.g:263:2: ( ( rule__InnerStatement__Group_1__0 ) )
                    // InternalTraceryLanguage.g:264:3: ( rule__InnerStatement__Group_1__0 )
                    {
                     before(grammarAccess.getInnerStatementAccess().getGroup_1()); 
                    // InternalTraceryLanguage.g:265:3: ( rule__InnerStatement__Group_1__0 )
                    // InternalTraceryLanguage.g:265:4: rule__InnerStatement__Group_1__0
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
                    // InternalTraceryLanguage.g:269:2: ( ( rule__InnerStatement__Group_2__0 ) )
                    {
                    // InternalTraceryLanguage.g:269:2: ( ( rule__InnerStatement__Group_2__0 ) )
                    // InternalTraceryLanguage.g:270:3: ( rule__InnerStatement__Group_2__0 )
                    {
                     before(grammarAccess.getInnerStatementAccess().getGroup_2()); 
                    // InternalTraceryLanguage.g:271:3: ( rule__InnerStatement__Group_2__0 )
                    // InternalTraceryLanguage.g:271:4: rule__InnerStatement__Group_2__0
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
                    // InternalTraceryLanguage.g:275:2: ( ( rule__InnerStatement__Group_3__0 ) )
                    {
                    // InternalTraceryLanguage.g:275:2: ( ( rule__InnerStatement__Group_3__0 ) )
                    // InternalTraceryLanguage.g:276:3: ( rule__InnerStatement__Group_3__0 )
                    {
                     before(grammarAccess.getInnerStatementAccess().getGroup_3()); 
                    // InternalTraceryLanguage.g:277:3: ( rule__InnerStatement__Group_3__0 )
                    // InternalTraceryLanguage.g:277:4: rule__InnerStatement__Group_3__0
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
                    // InternalTraceryLanguage.g:281:2: ( ( rule__InnerStatement__Group_4__0 ) )
                    {
                    // InternalTraceryLanguage.g:281:2: ( ( rule__InnerStatement__Group_4__0 ) )
                    // InternalTraceryLanguage.g:282:3: ( rule__InnerStatement__Group_4__0 )
                    {
                     before(grammarAccess.getInnerStatementAccess().getGroup_4()); 
                    // InternalTraceryLanguage.g:283:3: ( rule__InnerStatement__Group_4__0 )
                    // InternalTraceryLanguage.g:283:4: rule__InnerStatement__Group_4__0
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
                    // InternalTraceryLanguage.g:287:2: ( ( rule__InnerStatement__Group_5__0 ) )
                    {
                    // InternalTraceryLanguage.g:287:2: ( ( rule__InnerStatement__Group_5__0 ) )
                    // InternalTraceryLanguage.g:288:3: ( rule__InnerStatement__Group_5__0 )
                    {
                     before(grammarAccess.getInnerStatementAccess().getGroup_5()); 
                    // InternalTraceryLanguage.g:289:3: ( rule__InnerStatement__Group_5__0 )
                    // InternalTraceryLanguage.g:289:4: rule__InnerStatement__Group_5__0
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
    // InternalTraceryLanguage.g:297:1: rule__TraceryProgram__Group__0 : rule__TraceryProgram__Group__0__Impl rule__TraceryProgram__Group__1 ;
    public final void rule__TraceryProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:301:1: ( rule__TraceryProgram__Group__0__Impl rule__TraceryProgram__Group__1 )
            // InternalTraceryLanguage.g:302:2: rule__TraceryProgram__Group__0__Impl rule__TraceryProgram__Group__1
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
    // InternalTraceryLanguage.g:309:1: rule__TraceryProgram__Group__0__Impl : ( '{' ) ;
    public final void rule__TraceryProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:313:1: ( ( '{' ) )
            // InternalTraceryLanguage.g:314:1: ( '{' )
            {
            // InternalTraceryLanguage.g:314:1: ( '{' )
            // InternalTraceryLanguage.g:315:2: '{'
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
    // InternalTraceryLanguage.g:324:1: rule__TraceryProgram__Group__1 : rule__TraceryProgram__Group__1__Impl rule__TraceryProgram__Group__2 ;
    public final void rule__TraceryProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:328:1: ( rule__TraceryProgram__Group__1__Impl rule__TraceryProgram__Group__2 )
            // InternalTraceryLanguage.g:329:2: rule__TraceryProgram__Group__1__Impl rule__TraceryProgram__Group__2
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
    // InternalTraceryLanguage.g:336:1: rule__TraceryProgram__Group__1__Impl : ( ( rule__TraceryProgram__InitialStatementAssignment_1 ) ) ;
    public final void rule__TraceryProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:340:1: ( ( ( rule__TraceryProgram__InitialStatementAssignment_1 ) ) )
            // InternalTraceryLanguage.g:341:1: ( ( rule__TraceryProgram__InitialStatementAssignment_1 ) )
            {
            // InternalTraceryLanguage.g:341:1: ( ( rule__TraceryProgram__InitialStatementAssignment_1 ) )
            // InternalTraceryLanguage.g:342:2: ( rule__TraceryProgram__InitialStatementAssignment_1 )
            {
             before(grammarAccess.getTraceryProgramAccess().getInitialStatementAssignment_1()); 
            // InternalTraceryLanguage.g:343:2: ( rule__TraceryProgram__InitialStatementAssignment_1 )
            // InternalTraceryLanguage.g:343:3: rule__TraceryProgram__InitialStatementAssignment_1
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
    // InternalTraceryLanguage.g:351:1: rule__TraceryProgram__Group__2 : rule__TraceryProgram__Group__2__Impl rule__TraceryProgram__Group__3 ;
    public final void rule__TraceryProgram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:355:1: ( rule__TraceryProgram__Group__2__Impl rule__TraceryProgram__Group__3 )
            // InternalTraceryLanguage.g:356:2: rule__TraceryProgram__Group__2__Impl rule__TraceryProgram__Group__3
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
    // InternalTraceryLanguage.g:363:1: rule__TraceryProgram__Group__2__Impl : ( ( rule__TraceryProgram__StatementsAssignment_2 )* ) ;
    public final void rule__TraceryProgram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:367:1: ( ( ( rule__TraceryProgram__StatementsAssignment_2 )* ) )
            // InternalTraceryLanguage.g:368:1: ( ( rule__TraceryProgram__StatementsAssignment_2 )* )
            {
            // InternalTraceryLanguage.g:368:1: ( ( rule__TraceryProgram__StatementsAssignment_2 )* )
            // InternalTraceryLanguage.g:369:2: ( rule__TraceryProgram__StatementsAssignment_2 )*
            {
             before(grammarAccess.getTraceryProgramAccess().getStatementsAssignment_2()); 
            // InternalTraceryLanguage.g:370:2: ( rule__TraceryProgram__StatementsAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTraceryLanguage.g:370:3: rule__TraceryProgram__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__TraceryProgram__StatementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getTraceryProgramAccess().getStatementsAssignment_2()); 

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
    // InternalTraceryLanguage.g:378:1: rule__TraceryProgram__Group__3 : rule__TraceryProgram__Group__3__Impl ;
    public final void rule__TraceryProgram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:382:1: ( rule__TraceryProgram__Group__3__Impl )
            // InternalTraceryLanguage.g:383:2: rule__TraceryProgram__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TraceryProgram__Group__3__Impl();

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
    // InternalTraceryLanguage.g:389:1: rule__TraceryProgram__Group__3__Impl : ( '}' ) ;
    public final void rule__TraceryProgram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:393:1: ( ( '}' ) )
            // InternalTraceryLanguage.g:394:1: ( '}' )
            {
            // InternalTraceryLanguage.g:394:1: ( '}' )
            // InternalTraceryLanguage.g:395:2: '}'
            {
             before(grammarAccess.getTraceryProgramAccess().getRightCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTraceryProgramAccess().getRightCurlyBracketKeyword_3()); 

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


    // $ANTLR start "rule__InitialStatement__Group__0"
    // InternalTraceryLanguage.g:405:1: rule__InitialStatement__Group__0 : rule__InitialStatement__Group__0__Impl rule__InitialStatement__Group__1 ;
    public final void rule__InitialStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:409:1: ( rule__InitialStatement__Group__0__Impl rule__InitialStatement__Group__1 )
            // InternalTraceryLanguage.g:410:2: rule__InitialStatement__Group__0__Impl rule__InitialStatement__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__InitialStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialStatement__Group__1();

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
    // $ANTLR end "rule__InitialStatement__Group__0"


    // $ANTLR start "rule__InitialStatement__Group__0__Impl"
    // InternalTraceryLanguage.g:417:1: rule__InitialStatement__Group__0__Impl : ( '&origin&' ) ;
    public final void rule__InitialStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:421:1: ( ( '&origin&' ) )
            // InternalTraceryLanguage.g:422:1: ( '&origin&' )
            {
            // InternalTraceryLanguage.g:422:1: ( '&origin&' )
            // InternalTraceryLanguage.g:423:2: '&origin&'
            {
             before(grammarAccess.getInitialStatementAccess().getOriginKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getInitialStatementAccess().getOriginKeyword_0()); 

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
    // $ANTLR end "rule__InitialStatement__Group__0__Impl"


    // $ANTLR start "rule__InitialStatement__Group__1"
    // InternalTraceryLanguage.g:432:1: rule__InitialStatement__Group__1 : rule__InitialStatement__Group__1__Impl rule__InitialStatement__Group__2 ;
    public final void rule__InitialStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:436:1: ( rule__InitialStatement__Group__1__Impl rule__InitialStatement__Group__2 )
            // InternalTraceryLanguage.g:437:2: rule__InitialStatement__Group__1__Impl rule__InitialStatement__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__InitialStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialStatement__Group__2();

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
    // $ANTLR end "rule__InitialStatement__Group__1"


    // $ANTLR start "rule__InitialStatement__Group__1__Impl"
    // InternalTraceryLanguage.g:444:1: rule__InitialStatement__Group__1__Impl : ( ':' ) ;
    public final void rule__InitialStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:448:1: ( ( ':' ) )
            // InternalTraceryLanguage.g:449:1: ( ':' )
            {
            // InternalTraceryLanguage.g:449:1: ( ':' )
            // InternalTraceryLanguage.g:450:2: ':'
            {
             before(grammarAccess.getInitialStatementAccess().getColonKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getInitialStatementAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__InitialStatement__Group__1__Impl"


    // $ANTLR start "rule__InitialStatement__Group__2"
    // InternalTraceryLanguage.g:459:1: rule__InitialStatement__Group__2 : rule__InitialStatement__Group__2__Impl rule__InitialStatement__Group__3 ;
    public final void rule__InitialStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:463:1: ( rule__InitialStatement__Group__2__Impl rule__InitialStatement__Group__3 )
            // InternalTraceryLanguage.g:464:2: rule__InitialStatement__Group__2__Impl rule__InitialStatement__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__InitialStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialStatement__Group__3();

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
    // $ANTLR end "rule__InitialStatement__Group__2"


    // $ANTLR start "rule__InitialStatement__Group__2__Impl"
    // InternalTraceryLanguage.g:471:1: rule__InitialStatement__Group__2__Impl : ( '[' ) ;
    public final void rule__InitialStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:475:1: ( ( '[' ) )
            // InternalTraceryLanguage.g:476:1: ( '[' )
            {
            // InternalTraceryLanguage.g:476:1: ( '[' )
            // InternalTraceryLanguage.g:477:2: '['
            {
             before(grammarAccess.getInitialStatementAccess().getLeftSquareBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getInitialStatementAccess().getLeftSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__InitialStatement__Group__2__Impl"


    // $ANTLR start "rule__InitialStatement__Group__3"
    // InternalTraceryLanguage.g:486:1: rule__InitialStatement__Group__3 : rule__InitialStatement__Group__3__Impl rule__InitialStatement__Group__4 ;
    public final void rule__InitialStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:490:1: ( rule__InitialStatement__Group__3__Impl rule__InitialStatement__Group__4 )
            // InternalTraceryLanguage.g:491:2: rule__InitialStatement__Group__3__Impl rule__InitialStatement__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__InitialStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialStatement__Group__4();

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
    // $ANTLR end "rule__InitialStatement__Group__3"


    // $ANTLR start "rule__InitialStatement__Group__3__Impl"
    // InternalTraceryLanguage.g:498:1: rule__InitialStatement__Group__3__Impl : ( ( rule__InitialStatement__StartValAssignment_3 ) ) ;
    public final void rule__InitialStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:502:1: ( ( ( rule__InitialStatement__StartValAssignment_3 ) ) )
            // InternalTraceryLanguage.g:503:1: ( ( rule__InitialStatement__StartValAssignment_3 ) )
            {
            // InternalTraceryLanguage.g:503:1: ( ( rule__InitialStatement__StartValAssignment_3 ) )
            // InternalTraceryLanguage.g:504:2: ( rule__InitialStatement__StartValAssignment_3 )
            {
             before(grammarAccess.getInitialStatementAccess().getStartValAssignment_3()); 
            // InternalTraceryLanguage.g:505:2: ( rule__InitialStatement__StartValAssignment_3 )
            // InternalTraceryLanguage.g:505:3: rule__InitialStatement__StartValAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__InitialStatement__StartValAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInitialStatementAccess().getStartValAssignment_3()); 

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
    // $ANTLR end "rule__InitialStatement__Group__3__Impl"


    // $ANTLR start "rule__InitialStatement__Group__4"
    // InternalTraceryLanguage.g:513:1: rule__InitialStatement__Group__4 : rule__InitialStatement__Group__4__Impl rule__InitialStatement__Group__5 ;
    public final void rule__InitialStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:517:1: ( rule__InitialStatement__Group__4__Impl rule__InitialStatement__Group__5 )
            // InternalTraceryLanguage.g:518:2: rule__InitialStatement__Group__4__Impl rule__InitialStatement__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__InitialStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialStatement__Group__5();

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
    // $ANTLR end "rule__InitialStatement__Group__4"


    // $ANTLR start "rule__InitialStatement__Group__4__Impl"
    // InternalTraceryLanguage.g:525:1: rule__InitialStatement__Group__4__Impl : ( ( rule__InitialStatement__ValsAssignment_4 )* ) ;
    public final void rule__InitialStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:529:1: ( ( ( rule__InitialStatement__ValsAssignment_4 )* ) )
            // InternalTraceryLanguage.g:530:1: ( ( rule__InitialStatement__ValsAssignment_4 )* )
            {
            // InternalTraceryLanguage.g:530:1: ( ( rule__InitialStatement__ValsAssignment_4 )* )
            // InternalTraceryLanguage.g:531:2: ( rule__InitialStatement__ValsAssignment_4 )*
            {
             before(grammarAccess.getInitialStatementAccess().getValsAssignment_4()); 
            // InternalTraceryLanguage.g:532:2: ( rule__InitialStatement__ValsAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTraceryLanguage.g:532:3: rule__InitialStatement__ValsAssignment_4
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__InitialStatement__ValsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getInitialStatementAccess().getValsAssignment_4()); 

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
    // $ANTLR end "rule__InitialStatement__Group__4__Impl"


    // $ANTLR start "rule__InitialStatement__Group__5"
    // InternalTraceryLanguage.g:540:1: rule__InitialStatement__Group__5 : rule__InitialStatement__Group__5__Impl ;
    public final void rule__InitialStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:544:1: ( rule__InitialStatement__Group__5__Impl )
            // InternalTraceryLanguage.g:545:2: rule__InitialStatement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InitialStatement__Group__5__Impl();

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
    // $ANTLR end "rule__InitialStatement__Group__5"


    // $ANTLR start "rule__InitialStatement__Group__5__Impl"
    // InternalTraceryLanguage.g:551:1: rule__InitialStatement__Group__5__Impl : ( ']' ) ;
    public final void rule__InitialStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:555:1: ( ( ']' ) )
            // InternalTraceryLanguage.g:556:1: ( ']' )
            {
            // InternalTraceryLanguage.g:556:1: ( ']' )
            // InternalTraceryLanguage.g:557:2: ']'
            {
             before(grammarAccess.getInitialStatementAccess().getRightSquareBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getInitialStatementAccess().getRightSquareBracketKeyword_5()); 

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
    // $ANTLR end "rule__InitialStatement__Group__5__Impl"


    // $ANTLR start "rule__Statement__Group__0"
    // InternalTraceryLanguage.g:567:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:571:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalTraceryLanguage.g:572:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalTraceryLanguage.g:579:1: rule__Statement__Group__0__Impl : ( ',' ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:583:1: ( ( ',' ) )
            // InternalTraceryLanguage.g:584:1: ( ',' )
            {
            // InternalTraceryLanguage.g:584:1: ( ',' )
            // InternalTraceryLanguage.g:585:2: ','
            {
             before(grammarAccess.getStatementAccess().getCommaKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getCommaKeyword_0()); 

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
    // InternalTraceryLanguage.g:594:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl rule__Statement__Group__2 ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:598:1: ( rule__Statement__Group__1__Impl rule__Statement__Group__2 )
            // InternalTraceryLanguage.g:599:2: rule__Statement__Group__1__Impl rule__Statement__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Statement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group__2();

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
    // InternalTraceryLanguage.g:606:1: rule__Statement__Group__1__Impl : ( '&' ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:610:1: ( ( '&' ) )
            // InternalTraceryLanguage.g:611:1: ( '&' )
            {
            // InternalTraceryLanguage.g:611:1: ( '&' )
            // InternalTraceryLanguage.g:612:2: '&'
            {
             before(grammarAccess.getStatementAccess().getAmpersandKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getAmpersandKeyword_1()); 

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


    // $ANTLR start "rule__Statement__Group__2"
    // InternalTraceryLanguage.g:621:1: rule__Statement__Group__2 : rule__Statement__Group__2__Impl rule__Statement__Group__3 ;
    public final void rule__Statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:625:1: ( rule__Statement__Group__2__Impl rule__Statement__Group__3 )
            // InternalTraceryLanguage.g:626:2: rule__Statement__Group__2__Impl rule__Statement__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Statement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group__3();

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
    // $ANTLR end "rule__Statement__Group__2"


    // $ANTLR start "rule__Statement__Group__2__Impl"
    // InternalTraceryLanguage.g:633:1: rule__Statement__Group__2__Impl : ( ruleStartingJSONExpression ) ;
    public final void rule__Statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:637:1: ( ( ruleStartingJSONExpression ) )
            // InternalTraceryLanguage.g:638:1: ( ruleStartingJSONExpression )
            {
            // InternalTraceryLanguage.g:638:1: ( ruleStartingJSONExpression )
            // InternalTraceryLanguage.g:639:2: ruleStartingJSONExpression
            {
             before(grammarAccess.getStatementAccess().getStartingJSONExpressionParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleStartingJSONExpression();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getStartingJSONExpressionParserRuleCall_2()); 

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
    // $ANTLR end "rule__Statement__Group__2__Impl"


    // $ANTLR start "rule__Statement__Group__3"
    // InternalTraceryLanguage.g:648:1: rule__Statement__Group__3 : rule__Statement__Group__3__Impl rule__Statement__Group__4 ;
    public final void rule__Statement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:652:1: ( rule__Statement__Group__3__Impl rule__Statement__Group__4 )
            // InternalTraceryLanguage.g:653:2: rule__Statement__Group__3__Impl rule__Statement__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Statement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group__4();

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
    // $ANTLR end "rule__Statement__Group__3"


    // $ANTLR start "rule__Statement__Group__3__Impl"
    // InternalTraceryLanguage.g:660:1: rule__Statement__Group__3__Impl : ( '&' ) ;
    public final void rule__Statement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:664:1: ( ( '&' ) )
            // InternalTraceryLanguage.g:665:1: ( '&' )
            {
            // InternalTraceryLanguage.g:665:1: ( '&' )
            // InternalTraceryLanguage.g:666:2: '&'
            {
             before(grammarAccess.getStatementAccess().getAmpersandKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getAmpersandKeyword_3()); 

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
    // $ANTLR end "rule__Statement__Group__3__Impl"


    // $ANTLR start "rule__Statement__Group__4"
    // InternalTraceryLanguage.g:675:1: rule__Statement__Group__4 : rule__Statement__Group__4__Impl rule__Statement__Group__5 ;
    public final void rule__Statement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:679:1: ( rule__Statement__Group__4__Impl rule__Statement__Group__5 )
            // InternalTraceryLanguage.g:680:2: rule__Statement__Group__4__Impl rule__Statement__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Statement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group__5();

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
    // $ANTLR end "rule__Statement__Group__4"


    // $ANTLR start "rule__Statement__Group__4__Impl"
    // InternalTraceryLanguage.g:687:1: rule__Statement__Group__4__Impl : ( ':' ) ;
    public final void rule__Statement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:691:1: ( ( ':' ) )
            // InternalTraceryLanguage.g:692:1: ( ':' )
            {
            // InternalTraceryLanguage.g:692:1: ( ':' )
            // InternalTraceryLanguage.g:693:2: ':'
            {
             before(grammarAccess.getStatementAccess().getColonKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getColonKeyword_4()); 

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
    // $ANTLR end "rule__Statement__Group__4__Impl"


    // $ANTLR start "rule__Statement__Group__5"
    // InternalTraceryLanguage.g:702:1: rule__Statement__Group__5 : rule__Statement__Group__5__Impl rule__Statement__Group__6 ;
    public final void rule__Statement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:706:1: ( rule__Statement__Group__5__Impl rule__Statement__Group__6 )
            // InternalTraceryLanguage.g:707:2: rule__Statement__Group__5__Impl rule__Statement__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Statement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group__6();

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
    // $ANTLR end "rule__Statement__Group__5"


    // $ANTLR start "rule__Statement__Group__5__Impl"
    // InternalTraceryLanguage.g:714:1: rule__Statement__Group__5__Impl : ( '[' ) ;
    public final void rule__Statement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:718:1: ( ( '[' ) )
            // InternalTraceryLanguage.g:719:1: ( '[' )
            {
            // InternalTraceryLanguage.g:719:1: ( '[' )
            // InternalTraceryLanguage.g:720:2: '['
            {
             before(grammarAccess.getStatementAccess().getLeftSquareBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getLeftSquareBracketKeyword_5()); 

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
    // $ANTLR end "rule__Statement__Group__5__Impl"


    // $ANTLR start "rule__Statement__Group__6"
    // InternalTraceryLanguage.g:729:1: rule__Statement__Group__6 : rule__Statement__Group__6__Impl rule__Statement__Group__7 ;
    public final void rule__Statement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:733:1: ( rule__Statement__Group__6__Impl rule__Statement__Group__7 )
            // InternalTraceryLanguage.g:734:2: rule__Statement__Group__6__Impl rule__Statement__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Statement__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group__7();

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
    // $ANTLR end "rule__Statement__Group__6"


    // $ANTLR start "rule__Statement__Group__6__Impl"
    // InternalTraceryLanguage.g:741:1: rule__Statement__Group__6__Impl : ( ( rule__Statement__StartValAssignment_6 ) ) ;
    public final void rule__Statement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:745:1: ( ( ( rule__Statement__StartValAssignment_6 ) ) )
            // InternalTraceryLanguage.g:746:1: ( ( rule__Statement__StartValAssignment_6 ) )
            {
            // InternalTraceryLanguage.g:746:1: ( ( rule__Statement__StartValAssignment_6 ) )
            // InternalTraceryLanguage.g:747:2: ( rule__Statement__StartValAssignment_6 )
            {
             before(grammarAccess.getStatementAccess().getStartValAssignment_6()); 
            // InternalTraceryLanguage.g:748:2: ( rule__Statement__StartValAssignment_6 )
            // InternalTraceryLanguage.g:748:3: rule__Statement__StartValAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Statement__StartValAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getStartValAssignment_6()); 

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
    // $ANTLR end "rule__Statement__Group__6__Impl"


    // $ANTLR start "rule__Statement__Group__7"
    // InternalTraceryLanguage.g:756:1: rule__Statement__Group__7 : rule__Statement__Group__7__Impl rule__Statement__Group__8 ;
    public final void rule__Statement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:760:1: ( rule__Statement__Group__7__Impl rule__Statement__Group__8 )
            // InternalTraceryLanguage.g:761:2: rule__Statement__Group__7__Impl rule__Statement__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Statement__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group__8();

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
    // $ANTLR end "rule__Statement__Group__7"


    // $ANTLR start "rule__Statement__Group__7__Impl"
    // InternalTraceryLanguage.g:768:1: rule__Statement__Group__7__Impl : ( ( rule__Statement__ValsAssignment_7 )* ) ;
    public final void rule__Statement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:772:1: ( ( ( rule__Statement__ValsAssignment_7 )* ) )
            // InternalTraceryLanguage.g:773:1: ( ( rule__Statement__ValsAssignment_7 )* )
            {
            // InternalTraceryLanguage.g:773:1: ( ( rule__Statement__ValsAssignment_7 )* )
            // InternalTraceryLanguage.g:774:2: ( rule__Statement__ValsAssignment_7 )*
            {
             before(grammarAccess.getStatementAccess().getValsAssignment_7()); 
            // InternalTraceryLanguage.g:775:2: ( rule__Statement__ValsAssignment_7 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTraceryLanguage.g:775:3: rule__Statement__ValsAssignment_7
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Statement__ValsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getStatementAccess().getValsAssignment_7()); 

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
    // $ANTLR end "rule__Statement__Group__7__Impl"


    // $ANTLR start "rule__Statement__Group__8"
    // InternalTraceryLanguage.g:783:1: rule__Statement__Group__8 : rule__Statement__Group__8__Impl ;
    public final void rule__Statement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:787:1: ( rule__Statement__Group__8__Impl )
            // InternalTraceryLanguage.g:788:2: rule__Statement__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__8__Impl();

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
    // $ANTLR end "rule__Statement__Group__8"


    // $ANTLR start "rule__Statement__Group__8__Impl"
    // InternalTraceryLanguage.g:794:1: rule__Statement__Group__8__Impl : ( ']' ) ;
    public final void rule__Statement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:798:1: ( ( ']' ) )
            // InternalTraceryLanguage.g:799:1: ( ']' )
            {
            // InternalTraceryLanguage.g:799:1: ( ']' )
            // InternalTraceryLanguage.g:800:2: ']'
            {
             before(grammarAccess.getStatementAccess().getRightSquareBracketKeyword_8()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getRightSquareBracketKeyword_8()); 

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
    // $ANTLR end "rule__Statement__Group__8__Impl"


    // $ANTLR start "rule__StartValue__Group__0"
    // InternalTraceryLanguage.g:810:1: rule__StartValue__Group__0 : rule__StartValue__Group__0__Impl rule__StartValue__Group__1 ;
    public final void rule__StartValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:814:1: ( rule__StartValue__Group__0__Impl rule__StartValue__Group__1 )
            // InternalTraceryLanguage.g:815:2: rule__StartValue__Group__0__Impl rule__StartValue__Group__1
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
    // InternalTraceryLanguage.g:822:1: rule__StartValue__Group__0__Impl : ( () ) ;
    public final void rule__StartValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:826:1: ( ( () ) )
            // InternalTraceryLanguage.g:827:1: ( () )
            {
            // InternalTraceryLanguage.g:827:1: ( () )
            // InternalTraceryLanguage.g:828:2: ()
            {
             before(grammarAccess.getStartValueAccess().getStartValueAction_0()); 
            // InternalTraceryLanguage.g:829:2: ()
            // InternalTraceryLanguage.g:829:3: 
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
    // InternalTraceryLanguage.g:837:1: rule__StartValue__Group__1 : rule__StartValue__Group__1__Impl rule__StartValue__Group__2 ;
    public final void rule__StartValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:841:1: ( rule__StartValue__Group__1__Impl rule__StartValue__Group__2 )
            // InternalTraceryLanguage.g:842:2: rule__StartValue__Group__1__Impl rule__StartValue__Group__2
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
    // InternalTraceryLanguage.g:849:1: rule__StartValue__Group__1__Impl : ( '&' ) ;
    public final void rule__StartValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:853:1: ( ( '&' ) )
            // InternalTraceryLanguage.g:854:1: ( '&' )
            {
            // InternalTraceryLanguage.g:854:1: ( '&' )
            // InternalTraceryLanguage.g:855:2: '&'
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
    // InternalTraceryLanguage.g:864:1: rule__StartValue__Group__2 : rule__StartValue__Group__2__Impl rule__StartValue__Group__3 ;
    public final void rule__StartValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:868:1: ( rule__StartValue__Group__2__Impl rule__StartValue__Group__3 )
            // InternalTraceryLanguage.g:869:2: rule__StartValue__Group__2__Impl rule__StartValue__Group__3
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
    // InternalTraceryLanguage.g:876:1: rule__StartValue__Group__2__Impl : ( ( rule__StartValue__InnardsAssignment_2 )* ) ;
    public final void rule__StartValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:880:1: ( ( ( rule__StartValue__InnardsAssignment_2 )* ) )
            // InternalTraceryLanguage.g:881:1: ( ( rule__StartValue__InnardsAssignment_2 )* )
            {
            // InternalTraceryLanguage.g:881:1: ( ( rule__StartValue__InnardsAssignment_2 )* )
            // InternalTraceryLanguage.g:882:2: ( rule__StartValue__InnardsAssignment_2 )*
            {
             before(grammarAccess.getStartValueAccess().getInnardsAssignment_2()); 
            // InternalTraceryLanguage.g:883:2: ( rule__StartValue__InnardsAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STRING||LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTraceryLanguage.g:883:3: rule__StartValue__InnardsAssignment_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__StartValue__InnardsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getStartValueAccess().getInnardsAssignment_2()); 

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
    // InternalTraceryLanguage.g:891:1: rule__StartValue__Group__3 : rule__StartValue__Group__3__Impl ;
    public final void rule__StartValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:895:1: ( rule__StartValue__Group__3__Impl )
            // InternalTraceryLanguage.g:896:2: rule__StartValue__Group__3__Impl
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
    // InternalTraceryLanguage.g:902:1: rule__StartValue__Group__3__Impl : ( '&' ) ;
    public final void rule__StartValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:906:1: ( ( '&' ) )
            // InternalTraceryLanguage.g:907:1: ( '&' )
            {
            // InternalTraceryLanguage.g:907:1: ( '&' )
            // InternalTraceryLanguage.g:908:2: '&'
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
    // InternalTraceryLanguage.g:918:1: rule__NormalValue__Group__0 : rule__NormalValue__Group__0__Impl rule__NormalValue__Group__1 ;
    public final void rule__NormalValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:922:1: ( rule__NormalValue__Group__0__Impl rule__NormalValue__Group__1 )
            // InternalTraceryLanguage.g:923:2: rule__NormalValue__Group__0__Impl rule__NormalValue__Group__1
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
    // InternalTraceryLanguage.g:930:1: rule__NormalValue__Group__0__Impl : ( () ) ;
    public final void rule__NormalValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:934:1: ( ( () ) )
            // InternalTraceryLanguage.g:935:1: ( () )
            {
            // InternalTraceryLanguage.g:935:1: ( () )
            // InternalTraceryLanguage.g:936:2: ()
            {
             before(grammarAccess.getNormalValueAccess().getNormalValueAction_0()); 
            // InternalTraceryLanguage.g:937:2: ()
            // InternalTraceryLanguage.g:937:3: 
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
    // InternalTraceryLanguage.g:945:1: rule__NormalValue__Group__1 : rule__NormalValue__Group__1__Impl rule__NormalValue__Group__2 ;
    public final void rule__NormalValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:949:1: ( rule__NormalValue__Group__1__Impl rule__NormalValue__Group__2 )
            // InternalTraceryLanguage.g:950:2: rule__NormalValue__Group__1__Impl rule__NormalValue__Group__2
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
    // InternalTraceryLanguage.g:957:1: rule__NormalValue__Group__1__Impl : ( ',' ) ;
    public final void rule__NormalValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:961:1: ( ( ',' ) )
            // InternalTraceryLanguage.g:962:1: ( ',' )
            {
            // InternalTraceryLanguage.g:962:1: ( ',' )
            // InternalTraceryLanguage.g:963:2: ','
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
    // InternalTraceryLanguage.g:972:1: rule__NormalValue__Group__2 : rule__NormalValue__Group__2__Impl rule__NormalValue__Group__3 ;
    public final void rule__NormalValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:976:1: ( rule__NormalValue__Group__2__Impl rule__NormalValue__Group__3 )
            // InternalTraceryLanguage.g:977:2: rule__NormalValue__Group__2__Impl rule__NormalValue__Group__3
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
    // InternalTraceryLanguage.g:984:1: rule__NormalValue__Group__2__Impl : ( '&' ) ;
    public final void rule__NormalValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:988:1: ( ( '&' ) )
            // InternalTraceryLanguage.g:989:1: ( '&' )
            {
            // InternalTraceryLanguage.g:989:1: ( '&' )
            // InternalTraceryLanguage.g:990:2: '&'
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
    // InternalTraceryLanguage.g:999:1: rule__NormalValue__Group__3 : rule__NormalValue__Group__3__Impl rule__NormalValue__Group__4 ;
    public final void rule__NormalValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1003:1: ( rule__NormalValue__Group__3__Impl rule__NormalValue__Group__4 )
            // InternalTraceryLanguage.g:1004:2: rule__NormalValue__Group__3__Impl rule__NormalValue__Group__4
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
    // InternalTraceryLanguage.g:1011:1: rule__NormalValue__Group__3__Impl : ( ( rule__NormalValue__InnardsAssignment_3 )* ) ;
    public final void rule__NormalValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1015:1: ( ( ( rule__NormalValue__InnardsAssignment_3 )* ) )
            // InternalTraceryLanguage.g:1016:1: ( ( rule__NormalValue__InnardsAssignment_3 )* )
            {
            // InternalTraceryLanguage.g:1016:1: ( ( rule__NormalValue__InnardsAssignment_3 )* )
            // InternalTraceryLanguage.g:1017:2: ( rule__NormalValue__InnardsAssignment_3 )*
            {
             before(grammarAccess.getNormalValueAccess().getInnardsAssignment_3()); 
            // InternalTraceryLanguage.g:1018:2: ( rule__NormalValue__InnardsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_STRING||LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTraceryLanguage.g:1018:3: rule__NormalValue__InnardsAssignment_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__NormalValue__InnardsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getNormalValueAccess().getInnardsAssignment_3()); 

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
    // InternalTraceryLanguage.g:1026:1: rule__NormalValue__Group__4 : rule__NormalValue__Group__4__Impl ;
    public final void rule__NormalValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1030:1: ( rule__NormalValue__Group__4__Impl )
            // InternalTraceryLanguage.g:1031:2: rule__NormalValue__Group__4__Impl
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
    // InternalTraceryLanguage.g:1037:1: rule__NormalValue__Group__4__Impl : ( '&' ) ;
    public final void rule__NormalValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1041:1: ( ( '&' ) )
            // InternalTraceryLanguage.g:1042:1: ( '&' )
            {
            // InternalTraceryLanguage.g:1042:1: ( '&' )
            // InternalTraceryLanguage.g:1043:2: '&'
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
    // InternalTraceryLanguage.g:1053:1: rule__InnerStatement__Group_1__0 : rule__InnerStatement__Group_1__0__Impl rule__InnerStatement__Group_1__1 ;
    public final void rule__InnerStatement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1057:1: ( rule__InnerStatement__Group_1__0__Impl rule__InnerStatement__Group_1__1 )
            // InternalTraceryLanguage.g:1058:2: rule__InnerStatement__Group_1__0__Impl rule__InnerStatement__Group_1__1
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
    // InternalTraceryLanguage.g:1065:1: rule__InnerStatement__Group_1__0__Impl : ( '#' ) ;
    public final void rule__InnerStatement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1069:1: ( ( '#' ) )
            // InternalTraceryLanguage.g:1070:1: ( '#' )
            {
            // InternalTraceryLanguage.g:1070:1: ( '#' )
            // InternalTraceryLanguage.g:1071:2: '#'
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
    // InternalTraceryLanguage.g:1080:1: rule__InnerStatement__Group_1__1 : rule__InnerStatement__Group_1__1__Impl rule__InnerStatement__Group_1__2 ;
    public final void rule__InnerStatement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1084:1: ( rule__InnerStatement__Group_1__1__Impl rule__InnerStatement__Group_1__2 )
            // InternalTraceryLanguage.g:1085:2: rule__InnerStatement__Group_1__1__Impl rule__InnerStatement__Group_1__2
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
    // InternalTraceryLanguage.g:1092:1: rule__InnerStatement__Group_1__1__Impl : ( ruleVariableDecleration ) ;
    public final void rule__InnerStatement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1096:1: ( ( ruleVariableDecleration ) )
            // InternalTraceryLanguage.g:1097:1: ( ruleVariableDecleration )
            {
            // InternalTraceryLanguage.g:1097:1: ( ruleVariableDecleration )
            // InternalTraceryLanguage.g:1098:2: ruleVariableDecleration
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
    // InternalTraceryLanguage.g:1107:1: rule__InnerStatement__Group_1__2 : rule__InnerStatement__Group_1__2__Impl ;
    public final void rule__InnerStatement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1111:1: ( rule__InnerStatement__Group_1__2__Impl )
            // InternalTraceryLanguage.g:1112:2: rule__InnerStatement__Group_1__2__Impl
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
    // InternalTraceryLanguage.g:1118:1: rule__InnerStatement__Group_1__2__Impl : ( '#' ) ;
    public final void rule__InnerStatement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1122:1: ( ( '#' ) )
            // InternalTraceryLanguage.g:1123:1: ( '#' )
            {
            // InternalTraceryLanguage.g:1123:1: ( '#' )
            // InternalTraceryLanguage.g:1124:2: '#'
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
    // InternalTraceryLanguage.g:1134:1: rule__InnerStatement__Group_2__0 : rule__InnerStatement__Group_2__0__Impl rule__InnerStatement__Group_2__1 ;
    public final void rule__InnerStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1138:1: ( rule__InnerStatement__Group_2__0__Impl rule__InnerStatement__Group_2__1 )
            // InternalTraceryLanguage.g:1139:2: rule__InnerStatement__Group_2__0__Impl rule__InnerStatement__Group_2__1
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
    // InternalTraceryLanguage.g:1146:1: rule__InnerStatement__Group_2__0__Impl : ( '#' ) ;
    public final void rule__InnerStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1150:1: ( ( '#' ) )
            // InternalTraceryLanguage.g:1151:1: ( '#' )
            {
            // InternalTraceryLanguage.g:1151:1: ( '#' )
            // InternalTraceryLanguage.g:1152:2: '#'
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
    // InternalTraceryLanguage.g:1161:1: rule__InnerStatement__Group_2__1 : rule__InnerStatement__Group_2__1__Impl rule__InnerStatement__Group_2__2 ;
    public final void rule__InnerStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1165:1: ( rule__InnerStatement__Group_2__1__Impl rule__InnerStatement__Group_2__2 )
            // InternalTraceryLanguage.g:1166:2: rule__InnerStatement__Group_2__1__Impl rule__InnerStatement__Group_2__2
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
    // InternalTraceryLanguage.g:1173:1: rule__InnerStatement__Group_2__1__Impl : ( ruleVariableDecleration ) ;
    public final void rule__InnerStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1177:1: ( ( ruleVariableDecleration ) )
            // InternalTraceryLanguage.g:1178:1: ( ruleVariableDecleration )
            {
            // InternalTraceryLanguage.g:1178:1: ( ruleVariableDecleration )
            // InternalTraceryLanguage.g:1179:2: ruleVariableDecleration
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
    // InternalTraceryLanguage.g:1188:1: rule__InnerStatement__Group_2__2 : rule__InnerStatement__Group_2__2__Impl ;
    public final void rule__InnerStatement__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1192:1: ( rule__InnerStatement__Group_2__2__Impl )
            // InternalTraceryLanguage.g:1193:2: rule__InnerStatement__Group_2__2__Impl
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
    // InternalTraceryLanguage.g:1199:1: rule__InnerStatement__Group_2__2__Impl : ( '.ed#' ) ;
    public final void rule__InnerStatement__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1203:1: ( ( '.ed#' ) )
            // InternalTraceryLanguage.g:1204:1: ( '.ed#' )
            {
            // InternalTraceryLanguage.g:1204:1: ( '.ed#' )
            // InternalTraceryLanguage.g:1205:2: '.ed#'
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
    // InternalTraceryLanguage.g:1215:1: rule__InnerStatement__Group_3__0 : rule__InnerStatement__Group_3__0__Impl rule__InnerStatement__Group_3__1 ;
    public final void rule__InnerStatement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1219:1: ( rule__InnerStatement__Group_3__0__Impl rule__InnerStatement__Group_3__1 )
            // InternalTraceryLanguage.g:1220:2: rule__InnerStatement__Group_3__0__Impl rule__InnerStatement__Group_3__1
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
    // InternalTraceryLanguage.g:1227:1: rule__InnerStatement__Group_3__0__Impl : ( '#' ) ;
    public final void rule__InnerStatement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1231:1: ( ( '#' ) )
            // InternalTraceryLanguage.g:1232:1: ( '#' )
            {
            // InternalTraceryLanguage.g:1232:1: ( '#' )
            // InternalTraceryLanguage.g:1233:2: '#'
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
    // InternalTraceryLanguage.g:1242:1: rule__InnerStatement__Group_3__1 : rule__InnerStatement__Group_3__1__Impl rule__InnerStatement__Group_3__2 ;
    public final void rule__InnerStatement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1246:1: ( rule__InnerStatement__Group_3__1__Impl rule__InnerStatement__Group_3__2 )
            // InternalTraceryLanguage.g:1247:2: rule__InnerStatement__Group_3__1__Impl rule__InnerStatement__Group_3__2
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
    // InternalTraceryLanguage.g:1254:1: rule__InnerStatement__Group_3__1__Impl : ( ruleVariableDecleration ) ;
    public final void rule__InnerStatement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1258:1: ( ( ruleVariableDecleration ) )
            // InternalTraceryLanguage.g:1259:1: ( ruleVariableDecleration )
            {
            // InternalTraceryLanguage.g:1259:1: ( ruleVariableDecleration )
            // InternalTraceryLanguage.g:1260:2: ruleVariableDecleration
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
    // InternalTraceryLanguage.g:1269:1: rule__InnerStatement__Group_3__2 : rule__InnerStatement__Group_3__2__Impl ;
    public final void rule__InnerStatement__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1273:1: ( rule__InnerStatement__Group_3__2__Impl )
            // InternalTraceryLanguage.g:1274:2: rule__InnerStatement__Group_3__2__Impl
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
    // InternalTraceryLanguage.g:1280:1: rule__InnerStatement__Group_3__2__Impl : ( '.a#' ) ;
    public final void rule__InnerStatement__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1284:1: ( ( '.a#' ) )
            // InternalTraceryLanguage.g:1285:1: ( '.a#' )
            {
            // InternalTraceryLanguage.g:1285:1: ( '.a#' )
            // InternalTraceryLanguage.g:1286:2: '.a#'
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
    // InternalTraceryLanguage.g:1296:1: rule__InnerStatement__Group_4__0 : rule__InnerStatement__Group_4__0__Impl rule__InnerStatement__Group_4__1 ;
    public final void rule__InnerStatement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1300:1: ( rule__InnerStatement__Group_4__0__Impl rule__InnerStatement__Group_4__1 )
            // InternalTraceryLanguage.g:1301:2: rule__InnerStatement__Group_4__0__Impl rule__InnerStatement__Group_4__1
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
    // InternalTraceryLanguage.g:1308:1: rule__InnerStatement__Group_4__0__Impl : ( '#' ) ;
    public final void rule__InnerStatement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1312:1: ( ( '#' ) )
            // InternalTraceryLanguage.g:1313:1: ( '#' )
            {
            // InternalTraceryLanguage.g:1313:1: ( '#' )
            // InternalTraceryLanguage.g:1314:2: '#'
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
    // InternalTraceryLanguage.g:1323:1: rule__InnerStatement__Group_4__1 : rule__InnerStatement__Group_4__1__Impl rule__InnerStatement__Group_4__2 ;
    public final void rule__InnerStatement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1327:1: ( rule__InnerStatement__Group_4__1__Impl rule__InnerStatement__Group_4__2 )
            // InternalTraceryLanguage.g:1328:2: rule__InnerStatement__Group_4__1__Impl rule__InnerStatement__Group_4__2
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
    // InternalTraceryLanguage.g:1335:1: rule__InnerStatement__Group_4__1__Impl : ( ruleVariableDecleration ) ;
    public final void rule__InnerStatement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1339:1: ( ( ruleVariableDecleration ) )
            // InternalTraceryLanguage.g:1340:1: ( ruleVariableDecleration )
            {
            // InternalTraceryLanguage.g:1340:1: ( ruleVariableDecleration )
            // InternalTraceryLanguage.g:1341:2: ruleVariableDecleration
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
    // InternalTraceryLanguage.g:1350:1: rule__InnerStatement__Group_4__2 : rule__InnerStatement__Group_4__2__Impl ;
    public final void rule__InnerStatement__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1354:1: ( rule__InnerStatement__Group_4__2__Impl )
            // InternalTraceryLanguage.g:1355:2: rule__InnerStatement__Group_4__2__Impl
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
    // InternalTraceryLanguage.g:1361:1: rule__InnerStatement__Group_4__2__Impl : ( '.the#' ) ;
    public final void rule__InnerStatement__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1365:1: ( ( '.the#' ) )
            // InternalTraceryLanguage.g:1366:1: ( '.the#' )
            {
            // InternalTraceryLanguage.g:1366:1: ( '.the#' )
            // InternalTraceryLanguage.g:1367:2: '.the#'
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
    // InternalTraceryLanguage.g:1377:1: rule__InnerStatement__Group_5__0 : rule__InnerStatement__Group_5__0__Impl rule__InnerStatement__Group_5__1 ;
    public final void rule__InnerStatement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1381:1: ( rule__InnerStatement__Group_5__0__Impl rule__InnerStatement__Group_5__1 )
            // InternalTraceryLanguage.g:1382:2: rule__InnerStatement__Group_5__0__Impl rule__InnerStatement__Group_5__1
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
    // InternalTraceryLanguage.g:1389:1: rule__InnerStatement__Group_5__0__Impl : ( '#' ) ;
    public final void rule__InnerStatement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1393:1: ( ( '#' ) )
            // InternalTraceryLanguage.g:1394:1: ( '#' )
            {
            // InternalTraceryLanguage.g:1394:1: ( '#' )
            // InternalTraceryLanguage.g:1395:2: '#'
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
    // InternalTraceryLanguage.g:1404:1: rule__InnerStatement__Group_5__1 : rule__InnerStatement__Group_5__1__Impl rule__InnerStatement__Group_5__2 ;
    public final void rule__InnerStatement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1408:1: ( rule__InnerStatement__Group_5__1__Impl rule__InnerStatement__Group_5__2 )
            // InternalTraceryLanguage.g:1409:2: rule__InnerStatement__Group_5__1__Impl rule__InnerStatement__Group_5__2
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
    // InternalTraceryLanguage.g:1416:1: rule__InnerStatement__Group_5__1__Impl : ( ruleVariableDecleration ) ;
    public final void rule__InnerStatement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1420:1: ( ( ruleVariableDecleration ) )
            // InternalTraceryLanguage.g:1421:1: ( ruleVariableDecleration )
            {
            // InternalTraceryLanguage.g:1421:1: ( ruleVariableDecleration )
            // InternalTraceryLanguage.g:1422:2: ruleVariableDecleration
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
    // InternalTraceryLanguage.g:1431:1: rule__InnerStatement__Group_5__2 : rule__InnerStatement__Group_5__2__Impl ;
    public final void rule__InnerStatement__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1435:1: ( rule__InnerStatement__Group_5__2__Impl )
            // InternalTraceryLanguage.g:1436:2: rule__InnerStatement__Group_5__2__Impl
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
    // InternalTraceryLanguage.g:1442:1: rule__InnerStatement__Group_5__2__Impl : ( '.capitalise#' ) ;
    public final void rule__InnerStatement__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1446:1: ( ( '.capitalise#' ) )
            // InternalTraceryLanguage.g:1447:1: ( '.capitalise#' )
            {
            // InternalTraceryLanguage.g:1447:1: ( '.capitalise#' )
            // InternalTraceryLanguage.g:1448:2: '.capitalise#'
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


    // $ANTLR start "rule__TraceryProgram__InitialStatementAssignment_1"
    // InternalTraceryLanguage.g:1458:1: rule__TraceryProgram__InitialStatementAssignment_1 : ( ruleInitialStatement ) ;
    public final void rule__TraceryProgram__InitialStatementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1462:1: ( ( ruleInitialStatement ) )
            // InternalTraceryLanguage.g:1463:2: ( ruleInitialStatement )
            {
            // InternalTraceryLanguage.g:1463:2: ( ruleInitialStatement )
            // InternalTraceryLanguage.g:1464:3: ruleInitialStatement
            {
             before(grammarAccess.getTraceryProgramAccess().getInitialStatementInitialStatementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInitialStatement();

            state._fsp--;

             after(grammarAccess.getTraceryProgramAccess().getInitialStatementInitialStatementParserRuleCall_1_0()); 

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


    // $ANTLR start "rule__TraceryProgram__StatementsAssignment_2"
    // InternalTraceryLanguage.g:1473:1: rule__TraceryProgram__StatementsAssignment_2 : ( ruleStatement ) ;
    public final void rule__TraceryProgram__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1477:1: ( ( ruleStatement ) )
            // InternalTraceryLanguage.g:1478:2: ( ruleStatement )
            {
            // InternalTraceryLanguage.g:1478:2: ( ruleStatement )
            // InternalTraceryLanguage.g:1479:3: ruleStatement
            {
             before(grammarAccess.getTraceryProgramAccess().getStatementsStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getTraceryProgramAccess().getStatementsStatementParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__TraceryProgram__StatementsAssignment_2"


    // $ANTLR start "rule__VariableDecleration__NameAssignment"
    // InternalTraceryLanguage.g:1488:1: rule__VariableDecleration__NameAssignment : ( RULE_ID ) ;
    public final void rule__VariableDecleration__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1492:1: ( ( RULE_ID ) )
            // InternalTraceryLanguage.g:1493:2: ( RULE_ID )
            {
            // InternalTraceryLanguage.g:1493:2: ( RULE_ID )
            // InternalTraceryLanguage.g:1494:3: RULE_ID
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


    // $ANTLR start "rule__InitialStatement__StartValAssignment_3"
    // InternalTraceryLanguage.g:1503:1: rule__InitialStatement__StartValAssignment_3 : ( rulestartValue ) ;
    public final void rule__InitialStatement__StartValAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1507:1: ( ( rulestartValue ) )
            // InternalTraceryLanguage.g:1508:2: ( rulestartValue )
            {
            // InternalTraceryLanguage.g:1508:2: ( rulestartValue )
            // InternalTraceryLanguage.g:1509:3: rulestartValue
            {
             before(grammarAccess.getInitialStatementAccess().getStartValStartValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulestartValue();

            state._fsp--;

             after(grammarAccess.getInitialStatementAccess().getStartValStartValueParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__InitialStatement__StartValAssignment_3"


    // $ANTLR start "rule__InitialStatement__ValsAssignment_4"
    // InternalTraceryLanguage.g:1518:1: rule__InitialStatement__ValsAssignment_4 : ( rulenormalValue ) ;
    public final void rule__InitialStatement__ValsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1522:1: ( ( rulenormalValue ) )
            // InternalTraceryLanguage.g:1523:2: ( rulenormalValue )
            {
            // InternalTraceryLanguage.g:1523:2: ( rulenormalValue )
            // InternalTraceryLanguage.g:1524:3: rulenormalValue
            {
             before(grammarAccess.getInitialStatementAccess().getValsNormalValueParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulenormalValue();

            state._fsp--;

             after(grammarAccess.getInitialStatementAccess().getValsNormalValueParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__InitialStatement__ValsAssignment_4"


    // $ANTLR start "rule__Statement__StartValAssignment_6"
    // InternalTraceryLanguage.g:1533:1: rule__Statement__StartValAssignment_6 : ( rulestartValue ) ;
    public final void rule__Statement__StartValAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1537:1: ( ( rulestartValue ) )
            // InternalTraceryLanguage.g:1538:2: ( rulestartValue )
            {
            // InternalTraceryLanguage.g:1538:2: ( rulestartValue )
            // InternalTraceryLanguage.g:1539:3: rulestartValue
            {
             before(grammarAccess.getStatementAccess().getStartValStartValueParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulestartValue();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getStartValStartValueParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Statement__StartValAssignment_6"


    // $ANTLR start "rule__Statement__ValsAssignment_7"
    // InternalTraceryLanguage.g:1548:1: rule__Statement__ValsAssignment_7 : ( rulenormalValue ) ;
    public final void rule__Statement__ValsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1552:1: ( ( rulenormalValue ) )
            // InternalTraceryLanguage.g:1553:2: ( rulenormalValue )
            {
            // InternalTraceryLanguage.g:1553:2: ( rulenormalValue )
            // InternalTraceryLanguage.g:1554:3: rulenormalValue
            {
             before(grammarAccess.getStatementAccess().getValsNormalValueParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            rulenormalValue();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getValsNormalValueParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Statement__ValsAssignment_7"


    // $ANTLR start "rule__StartValue__InnardsAssignment_2"
    // InternalTraceryLanguage.g:1563:1: rule__StartValue__InnardsAssignment_2 : ( ruleInnerStatement ) ;
    public final void rule__StartValue__InnardsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1567:1: ( ( ruleInnerStatement ) )
            // InternalTraceryLanguage.g:1568:2: ( ruleInnerStatement )
            {
            // InternalTraceryLanguage.g:1568:2: ( ruleInnerStatement )
            // InternalTraceryLanguage.g:1569:3: ruleInnerStatement
            {
             before(grammarAccess.getStartValueAccess().getInnardsInnerStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInnerStatement();

            state._fsp--;

             after(grammarAccess.getStartValueAccess().getInnardsInnerStatementParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__StartValue__InnardsAssignment_2"


    // $ANTLR start "rule__NormalValue__InnardsAssignment_3"
    // InternalTraceryLanguage.g:1578:1: rule__NormalValue__InnardsAssignment_3 : ( ruleInnerStatement ) ;
    public final void rule__NormalValue__InnardsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1582:1: ( ( ruleInnerStatement ) )
            // InternalTraceryLanguage.g:1583:2: ( ruleInnerStatement )
            {
            // InternalTraceryLanguage.g:1583:2: ( ruleInnerStatement )
            // InternalTraceryLanguage.g:1584:3: ruleInnerStatement
            {
             before(grammarAccess.getNormalValueAccess().getInnardsInnerStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInnerStatement();

            state._fsp--;

             after(grammarAccess.getNormalValueAccess().getInnardsInnerStatementParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__NormalValue__InnardsAssignment_3"


    // $ANTLR start "rule__InnerStatement__ValueAssignment_0"
    // InternalTraceryLanguage.g:1593:1: rule__InnerStatement__ValueAssignment_0 : ( RULE_STRING ) ;
    public final void rule__InnerStatement__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1597:1: ( ( RULE_STRING ) )
            // InternalTraceryLanguage.g:1598:2: ( RULE_STRING )
            {
            // InternalTraceryLanguage.g:1598:2: ( RULE_STRING )
            // InternalTraceryLanguage.g:1599:3: RULE_STRING
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
    // InternalTraceryLanguage.g:1608:1: rule__StartingJSONExpression__VarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__StartingJSONExpression__VarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryLanguage.g:1612:1: ( ( ( RULE_ID ) ) )
            // InternalTraceryLanguage.g:1613:2: ( ( RULE_ID ) )
            {
            // InternalTraceryLanguage.g:1613:2: ( ( RULE_ID ) )
            // InternalTraceryLanguage.g:1614:3: ( RULE_ID )
            {
             before(grammarAccess.getStartingJSONExpressionAccess().getVarVariableDeclerationCrossReference_0()); 
            // InternalTraceryLanguage.g:1615:3: ( RULE_ID )
            // InternalTraceryLanguage.g:1616:4: RULE_ID
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
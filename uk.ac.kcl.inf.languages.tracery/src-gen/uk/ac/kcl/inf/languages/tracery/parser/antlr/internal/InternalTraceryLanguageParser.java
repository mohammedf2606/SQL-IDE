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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTraceryLanguageParser extends AbstractInternalAntlrParser {
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




    // $ANTLR start "entryRuleTraceryProgram"
    // InternalTraceryLanguage.g:64:1: entryRuleTraceryProgram returns [EObject current=null] : iv_ruleTraceryProgram= ruleTraceryProgram EOF ;
    public final EObject entryRuleTraceryProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceryProgram = null;


        try {
            // InternalTraceryLanguage.g:64:55: (iv_ruleTraceryProgram= ruleTraceryProgram EOF )
            // InternalTraceryLanguage.g:65:2: iv_ruleTraceryProgram= ruleTraceryProgram EOF
            {
             newCompositeNode(grammarAccess.getTraceryProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTraceryProgram=ruleTraceryProgram();

            state._fsp--;

             current =iv_ruleTraceryProgram; 
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
    // $ANTLR end "entryRuleTraceryProgram"


    // $ANTLR start "ruleTraceryProgram"
    // InternalTraceryLanguage.g:71:1: ruleTraceryProgram returns [EObject current=null] : (otherlv_0= '{' ( (lv_statements_1_0= ruleStatement ) ) otherlv_2= '}' ) ;
    public final EObject ruleTraceryProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_statements_1_0 = null;



        	enterRule();

        try {
            // InternalTraceryLanguage.g:77:2: ( (otherlv_0= '{' ( (lv_statements_1_0= ruleStatement ) ) otherlv_2= '}' ) )
            // InternalTraceryLanguage.g:78:2: (otherlv_0= '{' ( (lv_statements_1_0= ruleStatement ) ) otherlv_2= '}' )
            {
            // InternalTraceryLanguage.g:78:2: (otherlv_0= '{' ( (lv_statements_1_0= ruleStatement ) ) otherlv_2= '}' )
            // InternalTraceryLanguage.g:79:3: otherlv_0= '{' ( (lv_statements_1_0= ruleStatement ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTraceryProgramAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalTraceryLanguage.g:83:3: ( (lv_statements_1_0= ruleStatement ) )
            // InternalTraceryLanguage.g:84:4: (lv_statements_1_0= ruleStatement )
            {
            // InternalTraceryLanguage.g:84:4: (lv_statements_1_0= ruleStatement )
            // InternalTraceryLanguage.g:85:5: lv_statements_1_0= ruleStatement
            {

            					newCompositeNode(grammarAccess.getTraceryProgramAccess().getStatementsStatementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_statements_1_0=ruleStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTraceryProgramRule());
            					}
            					add(
            						current,
            						"statements",
            						lv_statements_1_0,
            						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.Statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getTraceryProgramAccess().getRightCurlyBracketKeyword_2());
            		

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
    // $ANTLR end "ruleTraceryProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalTraceryLanguage.g:110:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:112:2: (iv_ruleStatement= ruleStatement EOF )
            // InternalTraceryLanguage.g:113:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalTraceryLanguage.g:122:1: ruleStatement returns [EObject current=null] : ( ( (lv_initialStatement_0_0= ruleInitialJSONLines ) )* ( (lv_finalStatement_1_0= ruleFinalJSONLine ) ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_initialStatement_0_0 = null;

        EObject lv_finalStatement_1_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:129:2: ( ( ( (lv_initialStatement_0_0= ruleInitialJSONLines ) )* ( (lv_finalStatement_1_0= ruleFinalJSONLine ) ) ) )
            // InternalTraceryLanguage.g:130:2: ( ( (lv_initialStatement_0_0= ruleInitialJSONLines ) )* ( (lv_finalStatement_1_0= ruleFinalJSONLine ) ) )
            {
            // InternalTraceryLanguage.g:130:2: ( ( (lv_initialStatement_0_0= ruleInitialJSONLines ) )* ( (lv_finalStatement_1_0= ruleFinalJSONLine ) ) )
            // InternalTraceryLanguage.g:131:3: ( (lv_initialStatement_0_0= ruleInitialJSONLines ) )* ( (lv_finalStatement_1_0= ruleFinalJSONLine ) )
            {
            // InternalTraceryLanguage.g:131:3: ( (lv_initialStatement_0_0= ruleInitialJSONLines ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTraceryLanguage.g:132:4: (lv_initialStatement_0_0= ruleInitialJSONLines )
            	    {
            	    // InternalTraceryLanguage.g:132:4: (lv_initialStatement_0_0= ruleInitialJSONLines )
            	    // InternalTraceryLanguage.g:133:5: lv_initialStatement_0_0= ruleInitialJSONLines
            	    {

            	    					newCompositeNode(grammarAccess.getStatementAccess().getInitialStatementInitialJSONLinesParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_initialStatement_0_0=ruleInitialJSONLines();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"initialStatement",
            	    						lv_initialStatement_0_0,
            	    						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.InitialJSONLines");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalTraceryLanguage.g:150:3: ( (lv_finalStatement_1_0= ruleFinalJSONLine ) )
            // InternalTraceryLanguage.g:151:4: (lv_finalStatement_1_0= ruleFinalJSONLine )
            {
            // InternalTraceryLanguage.g:151:4: (lv_finalStatement_1_0= ruleFinalJSONLine )
            // InternalTraceryLanguage.g:152:5: lv_finalStatement_1_0= ruleFinalJSONLine
            {

            					newCompositeNode(grammarAccess.getStatementAccess().getFinalStatementFinalJSONLineParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_finalStatement_1_0=ruleFinalJSONLine();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatementRule());
            					}
            					set(
            						current,
            						"finalStatement",
            						lv_finalStatement_1_0,
            						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.FinalJSONLine");
            					afterParserOrEnumRuleCall();
            				

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleInitialJSONLines"
    // InternalTraceryLanguage.g:176:1: entryRuleInitialJSONLines returns [EObject current=null] : iv_ruleInitialJSONLines= ruleInitialJSONLines EOF ;
    public final EObject entryRuleInitialJSONLines() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialJSONLines = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:178:2: (iv_ruleInitialJSONLines= ruleInitialJSONLines EOF )
            // InternalTraceryLanguage.g:179:2: iv_ruleInitialJSONLines= ruleInitialJSONLines EOF
            {
             newCompositeNode(grammarAccess.getInitialJSONLinesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialJSONLines=ruleInitialJSONLines();

            state._fsp--;

             current =iv_ruleInitialJSONLines; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleInitialJSONLines"


    // $ANTLR start "ruleInitialJSONLines"
    // InternalTraceryLanguage.g:188:1: ruleInitialJSONLines returns [EObject current=null] : (otherlv_0= '&' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '&' otherlv_3= ':' ( (lv_value_4_0= ruleInitialJSONEnding ) ) ) ;
    public final EObject ruleInitialJSONLines() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_value_4_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:195:2: ( (otherlv_0= '&' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '&' otherlv_3= ':' ( (lv_value_4_0= ruleInitialJSONEnding ) ) ) )
            // InternalTraceryLanguage.g:196:2: (otherlv_0= '&' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '&' otherlv_3= ':' ( (lv_value_4_0= ruleInitialJSONEnding ) ) )
            {
            // InternalTraceryLanguage.g:196:2: (otherlv_0= '&' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '&' otherlv_3= ':' ( (lv_value_4_0= ruleInitialJSONEnding ) ) )
            // InternalTraceryLanguage.g:197:3: otherlv_0= '&' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '&' otherlv_3= ':' ( (lv_value_4_0= ruleInitialJSONEnding ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getInitialJSONLinesAccess().getAmpersandKeyword_0());
            		
            // InternalTraceryLanguage.g:201:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTraceryLanguage.g:202:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTraceryLanguage.g:202:4: (lv_name_1_0= RULE_ID )
            // InternalTraceryLanguage.g:203:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInitialJSONLinesAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitialJSONLinesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getInitialJSONLinesAccess().getAmpersandKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getInitialJSONLinesAccess().getColonKeyword_3());
            		
            // InternalTraceryLanguage.g:227:3: ( (lv_value_4_0= ruleInitialJSONEnding ) )
            // InternalTraceryLanguage.g:228:4: (lv_value_4_0= ruleInitialJSONEnding )
            {
            // InternalTraceryLanguage.g:228:4: (lv_value_4_0= ruleInitialJSONEnding )
            // InternalTraceryLanguage.g:229:5: lv_value_4_0= ruleInitialJSONEnding
            {

            					newCompositeNode(grammarAccess.getInitialJSONLinesAccess().getValueInitialJSONEndingParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_4_0=ruleInitialJSONEnding();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialJSONLinesRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_4_0,
            						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.InitialJSONEnding");
            					afterParserOrEnumRuleCall();
            				

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleInitialJSONLines"


    // $ANTLR start "entryRuleFinalJSONLine"
    // InternalTraceryLanguage.g:253:1: entryRuleFinalJSONLine returns [EObject current=null] : iv_ruleFinalJSONLine= ruleFinalJSONLine EOF ;
    public final EObject entryRuleFinalJSONLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinalJSONLine = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:255:2: (iv_ruleFinalJSONLine= ruleFinalJSONLine EOF )
            // InternalTraceryLanguage.g:256:2: iv_ruleFinalJSONLine= ruleFinalJSONLine EOF
            {
             newCompositeNode(grammarAccess.getFinalJSONLineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFinalJSONLine=ruleFinalJSONLine();

            state._fsp--;

             current =iv_ruleFinalJSONLine; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleFinalJSONLine"


    // $ANTLR start "ruleFinalJSONLine"
    // InternalTraceryLanguage.g:265:1: ruleFinalJSONLine returns [EObject current=null] : (otherlv_0= '&origin&' otherlv_1= ':' ( (lv_value_2_0= ruleFinalJSONEnding ) ) ) ;
    public final EObject ruleFinalJSONLine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:272:2: ( (otherlv_0= '&origin&' otherlv_1= ':' ( (lv_value_2_0= ruleFinalJSONEnding ) ) ) )
            // InternalTraceryLanguage.g:273:2: (otherlv_0= '&origin&' otherlv_1= ':' ( (lv_value_2_0= ruleFinalJSONEnding ) ) )
            {
            // InternalTraceryLanguage.g:273:2: (otherlv_0= '&origin&' otherlv_1= ':' ( (lv_value_2_0= ruleFinalJSONEnding ) ) )
            // InternalTraceryLanguage.g:274:3: otherlv_0= '&origin&' otherlv_1= ':' ( (lv_value_2_0= ruleFinalJSONEnding ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getFinalJSONLineAccess().getOriginKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFinalJSONLineAccess().getColonKeyword_1());
            		
            // InternalTraceryLanguage.g:282:3: ( (lv_value_2_0= ruleFinalJSONEnding ) )
            // InternalTraceryLanguage.g:283:4: (lv_value_2_0= ruleFinalJSONEnding )
            {
            // InternalTraceryLanguage.g:283:4: (lv_value_2_0= ruleFinalJSONEnding )
            // InternalTraceryLanguage.g:284:5: lv_value_2_0= ruleFinalJSONEnding
            {

            					newCompositeNode(grammarAccess.getFinalJSONLineAccess().getValueFinalJSONEndingParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleFinalJSONEnding();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFinalJSONLineRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.FinalJSONEnding");
            					afterParserOrEnumRuleCall();
            				

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleFinalJSONLine"


    // $ANTLR start "entryRuleInitialJSONEnding"
    // InternalTraceryLanguage.g:308:1: entryRuleInitialJSONEnding returns [EObject current=null] : iv_ruleInitialJSONEnding= ruleInitialJSONEnding EOF ;
    public final EObject entryRuleInitialJSONEnding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialJSONEnding = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:310:2: (iv_ruleInitialJSONEnding= ruleInitialJSONEnding EOF )
            // InternalTraceryLanguage.g:311:2: iv_ruleInitialJSONEnding= ruleInitialJSONEnding EOF
            {
             newCompositeNode(grammarAccess.getInitialJSONEndingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialJSONEnding=ruleInitialJSONEnding();

            state._fsp--;

             current =iv_ruleInitialJSONEnding; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleInitialJSONEnding"


    // $ANTLR start "ruleInitialJSONEnding"
    // InternalTraceryLanguage.g:320:1: ruleInitialJSONEnding returns [EObject current=null] : (otherlv_0= '[' this_StartValue_1= ruleStartValue ( (lv_vals_2_0= ruleNormalValue ) )* otherlv_3= ']' otherlv_4= ',' ) ;
    public final EObject ruleInitialJSONEnding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject this_StartValue_1 = null;

        EObject lv_vals_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:327:2: ( (otherlv_0= '[' this_StartValue_1= ruleStartValue ( (lv_vals_2_0= ruleNormalValue ) )* otherlv_3= ']' otherlv_4= ',' ) )
            // InternalTraceryLanguage.g:328:2: (otherlv_0= '[' this_StartValue_1= ruleStartValue ( (lv_vals_2_0= ruleNormalValue ) )* otherlv_3= ']' otherlv_4= ',' )
            {
            // InternalTraceryLanguage.g:328:2: (otherlv_0= '[' this_StartValue_1= ruleStartValue ( (lv_vals_2_0= ruleNormalValue ) )* otherlv_3= ']' otherlv_4= ',' )
            // InternalTraceryLanguage.g:329:3: otherlv_0= '[' this_StartValue_1= ruleStartValue ( (lv_vals_2_0= ruleNormalValue ) )* otherlv_3= ']' otherlv_4= ','
            {
            otherlv_0=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getInitialJSONEndingAccess().getLeftSquareBracketKeyword_0());
            		

            			newCompositeNode(grammarAccess.getInitialJSONEndingAccess().getStartValueParserRuleCall_1());
            		
            pushFollow(FOLLOW_9);
            this_StartValue_1=ruleStartValue();

            state._fsp--;


            			current = this_StartValue_1;
            			afterParserOrEnumRuleCall();
            		
            // InternalTraceryLanguage.g:341:3: ( (lv_vals_2_0= ruleNormalValue ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTraceryLanguage.g:342:4: (lv_vals_2_0= ruleNormalValue )
            	    {
            	    // InternalTraceryLanguage.g:342:4: (lv_vals_2_0= ruleNormalValue )
            	    // InternalTraceryLanguage.g:343:5: lv_vals_2_0= ruleNormalValue
            	    {

            	    					newCompositeNode(grammarAccess.getInitialJSONEndingAccess().getValsNormalValueParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_vals_2_0=ruleNormalValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInitialJSONEndingRule());
            	    					}
            	    					add(
            	    						current,
            	    						"vals",
            	    						lv_vals_2_0,
            	    						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.NormalValue");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getInitialJSONEndingAccess().getRightSquareBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getInitialJSONEndingAccess().getCommaKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleInitialJSONEnding"


    // $ANTLR start "entryRuleFinalJSONEnding"
    // InternalTraceryLanguage.g:375:1: entryRuleFinalJSONEnding returns [EObject current=null] : iv_ruleFinalJSONEnding= ruleFinalJSONEnding EOF ;
    public final EObject entryRuleFinalJSONEnding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinalJSONEnding = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:377:2: (iv_ruleFinalJSONEnding= ruleFinalJSONEnding EOF )
            // InternalTraceryLanguage.g:378:2: iv_ruleFinalJSONEnding= ruleFinalJSONEnding EOF
            {
             newCompositeNode(grammarAccess.getFinalJSONEndingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFinalJSONEnding=ruleFinalJSONEnding();

            state._fsp--;

             current =iv_ruleFinalJSONEnding; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleFinalJSONEnding"


    // $ANTLR start "ruleFinalJSONEnding"
    // InternalTraceryLanguage.g:387:1: ruleFinalJSONEnding returns [EObject current=null] : (otherlv_0= '[' this_StartValue_1= ruleStartValue ( (lv_vals_2_0= ruleNormalValue ) )* otherlv_3= ']' ) ;
    public final EObject ruleFinalJSONEnding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject this_StartValue_1 = null;

        EObject lv_vals_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:394:2: ( (otherlv_0= '[' this_StartValue_1= ruleStartValue ( (lv_vals_2_0= ruleNormalValue ) )* otherlv_3= ']' ) )
            // InternalTraceryLanguage.g:395:2: (otherlv_0= '[' this_StartValue_1= ruleStartValue ( (lv_vals_2_0= ruleNormalValue ) )* otherlv_3= ']' )
            {
            // InternalTraceryLanguage.g:395:2: (otherlv_0= '[' this_StartValue_1= ruleStartValue ( (lv_vals_2_0= ruleNormalValue ) )* otherlv_3= ']' )
            // InternalTraceryLanguage.g:396:3: otherlv_0= '[' this_StartValue_1= ruleStartValue ( (lv_vals_2_0= ruleNormalValue ) )* otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getFinalJSONEndingAccess().getLeftSquareBracketKeyword_0());
            		

            			newCompositeNode(grammarAccess.getFinalJSONEndingAccess().getStartValueParserRuleCall_1());
            		
            pushFollow(FOLLOW_9);
            this_StartValue_1=ruleStartValue();

            state._fsp--;


            			current = this_StartValue_1;
            			afterParserOrEnumRuleCall();
            		
            // InternalTraceryLanguage.g:408:3: ( (lv_vals_2_0= ruleNormalValue ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTraceryLanguage.g:409:4: (lv_vals_2_0= ruleNormalValue )
            	    {
            	    // InternalTraceryLanguage.g:409:4: (lv_vals_2_0= ruleNormalValue )
            	    // InternalTraceryLanguage.g:410:5: lv_vals_2_0= ruleNormalValue
            	    {

            	    					newCompositeNode(grammarAccess.getFinalJSONEndingAccess().getValsNormalValueParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_vals_2_0=ruleNormalValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFinalJSONEndingRule());
            	    					}
            	    					add(
            	    						current,
            	    						"vals",
            	    						lv_vals_2_0,
            	    						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.NormalValue");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFinalJSONEndingAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleFinalJSONEnding"


    // $ANTLR start "entryRuleStartValue"
    // InternalTraceryLanguage.g:438:1: entryRuleStartValue returns [EObject current=null] : iv_ruleStartValue= ruleStartValue EOF ;
    public final EObject entryRuleStartValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartValue = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:440:2: (iv_ruleStartValue= ruleStartValue EOF )
            // InternalTraceryLanguage.g:441:2: iv_ruleStartValue= ruleStartValue EOF
            {
             newCompositeNode(grammarAccess.getStartValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStartValue=ruleStartValue();

            state._fsp--;

             current =iv_ruleStartValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleStartValue"


    // $ANTLR start "ruleStartValue"
    // InternalTraceryLanguage.g:450:1: ruleStartValue returns [EObject current=null] : (otherlv_0= '&' ( (lv_valueInnerStatements_1_0= ruleInnerStatements ) )+ otherlv_2= '&' ) ;
    public final EObject ruleStartValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_valueInnerStatements_1_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:457:2: ( (otherlv_0= '&' ( (lv_valueInnerStatements_1_0= ruleInnerStatements ) )+ otherlv_2= '&' ) )
            // InternalTraceryLanguage.g:458:2: (otherlv_0= '&' ( (lv_valueInnerStatements_1_0= ruleInnerStatements ) )+ otherlv_2= '&' )
            {
            // InternalTraceryLanguage.g:458:2: (otherlv_0= '&' ( (lv_valueInnerStatements_1_0= ruleInnerStatements ) )+ otherlv_2= '&' )
            // InternalTraceryLanguage.g:459:3: otherlv_0= '&' ( (lv_valueInnerStatements_1_0= ruleInnerStatements ) )+ otherlv_2= '&'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getStartValueAccess().getAmpersandKeyword_0());
            		
            // InternalTraceryLanguage.g:463:3: ( (lv_valueInnerStatements_1_0= ruleInnerStatements ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING||LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTraceryLanguage.g:464:4: (lv_valueInnerStatements_1_0= ruleInnerStatements )
            	    {
            	    // InternalTraceryLanguage.g:464:4: (lv_valueInnerStatements_1_0= ruleInnerStatements )
            	    // InternalTraceryLanguage.g:465:5: lv_valueInnerStatements_1_0= ruleInnerStatements
            	    {

            	    					newCompositeNode(grammarAccess.getStartValueAccess().getValueInnerStatementsInnerStatementsParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_valueInnerStatements_1_0=ruleInnerStatements();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStartValueRule());
            	    					}
            	    					add(
            	    						current,
            	    						"valueInnerStatements",
            	    						lv_valueInnerStatements_1_0,
            	    						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.InnerStatements");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_2=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getStartValueAccess().getAmpersandKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleStartValue"


    // $ANTLR start "entryRuleNormalValue"
    // InternalTraceryLanguage.g:493:1: entryRuleNormalValue returns [EObject current=null] : iv_ruleNormalValue= ruleNormalValue EOF ;
    public final EObject entryRuleNormalValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalValue = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:495:2: (iv_ruleNormalValue= ruleNormalValue EOF )
            // InternalTraceryLanguage.g:496:2: iv_ruleNormalValue= ruleNormalValue EOF
            {
             newCompositeNode(grammarAccess.getNormalValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNormalValue=ruleNormalValue();

            state._fsp--;

             current =iv_ruleNormalValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNormalValue"


    // $ANTLR start "ruleNormalValue"
    // InternalTraceryLanguage.g:505:1: ruleNormalValue returns [EObject current=null] : (otherlv_0= ',' otherlv_1= '&' ( (lv_valueInnerStatements_2_0= ruleInnerStatements ) )+ otherlv_3= '&' ) ;
    public final EObject ruleNormalValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_valueInnerStatements_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:512:2: ( (otherlv_0= ',' otherlv_1= '&' ( (lv_valueInnerStatements_2_0= ruleInnerStatements ) )+ otherlv_3= '&' ) )
            // InternalTraceryLanguage.g:513:2: (otherlv_0= ',' otherlv_1= '&' ( (lv_valueInnerStatements_2_0= ruleInnerStatements ) )+ otherlv_3= '&' )
            {
            // InternalTraceryLanguage.g:513:2: (otherlv_0= ',' otherlv_1= '&' ( (lv_valueInnerStatements_2_0= ruleInnerStatements ) )+ otherlv_3= '&' )
            // InternalTraceryLanguage.g:514:3: otherlv_0= ',' otherlv_1= '&' ( (lv_valueInnerStatements_2_0= ruleInnerStatements ) )+ otherlv_3= '&'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getNormalValueAccess().getCommaKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getNormalValueAccess().getAmpersandKeyword_1());
            		
            // InternalTraceryLanguage.g:522:3: ( (lv_valueInnerStatements_2_0= ruleInnerStatements ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STRING||LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTraceryLanguage.g:523:4: (lv_valueInnerStatements_2_0= ruleInnerStatements )
            	    {
            	    // InternalTraceryLanguage.g:523:4: (lv_valueInnerStatements_2_0= ruleInnerStatements )
            	    // InternalTraceryLanguage.g:524:5: lv_valueInnerStatements_2_0= ruleInnerStatements
            	    {

            	    					newCompositeNode(grammarAccess.getNormalValueAccess().getValueInnerStatementsInnerStatementsParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_valueInnerStatements_2_0=ruleInnerStatements();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNormalValueRule());
            	    					}
            	    					add(
            	    						current,
            	    						"valueInnerStatements",
            	    						lv_valueInnerStatements_2_0,
            	    						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.InnerStatements");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getNormalValueAccess().getAmpersandKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNormalValue"


    // $ANTLR start "entryRuleInnerStatements"
    // InternalTraceryLanguage.g:552:1: entryRuleInnerStatements returns [EObject current=null] : iv_ruleInnerStatements= ruleInnerStatements EOF ;
    public final EObject entryRuleInnerStatements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInnerStatements = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:554:2: (iv_ruleInnerStatements= ruleInnerStatements EOF )
            // InternalTraceryLanguage.g:555:2: iv_ruleInnerStatements= ruleInnerStatements EOF
            {
             newCompositeNode(grammarAccess.getInnerStatementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInnerStatements=ruleInnerStatements();

            state._fsp--;

             current =iv_ruleInnerStatements; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleInnerStatements"


    // $ANTLR start "ruleInnerStatements"
    // InternalTraceryLanguage.g:564:1: ruleInnerStatements returns [EObject current=null] : (this_StringDeclaration_0= ruleStringDeclaration | this_DeclaredVariable_1= ruleDeclaredVariable ) ;
    public final EObject ruleInnerStatements() throws RecognitionException {
        EObject current = null;

        EObject this_StringDeclaration_0 = null;

        EObject this_DeclaredVariable_1 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:571:2: ( (this_StringDeclaration_0= ruleStringDeclaration | this_DeclaredVariable_1= ruleDeclaredVariable ) )
            // InternalTraceryLanguage.g:572:2: (this_StringDeclaration_0= ruleStringDeclaration | this_DeclaredVariable_1= ruleDeclaredVariable )
            {
            // InternalTraceryLanguage.g:572:2: (this_StringDeclaration_0= ruleStringDeclaration | this_DeclaredVariable_1= ruleDeclaredVariable )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalTraceryLanguage.g:573:3: this_StringDeclaration_0= ruleStringDeclaration
                    {

                    			newCompositeNode(grammarAccess.getInnerStatementsAccess().getStringDeclarationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringDeclaration_0=ruleStringDeclaration();

                    state._fsp--;


                    			current = this_StringDeclaration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTraceryLanguage.g:582:3: this_DeclaredVariable_1= ruleDeclaredVariable
                    {

                    			newCompositeNode(grammarAccess.getInnerStatementsAccess().getDeclaredVariableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeclaredVariable_1=ruleDeclaredVariable();

                    state._fsp--;


                    			current = this_DeclaredVariable_1;
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleInnerStatements"


    // $ANTLR start "entryRuleStringDeclaration"
    // InternalTraceryLanguage.g:597:1: entryRuleStringDeclaration returns [EObject current=null] : iv_ruleStringDeclaration= ruleStringDeclaration EOF ;
    public final EObject entryRuleStringDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringDeclaration = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:599:2: (iv_ruleStringDeclaration= ruleStringDeclaration EOF )
            // InternalTraceryLanguage.g:600:2: iv_ruleStringDeclaration= ruleStringDeclaration EOF
            {
             newCompositeNode(grammarAccess.getStringDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringDeclaration=ruleStringDeclaration();

            state._fsp--;

             current =iv_ruleStringDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleStringDeclaration"


    // $ANTLR start "ruleStringDeclaration"
    // InternalTraceryLanguage.g:609:1: ruleStringDeclaration returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:616:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalTraceryLanguage.g:617:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalTraceryLanguage.g:617:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalTraceryLanguage.g:618:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalTraceryLanguage.g:618:3: (lv_value_0_0= RULE_STRING )
            // InternalTraceryLanguage.g:619:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringDeclarationAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringDeclarationRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleStringDeclaration"


    // $ANTLR start "entryRuleDeclaredVariable"
    // InternalTraceryLanguage.g:641:1: entryRuleDeclaredVariable returns [EObject current=null] : iv_ruleDeclaredVariable= ruleDeclaredVariable EOF ;
    public final EObject entryRuleDeclaredVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredVariable = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:643:2: (iv_ruleDeclaredVariable= ruleDeclaredVariable EOF )
            // InternalTraceryLanguage.g:644:2: iv_ruleDeclaredVariable= ruleDeclaredVariable EOF
            {
             newCompositeNode(grammarAccess.getDeclaredVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaredVariable=ruleDeclaredVariable();

            state._fsp--;

             current =iv_ruleDeclaredVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaredVariable"


    // $ANTLR start "ruleDeclaredVariable"
    // InternalTraceryLanguage.g:653:1: ruleDeclaredVariable returns [EObject current=null] : (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) otherlv_2= '#' ) ;
    public final EObject ruleDeclaredVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:660:2: ( (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) otherlv_2= '#' ) )
            // InternalTraceryLanguage.g:661:2: (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) otherlv_2= '#' )
            {
            // InternalTraceryLanguage.g:661:2: (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) otherlv_2= '#' )
            // InternalTraceryLanguage.g:662:3: otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) otherlv_2= '#'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDeclaredVariableAccess().getNumberSignKeyword_0());
            		
            // InternalTraceryLanguage.g:666:3: ( (otherlv_1= RULE_ID ) )
            // InternalTraceryLanguage.g:667:4: (otherlv_1= RULE_ID )
            {
            // InternalTraceryLanguage.g:667:4: (otherlv_1= RULE_ID )
            // InternalTraceryLanguage.g:668:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeclaredVariableRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_1, grammarAccess.getDeclaredVariableAccess().getVariableInitialJSONLinesCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getDeclaredVariableAccess().getNumberSignKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleDeclaredVariable"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000082020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});

}
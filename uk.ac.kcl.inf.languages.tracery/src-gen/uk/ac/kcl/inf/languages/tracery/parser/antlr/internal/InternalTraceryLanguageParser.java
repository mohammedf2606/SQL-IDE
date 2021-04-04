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
    // InternalTraceryLanguage.g:71:1: ruleTraceryProgram returns [EObject current=null] : (otherlv_0= '{' ( (lv_initialStatement_1_0= ruleInitialJSONLine ) ) otherlv_2= '}' ) ;
    public final EObject ruleTraceryProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_initialStatement_1_0 = null;



        	enterRule();

        try {
            // InternalTraceryLanguage.g:77:2: ( (otherlv_0= '{' ( (lv_initialStatement_1_0= ruleInitialJSONLine ) ) otherlv_2= '}' ) )
            // InternalTraceryLanguage.g:78:2: (otherlv_0= '{' ( (lv_initialStatement_1_0= ruleInitialJSONLine ) ) otherlv_2= '}' )
            {
            // InternalTraceryLanguage.g:78:2: (otherlv_0= '{' ( (lv_initialStatement_1_0= ruleInitialJSONLine ) ) otherlv_2= '}' )
            // InternalTraceryLanguage.g:79:3: otherlv_0= '{' ( (lv_initialStatement_1_0= ruleInitialJSONLine ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTraceryProgramAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalTraceryLanguage.g:83:3: ( (lv_initialStatement_1_0= ruleInitialJSONLine ) )
            // InternalTraceryLanguage.g:84:4: (lv_initialStatement_1_0= ruleInitialJSONLine )
            {
            // InternalTraceryLanguage.g:84:4: (lv_initialStatement_1_0= ruleInitialJSONLine )
            // InternalTraceryLanguage.g:85:5: lv_initialStatement_1_0= ruleInitialJSONLine
            {

            					newCompositeNode(grammarAccess.getTraceryProgramAccess().getInitialStatementInitialJSONLineParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_initialStatement_1_0=ruleInitialJSONLine();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTraceryProgramRule());
            					}
            					add(
            						current,
            						"initialStatement",
            						lv_initialStatement_1_0,
            						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.InitialJSONLine");
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


    // $ANTLR start "entryRuleInitialJSONLine"
    // InternalTraceryLanguage.g:110:1: entryRuleInitialJSONLine returns [EObject current=null] : iv_ruleInitialJSONLine= ruleInitialJSONLine EOF ;
    public final EObject entryRuleInitialJSONLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialJSONLine = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:112:2: (iv_ruleInitialJSONLine= ruleInitialJSONLine EOF )
            // InternalTraceryLanguage.g:113:2: iv_ruleInitialJSONLine= ruleInitialJSONLine EOF
            {
             newCompositeNode(grammarAccess.getInitialJSONLineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialJSONLine=ruleInitialJSONLine();

            state._fsp--;

             current =iv_ruleInitialJSONLine; 
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
    // $ANTLR end "entryRuleInitialJSONLine"


    // $ANTLR start "ruleInitialJSONLine"
    // InternalTraceryLanguage.g:122:1: ruleInitialJSONLine returns [EObject current=null] : (otherlv_0= '&' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '&' otherlv_3= ':' ( (lv_value_4_0= ruleInitialJSONEnding ) ) ) ;
    public final EObject ruleInitialJSONLine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_value_4_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:129:2: ( (otherlv_0= '&' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '&' otherlv_3= ':' ( (lv_value_4_0= ruleInitialJSONEnding ) ) ) )
            // InternalTraceryLanguage.g:130:2: (otherlv_0= '&' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '&' otherlv_3= ':' ( (lv_value_4_0= ruleInitialJSONEnding ) ) )
            {
            // InternalTraceryLanguage.g:130:2: (otherlv_0= '&' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '&' otherlv_3= ':' ( (lv_value_4_0= ruleInitialJSONEnding ) ) )
            // InternalTraceryLanguage.g:131:3: otherlv_0= '&' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '&' otherlv_3= ':' ( (lv_value_4_0= ruleInitialJSONEnding ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getInitialJSONLineAccess().getAmpersandKeyword_0());
            		
            // InternalTraceryLanguage.g:135:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTraceryLanguage.g:136:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTraceryLanguage.g:136:4: (lv_name_1_0= RULE_ID )
            // InternalTraceryLanguage.g:137:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInitialJSONLineAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitialJSONLineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getInitialJSONLineAccess().getAmpersandKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getInitialJSONLineAccess().getColonKeyword_3());
            		
            // InternalTraceryLanguage.g:161:3: ( (lv_value_4_0= ruleInitialJSONEnding ) )
            // InternalTraceryLanguage.g:162:4: (lv_value_4_0= ruleInitialJSONEnding )
            {
            // InternalTraceryLanguage.g:162:4: (lv_value_4_0= ruleInitialJSONEnding )
            // InternalTraceryLanguage.g:163:5: lv_value_4_0= ruleInitialJSONEnding
            {

            					newCompositeNode(grammarAccess.getInitialJSONLineAccess().getValueInitialJSONEndingParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_4_0=ruleInitialJSONEnding();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialJSONLineRule());
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
    // $ANTLR end "ruleInitialJSONLine"


    // $ANTLR start "entryRuleInitialJSONEnding"
    // InternalTraceryLanguage.g:187:1: entryRuleInitialJSONEnding returns [EObject current=null] : iv_ruleInitialJSONEnding= ruleInitialJSONEnding EOF ;
    public final EObject entryRuleInitialJSONEnding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialJSONEnding = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:189:2: (iv_ruleInitialJSONEnding= ruleInitialJSONEnding EOF )
            // InternalTraceryLanguage.g:190:2: iv_ruleInitialJSONEnding= ruleInitialJSONEnding EOF
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
    // InternalTraceryLanguage.g:199:1: ruleInitialJSONEnding returns [EObject current=null] : (otherlv_0= '[' ( (lv_startVal_1_0= ruleStartValue ) ) ( (lv_vals_2_0= ruleNormalValue ) )* otherlv_3= ']' ) ;
    public final EObject ruleInitialJSONEnding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_startVal_1_0 = null;

        EObject lv_vals_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:206:2: ( (otherlv_0= '[' ( (lv_startVal_1_0= ruleStartValue ) ) ( (lv_vals_2_0= ruleNormalValue ) )* otherlv_3= ']' ) )
            // InternalTraceryLanguage.g:207:2: (otherlv_0= '[' ( (lv_startVal_1_0= ruleStartValue ) ) ( (lv_vals_2_0= ruleNormalValue ) )* otherlv_3= ']' )
            {
            // InternalTraceryLanguage.g:207:2: (otherlv_0= '[' ( (lv_startVal_1_0= ruleStartValue ) ) ( (lv_vals_2_0= ruleNormalValue ) )* otherlv_3= ']' )
            // InternalTraceryLanguage.g:208:3: otherlv_0= '[' ( (lv_startVal_1_0= ruleStartValue ) ) ( (lv_vals_2_0= ruleNormalValue ) )* otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInitialJSONEndingAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalTraceryLanguage.g:212:3: ( (lv_startVal_1_0= ruleStartValue ) )
            // InternalTraceryLanguage.g:213:4: (lv_startVal_1_0= ruleStartValue )
            {
            // InternalTraceryLanguage.g:213:4: (lv_startVal_1_0= ruleStartValue )
            // InternalTraceryLanguage.g:214:5: lv_startVal_1_0= ruleStartValue
            {

            					newCompositeNode(grammarAccess.getInitialJSONEndingAccess().getStartValStartValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_startVal_1_0=ruleStartValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialJSONEndingRule());
            					}
            					add(
            						current,
            						"startVal",
            						lv_startVal_1_0,
            						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.StartValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTraceryLanguage.g:231:3: ( (lv_vals_2_0= ruleNormalValue ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTraceryLanguage.g:232:4: (lv_vals_2_0= ruleNormalValue )
            	    {
            	    // InternalTraceryLanguage.g:232:4: (lv_vals_2_0= ruleNormalValue )
            	    // InternalTraceryLanguage.g:233:5: lv_vals_2_0= ruleNormalValue
            	    {

            	    					newCompositeNode(grammarAccess.getInitialJSONEndingAccess().getValsNormalValueParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_8);
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
            	    break loop1;
                }
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getInitialJSONEndingAccess().getRightSquareBracketKeyword_3());
            		

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


    // $ANTLR start "entryRuleStartValue"
    // InternalTraceryLanguage.g:261:1: entryRuleStartValue returns [EObject current=null] : iv_ruleStartValue= ruleStartValue EOF ;
    public final EObject entryRuleStartValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartValue = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:263:2: (iv_ruleStartValue= ruleStartValue EOF )
            // InternalTraceryLanguage.g:264:2: iv_ruleStartValue= ruleStartValue EOF
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
    // InternalTraceryLanguage.g:273:1: ruleStartValue returns [EObject current=null] : (otherlv_0= '&' ( (lv_valueInnerStatements_1_0= ruleInnerStatements ) ) otherlv_2= '&' ) ;
    public final EObject ruleStartValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_valueInnerStatements_1_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:280:2: ( (otherlv_0= '&' ( (lv_valueInnerStatements_1_0= ruleInnerStatements ) ) otherlv_2= '&' ) )
            // InternalTraceryLanguage.g:281:2: (otherlv_0= '&' ( (lv_valueInnerStatements_1_0= ruleInnerStatements ) ) otherlv_2= '&' )
            {
            // InternalTraceryLanguage.g:281:2: (otherlv_0= '&' ( (lv_valueInnerStatements_1_0= ruleInnerStatements ) ) otherlv_2= '&' )
            // InternalTraceryLanguage.g:282:3: otherlv_0= '&' ( (lv_valueInnerStatements_1_0= ruleInnerStatements ) ) otherlv_2= '&'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getStartValueAccess().getAmpersandKeyword_0());
            		
            // InternalTraceryLanguage.g:286:3: ( (lv_valueInnerStatements_1_0= ruleInnerStatements ) )
            // InternalTraceryLanguage.g:287:4: (lv_valueInnerStatements_1_0= ruleInnerStatements )
            {
            // InternalTraceryLanguage.g:287:4: (lv_valueInnerStatements_1_0= ruleInnerStatements )
            // InternalTraceryLanguage.g:288:5: lv_valueInnerStatements_1_0= ruleInnerStatements
            {

            					newCompositeNode(grammarAccess.getStartValueAccess().getValueInnerStatementsInnerStatementsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
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
    // InternalTraceryLanguage.g:316:1: entryRuleNormalValue returns [EObject current=null] : iv_ruleNormalValue= ruleNormalValue EOF ;
    public final EObject entryRuleNormalValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalValue = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:318:2: (iv_ruleNormalValue= ruleNormalValue EOF )
            // InternalTraceryLanguage.g:319:2: iv_ruleNormalValue= ruleNormalValue EOF
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
    // InternalTraceryLanguage.g:328:1: ruleNormalValue returns [EObject current=null] : (otherlv_0= ',' otherlv_1= '&' ( (lv_valueInnerStatements_2_0= ruleInnerStatements ) ) otherlv_3= '&' ) ;
    public final EObject ruleNormalValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_valueInnerStatements_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:335:2: ( (otherlv_0= ',' otherlv_1= '&' ( (lv_valueInnerStatements_2_0= ruleInnerStatements ) ) otherlv_3= '&' ) )
            // InternalTraceryLanguage.g:336:2: (otherlv_0= ',' otherlv_1= '&' ( (lv_valueInnerStatements_2_0= ruleInnerStatements ) ) otherlv_3= '&' )
            {
            // InternalTraceryLanguage.g:336:2: (otherlv_0= ',' otherlv_1= '&' ( (lv_valueInnerStatements_2_0= ruleInnerStatements ) ) otherlv_3= '&' )
            // InternalTraceryLanguage.g:337:3: otherlv_0= ',' otherlv_1= '&' ( (lv_valueInnerStatements_2_0= ruleInnerStatements ) ) otherlv_3= '&'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNormalValueAccess().getCommaKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getNormalValueAccess().getAmpersandKeyword_1());
            		
            // InternalTraceryLanguage.g:345:3: ( (lv_valueInnerStatements_2_0= ruleInnerStatements ) )
            // InternalTraceryLanguage.g:346:4: (lv_valueInnerStatements_2_0= ruleInnerStatements )
            {
            // InternalTraceryLanguage.g:346:4: (lv_valueInnerStatements_2_0= ruleInnerStatements )
            // InternalTraceryLanguage.g:347:5: lv_valueInnerStatements_2_0= ruleInnerStatements
            {

            					newCompositeNode(grammarAccess.getNormalValueAccess().getValueInnerStatementsInnerStatementsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
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
    // InternalTraceryLanguage.g:375:1: entryRuleInnerStatements returns [EObject current=null] : iv_ruleInnerStatements= ruleInnerStatements EOF ;
    public final EObject entryRuleInnerStatements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInnerStatements = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:377:2: (iv_ruleInnerStatements= ruleInnerStatements EOF )
            // InternalTraceryLanguage.g:378:2: iv_ruleInnerStatements= ruleInnerStatements EOF
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
    // InternalTraceryLanguage.g:387:1: ruleInnerStatements returns [EObject current=null] : ( ( (lv_val_0_0= RULE_STRING ) ) | this_DeclaredVariable_1= ruleDeclaredVariable ) ;
    public final EObject ruleInnerStatements() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;
        EObject this_DeclaredVariable_1 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:394:2: ( ( ( (lv_val_0_0= RULE_STRING ) ) | this_DeclaredVariable_1= ruleDeclaredVariable ) )
            // InternalTraceryLanguage.g:395:2: ( ( (lv_val_0_0= RULE_STRING ) ) | this_DeclaredVariable_1= ruleDeclaredVariable )
            {
            // InternalTraceryLanguage.g:395:2: ( ( (lv_val_0_0= RULE_STRING ) ) | this_DeclaredVariable_1= ruleDeclaredVariable )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTraceryLanguage.g:396:3: ( (lv_val_0_0= RULE_STRING ) )
                    {
                    // InternalTraceryLanguage.g:396:3: ( (lv_val_0_0= RULE_STRING ) )
                    // InternalTraceryLanguage.g:397:4: (lv_val_0_0= RULE_STRING )
                    {
                    // InternalTraceryLanguage.g:397:4: (lv_val_0_0= RULE_STRING )
                    // InternalTraceryLanguage.g:398:5: lv_val_0_0= RULE_STRING
                    {
                    lv_val_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_val_0_0, grammarAccess.getInnerStatementsAccess().getValSTRINGTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInnerStatementsRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"val",
                    						lv_val_0_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryLanguage.g:415:3: this_DeclaredVariable_1= ruleDeclaredVariable
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


    // $ANTLR start "entryRuleDeclaredVariable"
    // InternalTraceryLanguage.g:430:1: entryRuleDeclaredVariable returns [EObject current=null] : iv_ruleDeclaredVariable= ruleDeclaredVariable EOF ;
    public final EObject entryRuleDeclaredVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredVariable = null;


        try {
            // InternalTraceryLanguage.g:430:57: (iv_ruleDeclaredVariable= ruleDeclaredVariable EOF )
            // InternalTraceryLanguage.g:431:2: iv_ruleDeclaredVariable= ruleDeclaredVariable EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaredVariable"


    // $ANTLR start "ruleDeclaredVariable"
    // InternalTraceryLanguage.g:437:1: ruleDeclaredVariable returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleDeclaredVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalTraceryLanguage.g:443:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalTraceryLanguage.g:444:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalTraceryLanguage.g:444:2: ( (otherlv_0= RULE_ID ) )
            // InternalTraceryLanguage.g:445:3: (otherlv_0= RULE_ID )
            {
            // InternalTraceryLanguage.g:445:3: (otherlv_0= RULE_ID )
            // InternalTraceryLanguage.g:446:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getDeclaredVariableRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getDeclaredVariableAccess().getVarInitialJSONLineCrossReference_0());
            			

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
    // $ANTLR end "ruleDeclaredVariable"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});

}
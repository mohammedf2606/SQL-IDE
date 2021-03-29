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
    // InternalTraceryLanguage.g:71:1: ruleTraceryProgram returns [EObject current=null] : (otherlv_0= '{' ( (lv_initialStatement_1_0= ruleInitialStatement ) ) ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleTraceryProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_initialStatement_1_0 = null;

        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalTraceryLanguage.g:77:2: ( (otherlv_0= '{' ( (lv_initialStatement_1_0= ruleInitialStatement ) ) ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) )
            // InternalTraceryLanguage.g:78:2: (otherlv_0= '{' ( (lv_initialStatement_1_0= ruleInitialStatement ) ) ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            {
            // InternalTraceryLanguage.g:78:2: (otherlv_0= '{' ( (lv_initialStatement_1_0= ruleInitialStatement ) ) ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            // InternalTraceryLanguage.g:79:3: otherlv_0= '{' ( (lv_initialStatement_1_0= ruleInitialStatement ) ) ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTraceryProgramAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalTraceryLanguage.g:83:3: ( (lv_initialStatement_1_0= ruleInitialStatement ) )
            // InternalTraceryLanguage.g:84:4: (lv_initialStatement_1_0= ruleInitialStatement )
            {
            // InternalTraceryLanguage.g:84:4: (lv_initialStatement_1_0= ruleInitialStatement )
            // InternalTraceryLanguage.g:85:5: lv_initialStatement_1_0= ruleInitialStatement
            {

            					newCompositeNode(grammarAccess.getTraceryProgramAccess().getInitialStatementInitialStatementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_initialStatement_1_0=ruleInitialStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTraceryProgramRule());
            					}
            					set(
            						current,
            						"initialStatement",
            						lv_initialStatement_1_0,
            						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.InitialStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTraceryLanguage.g:102:3: ( (lv_statements_2_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTraceryLanguage.g:103:4: (lv_statements_2_0= ruleStatement )
            	    {
            	    // InternalTraceryLanguage.g:103:4: (lv_statements_2_0= ruleStatement )
            	    // InternalTraceryLanguage.g:104:5: lv_statements_2_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getTraceryProgramAccess().getStatementsStatementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_statements_2_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTraceryProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_2_0,
            	    						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_3=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTraceryProgramAccess().getRightCurlyBracketKeyword_3());
            		

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


    // $ANTLR start "entryRuleVariableDecleration"
    // InternalTraceryLanguage.g:129:1: entryRuleVariableDecleration returns [EObject current=null] : iv_ruleVariableDecleration= ruleVariableDecleration EOF ;
    public final EObject entryRuleVariableDecleration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDecleration = null;


        try {
            // InternalTraceryLanguage.g:129:60: (iv_ruleVariableDecleration= ruleVariableDecleration EOF )
            // InternalTraceryLanguage.g:130:2: iv_ruleVariableDecleration= ruleVariableDecleration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclerationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableDecleration=ruleVariableDecleration();

            state._fsp--;

             current =iv_ruleVariableDecleration; 
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
    // $ANTLR end "entryRuleVariableDecleration"


    // $ANTLR start "ruleVariableDecleration"
    // InternalTraceryLanguage.g:136:1: ruleVariableDecleration returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariableDecleration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalTraceryLanguage.g:142:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalTraceryLanguage.g:143:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalTraceryLanguage.g:143:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalTraceryLanguage.g:144:3: (lv_name_0_0= RULE_ID )
            {
            // InternalTraceryLanguage.g:144:3: (lv_name_0_0= RULE_ID )
            // InternalTraceryLanguage.g:145:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getVariableDeclerationAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableDeclerationRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleVariableDecleration"


    // $ANTLR start "entryRuleInitialStatement"
    // InternalTraceryLanguage.g:164:1: entryRuleInitialStatement returns [EObject current=null] : iv_ruleInitialStatement= ruleInitialStatement EOF ;
    public final EObject entryRuleInitialStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialStatement = null;


        try {
            // InternalTraceryLanguage.g:164:57: (iv_ruleInitialStatement= ruleInitialStatement EOF )
            // InternalTraceryLanguage.g:165:2: iv_ruleInitialStatement= ruleInitialStatement EOF
            {
             newCompositeNode(grammarAccess.getInitialStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialStatement=ruleInitialStatement();

            state._fsp--;

             current =iv_ruleInitialStatement; 
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
    // $ANTLR end "entryRuleInitialStatement"


    // $ANTLR start "ruleInitialStatement"
    // InternalTraceryLanguage.g:171:1: ruleInitialStatement returns [EObject current=null] : (otherlv_0= '&origin&' otherlv_1= ':' otherlv_2= '[' ( (lv_startVal_3_0= rulestartValue ) ) ( (lv_vals_4_0= rulenormalValue ) )* otherlv_5= ']' ) ;
    public final EObject ruleInitialStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_startVal_3_0 = null;

        EObject lv_vals_4_0 = null;



        	enterRule();

        try {
            // InternalTraceryLanguage.g:177:2: ( (otherlv_0= '&origin&' otherlv_1= ':' otherlv_2= '[' ( (lv_startVal_3_0= rulestartValue ) ) ( (lv_vals_4_0= rulenormalValue ) )* otherlv_5= ']' ) )
            // InternalTraceryLanguage.g:178:2: (otherlv_0= '&origin&' otherlv_1= ':' otherlv_2= '[' ( (lv_startVal_3_0= rulestartValue ) ) ( (lv_vals_4_0= rulenormalValue ) )* otherlv_5= ']' )
            {
            // InternalTraceryLanguage.g:178:2: (otherlv_0= '&origin&' otherlv_1= ':' otherlv_2= '[' ( (lv_startVal_3_0= rulestartValue ) ) ( (lv_vals_4_0= rulenormalValue ) )* otherlv_5= ']' )
            // InternalTraceryLanguage.g:179:3: otherlv_0= '&origin&' otherlv_1= ':' otherlv_2= '[' ( (lv_startVal_3_0= rulestartValue ) ) ( (lv_vals_4_0= rulenormalValue ) )* otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getInitialStatementAccess().getOriginKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getInitialStatementAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getInitialStatementAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalTraceryLanguage.g:191:3: ( (lv_startVal_3_0= rulestartValue ) )
            // InternalTraceryLanguage.g:192:4: (lv_startVal_3_0= rulestartValue )
            {
            // InternalTraceryLanguage.g:192:4: (lv_startVal_3_0= rulestartValue )
            // InternalTraceryLanguage.g:193:5: lv_startVal_3_0= rulestartValue
            {

            					newCompositeNode(grammarAccess.getInitialStatementAccess().getStartValStartValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_startVal_3_0=rulestartValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialStatementRule());
            					}
            					add(
            						current,
            						"startVal",
            						lv_startVal_3_0,
            						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.startValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTraceryLanguage.g:210:3: ( (lv_vals_4_0= rulenormalValue ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTraceryLanguage.g:211:4: (lv_vals_4_0= rulenormalValue )
            	    {
            	    // InternalTraceryLanguage.g:211:4: (lv_vals_4_0= rulenormalValue )
            	    // InternalTraceryLanguage.g:212:5: lv_vals_4_0= rulenormalValue
            	    {

            	    					newCompositeNode(grammarAccess.getInitialStatementAccess().getValsNormalValueParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_vals_4_0=rulenormalValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInitialStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"vals",
            	    						lv_vals_4_0,
            	    						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.normalValue");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getInitialStatementAccess().getRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "ruleInitialStatement"


    // $ANTLR start "entryRuleStatement"
    // InternalTraceryLanguage.g:237:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalTraceryLanguage.g:237:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalTraceryLanguage.g:238:2: iv_ruleStatement= ruleStatement EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalTraceryLanguage.g:244:1: ruleStatement returns [EObject current=null] : (otherlv_0= ',' otherlv_1= '&' this_StartingJSONExpression_2= ruleStartingJSONExpression otherlv_3= '&' otherlv_4= ':' otherlv_5= '[' ( (lv_startVal_6_0= rulestartValue ) ) ( (lv_vals_7_0= rulenormalValue ) )* otherlv_8= ']' ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject this_StartingJSONExpression_2 = null;

        EObject lv_startVal_6_0 = null;

        EObject lv_vals_7_0 = null;



        	enterRule();

        try {
            // InternalTraceryLanguage.g:250:2: ( (otherlv_0= ',' otherlv_1= '&' this_StartingJSONExpression_2= ruleStartingJSONExpression otherlv_3= '&' otherlv_4= ':' otherlv_5= '[' ( (lv_startVal_6_0= rulestartValue ) ) ( (lv_vals_7_0= rulenormalValue ) )* otherlv_8= ']' ) )
            // InternalTraceryLanguage.g:251:2: (otherlv_0= ',' otherlv_1= '&' this_StartingJSONExpression_2= ruleStartingJSONExpression otherlv_3= '&' otherlv_4= ':' otherlv_5= '[' ( (lv_startVal_6_0= rulestartValue ) ) ( (lv_vals_7_0= rulenormalValue ) )* otherlv_8= ']' )
            {
            // InternalTraceryLanguage.g:251:2: (otherlv_0= ',' otherlv_1= '&' this_StartingJSONExpression_2= ruleStartingJSONExpression otherlv_3= '&' otherlv_4= ':' otherlv_5= '[' ( (lv_startVal_6_0= rulestartValue ) ) ( (lv_vals_7_0= rulenormalValue ) )* otherlv_8= ']' )
            // InternalTraceryLanguage.g:252:3: otherlv_0= ',' otherlv_1= '&' this_StartingJSONExpression_2= ruleStartingJSONExpression otherlv_3= '&' otherlv_4= ':' otherlv_5= '[' ( (lv_startVal_6_0= rulestartValue ) ) ( (lv_vals_7_0= rulenormalValue ) )* otherlv_8= ']'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getStatementAccess().getCommaKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getAmpersandKeyword_1());
            		

            			newCompositeNode(grammarAccess.getStatementAccess().getStartingJSONExpressionParserRuleCall_2());
            		
            pushFollow(FOLLOW_7);
            this_StartingJSONExpression_2=ruleStartingJSONExpression();

            state._fsp--;


            			current = this_StartingJSONExpression_2;
            			afterParserOrEnumRuleCall();
            		
            otherlv_3=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getStatementAccess().getAmpersandKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getStatementAccess().getColonKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getStatementAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalTraceryLanguage.g:280:3: ( (lv_startVal_6_0= rulestartValue ) )
            // InternalTraceryLanguage.g:281:4: (lv_startVal_6_0= rulestartValue )
            {
            // InternalTraceryLanguage.g:281:4: (lv_startVal_6_0= rulestartValue )
            // InternalTraceryLanguage.g:282:5: lv_startVal_6_0= rulestartValue
            {

            					newCompositeNode(grammarAccess.getStatementAccess().getStartValStartValueParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_startVal_6_0=rulestartValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatementRule());
            					}
            					add(
            						current,
            						"startVal",
            						lv_startVal_6_0,
            						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.startValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTraceryLanguage.g:299:3: ( (lv_vals_7_0= rulenormalValue ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTraceryLanguage.g:300:4: (lv_vals_7_0= rulenormalValue )
            	    {
            	    // InternalTraceryLanguage.g:300:4: (lv_vals_7_0= rulenormalValue )
            	    // InternalTraceryLanguage.g:301:5: lv_vals_7_0= rulenormalValue
            	    {

            	    					newCompositeNode(grammarAccess.getStatementAccess().getValsNormalValueParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_vals_7_0=rulenormalValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"vals",
            	    						lv_vals_7_0,
            	    						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.normalValue");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getStatementAccess().getRightSquareBracketKeyword_8());
            		

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRulestartValue"
    // InternalTraceryLanguage.g:326:1: entryRulestartValue returns [EObject current=null] : iv_rulestartValue= rulestartValue EOF ;
    public final EObject entryRulestartValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestartValue = null;


        try {
            // InternalTraceryLanguage.g:326:51: (iv_rulestartValue= rulestartValue EOF )
            // InternalTraceryLanguage.g:327:2: iv_rulestartValue= rulestartValue EOF
            {
             newCompositeNode(grammarAccess.getStartValueRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestartValue=rulestartValue();

            state._fsp--;

             current =iv_rulestartValue; 
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
    // $ANTLR end "entryRulestartValue"


    // $ANTLR start "rulestartValue"
    // InternalTraceryLanguage.g:333:1: rulestartValue returns [EObject current=null] : ( () otherlv_1= '&' ( (lv_innards_2_0= ruleInnerStatement ) )* otherlv_3= '&' ) ;
    public final EObject rulestartValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_innards_2_0 = null;



        	enterRule();

        try {
            // InternalTraceryLanguage.g:339:2: ( ( () otherlv_1= '&' ( (lv_innards_2_0= ruleInnerStatement ) )* otherlv_3= '&' ) )
            // InternalTraceryLanguage.g:340:2: ( () otherlv_1= '&' ( (lv_innards_2_0= ruleInnerStatement ) )* otherlv_3= '&' )
            {
            // InternalTraceryLanguage.g:340:2: ( () otherlv_1= '&' ( (lv_innards_2_0= ruleInnerStatement ) )* otherlv_3= '&' )
            // InternalTraceryLanguage.g:341:3: () otherlv_1= '&' ( (lv_innards_2_0= ruleInnerStatement ) )* otherlv_3= '&'
            {
            // InternalTraceryLanguage.g:341:3: ()
            // InternalTraceryLanguage.g:342:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStartValueAccess().getStartValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getStartValueAccess().getAmpersandKeyword_1());
            		
            // InternalTraceryLanguage.g:352:3: ( (lv_innards_2_0= ruleInnerStatement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING||LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTraceryLanguage.g:353:4: (lv_innards_2_0= ruleInnerStatement )
            	    {
            	    // InternalTraceryLanguage.g:353:4: (lv_innards_2_0= ruleInnerStatement )
            	    // InternalTraceryLanguage.g:354:5: lv_innards_2_0= ruleInnerStatement
            	    {

            	    					newCompositeNode(grammarAccess.getStartValueAccess().getInnardsInnerStatementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_innards_2_0=ruleInnerStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStartValueRule());
            	    					}
            	    					add(
            	    						current,
            	    						"innards",
            	    						lv_innards_2_0,
            	    						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.InnerStatement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getStartValueAccess().getAmpersandKeyword_3());
            		

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
    // $ANTLR end "rulestartValue"


    // $ANTLR start "entryRulenormalValue"
    // InternalTraceryLanguage.g:379:1: entryRulenormalValue returns [EObject current=null] : iv_rulenormalValue= rulenormalValue EOF ;
    public final EObject entryRulenormalValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenormalValue = null;


        try {
            // InternalTraceryLanguage.g:379:52: (iv_rulenormalValue= rulenormalValue EOF )
            // InternalTraceryLanguage.g:380:2: iv_rulenormalValue= rulenormalValue EOF
            {
             newCompositeNode(grammarAccess.getNormalValueRule()); 
            pushFollow(FOLLOW_1);
            iv_rulenormalValue=rulenormalValue();

            state._fsp--;

             current =iv_rulenormalValue; 
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
    // $ANTLR end "entryRulenormalValue"


    // $ANTLR start "rulenormalValue"
    // InternalTraceryLanguage.g:386:1: rulenormalValue returns [EObject current=null] : ( () otherlv_1= ',' otherlv_2= '&' ( (lv_innards_3_0= ruleInnerStatement ) )* otherlv_4= '&' ) ;
    public final EObject rulenormalValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_innards_3_0 = null;



        	enterRule();

        try {
            // InternalTraceryLanguage.g:392:2: ( ( () otherlv_1= ',' otherlv_2= '&' ( (lv_innards_3_0= ruleInnerStatement ) )* otherlv_4= '&' ) )
            // InternalTraceryLanguage.g:393:2: ( () otherlv_1= ',' otherlv_2= '&' ( (lv_innards_3_0= ruleInnerStatement ) )* otherlv_4= '&' )
            {
            // InternalTraceryLanguage.g:393:2: ( () otherlv_1= ',' otherlv_2= '&' ( (lv_innards_3_0= ruleInnerStatement ) )* otherlv_4= '&' )
            // InternalTraceryLanguage.g:394:3: () otherlv_1= ',' otherlv_2= '&' ( (lv_innards_3_0= ruleInnerStatement ) )* otherlv_4= '&'
            {
            // InternalTraceryLanguage.g:394:3: ()
            // InternalTraceryLanguage.g:395:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNormalValueAccess().getNormalValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getNormalValueAccess().getCommaKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getNormalValueAccess().getAmpersandKeyword_2());
            		
            // InternalTraceryLanguage.g:409:3: ( (lv_innards_3_0= ruleInnerStatement ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STRING||LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTraceryLanguage.g:410:4: (lv_innards_3_0= ruleInnerStatement )
            	    {
            	    // InternalTraceryLanguage.g:410:4: (lv_innards_3_0= ruleInnerStatement )
            	    // InternalTraceryLanguage.g:411:5: lv_innards_3_0= ruleInnerStatement
            	    {

            	    					newCompositeNode(grammarAccess.getNormalValueAccess().getInnardsInnerStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_innards_3_0=ruleInnerStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNormalValueRule());
            	    					}
            	    					add(
            	    						current,
            	    						"innards",
            	    						lv_innards_3_0,
            	    						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.InnerStatement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getNormalValueAccess().getAmpersandKeyword_4());
            		

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
    // $ANTLR end "rulenormalValue"


    // $ANTLR start "entryRuleInnerStatement"
    // InternalTraceryLanguage.g:436:1: entryRuleInnerStatement returns [EObject current=null] : iv_ruleInnerStatement= ruleInnerStatement EOF ;
    public final EObject entryRuleInnerStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInnerStatement = null;


        try {
            // InternalTraceryLanguage.g:436:55: (iv_ruleInnerStatement= ruleInnerStatement EOF )
            // InternalTraceryLanguage.g:437:2: iv_ruleInnerStatement= ruleInnerStatement EOF
            {
             newCompositeNode(grammarAccess.getInnerStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInnerStatement=ruleInnerStatement();

            state._fsp--;

             current =iv_ruleInnerStatement; 
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
    // $ANTLR end "entryRuleInnerStatement"


    // $ANTLR start "ruleInnerStatement"
    // InternalTraceryLanguage.g:443:1: ruleInnerStatement returns [EObject current=null] : ( ( (lv_value_0_0= RULE_STRING ) ) | (otherlv_1= '#' this_VariableDecleration_2= ruleVariableDecleration otherlv_3= '#' ) | (otherlv_4= '#' this_VariableDecleration_5= ruleVariableDecleration otherlv_6= '.ed#' ) | (otherlv_7= '#' this_VariableDecleration_8= ruleVariableDecleration otherlv_9= '.a#' ) | (otherlv_10= '#' this_VariableDecleration_11= ruleVariableDecleration otherlv_12= '.the#' ) | (otherlv_13= '#' this_VariableDecleration_14= ruleVariableDecleration otherlv_15= '.capitalise#' ) ) ;
    public final EObject ruleInnerStatement() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject this_VariableDecleration_2 = null;

        EObject this_VariableDecleration_5 = null;

        EObject this_VariableDecleration_8 = null;

        EObject this_VariableDecleration_11 = null;

        EObject this_VariableDecleration_14 = null;



        	enterRule();

        try {
            // InternalTraceryLanguage.g:449:2: ( ( ( (lv_value_0_0= RULE_STRING ) ) | (otherlv_1= '#' this_VariableDecleration_2= ruleVariableDecleration otherlv_3= '#' ) | (otherlv_4= '#' this_VariableDecleration_5= ruleVariableDecleration otherlv_6= '.ed#' ) | (otherlv_7= '#' this_VariableDecleration_8= ruleVariableDecleration otherlv_9= '.a#' ) | (otherlv_10= '#' this_VariableDecleration_11= ruleVariableDecleration otherlv_12= '.the#' ) | (otherlv_13= '#' this_VariableDecleration_14= ruleVariableDecleration otherlv_15= '.capitalise#' ) ) )
            // InternalTraceryLanguage.g:450:2: ( ( (lv_value_0_0= RULE_STRING ) ) | (otherlv_1= '#' this_VariableDecleration_2= ruleVariableDecleration otherlv_3= '#' ) | (otherlv_4= '#' this_VariableDecleration_5= ruleVariableDecleration otherlv_6= '.ed#' ) | (otherlv_7= '#' this_VariableDecleration_8= ruleVariableDecleration otherlv_9= '.a#' ) | (otherlv_10= '#' this_VariableDecleration_11= ruleVariableDecleration otherlv_12= '.the#' ) | (otherlv_13= '#' this_VariableDecleration_14= ruleVariableDecleration otherlv_15= '.capitalise#' ) )
            {
            // InternalTraceryLanguage.g:450:2: ( ( (lv_value_0_0= RULE_STRING ) ) | (otherlv_1= '#' this_VariableDecleration_2= ruleVariableDecleration otherlv_3= '#' ) | (otherlv_4= '#' this_VariableDecleration_5= ruleVariableDecleration otherlv_6= '.ed#' ) | (otherlv_7= '#' this_VariableDecleration_8= ruleVariableDecleration otherlv_9= '.a#' ) | (otherlv_10= '#' this_VariableDecleration_11= ruleVariableDecleration otherlv_12= '.the#' ) | (otherlv_13= '#' this_VariableDecleration_14= ruleVariableDecleration otherlv_15= '.capitalise#' ) )
            int alt6=6;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 19:
                        {
                        alt6=2;
                        }
                        break;
                    case 20:
                        {
                        alt6=3;
                        }
                        break;
                    case 21:
                        {
                        alt6=4;
                        }
                        break;
                    case 22:
                        {
                        alt6=5;
                        }
                        break;
                    case 23:
                        {
                        alt6=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalTraceryLanguage.g:451:3: ( (lv_value_0_0= RULE_STRING ) )
                    {
                    // InternalTraceryLanguage.g:451:3: ( (lv_value_0_0= RULE_STRING ) )
                    // InternalTraceryLanguage.g:452:4: (lv_value_0_0= RULE_STRING )
                    {
                    // InternalTraceryLanguage.g:452:4: (lv_value_0_0= RULE_STRING )
                    // InternalTraceryLanguage.g:453:5: lv_value_0_0= RULE_STRING
                    {
                    lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_value_0_0, grammarAccess.getInnerStatementAccess().getValueSTRINGTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInnerStatementRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_0_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryLanguage.g:470:3: (otherlv_1= '#' this_VariableDecleration_2= ruleVariableDecleration otherlv_3= '#' )
                    {
                    // InternalTraceryLanguage.g:470:3: (otherlv_1= '#' this_VariableDecleration_2= ruleVariableDecleration otherlv_3= '#' )
                    // InternalTraceryLanguage.g:471:4: otherlv_1= '#' this_VariableDecleration_2= ruleVariableDecleration otherlv_3= '#'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getInnerStatementAccess().getNumberSignKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getInnerStatementAccess().getVariableDeclerationParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_11);
                    this_VariableDecleration_2=ruleVariableDecleration();

                    state._fsp--;


                    				current = this_VariableDecleration_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getInnerStatementAccess().getNumberSignKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryLanguage.g:489:3: (otherlv_4= '#' this_VariableDecleration_5= ruleVariableDecleration otherlv_6= '.ed#' )
                    {
                    // InternalTraceryLanguage.g:489:3: (otherlv_4= '#' this_VariableDecleration_5= ruleVariableDecleration otherlv_6= '.ed#' )
                    // InternalTraceryLanguage.g:490:4: otherlv_4= '#' this_VariableDecleration_5= ruleVariableDecleration otherlv_6= '.ed#'
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getInnerStatementAccess().getNumberSignKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getInnerStatementAccess().getVariableDeclerationParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_12);
                    this_VariableDecleration_5=ruleVariableDecleration();

                    state._fsp--;


                    				current = this_VariableDecleration_5;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_6=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getInnerStatementAccess().getEdKeyword_2_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTraceryLanguage.g:508:3: (otherlv_7= '#' this_VariableDecleration_8= ruleVariableDecleration otherlv_9= '.a#' )
                    {
                    // InternalTraceryLanguage.g:508:3: (otherlv_7= '#' this_VariableDecleration_8= ruleVariableDecleration otherlv_9= '.a#' )
                    // InternalTraceryLanguage.g:509:4: otherlv_7= '#' this_VariableDecleration_8= ruleVariableDecleration otherlv_9= '.a#'
                    {
                    otherlv_7=(Token)match(input,19,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getInnerStatementAccess().getNumberSignKeyword_3_0());
                    			

                    				newCompositeNode(grammarAccess.getInnerStatementAccess().getVariableDeclerationParserRuleCall_3_1());
                    			
                    pushFollow(FOLLOW_13);
                    this_VariableDecleration_8=ruleVariableDecleration();

                    state._fsp--;


                    				current = this_VariableDecleration_8;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_9=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getInnerStatementAccess().getAKeyword_3_2());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalTraceryLanguage.g:527:3: (otherlv_10= '#' this_VariableDecleration_11= ruleVariableDecleration otherlv_12= '.the#' )
                    {
                    // InternalTraceryLanguage.g:527:3: (otherlv_10= '#' this_VariableDecleration_11= ruleVariableDecleration otherlv_12= '.the#' )
                    // InternalTraceryLanguage.g:528:4: otherlv_10= '#' this_VariableDecleration_11= ruleVariableDecleration otherlv_12= '.the#'
                    {
                    otherlv_10=(Token)match(input,19,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getInnerStatementAccess().getNumberSignKeyword_4_0());
                    			

                    				newCompositeNode(grammarAccess.getInnerStatementAccess().getVariableDeclerationParserRuleCall_4_1());
                    			
                    pushFollow(FOLLOW_14);
                    this_VariableDecleration_11=ruleVariableDecleration();

                    state._fsp--;


                    				current = this_VariableDecleration_11;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_12=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getInnerStatementAccess().getTheKeyword_4_2());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalTraceryLanguage.g:546:3: (otherlv_13= '#' this_VariableDecleration_14= ruleVariableDecleration otherlv_15= '.capitalise#' )
                    {
                    // InternalTraceryLanguage.g:546:3: (otherlv_13= '#' this_VariableDecleration_14= ruleVariableDecleration otherlv_15= '.capitalise#' )
                    // InternalTraceryLanguage.g:547:4: otherlv_13= '#' this_VariableDecleration_14= ruleVariableDecleration otherlv_15= '.capitalise#'
                    {
                    otherlv_13=(Token)match(input,19,FOLLOW_9); 

                    				newLeafNode(otherlv_13, grammarAccess.getInnerStatementAccess().getNumberSignKeyword_5_0());
                    			

                    				newCompositeNode(grammarAccess.getInnerStatementAccess().getVariableDeclerationParserRuleCall_5_1());
                    			
                    pushFollow(FOLLOW_15);
                    this_VariableDecleration_14=ruleVariableDecleration();

                    state._fsp--;


                    				current = this_VariableDecleration_14;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_15=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getInnerStatementAccess().getCapitaliseKeyword_5_2());
                    			

                    }


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
    // $ANTLR end "ruleInnerStatement"


    // $ANTLR start "entryRuleStartingJSONExpression"
    // InternalTraceryLanguage.g:568:1: entryRuleStartingJSONExpression returns [EObject current=null] : iv_ruleStartingJSONExpression= ruleStartingJSONExpression EOF ;
    public final EObject entryRuleStartingJSONExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartingJSONExpression = null;


        try {
            // InternalTraceryLanguage.g:568:63: (iv_ruleStartingJSONExpression= ruleStartingJSONExpression EOF )
            // InternalTraceryLanguage.g:569:2: iv_ruleStartingJSONExpression= ruleStartingJSONExpression EOF
            {
             newCompositeNode(grammarAccess.getStartingJSONExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStartingJSONExpression=ruleStartingJSONExpression();

            state._fsp--;

             current =iv_ruleStartingJSONExpression; 
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
    // $ANTLR end "entryRuleStartingJSONExpression"


    // $ANTLR start "ruleStartingJSONExpression"
    // InternalTraceryLanguage.g:575:1: ruleStartingJSONExpression returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleStartingJSONExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalTraceryLanguage.g:581:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalTraceryLanguage.g:582:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalTraceryLanguage.g:582:2: ( (otherlv_0= RULE_ID ) )
            // InternalTraceryLanguage.g:583:3: (otherlv_0= RULE_ID )
            {
            // InternalTraceryLanguage.g:583:3: (otherlv_0= RULE_ID )
            // InternalTraceryLanguage.g:584:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStartingJSONExpressionRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getStartingJSONExpressionAccess().getVarVariableDeclerationCrossReference_0());
            			

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
    // $ANTLR end "ruleStartingJSONExpression"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});

}
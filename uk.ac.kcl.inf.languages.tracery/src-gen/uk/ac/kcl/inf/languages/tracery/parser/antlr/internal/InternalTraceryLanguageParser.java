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
    // InternalTraceryLanguage.g:71:1: ruleTraceryProgram returns [EObject current=null] : (otherlv_0= '{' () ( (lv_initialStatement_2_0= ruleInitialJSONLine ) ) ( (lv_statements_3_0= ruleNormalJSONLine ) )* otherlv_4= '}' ) ;
    public final EObject ruleTraceryProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_initialStatement_2_0 = null;

        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalTraceryLanguage.g:77:2: ( (otherlv_0= '{' () ( (lv_initialStatement_2_0= ruleInitialJSONLine ) ) ( (lv_statements_3_0= ruleNormalJSONLine ) )* otherlv_4= '}' ) )
            // InternalTraceryLanguage.g:78:2: (otherlv_0= '{' () ( (lv_initialStatement_2_0= ruleInitialJSONLine ) ) ( (lv_statements_3_0= ruleNormalJSONLine ) )* otherlv_4= '}' )
            {
            // InternalTraceryLanguage.g:78:2: (otherlv_0= '{' () ( (lv_initialStatement_2_0= ruleInitialJSONLine ) ) ( (lv_statements_3_0= ruleNormalJSONLine ) )* otherlv_4= '}' )
            // InternalTraceryLanguage.g:79:3: otherlv_0= '{' () ( (lv_initialStatement_2_0= ruleInitialJSONLine ) ) ( (lv_statements_3_0= ruleNormalJSONLine ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTraceryProgramAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalTraceryLanguage.g:83:3: ()
            // InternalTraceryLanguage.g:84:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTraceryProgramAccess().getTraceryProgramAction_1(),
            					current);
            			

            }

            // InternalTraceryLanguage.g:90:3: ( (lv_initialStatement_2_0= ruleInitialJSONLine ) )
            // InternalTraceryLanguage.g:91:4: (lv_initialStatement_2_0= ruleInitialJSONLine )
            {
            // InternalTraceryLanguage.g:91:4: (lv_initialStatement_2_0= ruleInitialJSONLine )
            // InternalTraceryLanguage.g:92:5: lv_initialStatement_2_0= ruleInitialJSONLine
            {

            					newCompositeNode(grammarAccess.getTraceryProgramAccess().getInitialStatementInitialJSONLineParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_initialStatement_2_0=ruleInitialJSONLine();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTraceryProgramRule());
            					}
            					set(
            						current,
            						"initialStatement",
            						lv_initialStatement_2_0,
            						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.InitialJSONLine");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTraceryLanguage.g:109:3: ( (lv_statements_3_0= ruleNormalJSONLine ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTraceryLanguage.g:110:4: (lv_statements_3_0= ruleNormalJSONLine )
            	    {
            	    // InternalTraceryLanguage.g:110:4: (lv_statements_3_0= ruleNormalJSONLine )
            	    // InternalTraceryLanguage.g:111:5: lv_statements_3_0= ruleNormalJSONLine
            	    {

            	    					newCompositeNode(grammarAccess.getTraceryProgramAccess().getStatementsNormalJSONLineParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_statements_3_0=ruleNormalJSONLine();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTraceryProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_3_0,
            	    						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.NormalJSONLine");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTraceryProgramAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalTraceryLanguage.g:136:1: entryRuleVariableDecleration returns [EObject current=null] : iv_ruleVariableDecleration= ruleVariableDecleration EOF ;
    public final EObject entryRuleVariableDecleration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDecleration = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:138:2: (iv_ruleVariableDecleration= ruleVariableDecleration EOF )
            // InternalTraceryLanguage.g:139:2: iv_ruleVariableDecleration= ruleVariableDecleration EOF
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDecleration"


    // $ANTLR start "ruleVariableDecleration"
    // InternalTraceryLanguage.g:148:1: ruleVariableDecleration returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariableDecleration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:155:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalTraceryLanguage.g:156:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalTraceryLanguage.g:156:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalTraceryLanguage.g:157:3: (lv_name_0_0= RULE_ID )
            {
            // InternalTraceryLanguage.g:157:3: (lv_name_0_0= RULE_ID )
            // InternalTraceryLanguage.g:158:4: lv_name_0_0= RULE_ID
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleVariableDecleration"


    // $ANTLR start "entryRuleInitialJSONLine"
    // InternalTraceryLanguage.g:180:1: entryRuleInitialJSONLine returns [EObject current=null] : iv_ruleInitialJSONLine= ruleInitialJSONLine EOF ;
    public final EObject entryRuleInitialJSONLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialJSONLine = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:182:2: (iv_ruleInitialJSONLine= ruleInitialJSONLine EOF )
            // InternalTraceryLanguage.g:183:2: iv_ruleInitialJSONLine= ruleInitialJSONLine EOF
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
    // InternalTraceryLanguage.g:192:1: ruleInitialJSONLine returns [EObject current=null] : (otherlv_0= '&origin&' otherlv_1= ':' otherlv_2= '[' ( (lv_startVal_3_0= rulestartValue ) ) ( (lv_vals_4_0= rulenormalValue ) )* otherlv_5= ']' ) ;
    public final EObject ruleInitialJSONLine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_startVal_3_0 = null;

        EObject lv_vals_4_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:199:2: ( (otherlv_0= '&origin&' otherlv_1= ':' otherlv_2= '[' ( (lv_startVal_3_0= rulestartValue ) ) ( (lv_vals_4_0= rulenormalValue ) )* otherlv_5= ']' ) )
            // InternalTraceryLanguage.g:200:2: (otherlv_0= '&origin&' otherlv_1= ':' otherlv_2= '[' ( (lv_startVal_3_0= rulestartValue ) ) ( (lv_vals_4_0= rulenormalValue ) )* otherlv_5= ']' )
            {
            // InternalTraceryLanguage.g:200:2: (otherlv_0= '&origin&' otherlv_1= ':' otherlv_2= '[' ( (lv_startVal_3_0= rulestartValue ) ) ( (lv_vals_4_0= rulenormalValue ) )* otherlv_5= ']' )
            // InternalTraceryLanguage.g:201:3: otherlv_0= '&origin&' otherlv_1= ':' otherlv_2= '[' ( (lv_startVal_3_0= rulestartValue ) ) ( (lv_vals_4_0= rulenormalValue ) )* otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getInitialJSONLineAccess().getOriginKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getInitialJSONLineAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getInitialJSONLineAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalTraceryLanguage.g:213:3: ( (lv_startVal_3_0= rulestartValue ) )
            // InternalTraceryLanguage.g:214:4: (lv_startVal_3_0= rulestartValue )
            {
            // InternalTraceryLanguage.g:214:4: (lv_startVal_3_0= rulestartValue )
            // InternalTraceryLanguage.g:215:5: lv_startVal_3_0= rulestartValue
            {

            					newCompositeNode(grammarAccess.getInitialJSONLineAccess().getStartValStartValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_startVal_3_0=rulestartValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialJSONLineRule());
            					}
            					add(
            						current,
            						"startVal",
            						lv_startVal_3_0,
            						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.startValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTraceryLanguage.g:232:3: ( (lv_vals_4_0= rulenormalValue ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTraceryLanguage.g:233:4: (lv_vals_4_0= rulenormalValue )
            	    {
            	    // InternalTraceryLanguage.g:233:4: (lv_vals_4_0= rulenormalValue )
            	    // InternalTraceryLanguage.g:234:5: lv_vals_4_0= rulenormalValue
            	    {

            	    					newCompositeNode(grammarAccess.getInitialJSONLineAccess().getValsNormalValueParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_vals_4_0=rulenormalValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInitialJSONLineRule());
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

            			newLeafNode(otherlv_5, grammarAccess.getInitialJSONLineAccess().getRightSquareBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleNormalJSONLine"
    // InternalTraceryLanguage.g:262:1: entryRuleNormalJSONLine returns [EObject current=null] : iv_ruleNormalJSONLine= ruleNormalJSONLine EOF ;
    public final EObject entryRuleNormalJSONLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJSONLine = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:264:2: (iv_ruleNormalJSONLine= ruleNormalJSONLine EOF )
            // InternalTraceryLanguage.g:265:2: iv_ruleNormalJSONLine= ruleNormalJSONLine EOF
            {
             newCompositeNode(grammarAccess.getNormalJSONLineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNormalJSONLine=ruleNormalJSONLine();

            state._fsp--;

             current =iv_ruleNormalJSONLine; 
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
    // $ANTLR end "entryRuleNormalJSONLine"


    // $ANTLR start "ruleNormalJSONLine"
    // InternalTraceryLanguage.g:274:1: ruleNormalJSONLine returns [EObject current=null] : (otherlv_0= ',' otherlv_1= '&' this_StartingJSONExpression_2= ruleStartingJSONExpression otherlv_3= '&' otherlv_4= ':' otherlv_5= '[' ( (lv_startVal_6_0= rulestartValue ) ) ( (lv_vals_7_0= rulenormalValue ) )* otherlv_8= ']' ) ;
    public final EObject ruleNormalJSONLine() throws RecognitionException {
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
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:281:2: ( (otherlv_0= ',' otherlv_1= '&' this_StartingJSONExpression_2= ruleStartingJSONExpression otherlv_3= '&' otherlv_4= ':' otherlv_5= '[' ( (lv_startVal_6_0= rulestartValue ) ) ( (lv_vals_7_0= rulenormalValue ) )* otherlv_8= ']' ) )
            // InternalTraceryLanguage.g:282:2: (otherlv_0= ',' otherlv_1= '&' this_StartingJSONExpression_2= ruleStartingJSONExpression otherlv_3= '&' otherlv_4= ':' otherlv_5= '[' ( (lv_startVal_6_0= rulestartValue ) ) ( (lv_vals_7_0= rulenormalValue ) )* otherlv_8= ']' )
            {
            // InternalTraceryLanguage.g:282:2: (otherlv_0= ',' otherlv_1= '&' this_StartingJSONExpression_2= ruleStartingJSONExpression otherlv_3= '&' otherlv_4= ':' otherlv_5= '[' ( (lv_startVal_6_0= rulestartValue ) ) ( (lv_vals_7_0= rulenormalValue ) )* otherlv_8= ']' )
            // InternalTraceryLanguage.g:283:3: otherlv_0= ',' otherlv_1= '&' this_StartingJSONExpression_2= ruleStartingJSONExpression otherlv_3= '&' otherlv_4= ':' otherlv_5= '[' ( (lv_startVal_6_0= rulestartValue ) ) ( (lv_vals_7_0= rulenormalValue ) )* otherlv_8= ']'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getNormalJSONLineAccess().getCommaKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getNormalJSONLineAccess().getAmpersandKeyword_1());
            		

            			newCompositeNode(grammarAccess.getNormalJSONLineAccess().getStartingJSONExpressionParserRuleCall_2());
            		
            pushFollow(FOLLOW_7);
            this_StartingJSONExpression_2=ruleStartingJSONExpression();

            state._fsp--;


            			current = this_StartingJSONExpression_2;
            			afterParserOrEnumRuleCall();
            		
            otherlv_3=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getNormalJSONLineAccess().getAmpersandKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getNormalJSONLineAccess().getColonKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getNormalJSONLineAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalTraceryLanguage.g:311:3: ( (lv_startVal_6_0= rulestartValue ) )
            // InternalTraceryLanguage.g:312:4: (lv_startVal_6_0= rulestartValue )
            {
            // InternalTraceryLanguage.g:312:4: (lv_startVal_6_0= rulestartValue )
            // InternalTraceryLanguage.g:313:5: lv_startVal_6_0= rulestartValue
            {

            					newCompositeNode(grammarAccess.getNormalJSONLineAccess().getStartValStartValueParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_startVal_6_0=rulestartValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNormalJSONLineRule());
            					}
            					add(
            						current,
            						"startVal",
            						lv_startVal_6_0,
            						"uk.ac.kcl.inf.languages.tracery.TraceryLanguage.startValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTraceryLanguage.g:330:3: ( (lv_vals_7_0= rulenormalValue ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTraceryLanguage.g:331:4: (lv_vals_7_0= rulenormalValue )
            	    {
            	    // InternalTraceryLanguage.g:331:4: (lv_vals_7_0= rulenormalValue )
            	    // InternalTraceryLanguage.g:332:5: lv_vals_7_0= rulenormalValue
            	    {

            	    					newCompositeNode(grammarAccess.getNormalJSONLineAccess().getValsNormalValueParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_vals_7_0=rulenormalValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNormalJSONLineRule());
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

            			newLeafNode(otherlv_8, grammarAccess.getNormalJSONLineAccess().getRightSquareBracketKeyword_8());
            		

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
    // $ANTLR end "ruleNormalJSONLine"


    // $ANTLR start "entryRulestartValue"
    // InternalTraceryLanguage.g:360:1: entryRulestartValue returns [EObject current=null] : iv_rulestartValue= rulestartValue EOF ;
    public final EObject entryRulestartValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestartValue = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:362:2: (iv_rulestartValue= rulestartValue EOF )
            // InternalTraceryLanguage.g:363:2: iv_rulestartValue= rulestartValue EOF
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulestartValue"


    // $ANTLR start "rulestartValue"
    // InternalTraceryLanguage.g:372:1: rulestartValue returns [EObject current=null] : ( () otherlv_1= '&' ( (lv_value_2_0= ruleInnerStatement ) )* otherlv_3= '&' ) ;
    public final EObject rulestartValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:379:2: ( ( () otherlv_1= '&' ( (lv_value_2_0= ruleInnerStatement ) )* otherlv_3= '&' ) )
            // InternalTraceryLanguage.g:380:2: ( () otherlv_1= '&' ( (lv_value_2_0= ruleInnerStatement ) )* otherlv_3= '&' )
            {
            // InternalTraceryLanguage.g:380:2: ( () otherlv_1= '&' ( (lv_value_2_0= ruleInnerStatement ) )* otherlv_3= '&' )
            // InternalTraceryLanguage.g:381:3: () otherlv_1= '&' ( (lv_value_2_0= ruleInnerStatement ) )* otherlv_3= '&'
            {
            // InternalTraceryLanguage.g:381:3: ()
            // InternalTraceryLanguage.g:382:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStartValueAccess().getStartValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getStartValueAccess().getAmpersandKeyword_1());
            		
            // InternalTraceryLanguage.g:392:3: ( (lv_value_2_0= ruleInnerStatement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING||LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTraceryLanguage.g:393:4: (lv_value_2_0= ruleInnerStatement )
            	    {
            	    // InternalTraceryLanguage.g:393:4: (lv_value_2_0= ruleInnerStatement )
            	    // InternalTraceryLanguage.g:394:5: lv_value_2_0= ruleInnerStatement
            	    {

            	    					newCompositeNode(grammarAccess.getStartValueAccess().getValueInnerStatementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_value_2_0=ruleInnerStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStartValueRule());
            	    					}
            	    					add(
            	    						current,
            	    						"value",
            	    						lv_value_2_0,
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulestartValue"


    // $ANTLR start "entryRulenormalValue"
    // InternalTraceryLanguage.g:422:1: entryRulenormalValue returns [EObject current=null] : iv_rulenormalValue= rulenormalValue EOF ;
    public final EObject entryRulenormalValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenormalValue = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:424:2: (iv_rulenormalValue= rulenormalValue EOF )
            // InternalTraceryLanguage.g:425:2: iv_rulenormalValue= rulenormalValue EOF
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulenormalValue"


    // $ANTLR start "rulenormalValue"
    // InternalTraceryLanguage.g:434:1: rulenormalValue returns [EObject current=null] : ( () otherlv_1= ',' otherlv_2= '&' ( (lv_value_3_0= ruleInnerStatement ) )* otherlv_4= '&' ) ;
    public final EObject rulenormalValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalTraceryLanguage.g:441:2: ( ( () otherlv_1= ',' otherlv_2= '&' ( (lv_value_3_0= ruleInnerStatement ) )* otherlv_4= '&' ) )
            // InternalTraceryLanguage.g:442:2: ( () otherlv_1= ',' otherlv_2= '&' ( (lv_value_3_0= ruleInnerStatement ) )* otherlv_4= '&' )
            {
            // InternalTraceryLanguage.g:442:2: ( () otherlv_1= ',' otherlv_2= '&' ( (lv_value_3_0= ruleInnerStatement ) )* otherlv_4= '&' )
            // InternalTraceryLanguage.g:443:3: () otherlv_1= ',' otherlv_2= '&' ( (lv_value_3_0= ruleInnerStatement ) )* otherlv_4= '&'
            {
            // InternalTraceryLanguage.g:443:3: ()
            // InternalTraceryLanguage.g:444:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNormalValueAccess().getNormalValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getNormalValueAccess().getCommaKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getNormalValueAccess().getAmpersandKeyword_2());
            		
            // InternalTraceryLanguage.g:458:3: ( (lv_value_3_0= ruleInnerStatement ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STRING||LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTraceryLanguage.g:459:4: (lv_value_3_0= ruleInnerStatement )
            	    {
            	    // InternalTraceryLanguage.g:459:4: (lv_value_3_0= ruleInnerStatement )
            	    // InternalTraceryLanguage.g:460:5: lv_value_3_0= ruleInnerStatement
            	    {

            	    					newCompositeNode(grammarAccess.getNormalValueAccess().getValueInnerStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_value_3_0=ruleInnerStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNormalValueRule());
            	    					}
            	    					add(
            	    						current,
            	    						"value",
            	    						lv_value_3_0,
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulenormalValue"


    // $ANTLR start "entryRuleInnerStatement"
    // InternalTraceryLanguage.g:488:1: entryRuleInnerStatement returns [EObject current=null] : iv_ruleInnerStatement= ruleInnerStatement EOF ;
    public final EObject entryRuleInnerStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInnerStatement = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:490:2: (iv_ruleInnerStatement= ruleInnerStatement EOF )
            // InternalTraceryLanguage.g:491:2: iv_ruleInnerStatement= ruleInnerStatement EOF
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleInnerStatement"


    // $ANTLR start "ruleInnerStatement"
    // InternalTraceryLanguage.g:500:1: ruleInnerStatement returns [EObject current=null] : ( ( (lv_value_0_0= RULE_STRING ) ) | (otherlv_1= '#' this_VariableDecleration_2= ruleVariableDecleration otherlv_3= '#' ) | (otherlv_4= '#' this_VariableDecleration_5= ruleVariableDecleration otherlv_6= '.ed#' ) | (otherlv_7= '#' this_VariableDecleration_8= ruleVariableDecleration otherlv_9= '.a#' ) | (otherlv_10= '#' this_VariableDecleration_11= ruleVariableDecleration otherlv_12= '.the#' ) | (otherlv_13= '#' this_VariableDecleration_14= ruleVariableDecleration otherlv_15= '.capitalise#' ) ) ;
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
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:507:2: ( ( ( (lv_value_0_0= RULE_STRING ) ) | (otherlv_1= '#' this_VariableDecleration_2= ruleVariableDecleration otherlv_3= '#' ) | (otherlv_4= '#' this_VariableDecleration_5= ruleVariableDecleration otherlv_6= '.ed#' ) | (otherlv_7= '#' this_VariableDecleration_8= ruleVariableDecleration otherlv_9= '.a#' ) | (otherlv_10= '#' this_VariableDecleration_11= ruleVariableDecleration otherlv_12= '.the#' ) | (otherlv_13= '#' this_VariableDecleration_14= ruleVariableDecleration otherlv_15= '.capitalise#' ) ) )
            // InternalTraceryLanguage.g:508:2: ( ( (lv_value_0_0= RULE_STRING ) ) | (otherlv_1= '#' this_VariableDecleration_2= ruleVariableDecleration otherlv_3= '#' ) | (otherlv_4= '#' this_VariableDecleration_5= ruleVariableDecleration otherlv_6= '.ed#' ) | (otherlv_7= '#' this_VariableDecleration_8= ruleVariableDecleration otherlv_9= '.a#' ) | (otherlv_10= '#' this_VariableDecleration_11= ruleVariableDecleration otherlv_12= '.the#' ) | (otherlv_13= '#' this_VariableDecleration_14= ruleVariableDecleration otherlv_15= '.capitalise#' ) )
            {
            // InternalTraceryLanguage.g:508:2: ( ( (lv_value_0_0= RULE_STRING ) ) | (otherlv_1= '#' this_VariableDecleration_2= ruleVariableDecleration otherlv_3= '#' ) | (otherlv_4= '#' this_VariableDecleration_5= ruleVariableDecleration otherlv_6= '.ed#' ) | (otherlv_7= '#' this_VariableDecleration_8= ruleVariableDecleration otherlv_9= '.a#' ) | (otherlv_10= '#' this_VariableDecleration_11= ruleVariableDecleration otherlv_12= '.the#' ) | (otherlv_13= '#' this_VariableDecleration_14= ruleVariableDecleration otherlv_15= '.capitalise#' ) )
            int alt6=6;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==RULE_ID) ) {
                    switch ( input.LA(3) ) {
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
                    // InternalTraceryLanguage.g:509:3: ( (lv_value_0_0= RULE_STRING ) )
                    {
                    // InternalTraceryLanguage.g:509:3: ( (lv_value_0_0= RULE_STRING ) )
                    // InternalTraceryLanguage.g:510:4: (lv_value_0_0= RULE_STRING )
                    {
                    // InternalTraceryLanguage.g:510:4: (lv_value_0_0= RULE_STRING )
                    // InternalTraceryLanguage.g:511:5: lv_value_0_0= RULE_STRING
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
                    // InternalTraceryLanguage.g:528:3: (otherlv_1= '#' this_VariableDecleration_2= ruleVariableDecleration otherlv_3= '#' )
                    {
                    // InternalTraceryLanguage.g:528:3: (otherlv_1= '#' this_VariableDecleration_2= ruleVariableDecleration otherlv_3= '#' )
                    // InternalTraceryLanguage.g:529:4: otherlv_1= '#' this_VariableDecleration_2= ruleVariableDecleration otherlv_3= '#'
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
                    // InternalTraceryLanguage.g:547:3: (otherlv_4= '#' this_VariableDecleration_5= ruleVariableDecleration otherlv_6= '.ed#' )
                    {
                    // InternalTraceryLanguage.g:547:3: (otherlv_4= '#' this_VariableDecleration_5= ruleVariableDecleration otherlv_6= '.ed#' )
                    // InternalTraceryLanguage.g:548:4: otherlv_4= '#' this_VariableDecleration_5= ruleVariableDecleration otherlv_6= '.ed#'
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
                    // InternalTraceryLanguage.g:566:3: (otherlv_7= '#' this_VariableDecleration_8= ruleVariableDecleration otherlv_9= '.a#' )
                    {
                    // InternalTraceryLanguage.g:566:3: (otherlv_7= '#' this_VariableDecleration_8= ruleVariableDecleration otherlv_9= '.a#' )
                    // InternalTraceryLanguage.g:567:4: otherlv_7= '#' this_VariableDecleration_8= ruleVariableDecleration otherlv_9= '.a#'
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
                    // InternalTraceryLanguage.g:585:3: (otherlv_10= '#' this_VariableDecleration_11= ruleVariableDecleration otherlv_12= '.the#' )
                    {
                    // InternalTraceryLanguage.g:585:3: (otherlv_10= '#' this_VariableDecleration_11= ruleVariableDecleration otherlv_12= '.the#' )
                    // InternalTraceryLanguage.g:586:4: otherlv_10= '#' this_VariableDecleration_11= ruleVariableDecleration otherlv_12= '.the#'
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
                    // InternalTraceryLanguage.g:604:3: (otherlv_13= '#' this_VariableDecleration_14= ruleVariableDecleration otherlv_15= '.capitalise#' )
                    {
                    // InternalTraceryLanguage.g:604:3: (otherlv_13= '#' this_VariableDecleration_14= ruleVariableDecleration otherlv_15= '.capitalise#' )
                    // InternalTraceryLanguage.g:605:4: otherlv_13= '#' this_VariableDecleration_14= ruleVariableDecleration otherlv_15= '.capitalise#'
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleInnerStatement"


    // $ANTLR start "entryRuleStartingJSONExpression"
    // InternalTraceryLanguage.g:629:1: entryRuleStartingJSONExpression returns [EObject current=null] : iv_ruleStartingJSONExpression= ruleStartingJSONExpression EOF ;
    public final EObject entryRuleStartingJSONExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartingJSONExpression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:631:2: (iv_ruleStartingJSONExpression= ruleStartingJSONExpression EOF )
            // InternalTraceryLanguage.g:632:2: iv_ruleStartingJSONExpression= ruleStartingJSONExpression EOF
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleStartingJSONExpression"


    // $ANTLR start "ruleStartingJSONExpression"
    // InternalTraceryLanguage.g:641:1: ruleStartingJSONExpression returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleStartingJSONExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTraceryLanguage.g:648:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalTraceryLanguage.g:649:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalTraceryLanguage.g:649:2: ( (otherlv_0= RULE_ID ) )
            // InternalTraceryLanguage.g:650:3: (otherlv_0= RULE_ID )
            {
            // InternalTraceryLanguage.g:650:3: (otherlv_0= RULE_ID )
            // InternalTraceryLanguage.g:651:4: otherlv_0= RULE_ID
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

            	myHiddenTokenState.restore();

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
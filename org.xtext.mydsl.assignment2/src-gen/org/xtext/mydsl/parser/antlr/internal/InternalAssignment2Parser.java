package org.xtext.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.mydsl.services.Assignment2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAssignment2Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'result'", "'is'", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=4;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalAssignment2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAssignment2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAssignment2Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalAssignment2.g"; }



     	private Assignment2GrammarAccess grammarAccess;

        public InternalAssignment2Parser(TokenStream input, Assignment2GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected Assignment2GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalAssignment2.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalAssignment2.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalAssignment2.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalAssignment2.g:71:1: ruleModel returns [EObject current=null] : ( (lv_math_0_0= ruleMathExp ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_math_0_0 = null;



        	enterRule();

        try {
            // InternalAssignment2.g:77:2: ( ( (lv_math_0_0= ruleMathExp ) )* )
            // InternalAssignment2.g:78:2: ( (lv_math_0_0= ruleMathExp ) )*
            {
            // InternalAssignment2.g:78:2: ( (lv_math_0_0= ruleMathExp ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAssignment2.g:79:3: (lv_math_0_0= ruleMathExp )
            	    {
            	    // InternalAssignment2.g:79:3: (lv_math_0_0= ruleMathExp )
            	    // InternalAssignment2.g:80:4: lv_math_0_0= ruleMathExp
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getMathMathExpParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_math_0_0=ruleMathExp();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"math",
            	    					lv_math_0_0,
            	    					"org.xtext.mydsl.Assignment2.MathExp");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleMathExp"
    // InternalAssignment2.g:100:1: entryRuleMathExp returns [EObject current=null] : iv_ruleMathExp= ruleMathExp EOF ;
    public final EObject entryRuleMathExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExp = null;


        try {
            // InternalAssignment2.g:100:48: (iv_ruleMathExp= ruleMathExp EOF )
            // InternalAssignment2.g:101:2: iv_ruleMathExp= ruleMathExp EOF
            {
             newCompositeNode(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathExp=ruleMathExp();

            state._fsp--;

             current =iv_ruleMathExp; 
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
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalAssignment2.g:107:1: ruleMathExp returns [EObject current=null] : (otherlv_0= 'result' otherlv_1= 'is' ( (lv_exp_2_0= ruleExpMinusPlus ) ) ) ;
    public final EObject ruleMathExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalAssignment2.g:113:2: ( (otherlv_0= 'result' otherlv_1= 'is' ( (lv_exp_2_0= ruleExpMinusPlus ) ) ) )
            // InternalAssignment2.g:114:2: (otherlv_0= 'result' otherlv_1= 'is' ( (lv_exp_2_0= ruleExpMinusPlus ) ) )
            {
            // InternalAssignment2.g:114:2: (otherlv_0= 'result' otherlv_1= 'is' ( (lv_exp_2_0= ruleExpMinusPlus ) ) )
            // InternalAssignment2.g:115:3: otherlv_0= 'result' otherlv_1= 'is' ( (lv_exp_2_0= ruleExpMinusPlus ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMathExpAccess().getResultKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMathExpAccess().getIsKeyword_1());
            		
            // InternalAssignment2.g:123:3: ( (lv_exp_2_0= ruleExpMinusPlus ) )
            // InternalAssignment2.g:124:4: (lv_exp_2_0= ruleExpMinusPlus )
            {
            // InternalAssignment2.g:124:4: (lv_exp_2_0= ruleExpMinusPlus )
            // InternalAssignment2.g:125:5: lv_exp_2_0= ruleExpMinusPlus
            {

            					newCompositeNode(grammarAccess.getMathExpAccess().getExpExpMinusPlusParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_2_0=ruleExpMinusPlus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMathExpRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_2_0,
            						"org.xtext.mydsl.Assignment2.ExpMinusPlus");
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
        }
        return current;
    }
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleExpMultDiv"
    // InternalAssignment2.g:146:1: entryRuleExpMultDiv returns [EObject current=null] : iv_ruleExpMultDiv= ruleExpMultDiv EOF ;
    public final EObject entryRuleExpMultDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpMultDiv = null;


        try {
            // InternalAssignment2.g:146:51: (iv_ruleExpMultDiv= ruleExpMultDiv EOF )
            // InternalAssignment2.g:147:2: iv_ruleExpMultDiv= ruleExpMultDiv EOF
            {
             newCompositeNode(grammarAccess.getExpMultDivRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpMultDiv=ruleExpMultDiv();

            state._fsp--;

             current =iv_ruleExpMultDiv; 
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
    // $ANTLR end "entryRuleExpMultDiv"


    // $ANTLR start "ruleExpMultDiv"
    // InternalAssignment2.g:153:1: ruleExpMultDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= ruleExpMD ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleExpMultDiv() throws RecognitionException {
        EObject current = null;

        EObject this_Primary_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAssignment2.g:159:2: ( (this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= ruleExpMD ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalAssignment2.g:160:2: (this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= ruleExpMD ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalAssignment2.g:160:2: (this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= ruleExpMD ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalAssignment2.g:161:3: this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= ruleExpMD ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpMultDivAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAssignment2.g:169:3: ( () ( (lv_operator_2_0= ruleExpMD ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=15 && LA2_0<=16)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAssignment2.g:170:4: () ( (lv_operator_2_0= ruleExpMD ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalAssignment2.g:170:4: ()
            	    // InternalAssignment2.g:171:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpMultDivAccess().getExpLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAssignment2.g:177:4: ( (lv_operator_2_0= ruleExpMD ) )
            	    // InternalAssignment2.g:178:5: (lv_operator_2_0= ruleExpMD )
            	    {
            	    // InternalAssignment2.g:178:5: (lv_operator_2_0= ruleExpMD )
            	    // InternalAssignment2.g:179:6: lv_operator_2_0= ruleExpMD
            	    {

            	    						newCompositeNode(grammarAccess.getExpMultDivAccess().getOperatorExpMDParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_operator_2_0=ruleExpMD();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpMultDivRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"org.xtext.mydsl.Assignment2.ExpMD");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalAssignment2.g:196:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalAssignment2.g:197:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalAssignment2.g:197:5: (lv_right_3_0= rulePrimary )
            	    // InternalAssignment2.g:198:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getExpMultDivAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpMultDivRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.mydsl.Assignment2.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "ruleExpMultDiv"


    // $ANTLR start "entryRuleExpMinusPlus"
    // InternalAssignment2.g:220:1: entryRuleExpMinusPlus returns [EObject current=null] : iv_ruleExpMinusPlus= ruleExpMinusPlus EOF ;
    public final EObject entryRuleExpMinusPlus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpMinusPlus = null;


        try {
            // InternalAssignment2.g:220:53: (iv_ruleExpMinusPlus= ruleExpMinusPlus EOF )
            // InternalAssignment2.g:221:2: iv_ruleExpMinusPlus= ruleExpMinusPlus EOF
            {
             newCompositeNode(grammarAccess.getExpMinusPlusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpMinusPlus=ruleExpMinusPlus();

            state._fsp--;

             current =iv_ruleExpMinusPlus; 
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
    // $ANTLR end "entryRuleExpMinusPlus"


    // $ANTLR start "ruleExpMinusPlus"
    // InternalAssignment2.g:227:1: ruleExpMinusPlus returns [EObject current=null] : (this_ExpMultDiv_0= ruleExpMultDiv ( () ( (lv_operator_2_0= ruleExpPM ) ) ( (lv_right_3_0= ruleExpMultDiv ) ) )* ) ;
    public final EObject ruleExpMinusPlus() throws RecognitionException {
        EObject current = null;

        EObject this_ExpMultDiv_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAssignment2.g:233:2: ( (this_ExpMultDiv_0= ruleExpMultDiv ( () ( (lv_operator_2_0= ruleExpPM ) ) ( (lv_right_3_0= ruleExpMultDiv ) ) )* ) )
            // InternalAssignment2.g:234:2: (this_ExpMultDiv_0= ruleExpMultDiv ( () ( (lv_operator_2_0= ruleExpPM ) ) ( (lv_right_3_0= ruleExpMultDiv ) ) )* )
            {
            // InternalAssignment2.g:234:2: (this_ExpMultDiv_0= ruleExpMultDiv ( () ( (lv_operator_2_0= ruleExpPM ) ) ( (lv_right_3_0= ruleExpMultDiv ) ) )* )
            // InternalAssignment2.g:235:3: this_ExpMultDiv_0= ruleExpMultDiv ( () ( (lv_operator_2_0= ruleExpPM ) ) ( (lv_right_3_0= ruleExpMultDiv ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpMinusPlusAccess().getExpMultDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_ExpMultDiv_0=ruleExpMultDiv();

            state._fsp--;


            			current = this_ExpMultDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAssignment2.g:243:3: ( () ( (lv_operator_2_0= ruleExpPM ) ) ( (lv_right_3_0= ruleExpMultDiv ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=13 && LA3_0<=14)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAssignment2.g:244:4: () ( (lv_operator_2_0= ruleExpPM ) ) ( (lv_right_3_0= ruleExpMultDiv ) )
            	    {
            	    // InternalAssignment2.g:244:4: ()
            	    // InternalAssignment2.g:245:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpMinusPlusAccess().getExpMinusPlusLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAssignment2.g:251:4: ( (lv_operator_2_0= ruleExpPM ) )
            	    // InternalAssignment2.g:252:5: (lv_operator_2_0= ruleExpPM )
            	    {
            	    // InternalAssignment2.g:252:5: (lv_operator_2_0= ruleExpPM )
            	    // InternalAssignment2.g:253:6: lv_operator_2_0= ruleExpPM
            	    {

            	    						newCompositeNode(grammarAccess.getExpMinusPlusAccess().getOperatorExpPMParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_operator_2_0=ruleExpPM();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpMinusPlusRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"org.xtext.mydsl.Assignment2.ExpPM");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalAssignment2.g:270:4: ( (lv_right_3_0= ruleExpMultDiv ) )
            	    // InternalAssignment2.g:271:5: (lv_right_3_0= ruleExpMultDiv )
            	    {
            	    // InternalAssignment2.g:271:5: (lv_right_3_0= ruleExpMultDiv )
            	    // InternalAssignment2.g:272:6: lv_right_3_0= ruleExpMultDiv
            	    {

            	    						newCompositeNode(grammarAccess.getExpMinusPlusAccess().getRightExpMultDivParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_right_3_0=ruleExpMultDiv();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpMinusPlusRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.mydsl.Assignment2.ExpMultDiv");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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
    // $ANTLR end "ruleExpMinusPlus"


    // $ANTLR start "entryRuleExpPM"
    // InternalAssignment2.g:294:1: entryRuleExpPM returns [EObject current=null] : iv_ruleExpPM= ruleExpPM EOF ;
    public final EObject entryRuleExpPM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpPM = null;


        try {
            // InternalAssignment2.g:294:46: (iv_ruleExpPM= ruleExpPM EOF )
            // InternalAssignment2.g:295:2: iv_ruleExpPM= ruleExpPM EOF
            {
             newCompositeNode(grammarAccess.getExpPMRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpPM=ruleExpPM();

            state._fsp--;

             current =iv_ruleExpPM; 
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
    // $ANTLR end "entryRuleExpPM"


    // $ANTLR start "ruleExpPM"
    // InternalAssignment2.g:301:1: ruleExpPM returns [EObject current=null] : ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) ) ;
    public final EObject ruleExpPM() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAssignment2.g:307:2: ( ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) ) )
            // InternalAssignment2.g:308:2: ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) )
            {
            // InternalAssignment2.g:308:2: ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalAssignment2.g:309:3: ( () otherlv_1= '+' )
                    {
                    // InternalAssignment2.g:309:3: ( () otherlv_1= '+' )
                    // InternalAssignment2.g:310:4: () otherlv_1= '+'
                    {
                    // InternalAssignment2.g:310:4: ()
                    // InternalAssignment2.g:311:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpPMAccess().getPlusAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getExpPMAccess().getPlusSignKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAssignment2.g:323:3: ( () otherlv_3= '-' )
                    {
                    // InternalAssignment2.g:323:3: ( () otherlv_3= '-' )
                    // InternalAssignment2.g:324:4: () otherlv_3= '-'
                    {
                    // InternalAssignment2.g:324:4: ()
                    // InternalAssignment2.g:325:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpPMAccess().getMinusAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getExpPMAccess().getHyphenMinusKeyword_1_1());
                    			

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
    // $ANTLR end "ruleExpPM"


    // $ANTLR start "entryRuleExpMD"
    // InternalAssignment2.g:340:1: entryRuleExpMD returns [EObject current=null] : iv_ruleExpMD= ruleExpMD EOF ;
    public final EObject entryRuleExpMD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpMD = null;


        try {
            // InternalAssignment2.g:340:46: (iv_ruleExpMD= ruleExpMD EOF )
            // InternalAssignment2.g:341:2: iv_ruleExpMD= ruleExpMD EOF
            {
             newCompositeNode(grammarAccess.getExpMDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpMD=ruleExpMD();

            state._fsp--;

             current =iv_ruleExpMD; 
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
    // $ANTLR end "entryRuleExpMD"


    // $ANTLR start "ruleExpMD"
    // InternalAssignment2.g:347:1: ruleExpMD returns [EObject current=null] : ( ( () otherlv_1= '*' ) | ( () otherlv_3= '/' ) ) ;
    public final EObject ruleExpMD() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAssignment2.g:353:2: ( ( ( () otherlv_1= '*' ) | ( () otherlv_3= '/' ) ) )
            // InternalAssignment2.g:354:2: ( ( () otherlv_1= '*' ) | ( () otherlv_3= '/' ) )
            {
            // InternalAssignment2.g:354:2: ( ( () otherlv_1= '*' ) | ( () otherlv_3= '/' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalAssignment2.g:355:3: ( () otherlv_1= '*' )
                    {
                    // InternalAssignment2.g:355:3: ( () otherlv_1= '*' )
                    // InternalAssignment2.g:356:4: () otherlv_1= '*'
                    {
                    // InternalAssignment2.g:356:4: ()
                    // InternalAssignment2.g:357:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpMDAccess().getMultAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getExpMDAccess().getAsteriskKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAssignment2.g:369:3: ( () otherlv_3= '/' )
                    {
                    // InternalAssignment2.g:369:3: ( () otherlv_3= '/' )
                    // InternalAssignment2.g:370:4: () otherlv_3= '/'
                    {
                    // InternalAssignment2.g:370:4: ()
                    // InternalAssignment2.g:371:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpMDAccess().getDivAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getExpMDAccess().getSolidusKeyword_1_1());
                    			

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
    // $ANTLR end "ruleExpMD"


    // $ANTLR start "entryRulePrimary"
    // InternalAssignment2.g:386:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalAssignment2.g:386:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalAssignment2.g:387:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalAssignment2.g:393:1: rulePrimary returns [EObject current=null] : (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject this_Number_0 = null;

        EObject this_Parenthesis_1 = null;



        	enterRule();

        try {
            // InternalAssignment2.g:399:2: ( (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis ) )
            // InternalAssignment2.g:400:2: (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis )
            {
            // InternalAssignment2.g:400:2: (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            else if ( (LA6_0==17) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalAssignment2.g:401:3: this_Number_0= ruleNumber
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Number_0=ruleNumber();

                    state._fsp--;


                    			current = this_Number_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAssignment2.g:410:3: this_Parenthesis_1= ruleParenthesis
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parenthesis_1=ruleParenthesis();

                    state._fsp--;


                    			current = this_Parenthesis_1;
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
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleParenthesis"
    // InternalAssignment2.g:422:1: entryRuleParenthesis returns [EObject current=null] : iv_ruleParenthesis= ruleParenthesis EOF ;
    public final EObject entryRuleParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesis = null;


        try {
            // InternalAssignment2.g:422:52: (iv_ruleParenthesis= ruleParenthesis EOF )
            // InternalAssignment2.g:423:2: iv_ruleParenthesis= ruleParenthesis EOF
            {
             newCompositeNode(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenthesis=ruleParenthesis();

            state._fsp--;

             current =iv_ruleParenthesis; 
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
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalAssignment2.g:429:1: ruleParenthesis returns [EObject current=null] : (otherlv_0= '(' ( (lv_exp_1_0= ruleExpMinusPlus ) ) otherlv_2= ')' ) ;
    public final EObject ruleParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalAssignment2.g:435:2: ( (otherlv_0= '(' ( (lv_exp_1_0= ruleExpMinusPlus ) ) otherlv_2= ')' ) )
            // InternalAssignment2.g:436:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleExpMinusPlus ) ) otherlv_2= ')' )
            {
            // InternalAssignment2.g:436:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleExpMinusPlus ) ) otherlv_2= ')' )
            // InternalAssignment2.g:437:3: otherlv_0= '(' ( (lv_exp_1_0= ruleExpMinusPlus ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0());
            		
            // InternalAssignment2.g:441:3: ( (lv_exp_1_0= ruleExpMinusPlus ) )
            // InternalAssignment2.g:442:4: (lv_exp_1_0= ruleExpMinusPlus )
            {
            // InternalAssignment2.g:442:4: (lv_exp_1_0= ruleExpMinusPlus )
            // InternalAssignment2.g:443:5: lv_exp_1_0= ruleExpMinusPlus
            {

            					newCompositeNode(grammarAccess.getParenthesisAccess().getExpExpMinusPlusParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_exp_1_0=ruleExpMinusPlus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParenthesisRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_1_0,
            						"org.xtext.mydsl.Assignment2.ExpMinusPlus");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleNumber"
    // InternalAssignment2.g:468:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalAssignment2.g:468:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalAssignment2.g:469:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalAssignment2.g:475:1: ruleNumber returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAssignment2.g:481:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalAssignment2.g:482:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalAssignment2.g:482:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalAssignment2.g:483:3: (lv_value_0_0= RULE_INT )
            {
            // InternalAssignment2.g:483:3: (lv_value_0_0= RULE_INT )
            // InternalAssignment2.g:484:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNumberRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleNumber"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});

}
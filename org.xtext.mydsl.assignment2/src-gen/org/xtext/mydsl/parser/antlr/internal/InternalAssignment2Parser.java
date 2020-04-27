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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'result'", "'is'", "'+'", "'-'", "'*'", "'/'", "'let'", "'and'", "'in'", "'end'", "'='", "'('", "')'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
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
    // InternalAssignment2.g:71:1: ruleModel returns [EObject current=null] : ( (lv_mathexp_0_0= ruleMathExp ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_mathexp_0_0 = null;



        	enterRule();

        try {
            // InternalAssignment2.g:77:2: ( ( (lv_mathexp_0_0= ruleMathExp ) )* )
            // InternalAssignment2.g:78:2: ( (lv_mathexp_0_0= ruleMathExp ) )*
            {
            // InternalAssignment2.g:78:2: ( (lv_mathexp_0_0= ruleMathExp ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAssignment2.g:79:3: (lv_mathexp_0_0= ruleMathExp )
            	    {
            	    // InternalAssignment2.g:79:3: (lv_mathexp_0_0= ruleMathExp )
            	    // InternalAssignment2.g:80:4: lv_mathexp_0_0= ruleMathExp
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getMathexpMathExpParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_mathexp_0_0=ruleMathExp();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"mathexp",
            	    					lv_mathexp_0_0,
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
    // InternalAssignment2.g:107:1: ruleMathExp returns [EObject current=null] : (otherlv_0= 'result' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= 'is' ( (lv_exp_3_0= ruleExp ) ) ) ;
    public final EObject ruleMathExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_exp_3_0 = null;



        	enterRule();

        try {
            // InternalAssignment2.g:113:2: ( (otherlv_0= 'result' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= 'is' ( (lv_exp_3_0= ruleExp ) ) ) )
            // InternalAssignment2.g:114:2: (otherlv_0= 'result' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= 'is' ( (lv_exp_3_0= ruleExp ) ) )
            {
            // InternalAssignment2.g:114:2: (otherlv_0= 'result' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= 'is' ( (lv_exp_3_0= ruleExp ) ) )
            // InternalAssignment2.g:115:3: otherlv_0= 'result' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= 'is' ( (lv_exp_3_0= ruleExp ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMathExpAccess().getResultKeyword_0());
            		
            // InternalAssignment2.g:119:3: ( (lv_name_1_0= RULE_STRING ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalAssignment2.g:120:4: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalAssignment2.g:120:4: (lv_name_1_0= RULE_STRING )
                    // InternalAssignment2.g:121:5: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getMathExpAccess().getNameSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMathExpRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getMathExpAccess().getIsKeyword_2());
            		
            // InternalAssignment2.g:141:3: ( (lv_exp_3_0= ruleExp ) )
            // InternalAssignment2.g:142:4: (lv_exp_3_0= ruleExp )
            {
            // InternalAssignment2.g:142:4: (lv_exp_3_0= ruleExp )
            // InternalAssignment2.g:143:5: lv_exp_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMathExpRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_3_0,
            						"org.xtext.mydsl.Assignment2.Exp");
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


    // $ANTLR start "entryRuleExp"
    // InternalAssignment2.g:164:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalAssignment2.g:164:44: (iv_ruleExp= ruleExp EOF )
            // InternalAssignment2.g:165:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalAssignment2.g:171:1: ruleExp returns [EObject current=null] : (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Factor_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalAssignment2.g:177:2: ( (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) )
            // InternalAssignment2.g:178:2: (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            {
            // InternalAssignment2.g:178:2: (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            // InternalAssignment2.g:179:3: this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAssignment2.g:187:3: ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=13 && LA4_0<=14)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAssignment2.g:188:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) )
            	    {
            	    // InternalAssignment2.g:188:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) )
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==13) ) {
            	        alt3=1;
            	    }
            	    else if ( (LA3_0==14) ) {
            	        alt3=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalAssignment2.g:189:5: (otherlv_1= '+' () )
            	            {
            	            // InternalAssignment2.g:189:5: (otherlv_1= '+' () )
            	            // InternalAssignment2.g:190:6: otherlv_1= '+' ()
            	            {
            	            otherlv_1=(Token)match(input,13,FOLLOW_6); 

            	            						newLeafNode(otherlv_1, grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_0());
            	            					
            	            // InternalAssignment2.g:194:6: ()
            	            // InternalAssignment2.g:195:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalAssignment2.g:203:5: (otherlv_3= '-' () )
            	            {
            	            // InternalAssignment2.g:203:5: (otherlv_3= '-' () )
            	            // InternalAssignment2.g:204:6: otherlv_3= '-' ()
            	            {
            	            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            	            						newLeafNode(otherlv_3, grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_0());
            	            					
            	            // InternalAssignment2.g:208:6: ()
            	            // InternalAssignment2.g:209:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalAssignment2.g:217:4: ( (lv_right_5_0= ruleFactor ) )
            	    // InternalAssignment2.g:218:5: (lv_right_5_0= ruleFactor )
            	    {
            	    // InternalAssignment2.g:218:5: (lv_right_5_0= ruleFactor )
            	    // InternalAssignment2.g:219:6: lv_right_5_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_right_5_0=ruleFactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"org.xtext.mydsl.Assignment2.Factor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleFactor"
    // InternalAssignment2.g:241:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalAssignment2.g:241:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalAssignment2.g:242:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
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
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalAssignment2.g:248:1: ruleFactor returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Primary_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalAssignment2.g:254:2: ( (this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) )
            // InternalAssignment2.g:255:2: (this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            {
            // InternalAssignment2.g:255:2: (this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            // InternalAssignment2.g:256:3: this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAssignment2.g:264:3: ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=15 && LA6_0<=16)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAssignment2.g:265:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) )
            	    {
            	    // InternalAssignment2.g:265:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) )
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
            	            // InternalAssignment2.g:266:5: (otherlv_1= '*' () )
            	            {
            	            // InternalAssignment2.g:266:5: (otherlv_1= '*' () )
            	            // InternalAssignment2.g:267:6: otherlv_1= '*' ()
            	            {
            	            otherlv_1=(Token)match(input,15,FOLLOW_6); 

            	            						newLeafNode(otherlv_1, grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_0());
            	            					
            	            // InternalAssignment2.g:271:6: ()
            	            // InternalAssignment2.g:272:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalAssignment2.g:280:5: (otherlv_3= '/' () )
            	            {
            	            // InternalAssignment2.g:280:5: (otherlv_3= '/' () )
            	            // InternalAssignment2.g:281:6: otherlv_3= '/' ()
            	            {
            	            otherlv_3=(Token)match(input,16,FOLLOW_6); 

            	            						newLeafNode(otherlv_3, grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_0());
            	            					
            	            // InternalAssignment2.g:285:6: ()
            	            // InternalAssignment2.g:286:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalAssignment2.g:294:4: ( (lv_right_5_0= rulePrimary ) )
            	    // InternalAssignment2.g:295:5: (lv_right_5_0= rulePrimary )
            	    {
            	    // InternalAssignment2.g:295:5: (lv_right_5_0= rulePrimary )
            	    // InternalAssignment2.g:296:6: lv_right_5_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_right_5_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFactorRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"org.xtext.mydsl.Assignment2.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRulePrimary"
    // InternalAssignment2.g:318:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalAssignment2.g:318:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalAssignment2.g:319:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalAssignment2.g:325:1: rulePrimary returns [EObject current=null] : (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableBinding_2= ruleVariableBinding | this_VariableUse_3= ruleVariableUse ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject this_Number_0 = null;

        EObject this_Parenthesis_1 = null;

        EObject this_VariableBinding_2 = null;

        EObject this_VariableUse_3 = null;



        	enterRule();

        try {
            // InternalAssignment2.g:331:2: ( (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableBinding_2= ruleVariableBinding | this_VariableUse_3= ruleVariableUse ) )
            // InternalAssignment2.g:332:2: (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableBinding_2= ruleVariableBinding | this_VariableUse_3= ruleVariableUse )
            {
            // InternalAssignment2.g:332:2: (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableBinding_2= ruleVariableBinding | this_VariableUse_3= ruleVariableUse )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt7=1;
                }
                break;
            case 22:
                {
                alt7=2;
                }
                break;
            case 17:
                {
                alt7=3;
                }
                break;
            case RULE_ID:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalAssignment2.g:333:3: this_Number_0= ruleNumber
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
                    // InternalAssignment2.g:342:3: this_Parenthesis_1= ruleParenthesis
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parenthesis_1=ruleParenthesis();

                    state._fsp--;


                    			current = this_Parenthesis_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAssignment2.g:351:3: this_VariableBinding_2= ruleVariableBinding
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getVariableBindingParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableBinding_2=ruleVariableBinding();

                    state._fsp--;


                    			current = this_VariableBinding_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAssignment2.g:360:3: this_VariableUse_3= ruleVariableUse
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableUse_3=ruleVariableUse();

                    state._fsp--;


                    			current = this_VariableUse_3;
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


    // $ANTLR start "entryRuleVariableUse"
    // InternalAssignment2.g:372:1: entryRuleVariableUse returns [EObject current=null] : iv_ruleVariableUse= ruleVariableUse EOF ;
    public final EObject entryRuleVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableUse = null;


        try {
            // InternalAssignment2.g:372:52: (iv_ruleVariableUse= ruleVariableUse EOF )
            // InternalAssignment2.g:373:2: iv_ruleVariableUse= ruleVariableUse EOF
            {
             newCompositeNode(grammarAccess.getVariableUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableUse=ruleVariableUse();

            state._fsp--;

             current =iv_ruleVariableUse; 
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
    // $ANTLR end "entryRuleVariableUse"


    // $ANTLR start "ruleVariableUse"
    // InternalAssignment2.g:379:1: ruleVariableUse returns [EObject current=null] : ( () ( (lv_id_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariableUse() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;


        	enterRule();

        try {
            // InternalAssignment2.g:385:2: ( ( () ( (lv_id_1_0= RULE_ID ) ) ) )
            // InternalAssignment2.g:386:2: ( () ( (lv_id_1_0= RULE_ID ) ) )
            {
            // InternalAssignment2.g:386:2: ( () ( (lv_id_1_0= RULE_ID ) ) )
            // InternalAssignment2.g:387:3: () ( (lv_id_1_0= RULE_ID ) )
            {
            // InternalAssignment2.g:387:3: ()
            // InternalAssignment2.g:388:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableUseAccess().getVarAction_0(),
            					current);
            			

            }

            // InternalAssignment2.g:394:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalAssignment2.g:395:4: (lv_id_1_0= RULE_ID )
            {
            // InternalAssignment2.g:395:4: (lv_id_1_0= RULE_ID )
            // InternalAssignment2.g:396:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_id_1_0, grammarAccess.getVariableUseAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableUseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleVariableUse"


    // $ANTLR start "entryRuleVariableBinding"
    // InternalAssignment2.g:416:1: entryRuleVariableBinding returns [EObject current=null] : iv_ruleVariableBinding= ruleVariableBinding EOF ;
    public final EObject entryRuleVariableBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableBinding = null;


        try {
            // InternalAssignment2.g:416:56: (iv_ruleVariableBinding= ruleVariableBinding EOF )
            // InternalAssignment2.g:417:2: iv_ruleVariableBinding= ruleVariableBinding EOF
            {
             newCompositeNode(grammarAccess.getVariableBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableBinding=ruleVariableBinding();

            state._fsp--;

             current =iv_ruleVariableBinding; 
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
    // $ANTLR end "entryRuleVariableBinding"


    // $ANTLR start "ruleVariableBinding"
    // InternalAssignment2.g:423:1: ruleVariableBinding returns [EObject current=null] : ( () otherlv_1= 'let' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= 'and' ( (lv_variable_4_0= ruleVariable ) ) )* otherlv_5= 'in' ( (lv_body_6_0= ruleExp ) ) otherlv_7= 'end' ) ;
    public final EObject ruleVariableBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_variable_2_0 = null;

        EObject lv_variable_4_0 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalAssignment2.g:429:2: ( ( () otherlv_1= 'let' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= 'and' ( (lv_variable_4_0= ruleVariable ) ) )* otherlv_5= 'in' ( (lv_body_6_0= ruleExp ) ) otherlv_7= 'end' ) )
            // InternalAssignment2.g:430:2: ( () otherlv_1= 'let' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= 'and' ( (lv_variable_4_0= ruleVariable ) ) )* otherlv_5= 'in' ( (lv_body_6_0= ruleExp ) ) otherlv_7= 'end' )
            {
            // InternalAssignment2.g:430:2: ( () otherlv_1= 'let' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= 'and' ( (lv_variable_4_0= ruleVariable ) ) )* otherlv_5= 'in' ( (lv_body_6_0= ruleExp ) ) otherlv_7= 'end' )
            // InternalAssignment2.g:431:3: () otherlv_1= 'let' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= 'and' ( (lv_variable_4_0= ruleVariable ) ) )* otherlv_5= 'in' ( (lv_body_6_0= ruleExp ) ) otherlv_7= 'end'
            {
            // InternalAssignment2.g:431:3: ()
            // InternalAssignment2.g:432:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableBindingAccess().getLetAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableBindingAccess().getLetKeyword_1());
            		
            // InternalAssignment2.g:442:3: ( (lv_variable_2_0= ruleVariable ) )
            // InternalAssignment2.g:443:4: (lv_variable_2_0= ruleVariable )
            {
            // InternalAssignment2.g:443:4: (lv_variable_2_0= ruleVariable )
            // InternalAssignment2.g:444:5: lv_variable_2_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getVariableBindingAccess().getVariableVariableParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_variable_2_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableBindingRule());
            					}
            					add(
            						current,
            						"variable",
            						lv_variable_2_0,
            						"org.xtext.mydsl.Assignment2.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAssignment2.g:461:3: (otherlv_3= 'and' ( (lv_variable_4_0= ruleVariable ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAssignment2.g:462:4: otherlv_3= 'and' ( (lv_variable_4_0= ruleVariable ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FOLLOW_9); 

            	    				newLeafNode(otherlv_3, grammarAccess.getVariableBindingAccess().getAndKeyword_3_0());
            	    			
            	    // InternalAssignment2.g:466:4: ( (lv_variable_4_0= ruleVariable ) )
            	    // InternalAssignment2.g:467:5: (lv_variable_4_0= ruleVariable )
            	    {
            	    // InternalAssignment2.g:467:5: (lv_variable_4_0= ruleVariable )
            	    // InternalAssignment2.g:468:6: lv_variable_4_0= ruleVariable
            	    {

            	    						newCompositeNode(grammarAccess.getVariableBindingAccess().getVariableVariableParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_variable_4_0=ruleVariable();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVariableBindingRule());
            	    						}
            	    						add(
            	    							current,
            	    							"variable",
            	    							lv_variable_4_0,
            	    							"org.xtext.mydsl.Assignment2.Variable");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getVariableBindingAccess().getInKeyword_4());
            		
            // InternalAssignment2.g:490:3: ( (lv_body_6_0= ruleExp ) )
            // InternalAssignment2.g:491:4: (lv_body_6_0= ruleExp )
            {
            // InternalAssignment2.g:491:4: (lv_body_6_0= ruleExp )
            // InternalAssignment2.g:492:5: lv_body_6_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getVariableBindingAccess().getBodyExpParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_11);
            lv_body_6_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableBindingRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_6_0,
            						"org.xtext.mydsl.Assignment2.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getVariableBindingAccess().getEndKeyword_6());
            		

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
    // $ANTLR end "ruleVariableBinding"


    // $ANTLR start "entryRuleVariable"
    // InternalAssignment2.g:517:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalAssignment2.g:517:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalAssignment2.g:518:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalAssignment2.g:524:1: ruleVariable returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_binding_2_0= ruleExp ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        EObject lv_binding_2_0 = null;



        	enterRule();

        try {
            // InternalAssignment2.g:530:2: ( ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_binding_2_0= ruleExp ) ) ) )
            // InternalAssignment2.g:531:2: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_binding_2_0= ruleExp ) ) )
            {
            // InternalAssignment2.g:531:2: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_binding_2_0= ruleExp ) ) )
            // InternalAssignment2.g:532:3: ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_binding_2_0= ruleExp ) )
            {
            // InternalAssignment2.g:532:3: ( (lv_id_0_0= RULE_ID ) )
            // InternalAssignment2.g:533:4: (lv_id_0_0= RULE_ID )
            {
            // InternalAssignment2.g:533:4: (lv_id_0_0= RULE_ID )
            // InternalAssignment2.g:534:5: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_id_0_0, grammarAccess.getVariableAccess().getIdIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getEqualsSignKeyword_1());
            		
            // InternalAssignment2.g:554:3: ( (lv_binding_2_0= ruleExp ) )
            // InternalAssignment2.g:555:4: (lv_binding_2_0= ruleExp )
            {
            // InternalAssignment2.g:555:4: (lv_binding_2_0= ruleExp )
            // InternalAssignment2.g:556:5: lv_binding_2_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getBindingExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_binding_2_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"binding",
            						lv_binding_2_0,
            						"org.xtext.mydsl.Assignment2.Exp");
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleParenthesis"
    // InternalAssignment2.g:577:1: entryRuleParenthesis returns [EObject current=null] : iv_ruleParenthesis= ruleParenthesis EOF ;
    public final EObject entryRuleParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesis = null;


        try {
            // InternalAssignment2.g:577:52: (iv_ruleParenthesis= ruleParenthesis EOF )
            // InternalAssignment2.g:578:2: iv_ruleParenthesis= ruleParenthesis EOF
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
    // InternalAssignment2.g:584:1: ruleParenthesis returns [EObject current=null] : (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' ) ;
    public final EObject ruleParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Exp_1 = null;



        	enterRule();

        try {
            // InternalAssignment2.g:590:2: ( (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' ) )
            // InternalAssignment2.g:591:2: (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' )
            {
            // InternalAssignment2.g:591:2: (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' )
            // InternalAssignment2.g:592:3: otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getParenthesisAccess().getExpParserRuleCall_1());
            		
            pushFollow(FOLLOW_13);
            this_Exp_1=ruleExp();

            state._fsp--;


            			current = this_Exp_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,23,FOLLOW_2); 

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
    // InternalAssignment2.g:612:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalAssignment2.g:612:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalAssignment2.g:613:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalAssignment2.g:619:1: ruleNumber returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalAssignment2.g:625:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalAssignment2.g:626:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalAssignment2.g:626:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // InternalAssignment2.g:627:3: () ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalAssignment2.g:627:3: ()
            // InternalAssignment2.g:628:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNumberAccess().getNumAction_0(),
            					current);
            			

            }

            // InternalAssignment2.g:634:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalAssignment2.g:635:4: (lv_value_1_0= RULE_INT )
            {
            // InternalAssignment2.g:635:4: (lv_value_1_0= RULE_INT )
            // InternalAssignment2.g:636:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleNumber"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000420060L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});

}
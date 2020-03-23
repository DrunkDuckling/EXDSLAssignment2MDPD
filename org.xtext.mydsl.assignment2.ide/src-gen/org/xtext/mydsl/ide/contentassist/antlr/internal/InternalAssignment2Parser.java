package org.xtext.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.mydsl.services.Assignment2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAssignment2Parser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(Assignment2GrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalAssignment2.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalAssignment2.g:54:1: ( ruleModel EOF )
            // InternalAssignment2.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalAssignment2.g:62:1: ruleModel : ( ( rule__Model__MathAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:66:2: ( ( ( rule__Model__MathAssignment )* ) )
            // InternalAssignment2.g:67:2: ( ( rule__Model__MathAssignment )* )
            {
            // InternalAssignment2.g:67:2: ( ( rule__Model__MathAssignment )* )
            // InternalAssignment2.g:68:3: ( rule__Model__MathAssignment )*
            {
             before(grammarAccess.getModelAccess().getMathAssignment()); 
            // InternalAssignment2.g:69:3: ( rule__Model__MathAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAssignment2.g:69:4: rule__Model__MathAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__MathAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getMathAssignment()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleMathExp"
    // InternalAssignment2.g:78:1: entryRuleMathExp : ruleMathExp EOF ;
    public final void entryRuleMathExp() throws RecognitionException {
        try {
            // InternalAssignment2.g:79:1: ( ruleMathExp EOF )
            // InternalAssignment2.g:80:1: ruleMathExp EOF
            {
             before(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            ruleMathExp();

            state._fsp--;

             after(grammarAccess.getMathExpRule()); 
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
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalAssignment2.g:87:1: ruleMathExp : ( ( rule__MathExp__Group__0 ) ) ;
    public final void ruleMathExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:91:2: ( ( ( rule__MathExp__Group__0 ) ) )
            // InternalAssignment2.g:92:2: ( ( rule__MathExp__Group__0 ) )
            {
            // InternalAssignment2.g:92:2: ( ( rule__MathExp__Group__0 ) )
            // InternalAssignment2.g:93:3: ( rule__MathExp__Group__0 )
            {
             before(grammarAccess.getMathExpAccess().getGroup()); 
            // InternalAssignment2.g:94:3: ( rule__MathExp__Group__0 )
            // InternalAssignment2.g:94:4: rule__MathExp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MathExp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMathExpAccess().getGroup()); 

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
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleExpMultDiv"
    // InternalAssignment2.g:103:1: entryRuleExpMultDiv : ruleExpMultDiv EOF ;
    public final void entryRuleExpMultDiv() throws RecognitionException {
        try {
            // InternalAssignment2.g:104:1: ( ruleExpMultDiv EOF )
            // InternalAssignment2.g:105:1: ruleExpMultDiv EOF
            {
             before(grammarAccess.getExpMultDivRule()); 
            pushFollow(FOLLOW_1);
            ruleExpMultDiv();

            state._fsp--;

             after(grammarAccess.getExpMultDivRule()); 
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
    // $ANTLR end "entryRuleExpMultDiv"


    // $ANTLR start "ruleExpMultDiv"
    // InternalAssignment2.g:112:1: ruleExpMultDiv : ( ( rule__ExpMultDiv__Group__0 ) ) ;
    public final void ruleExpMultDiv() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:116:2: ( ( ( rule__ExpMultDiv__Group__0 ) ) )
            // InternalAssignment2.g:117:2: ( ( rule__ExpMultDiv__Group__0 ) )
            {
            // InternalAssignment2.g:117:2: ( ( rule__ExpMultDiv__Group__0 ) )
            // InternalAssignment2.g:118:3: ( rule__ExpMultDiv__Group__0 )
            {
             before(grammarAccess.getExpMultDivAccess().getGroup()); 
            // InternalAssignment2.g:119:3: ( rule__ExpMultDiv__Group__0 )
            // InternalAssignment2.g:119:4: rule__ExpMultDiv__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpMultDiv__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpMultDivAccess().getGroup()); 

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
    // $ANTLR end "ruleExpMultDiv"


    // $ANTLR start "entryRuleExpMinusPlus"
    // InternalAssignment2.g:128:1: entryRuleExpMinusPlus : ruleExpMinusPlus EOF ;
    public final void entryRuleExpMinusPlus() throws RecognitionException {
        try {
            // InternalAssignment2.g:129:1: ( ruleExpMinusPlus EOF )
            // InternalAssignment2.g:130:1: ruleExpMinusPlus EOF
            {
             before(grammarAccess.getExpMinusPlusRule()); 
            pushFollow(FOLLOW_1);
            ruleExpMinusPlus();

            state._fsp--;

             after(grammarAccess.getExpMinusPlusRule()); 
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
    // $ANTLR end "entryRuleExpMinusPlus"


    // $ANTLR start "ruleExpMinusPlus"
    // InternalAssignment2.g:137:1: ruleExpMinusPlus : ( ( rule__ExpMinusPlus__Group__0 ) ) ;
    public final void ruleExpMinusPlus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:141:2: ( ( ( rule__ExpMinusPlus__Group__0 ) ) )
            // InternalAssignment2.g:142:2: ( ( rule__ExpMinusPlus__Group__0 ) )
            {
            // InternalAssignment2.g:142:2: ( ( rule__ExpMinusPlus__Group__0 ) )
            // InternalAssignment2.g:143:3: ( rule__ExpMinusPlus__Group__0 )
            {
             before(grammarAccess.getExpMinusPlusAccess().getGroup()); 
            // InternalAssignment2.g:144:3: ( rule__ExpMinusPlus__Group__0 )
            // InternalAssignment2.g:144:4: rule__ExpMinusPlus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpMinusPlus__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpMinusPlusAccess().getGroup()); 

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
    // $ANTLR end "ruleExpMinusPlus"


    // $ANTLR start "entryRuleExpPM"
    // InternalAssignment2.g:153:1: entryRuleExpPM : ruleExpPM EOF ;
    public final void entryRuleExpPM() throws RecognitionException {
        try {
            // InternalAssignment2.g:154:1: ( ruleExpPM EOF )
            // InternalAssignment2.g:155:1: ruleExpPM EOF
            {
             before(grammarAccess.getExpPMRule()); 
            pushFollow(FOLLOW_1);
            ruleExpPM();

            state._fsp--;

             after(grammarAccess.getExpPMRule()); 
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
    // $ANTLR end "entryRuleExpPM"


    // $ANTLR start "ruleExpPM"
    // InternalAssignment2.g:162:1: ruleExpPM : ( ( rule__ExpPM__Alternatives ) ) ;
    public final void ruleExpPM() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:166:2: ( ( ( rule__ExpPM__Alternatives ) ) )
            // InternalAssignment2.g:167:2: ( ( rule__ExpPM__Alternatives ) )
            {
            // InternalAssignment2.g:167:2: ( ( rule__ExpPM__Alternatives ) )
            // InternalAssignment2.g:168:3: ( rule__ExpPM__Alternatives )
            {
             before(grammarAccess.getExpPMAccess().getAlternatives()); 
            // InternalAssignment2.g:169:3: ( rule__ExpPM__Alternatives )
            // InternalAssignment2.g:169:4: rule__ExpPM__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExpPM__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpPMAccess().getAlternatives()); 

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
    // $ANTLR end "ruleExpPM"


    // $ANTLR start "entryRuleExpMD"
    // InternalAssignment2.g:178:1: entryRuleExpMD : ruleExpMD EOF ;
    public final void entryRuleExpMD() throws RecognitionException {
        try {
            // InternalAssignment2.g:179:1: ( ruleExpMD EOF )
            // InternalAssignment2.g:180:1: ruleExpMD EOF
            {
             before(grammarAccess.getExpMDRule()); 
            pushFollow(FOLLOW_1);
            ruleExpMD();

            state._fsp--;

             after(grammarAccess.getExpMDRule()); 
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
    // $ANTLR end "entryRuleExpMD"


    // $ANTLR start "ruleExpMD"
    // InternalAssignment2.g:187:1: ruleExpMD : ( ( rule__ExpMD__Alternatives ) ) ;
    public final void ruleExpMD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:191:2: ( ( ( rule__ExpMD__Alternatives ) ) )
            // InternalAssignment2.g:192:2: ( ( rule__ExpMD__Alternatives ) )
            {
            // InternalAssignment2.g:192:2: ( ( rule__ExpMD__Alternatives ) )
            // InternalAssignment2.g:193:3: ( rule__ExpMD__Alternatives )
            {
             before(grammarAccess.getExpMDAccess().getAlternatives()); 
            // InternalAssignment2.g:194:3: ( rule__ExpMD__Alternatives )
            // InternalAssignment2.g:194:4: rule__ExpMD__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExpMD__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpMDAccess().getAlternatives()); 

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
    // $ANTLR end "ruleExpMD"


    // $ANTLR start "entryRulePrimary"
    // InternalAssignment2.g:203:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalAssignment2.g:204:1: ( rulePrimary EOF )
            // InternalAssignment2.g:205:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalAssignment2.g:212:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:216:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalAssignment2.g:217:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalAssignment2.g:217:2: ( ( rule__Primary__Alternatives ) )
            // InternalAssignment2.g:218:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalAssignment2.g:219:3: ( rule__Primary__Alternatives )
            // InternalAssignment2.g:219:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleParenthesis"
    // InternalAssignment2.g:228:1: entryRuleParenthesis : ruleParenthesis EOF ;
    public final void entryRuleParenthesis() throws RecognitionException {
        try {
            // InternalAssignment2.g:229:1: ( ruleParenthesis EOF )
            // InternalAssignment2.g:230:1: ruleParenthesis EOF
            {
             before(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            ruleParenthesis();

            state._fsp--;

             after(grammarAccess.getParenthesisRule()); 
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
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalAssignment2.g:237:1: ruleParenthesis : ( ( rule__Parenthesis__Group__0 ) ) ;
    public final void ruleParenthesis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:241:2: ( ( ( rule__Parenthesis__Group__0 ) ) )
            // InternalAssignment2.g:242:2: ( ( rule__Parenthesis__Group__0 ) )
            {
            // InternalAssignment2.g:242:2: ( ( rule__Parenthesis__Group__0 ) )
            // InternalAssignment2.g:243:3: ( rule__Parenthesis__Group__0 )
            {
             before(grammarAccess.getParenthesisAccess().getGroup()); 
            // InternalAssignment2.g:244:3: ( rule__Parenthesis__Group__0 )
            // InternalAssignment2.g:244:4: rule__Parenthesis__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParenthesisAccess().getGroup()); 

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
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleNumber"
    // InternalAssignment2.g:253:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalAssignment2.g:254:1: ( ruleNumber EOF )
            // InternalAssignment2.g:255:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalAssignment2.g:262:1: ruleNumber : ( ( rule__Number__ValueAssignment ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:266:2: ( ( ( rule__Number__ValueAssignment ) ) )
            // InternalAssignment2.g:267:2: ( ( rule__Number__ValueAssignment ) )
            {
            // InternalAssignment2.g:267:2: ( ( rule__Number__ValueAssignment ) )
            // InternalAssignment2.g:268:3: ( rule__Number__ValueAssignment )
            {
             before(grammarAccess.getNumberAccess().getValueAssignment()); 
            // InternalAssignment2.g:269:3: ( rule__Number__ValueAssignment )
            // InternalAssignment2.g:269:4: rule__Number__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Number__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "rule__ExpPM__Alternatives"
    // InternalAssignment2.g:277:1: rule__ExpPM__Alternatives : ( ( ( rule__ExpPM__Group_0__0 ) ) | ( ( rule__ExpPM__Group_1__0 ) ) );
    public final void rule__ExpPM__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:281:1: ( ( ( rule__ExpPM__Group_0__0 ) ) | ( ( rule__ExpPM__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalAssignment2.g:282:2: ( ( rule__ExpPM__Group_0__0 ) )
                    {
                    // InternalAssignment2.g:282:2: ( ( rule__ExpPM__Group_0__0 ) )
                    // InternalAssignment2.g:283:3: ( rule__ExpPM__Group_0__0 )
                    {
                     before(grammarAccess.getExpPMAccess().getGroup_0()); 
                    // InternalAssignment2.g:284:3: ( rule__ExpPM__Group_0__0 )
                    // InternalAssignment2.g:284:4: rule__ExpPM__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpPM__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpPMAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAssignment2.g:288:2: ( ( rule__ExpPM__Group_1__0 ) )
                    {
                    // InternalAssignment2.g:288:2: ( ( rule__ExpPM__Group_1__0 ) )
                    // InternalAssignment2.g:289:3: ( rule__ExpPM__Group_1__0 )
                    {
                     before(grammarAccess.getExpPMAccess().getGroup_1()); 
                    // InternalAssignment2.g:290:3: ( rule__ExpPM__Group_1__0 )
                    // InternalAssignment2.g:290:4: rule__ExpPM__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpPM__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpPMAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ExpPM__Alternatives"


    // $ANTLR start "rule__ExpMD__Alternatives"
    // InternalAssignment2.g:298:1: rule__ExpMD__Alternatives : ( ( ( rule__ExpMD__Group_0__0 ) ) | ( ( rule__ExpMD__Group_1__0 ) ) );
    public final void rule__ExpMD__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:302:1: ( ( ( rule__ExpMD__Group_0__0 ) ) | ( ( rule__ExpMD__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalAssignment2.g:303:2: ( ( rule__ExpMD__Group_0__0 ) )
                    {
                    // InternalAssignment2.g:303:2: ( ( rule__ExpMD__Group_0__0 ) )
                    // InternalAssignment2.g:304:3: ( rule__ExpMD__Group_0__0 )
                    {
                     before(grammarAccess.getExpMDAccess().getGroup_0()); 
                    // InternalAssignment2.g:305:3: ( rule__ExpMD__Group_0__0 )
                    // InternalAssignment2.g:305:4: rule__ExpMD__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpMD__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpMDAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAssignment2.g:309:2: ( ( rule__ExpMD__Group_1__0 ) )
                    {
                    // InternalAssignment2.g:309:2: ( ( rule__ExpMD__Group_1__0 ) )
                    // InternalAssignment2.g:310:3: ( rule__ExpMD__Group_1__0 )
                    {
                     before(grammarAccess.getExpMDAccess().getGroup_1()); 
                    // InternalAssignment2.g:311:3: ( rule__ExpMD__Group_1__0 )
                    // InternalAssignment2.g:311:4: rule__ExpMD__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpMD__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpMDAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ExpMD__Alternatives"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalAssignment2.g:319:1: rule__Primary__Alternatives : ( ( ruleNumber ) | ( ruleParenthesis ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:323:1: ( ( ruleNumber ) | ( ruleParenthesis ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalAssignment2.g:324:2: ( ruleNumber )
                    {
                    // InternalAssignment2.g:324:2: ( ruleNumber )
                    // InternalAssignment2.g:325:3: ruleNumber
                    {
                     before(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNumber();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAssignment2.g:330:2: ( ruleParenthesis )
                    {
                    // InternalAssignment2.g:330:2: ( ruleParenthesis )
                    // InternalAssignment2.g:331:3: ruleParenthesis
                    {
                     before(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleParenthesis();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1()); 

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
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__MathExp__Group__0"
    // InternalAssignment2.g:340:1: rule__MathExp__Group__0 : rule__MathExp__Group__0__Impl rule__MathExp__Group__1 ;
    public final void rule__MathExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:344:1: ( rule__MathExp__Group__0__Impl rule__MathExp__Group__1 )
            // InternalAssignment2.g:345:2: rule__MathExp__Group__0__Impl rule__MathExp__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__MathExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MathExp__Group__1();

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
    // $ANTLR end "rule__MathExp__Group__0"


    // $ANTLR start "rule__MathExp__Group__0__Impl"
    // InternalAssignment2.g:352:1: rule__MathExp__Group__0__Impl : ( 'result' ) ;
    public final void rule__MathExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:356:1: ( ( 'result' ) )
            // InternalAssignment2.g:357:1: ( 'result' )
            {
            // InternalAssignment2.g:357:1: ( 'result' )
            // InternalAssignment2.g:358:2: 'result'
            {
             before(grammarAccess.getMathExpAccess().getResultKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getMathExpAccess().getResultKeyword_0()); 

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
    // $ANTLR end "rule__MathExp__Group__0__Impl"


    // $ANTLR start "rule__MathExp__Group__1"
    // InternalAssignment2.g:367:1: rule__MathExp__Group__1 : rule__MathExp__Group__1__Impl rule__MathExp__Group__2 ;
    public final void rule__MathExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:371:1: ( rule__MathExp__Group__1__Impl rule__MathExp__Group__2 )
            // InternalAssignment2.g:372:2: rule__MathExp__Group__1__Impl rule__MathExp__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__MathExp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MathExp__Group__2();

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
    // $ANTLR end "rule__MathExp__Group__1"


    // $ANTLR start "rule__MathExp__Group__1__Impl"
    // InternalAssignment2.g:379:1: rule__MathExp__Group__1__Impl : ( 'is' ) ;
    public final void rule__MathExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:383:1: ( ( 'is' ) )
            // InternalAssignment2.g:384:1: ( 'is' )
            {
            // InternalAssignment2.g:384:1: ( 'is' )
            // InternalAssignment2.g:385:2: 'is'
            {
             before(grammarAccess.getMathExpAccess().getIsKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMathExpAccess().getIsKeyword_1()); 

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
    // $ANTLR end "rule__MathExp__Group__1__Impl"


    // $ANTLR start "rule__MathExp__Group__2"
    // InternalAssignment2.g:394:1: rule__MathExp__Group__2 : rule__MathExp__Group__2__Impl ;
    public final void rule__MathExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:398:1: ( rule__MathExp__Group__2__Impl )
            // InternalAssignment2.g:399:2: rule__MathExp__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MathExp__Group__2__Impl();

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
    // $ANTLR end "rule__MathExp__Group__2"


    // $ANTLR start "rule__MathExp__Group__2__Impl"
    // InternalAssignment2.g:405:1: rule__MathExp__Group__2__Impl : ( ( rule__MathExp__ExpAssignment_2 ) ) ;
    public final void rule__MathExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:409:1: ( ( ( rule__MathExp__ExpAssignment_2 ) ) )
            // InternalAssignment2.g:410:1: ( ( rule__MathExp__ExpAssignment_2 ) )
            {
            // InternalAssignment2.g:410:1: ( ( rule__MathExp__ExpAssignment_2 ) )
            // InternalAssignment2.g:411:2: ( rule__MathExp__ExpAssignment_2 )
            {
             before(grammarAccess.getMathExpAccess().getExpAssignment_2()); 
            // InternalAssignment2.g:412:2: ( rule__MathExp__ExpAssignment_2 )
            // InternalAssignment2.g:412:3: rule__MathExp__ExpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MathExp__ExpAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMathExpAccess().getExpAssignment_2()); 

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
    // $ANTLR end "rule__MathExp__Group__2__Impl"


    // $ANTLR start "rule__ExpMultDiv__Group__0"
    // InternalAssignment2.g:421:1: rule__ExpMultDiv__Group__0 : rule__ExpMultDiv__Group__0__Impl rule__ExpMultDiv__Group__1 ;
    public final void rule__ExpMultDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:425:1: ( rule__ExpMultDiv__Group__0__Impl rule__ExpMultDiv__Group__1 )
            // InternalAssignment2.g:426:2: rule__ExpMultDiv__Group__0__Impl rule__ExpMultDiv__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ExpMultDiv__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpMultDiv__Group__1();

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
    // $ANTLR end "rule__ExpMultDiv__Group__0"


    // $ANTLR start "rule__ExpMultDiv__Group__0__Impl"
    // InternalAssignment2.g:433:1: rule__ExpMultDiv__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__ExpMultDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:437:1: ( ( rulePrimary ) )
            // InternalAssignment2.g:438:1: ( rulePrimary )
            {
            // InternalAssignment2.g:438:1: ( rulePrimary )
            // InternalAssignment2.g:439:2: rulePrimary
            {
             before(grammarAccess.getExpMultDivAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getExpMultDivAccess().getPrimaryParserRuleCall_0()); 

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
    // $ANTLR end "rule__ExpMultDiv__Group__0__Impl"


    // $ANTLR start "rule__ExpMultDiv__Group__1"
    // InternalAssignment2.g:448:1: rule__ExpMultDiv__Group__1 : rule__ExpMultDiv__Group__1__Impl ;
    public final void rule__ExpMultDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:452:1: ( rule__ExpMultDiv__Group__1__Impl )
            // InternalAssignment2.g:453:2: rule__ExpMultDiv__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpMultDiv__Group__1__Impl();

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
    // $ANTLR end "rule__ExpMultDiv__Group__1"


    // $ANTLR start "rule__ExpMultDiv__Group__1__Impl"
    // InternalAssignment2.g:459:1: rule__ExpMultDiv__Group__1__Impl : ( ( rule__ExpMultDiv__Group_1__0 )* ) ;
    public final void rule__ExpMultDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:463:1: ( ( ( rule__ExpMultDiv__Group_1__0 )* ) )
            // InternalAssignment2.g:464:1: ( ( rule__ExpMultDiv__Group_1__0 )* )
            {
            // InternalAssignment2.g:464:1: ( ( rule__ExpMultDiv__Group_1__0 )* )
            // InternalAssignment2.g:465:2: ( rule__ExpMultDiv__Group_1__0 )*
            {
             before(grammarAccess.getExpMultDivAccess().getGroup_1()); 
            // InternalAssignment2.g:466:2: ( rule__ExpMultDiv__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=15 && LA5_0<=16)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAssignment2.g:466:3: rule__ExpMultDiv__Group_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ExpMultDiv__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getExpMultDivAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ExpMultDiv__Group__1__Impl"


    // $ANTLR start "rule__ExpMultDiv__Group_1__0"
    // InternalAssignment2.g:475:1: rule__ExpMultDiv__Group_1__0 : rule__ExpMultDiv__Group_1__0__Impl rule__ExpMultDiv__Group_1__1 ;
    public final void rule__ExpMultDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:479:1: ( rule__ExpMultDiv__Group_1__0__Impl rule__ExpMultDiv__Group_1__1 )
            // InternalAssignment2.g:480:2: rule__ExpMultDiv__Group_1__0__Impl rule__ExpMultDiv__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__ExpMultDiv__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpMultDiv__Group_1__1();

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
    // $ANTLR end "rule__ExpMultDiv__Group_1__0"


    // $ANTLR start "rule__ExpMultDiv__Group_1__0__Impl"
    // InternalAssignment2.g:487:1: rule__ExpMultDiv__Group_1__0__Impl : ( () ) ;
    public final void rule__ExpMultDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:491:1: ( ( () ) )
            // InternalAssignment2.g:492:1: ( () )
            {
            // InternalAssignment2.g:492:1: ( () )
            // InternalAssignment2.g:493:2: ()
            {
             before(grammarAccess.getExpMultDivAccess().getExpLeftAction_1_0()); 
            // InternalAssignment2.g:494:2: ()
            // InternalAssignment2.g:494:3: 
            {
            }

             after(grammarAccess.getExpMultDivAccess().getExpLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpMultDiv__Group_1__0__Impl"


    // $ANTLR start "rule__ExpMultDiv__Group_1__1"
    // InternalAssignment2.g:502:1: rule__ExpMultDiv__Group_1__1 : rule__ExpMultDiv__Group_1__1__Impl rule__ExpMultDiv__Group_1__2 ;
    public final void rule__ExpMultDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:506:1: ( rule__ExpMultDiv__Group_1__1__Impl rule__ExpMultDiv__Group_1__2 )
            // InternalAssignment2.g:507:2: rule__ExpMultDiv__Group_1__1__Impl rule__ExpMultDiv__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__ExpMultDiv__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpMultDiv__Group_1__2();

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
    // $ANTLR end "rule__ExpMultDiv__Group_1__1"


    // $ANTLR start "rule__ExpMultDiv__Group_1__1__Impl"
    // InternalAssignment2.g:514:1: rule__ExpMultDiv__Group_1__1__Impl : ( ( rule__ExpMultDiv__OperatorAssignment_1_1 ) ) ;
    public final void rule__ExpMultDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:518:1: ( ( ( rule__ExpMultDiv__OperatorAssignment_1_1 ) ) )
            // InternalAssignment2.g:519:1: ( ( rule__ExpMultDiv__OperatorAssignment_1_1 ) )
            {
            // InternalAssignment2.g:519:1: ( ( rule__ExpMultDiv__OperatorAssignment_1_1 ) )
            // InternalAssignment2.g:520:2: ( rule__ExpMultDiv__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getExpMultDivAccess().getOperatorAssignment_1_1()); 
            // InternalAssignment2.g:521:2: ( rule__ExpMultDiv__OperatorAssignment_1_1 )
            // InternalAssignment2.g:521:3: rule__ExpMultDiv__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpMultDiv__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpMultDivAccess().getOperatorAssignment_1_1()); 

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
    // $ANTLR end "rule__ExpMultDiv__Group_1__1__Impl"


    // $ANTLR start "rule__ExpMultDiv__Group_1__2"
    // InternalAssignment2.g:529:1: rule__ExpMultDiv__Group_1__2 : rule__ExpMultDiv__Group_1__2__Impl ;
    public final void rule__ExpMultDiv__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:533:1: ( rule__ExpMultDiv__Group_1__2__Impl )
            // InternalAssignment2.g:534:2: rule__ExpMultDiv__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpMultDiv__Group_1__2__Impl();

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
    // $ANTLR end "rule__ExpMultDiv__Group_1__2"


    // $ANTLR start "rule__ExpMultDiv__Group_1__2__Impl"
    // InternalAssignment2.g:540:1: rule__ExpMultDiv__Group_1__2__Impl : ( ( rule__ExpMultDiv__RightAssignment_1_2 ) ) ;
    public final void rule__ExpMultDiv__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:544:1: ( ( ( rule__ExpMultDiv__RightAssignment_1_2 ) ) )
            // InternalAssignment2.g:545:1: ( ( rule__ExpMultDiv__RightAssignment_1_2 ) )
            {
            // InternalAssignment2.g:545:1: ( ( rule__ExpMultDiv__RightAssignment_1_2 ) )
            // InternalAssignment2.g:546:2: ( rule__ExpMultDiv__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpMultDivAccess().getRightAssignment_1_2()); 
            // InternalAssignment2.g:547:2: ( rule__ExpMultDiv__RightAssignment_1_2 )
            // InternalAssignment2.g:547:3: rule__ExpMultDiv__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpMultDiv__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpMultDivAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__ExpMultDiv__Group_1__2__Impl"


    // $ANTLR start "rule__ExpMinusPlus__Group__0"
    // InternalAssignment2.g:556:1: rule__ExpMinusPlus__Group__0 : rule__ExpMinusPlus__Group__0__Impl rule__ExpMinusPlus__Group__1 ;
    public final void rule__ExpMinusPlus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:560:1: ( rule__ExpMinusPlus__Group__0__Impl rule__ExpMinusPlus__Group__1 )
            // InternalAssignment2.g:561:2: rule__ExpMinusPlus__Group__0__Impl rule__ExpMinusPlus__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ExpMinusPlus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpMinusPlus__Group__1();

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
    // $ANTLR end "rule__ExpMinusPlus__Group__0"


    // $ANTLR start "rule__ExpMinusPlus__Group__0__Impl"
    // InternalAssignment2.g:568:1: rule__ExpMinusPlus__Group__0__Impl : ( ruleExpMultDiv ) ;
    public final void rule__ExpMinusPlus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:572:1: ( ( ruleExpMultDiv ) )
            // InternalAssignment2.g:573:1: ( ruleExpMultDiv )
            {
            // InternalAssignment2.g:573:1: ( ruleExpMultDiv )
            // InternalAssignment2.g:574:2: ruleExpMultDiv
            {
             before(grammarAccess.getExpMinusPlusAccess().getExpMultDivParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpMultDiv();

            state._fsp--;

             after(grammarAccess.getExpMinusPlusAccess().getExpMultDivParserRuleCall_0()); 

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
    // $ANTLR end "rule__ExpMinusPlus__Group__0__Impl"


    // $ANTLR start "rule__ExpMinusPlus__Group__1"
    // InternalAssignment2.g:583:1: rule__ExpMinusPlus__Group__1 : rule__ExpMinusPlus__Group__1__Impl ;
    public final void rule__ExpMinusPlus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:587:1: ( rule__ExpMinusPlus__Group__1__Impl )
            // InternalAssignment2.g:588:2: rule__ExpMinusPlus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpMinusPlus__Group__1__Impl();

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
    // $ANTLR end "rule__ExpMinusPlus__Group__1"


    // $ANTLR start "rule__ExpMinusPlus__Group__1__Impl"
    // InternalAssignment2.g:594:1: rule__ExpMinusPlus__Group__1__Impl : ( ( rule__ExpMinusPlus__Group_1__0 )* ) ;
    public final void rule__ExpMinusPlus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:598:1: ( ( ( rule__ExpMinusPlus__Group_1__0 )* ) )
            // InternalAssignment2.g:599:1: ( ( rule__ExpMinusPlus__Group_1__0 )* )
            {
            // InternalAssignment2.g:599:1: ( ( rule__ExpMinusPlus__Group_1__0 )* )
            // InternalAssignment2.g:600:2: ( rule__ExpMinusPlus__Group_1__0 )*
            {
             before(grammarAccess.getExpMinusPlusAccess().getGroup_1()); 
            // InternalAssignment2.g:601:2: ( rule__ExpMinusPlus__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=13 && LA6_0<=14)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAssignment2.g:601:3: rule__ExpMinusPlus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ExpMinusPlus__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getExpMinusPlusAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ExpMinusPlus__Group__1__Impl"


    // $ANTLR start "rule__ExpMinusPlus__Group_1__0"
    // InternalAssignment2.g:610:1: rule__ExpMinusPlus__Group_1__0 : rule__ExpMinusPlus__Group_1__0__Impl rule__ExpMinusPlus__Group_1__1 ;
    public final void rule__ExpMinusPlus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:614:1: ( rule__ExpMinusPlus__Group_1__0__Impl rule__ExpMinusPlus__Group_1__1 )
            // InternalAssignment2.g:615:2: rule__ExpMinusPlus__Group_1__0__Impl rule__ExpMinusPlus__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__ExpMinusPlus__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpMinusPlus__Group_1__1();

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
    // $ANTLR end "rule__ExpMinusPlus__Group_1__0"


    // $ANTLR start "rule__ExpMinusPlus__Group_1__0__Impl"
    // InternalAssignment2.g:622:1: rule__ExpMinusPlus__Group_1__0__Impl : ( () ) ;
    public final void rule__ExpMinusPlus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:626:1: ( ( () ) )
            // InternalAssignment2.g:627:1: ( () )
            {
            // InternalAssignment2.g:627:1: ( () )
            // InternalAssignment2.g:628:2: ()
            {
             before(grammarAccess.getExpMinusPlusAccess().getExpMinusPlusLeftAction_1_0()); 
            // InternalAssignment2.g:629:2: ()
            // InternalAssignment2.g:629:3: 
            {
            }

             after(grammarAccess.getExpMinusPlusAccess().getExpMinusPlusLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpMinusPlus__Group_1__0__Impl"


    // $ANTLR start "rule__ExpMinusPlus__Group_1__1"
    // InternalAssignment2.g:637:1: rule__ExpMinusPlus__Group_1__1 : rule__ExpMinusPlus__Group_1__1__Impl rule__ExpMinusPlus__Group_1__2 ;
    public final void rule__ExpMinusPlus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:641:1: ( rule__ExpMinusPlus__Group_1__1__Impl rule__ExpMinusPlus__Group_1__2 )
            // InternalAssignment2.g:642:2: rule__ExpMinusPlus__Group_1__1__Impl rule__ExpMinusPlus__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__ExpMinusPlus__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpMinusPlus__Group_1__2();

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
    // $ANTLR end "rule__ExpMinusPlus__Group_1__1"


    // $ANTLR start "rule__ExpMinusPlus__Group_1__1__Impl"
    // InternalAssignment2.g:649:1: rule__ExpMinusPlus__Group_1__1__Impl : ( ( rule__ExpMinusPlus__OperatorAssignment_1_1 ) ) ;
    public final void rule__ExpMinusPlus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:653:1: ( ( ( rule__ExpMinusPlus__OperatorAssignment_1_1 ) ) )
            // InternalAssignment2.g:654:1: ( ( rule__ExpMinusPlus__OperatorAssignment_1_1 ) )
            {
            // InternalAssignment2.g:654:1: ( ( rule__ExpMinusPlus__OperatorAssignment_1_1 ) )
            // InternalAssignment2.g:655:2: ( rule__ExpMinusPlus__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getExpMinusPlusAccess().getOperatorAssignment_1_1()); 
            // InternalAssignment2.g:656:2: ( rule__ExpMinusPlus__OperatorAssignment_1_1 )
            // InternalAssignment2.g:656:3: rule__ExpMinusPlus__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpMinusPlus__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpMinusPlusAccess().getOperatorAssignment_1_1()); 

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
    // $ANTLR end "rule__ExpMinusPlus__Group_1__1__Impl"


    // $ANTLR start "rule__ExpMinusPlus__Group_1__2"
    // InternalAssignment2.g:664:1: rule__ExpMinusPlus__Group_1__2 : rule__ExpMinusPlus__Group_1__2__Impl ;
    public final void rule__ExpMinusPlus__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:668:1: ( rule__ExpMinusPlus__Group_1__2__Impl )
            // InternalAssignment2.g:669:2: rule__ExpMinusPlus__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpMinusPlus__Group_1__2__Impl();

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
    // $ANTLR end "rule__ExpMinusPlus__Group_1__2"


    // $ANTLR start "rule__ExpMinusPlus__Group_1__2__Impl"
    // InternalAssignment2.g:675:1: rule__ExpMinusPlus__Group_1__2__Impl : ( ( rule__ExpMinusPlus__RightAssignment_1_2 ) ) ;
    public final void rule__ExpMinusPlus__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:679:1: ( ( ( rule__ExpMinusPlus__RightAssignment_1_2 ) ) )
            // InternalAssignment2.g:680:1: ( ( rule__ExpMinusPlus__RightAssignment_1_2 ) )
            {
            // InternalAssignment2.g:680:1: ( ( rule__ExpMinusPlus__RightAssignment_1_2 ) )
            // InternalAssignment2.g:681:2: ( rule__ExpMinusPlus__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpMinusPlusAccess().getRightAssignment_1_2()); 
            // InternalAssignment2.g:682:2: ( rule__ExpMinusPlus__RightAssignment_1_2 )
            // InternalAssignment2.g:682:3: rule__ExpMinusPlus__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpMinusPlus__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpMinusPlusAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__ExpMinusPlus__Group_1__2__Impl"


    // $ANTLR start "rule__ExpPM__Group_0__0"
    // InternalAssignment2.g:691:1: rule__ExpPM__Group_0__0 : rule__ExpPM__Group_0__0__Impl rule__ExpPM__Group_0__1 ;
    public final void rule__ExpPM__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:695:1: ( rule__ExpPM__Group_0__0__Impl rule__ExpPM__Group_0__1 )
            // InternalAssignment2.g:696:2: rule__ExpPM__Group_0__0__Impl rule__ExpPM__Group_0__1
            {
            pushFollow(FOLLOW_10);
            rule__ExpPM__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpPM__Group_0__1();

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
    // $ANTLR end "rule__ExpPM__Group_0__0"


    // $ANTLR start "rule__ExpPM__Group_0__0__Impl"
    // InternalAssignment2.g:703:1: rule__ExpPM__Group_0__0__Impl : ( () ) ;
    public final void rule__ExpPM__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:707:1: ( ( () ) )
            // InternalAssignment2.g:708:1: ( () )
            {
            // InternalAssignment2.g:708:1: ( () )
            // InternalAssignment2.g:709:2: ()
            {
             before(grammarAccess.getExpPMAccess().getPlusAction_0_0()); 
            // InternalAssignment2.g:710:2: ()
            // InternalAssignment2.g:710:3: 
            {
            }

             after(grammarAccess.getExpPMAccess().getPlusAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpPM__Group_0__0__Impl"


    // $ANTLR start "rule__ExpPM__Group_0__1"
    // InternalAssignment2.g:718:1: rule__ExpPM__Group_0__1 : rule__ExpPM__Group_0__1__Impl ;
    public final void rule__ExpPM__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:722:1: ( rule__ExpPM__Group_0__1__Impl )
            // InternalAssignment2.g:723:2: rule__ExpPM__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpPM__Group_0__1__Impl();

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
    // $ANTLR end "rule__ExpPM__Group_0__1"


    // $ANTLR start "rule__ExpPM__Group_0__1__Impl"
    // InternalAssignment2.g:729:1: rule__ExpPM__Group_0__1__Impl : ( '+' ) ;
    public final void rule__ExpPM__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:733:1: ( ( '+' ) )
            // InternalAssignment2.g:734:1: ( '+' )
            {
            // InternalAssignment2.g:734:1: ( '+' )
            // InternalAssignment2.g:735:2: '+'
            {
             before(grammarAccess.getExpPMAccess().getPlusSignKeyword_0_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getExpPMAccess().getPlusSignKeyword_0_1()); 

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
    // $ANTLR end "rule__ExpPM__Group_0__1__Impl"


    // $ANTLR start "rule__ExpPM__Group_1__0"
    // InternalAssignment2.g:745:1: rule__ExpPM__Group_1__0 : rule__ExpPM__Group_1__0__Impl rule__ExpPM__Group_1__1 ;
    public final void rule__ExpPM__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:749:1: ( rule__ExpPM__Group_1__0__Impl rule__ExpPM__Group_1__1 )
            // InternalAssignment2.g:750:2: rule__ExpPM__Group_1__0__Impl rule__ExpPM__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__ExpPM__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpPM__Group_1__1();

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
    // $ANTLR end "rule__ExpPM__Group_1__0"


    // $ANTLR start "rule__ExpPM__Group_1__0__Impl"
    // InternalAssignment2.g:757:1: rule__ExpPM__Group_1__0__Impl : ( () ) ;
    public final void rule__ExpPM__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:761:1: ( ( () ) )
            // InternalAssignment2.g:762:1: ( () )
            {
            // InternalAssignment2.g:762:1: ( () )
            // InternalAssignment2.g:763:2: ()
            {
             before(grammarAccess.getExpPMAccess().getMinusAction_1_0()); 
            // InternalAssignment2.g:764:2: ()
            // InternalAssignment2.g:764:3: 
            {
            }

             after(grammarAccess.getExpPMAccess().getMinusAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpPM__Group_1__0__Impl"


    // $ANTLR start "rule__ExpPM__Group_1__1"
    // InternalAssignment2.g:772:1: rule__ExpPM__Group_1__1 : rule__ExpPM__Group_1__1__Impl ;
    public final void rule__ExpPM__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:776:1: ( rule__ExpPM__Group_1__1__Impl )
            // InternalAssignment2.g:777:2: rule__ExpPM__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpPM__Group_1__1__Impl();

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
    // $ANTLR end "rule__ExpPM__Group_1__1"


    // $ANTLR start "rule__ExpPM__Group_1__1__Impl"
    // InternalAssignment2.g:783:1: rule__ExpPM__Group_1__1__Impl : ( '-' ) ;
    public final void rule__ExpPM__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:787:1: ( ( '-' ) )
            // InternalAssignment2.g:788:1: ( '-' )
            {
            // InternalAssignment2.g:788:1: ( '-' )
            // InternalAssignment2.g:789:2: '-'
            {
             before(grammarAccess.getExpPMAccess().getHyphenMinusKeyword_1_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getExpPMAccess().getHyphenMinusKeyword_1_1()); 

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
    // $ANTLR end "rule__ExpPM__Group_1__1__Impl"


    // $ANTLR start "rule__ExpMD__Group_0__0"
    // InternalAssignment2.g:799:1: rule__ExpMD__Group_0__0 : rule__ExpMD__Group_0__0__Impl rule__ExpMD__Group_0__1 ;
    public final void rule__ExpMD__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:803:1: ( rule__ExpMD__Group_0__0__Impl rule__ExpMD__Group_0__1 )
            // InternalAssignment2.g:804:2: rule__ExpMD__Group_0__0__Impl rule__ExpMD__Group_0__1
            {
            pushFollow(FOLLOW_11);
            rule__ExpMD__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpMD__Group_0__1();

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
    // $ANTLR end "rule__ExpMD__Group_0__0"


    // $ANTLR start "rule__ExpMD__Group_0__0__Impl"
    // InternalAssignment2.g:811:1: rule__ExpMD__Group_0__0__Impl : ( () ) ;
    public final void rule__ExpMD__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:815:1: ( ( () ) )
            // InternalAssignment2.g:816:1: ( () )
            {
            // InternalAssignment2.g:816:1: ( () )
            // InternalAssignment2.g:817:2: ()
            {
             before(grammarAccess.getExpMDAccess().getMultAction_0_0()); 
            // InternalAssignment2.g:818:2: ()
            // InternalAssignment2.g:818:3: 
            {
            }

             after(grammarAccess.getExpMDAccess().getMultAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpMD__Group_0__0__Impl"


    // $ANTLR start "rule__ExpMD__Group_0__1"
    // InternalAssignment2.g:826:1: rule__ExpMD__Group_0__1 : rule__ExpMD__Group_0__1__Impl ;
    public final void rule__ExpMD__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:830:1: ( rule__ExpMD__Group_0__1__Impl )
            // InternalAssignment2.g:831:2: rule__ExpMD__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpMD__Group_0__1__Impl();

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
    // $ANTLR end "rule__ExpMD__Group_0__1"


    // $ANTLR start "rule__ExpMD__Group_0__1__Impl"
    // InternalAssignment2.g:837:1: rule__ExpMD__Group_0__1__Impl : ( '*' ) ;
    public final void rule__ExpMD__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:841:1: ( ( '*' ) )
            // InternalAssignment2.g:842:1: ( '*' )
            {
            // InternalAssignment2.g:842:1: ( '*' )
            // InternalAssignment2.g:843:2: '*'
            {
             before(grammarAccess.getExpMDAccess().getAsteriskKeyword_0_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getExpMDAccess().getAsteriskKeyword_0_1()); 

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
    // $ANTLR end "rule__ExpMD__Group_0__1__Impl"


    // $ANTLR start "rule__ExpMD__Group_1__0"
    // InternalAssignment2.g:853:1: rule__ExpMD__Group_1__0 : rule__ExpMD__Group_1__0__Impl rule__ExpMD__Group_1__1 ;
    public final void rule__ExpMD__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:857:1: ( rule__ExpMD__Group_1__0__Impl rule__ExpMD__Group_1__1 )
            // InternalAssignment2.g:858:2: rule__ExpMD__Group_1__0__Impl rule__ExpMD__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__ExpMD__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpMD__Group_1__1();

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
    // $ANTLR end "rule__ExpMD__Group_1__0"


    // $ANTLR start "rule__ExpMD__Group_1__0__Impl"
    // InternalAssignment2.g:865:1: rule__ExpMD__Group_1__0__Impl : ( () ) ;
    public final void rule__ExpMD__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:869:1: ( ( () ) )
            // InternalAssignment2.g:870:1: ( () )
            {
            // InternalAssignment2.g:870:1: ( () )
            // InternalAssignment2.g:871:2: ()
            {
             before(grammarAccess.getExpMDAccess().getDivAction_1_0()); 
            // InternalAssignment2.g:872:2: ()
            // InternalAssignment2.g:872:3: 
            {
            }

             after(grammarAccess.getExpMDAccess().getDivAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpMD__Group_1__0__Impl"


    // $ANTLR start "rule__ExpMD__Group_1__1"
    // InternalAssignment2.g:880:1: rule__ExpMD__Group_1__1 : rule__ExpMD__Group_1__1__Impl ;
    public final void rule__ExpMD__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:884:1: ( rule__ExpMD__Group_1__1__Impl )
            // InternalAssignment2.g:885:2: rule__ExpMD__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpMD__Group_1__1__Impl();

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
    // $ANTLR end "rule__ExpMD__Group_1__1"


    // $ANTLR start "rule__ExpMD__Group_1__1__Impl"
    // InternalAssignment2.g:891:1: rule__ExpMD__Group_1__1__Impl : ( '/' ) ;
    public final void rule__ExpMD__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:895:1: ( ( '/' ) )
            // InternalAssignment2.g:896:1: ( '/' )
            {
            // InternalAssignment2.g:896:1: ( '/' )
            // InternalAssignment2.g:897:2: '/'
            {
             before(grammarAccess.getExpMDAccess().getSolidusKeyword_1_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getExpMDAccess().getSolidusKeyword_1_1()); 

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
    // $ANTLR end "rule__ExpMD__Group_1__1__Impl"


    // $ANTLR start "rule__Parenthesis__Group__0"
    // InternalAssignment2.g:907:1: rule__Parenthesis__Group__0 : rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1 ;
    public final void rule__Parenthesis__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:911:1: ( rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1 )
            // InternalAssignment2.g:912:2: rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Parenthesis__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__1();

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
    // $ANTLR end "rule__Parenthesis__Group__0"


    // $ANTLR start "rule__Parenthesis__Group__0__Impl"
    // InternalAssignment2.g:919:1: rule__Parenthesis__Group__0__Impl : ( '(' ) ;
    public final void rule__Parenthesis__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:923:1: ( ( '(' ) )
            // InternalAssignment2.g:924:1: ( '(' )
            {
            // InternalAssignment2.g:924:1: ( '(' )
            // InternalAssignment2.g:925:2: '('
            {
             before(grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__Parenthesis__Group__0__Impl"


    // $ANTLR start "rule__Parenthesis__Group__1"
    // InternalAssignment2.g:934:1: rule__Parenthesis__Group__1 : rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2 ;
    public final void rule__Parenthesis__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:938:1: ( rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2 )
            // InternalAssignment2.g:939:2: rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Parenthesis__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__2();

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
    // $ANTLR end "rule__Parenthesis__Group__1"


    // $ANTLR start "rule__Parenthesis__Group__1__Impl"
    // InternalAssignment2.g:946:1: rule__Parenthesis__Group__1__Impl : ( ( rule__Parenthesis__ExpAssignment_1 ) ) ;
    public final void rule__Parenthesis__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:950:1: ( ( ( rule__Parenthesis__ExpAssignment_1 ) ) )
            // InternalAssignment2.g:951:1: ( ( rule__Parenthesis__ExpAssignment_1 ) )
            {
            // InternalAssignment2.g:951:1: ( ( rule__Parenthesis__ExpAssignment_1 ) )
            // InternalAssignment2.g:952:2: ( rule__Parenthesis__ExpAssignment_1 )
            {
             before(grammarAccess.getParenthesisAccess().getExpAssignment_1()); 
            // InternalAssignment2.g:953:2: ( rule__Parenthesis__ExpAssignment_1 )
            // InternalAssignment2.g:953:3: rule__Parenthesis__ExpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parenthesis__ExpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParenthesisAccess().getExpAssignment_1()); 

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
    // $ANTLR end "rule__Parenthesis__Group__1__Impl"


    // $ANTLR start "rule__Parenthesis__Group__2"
    // InternalAssignment2.g:961:1: rule__Parenthesis__Group__2 : rule__Parenthesis__Group__2__Impl ;
    public final void rule__Parenthesis__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:965:1: ( rule__Parenthesis__Group__2__Impl )
            // InternalAssignment2.g:966:2: rule__Parenthesis__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__2__Impl();

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
    // $ANTLR end "rule__Parenthesis__Group__2"


    // $ANTLR start "rule__Parenthesis__Group__2__Impl"
    // InternalAssignment2.g:972:1: rule__Parenthesis__Group__2__Impl : ( ')' ) ;
    public final void rule__Parenthesis__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:976:1: ( ( ')' ) )
            // InternalAssignment2.g:977:1: ( ')' )
            {
            // InternalAssignment2.g:977:1: ( ')' )
            // InternalAssignment2.g:978:2: ')'
            {
             before(grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Parenthesis__Group__2__Impl"


    // $ANTLR start "rule__Model__MathAssignment"
    // InternalAssignment2.g:988:1: rule__Model__MathAssignment : ( ruleMathExp ) ;
    public final void rule__Model__MathAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:992:1: ( ( ruleMathExp ) )
            // InternalAssignment2.g:993:2: ( ruleMathExp )
            {
            // InternalAssignment2.g:993:2: ( ruleMathExp )
            // InternalAssignment2.g:994:3: ruleMathExp
            {
             before(grammarAccess.getModelAccess().getMathMathExpParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMathExp();

            state._fsp--;

             after(grammarAccess.getModelAccess().getMathMathExpParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__MathAssignment"


    // $ANTLR start "rule__MathExp__ExpAssignment_2"
    // InternalAssignment2.g:1003:1: rule__MathExp__ExpAssignment_2 : ( ruleExpMinusPlus ) ;
    public final void rule__MathExp__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:1007:1: ( ( ruleExpMinusPlus ) )
            // InternalAssignment2.g:1008:2: ( ruleExpMinusPlus )
            {
            // InternalAssignment2.g:1008:2: ( ruleExpMinusPlus )
            // InternalAssignment2.g:1009:3: ruleExpMinusPlus
            {
             before(grammarAccess.getMathExpAccess().getExpExpMinusPlusParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpMinusPlus();

            state._fsp--;

             after(grammarAccess.getMathExpAccess().getExpExpMinusPlusParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__MathExp__ExpAssignment_2"


    // $ANTLR start "rule__ExpMultDiv__OperatorAssignment_1_1"
    // InternalAssignment2.g:1018:1: rule__ExpMultDiv__OperatorAssignment_1_1 : ( ruleExpMD ) ;
    public final void rule__ExpMultDiv__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:1022:1: ( ( ruleExpMD ) )
            // InternalAssignment2.g:1023:2: ( ruleExpMD )
            {
            // InternalAssignment2.g:1023:2: ( ruleExpMD )
            // InternalAssignment2.g:1024:3: ruleExpMD
            {
             before(grammarAccess.getExpMultDivAccess().getOperatorExpMDParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpMD();

            state._fsp--;

             after(grammarAccess.getExpMultDivAccess().getOperatorExpMDParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__ExpMultDiv__OperatorAssignment_1_1"


    // $ANTLR start "rule__ExpMultDiv__RightAssignment_1_2"
    // InternalAssignment2.g:1033:1: rule__ExpMultDiv__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__ExpMultDiv__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:1037:1: ( ( rulePrimary ) )
            // InternalAssignment2.g:1038:2: ( rulePrimary )
            {
            // InternalAssignment2.g:1038:2: ( rulePrimary )
            // InternalAssignment2.g:1039:3: rulePrimary
            {
             before(grammarAccess.getExpMultDivAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getExpMultDivAccess().getRightPrimaryParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__ExpMultDiv__RightAssignment_1_2"


    // $ANTLR start "rule__ExpMinusPlus__OperatorAssignment_1_1"
    // InternalAssignment2.g:1048:1: rule__ExpMinusPlus__OperatorAssignment_1_1 : ( ruleExpPM ) ;
    public final void rule__ExpMinusPlus__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:1052:1: ( ( ruleExpPM ) )
            // InternalAssignment2.g:1053:2: ( ruleExpPM )
            {
            // InternalAssignment2.g:1053:2: ( ruleExpPM )
            // InternalAssignment2.g:1054:3: ruleExpPM
            {
             before(grammarAccess.getExpMinusPlusAccess().getOperatorExpPMParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpPM();

            state._fsp--;

             after(grammarAccess.getExpMinusPlusAccess().getOperatorExpPMParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__ExpMinusPlus__OperatorAssignment_1_1"


    // $ANTLR start "rule__ExpMinusPlus__RightAssignment_1_2"
    // InternalAssignment2.g:1063:1: rule__ExpMinusPlus__RightAssignment_1_2 : ( ruleExpMultDiv ) ;
    public final void rule__ExpMinusPlus__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:1067:1: ( ( ruleExpMultDiv ) )
            // InternalAssignment2.g:1068:2: ( ruleExpMultDiv )
            {
            // InternalAssignment2.g:1068:2: ( ruleExpMultDiv )
            // InternalAssignment2.g:1069:3: ruleExpMultDiv
            {
             before(grammarAccess.getExpMinusPlusAccess().getRightExpMultDivParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpMultDiv();

            state._fsp--;

             after(grammarAccess.getExpMinusPlusAccess().getRightExpMultDivParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__ExpMinusPlus__RightAssignment_1_2"


    // $ANTLR start "rule__Parenthesis__ExpAssignment_1"
    // InternalAssignment2.g:1078:1: rule__Parenthesis__ExpAssignment_1 : ( ruleExpMinusPlus ) ;
    public final void rule__Parenthesis__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:1082:1: ( ( ruleExpMinusPlus ) )
            // InternalAssignment2.g:1083:2: ( ruleExpMinusPlus )
            {
            // InternalAssignment2.g:1083:2: ( ruleExpMinusPlus )
            // InternalAssignment2.g:1084:3: ruleExpMinusPlus
            {
             before(grammarAccess.getParenthesisAccess().getExpExpMinusPlusParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpMinusPlus();

            state._fsp--;

             after(grammarAccess.getParenthesisAccess().getExpExpMinusPlusParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Parenthesis__ExpAssignment_1"


    // $ANTLR start "rule__Number__ValueAssignment"
    // InternalAssignment2.g:1093:1: rule__Number__ValueAssignment : ( RULE_INT ) ;
    public final void rule__Number__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssignment2.g:1097:1: ( ( RULE_INT ) )
            // InternalAssignment2.g:1098:2: ( RULE_INT )
            {
            // InternalAssignment2.g:1098:2: ( RULE_INT )
            // InternalAssignment2.g:1099:3: RULE_INT
            {
             before(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Number__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});

}
/*
 * generated by Xtext 2.21.0
 */
package org.xtext.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.mydsl.ide.contentassist.antlr.internal.InternalAssignment2Parser;
import org.xtext.mydsl.services.Assignment2GrammarAccess;

public class Assignment2Parser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(Assignment2GrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, Assignment2GrammarAccess grammarAccess) {
			builder.put(grammarAccess.getExpAccess().getAlternatives_1_0(), "rule__Exp__Alternatives_1_0");
			builder.put(grammarAccess.getFactorAccess().getAlternatives_1_0(), "rule__Factor__Alternatives_1_0");
			builder.put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
			builder.put(grammarAccess.getMathExpAccess().getGroup(), "rule__MathExp__Group__0");
			builder.put(grammarAccess.getExpAccess().getGroup(), "rule__Exp__Group__0");
			builder.put(grammarAccess.getExpAccess().getGroup_1(), "rule__Exp__Group_1__0");
			builder.put(grammarAccess.getExpAccess().getGroup_1_0_0(), "rule__Exp__Group_1_0_0__0");
			builder.put(grammarAccess.getExpAccess().getGroup_1_0_1(), "rule__Exp__Group_1_0_1__0");
			builder.put(grammarAccess.getFactorAccess().getGroup(), "rule__Factor__Group__0");
			builder.put(grammarAccess.getFactorAccess().getGroup_1(), "rule__Factor__Group_1__0");
			builder.put(grammarAccess.getFactorAccess().getGroup_1_0_0(), "rule__Factor__Group_1_0_0__0");
			builder.put(grammarAccess.getFactorAccess().getGroup_1_0_1(), "rule__Factor__Group_1_0_1__0");
			builder.put(grammarAccess.getVariableUseAccess().getGroup(), "rule__VariableUse__Group__0");
			builder.put(grammarAccess.getVariableBindingAccess().getGroup(), "rule__VariableBinding__Group__0");
			builder.put(grammarAccess.getVariableBindingAccess().getGroup_3(), "rule__VariableBinding__Group_3__0");
			builder.put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
			builder.put(grammarAccess.getParenthesisAccess().getGroup(), "rule__Parenthesis__Group__0");
			builder.put(grammarAccess.getNumberAccess().getGroup(), "rule__Number__Group__0");
			builder.put(grammarAccess.getModelAccess().getMathexpAssignment(), "rule__Model__MathexpAssignment");
			builder.put(grammarAccess.getMathExpAccess().getNameAssignment_1(), "rule__MathExp__NameAssignment_1");
			builder.put(grammarAccess.getMathExpAccess().getExpAssignment_3(), "rule__MathExp__ExpAssignment_3");
			builder.put(grammarAccess.getExpAccess().getRightAssignment_1_1(), "rule__Exp__RightAssignment_1_1");
			builder.put(grammarAccess.getFactorAccess().getRightAssignment_1_1(), "rule__Factor__RightAssignment_1_1");
			builder.put(grammarAccess.getVariableUseAccess().getIdAssignment_1(), "rule__VariableUse__IdAssignment_1");
			builder.put(grammarAccess.getVariableBindingAccess().getVariableAssignment_2(), "rule__VariableBinding__VariableAssignment_2");
			builder.put(grammarAccess.getVariableBindingAccess().getVariableAssignment_3_1(), "rule__VariableBinding__VariableAssignment_3_1");
			builder.put(grammarAccess.getVariableBindingAccess().getBodyAssignment_5(), "rule__VariableBinding__BodyAssignment_5");
			builder.put(grammarAccess.getVariableAccess().getIdAssignment_0(), "rule__Variable__IdAssignment_0");
			builder.put(grammarAccess.getVariableAccess().getBindingAssignment_2(), "rule__Variable__BindingAssignment_2");
			builder.put(grammarAccess.getNumberAccess().getValueAssignment_1(), "rule__Number__ValueAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private Assignment2GrammarAccess grammarAccess;

	@Override
	protected InternalAssignment2Parser createParser() {
		InternalAssignment2Parser result = new InternalAssignment2Parser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public Assignment2GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(Assignment2GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}

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
			builder.put(grammarAccess.getExpPMAccess().getAlternatives(), "rule__ExpPM__Alternatives");
			builder.put(grammarAccess.getExpMDAccess().getAlternatives(), "rule__ExpMD__Alternatives");
			builder.put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
			builder.put(grammarAccess.getMathExpAccess().getGroup(), "rule__MathExp__Group__0");
			builder.put(grammarAccess.getExpMultDivAccess().getGroup(), "rule__ExpMultDiv__Group__0");
			builder.put(grammarAccess.getExpMultDivAccess().getGroup_1(), "rule__ExpMultDiv__Group_1__0");
			builder.put(grammarAccess.getExpMinusPlusAccess().getGroup(), "rule__ExpMinusPlus__Group__0");
			builder.put(grammarAccess.getExpMinusPlusAccess().getGroup_1(), "rule__ExpMinusPlus__Group_1__0");
			builder.put(grammarAccess.getExpPMAccess().getGroup_0(), "rule__ExpPM__Group_0__0");
			builder.put(grammarAccess.getExpPMAccess().getGroup_1(), "rule__ExpPM__Group_1__0");
			builder.put(grammarAccess.getExpMDAccess().getGroup_0(), "rule__ExpMD__Group_0__0");
			builder.put(grammarAccess.getExpMDAccess().getGroup_1(), "rule__ExpMD__Group_1__0");
			builder.put(grammarAccess.getParenthesisAccess().getGroup(), "rule__Parenthesis__Group__0");
			builder.put(grammarAccess.getModelAccess().getMathAssignment(), "rule__Model__MathAssignment");
			builder.put(grammarAccess.getMathExpAccess().getExpAssignment_2(), "rule__MathExp__ExpAssignment_2");
			builder.put(grammarAccess.getExpMultDivAccess().getOperatorAssignment_1_1(), "rule__ExpMultDiv__OperatorAssignment_1_1");
			builder.put(grammarAccess.getExpMultDivAccess().getRightAssignment_1_2(), "rule__ExpMultDiv__RightAssignment_1_2");
			builder.put(grammarAccess.getExpMinusPlusAccess().getOperatorAssignment_1_1(), "rule__ExpMinusPlus__OperatorAssignment_1_1");
			builder.put(grammarAccess.getExpMinusPlusAccess().getRightAssignment_1_2(), "rule__ExpMinusPlus__RightAssignment_1_2");
			builder.put(grammarAccess.getParenthesisAccess().getExpAssignment_1(), "rule__Parenthesis__ExpAssignment_1");
			builder.put(grammarAccess.getNumberAccess().getValueAssignment(), "rule__Number__ValueAssignment");
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

/*
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getTerminologyBoxStatementAccess().getAlternatives(), "rule__TerminologyBoxStatement__Alternatives");
			builder.put(grammarAccess.getEntityAccess().getAlternatives(), "rule__Entity__Alternatives");
			builder.put(grammarAccess.getTerminologyGraphAccess().getGroup(), "rule__TerminologyGraph__Group__0");
			builder.put(grammarAccess.getAspectAccess().getGroup(), "rule__Aspect__Group__0");
			builder.put(grammarAccess.getConceptAccess().getGroup(), "rule__Concept__Group__0");
			builder.put(grammarAccess.getRelationAccess().getGroup(), "rule__Relation__Group__0");
			builder.put(grammarAccess.getExtentAccess().getModulesAssignment(), "rule__Extent__ModulesAssignment");
			builder.put(grammarAccess.getTerminologyGraphAccess().getIriAssignment_1(), "rule__TerminologyGraph__IriAssignment_1");
			builder.put(grammarAccess.getTerminologyGraphAccess().getBoxStatementsAssignment_3(), "rule__TerminologyGraph__BoxStatementsAssignment_3");
			builder.put(grammarAccess.getAspectAccess().getNameAssignment_1(), "rule__Aspect__NameAssignment_1");
			builder.put(grammarAccess.getConceptAccess().getNameAssignment_1(), "rule__Concept__NameAssignment_1");
			builder.put(grammarAccess.getRelationAccess().getNameAssignment_1(), "rule__Relation__NameAssignment_1");
			builder.put(grammarAccess.getRelationAccess().getSourceAssignment_5(), "rule__Relation__SourceAssignment_5");
			builder.put(grammarAccess.getRelationAccess().getTargetAssignment_8(), "rule__Relation__TargetAssignment_8");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyDslGrammarAccess grammarAccess;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
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

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}

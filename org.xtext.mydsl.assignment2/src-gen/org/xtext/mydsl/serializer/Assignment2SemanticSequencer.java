/*
 * generated by Xtext 2.21.0
 */
package org.xtext.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.mydsl.assignment2.Assignment2Package;
import org.xtext.mydsl.assignment2.Div;
import org.xtext.mydsl.assignment2.Exp;
import org.xtext.mydsl.assignment2.MathExp;
import org.xtext.mydsl.assignment2.Minus;
import org.xtext.mydsl.assignment2.Mult;
import org.xtext.mydsl.assignment2.Parenthesis;
import org.xtext.mydsl.assignment2.Plus;
import org.xtext.mydsl.services.Assignment2GrammarAccess;

@SuppressWarnings("all")
public class Assignment2SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private Assignment2GrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == Assignment2Package.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case Assignment2Package.DIV:
				sequence_ExpOp(context, (Div) semanticObject); 
				return; 
			case Assignment2Package.EXP:
				sequence_Exp(context, (Exp) semanticObject); 
				return; 
			case Assignment2Package.MATH_EXP:
				sequence_MathExp(context, (MathExp) semanticObject); 
				return; 
			case Assignment2Package.MINUS:
				sequence_ExpOp(context, (Minus) semanticObject); 
				return; 
			case Assignment2Package.MULT:
				sequence_ExpOp(context, (Mult) semanticObject); 
				return; 
			case Assignment2Package.NUMBER:
				sequence_Number(context, (org.xtext.mydsl.assignment2.Number) semanticObject); 
				return; 
			case Assignment2Package.PARENTHESIS:
				sequence_Parenthesis(context, (Parenthesis) semanticObject); 
				return; 
			case Assignment2Package.PLUS:
				sequence_ExpOp(context, (Plus) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ExpOp returns Div
	 *
	 * Constraint:
	 *     {Div}
	 */
	protected void sequence_ExpOp(ISerializationContext context, Div semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExpOp returns Minus
	 *
	 * Constraint:
	 *     {Minus}
	 */
	protected void sequence_ExpOp(ISerializationContext context, Minus semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExpOp returns Mult
	 *
	 * Constraint:
	 *     {Mult}
	 */
	protected void sequence_ExpOp(ISerializationContext context, Mult semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExpOp returns Plus
	 *
	 * Constraint:
	 *     {Plus}
	 */
	protected void sequence_ExpOp(ISerializationContext context, Plus semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns Exp
	 *
	 * Constraint:
	 *     (left=Primary (operator=ExpOp right=Exp)?)
	 */
	protected void sequence_Exp(ISerializationContext context, Exp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MathExp returns MathExp
	 *
	 * Constraint:
	 *     exp=Exp
	 */
	protected void sequence_MathExp(ISerializationContext context, MathExp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Assignment2Package.Literals.MATH_EXP__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Assignment2Package.Literals.MATH_EXP__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_2_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Primary returns Number
	 *     Number returns Number
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Number(ISerializationContext context, org.xtext.mydsl.assignment2.Number semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Assignment2Package.Literals.NUMBER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Assignment2Package.Literals.NUMBER__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Primary returns Parenthesis
	 *     Parenthesis returns Parenthesis
	 *
	 * Constraint:
	 *     exp=Exp
	 */
	protected void sequence_Parenthesis(ISerializationContext context, Parenthesis semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Assignment2Package.Literals.PARENTHESIS__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Assignment2Package.Literals.PARENTHESIS__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_1_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
}
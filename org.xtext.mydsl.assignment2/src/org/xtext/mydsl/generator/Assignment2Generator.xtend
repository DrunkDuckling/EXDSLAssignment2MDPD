/*
 * generated by Xtext 2.21.0
 */
package org.xtext.mydsl.generator

import javax.swing.JOptionPane
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.mydsl.assignment2.Div
import org.xtext.mydsl.assignment2.Exp
import org.xtext.mydsl.assignment2.MathExp
import org.xtext.mydsl.assignment2.Minus
import org.xtext.mydsl.assignment2.Mult
import org.xtext.mydsl.assignment2.Plus
import org.xtext.mydsl.assignment2.Primary
import org.xtext.mydsl.assignment2.Model
import org.xtext.mydsl.assignment2.Parenthesis
import org.xtext.mydsl.assignment2.Number
import org.xtext.mydsl.assignment2.ExpMinusPlus
import org.xtext.mydsl.assignment2.ExpMultDiv

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class Assignment2Generator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		resource.allContents.filter(Model).next.math.forEach[compute]
	}
	
	def void compute(MathExp math) {
		val result = math.exp.computeExpression
		JOptionPane.showMessageDialog(null, "result = "+result,"Math Language", JOptionPane.INFORMATION_MESSAGE)
	}
	
	def int computeResult(MathExp math) {
		math.exp.computeExpression
	}
	
	def int computePrim(Primary factor) { 
		factor.computeInnerPrimary
	}
	
	// If the Expression contains Plus or Minus
	def dispatch int computeExpression(ExpMinusPlus emp){
		// Values containing the numbers
		val left = emp.left.computeExpression
		val right = emp.right.computeExpression
		// Switch: For the operators
		switch(emp.operator){
			Plus: left+right
			// default = Minus (It gets cranky if there is no default)
			default: left-right
		}
	}
	// If the Expression contains Mult or Div 
	def dispatch int computeExpression(ExpMultDiv emd){
		// Values containing the numbers
		val left = emd.left.computeExpression
		val right = emd.right.computeExpression
		// Switch: For the operators
		switch(emd.operator){
			Mult: left*right
			// default = Div (It gets cranky if there is no default)
			default: left/right
		}
	}
	// The numbers or parenthesis 
	def dispatch int computeExpression(Primary prim){prim.computeInnerPrimary}
	def dispatch int computeInnerPrimary(Number n){n.value}
	def dispatch int computeInnerPrimary(Parenthesis p){p.exp.computeExpression}
	
}

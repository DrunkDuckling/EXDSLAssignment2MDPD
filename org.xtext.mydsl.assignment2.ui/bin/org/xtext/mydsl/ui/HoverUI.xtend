package org.xtext.mydsl.ui

import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider
import org.eclipse.emf.ecore.EObject
import org.xtext.mydsl.generator.Assignment2Generator
import org.xtext.mydsl.assignment2.MathExp

class HoverUI extends DefaultEObjectHoverProvider {
	
	override getHoverInfoAsHtml(EObject obj){
		val main = new Assignment2Generator()
		try{
			val m = obj as MathExp
			return'''result = «main.computeResult(m)»'''
		}catch(Exception e){
			return '''«obj.class»'''
		}
	}
}
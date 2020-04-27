package org.xtext.mydsl.ui

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider

class HoverUI extends DefaultEObjectHoverProvider {
	
	override getHoverInfoAsHtml(EObject obj){
//		val main = new Assignment2Generator()
		try{
//			val m = obj as MathExp
//			return'''result = «main.computeResult(m)»'''
			return '''''';
		}catch(Exception e){
			return '''«obj.class»'''
		}
	}
}
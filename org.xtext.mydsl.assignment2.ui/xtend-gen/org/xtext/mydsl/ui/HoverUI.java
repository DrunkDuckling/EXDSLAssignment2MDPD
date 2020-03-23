package org.xtext.mydsl.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.xtext.mydsl.assignment2.MathExp;
import org.xtext.mydsl.generator.Assignment2Generator;

@SuppressWarnings("all")
public class HoverUI extends DefaultEObjectHoverProvider {
  @Override
  public String getHoverInfoAsHtml(final EObject obj) {
    final Assignment2Generator main = new Assignment2Generator();
    try {
      final MathExp m = ((MathExp) obj);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("result = ");
      int _computeResult = main.computeResult(m);
      _builder.append(_computeResult);
      return _builder.toString();
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        StringConcatenation _builder_1 = new StringConcatenation();
        Class<? extends EObject> _class = obj.getClass();
        _builder_1.append(_class);
        return _builder_1.toString();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}

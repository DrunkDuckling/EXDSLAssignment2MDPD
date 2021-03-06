/**
 * generated by Xtext 2.21.0
 */
package org.xtext.mydsl.generator;

import com.google.common.collect.Iterators;
import java.util.Arrays;
import java.util.function.Consumer;
import javax.swing.JOptionPane;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.xtext.mydsl.assignment2.ExpMinusPlus;
import org.xtext.mydsl.assignment2.ExpMultDiv;
import org.xtext.mydsl.assignment2.MathExp;
import org.xtext.mydsl.assignment2.Model;
import org.xtext.mydsl.assignment2.Mult;
import org.xtext.mydsl.assignment2.Parenthesis;
import org.xtext.mydsl.assignment2.Plus;
import org.xtext.mydsl.assignment2.Primary;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class Assignment2Generator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final Consumer<MathExp> _function = (MathExp it) -> {
      this.compute(it);
    };
    Iterators.<Model>filter(resource.getAllContents(), Model.class).next().getMath().forEach(_function);
  }
  
  public void compute(final MathExp math) {
    final int result = this.computeExpression(math.getExp());
    JOptionPane.showMessageDialog(null, ("result = " + Integer.valueOf(result)), "Math Language", JOptionPane.INFORMATION_MESSAGE);
  }
  
  public int computeResult(final MathExp math) {
    return this.computeExpression(math.getExp());
  }
  
  public int computePrim(final Primary factor) {
    return this.computeInnerPrimary(factor);
  }
  
  protected int _computeExpression(final ExpMinusPlus emp) {
    int _xblockexpression = (int) 0;
    {
      final int left = this.computeExpression(emp.getLeft());
      final int right = this.computeExpression(emp.getRight());
      int _switchResult = (int) 0;
      EObject _operator = emp.getOperator();
      boolean _matched = false;
      if (_operator instanceof Plus) {
        _matched=true;
        _switchResult = (left + right);
      }
      if (!_matched) {
        _switchResult = (left - right);
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  protected int _computeExpression(final ExpMultDiv emd) {
    int _xblockexpression = (int) 0;
    {
      final int left = this.computeExpression(emd.getLeft());
      final int right = this.computeExpression(emd.getRight());
      int _switchResult = (int) 0;
      EObject _operator = emd.getOperator();
      boolean _matched = false;
      if (_operator instanceof Mult) {
        _matched=true;
        _switchResult = (left * right);
      }
      if (!_matched) {
        _switchResult = (left / right);
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  protected int _computeExpression(final Primary prim) {
    return this.computeInnerPrimary(prim);
  }
  
  protected int _computeInnerPrimary(final org.xtext.mydsl.assignment2.Number n) {
    return n.getValue();
  }
  
  protected int _computeInnerPrimary(final Parenthesis p) {
    return this.computeExpression(p.getExp());
  }
  
  public int computeExpression(final ExpMinusPlus prim) {
    if (prim instanceof Primary) {
      return _computeExpression((Primary)prim);
    } else if (prim instanceof ExpMultDiv) {
      return _computeExpression((ExpMultDiv)prim);
    } else if (prim != null) {
      return _computeExpression(prim);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(prim).toString());
    }
  }
  
  public int computeInnerPrimary(final Primary n) {
    if (n instanceof org.xtext.mydsl.assignment2.Number) {
      return _computeInnerPrimary((org.xtext.mydsl.assignment2.Number)n);
    } else if (n instanceof Parenthesis) {
      return _computeInnerPrimary((Parenthesis)n);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(n).toString());
    }
  }
}

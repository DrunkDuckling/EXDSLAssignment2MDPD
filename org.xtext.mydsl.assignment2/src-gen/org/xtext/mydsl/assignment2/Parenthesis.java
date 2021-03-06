/**
 * generated by Xtext 2.21.0
 */
package org.xtext.mydsl.assignment2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parenthesis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.mydsl.assignment2.Parenthesis#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see org.xtext.mydsl.assignment2.Assignment2Package#getParenthesis()
 * @model
 * @generated
 */
public interface Parenthesis extends Primary
{
  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(ExpMinusPlus)
   * @see org.xtext.mydsl.assignment2.Assignment2Package#getParenthesis_Exp()
   * @model containment="true"
   * @generated
   */
  ExpMinusPlus getExp();

  /**
   * Sets the value of the '{@link org.xtext.mydsl.assignment2.Parenthesis#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(ExpMinusPlus value);

} // Parenthesis

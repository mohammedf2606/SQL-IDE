/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.languages.tracery.traceryLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Final JSON Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.FinalJSONLine#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.TraceryLanguagePackage#getFinalJSONLine()
 * @model
 * @generated
 */
public interface FinalJSONLine extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(FinalJSONEnding)
   * @see uk.ac.kcl.inf.languages.tracery.traceryLanguage.TraceryLanguagePackage#getFinalJSONLine_Value()
   * @model containment="true"
   * @generated
   */
  FinalJSONEnding getValue();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.languages.tracery.traceryLanguage.FinalJSONLine#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(FinalJSONEnding value);

} // FinalJSONLine

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm_hybrid;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Left Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm_hybrid.LeftPattern#getTargetElement <em>Target Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm_hybrid.MM_HybridPackage#getLeftPattern()
 * @model
 * @generated
 */
public interface LeftPattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Target Element</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link mm_hybrid.TargetElementRule#getLeftPattern <em>Left Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Element</em>' containment reference.
	 * @see #setTargetElement(TargetElementRule)
	 * @see mm_hybrid.MM_HybridPackage#getLeftPattern_TargetElement()
	 * @see mm_hybrid.TargetElementRule#getLeftPattern
	 * @model opposite="leftPattern" containment="true" required="true" ordered="false"
	 * @generated
	 */
	TargetElementRule getTargetElement();

	/**
	 * Sets the value of the '{@link mm_hybrid.LeftPattern#getTargetElement <em>Target Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Element</em>' containment reference.
	 * @see #getTargetElement()
	 * @generated
	 */
	void setTargetElement(TargetElementRule value);

} // LeftPattern
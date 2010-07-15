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
	 * Returns the value of the '<em><b>Target Element</b></em>' containment reference list.
	 * The list contents are of type {@link mm_hybrid.TargetElementRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Element</em>' containment reference list.
	 * @see mm_hybrid.MM_HybridPackage#getLeftPattern_TargetElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TargetElementRule> getTargetElement();

} // LeftPattern
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metagem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metagem.ModelElement#getFeatures <em>Features</em>}</li>
 *   <li>{@link metagem.ModelElement#getElements <em>Elements</em>}</li>
 *   <li>{@link metagem.ModelElement#getSuperElement <em>Super Element</em>}</li>
 *   <li>{@link metagem.ModelElement#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link metagem.ModelElement#getContains <em>Contains</em>}</li>
 *   <li>{@link metagem.ModelElement#getIsContained <em>Is Contained</em>}</li>
 * </ul>
 * </p>
 *
 * @see metagem.MetagemPackage#getModelElement()
 * @model
 * @generated
 */
public interface ModelElement extends ModelComponent {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link metagem.ModelFeature}.
	 * It is bidirectional and its opposite is '{@link metagem.ModelFeature#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see metagem.MetagemPackage#getModelElement_Features()
	 * @see metagem.ModelFeature#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ModelFeature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link metagem.ModelElement}.
	 * It is bidirectional and its opposite is '{@link metagem.ModelElement#getSuperElement <em>Super Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see metagem.MetagemPackage#getModelElement_Elements()
	 * @see metagem.ModelElement#getSuperElement
	 * @model opposite="superElement" containment="true"
	 * @generated
	 */
	EList<ModelElement> getElements();

	/**
	 * Returns the value of the '<em><b>Super Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link metagem.ModelElement#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Element</em>' container reference.
	 * @see #setSuperElement(ModelElement)
	 * @see metagem.MetagemPackage#getModelElement_SuperElement()
	 * @see metagem.ModelElement#getElements
	 * @model opposite="elements" transient="false"
	 * @generated
	 */
	ModelElement getSuperElement();

	/**
	 * Sets the value of the '{@link metagem.ModelElement#getSuperElement <em>Super Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Element</em>' container reference.
	 * @see #getSuperElement()
	 * @generated
	 */
	void setSuperElement(ModelElement value);

	/**
	 * Returns the value of the '<em><b>Owned Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link metagem.ModelTransf#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Element</em>' container reference.
	 * @see #setOwnedElement(ModelTransf)
	 * @see metagem.MetagemPackage#getModelElement_OwnedElement()
	 * @see metagem.ModelTransf#getElements
	 * @model opposite="elements" transient="false"
	 * @generated
	 */
	ModelTransf getOwnedElement();

	/**
	 * Sets the value of the '{@link metagem.ModelElement#getOwnedElement <em>Owned Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Element</em>' container reference.
	 * @see #getOwnedElement()
	 * @generated
	 */
	void setOwnedElement(ModelTransf value);

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' reference list.
	 * The list contents are of type {@link metagem.ModelElement}.
	 * It is bidirectional and its opposite is '{@link metagem.ModelElement#getIsContained <em>Is Contained</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' reference list.
	 * @see metagem.MetagemPackage#getModelElement_Contains()
	 * @see metagem.ModelElement#getIsContained
	 * @model opposite="isContained"
	 * @generated
	 */
	EList<ModelElement> getContains();

	/**
	 * Returns the value of the '<em><b>Is Contained</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metagem.ModelElement#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Contained</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Contained</em>' reference.
	 * @see #setIsContained(ModelElement)
	 * @see metagem.MetagemPackage#getModelElement_IsContained()
	 * @see metagem.ModelElement#getContains
	 * @model opposite="contains"
	 * @generated
	 */
	ModelElement getIsContained();

	/**
	 * Sets the value of the '{@link metagem.ModelElement#getIsContained <em>Is Contained</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Contained</em>' reference.
	 * @see #getIsContained()
	 * @generated
	 */
	void setIsContained(ModelElement value);

} // ModelElement

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package RubyTL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decorator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link RubyTL.Decorator#getName <em>Name</em>}</li>
 *   <li>{@link RubyTL.Decorator#getBody <em>Body</em>}</li>
 *   <li>{@link RubyTL.Decorator#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see RubyTL.RubyTLPackage#getDecorator()
 * @model
 * @generated
 */
public interface Decorator extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(Object)
	 * @see RubyTL.RubyTLPackage#getDecorator_Name()
	 * @model unique="false" dataType="PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	Object getName();

	/**
	 * Sets the value of the '{@link RubyTL.Decorator#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(Object value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(Object)
	 * @see RubyTL.RubyTLPackage#getDecorator_Body()
	 * @model unique="false" dataType="PrimitiveTypes.String" ordered="false"
	 * @generated
	 */
	Object getBody();

	/**
	 * Sets the value of the '{@link RubyTL.Decorator#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Object value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(FromElement)
	 * @see RubyTL.RubyTLPackage#getDecorator_Context()
	 * @model ordered="false"
	 * @generated
	 */
	FromElement getContext();

	/**
	 * Sets the value of the '{@link RubyTL.Decorator#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(FromElement value);

} // Decorator

/**
 */
package Assembly;

import Repository.Interface;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Assembly.DelegationConnector#getRole <em>Role</em>}</li>
 *   <li>{@link Assembly.DelegationConnector#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see Assembly.AssemblyPackage#getDelegationConnector()
 * @model
 * @generated
 */
public interface DelegationConnector extends EObject {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(Role)
	 * @see Assembly.AssemblyPackage#getDelegationConnector_Role()
	 * @model required="true"
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link Assembly.DelegationConnector#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' reference.
	 * @see #setInterface(Interface)
	 * @see Assembly.AssemblyPackage#getDelegationConnector_Interface()
	 * @model required="true"
	 * @generated
	 */
	Interface getInterface();

	/**
	 * Sets the value of the '{@link Assembly.DelegationConnector#getInterface <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(Interface value);

} // DelegationConnector

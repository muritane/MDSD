/**
 */
package Assembly;

import Allocation.AllocationContext;

import Repository.Component;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Assembly.AssemblyContext#getRequiredRole <em>Required Role</em>}</li>
 *   <li>{@link Assembly.AssemblyContext#getProvidedRole <em>Provided Role</em>}</li>
 *   <li>{@link Assembly.AssemblyContext#getComponent <em>Component</em>}</li>
 *   <li>{@link Assembly.AssemblyContext#getAllocationContext <em>Allocation Context</em>}</li>
 *   <li>{@link Assembly.AssemblyContext#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see Assembly.AssemblyPackage#getAssemblyContext()
 * @model
 * @generated
 */
public interface AssemblyContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Required Role</b></em>' reference list.
	 * The list contents are of type {@link Assembly.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Role</em>' reference list.
	 * @see Assembly.AssemblyPackage#getAssemblyContext_RequiredRole()
	 * @model
	 * @generated
	 */
	EList<Role> getRequiredRole();

	/**
	 * Returns the value of the '<em><b>Provided Role</b></em>' containment reference list.
	 * The list contents are of type {@link Assembly.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Role</em>' containment reference list.
	 * @see Assembly.AssemblyPackage#getAssemblyContext_ProvidedRole()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getProvidedRole();

	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link Repository.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see Assembly.AssemblyPackage#getAssemblyContext_Component()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponent();

	/**
	 * Returns the value of the '<em><b>Allocation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation Context</em>' reference.
	 * @see #setAllocationContext(AllocationContext)
	 * @see Assembly.AssemblyPackage#getAssemblyContext_AllocationContext()
	 * @model required="true"
	 * @generated
	 */
	AllocationContext getAllocationContext();

	/**
	 * Sets the value of the '{@link Assembly.AssemblyContext#getAllocationContext <em>Allocation Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocation Context</em>' reference.
	 * @see #getAllocationContext()
	 * @generated
	 */
	void setAllocationContext(AllocationContext value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Assembly.AssemblyPackage#getAssemblyContext_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Assembly.AssemblyContext#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // AssemblyContext

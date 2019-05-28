/**
 */
package Assembly;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Assembly.AssemblyConnector#getProvidedAssemblyContext <em>Provided Assembly Context</em>}</li>
 *   <li>{@link Assembly.AssemblyConnector#getRequiredAssemblyContext <em>Required Assembly Context</em>}</li>
 *   <li>{@link Assembly.AssemblyConnector#getRequiredRole <em>Required Role</em>}</li>
 *   <li>{@link Assembly.AssemblyConnector#getProvidedRole <em>Provided Role</em>}</li>
 * </ul>
 *
 * @see Assembly.AssemblyPackage#getAssemblyConnector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='RequiredRolesFromAssemblies ProvidedRolesFromAssemblies RolesOnSameOrLinkedContainer'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot RequiredRolesFromAssemblies='\n\t\t\tself.requiredRole = self.requiredAssemblyContext.requiredRole' ProvidedRolesFromAssemblies='\n\t\t\tself.providedRole = self.providedAssemblyContext.providedRole' RolesOnSameOrLinkedContainer='\n\t\t\tself.providedAssemblyContext.allocationContext = self.requiredAssemblyContext.allocationContext\n\t\t\tor self.providedAssemblyContext.allocationContext.targetContainer.links-&gt;collect(linkedContainers)-&gt;includes(self.requiredAssemblyContext.allocationContext)'"
 * @generated
 */
public interface AssemblyConnector extends EObject {
	/**
	 * Returns the value of the '<em><b>Provided Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Assembly Context</em>' reference.
	 * @see #setProvidedAssemblyContext(AssemblyContext)
	 * @see Assembly.AssemblyPackage#getAssemblyConnector_ProvidedAssemblyContext()
	 * @model required="true"
	 * @generated
	 */
	AssemblyContext getProvidedAssemblyContext();

	/**
	 * Sets the value of the '{@link Assembly.AssemblyConnector#getProvidedAssemblyContext <em>Provided Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Assembly Context</em>' reference.
	 * @see #getProvidedAssemblyContext()
	 * @generated
	 */
	void setProvidedAssemblyContext(AssemblyContext value);

	/**
	 * Returns the value of the '<em><b>Required Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Assembly Context</em>' reference.
	 * @see #setRequiredAssemblyContext(AssemblyContext)
	 * @see Assembly.AssemblyPackage#getAssemblyConnector_RequiredAssemblyContext()
	 * @model required="true"
	 * @generated
	 */
	AssemblyContext getRequiredAssemblyContext();

	/**
	 * Sets the value of the '{@link Assembly.AssemblyConnector#getRequiredAssemblyContext <em>Required Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Assembly Context</em>' reference.
	 * @see #getRequiredAssemblyContext()
	 * @generated
	 */
	void setRequiredAssemblyContext(AssemblyContext value);

	/**
	 * Returns the value of the '<em><b>Required Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Role</em>' reference.
	 * @see #setRequiredRole(Role)
	 * @see Assembly.AssemblyPackage#getAssemblyConnector_RequiredRole()
	 * @model required="true"
	 * @generated
	 */
	Role getRequiredRole();

	/**
	 * Sets the value of the '{@link Assembly.AssemblyConnector#getRequiredRole <em>Required Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Role</em>' reference.
	 * @see #getRequiredRole()
	 * @generated
	 */
	void setRequiredRole(Role value);

	/**
	 * Returns the value of the '<em><b>Provided Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Role</em>' reference.
	 * @see #setProvidedRole(Role)
	 * @see Assembly.AssemblyPackage#getAssemblyConnector_ProvidedRole()
	 * @model required="true"
	 * @generated
	 */
	Role getProvidedRole();

	/**
	 * Sets the value of the '{@link Assembly.AssemblyConnector#getProvidedRole <em>Provided Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Role</em>' reference.
	 * @see #getProvidedRole()
	 * @generated
	 */
	void setProvidedRole(Role value);

} // AssemblyConnector

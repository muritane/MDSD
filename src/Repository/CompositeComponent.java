/**
 */
package Repository;

import Assembly.AssemblyContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Repository.CompositeComponent#getEncapsulatedAssemblyContext <em>Encapsulated Assembly Context</em>}</li>
 * </ul>
 *
 * @see Repository.RepositoryPackage#getCompositeComponent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NoAllocation'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot NoAllocation='\n\t\t\tself.encapsulatedAssemblyContext-&gt;collect(allocationContext)-&gt;size() = 0'"
 * @generated
 */
public interface CompositeComponent extends Component {
	/**
	 * Returns the value of the '<em><b>Encapsulated Assembly Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encapsulated Assembly Context</em>' containment reference.
	 * @see #setEncapsulatedAssemblyContext(AssemblyContext)
	 * @see Repository.RepositoryPackage#getCompositeComponent_EncapsulatedAssemblyContext()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AssemblyContext getEncapsulatedAssemblyContext();

	/**
	 * Sets the value of the '{@link Repository.CompositeComponent#getEncapsulatedAssemblyContext <em>Encapsulated Assembly Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encapsulated Assembly Context</em>' containment reference.
	 * @see #getEncapsulatedAssemblyContext()
	 * @generated
	 */
	void setEncapsulatedAssemblyContext(AssemblyContext value);

} // CompositeComponent

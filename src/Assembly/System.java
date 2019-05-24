/**
 */
package Assembly;

import Allocation.AllocationContext;

import Environment.Environment;

import Repository.Interface;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Assembly.System#getEncapsulatedAssemblyContext <em>Encapsulated Assembly Context</em>}</li>
 *   <li>{@link Assembly.System#getProvidedInterfaces <em>Provided Interfaces</em>}</li>
 *   <li>{@link Assembly.System#getAllocationContext <em>Allocation Context</em>}</li>
 *   <li>{@link Assembly.System#getEnvironment <em>Environment</em>}</li>
 * </ul>
 *
 * @see Assembly.AssemblyPackage#getSystem()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AllocationContextSpecifiesAssemblyAllocation AllocationOnCorrespondingEnvironment AllocationContextAssemblyContainer AssemblyContainerAllocationContext'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot AllocationContextSpecifiesAssemblyAllocation='\n\t\t\tself.allocationContext.allocatedAssemblyContext = self.encapsulatedAssemblyContext' AllocationOnCorrespondingEnvironment='\n\t\t\tself.allocationContext.targetContainer -&gt; forAll(c | self.environment-&gt;includes(c))' AllocationContextAssemblyContainer='\n\t\t\tself.allocationContext.targetContainer -&gt; forAll(c | self.encapsulatedAssemblyContext-&gt;collect(allocationContext)-&gt;includes(c))' AssemblyContainerAllocationContext='\n\t\t\tself.encapsulatedAssemblyContext-&gt;collect(allocationContext)-&gt;forAll(c | self.allocationContext.targetContainer -&gt; includes(c))'"
 * @generated
 */
public interface System extends EObject {
	/**
	 * Returns the value of the '<em><b>Encapsulated Assembly Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encapsulated Assembly Context</em>' containment reference.
	 * @see #setEncapsulatedAssemblyContext(AssemblyContext)
	 * @see Assembly.AssemblyPackage#getSystem_EncapsulatedAssemblyContext()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AssemblyContext getEncapsulatedAssemblyContext();

	/**
	 * Sets the value of the '{@link Assembly.System#getEncapsulatedAssemblyContext <em>Encapsulated Assembly Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encapsulated Assembly Context</em>' containment reference.
	 * @see #getEncapsulatedAssemblyContext()
	 * @generated
	 */
	void setEncapsulatedAssemblyContext(AssemblyContext value);

	/**
	 * Returns the value of the '<em><b>Provided Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link Repository.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Interfaces</em>' containment reference list.
	 * @see Assembly.AssemblyPackage#getSystem_ProvidedInterfaces()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Interface> getProvidedInterfaces();

	/**
	 * Returns the value of the '<em><b>Allocation Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation Context</em>' containment reference.
	 * @see #setAllocationContext(AllocationContext)
	 * @see Assembly.AssemblyPackage#getSystem_AllocationContext()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AllocationContext getAllocationContext();

	/**
	 * Sets the value of the '{@link Assembly.System#getAllocationContext <em>Allocation Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocation Context</em>' containment reference.
	 * @see #getAllocationContext()
	 * @generated
	 */
	void setAllocationContext(AllocationContext value);

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' reference.
	 * @see #setEnvironment(Environment)
	 * @see Assembly.AssemblyPackage#getSystem_Environment()
	 * @model required="true"
	 * @generated
	 */
	Environment getEnvironment();

	/**
	 * Sets the value of the '{@link Assembly.System#getEnvironment <em>Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(Environment value);

} // System

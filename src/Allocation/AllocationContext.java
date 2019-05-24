/**
 */
package Allocation;

import Assembly.AssemblyContext;

import Environment.Container;

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
 *   <li>{@link Allocation.AllocationContext#getTargetContainer <em>Target Container</em>}</li>
 *   <li>{@link Allocation.AllocationContext#getAllocatedAssemblyContext <em>Allocated Assembly Context</em>}</li>
 * </ul>
 *
 * @see Allocation.AllocationPackage#getAllocationContext()
 * @model
 * @generated
 */
public interface AllocationContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Target Container</b></em>' containment reference list.
	 * The list contents are of type {@link Environment.Container}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Container</em>' containment reference list.
	 * @see Allocation.AllocationPackage#getAllocationContext_TargetContainer()
	 * @model containment="true"
	 * @generated
	 */
	EList<Container> getTargetContainer();

	/**
	 * Returns the value of the '<em><b>Allocated Assembly Context</b></em>' reference list.
	 * The list contents are of type {@link Assembly.AssemblyContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Assembly Context</em>' reference list.
	 * @see Allocation.AllocationPackage#getAllocationContext_AllocatedAssemblyContext()
	 * @model required="true"
	 * @generated
	 */
	EList<AssemblyContext> getAllocatedAssemblyContext();

} // AllocationContext

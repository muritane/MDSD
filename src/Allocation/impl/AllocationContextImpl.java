/**
 */
package Allocation.impl;

import Allocation.AllocationContext;
import Allocation.AllocationPackage;

import Assembly.AssemblyContext;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Allocation.impl.AllocationContextImpl#getTargetContainer <em>Target Container</em>}</li>
 *   <li>{@link Allocation.impl.AllocationContextImpl#getAllocatedAssemblyContext <em>Allocated Assembly Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllocationContextImpl extends MinimalEObjectImpl.Container implements AllocationContext {
	/**
	 * The cached value of the '{@link #getTargetContainer() <em>Target Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<Environment.Container> targetContainer;

	/**
	 * The cached value of the '{@link #getAllocatedAssemblyContext() <em>Allocated Assembly Context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedAssemblyContext()
	 * @generated
	 * @ordered
	 */
	protected EList<AssemblyContext> allocatedAssemblyContext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocationContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AllocationPackage.Literals.ALLOCATION_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Environment.Container> getTargetContainer() {
		if (targetContainer == null) {
			targetContainer = new EObjectContainmentEList<Environment.Container>(Environment.Container.class, this, AllocationPackage.ALLOCATION_CONTEXT__TARGET_CONTAINER);
		}
		return targetContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssemblyContext> getAllocatedAssemblyContext() {
		if (allocatedAssemblyContext == null) {
			allocatedAssemblyContext = new EObjectResolvingEList<AssemblyContext>(AssemblyContext.class, this, AllocationPackage.ALLOCATION_CONTEXT__ALLOCATED_ASSEMBLY_CONTEXT);
		}
		return allocatedAssemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AllocationPackage.ALLOCATION_CONTEXT__TARGET_CONTAINER:
				return ((InternalEList<?>)getTargetContainer()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AllocationPackage.ALLOCATION_CONTEXT__TARGET_CONTAINER:
				return getTargetContainer();
			case AllocationPackage.ALLOCATION_CONTEXT__ALLOCATED_ASSEMBLY_CONTEXT:
				return getAllocatedAssemblyContext();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AllocationPackage.ALLOCATION_CONTEXT__TARGET_CONTAINER:
				getTargetContainer().clear();
				getTargetContainer().addAll((Collection<? extends Environment.Container>)newValue);
				return;
			case AllocationPackage.ALLOCATION_CONTEXT__ALLOCATED_ASSEMBLY_CONTEXT:
				getAllocatedAssemblyContext().clear();
				getAllocatedAssemblyContext().addAll((Collection<? extends AssemblyContext>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AllocationPackage.ALLOCATION_CONTEXT__TARGET_CONTAINER:
				getTargetContainer().clear();
				return;
			case AllocationPackage.ALLOCATION_CONTEXT__ALLOCATED_ASSEMBLY_CONTEXT:
				getAllocatedAssemblyContext().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AllocationPackage.ALLOCATION_CONTEXT__TARGET_CONTAINER:
				return targetContainer != null && !targetContainer.isEmpty();
			case AllocationPackage.ALLOCATION_CONTEXT__ALLOCATED_ASSEMBLY_CONTEXT:
				return allocatedAssemblyContext != null && !allocatedAssemblyContext.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AllocationContextImpl

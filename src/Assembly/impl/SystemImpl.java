/**
 */
package Assembly.impl;

import Allocation.AllocationContext;

import Assembly.AssemblyContext;
import Assembly.AssemblyPackage;

import Environment.SystemEnvironment;

import Repository.Interface;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Assembly.impl.SystemImpl#getEncapsulatedAssemblyContext <em>Encapsulated Assembly Context</em>}</li>
 *   <li>{@link Assembly.impl.SystemImpl#getProvidedInterfaces <em>Provided Interfaces</em>}</li>
 *   <li>{@link Assembly.impl.SystemImpl#getAllocationContext <em>Allocation Context</em>}</li>
 *   <li>{@link Assembly.impl.SystemImpl#getEnvironment <em>Environment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends MinimalEObjectImpl.Container implements Assembly.System {
	/**
	 * The cached value of the '{@link #getEncapsulatedAssemblyContext() <em>Encapsulated Assembly Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncapsulatedAssemblyContext()
	 * @generated
	 * @ordered
	 */
	protected AssemblyContext encapsulatedAssemblyContext;

	/**
	 * The cached value of the '{@link #getProvidedInterfaces() <em>Provided Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> providedInterfaces;

	/**
	 * The cached value of the '{@link #getAllocationContext() <em>Allocation Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationContext()
	 * @generated
	 * @ordered
	 */
	protected AllocationContext allocationContext;

	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected SystemEnvironment environment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext getEncapsulatedAssemblyContext() {
		return encapsulatedAssemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncapsulatedAssemblyContext(AssemblyContext newEncapsulatedAssemblyContext, NotificationChain msgs) {
		AssemblyContext oldEncapsulatedAssemblyContext = encapsulatedAssemblyContext;
		encapsulatedAssemblyContext = newEncapsulatedAssemblyContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssemblyPackage.SYSTEM__ENCAPSULATED_ASSEMBLY_CONTEXT, oldEncapsulatedAssemblyContext, newEncapsulatedAssemblyContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncapsulatedAssemblyContext(AssemblyContext newEncapsulatedAssemblyContext) {
		if (newEncapsulatedAssemblyContext != encapsulatedAssemblyContext) {
			NotificationChain msgs = null;
			if (encapsulatedAssemblyContext != null)
				msgs = ((InternalEObject)encapsulatedAssemblyContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AssemblyPackage.SYSTEM__ENCAPSULATED_ASSEMBLY_CONTEXT, null, msgs);
			if (newEncapsulatedAssemblyContext != null)
				msgs = ((InternalEObject)newEncapsulatedAssemblyContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AssemblyPackage.SYSTEM__ENCAPSULATED_ASSEMBLY_CONTEXT, null, msgs);
			msgs = basicSetEncapsulatedAssemblyContext(newEncapsulatedAssemblyContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.SYSTEM__ENCAPSULATED_ASSEMBLY_CONTEXT, newEncapsulatedAssemblyContext, newEncapsulatedAssemblyContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getProvidedInterfaces() {
		if (providedInterfaces == null) {
			providedInterfaces = new EObjectContainmentEList<Interface>(Interface.class, this, AssemblyPackage.SYSTEM__PROVIDED_INTERFACES);
		}
		return providedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationContext getAllocationContext() {
		return allocationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllocationContext(AllocationContext newAllocationContext, NotificationChain msgs) {
		AllocationContext oldAllocationContext = allocationContext;
		allocationContext = newAllocationContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssemblyPackage.SYSTEM__ALLOCATION_CONTEXT, oldAllocationContext, newAllocationContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocationContext(AllocationContext newAllocationContext) {
		if (newAllocationContext != allocationContext) {
			NotificationChain msgs = null;
			if (allocationContext != null)
				msgs = ((InternalEObject)allocationContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AssemblyPackage.SYSTEM__ALLOCATION_CONTEXT, null, msgs);
			if (newAllocationContext != null)
				msgs = ((InternalEObject)newAllocationContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AssemblyPackage.SYSTEM__ALLOCATION_CONTEXT, null, msgs);
			msgs = basicSetAllocationContext(newAllocationContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.SYSTEM__ALLOCATION_CONTEXT, newAllocationContext, newAllocationContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemEnvironment getEnvironment() {
		if (environment != null && environment.eIsProxy()) {
			InternalEObject oldEnvironment = (InternalEObject)environment;
			environment = (SystemEnvironment)eResolveProxy(oldEnvironment);
			if (environment != oldEnvironment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyPackage.SYSTEM__ENVIRONMENT, oldEnvironment, environment));
			}
		}
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemEnvironment basicGetEnvironment() {
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironment(SystemEnvironment newEnvironment) {
		SystemEnvironment oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.SYSTEM__ENVIRONMENT, oldEnvironment, environment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssemblyPackage.SYSTEM__ENCAPSULATED_ASSEMBLY_CONTEXT:
				return basicSetEncapsulatedAssemblyContext(null, msgs);
			case AssemblyPackage.SYSTEM__PROVIDED_INTERFACES:
				return ((InternalEList<?>)getProvidedInterfaces()).basicRemove(otherEnd, msgs);
			case AssemblyPackage.SYSTEM__ALLOCATION_CONTEXT:
				return basicSetAllocationContext(null, msgs);
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
			case AssemblyPackage.SYSTEM__ENCAPSULATED_ASSEMBLY_CONTEXT:
				return getEncapsulatedAssemblyContext();
			case AssemblyPackage.SYSTEM__PROVIDED_INTERFACES:
				return getProvidedInterfaces();
			case AssemblyPackage.SYSTEM__ALLOCATION_CONTEXT:
				return getAllocationContext();
			case AssemblyPackage.SYSTEM__ENVIRONMENT:
				if (resolve) return getEnvironment();
				return basicGetEnvironment();
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
			case AssemblyPackage.SYSTEM__ENCAPSULATED_ASSEMBLY_CONTEXT:
				setEncapsulatedAssemblyContext((AssemblyContext)newValue);
				return;
			case AssemblyPackage.SYSTEM__PROVIDED_INTERFACES:
				getProvidedInterfaces().clear();
				getProvidedInterfaces().addAll((Collection<? extends Interface>)newValue);
				return;
			case AssemblyPackage.SYSTEM__ALLOCATION_CONTEXT:
				setAllocationContext((AllocationContext)newValue);
				return;
			case AssemblyPackage.SYSTEM__ENVIRONMENT:
				setEnvironment((SystemEnvironment)newValue);
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
			case AssemblyPackage.SYSTEM__ENCAPSULATED_ASSEMBLY_CONTEXT:
				setEncapsulatedAssemblyContext((AssemblyContext)null);
				return;
			case AssemblyPackage.SYSTEM__PROVIDED_INTERFACES:
				getProvidedInterfaces().clear();
				return;
			case AssemblyPackage.SYSTEM__ALLOCATION_CONTEXT:
				setAllocationContext((AllocationContext)null);
				return;
			case AssemblyPackage.SYSTEM__ENVIRONMENT:
				setEnvironment((SystemEnvironment)null);
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
			case AssemblyPackage.SYSTEM__ENCAPSULATED_ASSEMBLY_CONTEXT:
				return encapsulatedAssemblyContext != null;
			case AssemblyPackage.SYSTEM__PROVIDED_INTERFACES:
				return providedInterfaces != null && !providedInterfaces.isEmpty();
			case AssemblyPackage.SYSTEM__ALLOCATION_CONTEXT:
				return allocationContext != null;
			case AssemblyPackage.SYSTEM__ENVIRONMENT:
				return environment != null;
		}
		return super.eIsSet(featureID);
	}

} //SystemImpl

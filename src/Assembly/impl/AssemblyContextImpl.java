/**
 */
package Assembly.impl;

import Allocation.AllocationContext;

import Assembly.AssemblyContext;
import Assembly.AssemblyPackage;
import Assembly.Role;

import Repository.Component;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
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
 *   <li>{@link Assembly.impl.AssemblyContextImpl#getRequiredRole <em>Required Role</em>}</li>
 *   <li>{@link Assembly.impl.AssemblyContextImpl#getProvidedRole <em>Provided Role</em>}</li>
 *   <li>{@link Assembly.impl.AssemblyContextImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link Assembly.impl.AssemblyContextImpl#getAllocationContext <em>Allocation Context</em>}</li>
 *   <li>{@link Assembly.impl.AssemblyContextImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssemblyContextImpl extends MinimalEObjectImpl.Container implements AssemblyContext {
	/**
	 * The cached value of the '{@link #getRequiredRole() <em>Required Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredRole()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> requiredRole;

	/**
	 * The cached value of the '{@link #getProvidedRole() <em>Provided Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedRole()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> providedRole;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> component;

	/**
	 * The cached value of the '{@link #getAllocationContext() <em>Allocation Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationContext()
	 * @generated
	 * @ordered
	 */
	protected AllocationContext allocationContext;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyPackage.Literals.ASSEMBLY_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRequiredRole() {
		if (requiredRole == null) {
			requiredRole = new EObjectResolvingEList<Role>(Role.class, this, AssemblyPackage.ASSEMBLY_CONTEXT__REQUIRED_ROLE);
		}
		return requiredRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getProvidedRole() {
		if (providedRole == null) {
			providedRole = new EObjectContainmentEList<Role>(Role.class, this, AssemblyPackage.ASSEMBLY_CONTEXT__PROVIDED_ROLE);
		}
		return providedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<Component>(Component.class, this, AssemblyPackage.ASSEMBLY_CONTEXT__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationContext getAllocationContext() {
		if (allocationContext != null && allocationContext.eIsProxy()) {
			InternalEObject oldAllocationContext = (InternalEObject)allocationContext;
			allocationContext = (AllocationContext)eResolveProxy(oldAllocationContext);
			if (allocationContext != oldAllocationContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT, oldAllocationContext, allocationContext));
			}
		}
		return allocationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationContext basicGetAllocationContext() {
		return allocationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocationContext(AllocationContext newAllocationContext) {
		AllocationContext oldAllocationContext = allocationContext;
		allocationContext = newAllocationContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT, oldAllocationContext, allocationContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.ASSEMBLY_CONTEXT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssemblyPackage.ASSEMBLY_CONTEXT__PROVIDED_ROLE:
				return ((InternalEList<?>)getProvidedRole()).basicRemove(otherEnd, msgs);
			case AssemblyPackage.ASSEMBLY_CONTEXT__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
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
			case AssemblyPackage.ASSEMBLY_CONTEXT__REQUIRED_ROLE:
				return getRequiredRole();
			case AssemblyPackage.ASSEMBLY_CONTEXT__PROVIDED_ROLE:
				return getProvidedRole();
			case AssemblyPackage.ASSEMBLY_CONTEXT__COMPONENT:
				return getComponent();
			case AssemblyPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT:
				if (resolve) return getAllocationContext();
				return basicGetAllocationContext();
			case AssemblyPackage.ASSEMBLY_CONTEXT__NAME:
				return getName();
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
			case AssemblyPackage.ASSEMBLY_CONTEXT__REQUIRED_ROLE:
				getRequiredRole().clear();
				getRequiredRole().addAll((Collection<? extends Role>)newValue);
				return;
			case AssemblyPackage.ASSEMBLY_CONTEXT__PROVIDED_ROLE:
				getProvidedRole().clear();
				getProvidedRole().addAll((Collection<? extends Role>)newValue);
				return;
			case AssemblyPackage.ASSEMBLY_CONTEXT__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends Component>)newValue);
				return;
			case AssemblyPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT:
				setAllocationContext((AllocationContext)newValue);
				return;
			case AssemblyPackage.ASSEMBLY_CONTEXT__NAME:
				setName((String)newValue);
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
			case AssemblyPackage.ASSEMBLY_CONTEXT__REQUIRED_ROLE:
				getRequiredRole().clear();
				return;
			case AssemblyPackage.ASSEMBLY_CONTEXT__PROVIDED_ROLE:
				getProvidedRole().clear();
				return;
			case AssemblyPackage.ASSEMBLY_CONTEXT__COMPONENT:
				getComponent().clear();
				return;
			case AssemblyPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT:
				setAllocationContext((AllocationContext)null);
				return;
			case AssemblyPackage.ASSEMBLY_CONTEXT__NAME:
				setName(NAME_EDEFAULT);
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
			case AssemblyPackage.ASSEMBLY_CONTEXT__REQUIRED_ROLE:
				return requiredRole != null && !requiredRole.isEmpty();
			case AssemblyPackage.ASSEMBLY_CONTEXT__PROVIDED_ROLE:
				return providedRole != null && !providedRole.isEmpty();
			case AssemblyPackage.ASSEMBLY_CONTEXT__COMPONENT:
				return component != null && !component.isEmpty();
			case AssemblyPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT:
				return allocationContext != null;
			case AssemblyPackage.ASSEMBLY_CONTEXT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AssemblyContextImpl

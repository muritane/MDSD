/**
 */
package Assembly.impl;

import Assembly.AssemblyConnector;
import Assembly.AssemblyContext;
import Assembly.AssemblyPackage;
import Assembly.Role;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Assembly.impl.AssemblyConnectorImpl#getProvidedAssemblyContext <em>Provided Assembly Context</em>}</li>
 *   <li>{@link Assembly.impl.AssemblyConnectorImpl#getRequiredAssemblyContext <em>Required Assembly Context</em>}</li>
 *   <li>{@link Assembly.impl.AssemblyConnectorImpl#getRequiredRole <em>Required Role</em>}</li>
 *   <li>{@link Assembly.impl.AssemblyConnectorImpl#getProvidedRole <em>Provided Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssemblyConnectorImpl extends MinimalEObjectImpl.Container implements AssemblyConnector {
	/**
	 * The cached value of the '{@link #getProvidedAssemblyContext() <em>Provided Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedAssemblyContext()
	 * @generated
	 * @ordered
	 */
	protected AssemblyContext providedAssemblyContext;

	/**
	 * The cached value of the '{@link #getRequiredAssemblyContext() <em>Required Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredAssemblyContext()
	 * @generated
	 * @ordered
	 */
	protected AssemblyContext requiredAssemblyContext;

	/**
	 * The cached value of the '{@link #getRequiredRole() <em>Required Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredRole()
	 * @generated
	 * @ordered
	 */
	protected Role requiredRole;

	/**
	 * The cached value of the '{@link #getProvidedRole() <em>Provided Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedRole()
	 * @generated
	 * @ordered
	 */
	protected Role providedRole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyPackage.Literals.ASSEMBLY_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext getProvidedAssemblyContext() {
		if (providedAssemblyContext != null && providedAssemblyContext.eIsProxy()) {
			InternalEObject oldProvidedAssemblyContext = (InternalEObject)providedAssemblyContext;
			providedAssemblyContext = (AssemblyContext)eResolveProxy(oldProvidedAssemblyContext);
			if (providedAssemblyContext != oldProvidedAssemblyContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyPackage.ASSEMBLY_CONNECTOR__PROVIDED_ASSEMBLY_CONTEXT, oldProvidedAssemblyContext, providedAssemblyContext));
			}
		}
		return providedAssemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext basicGetProvidedAssemblyContext() {
		return providedAssemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedAssemblyContext(AssemblyContext newProvidedAssemblyContext) {
		AssemblyContext oldProvidedAssemblyContext = providedAssemblyContext;
		providedAssemblyContext = newProvidedAssemblyContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.ASSEMBLY_CONNECTOR__PROVIDED_ASSEMBLY_CONTEXT, oldProvidedAssemblyContext, providedAssemblyContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext getRequiredAssemblyContext() {
		if (requiredAssemblyContext != null && requiredAssemblyContext.eIsProxy()) {
			InternalEObject oldRequiredAssemblyContext = (InternalEObject)requiredAssemblyContext;
			requiredAssemblyContext = (AssemblyContext)eResolveProxy(oldRequiredAssemblyContext);
			if (requiredAssemblyContext != oldRequiredAssemblyContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyPackage.ASSEMBLY_CONNECTOR__REQUIRED_ASSEMBLY_CONTEXT, oldRequiredAssemblyContext, requiredAssemblyContext));
			}
		}
		return requiredAssemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext basicGetRequiredAssemblyContext() {
		return requiredAssemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredAssemblyContext(AssemblyContext newRequiredAssemblyContext) {
		AssemblyContext oldRequiredAssemblyContext = requiredAssemblyContext;
		requiredAssemblyContext = newRequiredAssemblyContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.ASSEMBLY_CONNECTOR__REQUIRED_ASSEMBLY_CONTEXT, oldRequiredAssemblyContext, requiredAssemblyContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRequiredRole() {
		if (requiredRole != null && requiredRole.eIsProxy()) {
			InternalEObject oldRequiredRole = (InternalEObject)requiredRole;
			requiredRole = (Role)eResolveProxy(oldRequiredRole);
			if (requiredRole != oldRequiredRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE, oldRequiredRole, requiredRole));
			}
		}
		return requiredRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRequiredRole() {
		return requiredRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredRole(Role newRequiredRole) {
		Role oldRequiredRole = requiredRole;
		requiredRole = newRequiredRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE, oldRequiredRole, requiredRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getProvidedRole() {
		if (providedRole != null && providedRole.eIsProxy()) {
			InternalEObject oldProvidedRole = (InternalEObject)providedRole;
			providedRole = (Role)eResolveProxy(oldProvidedRole);
			if (providedRole != oldProvidedRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyPackage.ASSEMBLY_CONNECTOR__PROVIDED_ROLE, oldProvidedRole, providedRole));
			}
		}
		return providedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetProvidedRole() {
		return providedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedRole(Role newProvidedRole) {
		Role oldProvidedRole = providedRole;
		providedRole = newProvidedRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.ASSEMBLY_CONNECTOR__PROVIDED_ROLE, oldProvidedRole, providedRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssemblyPackage.ASSEMBLY_CONNECTOR__PROVIDED_ASSEMBLY_CONTEXT:
				if (resolve) return getProvidedAssemblyContext();
				return basicGetProvidedAssemblyContext();
			case AssemblyPackage.ASSEMBLY_CONNECTOR__REQUIRED_ASSEMBLY_CONTEXT:
				if (resolve) return getRequiredAssemblyContext();
				return basicGetRequiredAssemblyContext();
			case AssemblyPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE:
				if (resolve) return getRequiredRole();
				return basicGetRequiredRole();
			case AssemblyPackage.ASSEMBLY_CONNECTOR__PROVIDED_ROLE:
				if (resolve) return getProvidedRole();
				return basicGetProvidedRole();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AssemblyPackage.ASSEMBLY_CONNECTOR__PROVIDED_ASSEMBLY_CONTEXT:
				setProvidedAssemblyContext((AssemblyContext)newValue);
				return;
			case AssemblyPackage.ASSEMBLY_CONNECTOR__REQUIRED_ASSEMBLY_CONTEXT:
				setRequiredAssemblyContext((AssemblyContext)newValue);
				return;
			case AssemblyPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE:
				setRequiredRole((Role)newValue);
				return;
			case AssemblyPackage.ASSEMBLY_CONNECTOR__PROVIDED_ROLE:
				setProvidedRole((Role)newValue);
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
			case AssemblyPackage.ASSEMBLY_CONNECTOR__PROVIDED_ASSEMBLY_CONTEXT:
				setProvidedAssemblyContext((AssemblyContext)null);
				return;
			case AssemblyPackage.ASSEMBLY_CONNECTOR__REQUIRED_ASSEMBLY_CONTEXT:
				setRequiredAssemblyContext((AssemblyContext)null);
				return;
			case AssemblyPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE:
				setRequiredRole((Role)null);
				return;
			case AssemblyPackage.ASSEMBLY_CONNECTOR__PROVIDED_ROLE:
				setProvidedRole((Role)null);
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
			case AssemblyPackage.ASSEMBLY_CONNECTOR__PROVIDED_ASSEMBLY_CONTEXT:
				return providedAssemblyContext != null;
			case AssemblyPackage.ASSEMBLY_CONNECTOR__REQUIRED_ASSEMBLY_CONTEXT:
				return requiredAssemblyContext != null;
			case AssemblyPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE:
				return requiredRole != null;
			case AssemblyPackage.ASSEMBLY_CONNECTOR__PROVIDED_ROLE:
				return providedRole != null;
		}
		return super.eIsSet(featureID);
	}

} //AssemblyConnectorImpl

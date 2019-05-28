/**
 */
package Repository.impl;

import Repository.BehaviorDescription;
import Repository.Component;
import Repository.Interface;
import Repository.RepositoryPackage;
import Repository.Service;

import java.lang.String;

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
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Repository.impl.ComponentImpl#getProvidedInterface <em>Provided Interface</em>}</li>
 *   <li>{@link Repository.impl.ComponentImpl#getProvidedService <em>Provided Service</em>}</li>
 *   <li>{@link Repository.impl.ComponentImpl#getRequiredInterface <em>Required Interface</em>}</li>
 *   <li>{@link Repository.impl.ComponentImpl#getRequiredService <em>Required Service</em>}</li>
 *   <li>{@link Repository.impl.ComponentImpl#getBehaviourDescription <em>Behaviour Description</em>}</li>
 *   <li>{@link Repository.impl.ComponentImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends MinimalEObjectImpl.Container implements Component {
	/**
	 * The cached value of the '{@link #getProvidedInterface() <em>Provided Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> providedInterface;

	/**
	 * The cached value of the '{@link #getProvidedService() <em>Provided Service</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedService()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> providedService;

	/**
	 * The cached value of the '{@link #getRequiredInterface() <em>Required Interface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> requiredInterface;

	/**
	 * The cached value of the '{@link #getRequiredService() <em>Required Service</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredService()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> requiredService;

	/**
	 * The cached value of the '{@link #getBehaviourDescription() <em>Behaviour Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviourDescription()
	 * @generated
	 * @ordered
	 */
	protected BehaviorDescription behaviourDescription;

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
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepositoryPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getProvidedInterface() {
		if (providedInterface == null) {
			providedInterface = new EObjectContainmentEList<Interface>(Interface.class, this, RepositoryPackage.COMPONENT__PROVIDED_INTERFACE);
		}
		return providedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getProvidedService() {
		if (providedService == null) {
			providedService = new EObjectContainmentEList<Service>(Service.class, this, RepositoryPackage.COMPONENT__PROVIDED_SERVICE);
		}
		return providedService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getRequiredInterface() {
		if (requiredInterface == null) {
			requiredInterface = new EObjectResolvingEList<Interface>(Interface.class, this, RepositoryPackage.COMPONENT__REQUIRED_INTERFACE);
		}
		return requiredInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getRequiredService() {
		if (requiredService == null) {
			requiredService = new EObjectResolvingEList<Service>(Service.class, this, RepositoryPackage.COMPONENT__REQUIRED_SERVICE);
		}
		return requiredService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorDescription getBehaviourDescription() {
		return behaviourDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBehaviourDescription(BehaviorDescription newBehaviourDescription, NotificationChain msgs) {
		BehaviorDescription oldBehaviourDescription = behaviourDescription;
		behaviourDescription = newBehaviourDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RepositoryPackage.COMPONENT__BEHAVIOUR_DESCRIPTION, oldBehaviourDescription, newBehaviourDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehaviourDescription(BehaviorDescription newBehaviourDescription) {
		if (newBehaviourDescription != behaviourDescription) {
			NotificationChain msgs = null;
			if (behaviourDescription != null)
				msgs = ((InternalEObject)behaviourDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RepositoryPackage.COMPONENT__BEHAVIOUR_DESCRIPTION, null, msgs);
			if (newBehaviourDescription != null)
				msgs = ((InternalEObject)newBehaviourDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RepositoryPackage.COMPONENT__BEHAVIOUR_DESCRIPTION, null, msgs);
			msgs = basicSetBehaviourDescription(newBehaviourDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.COMPONENT__BEHAVIOUR_DESCRIPTION, newBehaviourDescription, newBehaviourDescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RepositoryPackage.COMPONENT__PROVIDED_INTERFACE:
				return ((InternalEList<?>)getProvidedInterface()).basicRemove(otherEnd, msgs);
			case RepositoryPackage.COMPONENT__PROVIDED_SERVICE:
				return ((InternalEList<?>)getProvidedService()).basicRemove(otherEnd, msgs);
			case RepositoryPackage.COMPONENT__BEHAVIOUR_DESCRIPTION:
				return basicSetBehaviourDescription(null, msgs);
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
			case RepositoryPackage.COMPONENT__PROVIDED_INTERFACE:
				return getProvidedInterface();
			case RepositoryPackage.COMPONENT__PROVIDED_SERVICE:
				return getProvidedService();
			case RepositoryPackage.COMPONENT__REQUIRED_INTERFACE:
				return getRequiredInterface();
			case RepositoryPackage.COMPONENT__REQUIRED_SERVICE:
				return getRequiredService();
			case RepositoryPackage.COMPONENT__BEHAVIOUR_DESCRIPTION:
				return getBehaviourDescription();
			case RepositoryPackage.COMPONENT__NAME:
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
			case RepositoryPackage.COMPONENT__PROVIDED_INTERFACE:
				getProvidedInterface().clear();
				getProvidedInterface().addAll((Collection<? extends Interface>)newValue);
				return;
			case RepositoryPackage.COMPONENT__PROVIDED_SERVICE:
				getProvidedService().clear();
				getProvidedService().addAll((Collection<? extends Service>)newValue);
				return;
			case RepositoryPackage.COMPONENT__REQUIRED_INTERFACE:
				getRequiredInterface().clear();
				getRequiredInterface().addAll((Collection<? extends Interface>)newValue);
				return;
			case RepositoryPackage.COMPONENT__REQUIRED_SERVICE:
				getRequiredService().clear();
				getRequiredService().addAll((Collection<? extends Service>)newValue);
				return;
			case RepositoryPackage.COMPONENT__BEHAVIOUR_DESCRIPTION:
				setBehaviourDescription((BehaviorDescription)newValue);
				return;
			case RepositoryPackage.COMPONENT__NAME:
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
			case RepositoryPackage.COMPONENT__PROVIDED_INTERFACE:
				getProvidedInterface().clear();
				return;
			case RepositoryPackage.COMPONENT__PROVIDED_SERVICE:
				getProvidedService().clear();
				return;
			case RepositoryPackage.COMPONENT__REQUIRED_INTERFACE:
				getRequiredInterface().clear();
				return;
			case RepositoryPackage.COMPONENT__REQUIRED_SERVICE:
				getRequiredService().clear();
				return;
			case RepositoryPackage.COMPONENT__BEHAVIOUR_DESCRIPTION:
				setBehaviourDescription((BehaviorDescription)null);
				return;
			case RepositoryPackage.COMPONENT__NAME:
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
			case RepositoryPackage.COMPONENT__PROVIDED_INTERFACE:
				return providedInterface != null && !providedInterface.isEmpty();
			case RepositoryPackage.COMPONENT__PROVIDED_SERVICE:
				return providedService != null && !providedService.isEmpty();
			case RepositoryPackage.COMPONENT__REQUIRED_INTERFACE:
				return requiredInterface != null && !requiredInterface.isEmpty();
			case RepositoryPackage.COMPONENT__REQUIRED_SERVICE:
				return requiredService != null && !requiredService.isEmpty();
			case RepositoryPackage.COMPONENT__BEHAVIOUR_DESCRIPTION:
				return behaviourDescription != null;
			case RepositoryPackage.COMPONENT__NAME:
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

} //ComponentImpl

/**
 */
package Repository.impl;

import Repository.BehaviorDescription;
import Repository.Branch;
import Repository.InternalAction;
import Repository.Loop;
import Repository.RepositoryPackage;
import Repository.Service;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Repository.impl.BehaviorDescriptionImpl#getInternalActions <em>Internal Actions</em>}</li>
 *   <li>{@link Repository.impl.BehaviorDescriptionImpl#getLoops <em>Loops</em>}</li>
 *   <li>{@link Repository.impl.BehaviorDescriptionImpl#getBranches <em>Branches</em>}</li>
 *   <li>{@link Repository.impl.BehaviorDescriptionImpl#getCalledServices <em>Called Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviorDescriptionImpl extends MinimalEObjectImpl.Container implements BehaviorDescription {
	/**
	 * The cached value of the '{@link #getInternalActions() <em>Internal Actions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalActions()
	 * @generated
	 * @ordered
	 */
	protected InternalAction internalActions;

	/**
	 * The cached value of the '{@link #getLoops() <em>Loops</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoops()
	 * @generated
	 * @ordered
	 */
	protected Loop loops;

	/**
	 * The cached value of the '{@link #getBranches() <em>Branches</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranches()
	 * @generated
	 * @ordered
	 */
	protected Branch branches;

	/**
	 * The cached value of the '{@link #getCalledServices() <em>Called Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalledServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> calledServices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepositoryPackage.Literals.BEHAVIOR_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalAction getInternalActions() {
		return internalActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInternalActions(InternalAction newInternalActions, NotificationChain msgs) {
		InternalAction oldInternalActions = internalActions;
		internalActions = newInternalActions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RepositoryPackage.BEHAVIOR_DESCRIPTION__INTERNAL_ACTIONS, oldInternalActions, newInternalActions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalActions(InternalAction newInternalActions) {
		if (newInternalActions != internalActions) {
			NotificationChain msgs = null;
			if (internalActions != null)
				msgs = ((InternalEObject)internalActions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RepositoryPackage.BEHAVIOR_DESCRIPTION__INTERNAL_ACTIONS, null, msgs);
			if (newInternalActions != null)
				msgs = ((InternalEObject)newInternalActions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RepositoryPackage.BEHAVIOR_DESCRIPTION__INTERNAL_ACTIONS, null, msgs);
			msgs = basicSetInternalActions(newInternalActions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.BEHAVIOR_DESCRIPTION__INTERNAL_ACTIONS, newInternalActions, newInternalActions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Loop getLoops() {
		return loops;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoops(Loop newLoops, NotificationChain msgs) {
		Loop oldLoops = loops;
		loops = newLoops;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RepositoryPackage.BEHAVIOR_DESCRIPTION__LOOPS, oldLoops, newLoops);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoops(Loop newLoops) {
		if (newLoops != loops) {
			NotificationChain msgs = null;
			if (loops != null)
				msgs = ((InternalEObject)loops).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RepositoryPackage.BEHAVIOR_DESCRIPTION__LOOPS, null, msgs);
			if (newLoops != null)
				msgs = ((InternalEObject)newLoops).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RepositoryPackage.BEHAVIOR_DESCRIPTION__LOOPS, null, msgs);
			msgs = basicSetLoops(newLoops, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.BEHAVIOR_DESCRIPTION__LOOPS, newLoops, newLoops));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Branch getBranches() {
		return branches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBranches(Branch newBranches, NotificationChain msgs) {
		Branch oldBranches = branches;
		branches = newBranches;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RepositoryPackage.BEHAVIOR_DESCRIPTION__BRANCHES, oldBranches, newBranches);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBranches(Branch newBranches) {
		if (newBranches != branches) {
			NotificationChain msgs = null;
			if (branches != null)
				msgs = ((InternalEObject)branches).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RepositoryPackage.BEHAVIOR_DESCRIPTION__BRANCHES, null, msgs);
			if (newBranches != null)
				msgs = ((InternalEObject)newBranches).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RepositoryPackage.BEHAVIOR_DESCRIPTION__BRANCHES, null, msgs);
			msgs = basicSetBranches(newBranches, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.BEHAVIOR_DESCRIPTION__BRANCHES, newBranches, newBranches));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getCalledServices() {
		if (calledServices == null) {
			calledServices = new EObjectResolvingEList<Service>(Service.class, this, RepositoryPackage.BEHAVIOR_DESCRIPTION__CALLED_SERVICES);
		}
		return calledServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RepositoryPackage.BEHAVIOR_DESCRIPTION__INTERNAL_ACTIONS:
				return basicSetInternalActions(null, msgs);
			case RepositoryPackage.BEHAVIOR_DESCRIPTION__LOOPS:
				return basicSetLoops(null, msgs);
			case RepositoryPackage.BEHAVIOR_DESCRIPTION__BRANCHES:
				return basicSetBranches(null, msgs);
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
			case RepositoryPackage.BEHAVIOR_DESCRIPTION__INTERNAL_ACTIONS:
				return getInternalActions();
			case RepositoryPackage.BEHAVIOR_DESCRIPTION__LOOPS:
				return getLoops();
			case RepositoryPackage.BEHAVIOR_DESCRIPTION__BRANCHES:
				return getBranches();
			case RepositoryPackage.BEHAVIOR_DESCRIPTION__CALLED_SERVICES:
				return getCalledServices();
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
			case RepositoryPackage.BEHAVIOR_DESCRIPTION__INTERNAL_ACTIONS:
				setInternalActions((InternalAction)newValue);
				return;
			case RepositoryPackage.BEHAVIOR_DESCRIPTION__LOOPS:
				setLoops((Loop)newValue);
				return;
			case RepositoryPackage.BEHAVIOR_DESCRIPTION__BRANCHES:
				setBranches((Branch)newValue);
				return;
			case RepositoryPackage.BEHAVIOR_DESCRIPTION__CALLED_SERVICES:
				getCalledServices().clear();
				getCalledServices().addAll((Collection<? extends Service>)newValue);
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
			case RepositoryPackage.BEHAVIOR_DESCRIPTION__INTERNAL_ACTIONS:
				setInternalActions((InternalAction)null);
				return;
			case RepositoryPackage.BEHAVIOR_DESCRIPTION__LOOPS:
				setLoops((Loop)null);
				return;
			case RepositoryPackage.BEHAVIOR_DESCRIPTION__BRANCHES:
				setBranches((Branch)null);
				return;
			case RepositoryPackage.BEHAVIOR_DESCRIPTION__CALLED_SERVICES:
				getCalledServices().clear();
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
			case RepositoryPackage.BEHAVIOR_DESCRIPTION__INTERNAL_ACTIONS:
				return internalActions != null;
			case RepositoryPackage.BEHAVIOR_DESCRIPTION__LOOPS:
				return loops != null;
			case RepositoryPackage.BEHAVIOR_DESCRIPTION__BRANCHES:
				return branches != null;
			case RepositoryPackage.BEHAVIOR_DESCRIPTION__CALLED_SERVICES:
				return calledServices != null && !calledServices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BehaviorDescriptionImpl

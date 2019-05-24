/**
 */
package Repository.impl;

import Assembly.AssemblyContext;

import Repository.CompositeComponent;
import Repository.RepositoryPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Repository.impl.CompositeComponentImpl#getEncapsulatedAssemblyContext <em>Encapsulated Assembly Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeComponentImpl extends ComponentImpl implements CompositeComponent {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepositoryPackage.Literals.COMPOSITE_COMPONENT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RepositoryPackage.COMPOSITE_COMPONENT__ENCAPSULATED_ASSEMBLY_CONTEXT, oldEncapsulatedAssemblyContext, newEncapsulatedAssemblyContext);
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
				msgs = ((InternalEObject)encapsulatedAssemblyContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RepositoryPackage.COMPOSITE_COMPONENT__ENCAPSULATED_ASSEMBLY_CONTEXT, null, msgs);
			if (newEncapsulatedAssemblyContext != null)
				msgs = ((InternalEObject)newEncapsulatedAssemblyContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RepositoryPackage.COMPOSITE_COMPONENT__ENCAPSULATED_ASSEMBLY_CONTEXT, null, msgs);
			msgs = basicSetEncapsulatedAssemblyContext(newEncapsulatedAssemblyContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.COMPOSITE_COMPONENT__ENCAPSULATED_ASSEMBLY_CONTEXT, newEncapsulatedAssemblyContext, newEncapsulatedAssemblyContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RepositoryPackage.COMPOSITE_COMPONENT__ENCAPSULATED_ASSEMBLY_CONTEXT:
				return basicSetEncapsulatedAssemblyContext(null, msgs);
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
			case RepositoryPackage.COMPOSITE_COMPONENT__ENCAPSULATED_ASSEMBLY_CONTEXT:
				return getEncapsulatedAssemblyContext();
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
			case RepositoryPackage.COMPOSITE_COMPONENT__ENCAPSULATED_ASSEMBLY_CONTEXT:
				setEncapsulatedAssemblyContext((AssemblyContext)newValue);
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
			case RepositoryPackage.COMPOSITE_COMPONENT__ENCAPSULATED_ASSEMBLY_CONTEXT:
				setEncapsulatedAssemblyContext((AssemblyContext)null);
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
			case RepositoryPackage.COMPOSITE_COMPONENT__ENCAPSULATED_ASSEMBLY_CONTEXT:
				return encapsulatedAssemblyContext != null;
		}
		return super.eIsSet(featureID);
	}

} //CompositeComponentImpl

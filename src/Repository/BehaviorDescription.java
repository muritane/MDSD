/**
 */
package Repository;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Repository.BehaviorDescription#getInternalActions <em>Internal Actions</em>}</li>
 *   <li>{@link Repository.BehaviorDescription#getLoops <em>Loops</em>}</li>
 *   <li>{@link Repository.BehaviorDescription#getBranches <em>Branches</em>}</li>
 *   <li>{@link Repository.BehaviorDescription#getCalledServices <em>Called Services</em>}</li>
 * </ul>
 *
 * @see Repository.RepositoryPackage#getBehaviorDescription()
 * @model
 * @generated
 */
public interface BehaviorDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Actions</em>' containment reference.
	 * @see #setInternalActions(InternalAction)
	 * @see Repository.RepositoryPackage#getBehaviorDescription_InternalActions()
	 * @model containment="true"
	 * @generated
	 */
	InternalAction getInternalActions();

	/**
	 * Sets the value of the '{@link Repository.BehaviorDescription#getInternalActions <em>Internal Actions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Actions</em>' containment reference.
	 * @see #getInternalActions()
	 * @generated
	 */
	void setInternalActions(InternalAction value);

	/**
	 * Returns the value of the '<em><b>Loops</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loops</em>' containment reference.
	 * @see #setLoops(Loop)
	 * @see Repository.RepositoryPackage#getBehaviorDescription_Loops()
	 * @model containment="true"
	 * @generated
	 */
	Loop getLoops();

	/**
	 * Sets the value of the '{@link Repository.BehaviorDescription#getLoops <em>Loops</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loops</em>' containment reference.
	 * @see #getLoops()
	 * @generated
	 */
	void setLoops(Loop value);

	/**
	 * Returns the value of the '<em><b>Branches</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branches</em>' containment reference.
	 * @see #setBranches(Branch)
	 * @see Repository.RepositoryPackage#getBehaviorDescription_Branches()
	 * @model containment="true"
	 * @generated
	 */
	Branch getBranches();

	/**
	 * Sets the value of the '{@link Repository.BehaviorDescription#getBranches <em>Branches</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branches</em>' containment reference.
	 * @see #getBranches()
	 * @generated
	 */
	void setBranches(Branch value);

	/**
	 * Returns the value of the '<em><b>Called Services</b></em>' reference list.
	 * The list contents are of type {@link Repository.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Called Services</em>' reference list.
	 * @see Repository.RepositoryPackage#getBehaviorDescription_CalledServices()
	 * @model
	 * @generated
	 */
	EList<Service> getCalledServices();

} // BehaviorDescription

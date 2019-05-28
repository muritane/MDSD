/**
 */
package Repository;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Repository.Component#getProvidedInterface <em>Provided Interface</em>}</li>
 *   <li>{@link Repository.Component#getProvidedService <em>Provided Service</em>}</li>
 *   <li>{@link Repository.Component#getRequiredInterface <em>Required Interface</em>}</li>
 *   <li>{@link Repository.Component#getRequiredService <em>Required Service</em>}</li>
 *   <li>{@link Repository.Component#getBehaviourDescription <em>Behaviour Description</em>}</li>
 *   <li>{@link Repository.Component#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see Repository.RepositoryPackage#getComponent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ProvidedServiceSignature ServiceRequiredIsRequired'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ProvidedServiceSignature='\n\t\t\tself.providedInterface -&gt; forAll(i | self.providedService-&gt; exists(s | i.signature-&gt;includes(s.correspondingSignature)))' ServiceRequiredIsRequired='\n\t\t\tself.requiredService-&gt;forAll(s | self.requiredInterface-&gt;collect(signature)-&gt;asSet()-&gt;includes(s.correspondingSignature))'"
 * @generated
 */
public interface Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Provided Interface</b></em>' containment reference list.
	 * The list contents are of type {@link Repository.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Interface</em>' containment reference list.
	 * @see Repository.RepositoryPackage#getComponent_ProvidedInterface()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interface> getProvidedInterface();

	/**
	 * Returns the value of the '<em><b>Provided Service</b></em>' containment reference list.
	 * The list contents are of type {@link Repository.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Service</em>' containment reference list.
	 * @see Repository.RepositoryPackage#getComponent_ProvidedService()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Service> getProvidedService();

	/**
	 * Returns the value of the '<em><b>Required Interface</b></em>' reference list.
	 * The list contents are of type {@link Repository.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Interface</em>' reference list.
	 * @see Repository.RepositoryPackage#getComponent_RequiredInterface()
	 * @model
	 * @generated
	 */
	EList<Interface> getRequiredInterface();

	/**
	 * Returns the value of the '<em><b>Required Service</b></em>' reference list.
	 * The list contents are of type {@link Repository.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Service</em>' reference list.
	 * @see Repository.RepositoryPackage#getComponent_RequiredService()
	 * @model required="true"
	 * @generated
	 */
	EList<Service> getRequiredService();

	/**
	 * Returns the value of the '<em><b>Behaviour Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviour Description</em>' containment reference.
	 * @see #setBehaviourDescription(BehaviorDescription)
	 * @see Repository.RepositoryPackage#getComponent_BehaviourDescription()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BehaviorDescription getBehaviourDescription();

	/**
	 * Sets the value of the '{@link Repository.Component#getBehaviourDescription <em>Behaviour Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behaviour Description</em>' containment reference.
	 * @see #getBehaviourDescription()
	 * @generated
	 */
	void setBehaviourDescription(BehaviorDescription value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Repository.RepositoryPackage#getComponent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Repository.Component#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Component

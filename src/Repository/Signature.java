/**
 */
package Repository;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Repository.Signature#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link Repository.Signature#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link Repository.Signature#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see Repository.RepositoryPackage#getSignature()
 * @model
 * @generated
 */
public interface Signature extends EObject {
	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' reference.
	 * @see #setReturnType(Type)
	 * @see Repository.RepositoryPackage#getSignature_ReturnType()
	 * @model required="true"
	 * @generated
	 */
	Type getReturnType();

	/**
	 * Sets the value of the '{@link Repository.Signature#getReturnType <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(Type value);

	/**
	 * Returns the value of the '<em><b>Parameter Type</b></em>' reference list.
	 * The list contents are of type {@link Repository.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Type</em>' reference list.
	 * @see Repository.RepositoryPackage#getSignature_ParameterType()
	 * @model
	 * @generated
	 */
	EList<Type> getParameterType();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Repository.RepositoryPackage#getSignature_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Repository.Signature#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Signature

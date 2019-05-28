/**
 */
package Repository;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Repository.Service#getCorrespondingSignature <em>Corresponding Signature</em>}</li>
 *   <li>{@link Repository.Service#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see Repository.RepositoryPackage#getService()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='IdenticalSignatureReturnTypes IdenticalSignatureParameterTypes'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot IdenticalSignatureReturnTypes='\n          self.correspondingSignature -&gt; forAll(s | self.correspondingSignature -&gt; forAll(t | s.returnType = t.returnType))' IdenticalSignatureParameterTypes='\n          self.correspondingSignature -&gt; forAll(s | self.correspondingSignature -&gt; forAll(t | s.parameterType -&gt; includesAll(t.parameterType) and t.parameterType -&gt; includesAll(s.parameterType)))'"
 * @generated
 */
public interface Service extends EObject {
	/**
	 * Returns the value of the '<em><b>Corresponding Signature</b></em>' containment reference list.
	 * The list contents are of type {@link Repository.Signature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corresponding Signature</em>' containment reference list.
	 * @see Repository.RepositoryPackage#getService_CorrespondingSignature()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Signature> getCorrespondingSignature();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Repository.RepositoryPackage#getService_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Repository.Service#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Service

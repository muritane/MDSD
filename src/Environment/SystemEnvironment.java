/**
 */
package Environment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Environment.SystemEnvironment#getContainer <em>Container</em>}</li>
 *   <li>{@link Environment.SystemEnvironment#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see Environment.EnvironmentPackage#getSystemEnvironment()
 * @model
 * @generated
 */
public interface SystemEnvironment extends EObject {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' containment reference list.
	 * The list contents are of type {@link Environment.Container}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' containment reference list.
	 * @see Environment.EnvironmentPackage#getSystemEnvironment_Container()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Container> getContainer();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link Environment.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see Environment.EnvironmentPackage#getSystemEnvironment_Link()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLink();

} // SystemEnvironment

/**
 */
package Environment;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Environment.EnvironmentFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore.xml.type='http://www.eclipse.org/emf/2003/XMLType'"
 * @generated
 */
public interface EnvironmentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Environment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/Blatt1/model/environment.ecore#//environment";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "environment";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnvironmentPackage eINSTANCE = Environment.impl.EnvironmentPackageImpl.init();

	/**
	 * The meta object id for the '{@link Environment.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Environment.impl.LinkImpl
	 * @see Environment.impl.EnvironmentPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 0;

	/**
	 * The feature id for the '<em><b>Linked Containers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LINKED_CONTAINERS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__NAME = 1;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Environment.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Environment.impl.ContainerImpl
	 * @see Environment.impl.EnvironmentPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__LINKS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Environment.impl.SystemEnvironmentImpl <em>System Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Environment.impl.SystemEnvironmentImpl
	 * @see Environment.impl.EnvironmentPackageImpl#getSystemEnvironment()
	 * @generated
	 */
	int SYSTEM_ENVIRONMENT = 2;

	/**
	 * The feature id for the '<em><b>Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ENVIRONMENT__CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ENVIRONMENT__LINK = 1;

	/**
	 * The number of structural features of the '<em>System Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ENVIRONMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>System Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ENVIRONMENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link Environment.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see Environment.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the reference list '{@link Environment.Link#getLinkedContainers <em>Linked Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Linked Containers</em>'.
	 * @see Environment.Link#getLinkedContainers()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_LinkedContainers();

	/**
	 * Returns the meta object for the attribute '{@link Environment.Link#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Environment.Link#getName()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Name();

	/**
	 * Returns the meta object for class '{@link Environment.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see Environment.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the reference list '{@link Environment.Container#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Links</em>'.
	 * @see Environment.Container#getLinks()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Links();

	/**
	 * Returns the meta object for the attribute '{@link Environment.Container#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Environment.Container#getName()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Name();

	/**
	 * Returns the meta object for class '{@link Environment.SystemEnvironment <em>System Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Environment</em>'.
	 * @see Environment.SystemEnvironment
	 * @generated
	 */
	EClass getSystemEnvironment();

	/**
	 * Returns the meta object for the containment reference list '{@link Environment.SystemEnvironment#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Container</em>'.
	 * @see Environment.SystemEnvironment#getContainer()
	 * @see #getSystemEnvironment()
	 * @generated
	 */
	EReference getSystemEnvironment_Container();

	/**
	 * Returns the meta object for the containment reference list '{@link Environment.SystemEnvironment#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see Environment.SystemEnvironment#getLink()
	 * @see #getSystemEnvironment()
	 * @generated
	 */
	EReference getSystemEnvironment_Link();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EnvironmentFactory getEnvironmentFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Environment.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Environment.impl.LinkImpl
		 * @see Environment.impl.EnvironmentPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Linked Containers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__LINKED_CONTAINERS = eINSTANCE.getLink_LinkedContainers();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__NAME = eINSTANCE.getLink_Name();

		/**
		 * The meta object literal for the '{@link Environment.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Environment.impl.ContainerImpl
		 * @see Environment.impl.EnvironmentPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__LINKS = eINSTANCE.getContainer_Links();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__NAME = eINSTANCE.getContainer_Name();

		/**
		 * The meta object literal for the '{@link Environment.impl.SystemEnvironmentImpl <em>System Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Environment.impl.SystemEnvironmentImpl
		 * @see Environment.impl.EnvironmentPackageImpl#getSystemEnvironment()
		 * @generated
		 */
		EClass SYSTEM_ENVIRONMENT = eINSTANCE.getSystemEnvironment();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_ENVIRONMENT__CONTAINER = eINSTANCE.getSystemEnvironment_Container();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_ENVIRONMENT__LINK = eINSTANCE.getSystemEnvironment_Link();

	}

} //EnvironmentPackage

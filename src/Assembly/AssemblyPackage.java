/**
 */
package Assembly;

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
 * @see Assembly.AssemblyFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore.xml.type='http://www.eclipse.org/emf/2003/XMLType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface AssemblyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Assembly";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/Blatt1/model/assembly.ecore#//assembly";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "assembly";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AssemblyPackage eINSTANCE = Assembly.impl.AssemblyPackageImpl.init();

	/**
	 * The meta object id for the '{@link Assembly.impl.AssemblyContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Assembly.impl.AssemblyContextImpl
	 * @see Assembly.impl.AssemblyPackageImpl#getAssemblyContext()
	 * @generated
	 */
	int ASSEMBLY_CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Required Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__REQUIRED_ROLE = 0;

	/**
	 * The feature id for the '<em><b>Provided Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__PROVIDED_ROLE = 1;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Allocation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__NAME = 4;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Assembly.impl.AssemblyConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Assembly.impl.AssemblyConnectorImpl
	 * @see Assembly.impl.AssemblyPackageImpl#getAssemblyConnector()
	 * @generated
	 */
	int ASSEMBLY_CONNECTOR = 1;

	/**
	 * The feature id for the '<em><b>Provided Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__PROVIDED_ASSEMBLY_CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Required Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__REQUIRED_ASSEMBLY_CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Required Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__REQUIRED_ROLE = 2;

	/**
	 * The feature id for the '<em><b>Provided Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__PROVIDED_ROLE = 3;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Assembly.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Assembly.impl.SystemImpl
	 * @see Assembly.impl.AssemblyPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 2;

	/**
	 * The feature id for the '<em><b>Encapsulated Assembly Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ENCAPSULATED_ASSEMBLY_CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Provided Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PROVIDED_INTERFACES = 1;

	/**
	 * The feature id for the '<em><b>Allocation Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ALLOCATION_CONTEXT = 2;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ENVIRONMENT = 3;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Assembly.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Assembly.impl.RoleImpl
	 * @see Assembly.impl.AssemblyPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 3;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Assembly.impl.DelegationConnectorImpl <em>Delegation Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Assembly.impl.DelegationConnectorImpl
	 * @see Assembly.impl.AssemblyPackageImpl#getDelegationConnector()
	 * @generated
	 */
	int DELEGATION_CONNECTOR = 4;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR__ROLE = 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR__INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Delegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Delegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link Assembly.AssemblyContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see Assembly.AssemblyContext
	 * @generated
	 */
	EClass getAssemblyContext();

	/**
	 * Returns the meta object for the reference list '{@link Assembly.AssemblyContext#getRequiredRole <em>Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Role</em>'.
	 * @see Assembly.AssemblyContext#getRequiredRole()
	 * @see #getAssemblyContext()
	 * @generated
	 */
	EReference getAssemblyContext_RequiredRole();

	/**
	 * Returns the meta object for the containment reference list '{@link Assembly.AssemblyContext#getProvidedRole <em>Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided Role</em>'.
	 * @see Assembly.AssemblyContext#getProvidedRole()
	 * @see #getAssemblyContext()
	 * @generated
	 */
	EReference getAssemblyContext_ProvidedRole();

	/**
	 * Returns the meta object for the containment reference list '{@link Assembly.AssemblyContext#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see Assembly.AssemblyContext#getComponent()
	 * @see #getAssemblyContext()
	 * @generated
	 */
	EReference getAssemblyContext_Component();

	/**
	 * Returns the meta object for the reference '{@link Assembly.AssemblyContext#getAllocationContext <em>Allocation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Allocation Context</em>'.
	 * @see Assembly.AssemblyContext#getAllocationContext()
	 * @see #getAssemblyContext()
	 * @generated
	 */
	EReference getAssemblyContext_AllocationContext();

	/**
	 * Returns the meta object for the attribute '{@link Assembly.AssemblyContext#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Assembly.AssemblyContext#getName()
	 * @see #getAssemblyContext()
	 * @generated
	 */
	EAttribute getAssemblyContext_Name();

	/**
	 * Returns the meta object for class '{@link Assembly.AssemblyConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see Assembly.AssemblyConnector
	 * @generated
	 */
	EClass getAssemblyConnector();

	/**
	 * Returns the meta object for the reference '{@link Assembly.AssemblyConnector#getProvidedAssemblyContext <em>Provided Assembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Assembly Context</em>'.
	 * @see Assembly.AssemblyConnector#getProvidedAssemblyContext()
	 * @see #getAssemblyConnector()
	 * @generated
	 */
	EReference getAssemblyConnector_ProvidedAssemblyContext();

	/**
	 * Returns the meta object for the reference '{@link Assembly.AssemblyConnector#getRequiredAssemblyContext <em>Required Assembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Assembly Context</em>'.
	 * @see Assembly.AssemblyConnector#getRequiredAssemblyContext()
	 * @see #getAssemblyConnector()
	 * @generated
	 */
	EReference getAssemblyConnector_RequiredAssemblyContext();

	/**
	 * Returns the meta object for the reference '{@link Assembly.AssemblyConnector#getRequiredRole <em>Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Role</em>'.
	 * @see Assembly.AssemblyConnector#getRequiredRole()
	 * @see #getAssemblyConnector()
	 * @generated
	 */
	EReference getAssemblyConnector_RequiredRole();

	/**
	 * Returns the meta object for the reference '{@link Assembly.AssemblyConnector#getProvidedRole <em>Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Role</em>'.
	 * @see Assembly.AssemblyConnector#getProvidedRole()
	 * @see #getAssemblyConnector()
	 * @generated
	 */
	EReference getAssemblyConnector_ProvidedRole();

	/**
	 * Returns the meta object for class '{@link Assembly.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see Assembly.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference '{@link Assembly.System#getEncapsulatedAssemblyContext <em>Encapsulated Assembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Encapsulated Assembly Context</em>'.
	 * @see Assembly.System#getEncapsulatedAssemblyContext()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_EncapsulatedAssemblyContext();

	/**
	 * Returns the meta object for the containment reference list '{@link Assembly.System#getProvidedInterfaces <em>Provided Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided Interfaces</em>'.
	 * @see Assembly.System#getProvidedInterfaces()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_ProvidedInterfaces();

	/**
	 * Returns the meta object for the containment reference '{@link Assembly.System#getAllocationContext <em>Allocation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Allocation Context</em>'.
	 * @see Assembly.System#getAllocationContext()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_AllocationContext();

	/**
	 * Returns the meta object for the reference '{@link Assembly.System#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Environment</em>'.
	 * @see Assembly.System#getEnvironment()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Environment();

	/**
	 * Returns the meta object for class '{@link Assembly.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see Assembly.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for class '{@link Assembly.DelegationConnector <em>Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegation Connector</em>'.
	 * @see Assembly.DelegationConnector
	 * @generated
	 */
	EClass getDelegationConnector();

	/**
	 * Returns the meta object for the reference '{@link Assembly.DelegationConnector#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see Assembly.DelegationConnector#getRole()
	 * @see #getDelegationConnector()
	 * @generated
	 */
	EReference getDelegationConnector_Role();

	/**
	 * Returns the meta object for the reference '{@link Assembly.DelegationConnector#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see Assembly.DelegationConnector#getInterface()
	 * @see #getDelegationConnector()
	 * @generated
	 */
	EReference getDelegationConnector_Interface();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AssemblyFactory getAssemblyFactory();

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
		 * The meta object literal for the '{@link Assembly.impl.AssemblyContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Assembly.impl.AssemblyContextImpl
		 * @see Assembly.impl.AssemblyPackageImpl#getAssemblyContext()
		 * @generated
		 */
		EClass ASSEMBLY_CONTEXT = eINSTANCE.getAssemblyContext();

		/**
		 * The meta object literal for the '<em><b>Required Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONTEXT__REQUIRED_ROLE = eINSTANCE.getAssemblyContext_RequiredRole();

		/**
		 * The meta object literal for the '<em><b>Provided Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONTEXT__PROVIDED_ROLE = eINSTANCE.getAssemblyContext_ProvidedRole();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONTEXT__COMPONENT = eINSTANCE.getAssemblyContext_Component();

		/**
		 * The meta object literal for the '<em><b>Allocation Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT = eINSTANCE.getAssemblyContext_AllocationContext();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSEMBLY_CONTEXT__NAME = eINSTANCE.getAssemblyContext_Name();

		/**
		 * The meta object literal for the '{@link Assembly.impl.AssemblyConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Assembly.impl.AssemblyConnectorImpl
		 * @see Assembly.impl.AssemblyPackageImpl#getAssemblyConnector()
		 * @generated
		 */
		EClass ASSEMBLY_CONNECTOR = eINSTANCE.getAssemblyConnector();

		/**
		 * The meta object literal for the '<em><b>Provided Assembly Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONNECTOR__PROVIDED_ASSEMBLY_CONTEXT = eINSTANCE.getAssemblyConnector_ProvidedAssemblyContext();

		/**
		 * The meta object literal for the '<em><b>Required Assembly Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONNECTOR__REQUIRED_ASSEMBLY_CONTEXT = eINSTANCE.getAssemblyConnector_RequiredAssemblyContext();

		/**
		 * The meta object literal for the '<em><b>Required Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONNECTOR__REQUIRED_ROLE = eINSTANCE.getAssemblyConnector_RequiredRole();

		/**
		 * The meta object literal for the '<em><b>Provided Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONNECTOR__PROVIDED_ROLE = eINSTANCE.getAssemblyConnector_ProvidedRole();

		/**
		 * The meta object literal for the '{@link Assembly.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Assembly.impl.SystemImpl
		 * @see Assembly.impl.AssemblyPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Encapsulated Assembly Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__ENCAPSULATED_ASSEMBLY_CONTEXT = eINSTANCE.getSystem_EncapsulatedAssemblyContext();

		/**
		 * The meta object literal for the '<em><b>Provided Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__PROVIDED_INTERFACES = eINSTANCE.getSystem_ProvidedInterfaces();

		/**
		 * The meta object literal for the '<em><b>Allocation Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__ALLOCATION_CONTEXT = eINSTANCE.getSystem_AllocationContext();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__ENVIRONMENT = eINSTANCE.getSystem_Environment();

		/**
		 * The meta object literal for the '{@link Assembly.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Assembly.impl.RoleImpl
		 * @see Assembly.impl.AssemblyPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '{@link Assembly.impl.DelegationConnectorImpl <em>Delegation Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Assembly.impl.DelegationConnectorImpl
		 * @see Assembly.impl.AssemblyPackageImpl#getDelegationConnector()
		 * @generated
		 */
		EClass DELEGATION_CONNECTOR = eINSTANCE.getDelegationConnector();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION_CONNECTOR__ROLE = eINSTANCE.getDelegationConnector_Role();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION_CONNECTOR__INTERFACE = eINSTANCE.getDelegationConnector_Interface();

	}

} //AssemblyPackage

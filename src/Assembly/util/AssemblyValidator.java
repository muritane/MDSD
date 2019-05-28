/**
 */
package Assembly.util;

import Assembly.AssemblyConnector;
import Assembly.AssemblyContext;
import Assembly.AssemblyPackage;
import Assembly.DelegationConnector;
import Assembly.Role;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see Assembly.AssemblyPackage
 * @generated
 */
public class AssemblyValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AssemblyValidator INSTANCE = new AssemblyValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "Assembly";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return AssemblyPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case AssemblyPackage.ASSEMBLY_CONTEXT:
				return validateAssemblyContext((AssemblyContext)value, diagnostics, context);
			case AssemblyPackage.ASSEMBLY_CONNECTOR:
				return validateAssemblyConnector((AssemblyConnector)value, diagnostics, context);
			case AssemblyPackage.SYSTEM:
				return validateSystem((Assembly.System)value, diagnostics, context);
			case AssemblyPackage.ROLE:
				return validateRole((Role)value, diagnostics, context);
			case AssemblyPackage.DELEGATION_CONNECTOR:
				return validateDelegationConnector((DelegationConnector)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyContext(AssemblyContext assemblyContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assemblyContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyConnector(AssemblyConnector assemblyConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(assemblyConnector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssemblyConnector_RequiredRolesFromAssemblies(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssemblyConnector_ProvidedRolesFromAssemblies(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssemblyConnector_RolesOnSameOrLinkedContainer(assemblyConnector, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the RequiredRolesFromAssemblies constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY_CONNECTOR__REQUIRED_ROLES_FROM_ASSEMBLIES__EEXPRESSION = "\n" +
		"\t\t\tself.requiredRole = self.requiredAssemblyContext.requiredRole";

	/**
	 * Validates the RequiredRolesFromAssemblies constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyConnector_RequiredRolesFromAssemblies(AssemblyConnector assemblyConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AssemblyPackage.Literals.ASSEMBLY_CONNECTOR,
				 assemblyConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "RequiredRolesFromAssemblies",
				 ASSEMBLY_CONNECTOR__REQUIRED_ROLES_FROM_ASSEMBLIES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ProvidedRolesFromAssemblies constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY_CONNECTOR__PROVIDED_ROLES_FROM_ASSEMBLIES__EEXPRESSION = "\n" +
		"\t\t\tself.providedRole = self.providedAssemblyContext.providedRole";

	/**
	 * Validates the ProvidedRolesFromAssemblies constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyConnector_ProvidedRolesFromAssemblies(AssemblyConnector assemblyConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AssemblyPackage.Literals.ASSEMBLY_CONNECTOR,
				 assemblyConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ProvidedRolesFromAssemblies",
				 ASSEMBLY_CONNECTOR__PROVIDED_ROLES_FROM_ASSEMBLIES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the RolesOnSameOrLinkedContainer constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY_CONNECTOR__ROLES_ON_SAME_OR_LINKED_CONTAINER__EEXPRESSION = "\n" +
		"\t\t\tself.providedAssemblyContext.allocationContext = self.requiredAssemblyContext.allocationContext\n" +
		"\t\t\tor self.providedAssemblyContext.allocationContext.targetContainer.links->collect(linkedContainers)->includes(self.requiredAssemblyContext.allocationContext)";

	/**
	 * Validates the RolesOnSameOrLinkedContainer constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyConnector_RolesOnSameOrLinkedContainer(AssemblyConnector assemblyConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AssemblyPackage.Literals.ASSEMBLY_CONNECTOR,
				 assemblyConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "RolesOnSameOrLinkedContainer",
				 ASSEMBLY_CONNECTOR__ROLES_ON_SAME_OR_LINKED_CONTAINER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystem(Assembly.System system, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(system, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(system, diagnostics, context);
		if (result || diagnostics != null) result &= validateSystem_AllocationContextSpecifiesAssemblyAllocation(system, diagnostics, context);
		if (result || diagnostics != null) result &= validateSystem_AllocationOnCorrespondingEnvironment(system, diagnostics, context);
		if (result || diagnostics != null) result &= validateSystem_AllocationContextAssemblyContainer(system, diagnostics, context);
		if (result || diagnostics != null) result &= validateSystem_AssemblyContainerAllocationContext(system, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the AllocationContextSpecifiesAssemblyAllocation constraint of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SYSTEM__ALLOCATION_CONTEXT_SPECIFIES_ASSEMBLY_ALLOCATION__EEXPRESSION = "\n" +
		"\t\t\tself.allocationContext.allocatedAssemblyContext = self.encapsulatedAssemblyContext";

	/**
	 * Validates the AllocationContextSpecifiesAssemblyAllocation constraint of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystem_AllocationContextSpecifiesAssemblyAllocation(Assembly.System system, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AssemblyPackage.Literals.SYSTEM,
				 system,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AllocationContextSpecifiesAssemblyAllocation",
				 SYSTEM__ALLOCATION_CONTEXT_SPECIFIES_ASSEMBLY_ALLOCATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AllocationOnCorrespondingEnvironment constraint of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SYSTEM__ALLOCATION_ON_CORRESPONDING_ENVIRONMENT__EEXPRESSION = "\n" +
		"\t\t\tself.allocationContext.targetContainer -> forAll(c | self.environment->includes(c))";

	/**
	 * Validates the AllocationOnCorrespondingEnvironment constraint of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystem_AllocationOnCorrespondingEnvironment(Assembly.System system, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AssemblyPackage.Literals.SYSTEM,
				 system,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AllocationOnCorrespondingEnvironment",
				 SYSTEM__ALLOCATION_ON_CORRESPONDING_ENVIRONMENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AllocationContextAssemblyContainer constraint of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SYSTEM__ALLOCATION_CONTEXT_ASSEMBLY_CONTAINER__EEXPRESSION = "\n" +
		"\t\t\tself.allocationContext.targetContainer -> forAll(c | self.encapsulatedAssemblyContext->collect(allocationContext)->includes(c))";

	/**
	 * Validates the AllocationContextAssemblyContainer constraint of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystem_AllocationContextAssemblyContainer(Assembly.System system, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AssemblyPackage.Literals.SYSTEM,
				 system,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AllocationContextAssemblyContainer",
				 SYSTEM__ALLOCATION_CONTEXT_ASSEMBLY_CONTAINER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AssemblyContainerAllocationContext constraint of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SYSTEM__ASSEMBLY_CONTAINER_ALLOCATION_CONTEXT__EEXPRESSION = "\n" +
		"\t\t\tself.encapsulatedAssemblyContext->collect(allocationContext)->forAll(c | self.allocationContext.targetContainer -> includes(c))";

	/**
	 * Validates the AssemblyContainerAllocationContext constraint of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystem_AssemblyContainerAllocationContext(Assembly.System system, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AssemblyPackage.Literals.SYSTEM,
				 system,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AssemblyContainerAllocationContext",
				 SYSTEM__ASSEMBLY_CONTAINER_ALLOCATION_CONTEXT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRole(Role role, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(role, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegationConnector(DelegationConnector delegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(delegationConnector, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //AssemblyValidator

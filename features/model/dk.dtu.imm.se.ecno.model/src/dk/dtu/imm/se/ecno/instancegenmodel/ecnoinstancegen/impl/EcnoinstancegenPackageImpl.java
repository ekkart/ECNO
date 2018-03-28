/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import dk.dtu.imm.se.ecno.genmodel.ecnogen.EcnogenPackage;
import dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.ECNOInstanceGenModel;
import dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.EcnoinstancegenFactory;
import dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.EcnoinstancegenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcnoinstancegenPackageImpl extends EPackageImpl implements EcnoinstancegenPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecnoInstanceGenModelEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.EcnoinstancegenPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EcnoinstancegenPackageImpl() {
		super(eNS_URI, EcnoinstancegenFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EcnoinstancegenPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EcnoinstancegenPackage init() {
		if (isInited) return (EcnoinstancegenPackage)EPackage.Registry.INSTANCE.getEPackage(EcnoinstancegenPackage.eNS_URI);

		// Obtain or create and register package
		EcnoinstancegenPackageImpl theEcnoinstancegenPackage = (EcnoinstancegenPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EcnoinstancegenPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EcnoinstancegenPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcnogenPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEcnoinstancegenPackage.createPackageContents();

		// Initialize created meta-data
		theEcnoinstancegenPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEcnoinstancegenPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EcnoinstancegenPackage.eNS_URI, theEcnoinstancegenPackage);
		return theEcnoinstancegenPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getECNOInstanceGenModel() {
		return ecnoInstanceGenModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECNOInstanceGenModel_Instance() {
		return (EReference)ecnoInstanceGenModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECNOInstanceGenModel_EcnoGenModel() {
		return (EReference)ecnoInstanceGenModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getECNOInstanceGenModel_BasePathECNOInstance() {
		return (EAttribute)ecnoInstanceGenModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getECNOInstanceGenModel_InstanceClassName() {
		return (EAttribute)ecnoInstanceGenModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcnoinstancegenFactory getEcnoinstancegenFactory() {
		return (EcnoinstancegenFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		ecnoInstanceGenModelEClass = createEClass(ECNO_INSTANCE_GEN_MODEL);
		createEReference(ecnoInstanceGenModelEClass, ECNO_INSTANCE_GEN_MODEL__INSTANCE);
		createEReference(ecnoInstanceGenModelEClass, ECNO_INSTANCE_GEN_MODEL__ECNO_GEN_MODEL);
		createEAttribute(ecnoInstanceGenModelEClass, ECNO_INSTANCE_GEN_MODEL__BASE_PATH_ECNO_INSTANCE);
		createEAttribute(ecnoInstanceGenModelEClass, ECNO_INSTANCE_GEN_MODEL__INSTANCE_CLASS_NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcnogenPackage theEcnogenPackage = (EcnogenPackage)EPackage.Registry.INSTANCE.getEPackage(EcnogenPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(ecnoInstanceGenModelEClass, ECNOInstanceGenModel.class, "ECNOInstanceGenModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getECNOInstanceGenModel_Instance(), ecorePackage.getEObject(), null, "instance", null, 0, 1, ECNOInstanceGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getECNOInstanceGenModel_EcnoGenModel(), theEcnogenPackage.getECNOGenModel(), null, "ecnoGenModel", null, 0, -1, ECNOInstanceGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getECNOInstanceGenModel_BasePathECNOInstance(), ecorePackage.getEString(), "basePathECNOInstance", null, 0, 1, ECNOInstanceGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getECNOInstanceGenModel_InstanceClassName(), ecorePackage.getEString(), "instanceClassName", null, 0, 1, ECNOInstanceGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EcnoinstancegenPackageImpl

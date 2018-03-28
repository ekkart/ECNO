/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.genmodel.ecnogen.impl;

import dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel;
import dk.dtu.imm.se.ecno.genmodel.ecnogen.EcnogenFactory;
import dk.dtu.imm.se.ecno.genmodel.ecnogen.EcnogenPackage;

import dk.dtu.imm.se.ecno.model.ecno.EcnoPackage;

import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcnogenPackageImpl extends EPackageImpl implements EcnogenPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecnoGenModelEClass = null;

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
	 * @see dk.dtu.imm.se.ecno.genmodel.ecnogen.EcnogenPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EcnogenPackageImpl() {
		super(eNS_URI, EcnogenFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EcnogenPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EcnogenPackage init() {
		if (isInited) return (EcnogenPackage)EPackage.Registry.INSTANCE.getEPackage(EcnogenPackage.eNS_URI);

		// Obtain or create and register package
		EcnogenPackageImpl theEcnogenPackage = (EcnogenPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EcnogenPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EcnogenPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcnoPackage.eINSTANCE.eClass();
		GenModelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEcnogenPackage.createPackageContents();

		// Initialize created meta-data
		theEcnogenPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEcnogenPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EcnogenPackage.eNS_URI, theEcnogenPackage);
		return theEcnogenPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getECNOGenModel() {
		return ecnoGenModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECNOGenModel_EmfGenModel() {
		return (EReference)ecnoGenModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECNOGenModel_EcnoModel() {
		return (EReference)ecnoGenModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getECNOGenModel_BasePathECNOEvents() {
		return (EAttribute)ecnoGenModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getECNOGenModel_BasePathECNOAutomata() {
		return (EAttribute)ecnoGenModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getECNOGenModel_AutomataFactoryClassName() {
		return (EAttribute)ecnoGenModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECNOGenModel_BehaviourModel() {
		return (EReference)ecnoGenModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getECNOGenModel_BasePathModelClass() {
		return (EAttribute)ecnoGenModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getECNOGenModel_ModelClassName() {
		return (EAttribute)ecnoGenModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getECNOGenModel_PackageAdapterFactoryClassName() {
		return (EAttribute)ecnoGenModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECNOGenModel_Required() {
		return (EReference)ecnoGenModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcnogenFactory getEcnogenFactory() {
		return (EcnogenFactory)getEFactoryInstance();
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
		ecnoGenModelEClass = createEClass(ECNO_GEN_MODEL);
		createEReference(ecnoGenModelEClass, ECNO_GEN_MODEL__EMF_GEN_MODEL);
		createEReference(ecnoGenModelEClass, ECNO_GEN_MODEL__ECNO_MODEL);
		createEAttribute(ecnoGenModelEClass, ECNO_GEN_MODEL__BASE_PATH_ECNO_EVENTS);
		createEAttribute(ecnoGenModelEClass, ECNO_GEN_MODEL__BASE_PATH_ECNO_AUTOMATA);
		createEAttribute(ecnoGenModelEClass, ECNO_GEN_MODEL__AUTOMATA_FACTORY_CLASS_NAME);
		createEReference(ecnoGenModelEClass, ECNO_GEN_MODEL__BEHAVIOUR_MODEL);
		createEAttribute(ecnoGenModelEClass, ECNO_GEN_MODEL__BASE_PATH_MODEL_CLASS);
		createEAttribute(ecnoGenModelEClass, ECNO_GEN_MODEL__MODEL_CLASS_NAME);
		createEAttribute(ecnoGenModelEClass, ECNO_GEN_MODEL__PACKAGE_ADAPTER_FACTORY_CLASS_NAME);
		createEReference(ecnoGenModelEClass, ECNO_GEN_MODEL__REQUIRED);
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
		GenModelPackage theGenModelPackage = (GenModelPackage)EPackage.Registry.INSTANCE.getEPackage(GenModelPackage.eNS_URI);
		EcnoPackage theEcnoPackage = (EcnoPackage)EPackage.Registry.INSTANCE.getEPackage(EcnoPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(ecnoGenModelEClass, ECNOGenModel.class, "ECNOGenModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getECNOGenModel_EmfGenModel(), theGenModelPackage.getGenModel(), null, "emfGenModel", null, 0, -1, ECNOGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getECNOGenModel_EcnoModel(), theEcnoPackage.getPackage(), null, "ecnoModel", null, 0, 1, ECNOGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getECNOGenModel_BasePathECNOEvents(), ecorePackage.getEString(), "basePathECNOEvents", null, 0, 1, ECNOGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getECNOGenModel_BasePathECNOAutomata(), ecorePackage.getEString(), "basePathECNOAutomata", null, 0, 1, ECNOGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getECNOGenModel_AutomataFactoryClassName(), ecorePackage.getEString(), "AutomataFactoryClassName", null, 0, 1, ECNOGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getECNOGenModel_BehaviourModel(), theEcorePackage.getEObject(), null, "BehaviourModel", null, 0, 1, ECNOGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getECNOGenModel_BasePathModelClass(), ecorePackage.getEString(), "basePathModelClass", null, 0, 1, ECNOGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getECNOGenModel_ModelClassName(), ecorePackage.getEString(), "ModelClassName", null, 0, 1, ECNOGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getECNOGenModel_PackageAdapterFactoryClassName(), ecorePackage.getEString(), "PackageAdapterFactoryClassName", null, 0, 1, ECNOGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getECNOGenModel_Required(), this.getECNOGenModel(), null, "required", null, 0, -1, ECNOGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EcnogenPackageImpl

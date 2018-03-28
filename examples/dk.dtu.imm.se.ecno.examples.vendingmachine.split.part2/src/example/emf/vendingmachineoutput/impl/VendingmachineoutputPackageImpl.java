/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package example.emf.vendingmachineoutput.impl;

import example.emf.vendingmachine.VendingmachinePackage;

import example.emf.vendingmachineoutput.Output;
import example.emf.vendingmachineoutput.VendingmachineoutputFactory;
import example.emf.vendingmachineoutput.VendingmachineoutputPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VendingmachineoutputPackageImpl extends EPackageImpl implements VendingmachineoutputPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputEClass = null;

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
	 * @see example.emf.vendingmachineoutput.VendingmachineoutputPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VendingmachineoutputPackageImpl() {
		super(eNS_URI, VendingmachineoutputFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link VendingmachineoutputPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VendingmachineoutputPackage init() {
		if (isInited) return (VendingmachineoutputPackage)EPackage.Registry.INSTANCE.getEPackage(VendingmachineoutputPackage.eNS_URI);

		// Obtain or create and register package
		VendingmachineoutputPackageImpl theVendingmachineoutputPackage = (VendingmachineoutputPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VendingmachineoutputPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VendingmachineoutputPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		VendingmachinePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theVendingmachineoutputPackage.createPackageContents();

		// Initialize created meta-data
		theVendingmachineoutputPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVendingmachineoutputPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VendingmachineoutputPackage.eNS_URI, theVendingmachineoutputPackage);
		return theVendingmachineoutputPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutput() {
		return outputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutput_Brewer() {
		return (EReference)outputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendingmachineoutputFactory getVendingmachineoutputFactory() {
		return (VendingmachineoutputFactory)getEFactoryInstance();
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
		outputEClass = createEClass(OUTPUT);
		createEReference(outputEClass, OUTPUT__BREWER);
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
		VendingmachinePackage theVendingmachinePackage = (VendingmachinePackage)EPackage.Registry.INSTANCE.getEPackage(VendingmachinePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		outputEClass.getESuperTypes().add(theVendingmachinePackage.getVendingMachineComponent());

		// Initialize classes and features; add operations and parameters
		initEClass(outputEClass, Output.class, "Output", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutput_Brewer(), theVendingmachinePackage.getBrewer(), null, "brewer", null, 0, -1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //VendingmachineoutputPackageImpl

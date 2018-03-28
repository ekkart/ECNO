/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package example.emf.vendingmachinebrewers.impl;

import example.emf.vendingmachine.VendingmachinePackage;

import example.emf.vendingmachinebrewers.CoffeeBrewer;
import example.emf.vendingmachinebrewers.TeaBrewer;
import example.emf.vendingmachinebrewers.VendingmachinebrewersFactory;
import example.emf.vendingmachinebrewers.VendingmachinebrewersPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VendingmachinebrewersPackageImpl extends EPackageImpl implements VendingmachinebrewersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coffeeBrewerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teaBrewerEClass = null;

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
	 * @see example.emf.vendingmachinebrewers.VendingmachinebrewersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VendingmachinebrewersPackageImpl() {
		super(eNS_URI, VendingmachinebrewersFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link VendingmachinebrewersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VendingmachinebrewersPackage init() {
		if (isInited) return (VendingmachinebrewersPackage)EPackage.Registry.INSTANCE.getEPackage(VendingmachinebrewersPackage.eNS_URI);

		// Obtain or create and register package
		VendingmachinebrewersPackageImpl theVendingmachinebrewersPackage = (VendingmachinebrewersPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VendingmachinebrewersPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VendingmachinebrewersPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		VendingmachinePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theVendingmachinebrewersPackage.createPackageContents();

		// Initialize created meta-data
		theVendingmachinebrewersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVendingmachinebrewersPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VendingmachinebrewersPackage.eNS_URI, theVendingmachinebrewersPackage);
		return theVendingmachinebrewersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoffeeBrewer() {
		return coffeeBrewerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTeaBrewer() {
		return teaBrewerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendingmachinebrewersFactory getVendingmachinebrewersFactory() {
		return (VendingmachinebrewersFactory)getEFactoryInstance();
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
		coffeeBrewerEClass = createEClass(COFFEE_BREWER);

		teaBrewerEClass = createEClass(TEA_BREWER);
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
		coffeeBrewerEClass.getESuperTypes().add(theVendingmachinePackage.getBrewer());
		teaBrewerEClass.getESuperTypes().add(theVendingmachinePackage.getBrewer());

		// Initialize classes and features; add operations and parameters
		initEClass(coffeeBrewerEClass, CoffeeBrewer.class, "CoffeeBrewer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(teaBrewerEClass, TeaBrewer.class, "TeaBrewer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //VendingmachinebrewersPackageImpl

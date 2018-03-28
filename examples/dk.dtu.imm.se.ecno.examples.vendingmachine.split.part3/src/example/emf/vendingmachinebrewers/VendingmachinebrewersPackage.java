/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package example.emf.vendingmachinebrewers;

import example.emf.vendingmachine.VendingmachinePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see example.emf.vendingmachinebrewers.VendingmachinebrewersFactory
 * @model kind="package"
 * @generated
 */
public interface VendingmachinebrewersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vendingmachinebrewers";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://se.imm.dtu.dk/vendingmachine/brewers/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vendingmachinebrewers";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VendingmachinebrewersPackage eINSTANCE = example.emf.vendingmachinebrewers.impl.VendingmachinebrewersPackageImpl.init();

	/**
	 * The meta object id for the '{@link example.emf.vendingmachinebrewers.impl.CoffeeBrewerImpl <em>Coffee Brewer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see example.emf.vendingmachinebrewers.impl.CoffeeBrewerImpl
	 * @see example.emf.vendingmachinebrewers.impl.VendingmachinebrewersPackageImpl#getCoffeeBrewer()
	 * @generated
	 */
	int COFFEE_BREWER = 0;

	/**
	 * The feature id for the '<em><b>Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_BREWER__CONTROL = VendingmachinePackage.BREWER__CONTROL;

	/**
	 * The number of structural features of the '<em>Coffee Brewer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_BREWER_FEATURE_COUNT = VendingmachinePackage.BREWER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link example.emf.vendingmachinebrewers.impl.TeaBrewerImpl <em>Tea Brewer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see example.emf.vendingmachinebrewers.impl.TeaBrewerImpl
	 * @see example.emf.vendingmachinebrewers.impl.VendingmachinebrewersPackageImpl#getTeaBrewer()
	 * @generated
	 */
	int TEA_BREWER = 1;

	/**
	 * The feature id for the '<em><b>Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEA_BREWER__CONTROL = VendingmachinePackage.BREWER__CONTROL;

	/**
	 * The number of structural features of the '<em>Tea Brewer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEA_BREWER_FEATURE_COUNT = VendingmachinePackage.BREWER_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link example.emf.vendingmachinebrewers.CoffeeBrewer <em>Coffee Brewer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coffee Brewer</em>'.
	 * @see example.emf.vendingmachinebrewers.CoffeeBrewer
	 * @generated
	 */
	EClass getCoffeeBrewer();

	/**
	 * Returns the meta object for class '{@link example.emf.vendingmachinebrewers.TeaBrewer <em>Tea Brewer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tea Brewer</em>'.
	 * @see example.emf.vendingmachinebrewers.TeaBrewer
	 * @generated
	 */
	EClass getTeaBrewer();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VendingmachinebrewersFactory getVendingmachinebrewersFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link example.emf.vendingmachinebrewers.impl.CoffeeBrewerImpl <em>Coffee Brewer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see example.emf.vendingmachinebrewers.impl.CoffeeBrewerImpl
		 * @see example.emf.vendingmachinebrewers.impl.VendingmachinebrewersPackageImpl#getCoffeeBrewer()
		 * @generated
		 */
		EClass COFFEE_BREWER = eINSTANCE.getCoffeeBrewer();

		/**
		 * The meta object literal for the '{@link example.emf.vendingmachinebrewers.impl.TeaBrewerImpl <em>Tea Brewer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see example.emf.vendingmachinebrewers.impl.TeaBrewerImpl
		 * @see example.emf.vendingmachinebrewers.impl.VendingmachinebrewersPackageImpl#getTeaBrewer()
		 * @generated
		 */
		EClass TEA_BREWER = eINSTANCE.getTeaBrewer();

	}

} //VendingmachinebrewersPackage

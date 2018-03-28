/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package example.emf.vendingmachineoutput;

import example.emf.vendingmachine.VendingmachinePackage;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see example.emf.vendingmachineoutput.VendingmachineoutputFactory
 * @model kind="package"
 * @generated
 */
public interface VendingmachineoutputPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vendingmachineoutput";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://se.imm.dtu.dk/vendingmachine/output/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vendingmachineoutput";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VendingmachineoutputPackage eINSTANCE = example.emf.vendingmachineoutput.impl.VendingmachineoutputPackageImpl.init();

	/**
	 * The meta object id for the '{@link example.emf.vendingmachineoutput.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see example.emf.vendingmachineoutput.impl.OutputImpl
	 * @see example.emf.vendingmachineoutput.impl.VendingmachineoutputPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 0;

	/**
	 * The feature id for the '<em><b>Brewer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__BREWER = VendingmachinePackage.VENDING_MACHINE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = VendingmachinePackage.VENDING_MACHINE_COMPONENT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link example.emf.vendingmachineoutput.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see example.emf.vendingmachineoutput.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the reference list '{@link example.emf.vendingmachineoutput.Output#getBrewer <em>Brewer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Brewer</em>'.
	 * @see example.emf.vendingmachineoutput.Output#getBrewer()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Brewer();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VendingmachineoutputFactory getVendingmachineoutputFactory();

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
		 * The meta object literal for the '{@link example.emf.vendingmachineoutput.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see example.emf.vendingmachineoutput.impl.OutputImpl
		 * @see example.emf.vendingmachineoutput.impl.VendingmachineoutputPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '<em><b>Brewer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__BREWER = eINSTANCE.getOutput_Brewer();

	}

} //VendingmachineoutputPackage

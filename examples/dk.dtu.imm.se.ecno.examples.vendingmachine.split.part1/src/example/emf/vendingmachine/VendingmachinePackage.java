/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package example.emf.vendingmachine;

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
 * @see example.emf.vendingmachine.VendingmachineFactory
 * @model kind="package"
 * @generated
 */
public interface VendingmachinePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vendingmachine";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://se.imm.dtu.dk/vendingmachine/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vendingmachine";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VendingmachinePackage eINSTANCE = example.emf.vendingmachine.impl.VendingmachinePackageImpl.init();

	/**
	 * The meta object id for the '{@link example.emf.vendingmachine.impl.VendingMachineComponentImpl <em>Vending Machine Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see example.emf.vendingmachine.impl.VendingMachineComponentImpl
	 * @see example.emf.vendingmachine.impl.VendingmachinePackageImpl#getVendingMachineComponent()
	 * @generated
	 */
	int VENDING_MACHINE_COMPONENT = 7;

	/**
	 * The number of structural features of the '<em>Vending Machine Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDING_MACHINE_COMPONENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link example.emf.vendingmachine.impl.CoinImpl <em>Coin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see example.emf.vendingmachine.impl.CoinImpl
	 * @see example.emf.vendingmachine.impl.VendingmachinePackageImpl#getCoin()
	 * @generated
	 */
	int COIN = 0;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COIN__SLOT = VENDING_MACHINE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Coin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COIN_FEATURE_COUNT = VENDING_MACHINE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link example.emf.vendingmachine.impl.SlotImpl <em>Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see example.emf.vendingmachine.impl.SlotImpl
	 * @see example.emf.vendingmachine.impl.VendingmachinePackageImpl#getSlot()
	 * @generated
	 */
	int SLOT = 1;

	/**
	 * The feature id for the '<em><b>Coin</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__COIN = VENDING_MACHINE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Safe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__SAFE = VENDING_MACHINE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_FEATURE_COUNT = VENDING_MACHINE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link example.emf.vendingmachine.impl.SafeImpl <em>Safe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see example.emf.vendingmachine.impl.SafeImpl
	 * @see example.emf.vendingmachine.impl.VendingmachinePackageImpl#getSafe()
	 * @generated
	 */
	int SAFE = 2;

	/**
	 * The number of structural features of the '<em>Safe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFE_FEATURE_COUNT = VENDING_MACHINE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link example.emf.vendingmachine.impl.PanelImpl <em>Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see example.emf.vendingmachine.impl.PanelImpl
	 * @see example.emf.vendingmachine.impl.VendingmachinePackageImpl#getPanel()
	 * @generated
	 */
	int PANEL = 3;

	/**
	 * The feature id for the '<em><b>Control</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__CONTROL = VENDING_MACHINE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_FEATURE_COUNT = VENDING_MACHINE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link example.emf.vendingmachine.impl.ControlImpl <em>Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see example.emf.vendingmachine.impl.ControlImpl
	 * @see example.emf.vendingmachine.impl.VendingmachinePackageImpl#getControl()
	 * @generated
	 */
	int CONTROL = 4;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__SLOT = VENDING_MACHINE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Brewer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__BREWER = VENDING_MACHINE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FEATURE_COUNT = VENDING_MACHINE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link example.emf.vendingmachine.impl.BrewerImpl <em>Brewer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see example.emf.vendingmachine.impl.BrewerImpl
	 * @see example.emf.vendingmachine.impl.VendingmachinePackageImpl#getBrewer()
	 * @generated
	 */
	int BREWER = 5;

	/**
	 * The feature id for the '<em><b>Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREWER__CONTROL = VENDING_MACHINE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Brewer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREWER_FEATURE_COUNT = VENDING_MACHINE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link example.emf.vendingmachine.impl.VendingMachineImpl <em>Vending Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see example.emf.vendingmachine.impl.VendingMachineImpl
	 * @see example.emf.vendingmachine.impl.VendingmachinePackageImpl#getVendingMachine()
	 * @generated
	 */
	int VENDING_MACHINE = 6;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDING_MACHINE__COMPONENTS = 0;

	/**
	 * The number of structural features of the '<em>Vending Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDING_MACHINE_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link example.emf.vendingmachine.Coin <em>Coin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coin</em>'.
	 * @see example.emf.vendingmachine.Coin
	 * @generated
	 */
	EClass getCoin();

	/**
	 * Returns the meta object for the reference list '{@link example.emf.vendingmachine.Coin#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Slot</em>'.
	 * @see example.emf.vendingmachine.Coin#getSlot()
	 * @see #getCoin()
	 * @generated
	 */
	EReference getCoin_Slot();

	/**
	 * Returns the meta object for class '{@link example.emf.vendingmachine.Slot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slot</em>'.
	 * @see example.emf.vendingmachine.Slot
	 * @generated
	 */
	EClass getSlot();

	/**
	 * Returns the meta object for the reference list '{@link example.emf.vendingmachine.Slot#getCoin <em>Coin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Coin</em>'.
	 * @see example.emf.vendingmachine.Slot#getCoin()
	 * @see #getSlot()
	 * @generated
	 */
	EReference getSlot_Coin();

	/**
	 * Returns the meta object for the reference '{@link example.emf.vendingmachine.Slot#getSafe <em>Safe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Safe</em>'.
	 * @see example.emf.vendingmachine.Slot#getSafe()
	 * @see #getSlot()
	 * @generated
	 */
	EReference getSlot_Safe();

	/**
	 * Returns the meta object for class '{@link example.emf.vendingmachine.Safe <em>Safe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Safe</em>'.
	 * @see example.emf.vendingmachine.Safe
	 * @generated
	 */
	EClass getSafe();

	/**
	 * Returns the meta object for class '{@link example.emf.vendingmachine.Panel <em>Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Panel</em>'.
	 * @see example.emf.vendingmachine.Panel
	 * @generated
	 */
	EClass getPanel();

	/**
	 * Returns the meta object for the reference list '{@link example.emf.vendingmachine.Panel#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Control</em>'.
	 * @see example.emf.vendingmachine.Panel#getControl()
	 * @see #getPanel()
	 * @generated
	 */
	EReference getPanel_Control();

	/**
	 * Returns the meta object for class '{@link example.emf.vendingmachine.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control</em>'.
	 * @see example.emf.vendingmachine.Control
	 * @generated
	 */
	EClass getControl();

	/**
	 * Returns the meta object for the reference list '{@link example.emf.vendingmachine.Control#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Slot</em>'.
	 * @see example.emf.vendingmachine.Control#getSlot()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_Slot();

	/**
	 * Returns the meta object for the reference list '{@link example.emf.vendingmachine.Control#getBrewer <em>Brewer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Brewer</em>'.
	 * @see example.emf.vendingmachine.Control#getBrewer()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_Brewer();

	/**
	 * Returns the meta object for class '{@link example.emf.vendingmachine.Brewer <em>Brewer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Brewer</em>'.
	 * @see example.emf.vendingmachine.Brewer
	 * @generated
	 */
	EClass getBrewer();

	/**
	 * Returns the meta object for the reference '{@link example.emf.vendingmachine.Brewer#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Control</em>'.
	 * @see example.emf.vendingmachine.Brewer#getControl()
	 * @see #getBrewer()
	 * @generated
	 */
	EReference getBrewer_Control();

	/**
	 * Returns the meta object for class '{@link example.emf.vendingmachine.VendingMachine <em>Vending Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vending Machine</em>'.
	 * @see example.emf.vendingmachine.VendingMachine
	 * @generated
	 */
	EClass getVendingMachine();

	/**
	 * Returns the meta object for the containment reference list '{@link example.emf.vendingmachine.VendingMachine#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see example.emf.vendingmachine.VendingMachine#getComponents()
	 * @see #getVendingMachine()
	 * @generated
	 */
	EReference getVendingMachine_Components();

	/**
	 * Returns the meta object for class '{@link example.emf.vendingmachine.VendingMachineComponent <em>Vending Machine Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vending Machine Component</em>'.
	 * @see example.emf.vendingmachine.VendingMachineComponent
	 * @generated
	 */
	EClass getVendingMachineComponent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VendingmachineFactory getVendingmachineFactory();

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
		 * The meta object literal for the '{@link example.emf.vendingmachine.impl.CoinImpl <em>Coin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see example.emf.vendingmachine.impl.CoinImpl
		 * @see example.emf.vendingmachine.impl.VendingmachinePackageImpl#getCoin()
		 * @generated
		 */
		EClass COIN = eINSTANCE.getCoin();

		/**
		 * The meta object literal for the '<em><b>Slot</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COIN__SLOT = eINSTANCE.getCoin_Slot();

		/**
		 * The meta object literal for the '{@link example.emf.vendingmachine.impl.SlotImpl <em>Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see example.emf.vendingmachine.impl.SlotImpl
		 * @see example.emf.vendingmachine.impl.VendingmachinePackageImpl#getSlot()
		 * @generated
		 */
		EClass SLOT = eINSTANCE.getSlot();

		/**
		 * The meta object literal for the '<em><b>Coin</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOT__COIN = eINSTANCE.getSlot_Coin();

		/**
		 * The meta object literal for the '<em><b>Safe</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOT__SAFE = eINSTANCE.getSlot_Safe();

		/**
		 * The meta object literal for the '{@link example.emf.vendingmachine.impl.SafeImpl <em>Safe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see example.emf.vendingmachine.impl.SafeImpl
		 * @see example.emf.vendingmachine.impl.VendingmachinePackageImpl#getSafe()
		 * @generated
		 */
		EClass SAFE = eINSTANCE.getSafe();

		/**
		 * The meta object literal for the '{@link example.emf.vendingmachine.impl.PanelImpl <em>Panel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see example.emf.vendingmachine.impl.PanelImpl
		 * @see example.emf.vendingmachine.impl.VendingmachinePackageImpl#getPanel()
		 * @generated
		 */
		EClass PANEL = eINSTANCE.getPanel();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PANEL__CONTROL = eINSTANCE.getPanel_Control();

		/**
		 * The meta object literal for the '{@link example.emf.vendingmachine.impl.ControlImpl <em>Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see example.emf.vendingmachine.impl.ControlImpl
		 * @see example.emf.vendingmachine.impl.VendingmachinePackageImpl#getControl()
		 * @generated
		 */
		EClass CONTROL = eINSTANCE.getControl();

		/**
		 * The meta object literal for the '<em><b>Slot</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__SLOT = eINSTANCE.getControl_Slot();

		/**
		 * The meta object literal for the '<em><b>Brewer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__BREWER = eINSTANCE.getControl_Brewer();

		/**
		 * The meta object literal for the '{@link example.emf.vendingmachine.impl.BrewerImpl <em>Brewer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see example.emf.vendingmachine.impl.BrewerImpl
		 * @see example.emf.vendingmachine.impl.VendingmachinePackageImpl#getBrewer()
		 * @generated
		 */
		EClass BREWER = eINSTANCE.getBrewer();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BREWER__CONTROL = eINSTANCE.getBrewer_Control();

		/**
		 * The meta object literal for the '{@link example.emf.vendingmachine.impl.VendingMachineImpl <em>Vending Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see example.emf.vendingmachine.impl.VendingMachineImpl
		 * @see example.emf.vendingmachine.impl.VendingmachinePackageImpl#getVendingMachine()
		 * @generated
		 */
		EClass VENDING_MACHINE = eINSTANCE.getVendingMachine();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VENDING_MACHINE__COMPONENTS = eINSTANCE.getVendingMachine_Components();

		/**
		 * The meta object literal for the '{@link example.emf.vendingmachine.impl.VendingMachineComponentImpl <em>Vending Machine Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see example.emf.vendingmachine.impl.VendingMachineComponentImpl
		 * @see example.emf.vendingmachine.impl.VendingmachinePackageImpl#getVendingMachineComponent()
		 * @generated
		 */
		EClass VENDING_MACHINE_COMPONENT = eINSTANCE.getVendingMachineComponent();

	}

} //VendingmachinePackage

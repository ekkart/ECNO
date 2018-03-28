/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package example.emf.vendingmachinebrewers.util;

import example.emf.vendingmachine.Brewer;
import example.emf.vendingmachine.VendingMachineComponent;

import example.emf.vendingmachinebrewers.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see example.emf.vendingmachinebrewers.VendingmachinebrewersPackage
 * @generated
 */
public class VendingmachinebrewersAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VendingmachinebrewersPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendingmachinebrewersAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = VendingmachinebrewersPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VendingmachinebrewersSwitch<Adapter> modelSwitch =
		new VendingmachinebrewersSwitch<Adapter>() {
			@Override
			public Adapter caseCoffeeBrewer(CoffeeBrewer object) {
				return createCoffeeBrewerAdapter();
			}
			@Override
			public Adapter caseTeaBrewer(TeaBrewer object) {
				return createTeaBrewerAdapter();
			}
			@Override
			public Adapter caseVendingMachineComponent(VendingMachineComponent object) {
				return createVendingMachineComponentAdapter();
			}
			@Override
			public Adapter caseBrewer(Brewer object) {
				return createBrewerAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link example.emf.vendingmachinebrewers.CoffeeBrewer <em>Coffee Brewer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see example.emf.vendingmachinebrewers.CoffeeBrewer
	 * @generated
	 */
	public Adapter createCoffeeBrewerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link example.emf.vendingmachinebrewers.TeaBrewer <em>Tea Brewer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see example.emf.vendingmachinebrewers.TeaBrewer
	 * @generated
	 */
	public Adapter createTeaBrewerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link example.emf.vendingmachine.VendingMachineComponent <em>Vending Machine Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see example.emf.vendingmachine.VendingMachineComponent
	 * @generated
	 */
	public Adapter createVendingMachineComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link example.emf.vendingmachine.Brewer <em>Brewer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see example.emf.vendingmachine.Brewer
	 * @generated
	 */
	public Adapter createBrewerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //VendingmachinebrewersAdapterFactory

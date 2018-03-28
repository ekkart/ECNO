/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package example.emf.vendingmachinebrewers.impl;

import example.emf.vendingmachinebrewers.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VendingmachinebrewersFactoryImpl extends EFactoryImpl implements VendingmachinebrewersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VendingmachinebrewersFactory init() {
		try {
			VendingmachinebrewersFactory theVendingmachinebrewersFactory = (VendingmachinebrewersFactory)EPackage.Registry.INSTANCE.getEFactory("http://se.imm.dtu.dk/vendingmachine/brewers/1.0"); 
			if (theVendingmachinebrewersFactory != null) {
				return theVendingmachinebrewersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VendingmachinebrewersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendingmachinebrewersFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case VendingmachinebrewersPackage.COFFEE_BREWER: return createCoffeeBrewer();
			case VendingmachinebrewersPackage.TEA_BREWER: return createTeaBrewer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoffeeBrewer createCoffeeBrewer() {
		CoffeeBrewerImpl coffeeBrewer = new CoffeeBrewerImpl();
		return coffeeBrewer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeaBrewer createTeaBrewer() {
		TeaBrewerImpl teaBrewer = new TeaBrewerImpl();
		return teaBrewer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendingmachinebrewersPackage getVendingmachinebrewersPackage() {
		return (VendingmachinebrewersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VendingmachinebrewersPackage getPackage() {
		return VendingmachinebrewersPackage.eINSTANCE;
	}

} //VendingmachinebrewersFactoryImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package emf.bankingsystem.util;

import dk.dtu.compute.se.ecno.statespace.Element;
import emf.bankingsystem.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see emf.bankingsystem.BankingsystemPackage
 * @generated
 */
public class BankingsystemAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BankingsystemPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankingsystemAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BankingsystemPackage.eINSTANCE;
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
	protected BankingsystemSwitch<Adapter> modelSwitch =
		new BankingsystemSwitch<Adapter>() {
			@Override
			public Adapter caseNaturalPerson(NaturalPerson object) {
				return createNaturalPersonAdapter();
			}
			@Override
			public Adapter casePhysicalBankCard(PhysicalBankCard object) {
				return createPhysicalBankCardAdapter();
			}
			@Override
			public Adapter caseBankNote(BankNote object) {
				return createBankNoteAdapter();
			}
			@Override
			public Adapter caseHW(HW object) {
				return createHWAdapter();
			}
			@Override
			public Adapter caseATMController(ATMController object) {
				return createATMControllerAdapter();
			}
			@Override
			public Adapter caseBankGateway(BankGateway object) {
				return createBankGatewayAdapter();
			}
			@Override
			public Adapter caseSwiftNetwork(SwiftNetwork object) {
				return createSwiftNetworkAdapter();
			}
			@Override
			public Adapter caseAccountMngr(AccountMngr object) {
				return createAccountMngrAdapter();
			}
			@Override
			public Adapter caseAccount(Account object) {
				return createAccountAdapter();
			}
			@Override
			public Adapter caseBankCard(BankCard object) {
				return createBankCardAdapter();
			}
			@Override
			public Adapter caseCustomer(Customer object) {
				return createCustomerAdapter();
			}
			@Override
			public Adapter caseSession(Session object) {
				return createSessionAdapter();
			}
			@Override
			public Adapter caseSetting(Setting object) {
				return createSettingAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link emf.bankingsystem.NaturalPerson <em>Natural Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.bankingsystem.NaturalPerson
	 * @generated
	 */
	public Adapter createNaturalPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.bankingsystem.PhysicalBankCard <em>Physical Bank Card</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.bankingsystem.PhysicalBankCard
	 * @generated
	 */
	public Adapter createPhysicalBankCardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.bankingsystem.BankNote <em>Bank Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.bankingsystem.BankNote
	 * @generated
	 */
	public Adapter createBankNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.bankingsystem.HW <em>HW</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.bankingsystem.HW
	 * @generated
	 */
	public Adapter createHWAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.bankingsystem.ATMController <em>ATM Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.bankingsystem.ATMController
	 * @generated
	 */
	public Adapter createATMControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.bankingsystem.BankGateway <em>Bank Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.bankingsystem.BankGateway
	 * @generated
	 */
	public Adapter createBankGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.bankingsystem.SwiftNetwork <em>Swift Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.bankingsystem.SwiftNetwork
	 * @generated
	 */
	public Adapter createSwiftNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.bankingsystem.AccountMngr <em>Account Mngr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.bankingsystem.AccountMngr
	 * @generated
	 */
	public Adapter createAccountMngrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.bankingsystem.Account <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.bankingsystem.Account
	 * @generated
	 */
	public Adapter createAccountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.bankingsystem.BankCard <em>Bank Card</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.bankingsystem.BankCard
	 * @generated
	 */
	public Adapter createBankCardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.bankingsystem.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.bankingsystem.Customer
	 * @generated
	 */
	public Adapter createCustomerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.bankingsystem.Session <em>Session</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.bankingsystem.Session
	 * @generated
	 */
	public Adapter createSessionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.bankingsystem.Setting <em>Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.bankingsystem.Setting
	 * @generated
	 */
	public Adapter createSettingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link emf.bankingsystem.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see emf.bankingsystem.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.compute.se.ecno.statespace.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.compute.se.ecno.statespace.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
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

} //BankingsystemAdapterFactory

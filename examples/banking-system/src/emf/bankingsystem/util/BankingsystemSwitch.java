/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package emf.bankingsystem.util;

import dk.dtu.compute.se.ecno.statespace.Element;
import emf.bankingsystem.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see emf.bankingsystem.BankingsystemPackage
 * @generated
 */
public class BankingsystemSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BankingsystemPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankingsystemSwitch() {
		if (modelPackage == null) {
			modelPackage = BankingsystemPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BankingsystemPackage.NATURAL_PERSON: {
				NaturalPerson naturalPerson = (NaturalPerson)theEObject;
				T result = caseNaturalPerson(naturalPerson);
				if (result == null) result = caseComponent(naturalPerson);
				if (result == null) result = caseElement(naturalPerson);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BankingsystemPackage.PHYSICAL_BANK_CARD: {
				PhysicalBankCard physicalBankCard = (PhysicalBankCard)theEObject;
				T result = casePhysicalBankCard(physicalBankCard);
				if (result == null) result = caseComponent(physicalBankCard);
				if (result == null) result = caseElement(physicalBankCard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BankingsystemPackage.BANK_NOTE: {
				BankNote bankNote = (BankNote)theEObject;
				T result = caseBankNote(bankNote);
				if (result == null) result = caseComponent(bankNote);
				if (result == null) result = caseElement(bankNote);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BankingsystemPackage.HW: {
				HW hw = (HW)theEObject;
				T result = caseHW(hw);
				if (result == null) result = caseComponent(hw);
				if (result == null) result = caseElement(hw);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BankingsystemPackage.ATM_CONTROLLER: {
				ATMController atmController = (ATMController)theEObject;
				T result = caseATMController(atmController);
				if (result == null) result = caseComponent(atmController);
				if (result == null) result = caseElement(atmController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BankingsystemPackage.BANK_GATEWAY: {
				BankGateway bankGateway = (BankGateway)theEObject;
				T result = caseBankGateway(bankGateway);
				if (result == null) result = caseComponent(bankGateway);
				if (result == null) result = caseElement(bankGateway);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BankingsystemPackage.SWIFT_NETWORK: {
				SwiftNetwork swiftNetwork = (SwiftNetwork)theEObject;
				T result = caseSwiftNetwork(swiftNetwork);
				if (result == null) result = caseComponent(swiftNetwork);
				if (result == null) result = caseElement(swiftNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BankingsystemPackage.ACCOUNT_MNGR: {
				AccountMngr accountMngr = (AccountMngr)theEObject;
				T result = caseAccountMngr(accountMngr);
				if (result == null) result = caseComponent(accountMngr);
				if (result == null) result = caseElement(accountMngr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BankingsystemPackage.ACCOUNT: {
				Account account = (Account)theEObject;
				T result = caseAccount(account);
				if (result == null) result = caseComponent(account);
				if (result == null) result = caseElement(account);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BankingsystemPackage.BANK_CARD: {
				BankCard bankCard = (BankCard)theEObject;
				T result = caseBankCard(bankCard);
				if (result == null) result = caseComponent(bankCard);
				if (result == null) result = caseElement(bankCard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BankingsystemPackage.CUSTOMER: {
				Customer customer = (Customer)theEObject;
				T result = caseCustomer(customer);
				if (result == null) result = caseComponent(customer);
				if (result == null) result = caseElement(customer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BankingsystemPackage.SESSION: {
				Session session = (Session)theEObject;
				T result = caseSession(session);
				if (result == null) result = caseComponent(session);
				if (result == null) result = caseElement(session);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BankingsystemPackage.SETTING: {
				Setting setting = (Setting)theEObject;
				T result = caseSetting(setting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BankingsystemPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = caseElement(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Natural Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Natural Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNaturalPerson(NaturalPerson object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Bank Card</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Bank Card</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalBankCard(PhysicalBankCard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bank Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bank Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBankNote(BankNote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HW</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HW</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHW(HW object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATM Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATM Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATMController(ATMController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bank Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bank Gateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBankGateway(BankGateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Swift Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Swift Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwiftNetwork(SwiftNetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Account Mngr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Account Mngr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccountMngr(AccountMngr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Account</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Account</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccount(Account object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bank Card</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bank Card</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBankCard(BankCard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomer(Customer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Session</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Session</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSession(Session object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Setting</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Setting</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetting(Setting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BankingsystemSwitch

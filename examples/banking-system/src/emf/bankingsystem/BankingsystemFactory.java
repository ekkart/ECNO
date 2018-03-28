/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package emf.bankingsystem;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see emf.bankingsystem.BankingsystemPackage
 * @generated
 */
public interface BankingsystemFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BankingsystemFactory eINSTANCE = emf.bankingsystem.impl.BankingsystemFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Natural Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Natural Person</em>'.
	 * @generated
	 */
	NaturalPerson createNaturalPerson();

	/**
	 * Returns a new object of class '<em>Physical Bank Card</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Bank Card</em>'.
	 * @generated
	 */
	PhysicalBankCard createPhysicalBankCard();

	/**
	 * Returns a new object of class '<em>Bank Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bank Note</em>'.
	 * @generated
	 */
	BankNote createBankNote();

	/**
	 * Returns a new object of class '<em>HW</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HW</em>'.
	 * @generated
	 */
	HW createHW();

	/**
	 * Returns a new object of class '<em>ATM Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ATM Controller</em>'.
	 * @generated
	 */
	ATMController createATMController();

	/**
	 * Returns a new object of class '<em>Bank Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bank Gateway</em>'.
	 * @generated
	 */
	BankGateway createBankGateway();

	/**
	 * Returns a new object of class '<em>Swift Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Swift Network</em>'.
	 * @generated
	 */
	SwiftNetwork createSwiftNetwork();

	/**
	 * Returns a new object of class '<em>Account Mngr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Account Mngr</em>'.
	 * @generated
	 */
	AccountMngr createAccountMngr();

	/**
	 * Returns a new object of class '<em>Account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Account</em>'.
	 * @generated
	 */
	Account createAccount();

	/**
	 * Returns a new object of class '<em>Bank Card</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bank Card</em>'.
	 * @generated
	 */
	BankCard createBankCard();

	/**
	 * Returns a new object of class '<em>Customer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer</em>'.
	 * @generated
	 */
	Customer createCustomer();

	/**
	 * Returns a new object of class '<em>Session</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Session</em>'.
	 * @generated
	 */
	Session createSession();

	/**
	 * Returns a new object of class '<em>Setting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Setting</em>'.
	 * @generated
	 */
	Setting createSetting();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BankingsystemPackage getBankingsystemPackage();

} //BankingsystemFactory

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package emf.bankingsystem.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import emf.bankingsystem.ATMController;
import emf.bankingsystem.Account;
import emf.bankingsystem.AccountMngr;
import emf.bankingsystem.BankCard;
import emf.bankingsystem.BankGateway;
import emf.bankingsystem.BankNote;
import emf.bankingsystem.BankingsystemFactory;
import emf.bankingsystem.BankingsystemPackage;
import emf.bankingsystem.Component;
import emf.bankingsystem.Customer;
import emf.bankingsystem.HW;
import emf.bankingsystem.NaturalPerson;
import emf.bankingsystem.PhysicalBankCard;
import emf.bankingsystem.Session;
import emf.bankingsystem.Setting;
import emf.bankingsystem.SwiftNetwork;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BankingsystemFactoryImpl extends EFactoryImpl implements BankingsystemFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BankingsystemFactory init() {
		try {
			BankingsystemFactory theBankingsystemFactory = (BankingsystemFactory)EPackage.Registry.INSTANCE.getEFactory("http://bankingsystem/1.0"); 
			if (theBankingsystemFactory != null) {
				return theBankingsystemFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BankingsystemFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankingsystemFactoryImpl() {
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
			case BankingsystemPackage.NATURAL_PERSON: return createNaturalPerson();
			case BankingsystemPackage.PHYSICAL_BANK_CARD: return createPhysicalBankCard();
			case BankingsystemPackage.BANK_NOTE: return createBankNote();
			case BankingsystemPackage.HW: return createHW();
			case BankingsystemPackage.ATM_CONTROLLER: return createATMController();
			case BankingsystemPackage.BANK_GATEWAY: return createBankGateway();
			case BankingsystemPackage.SWIFT_NETWORK: return createSwiftNetwork();
			case BankingsystemPackage.ACCOUNT_MNGR: return createAccountMngr();
			case BankingsystemPackage.ACCOUNT: return createAccount();
			case BankingsystemPackage.BANK_CARD: return createBankCard();
			case BankingsystemPackage.CUSTOMER: return createCustomer();
			case BankingsystemPackage.SESSION: return createSession();
			case BankingsystemPackage.SETTING: return createSetting();
			case BankingsystemPackage.COMPONENT: return createComponent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NaturalPerson createNaturalPerson() {
		NaturalPersonImpl naturalPerson = new NaturalPersonImpl();
		return naturalPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalBankCard createPhysicalBankCard() {
		PhysicalBankCardImpl physicalBankCard = new PhysicalBankCardImpl();
		return physicalBankCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankNote createBankNote() {
		BankNoteImpl bankNote = new BankNoteImpl();
		return bankNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HW createHW() {
		HWImpl hw = new HWImpl();
		return hw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATMController createATMController() {
		ATMControllerImpl atmController = new ATMControllerImpl();
		return atmController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankGateway createBankGateway() {
		BankGatewayImpl bankGateway = new BankGatewayImpl();
		return bankGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwiftNetwork createSwiftNetwork() {
		SwiftNetworkImpl swiftNetwork = new SwiftNetworkImpl();
		return swiftNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountMngr createAccountMngr() {
		AccountMngrImpl accountMngr = new AccountMngrImpl();
		return accountMngr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Account createAccount() {
		AccountImpl account = new AccountImpl();
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankCard createBankCard() {
		BankCardImpl bankCard = new BankCardImpl();
		return bankCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer createCustomer() {
		CustomerImpl customer = new CustomerImpl();
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Session createSession() {
		SessionImpl session = new SessionImpl();
		return session;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Setting createSetting() {
		SettingImpl setting = new SettingImpl();
		return setting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankingsystemPackage getBankingsystemPackage() {
		return (BankingsystemPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BankingsystemPackage getPackage() {
		return BankingsystemPackage.eINSTANCE;
	}

} //BankingsystemFactoryImpl

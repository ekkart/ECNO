/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package emf.bankingsystem;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import dk.dtu.compute.se.ecno.statespace.StatespacePackage;

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
 * @see emf.bankingsystem.BankingsystemFactory
 * @model kind="package"
 * @generated
 */
public interface BankingsystemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bankingsystem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bankingsystem/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bankingsystem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BankingsystemPackage eINSTANCE = emf.bankingsystem.impl.BankingsystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link emf.bankingsystem.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.bankingsystem.impl.ComponentImpl
	 * @see emf.bankingsystem.impl.BankingsystemPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 13;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__UID = StatespacePackage.ELEMENT__UID;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = StatespacePackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link emf.bankingsystem.impl.NaturalPersonImpl <em>Natural Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.bankingsystem.impl.NaturalPersonImpl
	 * @see emf.bankingsystem.impl.BankingsystemPackageImpl#getNaturalPerson()
	 * @generated
	 */
	int NATURAL_PERSON = 0;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_PERSON__UID = COMPONENT__UID;

	/**
	 * The feature id for the '<em><b>Available Cards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_PERSON__AVAILABLE_CARDS = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_PERSON__USES = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_PERSON__OWNS = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_PERSON__NAME = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Natural Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_PERSON_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link emf.bankingsystem.impl.PhysicalBankCardImpl <em>Physical Bank Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.bankingsystem.impl.PhysicalBankCardImpl
	 * @see emf.bankingsystem.impl.BankingsystemPackageImpl#getPhysicalBankCard()
	 * @generated
	 */
	int PHYSICAL_BANK_CARD = 1;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_BANK_CARD__UID = COMPONENT__UID;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_BANK_CARD__NUMBER = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_BANK_CARD__PIN = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Issuer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_BANK_CARD__ISSUER = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_BANK_CARD__OWNER = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Physical Bank Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_BANK_CARD_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link emf.bankingsystem.impl.BankNoteImpl <em>Bank Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.bankingsystem.impl.BankNoteImpl
	 * @see emf.bankingsystem.impl.BankingsystemPackageImpl#getBankNote()
	 * @generated
	 */
	int BANK_NOTE = 2;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_NOTE__UID = COMPONENT__UID;

	/**
	 * The number of structural features of the '<em>Bank Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_NOTE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link emf.bankingsystem.impl.HWImpl <em>HW</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.bankingsystem.impl.HWImpl
	 * @see emf.bankingsystem.impl.BankingsystemPackageImpl#getHW()
	 * @generated
	 */
	int HW = 3;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW__UID = COMPONENT__UID;

	/**
	 * The feature id for the '<em><b>Inserted</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW__INSERTED = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Held</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW__HELD = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW__NOTES = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ready</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW__READY = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW__CONTROLLER = COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Show</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW__SHOW = COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>HW</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link emf.bankingsystem.impl.ATMControllerImpl <em>ATM Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.bankingsystem.impl.ATMControllerImpl
	 * @see emf.bankingsystem.impl.BankingsystemPackageImpl#getATMController()
	 * @generated
	 */
	int ATM_CONTROLLER = 4;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATM_CONTROLLER__UID = COMPONENT__UID;

	/**
	 * The feature id for the '<em><b>Hw</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATM_CONTROLLER__HW = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gateway</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATM_CONTROLLER__GATEWAY = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATM_CONTROLLER__SESSION = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>ATM Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATM_CONTROLLER_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link emf.bankingsystem.impl.BankGatewayImpl <em>Bank Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.bankingsystem.impl.BankGatewayImpl
	 * @see emf.bankingsystem.impl.BankingsystemPackageImpl#getBankGateway()
	 * @generated
	 */
	int BANK_GATEWAY = 5;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_GATEWAY__UID = COMPONENT__UID;

	/**
	 * The feature id for the '<em><b>AT Ms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_GATEWAY__AT_MS = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Account Mngrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_GATEWAY__ACCOUNT_MNGRS = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Swift</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_GATEWAY__SWIFT = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Bank Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_GATEWAY_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link emf.bankingsystem.impl.SwiftNetworkImpl <em>Swift Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.bankingsystem.impl.SwiftNetworkImpl
	 * @see emf.bankingsystem.impl.BankingsystemPackageImpl#getSwiftNetwork()
	 * @generated
	 */
	int SWIFT_NETWORK = 6;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIFT_NETWORK__UID = COMPONENT__UID;

	/**
	 * The feature id for the '<em><b>Gateways</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIFT_NETWORK__GATEWAYS = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Swift Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIFT_NETWORK_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link emf.bankingsystem.impl.AccountMngrImpl <em>Account Mngr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.bankingsystem.impl.AccountMngrImpl
	 * @see emf.bankingsystem.impl.BankingsystemPackageImpl#getAccountMngr()
	 * @generated
	 */
	int ACCOUNT_MNGR = 7;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_MNGR__UID = COMPONENT__UID;

	/**
	 * The feature id for the '<em><b>Customers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_MNGR__CUSTOMERS = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Accounts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_MNGR__ACCOUNTS = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gateway</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_MNGR__GATEWAY = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sessions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_MNGR__SESSIONS = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Idle Sessions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_MNGR__IDLE_SESSIONS = COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Account Mngr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_MNGR_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link emf.bankingsystem.impl.AccountImpl <em>Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.bankingsystem.impl.AccountImpl
	 * @see emf.bankingsystem.impl.BankingsystemPackageImpl#getAccount()
	 * @generated
	 */
	int ACCOUNT = 8;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__UID = COMPONENT__UID;

	/**
	 * The feature id for the '<em><b>Cards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__CARDS = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__HOLDER = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__BALANCE = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link emf.bankingsystem.impl.BankCardImpl <em>Bank Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.bankingsystem.impl.BankCardImpl
	 * @see emf.bankingsystem.impl.BankingsystemPackageImpl#getBankCard()
	 * @generated
	 */
	int BANK_CARD = 9;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_CARD__UID = COMPONENT__UID;

	/**
	 * The feature id for the '<em><b>Account</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_CARD__ACCOUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_CARD__OWNER = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Numer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_CARD__NUMER = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Physical</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_CARD__PHYSICAL = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Bank Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_CARD_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link emf.bankingsystem.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.bankingsystem.impl.CustomerImpl
	 * @see emf.bankingsystem.impl.BankingsystemPackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 10;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__UID = COMPONENT__UID;

	/**
	 * The feature id for the '<em><b>Accounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ACCOUNTS = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Natural</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__NATURAL = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ID = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__NAME = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link emf.bankingsystem.impl.SessionImpl <em>Session</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.bankingsystem.impl.SessionImpl
	 * @see emf.bankingsystem.impl.BankingsystemPackageImpl#getSession()
	 * @generated
	 */
	int SESSION = 11;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__UID = COMPONENT__UID;

	/**
	 * The feature id for the '<em><b>Card</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__CARD = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ATM</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__ATM = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__OWNER = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__ACCOUNT = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link emf.bankingsystem.impl.SettingImpl <em>Setting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.bankingsystem.impl.SettingImpl
	 * @see emf.bankingsystem.impl.BankingsystemPackageImpl#getSetting()
	 * @generated
	 */
	int SETTING = 12;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING__OBJECTS = 0;

	/**
	 * The number of structural features of the '<em>Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link emf.bankingsystem.NaturalPerson <em>Natural Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Natural Person</em>'.
	 * @see emf.bankingsystem.NaturalPerson
	 * @generated
	 */
	EClass getNaturalPerson();

	/**
	 * Returns the meta object for the containment reference list '{@link emf.bankingsystem.NaturalPerson#getAvailableCards <em>Available Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Available Cards</em>'.
	 * @see emf.bankingsystem.NaturalPerson#getAvailableCards()
	 * @see #getNaturalPerson()
	 * @generated
	 */
	EReference getNaturalPerson_AvailableCards();

	/**
	 * Returns the meta object for the reference list '{@link emf.bankingsystem.NaturalPerson#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses</em>'.
	 * @see emf.bankingsystem.NaturalPerson#getUses()
	 * @see #getNaturalPerson()
	 * @generated
	 */
	EReference getNaturalPerson_Uses();

	/**
	 * Returns the meta object for the containment reference list '{@link emf.bankingsystem.NaturalPerson#getOwns <em>Owns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owns</em>'.
	 * @see emf.bankingsystem.NaturalPerson#getOwns()
	 * @see #getNaturalPerson()
	 * @generated
	 */
	EReference getNaturalPerson_Owns();

	/**
	 * Returns the meta object for the attribute '{@link emf.bankingsystem.NaturalPerson#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see emf.bankingsystem.NaturalPerson#getName()
	 * @see #getNaturalPerson()
	 * @generated
	 */
	EAttribute getNaturalPerson_Name();

	/**
	 * Returns the meta object for class '{@link emf.bankingsystem.PhysicalBankCard <em>Physical Bank Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Bank Card</em>'.
	 * @see emf.bankingsystem.PhysicalBankCard
	 * @generated
	 */
	EClass getPhysicalBankCard();

	/**
	 * Returns the meta object for the attribute '{@link emf.bankingsystem.PhysicalBankCard#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see emf.bankingsystem.PhysicalBankCard#getNumber()
	 * @see #getPhysicalBankCard()
	 * @generated
	 */
	EAttribute getPhysicalBankCard_Number();

	/**
	 * Returns the meta object for the attribute '{@link emf.bankingsystem.PhysicalBankCard#getPin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin</em>'.
	 * @see emf.bankingsystem.PhysicalBankCard#getPin()
	 * @see #getPhysicalBankCard()
	 * @generated
	 */
	EAttribute getPhysicalBankCard_Pin();

	/**
	 * Returns the meta object for the reference '{@link emf.bankingsystem.PhysicalBankCard#getIssuer <em>Issuer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Issuer</em>'.
	 * @see emf.bankingsystem.PhysicalBankCard#getIssuer()
	 * @see #getPhysicalBankCard()
	 * @generated
	 */
	EReference getPhysicalBankCard_Issuer();

	/**
	 * Returns the meta object for the container reference '{@link emf.bankingsystem.PhysicalBankCard#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see emf.bankingsystem.PhysicalBankCard#getOwner()
	 * @see #getPhysicalBankCard()
	 * @generated
	 */
	EReference getPhysicalBankCard_Owner();

	/**
	 * Returns the meta object for class '{@link emf.bankingsystem.BankNote <em>Bank Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bank Note</em>'.
	 * @see emf.bankingsystem.BankNote
	 * @generated
	 */
	EClass getBankNote();

	/**
	 * Returns the meta object for class '{@link emf.bankingsystem.HW <em>HW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HW</em>'.
	 * @see emf.bankingsystem.HW
	 * @generated
	 */
	EClass getHW();

	/**
	 * Returns the meta object for the containment reference '{@link emf.bankingsystem.HW#getInserted <em>Inserted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inserted</em>'.
	 * @see emf.bankingsystem.HW#getInserted()
	 * @see #getHW()
	 * @generated
	 */
	EReference getHW_Inserted();

	/**
	 * Returns the meta object for the containment reference list '{@link emf.bankingsystem.HW#getHeld <em>Held</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Held</em>'.
	 * @see emf.bankingsystem.HW#getHeld()
	 * @see #getHW()
	 * @generated
	 */
	EReference getHW_Held();

	/**
	 * Returns the meta object for the containment reference list '{@link emf.bankingsystem.HW#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Notes</em>'.
	 * @see emf.bankingsystem.HW#getNotes()
	 * @see #getHW()
	 * @generated
	 */
	EReference getHW_Notes();

	/**
	 * Returns the meta object for the containment reference list '{@link emf.bankingsystem.HW#getReady <em>Ready</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ready</em>'.
	 * @see emf.bankingsystem.HW#getReady()
	 * @see #getHW()
	 * @generated
	 */
	EReference getHW_Ready();

	/**
	 * Returns the meta object for the reference '{@link emf.bankingsystem.HW#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controller</em>'.
	 * @see emf.bankingsystem.HW#getController()
	 * @see #getHW()
	 * @generated
	 */
	EReference getHW_Controller();

	/**
	 * Returns the meta object for the containment reference '{@link emf.bankingsystem.HW#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Show</em>'.
	 * @see emf.bankingsystem.HW#getShow()
	 * @see #getHW()
	 * @generated
	 */
	EReference getHW_Show();

	/**
	 * Returns the meta object for class '{@link emf.bankingsystem.ATMController <em>ATM Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATM Controller</em>'.
	 * @see emf.bankingsystem.ATMController
	 * @generated
	 */
	EClass getATMController();

	/**
	 * Returns the meta object for the reference '{@link emf.bankingsystem.ATMController#getHw <em>Hw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hw</em>'.
	 * @see emf.bankingsystem.ATMController#getHw()
	 * @see #getATMController()
	 * @generated
	 */
	EReference getATMController_Hw();

	/**
	 * Returns the meta object for the reference '{@link emf.bankingsystem.ATMController#getGateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gateway</em>'.
	 * @see emf.bankingsystem.ATMController#getGateway()
	 * @see #getATMController()
	 * @generated
	 */
	EReference getATMController_Gateway();

	/**
	 * Returns the meta object for the reference '{@link emf.bankingsystem.ATMController#getSession <em>Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Session</em>'.
	 * @see emf.bankingsystem.ATMController#getSession()
	 * @see #getATMController()
	 * @generated
	 */
	EReference getATMController_Session();

	/**
	 * Returns the meta object for class '{@link emf.bankingsystem.BankGateway <em>Bank Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bank Gateway</em>'.
	 * @see emf.bankingsystem.BankGateway
	 * @generated
	 */
	EClass getBankGateway();

	/**
	 * Returns the meta object for the reference list '{@link emf.bankingsystem.BankGateway#getATMs <em>AT Ms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>AT Ms</em>'.
	 * @see emf.bankingsystem.BankGateway#getATMs()
	 * @see #getBankGateway()
	 * @generated
	 */
	EReference getBankGateway_ATMs();

	/**
	 * Returns the meta object for the reference list '{@link emf.bankingsystem.BankGateway#getAccountMngrs <em>Account Mngrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Account Mngrs</em>'.
	 * @see emf.bankingsystem.BankGateway#getAccountMngrs()
	 * @see #getBankGateway()
	 * @generated
	 */
	EReference getBankGateway_AccountMngrs();

	/**
	 * Returns the meta object for the reference '{@link emf.bankingsystem.BankGateway#getSwift <em>Swift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Swift</em>'.
	 * @see emf.bankingsystem.BankGateway#getSwift()
	 * @see #getBankGateway()
	 * @generated
	 */
	EReference getBankGateway_Swift();

	/**
	 * Returns the meta object for class '{@link emf.bankingsystem.SwiftNetwork <em>Swift Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Swift Network</em>'.
	 * @see emf.bankingsystem.SwiftNetwork
	 * @generated
	 */
	EClass getSwiftNetwork();

	/**
	 * Returns the meta object for the reference list '{@link emf.bankingsystem.SwiftNetwork#getGateways <em>Gateways</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gateways</em>'.
	 * @see emf.bankingsystem.SwiftNetwork#getGateways()
	 * @see #getSwiftNetwork()
	 * @generated
	 */
	EReference getSwiftNetwork_Gateways();

	/**
	 * Returns the meta object for class '{@link emf.bankingsystem.AccountMngr <em>Account Mngr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Account Mngr</em>'.
	 * @see emf.bankingsystem.AccountMngr
	 * @generated
	 */
	EClass getAccountMngr();

	/**
	 * Returns the meta object for the containment reference list '{@link emf.bankingsystem.AccountMngr#getCustomers <em>Customers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Customers</em>'.
	 * @see emf.bankingsystem.AccountMngr#getCustomers()
	 * @see #getAccountMngr()
	 * @generated
	 */
	EReference getAccountMngr_Customers();

	/**
	 * Returns the meta object for the containment reference list '{@link emf.bankingsystem.AccountMngr#getAccounts <em>Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Accounts</em>'.
	 * @see emf.bankingsystem.AccountMngr#getAccounts()
	 * @see #getAccountMngr()
	 * @generated
	 */
	EReference getAccountMngr_Accounts();

	/**
	 * Returns the meta object for the reference '{@link emf.bankingsystem.AccountMngr#getGateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gateway</em>'.
	 * @see emf.bankingsystem.AccountMngr#getGateway()
	 * @see #getAccountMngr()
	 * @generated
	 */
	EReference getAccountMngr_Gateway();

	/**
	 * Returns the meta object for the containment reference list '{@link emf.bankingsystem.AccountMngr#getSessions <em>Sessions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sessions</em>'.
	 * @see emf.bankingsystem.AccountMngr#getSessions()
	 * @see #getAccountMngr()
	 * @generated
	 */
	EReference getAccountMngr_Sessions();

	/**
	 * Returns the meta object for the containment reference list '{@link emf.bankingsystem.AccountMngr#getIdleSessions <em>Idle Sessions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Idle Sessions</em>'.
	 * @see emf.bankingsystem.AccountMngr#getIdleSessions()
	 * @see #getAccountMngr()
	 * @generated
	 */
	EReference getAccountMngr_IdleSessions();

	/**
	 * Returns the meta object for class '{@link emf.bankingsystem.Account <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Account</em>'.
	 * @see emf.bankingsystem.Account
	 * @generated
	 */
	EClass getAccount();

	/**
	 * Returns the meta object for the containment reference list '{@link emf.bankingsystem.Account#getCards <em>Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cards</em>'.
	 * @see emf.bankingsystem.Account#getCards()
	 * @see #getAccount()
	 * @generated
	 */
	EReference getAccount_Cards();

	/**
	 * Returns the meta object for the reference list '{@link emf.bankingsystem.Account#getHolder <em>Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Holder</em>'.
	 * @see emf.bankingsystem.Account#getHolder()
	 * @see #getAccount()
	 * @generated
	 */
	EReference getAccount_Holder();

	/**
	 * Returns the meta object for the attribute '{@link emf.bankingsystem.Account#getBalance <em>Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Balance</em>'.
	 * @see emf.bankingsystem.Account#getBalance()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_Balance();

	/**
	 * Returns the meta object for class '{@link emf.bankingsystem.BankCard <em>Bank Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bank Card</em>'.
	 * @see emf.bankingsystem.BankCard
	 * @generated
	 */
	EClass getBankCard();

	/**
	 * Returns the meta object for the container reference '{@link emf.bankingsystem.BankCard#getAccount <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Account</em>'.
	 * @see emf.bankingsystem.BankCard#getAccount()
	 * @see #getBankCard()
	 * @generated
	 */
	EReference getBankCard_Account();

	/**
	 * Returns the meta object for the reference '{@link emf.bankingsystem.BankCard#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see emf.bankingsystem.BankCard#getOwner()
	 * @see #getBankCard()
	 * @generated
	 */
	EReference getBankCard_Owner();

	/**
	 * Returns the meta object for the attribute '{@link emf.bankingsystem.BankCard#getNumer <em>Numer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numer</em>'.
	 * @see emf.bankingsystem.BankCard#getNumer()
	 * @see #getBankCard()
	 * @generated
	 */
	EAttribute getBankCard_Numer();

	/**
	 * Returns the meta object for the reference '{@link emf.bankingsystem.BankCard#getPhysical <em>Physical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Physical</em>'.
	 * @see emf.bankingsystem.BankCard#getPhysical()
	 * @see #getBankCard()
	 * @generated
	 */
	EReference getBankCard_Physical();

	/**
	 * Returns the meta object for class '{@link emf.bankingsystem.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see emf.bankingsystem.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the reference list '{@link emf.bankingsystem.Customer#getAccounts <em>Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accounts</em>'.
	 * @see emf.bankingsystem.Customer#getAccounts()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Accounts();

	/**
	 * Returns the meta object for the reference '{@link emf.bankingsystem.Customer#getNatural <em>Natural</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Natural</em>'.
	 * @see emf.bankingsystem.Customer#getNatural()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Natural();

	/**
	 * Returns the meta object for the attribute '{@link emf.bankingsystem.Customer#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see emf.bankingsystem.Customer#getId()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Id();

	/**
	 * Returns the meta object for the attribute '{@link emf.bankingsystem.Customer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see emf.bankingsystem.Customer#getName()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Name();

	/**
	 * Returns the meta object for class '{@link emf.bankingsystem.Session <em>Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Session</em>'.
	 * @see emf.bankingsystem.Session
	 * @generated
	 */
	EClass getSession();

	/**
	 * Returns the meta object for the reference '{@link emf.bankingsystem.Session#getCard <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Card</em>'.
	 * @see emf.bankingsystem.Session#getCard()
	 * @see #getSession()
	 * @generated
	 */
	EReference getSession_Card();

	/**
	 * Returns the meta object for the reference '{@link emf.bankingsystem.Session#getATM <em>ATM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>ATM</em>'.
	 * @see emf.bankingsystem.Session#getATM()
	 * @see #getSession()
	 * @generated
	 */
	EReference getSession_ATM();

	/**
	 * Returns the meta object for the container reference '{@link emf.bankingsystem.Session#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see emf.bankingsystem.Session#getOwner()
	 * @see #getSession()
	 * @generated
	 */
	EReference getSession_Owner();

	/**
	 * Returns the meta object for the reference '{@link emf.bankingsystem.Session#getAccount <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Account</em>'.
	 * @see emf.bankingsystem.Session#getAccount()
	 * @see #getSession()
	 * @generated
	 */
	EReference getSession_Account();

	/**
	 * Returns the meta object for class '{@link emf.bankingsystem.Setting <em>Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setting</em>'.
	 * @see emf.bankingsystem.Setting
	 * @generated
	 */
	EClass getSetting();

	/**
	 * Returns the meta object for the containment reference list '{@link emf.bankingsystem.Setting#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objects</em>'.
	 * @see emf.bankingsystem.Setting#getObjects()
	 * @see #getSetting()
	 * @generated
	 */
	EReference getSetting_Objects();

	/**
	 * Returns the meta object for class '{@link emf.bankingsystem.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see emf.bankingsystem.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BankingsystemFactory getBankingsystemFactory();

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
		 * The meta object literal for the '{@link emf.bankingsystem.impl.NaturalPersonImpl <em>Natural Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.bankingsystem.impl.NaturalPersonImpl
		 * @see emf.bankingsystem.impl.BankingsystemPackageImpl#getNaturalPerson()
		 * @generated
		 */
		EClass NATURAL_PERSON = eINSTANCE.getNaturalPerson();

		/**
		 * The meta object literal for the '<em><b>Available Cards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NATURAL_PERSON__AVAILABLE_CARDS = eINSTANCE.getNaturalPerson_AvailableCards();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NATURAL_PERSON__USES = eINSTANCE.getNaturalPerson_Uses();

		/**
		 * The meta object literal for the '<em><b>Owns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NATURAL_PERSON__OWNS = eINSTANCE.getNaturalPerson_Owns();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NATURAL_PERSON__NAME = eINSTANCE.getNaturalPerson_Name();

		/**
		 * The meta object literal for the '{@link emf.bankingsystem.impl.PhysicalBankCardImpl <em>Physical Bank Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.bankingsystem.impl.PhysicalBankCardImpl
		 * @see emf.bankingsystem.impl.BankingsystemPackageImpl#getPhysicalBankCard()
		 * @generated
		 */
		EClass PHYSICAL_BANK_CARD = eINSTANCE.getPhysicalBankCard();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_BANK_CARD__NUMBER = eINSTANCE.getPhysicalBankCard_Number();

		/**
		 * The meta object literal for the '<em><b>Pin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_BANK_CARD__PIN = eINSTANCE.getPhysicalBankCard_Pin();

		/**
		 * The meta object literal for the '<em><b>Issuer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_BANK_CARD__ISSUER = eINSTANCE.getPhysicalBankCard_Issuer();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_BANK_CARD__OWNER = eINSTANCE.getPhysicalBankCard_Owner();

		/**
		 * The meta object literal for the '{@link emf.bankingsystem.impl.BankNoteImpl <em>Bank Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.bankingsystem.impl.BankNoteImpl
		 * @see emf.bankingsystem.impl.BankingsystemPackageImpl#getBankNote()
		 * @generated
		 */
		EClass BANK_NOTE = eINSTANCE.getBankNote();

		/**
		 * The meta object literal for the '{@link emf.bankingsystem.impl.HWImpl <em>HW</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.bankingsystem.impl.HWImpl
		 * @see emf.bankingsystem.impl.BankingsystemPackageImpl#getHW()
		 * @generated
		 */
		EClass HW = eINSTANCE.getHW();

		/**
		 * The meta object literal for the '<em><b>Inserted</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW__INSERTED = eINSTANCE.getHW_Inserted();

		/**
		 * The meta object literal for the '<em><b>Held</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW__HELD = eINSTANCE.getHW_Held();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW__NOTES = eINSTANCE.getHW_Notes();

		/**
		 * The meta object literal for the '<em><b>Ready</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW__READY = eINSTANCE.getHW_Ready();

		/**
		 * The meta object literal for the '<em><b>Controller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW__CONTROLLER = eINSTANCE.getHW_Controller();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW__SHOW = eINSTANCE.getHW_Show();

		/**
		 * The meta object literal for the '{@link emf.bankingsystem.impl.ATMControllerImpl <em>ATM Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.bankingsystem.impl.ATMControllerImpl
		 * @see emf.bankingsystem.impl.BankingsystemPackageImpl#getATMController()
		 * @generated
		 */
		EClass ATM_CONTROLLER = eINSTANCE.getATMController();

		/**
		 * The meta object literal for the '<em><b>Hw</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATM_CONTROLLER__HW = eINSTANCE.getATMController_Hw();

		/**
		 * The meta object literal for the '<em><b>Gateway</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATM_CONTROLLER__GATEWAY = eINSTANCE.getATMController_Gateway();

		/**
		 * The meta object literal for the '<em><b>Session</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATM_CONTROLLER__SESSION = eINSTANCE.getATMController_Session();

		/**
		 * The meta object literal for the '{@link emf.bankingsystem.impl.BankGatewayImpl <em>Bank Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.bankingsystem.impl.BankGatewayImpl
		 * @see emf.bankingsystem.impl.BankingsystemPackageImpl#getBankGateway()
		 * @generated
		 */
		EClass BANK_GATEWAY = eINSTANCE.getBankGateway();

		/**
		 * The meta object literal for the '<em><b>AT Ms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANK_GATEWAY__AT_MS = eINSTANCE.getBankGateway_ATMs();

		/**
		 * The meta object literal for the '<em><b>Account Mngrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANK_GATEWAY__ACCOUNT_MNGRS = eINSTANCE.getBankGateway_AccountMngrs();

		/**
		 * The meta object literal for the '<em><b>Swift</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANK_GATEWAY__SWIFT = eINSTANCE.getBankGateway_Swift();

		/**
		 * The meta object literal for the '{@link emf.bankingsystem.impl.SwiftNetworkImpl <em>Swift Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.bankingsystem.impl.SwiftNetworkImpl
		 * @see emf.bankingsystem.impl.BankingsystemPackageImpl#getSwiftNetwork()
		 * @generated
		 */
		EClass SWIFT_NETWORK = eINSTANCE.getSwiftNetwork();

		/**
		 * The meta object literal for the '<em><b>Gateways</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWIFT_NETWORK__GATEWAYS = eINSTANCE.getSwiftNetwork_Gateways();

		/**
		 * The meta object literal for the '{@link emf.bankingsystem.impl.AccountMngrImpl <em>Account Mngr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.bankingsystem.impl.AccountMngrImpl
		 * @see emf.bankingsystem.impl.BankingsystemPackageImpl#getAccountMngr()
		 * @generated
		 */
		EClass ACCOUNT_MNGR = eINSTANCE.getAccountMngr();

		/**
		 * The meta object literal for the '<em><b>Customers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT_MNGR__CUSTOMERS = eINSTANCE.getAccountMngr_Customers();

		/**
		 * The meta object literal for the '<em><b>Accounts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT_MNGR__ACCOUNTS = eINSTANCE.getAccountMngr_Accounts();

		/**
		 * The meta object literal for the '<em><b>Gateway</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT_MNGR__GATEWAY = eINSTANCE.getAccountMngr_Gateway();

		/**
		 * The meta object literal for the '<em><b>Sessions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT_MNGR__SESSIONS = eINSTANCE.getAccountMngr_Sessions();

		/**
		 * The meta object literal for the '<em><b>Idle Sessions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT_MNGR__IDLE_SESSIONS = eINSTANCE.getAccountMngr_IdleSessions();

		/**
		 * The meta object literal for the '{@link emf.bankingsystem.impl.AccountImpl <em>Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.bankingsystem.impl.AccountImpl
		 * @see emf.bankingsystem.impl.BankingsystemPackageImpl#getAccount()
		 * @generated
		 */
		EClass ACCOUNT = eINSTANCE.getAccount();

		/**
		 * The meta object literal for the '<em><b>Cards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT__CARDS = eINSTANCE.getAccount_Cards();

		/**
		 * The meta object literal for the '<em><b>Holder</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT__HOLDER = eINSTANCE.getAccount_Holder();

		/**
		 * The meta object literal for the '<em><b>Balance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__BALANCE = eINSTANCE.getAccount_Balance();

		/**
		 * The meta object literal for the '{@link emf.bankingsystem.impl.BankCardImpl <em>Bank Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.bankingsystem.impl.BankCardImpl
		 * @see emf.bankingsystem.impl.BankingsystemPackageImpl#getBankCard()
		 * @generated
		 */
		EClass BANK_CARD = eINSTANCE.getBankCard();

		/**
		 * The meta object literal for the '<em><b>Account</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANK_CARD__ACCOUNT = eINSTANCE.getBankCard_Account();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANK_CARD__OWNER = eINSTANCE.getBankCard_Owner();

		/**
		 * The meta object literal for the '<em><b>Numer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANK_CARD__NUMER = eINSTANCE.getBankCard_Numer();

		/**
		 * The meta object literal for the '<em><b>Physical</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANK_CARD__PHYSICAL = eINSTANCE.getBankCard_Physical();

		/**
		 * The meta object literal for the '{@link emf.bankingsystem.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.bankingsystem.impl.CustomerImpl
		 * @see emf.bankingsystem.impl.BankingsystemPackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>Accounts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__ACCOUNTS = eINSTANCE.getCustomer_Accounts();

		/**
		 * The meta object literal for the '<em><b>Natural</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__NATURAL = eINSTANCE.getCustomer_Natural();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__ID = eINSTANCE.getCustomer_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__NAME = eINSTANCE.getCustomer_Name();

		/**
		 * The meta object literal for the '{@link emf.bankingsystem.impl.SessionImpl <em>Session</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.bankingsystem.impl.SessionImpl
		 * @see emf.bankingsystem.impl.BankingsystemPackageImpl#getSession()
		 * @generated
		 */
		EClass SESSION = eINSTANCE.getSession();

		/**
		 * The meta object literal for the '<em><b>Card</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION__CARD = eINSTANCE.getSession_Card();

		/**
		 * The meta object literal for the '<em><b>ATM</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION__ATM = eINSTANCE.getSession_ATM();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION__OWNER = eINSTANCE.getSession_Owner();

		/**
		 * The meta object literal for the '<em><b>Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION__ACCOUNT = eINSTANCE.getSession_Account();

		/**
		 * The meta object literal for the '{@link emf.bankingsystem.impl.SettingImpl <em>Setting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.bankingsystem.impl.SettingImpl
		 * @see emf.bankingsystem.impl.BankingsystemPackageImpl#getSetting()
		 * @generated
		 */
		EClass SETTING = eINSTANCE.getSetting();

		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETTING__OBJECTS = eINSTANCE.getSetting_Objects();

		/**
		 * The meta object literal for the '{@link emf.bankingsystem.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.bankingsystem.impl.ComponentImpl
		 * @see emf.bankingsystem.impl.BankingsystemPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

	}

} //BankingsystemPackage

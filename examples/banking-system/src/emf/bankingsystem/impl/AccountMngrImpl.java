/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package emf.bankingsystem.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import emf.bankingsystem.Account;
import emf.bankingsystem.AccountMngr;
import emf.bankingsystem.BankGateway;
import emf.bankingsystem.BankingsystemPackage;
import emf.bankingsystem.Customer;
import emf.bankingsystem.Session;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Account Mngr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.bankingsystem.impl.AccountMngrImpl#getCustomers <em>Customers</em>}</li>
 *   <li>{@link emf.bankingsystem.impl.AccountMngrImpl#getAccounts <em>Accounts</em>}</li>
 *   <li>{@link emf.bankingsystem.impl.AccountMngrImpl#getGateway <em>Gateway</em>}</li>
 *   <li>{@link emf.bankingsystem.impl.AccountMngrImpl#getSessions <em>Sessions</em>}</li>
 *   <li>{@link emf.bankingsystem.impl.AccountMngrImpl#getIdleSessions <em>Idle Sessions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AccountMngrImpl extends ComponentImpl implements AccountMngr {
	/**
	 * The cached value of the '{@link #getCustomers() <em>Customers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomers()
	 * @generated
	 * @ordered
	 */
	protected EList<Customer> customers;

	/**
	 * The cached value of the '{@link #getAccounts() <em>Accounts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccounts()
	 * @generated
	 * @ordered
	 */
	protected EList<Account> accounts;

	/**
	 * The cached value of the '{@link #getGateway() <em>Gateway</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGateway()
	 * @generated
	 * @ordered
	 */
	protected BankGateway gateway;

	/**
	 * The cached value of the '{@link #getSessions() <em>Sessions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessions()
	 * @generated
	 * @ordered
	 */
	protected EList<Session> sessions;

	/**
	 * The cached value of the '{@link #getIdleSessions() <em>Idle Sessions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdleSessions()
	 * @generated
	 * @ordered
	 */
	protected EList<Session> idleSessions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountMngrImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankingsystemPackage.Literals.ACCOUNT_MNGR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Customer> getCustomers() {
		if (customers == null) {
			customers = new EObjectContainmentEList<Customer>(Customer.class, this, BankingsystemPackage.ACCOUNT_MNGR__CUSTOMERS);
		}
		return customers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Account> getAccounts() {
		if (accounts == null) {
			accounts = new EObjectContainmentEList<Account>(Account.class, this, BankingsystemPackage.ACCOUNT_MNGR__ACCOUNTS);
		}
		return accounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankGateway getGateway() {
		if (gateway != null && gateway.eIsProxy()) {
			InternalEObject oldGateway = (InternalEObject)gateway;
			gateway = (BankGateway)eResolveProxy(oldGateway);
			if (gateway != oldGateway) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BankingsystemPackage.ACCOUNT_MNGR__GATEWAY, oldGateway, gateway));
			}
		}
		return gateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankGateway basicGetGateway() {
		return gateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGateway(BankGateway newGateway, NotificationChain msgs) {
		BankGateway oldGateway = gateway;
		gateway = newGateway;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BankingsystemPackage.ACCOUNT_MNGR__GATEWAY, oldGateway, newGateway);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGateway(BankGateway newGateway) {
		if (newGateway != gateway) {
			NotificationChain msgs = null;
			if (gateway != null)
				msgs = ((InternalEObject)gateway).eInverseRemove(this, BankingsystemPackage.BANK_GATEWAY__ACCOUNT_MNGRS, BankGateway.class, msgs);
			if (newGateway != null)
				msgs = ((InternalEObject)newGateway).eInverseAdd(this, BankingsystemPackage.BANK_GATEWAY__ACCOUNT_MNGRS, BankGateway.class, msgs);
			msgs = basicSetGateway(newGateway, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankingsystemPackage.ACCOUNT_MNGR__GATEWAY, newGateway, newGateway));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Session> getSessions() {
		if (sessions == null) {
			sessions = new EObjectContainmentWithInverseEList<Session>(Session.class, this, BankingsystemPackage.ACCOUNT_MNGR__SESSIONS, BankingsystemPackage.SESSION__OWNER);
		}
		return sessions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Session> getIdleSessions() {
		if (idleSessions == null) {
			idleSessions = new EObjectContainmentEList<Session>(Session.class, this, BankingsystemPackage.ACCOUNT_MNGR__IDLE_SESSIONS);
		}
		return idleSessions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BankingsystemPackage.ACCOUNT_MNGR__GATEWAY:
				if (gateway != null)
					msgs = ((InternalEObject)gateway).eInverseRemove(this, BankingsystemPackage.BANK_GATEWAY__ACCOUNT_MNGRS, BankGateway.class, msgs);
				return basicSetGateway((BankGateway)otherEnd, msgs);
			case BankingsystemPackage.ACCOUNT_MNGR__SESSIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSessions()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BankingsystemPackage.ACCOUNT_MNGR__CUSTOMERS:
				return ((InternalEList<?>)getCustomers()).basicRemove(otherEnd, msgs);
			case BankingsystemPackage.ACCOUNT_MNGR__ACCOUNTS:
				return ((InternalEList<?>)getAccounts()).basicRemove(otherEnd, msgs);
			case BankingsystemPackage.ACCOUNT_MNGR__GATEWAY:
				return basicSetGateway(null, msgs);
			case BankingsystemPackage.ACCOUNT_MNGR__SESSIONS:
				return ((InternalEList<?>)getSessions()).basicRemove(otherEnd, msgs);
			case BankingsystemPackage.ACCOUNT_MNGR__IDLE_SESSIONS:
				return ((InternalEList<?>)getIdleSessions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BankingsystemPackage.ACCOUNT_MNGR__CUSTOMERS:
				return getCustomers();
			case BankingsystemPackage.ACCOUNT_MNGR__ACCOUNTS:
				return getAccounts();
			case BankingsystemPackage.ACCOUNT_MNGR__GATEWAY:
				if (resolve) return getGateway();
				return basicGetGateway();
			case BankingsystemPackage.ACCOUNT_MNGR__SESSIONS:
				return getSessions();
			case BankingsystemPackage.ACCOUNT_MNGR__IDLE_SESSIONS:
				return getIdleSessions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BankingsystemPackage.ACCOUNT_MNGR__CUSTOMERS:
				getCustomers().clear();
				getCustomers().addAll((Collection<? extends Customer>)newValue);
				return;
			case BankingsystemPackage.ACCOUNT_MNGR__ACCOUNTS:
				getAccounts().clear();
				getAccounts().addAll((Collection<? extends Account>)newValue);
				return;
			case BankingsystemPackage.ACCOUNT_MNGR__GATEWAY:
				setGateway((BankGateway)newValue);
				return;
			case BankingsystemPackage.ACCOUNT_MNGR__SESSIONS:
				getSessions().clear();
				getSessions().addAll((Collection<? extends Session>)newValue);
				return;
			case BankingsystemPackage.ACCOUNT_MNGR__IDLE_SESSIONS:
				getIdleSessions().clear();
				getIdleSessions().addAll((Collection<? extends Session>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BankingsystemPackage.ACCOUNT_MNGR__CUSTOMERS:
				getCustomers().clear();
				return;
			case BankingsystemPackage.ACCOUNT_MNGR__ACCOUNTS:
				getAccounts().clear();
				return;
			case BankingsystemPackage.ACCOUNT_MNGR__GATEWAY:
				setGateway((BankGateway)null);
				return;
			case BankingsystemPackage.ACCOUNT_MNGR__SESSIONS:
				getSessions().clear();
				return;
			case BankingsystemPackage.ACCOUNT_MNGR__IDLE_SESSIONS:
				getIdleSessions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BankingsystemPackage.ACCOUNT_MNGR__CUSTOMERS:
				return customers != null && !customers.isEmpty();
			case BankingsystemPackage.ACCOUNT_MNGR__ACCOUNTS:
				return accounts != null && !accounts.isEmpty();
			case BankingsystemPackage.ACCOUNT_MNGR__GATEWAY:
				return gateway != null;
			case BankingsystemPackage.ACCOUNT_MNGR__SESSIONS:
				return sessions != null && !sessions.isEmpty();
			case BankingsystemPackage.ACCOUNT_MNGR__IDLE_SESSIONS:
				return idleSessions != null && !idleSessions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AccountMngrImpl

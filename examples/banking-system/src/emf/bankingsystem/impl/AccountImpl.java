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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import emf.bankingsystem.Account;
import emf.bankingsystem.BankCard;
import emf.bankingsystem.BankingsystemPackage;
import emf.bankingsystem.Customer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.bankingsystem.impl.AccountImpl#getCards <em>Cards</em>}</li>
 *   <li>{@link emf.bankingsystem.impl.AccountImpl#getHolder <em>Holder</em>}</li>
 *   <li>{@link emf.bankingsystem.impl.AccountImpl#getBalance <em>Balance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AccountImpl extends ComponentImpl implements Account {
	/**
	 * The cached value of the '{@link #getCards() <em>Cards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCards()
	 * @generated
	 * @ordered
	 */
	protected EList<BankCard> cards;

	/**
	 * The cached value of the '{@link #getHolder() <em>Holder</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHolder()
	 * @generated
	 * @ordered
	 */
	protected EList<Customer> holder;

	/**
	 * The default value of the '{@link #getBalance() <em>Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalance()
	 * @generated
	 * @ordered
	 */
	protected static final int BALANCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBalance() <em>Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalance()
	 * @generated
	 * @ordered
	 */
	protected int balance = BALANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankingsystemPackage.Literals.ACCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BankCard> getCards() {
		if (cards == null) {
			cards = new EObjectContainmentWithInverseEList<BankCard>(BankCard.class, this, BankingsystemPackage.ACCOUNT__CARDS, BankingsystemPackage.BANK_CARD__ACCOUNT);
		}
		return cards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Customer> getHolder() {
		if (holder == null) {
			holder = new EObjectWithInverseResolvingEList.ManyInverse<Customer>(Customer.class, this, BankingsystemPackage.ACCOUNT__HOLDER, BankingsystemPackage.CUSTOMER__ACCOUNTS);
		}
		return holder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBalance() {
		return balance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBalance(int newBalance) {
		int oldBalance = balance;
		balance = newBalance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankingsystemPackage.ACCOUNT__BALANCE, oldBalance, balance));
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
			case BankingsystemPackage.ACCOUNT__CARDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCards()).basicAdd(otherEnd, msgs);
			case BankingsystemPackage.ACCOUNT__HOLDER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHolder()).basicAdd(otherEnd, msgs);
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
			case BankingsystemPackage.ACCOUNT__CARDS:
				return ((InternalEList<?>)getCards()).basicRemove(otherEnd, msgs);
			case BankingsystemPackage.ACCOUNT__HOLDER:
				return ((InternalEList<?>)getHolder()).basicRemove(otherEnd, msgs);
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
			case BankingsystemPackage.ACCOUNT__CARDS:
				return getCards();
			case BankingsystemPackage.ACCOUNT__HOLDER:
				return getHolder();
			case BankingsystemPackage.ACCOUNT__BALANCE:
				return getBalance();
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
			case BankingsystemPackage.ACCOUNT__CARDS:
				getCards().clear();
				getCards().addAll((Collection<? extends BankCard>)newValue);
				return;
			case BankingsystemPackage.ACCOUNT__HOLDER:
				getHolder().clear();
				getHolder().addAll((Collection<? extends Customer>)newValue);
				return;
			case BankingsystemPackage.ACCOUNT__BALANCE:
				setBalance((Integer)newValue);
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
			case BankingsystemPackage.ACCOUNT__CARDS:
				getCards().clear();
				return;
			case BankingsystemPackage.ACCOUNT__HOLDER:
				getHolder().clear();
				return;
			case BankingsystemPackage.ACCOUNT__BALANCE:
				setBalance(BALANCE_EDEFAULT);
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
			case BankingsystemPackage.ACCOUNT__CARDS:
				return cards != null && !cards.isEmpty();
			case BankingsystemPackage.ACCOUNT__HOLDER:
				return holder != null && !holder.isEmpty();
			case BankingsystemPackage.ACCOUNT__BALANCE:
				return balance != BALANCE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (balance: ");
		result.append(balance);
		result.append(')');
		return result.toString();
	}

} //AccountImpl

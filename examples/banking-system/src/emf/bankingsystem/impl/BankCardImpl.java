/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package emf.bankingsystem.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import emf.bankingsystem.Account;
import emf.bankingsystem.BankCard;
import emf.bankingsystem.BankingsystemPackage;
import emf.bankingsystem.Customer;
import emf.bankingsystem.PhysicalBankCard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bank Card</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.bankingsystem.impl.BankCardImpl#getAccount <em>Account</em>}</li>
 *   <li>{@link emf.bankingsystem.impl.BankCardImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link emf.bankingsystem.impl.BankCardImpl#getNumer <em>Numer</em>}</li>
 *   <li>{@link emf.bankingsystem.impl.BankCardImpl#getPhysical <em>Physical</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BankCardImpl extends ComponentImpl implements BankCard {
	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected Customer owner;

	/**
	 * The default value of the '{@link #getNumer() <em>Numer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumer()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumer() <em>Numer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumer()
	 * @generated
	 * @ordered
	 */
	protected int numer = NUMER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPhysical() <em>Physical</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysical()
	 * @generated
	 * @ordered
	 */
	protected PhysicalBankCard physical;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BankCardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankingsystemPackage.Literals.BANK_CARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Account getAccount() {
		if (eContainerFeatureID() != BankingsystemPackage.BANK_CARD__ACCOUNT) return null;
		return (Account)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccount(Account newAccount, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAccount, BankingsystemPackage.BANK_CARD__ACCOUNT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccount(Account newAccount) {
		if (newAccount != eInternalContainer() || (eContainerFeatureID() != BankingsystemPackage.BANK_CARD__ACCOUNT && newAccount != null)) {
			if (EcoreUtil.isAncestor(this, newAccount))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAccount != null)
				msgs = ((InternalEObject)newAccount).eInverseAdd(this, BankingsystemPackage.ACCOUNT__CARDS, Account.class, msgs);
			msgs = basicSetAccount(newAccount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankingsystemPackage.BANK_CARD__ACCOUNT, newAccount, newAccount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = (Customer)eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BankingsystemPackage.BANK_CARD__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(Customer newOwner) {
		Customer oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankingsystemPackage.BANK_CARD__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumer() {
		return numer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumer(int newNumer) {
		int oldNumer = numer;
		numer = newNumer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankingsystemPackage.BANK_CARD__NUMER, oldNumer, numer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalBankCard getPhysical() {
		if (physical != null && physical.eIsProxy()) {
			InternalEObject oldPhysical = (InternalEObject)physical;
			physical = (PhysicalBankCard)eResolveProxy(oldPhysical);
			if (physical != oldPhysical) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BankingsystemPackage.BANK_CARD__PHYSICAL, oldPhysical, physical));
			}
		}
		return physical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalBankCard basicGetPhysical() {
		return physical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysical(PhysicalBankCard newPhysical) {
		PhysicalBankCard oldPhysical = physical;
		physical = newPhysical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankingsystemPackage.BANK_CARD__PHYSICAL, oldPhysical, physical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BankingsystemPackage.BANK_CARD__ACCOUNT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAccount((Account)otherEnd, msgs);
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
			case BankingsystemPackage.BANK_CARD__ACCOUNT:
				return basicSetAccount(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case BankingsystemPackage.BANK_CARD__ACCOUNT:
				return eInternalContainer().eInverseRemove(this, BankingsystemPackage.ACCOUNT__CARDS, Account.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BankingsystemPackage.BANK_CARD__ACCOUNT:
				return getAccount();
			case BankingsystemPackage.BANK_CARD__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case BankingsystemPackage.BANK_CARD__NUMER:
				return getNumer();
			case BankingsystemPackage.BANK_CARD__PHYSICAL:
				if (resolve) return getPhysical();
				return basicGetPhysical();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BankingsystemPackage.BANK_CARD__ACCOUNT:
				setAccount((Account)newValue);
				return;
			case BankingsystemPackage.BANK_CARD__OWNER:
				setOwner((Customer)newValue);
				return;
			case BankingsystemPackage.BANK_CARD__NUMER:
				setNumer((Integer)newValue);
				return;
			case BankingsystemPackage.BANK_CARD__PHYSICAL:
				setPhysical((PhysicalBankCard)newValue);
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
			case BankingsystemPackage.BANK_CARD__ACCOUNT:
				setAccount((Account)null);
				return;
			case BankingsystemPackage.BANK_CARD__OWNER:
				setOwner((Customer)null);
				return;
			case BankingsystemPackage.BANK_CARD__NUMER:
				setNumer(NUMER_EDEFAULT);
				return;
			case BankingsystemPackage.BANK_CARD__PHYSICAL:
				setPhysical((PhysicalBankCard)null);
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
			case BankingsystemPackage.BANK_CARD__ACCOUNT:
				return getAccount() != null;
			case BankingsystemPackage.BANK_CARD__OWNER:
				return owner != null;
			case BankingsystemPackage.BANK_CARD__NUMER:
				return numer != NUMER_EDEFAULT;
			case BankingsystemPackage.BANK_CARD__PHYSICAL:
				return physical != null;
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
		result.append(" (numer: ");
		result.append(numer);
		result.append(')');
		return result.toString();
	}

} //BankCardImpl

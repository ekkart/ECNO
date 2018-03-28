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

import emf.bankingsystem.AccountMngr;
import emf.bankingsystem.BankingsystemPackage;
import emf.bankingsystem.NaturalPerson;
import emf.bankingsystem.PhysicalBankCard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Bank Card</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.bankingsystem.impl.PhysicalBankCardImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link emf.bankingsystem.impl.PhysicalBankCardImpl#getPin <em>Pin</em>}</li>
 *   <li>{@link emf.bankingsystem.impl.PhysicalBankCardImpl#getIssuer <em>Issuer</em>}</li>
 *   <li>{@link emf.bankingsystem.impl.PhysicalBankCardImpl#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicalBankCardImpl extends ComponentImpl implements PhysicalBankCard {
	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPin() <em>Pin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin()
	 * @generated
	 * @ordered
	 */
	protected static final int PIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPin() <em>Pin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin()
	 * @generated
	 * @ordered
	 */
	protected int pin = PIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIssuer() <em>Issuer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuer()
	 * @generated
	 * @ordered
	 */
	protected AccountMngr issuer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalBankCardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankingsystemPackage.Literals.PHYSICAL_BANK_CARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankingsystemPackage.PHYSICAL_BANK_CARD__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPin() {
		return pin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPin(int newPin) {
		int oldPin = pin;
		pin = newPin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankingsystemPackage.PHYSICAL_BANK_CARD__PIN, oldPin, pin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountMngr getIssuer() {
		if (issuer != null && issuer.eIsProxy()) {
			InternalEObject oldIssuer = (InternalEObject)issuer;
			issuer = (AccountMngr)eResolveProxy(oldIssuer);
			if (issuer != oldIssuer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BankingsystemPackage.PHYSICAL_BANK_CARD__ISSUER, oldIssuer, issuer));
			}
		}
		return issuer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountMngr basicGetIssuer() {
		return issuer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssuer(AccountMngr newIssuer) {
		AccountMngr oldIssuer = issuer;
		issuer = newIssuer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankingsystemPackage.PHYSICAL_BANK_CARD__ISSUER, oldIssuer, issuer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NaturalPerson getOwner() {
		if (eContainerFeatureID() != BankingsystemPackage.PHYSICAL_BANK_CARD__OWNER) return null;
		return (NaturalPerson)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(NaturalPerson newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwner, BankingsystemPackage.PHYSICAL_BANK_CARD__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(NaturalPerson newOwner) {
		if (newOwner != eInternalContainer() || (eContainerFeatureID() != BankingsystemPackage.PHYSICAL_BANK_CARD__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, BankingsystemPackage.NATURAL_PERSON__AVAILABLE_CARDS, NaturalPerson.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankingsystemPackage.PHYSICAL_BANK_CARD__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BankingsystemPackage.PHYSICAL_BANK_CARD__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwner((NaturalPerson)otherEnd, msgs);
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
			case BankingsystemPackage.PHYSICAL_BANK_CARD__OWNER:
				return basicSetOwner(null, msgs);
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
			case BankingsystemPackage.PHYSICAL_BANK_CARD__OWNER:
				return eInternalContainer().eInverseRemove(this, BankingsystemPackage.NATURAL_PERSON__AVAILABLE_CARDS, NaturalPerson.class, msgs);
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
			case BankingsystemPackage.PHYSICAL_BANK_CARD__NUMBER:
				return getNumber();
			case BankingsystemPackage.PHYSICAL_BANK_CARD__PIN:
				return getPin();
			case BankingsystemPackage.PHYSICAL_BANK_CARD__ISSUER:
				if (resolve) return getIssuer();
				return basicGetIssuer();
			case BankingsystemPackage.PHYSICAL_BANK_CARD__OWNER:
				return getOwner();
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
			case BankingsystemPackage.PHYSICAL_BANK_CARD__NUMBER:
				setNumber((Integer)newValue);
				return;
			case BankingsystemPackage.PHYSICAL_BANK_CARD__PIN:
				setPin((Integer)newValue);
				return;
			case BankingsystemPackage.PHYSICAL_BANK_CARD__ISSUER:
				setIssuer((AccountMngr)newValue);
				return;
			case BankingsystemPackage.PHYSICAL_BANK_CARD__OWNER:
				setOwner((NaturalPerson)newValue);
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
			case BankingsystemPackage.PHYSICAL_BANK_CARD__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case BankingsystemPackage.PHYSICAL_BANK_CARD__PIN:
				setPin(PIN_EDEFAULT);
				return;
			case BankingsystemPackage.PHYSICAL_BANK_CARD__ISSUER:
				setIssuer((AccountMngr)null);
				return;
			case BankingsystemPackage.PHYSICAL_BANK_CARD__OWNER:
				setOwner((NaturalPerson)null);
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
			case BankingsystemPackage.PHYSICAL_BANK_CARD__NUMBER:
				return number != NUMBER_EDEFAULT;
			case BankingsystemPackage.PHYSICAL_BANK_CARD__PIN:
				return pin != PIN_EDEFAULT;
			case BankingsystemPackage.PHYSICAL_BANK_CARD__ISSUER:
				return issuer != null;
			case BankingsystemPackage.PHYSICAL_BANK_CARD__OWNER:
				return getOwner() != null;
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
		result.append(" (number: ");
		result.append(number);
		result.append(", pin: ");
		result.append(pin);
		result.append(')');
		return result.toString();
	}

} //PhysicalBankCardImpl

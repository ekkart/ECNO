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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import emf.bankingsystem.BankNote;
import emf.bankingsystem.BankingsystemPackage;
import emf.bankingsystem.HW;
import emf.bankingsystem.NaturalPerson;
import emf.bankingsystem.PhysicalBankCard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Natural Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.bankingsystem.impl.NaturalPersonImpl#getAvailableCards <em>Available Cards</em>}</li>
 *   <li>{@link emf.bankingsystem.impl.NaturalPersonImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link emf.bankingsystem.impl.NaturalPersonImpl#getOwns <em>Owns</em>}</li>
 *   <li>{@link emf.bankingsystem.impl.NaturalPersonImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NaturalPersonImpl extends ComponentImpl implements NaturalPerson {
	/**
	 * The cached value of the '{@link #getAvailableCards() <em>Available Cards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableCards()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalBankCard> availableCards;

	/**
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected EList<HW> uses;

	/**
	 * The cached value of the '{@link #getOwns() <em>Owns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwns()
	 * @generated
	 * @ordered
	 */
	protected EList<BankNote> owns;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NaturalPersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankingsystemPackage.Literals.NATURAL_PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalBankCard> getAvailableCards() {
		if (availableCards == null) {
			availableCards = new EObjectContainmentWithInverseEList<PhysicalBankCard>(PhysicalBankCard.class, this, BankingsystemPackage.NATURAL_PERSON__AVAILABLE_CARDS, BankingsystemPackage.PHYSICAL_BANK_CARD__OWNER);
		}
		return availableCards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HW> getUses() {
		if (uses == null) {
			uses = new EObjectResolvingEList<HW>(HW.class, this, BankingsystemPackage.NATURAL_PERSON__USES);
		}
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BankNote> getOwns() {
		if (owns == null) {
			owns = new EObjectContainmentEList<BankNote>(BankNote.class, this, BankingsystemPackage.NATURAL_PERSON__OWNS);
		}
		return owns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankingsystemPackage.NATURAL_PERSON__NAME, oldName, name));
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
			case BankingsystemPackage.NATURAL_PERSON__AVAILABLE_CARDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAvailableCards()).basicAdd(otherEnd, msgs);
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
			case BankingsystemPackage.NATURAL_PERSON__AVAILABLE_CARDS:
				return ((InternalEList<?>)getAvailableCards()).basicRemove(otherEnd, msgs);
			case BankingsystemPackage.NATURAL_PERSON__OWNS:
				return ((InternalEList<?>)getOwns()).basicRemove(otherEnd, msgs);
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
			case BankingsystemPackage.NATURAL_PERSON__AVAILABLE_CARDS:
				return getAvailableCards();
			case BankingsystemPackage.NATURAL_PERSON__USES:
				return getUses();
			case BankingsystemPackage.NATURAL_PERSON__OWNS:
				return getOwns();
			case BankingsystemPackage.NATURAL_PERSON__NAME:
				return getName();
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
			case BankingsystemPackage.NATURAL_PERSON__AVAILABLE_CARDS:
				getAvailableCards().clear();
				getAvailableCards().addAll((Collection<? extends PhysicalBankCard>)newValue);
				return;
			case BankingsystemPackage.NATURAL_PERSON__USES:
				getUses().clear();
				getUses().addAll((Collection<? extends HW>)newValue);
				return;
			case BankingsystemPackage.NATURAL_PERSON__OWNS:
				getOwns().clear();
				getOwns().addAll((Collection<? extends BankNote>)newValue);
				return;
			case BankingsystemPackage.NATURAL_PERSON__NAME:
				setName((String)newValue);
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
			case BankingsystemPackage.NATURAL_PERSON__AVAILABLE_CARDS:
				getAvailableCards().clear();
				return;
			case BankingsystemPackage.NATURAL_PERSON__USES:
				getUses().clear();
				return;
			case BankingsystemPackage.NATURAL_PERSON__OWNS:
				getOwns().clear();
				return;
			case BankingsystemPackage.NATURAL_PERSON__NAME:
				setName(NAME_EDEFAULT);
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
			case BankingsystemPackage.NATURAL_PERSON__AVAILABLE_CARDS:
				return availableCards != null && !availableCards.isEmpty();
			case BankingsystemPackage.NATURAL_PERSON__USES:
				return uses != null && !uses.isEmpty();
			case BankingsystemPackage.NATURAL_PERSON__OWNS:
				return owns != null && !owns.isEmpty();
			case BankingsystemPackage.NATURAL_PERSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //NaturalPersonImpl

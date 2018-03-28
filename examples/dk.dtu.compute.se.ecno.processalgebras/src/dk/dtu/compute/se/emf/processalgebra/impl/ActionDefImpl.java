/**
 */
package dk.dtu.compute.se.emf.processalgebra.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import dk.dtu.compute.se.emf.processalgebra.Action;
import dk.dtu.compute.se.emf.processalgebra.ActionDef;
import dk.dtu.compute.se.emf.processalgebra.ProcessDefinitions;
import dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.dtu.compute.se.emf.processalgebra.impl.ActionDefImpl#getName <em>Name</em>}</li>
 *   <li>{@link dk.dtu.compute.se.emf.processalgebra.impl.ActionDefImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link dk.dtu.compute.se.emf.processalgebra.impl.ActionDefImpl#getProcdefs <em>Procdefs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionDefImpl extends EObjectImpl implements ActionDef {
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
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> uses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessalgebraPackage.Literals.ACTION_DEF;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessalgebraPackage.ACTION_DEF__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getUses() {
		if (uses == null) {
			uses = new EObjectWithInverseResolvingEList<Action>(Action.class, this, ProcessalgebraPackage.ACTION_DEF__USES, ProcessalgebraPackage.ACTION__ACTION);
		}
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessDefinitions getProcdefs() {
		if (eContainerFeatureID() != ProcessalgebraPackage.ACTION_DEF__PROCDEFS) return null;
		return (ProcessDefinitions)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcdefs(ProcessDefinitions newProcdefs, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProcdefs, ProcessalgebraPackage.ACTION_DEF__PROCDEFS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcdefs(ProcessDefinitions newProcdefs) {
		if (newProcdefs != eInternalContainer() || (eContainerFeatureID() != ProcessalgebraPackage.ACTION_DEF__PROCDEFS && newProcdefs != null)) {
			if (EcoreUtil.isAncestor(this, newProcdefs))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProcdefs != null)
				msgs = ((InternalEObject)newProcdefs).eInverseAdd(this, ProcessalgebraPackage.PROCESS_DEFINITIONS__ACTIONS, ProcessDefinitions.class, msgs);
			msgs = basicSetProcdefs(newProcdefs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessalgebraPackage.ACTION_DEF__PROCDEFS, newProcdefs, newProcdefs));
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
			case ProcessalgebraPackage.ACTION_DEF__USES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUses()).basicAdd(otherEnd, msgs);
			case ProcessalgebraPackage.ACTION_DEF__PROCDEFS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProcdefs((ProcessDefinitions)otherEnd, msgs);
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
			case ProcessalgebraPackage.ACTION_DEF__USES:
				return ((InternalEList<?>)getUses()).basicRemove(otherEnd, msgs);
			case ProcessalgebraPackage.ACTION_DEF__PROCDEFS:
				return basicSetProcdefs(null, msgs);
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
			case ProcessalgebraPackage.ACTION_DEF__PROCDEFS:
				return eInternalContainer().eInverseRemove(this, ProcessalgebraPackage.PROCESS_DEFINITIONS__ACTIONS, ProcessDefinitions.class, msgs);
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
			case ProcessalgebraPackage.ACTION_DEF__NAME:
				return getName();
			case ProcessalgebraPackage.ACTION_DEF__USES:
				return getUses();
			case ProcessalgebraPackage.ACTION_DEF__PROCDEFS:
				return getProcdefs();
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
			case ProcessalgebraPackage.ACTION_DEF__NAME:
				setName((String)newValue);
				return;
			case ProcessalgebraPackage.ACTION_DEF__USES:
				getUses().clear();
				getUses().addAll((Collection<? extends Action>)newValue);
				return;
			case ProcessalgebraPackage.ACTION_DEF__PROCDEFS:
				setProcdefs((ProcessDefinitions)newValue);
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
			case ProcessalgebraPackage.ACTION_DEF__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProcessalgebraPackage.ACTION_DEF__USES:
				getUses().clear();
				return;
			case ProcessalgebraPackage.ACTION_DEF__PROCDEFS:
				setProcdefs((ProcessDefinitions)null);
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
			case ProcessalgebraPackage.ACTION_DEF__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProcessalgebraPackage.ACTION_DEF__USES:
				return uses != null && !uses.isEmpty();
			case ProcessalgebraPackage.ACTION_DEF__PROCDEFS:
				return getProcdefs() != null;
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

} //ActionDefImpl

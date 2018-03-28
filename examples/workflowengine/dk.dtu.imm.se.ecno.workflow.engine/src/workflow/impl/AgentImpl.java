/**
 */
package workflow.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import workflow.ActivityO;
import workflow.Agent;
import workflow.Role;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link workflow.impl.AgentImpl#getTakenRoles <em>Taken Roles</em>}</li>
 *   <li>{@link workflow.impl.AgentImpl#getName <em>Name</em>}</li>
 *   <li>{@link workflow.impl.AgentImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link workflow.impl.AgentImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link workflow.impl.AgentImpl#getActive <em>Active</em>}</li>
 *   <li>{@link workflow.impl.AgentImpl#getMayTakeRoles <em>May Take Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AgentImpl extends EObjectImpl implements Agent {
	/**
	 * The cached value of the '{@link #getTakenRoles() <em>Taken Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTakenRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> takenRoles;

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
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActive() <em>Active</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityO> active;

	/**
	 * The cached value of the '{@link #getMayTakeRoles() <em>May Take Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMayTakeRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> mayTakeRoles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.AGENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getTakenRoles() {
		if (takenRoles == null) {
			takenRoles = new EObjectResolvingEList<Role>(Role.class, this, WorkflowPackage.AGENT__TAKEN_ROLES);
		}
		return takenRoles;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.AGENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsername(String newUsername) {
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.AGENT__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.AGENT__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityO> getActive() {
		if (active == null) {
			active = new EObjectWithInverseResolvingEList<ActivityO>(ActivityO.class, this, WorkflowPackage.AGENT__ACTIVE, WorkflowPackage.ACTIVITY_O__ASSIGNED_TO);
		}
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getMayTakeRoles() {
		if (mayTakeRoles == null) {
			mayTakeRoles = new EObjectResolvingEList<Role>(Role.class, this, WorkflowPackage.AGENT__MAY_TAKE_ROLES);
		}
		return mayTakeRoles;
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
			case WorkflowPackage.AGENT__ACTIVE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActive()).basicAdd(otherEnd, msgs);
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
			case WorkflowPackage.AGENT__ACTIVE:
				return ((InternalEList<?>)getActive()).basicRemove(otherEnd, msgs);
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
			case WorkflowPackage.AGENT__TAKEN_ROLES:
				return getTakenRoles();
			case WorkflowPackage.AGENT__NAME:
				return getName();
			case WorkflowPackage.AGENT__USERNAME:
				return getUsername();
			case WorkflowPackage.AGENT__PASSWORD:
				return getPassword();
			case WorkflowPackage.AGENT__ACTIVE:
				return getActive();
			case WorkflowPackage.AGENT__MAY_TAKE_ROLES:
				return getMayTakeRoles();
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
			case WorkflowPackage.AGENT__TAKEN_ROLES:
				getTakenRoles().clear();
				getTakenRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case WorkflowPackage.AGENT__NAME:
				setName((String)newValue);
				return;
			case WorkflowPackage.AGENT__USERNAME:
				setUsername((String)newValue);
				return;
			case WorkflowPackage.AGENT__PASSWORD:
				setPassword((String)newValue);
				return;
			case WorkflowPackage.AGENT__ACTIVE:
				getActive().clear();
				getActive().addAll((Collection<? extends ActivityO>)newValue);
				return;
			case WorkflowPackage.AGENT__MAY_TAKE_ROLES:
				getMayTakeRoles().clear();
				getMayTakeRoles().addAll((Collection<? extends Role>)newValue);
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
			case WorkflowPackage.AGENT__TAKEN_ROLES:
				getTakenRoles().clear();
				return;
			case WorkflowPackage.AGENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WorkflowPackage.AGENT__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case WorkflowPackage.AGENT__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case WorkflowPackage.AGENT__ACTIVE:
				getActive().clear();
				return;
			case WorkflowPackage.AGENT__MAY_TAKE_ROLES:
				getMayTakeRoles().clear();
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
			case WorkflowPackage.AGENT__TAKEN_ROLES:
				return takenRoles != null && !takenRoles.isEmpty();
			case WorkflowPackage.AGENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WorkflowPackage.AGENT__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case WorkflowPackage.AGENT__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case WorkflowPackage.AGENT__ACTIVE:
				return active != null && !active.isEmpty();
			case WorkflowPackage.AGENT__MAY_TAKE_ROLES:
				return mayTakeRoles != null && !mayTakeRoles.isEmpty();
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
		result.append(", username: ");
		result.append(username);
		result.append(", password: ");
		result.append(password);
		result.append(')');
		return result.toString();
	}

} //AgentImpl

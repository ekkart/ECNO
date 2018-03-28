/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.pn.ecnonets.impl;

import dk.dtu.imm.se.ecno.pn.ecnonets.EcnonetsPackage;
import dk.dtu.imm.se.ecno.pn.ecnonets.EventUse;
import dk.dtu.imm.se.ecno.pn.ecnonets.JavaExpression;

import dk.dtu.imm.se.ecno.pn.ecnonets.NamedParameter;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.ecno.pn.ecnonets.impl.EventUseImpl#getName <em>Name</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.pn.ecnonets.impl.EventUseImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.pn.ecnonets.impl.EventUseImpl#getType <em>Type</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.pn.ecnonets.impl.EventUseImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventUseImpl extends EObjectImpl implements EventUse {
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
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected EList<JavaExpression> expression;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedParameter> parameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventUseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcnonetsPackage.Literals.EVENT_USE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcnonetsPackage.EVENT_USE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JavaExpression> getExpression() {
		if (expression == null) {
			expression = new EObjectContainmentEList<JavaExpression>(JavaExpression.class, this, EcnonetsPackage.EVENT_USE__EXPRESSION);
		}
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcnonetsPackage.EVENT_USE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedParameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<NamedParameter>(NamedParameter.class, this, EcnonetsPackage.EVENT_USE__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcnonetsPackage.EVENT_USE__EXPRESSION:
				return ((InternalEList<?>)getExpression()).basicRemove(otherEnd, msgs);
			case EcnonetsPackage.EVENT_USE__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
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
			case EcnonetsPackage.EVENT_USE__NAME:
				return getName();
			case EcnonetsPackage.EVENT_USE__EXPRESSION:
				return getExpression();
			case EcnonetsPackage.EVENT_USE__TYPE:
				return getType();
			case EcnonetsPackage.EVENT_USE__PARAMETER:
				return getParameter();
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
			case EcnonetsPackage.EVENT_USE__NAME:
				setName((String)newValue);
				return;
			case EcnonetsPackage.EVENT_USE__EXPRESSION:
				getExpression().clear();
				getExpression().addAll((Collection<? extends JavaExpression>)newValue);
				return;
			case EcnonetsPackage.EVENT_USE__TYPE:
				setType((String)newValue);
				return;
			case EcnonetsPackage.EVENT_USE__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends NamedParameter>)newValue);
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
			case EcnonetsPackage.EVENT_USE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EcnonetsPackage.EVENT_USE__EXPRESSION:
				getExpression().clear();
				return;
			case EcnonetsPackage.EVENT_USE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case EcnonetsPackage.EVENT_USE__PARAMETER:
				getParameter().clear();
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
			case EcnonetsPackage.EVENT_USE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EcnonetsPackage.EVENT_USE__EXPRESSION:
				return expression != null && !expression.isEmpty();
			case EcnonetsPackage.EVENT_USE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case EcnonetsPackage.EVENT_USE__PARAMETER:
				return parameter != null && !parameter.isEmpty();
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
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //EventUseImpl

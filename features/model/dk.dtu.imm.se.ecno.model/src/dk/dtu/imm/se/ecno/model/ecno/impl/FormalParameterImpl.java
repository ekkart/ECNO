/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.model.ecno.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EParameterImpl;

import dk.dtu.imm.se.ecno.model.ecno.EcnoPackage;
import dk.dtu.imm.se.ecno.model.ecno.FormalParameter;
import dk.dtu.imm.se.ecno.model.ecno.helpers.EcorePrimitiveDatatypeMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formal Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.FormalParameterImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.FormalParameterImpl#isCollective <em>Collective</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormalParameterImpl extends EParameterImpl implements FormalParameter {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;
	/**
	 * The default value of the '{@link #isCollective() <em>Collective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollective()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COLLECTIVE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isCollective() <em>Collective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollective()
	 * @generated
	 * @ordered
	 */
	protected boolean collective = COLLECTIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormalParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcnoPackage.Literals.FORMAL_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT (implemented derived attribute: label)
	 * @author eki
	 */
	public String getLabel() {
		String name = this.getName();
		if (name == null) {
			name = "";
		} 
		EClassifier classifier = this.getEType();
		String type = "";
		if (classifier != null) {
			type = classifier.getName();
			if (type == null) {
				type = "";
			}
		}
		String collective = this.isCollective() ? " *" : "";
		return name + ": " + type + collective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCollective() {
		return collective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollective(boolean newCollective) {
		boolean oldCollective = collective;
		collective = newCollective;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcnoPackage.FORMAL_PARAMETER__COLLECTIVE, oldCollective, collective));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcnoPackage.FORMAL_PARAMETER__LABEL:
				return getLabel();
			case EcnoPackage.FORMAL_PARAMETER__COLLECTIVE:
				return isCollective();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSetGen(int featureID, Object newValue) {
		switch (featureID) {
			case EcnoPackage.FORMAL_PARAMETER__COLLECTIVE:
				setCollective((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	/**
	 * @generated NOT (make sure that the change of the derived attribute is notified: label)
	 * @author eki
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		if (eNotificationRequired()) {
			String oldLabel = getLabel();
			eSetGen(featureID, newValue);
			String newLabel = getLabel();
			if (!oldLabel.equals(newLabel)) {
				eNotify(new ENotificationImpl(this, Notification.SET, EcnoPackage.FORMAL_PARAMETER__LABEL, oldLabel, newLabel));
			}
		} else {
			eSetGen(featureID, newValue);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EcnoPackage.FORMAL_PARAMETER__COLLECTIVE:
				setCollective(COLLECTIVE_EDEFAULT);
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
			case EcnoPackage.FORMAL_PARAMETER__LABEL:
				return LABEL_EDEFAULT == null ? getLabel() != null : !LABEL_EDEFAULT.equals(getLabel());
			case EcnoPackage.FORMAL_PARAMETER__COLLECTIVE:
				return collective != COLLECTIVE_EDEFAULT;
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
		result.append(" (collective: ");
		result.append(collective);
		result.append(')');
		return result.toString();
	}

	@Override
	// @generated NOT
	// @author eki
	public Class<?> getType() {
		// We need to deal with the primitive types in a different way than EMF; we
		// need the respective classes not the primitive types (to distinguish between
		// not yet assigned values).
		EClassifier classifier = this.getEType();
		Class<?> clazz = EcorePrimitiveDatatypeMapping.getJavaClass(classifier);
		if (clazz != null) {
			return clazz;
		}
		return classifier.getInstanceClass();
	}

} //FormalParameterImpl

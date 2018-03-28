/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.impl;

import dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel;

import dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.ECNOInstanceGenModel;
import dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.EcnoinstancegenPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ECNO Instance Gen Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.impl.ECNOInstanceGenModelImpl#getInstance <em>Instance</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.impl.ECNOInstanceGenModelImpl#getEcnoGenModel <em>Ecno Gen Model</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.impl.ECNOInstanceGenModelImpl#getBasePathECNOInstance <em>Base Path ECNO Instance</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.impl.ECNOInstanceGenModelImpl#getInstanceClassName <em>Instance Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ECNOInstanceGenModelImpl extends EObjectImpl implements ECNOInstanceGenModel {
	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected EObject instance;

	/**
	 * The cached value of the '{@link #getEcnoGenModel() <em>Ecno Gen Model</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcnoGenModel()
	 * @generated
	 * @ordered
	 */
	protected EList<ECNOGenModel> ecnoGenModel;

	/**
	 * The default value of the '{@link #getBasePathECNOInstance() <em>Base Path ECNO Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePathECNOInstance()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_PATH_ECNO_INSTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBasePathECNOInstance() <em>Base Path ECNO Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePathECNOInstance()
	 * @generated
	 * @ordered
	 */
	protected String basePathECNOInstance = BASE_PATH_ECNO_INSTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstanceClassName() <em>Instance Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceClassName() <em>Instance Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceClassName()
	 * @generated
	 * @ordered
	 */
	protected String instanceClassName = INSTANCE_CLASS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ECNOInstanceGenModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcnoinstancegenPackage.Literals.ECNO_INSTANCE_GEN_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getInstance() {
		if (instance != null && instance.eIsProxy()) {
			InternalEObject oldInstance = (InternalEObject)instance;
			instance = eResolveProxy(oldInstance);
			if (instance != oldInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcnoinstancegenPackage.ECNO_INSTANCE_GEN_MODEL__INSTANCE, oldInstance, instance));
			}
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetInstance() {
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstance(EObject newInstance) {
		EObject oldInstance = instance;
		instance = newInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcnoinstancegenPackage.ECNO_INSTANCE_GEN_MODEL__INSTANCE, oldInstance, instance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ECNOGenModel> getEcnoGenModel() {
		if (ecnoGenModel == null) {
			ecnoGenModel = new EObjectResolvingEList<ECNOGenModel>(ECNOGenModel.class, this, EcnoinstancegenPackage.ECNO_INSTANCE_GEN_MODEL__ECNO_GEN_MODEL);
		}
		return ecnoGenModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBasePathECNOInstance() {
		return basePathECNOInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasePathECNOInstance(String newBasePathECNOInstance) {
		String oldBasePathECNOInstance = basePathECNOInstance;
		basePathECNOInstance = newBasePathECNOInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcnoinstancegenPackage.ECNO_INSTANCE_GEN_MODEL__BASE_PATH_ECNO_INSTANCE, oldBasePathECNOInstance, basePathECNOInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceClassName() {
		return instanceClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceClassName(String newInstanceClassName) {
		String oldInstanceClassName = instanceClassName;
		instanceClassName = newInstanceClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcnoinstancegenPackage.ECNO_INSTANCE_GEN_MODEL__INSTANCE_CLASS_NAME, oldInstanceClassName, instanceClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcnoinstancegenPackage.ECNO_INSTANCE_GEN_MODEL__INSTANCE:
				if (resolve) return getInstance();
				return basicGetInstance();
			case EcnoinstancegenPackage.ECNO_INSTANCE_GEN_MODEL__ECNO_GEN_MODEL:
				return getEcnoGenModel();
			case EcnoinstancegenPackage.ECNO_INSTANCE_GEN_MODEL__BASE_PATH_ECNO_INSTANCE:
				return getBasePathECNOInstance();
			case EcnoinstancegenPackage.ECNO_INSTANCE_GEN_MODEL__INSTANCE_CLASS_NAME:
				return getInstanceClassName();
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
			case EcnoinstancegenPackage.ECNO_INSTANCE_GEN_MODEL__INSTANCE:
				setInstance((EObject)newValue);
				return;
			case EcnoinstancegenPackage.ECNO_INSTANCE_GEN_MODEL__ECNO_GEN_MODEL:
				getEcnoGenModel().clear();
				getEcnoGenModel().addAll((Collection<? extends ECNOGenModel>)newValue);
				return;
			case EcnoinstancegenPackage.ECNO_INSTANCE_GEN_MODEL__BASE_PATH_ECNO_INSTANCE:
				setBasePathECNOInstance((String)newValue);
				return;
			case EcnoinstancegenPackage.ECNO_INSTANCE_GEN_MODEL__INSTANCE_CLASS_NAME:
				setInstanceClassName((String)newValue);
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
			case EcnoinstancegenPackage.ECNO_INSTANCE_GEN_MODEL__INSTANCE:
				setInstance((EObject)null);
				return;
			case EcnoinstancegenPackage.ECNO_INSTANCE_GEN_MODEL__ECNO_GEN_MODEL:
				getEcnoGenModel().clear();
				return;
			case EcnoinstancegenPackage.ECNO_INSTANCE_GEN_MODEL__BASE_PATH_ECNO_INSTANCE:
				setBasePathECNOInstance(BASE_PATH_ECNO_INSTANCE_EDEFAULT);
				return;
			case EcnoinstancegenPackage.ECNO_INSTANCE_GEN_MODEL__INSTANCE_CLASS_NAME:
				setInstanceClassName(INSTANCE_CLASS_NAME_EDEFAULT);
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
			case EcnoinstancegenPackage.ECNO_INSTANCE_GEN_MODEL__INSTANCE:
				return instance != null;
			case EcnoinstancegenPackage.ECNO_INSTANCE_GEN_MODEL__ECNO_GEN_MODEL:
				return ecnoGenModel != null && !ecnoGenModel.isEmpty();
			case EcnoinstancegenPackage.ECNO_INSTANCE_GEN_MODEL__BASE_PATH_ECNO_INSTANCE:
				return BASE_PATH_ECNO_INSTANCE_EDEFAULT == null ? basePathECNOInstance != null : !BASE_PATH_ECNO_INSTANCE_EDEFAULT.equals(basePathECNOInstance);
			case EcnoinstancegenPackage.ECNO_INSTANCE_GEN_MODEL__INSTANCE_CLASS_NAME:
				return INSTANCE_CLASS_NAME_EDEFAULT == null ? instanceClassName != null : !INSTANCE_CLASS_NAME_EDEFAULT.equals(instanceClassName);
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
		result.append(" (basePathECNOInstance: ");
		result.append(basePathECNOInstance);
		result.append(", instanceClassName: ");
		result.append(instanceClassName);
		result.append(')');
		return result.toString();
	}

} //ECNOInstanceGenModelImpl

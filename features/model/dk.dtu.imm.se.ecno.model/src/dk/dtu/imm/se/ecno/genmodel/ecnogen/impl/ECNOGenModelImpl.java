/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.genmodel.ecnogen.impl;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel;
import dk.dtu.imm.se.ecno.genmodel.ecnogen.EcnogenPackage;
import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ECNO Gen Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.ecno.genmodel.ecnogen.impl.ECNOGenModelImpl#getEmfGenModel <em>Emf Gen Model</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.genmodel.ecnogen.impl.ECNOGenModelImpl#getEcnoModel <em>Ecno Model</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.genmodel.ecnogen.impl.ECNOGenModelImpl#getBasePathECNOEvents <em>Base Path ECNO Events</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.genmodel.ecnogen.impl.ECNOGenModelImpl#getBasePathECNOAutomata <em>Base Path ECNO Automata</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.genmodel.ecnogen.impl.ECNOGenModelImpl#getAutomataFactoryClassName <em>Automata Factory Class Name</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.genmodel.ecnogen.impl.ECNOGenModelImpl#getBehaviourModel <em>Behaviour Model</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.genmodel.ecnogen.impl.ECNOGenModelImpl#getBasePathModelClass <em>Base Path Model Class</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.genmodel.ecnogen.impl.ECNOGenModelImpl#getModelClassName <em>Model Class Name</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.genmodel.ecnogen.impl.ECNOGenModelImpl#getPackageAdapterFactoryClassName <em>Package Adapter Factory Class Name</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.genmodel.ecnogen.impl.ECNOGenModelImpl#getRequired <em>Required</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ECNOGenModelImpl extends EObjectImpl implements ECNOGenModel {
	/**
	 * The cached value of the '{@link #getEmfGenModel() <em>Emf Gen Model</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmfGenModel()
	 * @generated
	 * @ordered
	 */
	protected EList<GenModel> emfGenModel;

	/**
	 * The cached value of the '{@link #getEcnoModel() <em>Ecno Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcnoModel()
	 * @generated
	 * @ordered
	 */
	protected dk.dtu.imm.se.ecno.model.ecno.Package ecnoModel;

	/**
	 * The default value of the '{@link #getBasePathECNOEvents() <em>Base Path ECNO Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePathECNOEvents()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_PATH_ECNO_EVENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBasePathECNOEvents() <em>Base Path ECNO Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePathECNOEvents()
	 * @generated
	 * @ordered
	 */
	protected String basePathECNOEvents = BASE_PATH_ECNO_EVENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBasePathECNOAutomata() <em>Base Path ECNO Automata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePathECNOAutomata()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_PATH_ECNO_AUTOMATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBasePathECNOAutomata() <em>Base Path ECNO Automata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePathECNOAutomata()
	 * @generated
	 * @ordered
	 */
	protected String basePathECNOAutomata = BASE_PATH_ECNO_AUTOMATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutomataFactoryClassName() <em>Automata Factory Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomataFactoryClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTOMATA_FACTORY_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutomataFactoryClassName() <em>Automata Factory Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomataFactoryClassName()
	 * @generated
	 * @ordered
	 */
	protected String automataFactoryClassName = AUTOMATA_FACTORY_CLASS_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBehaviourModel() <em>Behaviour Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviourModel()
	 * @generated
	 * @ordered
	 */
	protected EObject behaviourModel;

	/**
	 * The default value of the '{@link #getBasePathModelClass() <em>Base Path Model Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePathModelClass()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_PATH_MODEL_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBasePathModelClass() <em>Base Path Model Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePathModelClass()
	 * @generated
	 * @ordered
	 */
	protected String basePathModelClass = BASE_PATH_MODEL_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelClassName() <em>Model Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelClassName() <em>Model Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelClassName()
	 * @generated
	 * @ordered
	 */
	protected String modelClassName = MODEL_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPackageAdapterFactoryClassName() <em>Package Adapter Factory Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageAdapterFactoryClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_ADAPTER_FACTORY_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageAdapterFactoryClassName() <em>Package Adapter Factory Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageAdapterFactoryClassName()
	 * @generated
	 * @ordered
	 */
	protected String packageAdapterFactoryClassName = PACKAGE_ADAPTER_FACTORY_CLASS_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected EList<ECNOGenModel> required;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ECNOGenModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcnogenPackage.Literals.ECNO_GEN_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenModel> getEmfGenModel() {
		if (emfGenModel == null) {
			emfGenModel = new EObjectResolvingEList<GenModel>(GenModel.class, this, EcnogenPackage.ECNO_GEN_MODEL__EMF_GEN_MODEL);
		}
		return emfGenModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public dk.dtu.imm.se.ecno.model.ecno.Package getEcnoModel() {
		if (ecnoModel != null && ecnoModel.eIsProxy()) {
			InternalEObject oldEcnoModel = (InternalEObject)ecnoModel;
			ecnoModel = (dk.dtu.imm.se.ecno.model.ecno.Package)eResolveProxy(oldEcnoModel);
			if (ecnoModel != oldEcnoModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcnogenPackage.ECNO_GEN_MODEL__ECNO_MODEL, oldEcnoModel, ecnoModel));
			}
		}
		return ecnoModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public dk.dtu.imm.se.ecno.model.ecno.Package basicGetEcnoModel() {
		return ecnoModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcnoModel(dk.dtu.imm.se.ecno.model.ecno.Package newEcnoModel) {
		dk.dtu.imm.se.ecno.model.ecno.Package oldEcnoModel = ecnoModel;
		ecnoModel = newEcnoModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcnogenPackage.ECNO_GEN_MODEL__ECNO_MODEL, oldEcnoModel, ecnoModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBasePathECNOEvents() {
		return basePathECNOEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasePathECNOEvents(String newBasePathECNOEvents) {
		String oldBasePathECNOEvents = basePathECNOEvents;
		basePathECNOEvents = newBasePathECNOEvents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcnogenPackage.ECNO_GEN_MODEL__BASE_PATH_ECNO_EVENTS, oldBasePathECNOEvents, basePathECNOEvents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBasePathECNOAutomata() {
		return basePathECNOAutomata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasePathECNOAutomata(String newBasePathECNOAutomata) {
		String oldBasePathECNOAutomata = basePathECNOAutomata;
		basePathECNOAutomata = newBasePathECNOAutomata;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcnogenPackage.ECNO_GEN_MODEL__BASE_PATH_ECNO_AUTOMATA, oldBasePathECNOAutomata, basePathECNOAutomata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutomataFactoryClassName() {
		return automataFactoryClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutomataFactoryClassName(String newAutomataFactoryClassName) {
		String oldAutomataFactoryClassName = automataFactoryClassName;
		automataFactoryClassName = newAutomataFactoryClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcnogenPackage.ECNO_GEN_MODEL__AUTOMATA_FACTORY_CLASS_NAME, oldAutomataFactoryClassName, automataFactoryClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getBehaviourModel() {
		if (behaviourModel != null && behaviourModel.eIsProxy()) {
			InternalEObject oldBehaviourModel = (InternalEObject)behaviourModel;
			behaviourModel = eResolveProxy(oldBehaviourModel);
			if (behaviourModel != oldBehaviourModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcnogenPackage.ECNO_GEN_MODEL__BEHAVIOUR_MODEL, oldBehaviourModel, behaviourModel));
			}
		}
		return behaviourModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetBehaviourModel() {
		return behaviourModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehaviourModel(EObject newBehaviourModel) {
		EObject oldBehaviourModel = behaviourModel;
		behaviourModel = newBehaviourModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcnogenPackage.ECNO_GEN_MODEL__BEHAVIOUR_MODEL, oldBehaviourModel, behaviourModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBasePathModelClass() {
		return basePathModelClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasePathModelClass(String newBasePathModelClass) {
		String oldBasePathModelClass = basePathModelClass;
		basePathModelClass = newBasePathModelClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcnogenPackage.ECNO_GEN_MODEL__BASE_PATH_MODEL_CLASS, oldBasePathModelClass, basePathModelClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelClassName() {
		return modelClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelClassName(String newModelClassName) {
		String oldModelClassName = modelClassName;
		modelClassName = newModelClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcnogenPackage.ECNO_GEN_MODEL__MODEL_CLASS_NAME, oldModelClassName, modelClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackageAdapterFactoryClassName() {
		return packageAdapterFactoryClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageAdapterFactoryClassName(String newPackageAdapterFactoryClassName) {
		String oldPackageAdapterFactoryClassName = packageAdapterFactoryClassName;
		packageAdapterFactoryClassName = newPackageAdapterFactoryClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcnogenPackage.ECNO_GEN_MODEL__PACKAGE_ADAPTER_FACTORY_CLASS_NAME, oldPackageAdapterFactoryClassName, packageAdapterFactoryClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ECNOGenModel> getRequired() {
		if (required == null) {
			required = new EObjectResolvingEList<ECNOGenModel>(ECNOGenModel.class, this, EcnogenPackage.ECNO_GEN_MODEL__REQUIRED);
		}
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcnogenPackage.ECNO_GEN_MODEL__EMF_GEN_MODEL:
				return getEmfGenModel();
			case EcnogenPackage.ECNO_GEN_MODEL__ECNO_MODEL:
				if (resolve) return getEcnoModel();
				return basicGetEcnoModel();
			case EcnogenPackage.ECNO_GEN_MODEL__BASE_PATH_ECNO_EVENTS:
				return getBasePathECNOEvents();
			case EcnogenPackage.ECNO_GEN_MODEL__BASE_PATH_ECNO_AUTOMATA:
				return getBasePathECNOAutomata();
			case EcnogenPackage.ECNO_GEN_MODEL__AUTOMATA_FACTORY_CLASS_NAME:
				return getAutomataFactoryClassName();
			case EcnogenPackage.ECNO_GEN_MODEL__BEHAVIOUR_MODEL:
				if (resolve) return getBehaviourModel();
				return basicGetBehaviourModel();
			case EcnogenPackage.ECNO_GEN_MODEL__BASE_PATH_MODEL_CLASS:
				return getBasePathModelClass();
			case EcnogenPackage.ECNO_GEN_MODEL__MODEL_CLASS_NAME:
				return getModelClassName();
			case EcnogenPackage.ECNO_GEN_MODEL__PACKAGE_ADAPTER_FACTORY_CLASS_NAME:
				return getPackageAdapterFactoryClassName();
			case EcnogenPackage.ECNO_GEN_MODEL__REQUIRED:
				return getRequired();
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
			case EcnogenPackage.ECNO_GEN_MODEL__EMF_GEN_MODEL:
				getEmfGenModel().clear();
				getEmfGenModel().addAll((Collection<? extends GenModel>)newValue);
				return;
			case EcnogenPackage.ECNO_GEN_MODEL__ECNO_MODEL:
				setEcnoModel((dk.dtu.imm.se.ecno.model.ecno.Package)newValue);
				return;
			case EcnogenPackage.ECNO_GEN_MODEL__BASE_PATH_ECNO_EVENTS:
				setBasePathECNOEvents((String)newValue);
				return;
			case EcnogenPackage.ECNO_GEN_MODEL__BASE_PATH_ECNO_AUTOMATA:
				setBasePathECNOAutomata((String)newValue);
				return;
			case EcnogenPackage.ECNO_GEN_MODEL__AUTOMATA_FACTORY_CLASS_NAME:
				setAutomataFactoryClassName((String)newValue);
				return;
			case EcnogenPackage.ECNO_GEN_MODEL__BEHAVIOUR_MODEL:
				setBehaviourModel((EObject)newValue);
				return;
			case EcnogenPackage.ECNO_GEN_MODEL__BASE_PATH_MODEL_CLASS:
				setBasePathModelClass((String)newValue);
				return;
			case EcnogenPackage.ECNO_GEN_MODEL__MODEL_CLASS_NAME:
				setModelClassName((String)newValue);
				return;
			case EcnogenPackage.ECNO_GEN_MODEL__PACKAGE_ADAPTER_FACTORY_CLASS_NAME:
				setPackageAdapterFactoryClassName((String)newValue);
				return;
			case EcnogenPackage.ECNO_GEN_MODEL__REQUIRED:
				getRequired().clear();
				getRequired().addAll((Collection<? extends ECNOGenModel>)newValue);
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
			case EcnogenPackage.ECNO_GEN_MODEL__EMF_GEN_MODEL:
				getEmfGenModel().clear();
				return;
			case EcnogenPackage.ECNO_GEN_MODEL__ECNO_MODEL:
				setEcnoModel((dk.dtu.imm.se.ecno.model.ecno.Package)null);
				return;
			case EcnogenPackage.ECNO_GEN_MODEL__BASE_PATH_ECNO_EVENTS:
				setBasePathECNOEvents(BASE_PATH_ECNO_EVENTS_EDEFAULT);
				return;
			case EcnogenPackage.ECNO_GEN_MODEL__BASE_PATH_ECNO_AUTOMATA:
				setBasePathECNOAutomata(BASE_PATH_ECNO_AUTOMATA_EDEFAULT);
				return;
			case EcnogenPackage.ECNO_GEN_MODEL__AUTOMATA_FACTORY_CLASS_NAME:
				setAutomataFactoryClassName(AUTOMATA_FACTORY_CLASS_NAME_EDEFAULT);
				return;
			case EcnogenPackage.ECNO_GEN_MODEL__BEHAVIOUR_MODEL:
				setBehaviourModel((EObject)null);
				return;
			case EcnogenPackage.ECNO_GEN_MODEL__BASE_PATH_MODEL_CLASS:
				setBasePathModelClass(BASE_PATH_MODEL_CLASS_EDEFAULT);
				return;
			case EcnogenPackage.ECNO_GEN_MODEL__MODEL_CLASS_NAME:
				setModelClassName(MODEL_CLASS_NAME_EDEFAULT);
				return;
			case EcnogenPackage.ECNO_GEN_MODEL__PACKAGE_ADAPTER_FACTORY_CLASS_NAME:
				setPackageAdapterFactoryClassName(PACKAGE_ADAPTER_FACTORY_CLASS_NAME_EDEFAULT);
				return;
			case EcnogenPackage.ECNO_GEN_MODEL__REQUIRED:
				getRequired().clear();
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
			case EcnogenPackage.ECNO_GEN_MODEL__EMF_GEN_MODEL:
				return emfGenModel != null && !emfGenModel.isEmpty();
			case EcnogenPackage.ECNO_GEN_MODEL__ECNO_MODEL:
				return ecnoModel != null;
			case EcnogenPackage.ECNO_GEN_MODEL__BASE_PATH_ECNO_EVENTS:
				return BASE_PATH_ECNO_EVENTS_EDEFAULT == null ? basePathECNOEvents != null : !BASE_PATH_ECNO_EVENTS_EDEFAULT.equals(basePathECNOEvents);
			case EcnogenPackage.ECNO_GEN_MODEL__BASE_PATH_ECNO_AUTOMATA:
				return BASE_PATH_ECNO_AUTOMATA_EDEFAULT == null ? basePathECNOAutomata != null : !BASE_PATH_ECNO_AUTOMATA_EDEFAULT.equals(basePathECNOAutomata);
			case EcnogenPackage.ECNO_GEN_MODEL__AUTOMATA_FACTORY_CLASS_NAME:
				return AUTOMATA_FACTORY_CLASS_NAME_EDEFAULT == null ? automataFactoryClassName != null : !AUTOMATA_FACTORY_CLASS_NAME_EDEFAULT.equals(automataFactoryClassName);
			case EcnogenPackage.ECNO_GEN_MODEL__BEHAVIOUR_MODEL:
				return behaviourModel != null;
			case EcnogenPackage.ECNO_GEN_MODEL__BASE_PATH_MODEL_CLASS:
				return BASE_PATH_MODEL_CLASS_EDEFAULT == null ? basePathModelClass != null : !BASE_PATH_MODEL_CLASS_EDEFAULT.equals(basePathModelClass);
			case EcnogenPackage.ECNO_GEN_MODEL__MODEL_CLASS_NAME:
				return MODEL_CLASS_NAME_EDEFAULT == null ? modelClassName != null : !MODEL_CLASS_NAME_EDEFAULT.equals(modelClassName);
			case EcnogenPackage.ECNO_GEN_MODEL__PACKAGE_ADAPTER_FACTORY_CLASS_NAME:
				return PACKAGE_ADAPTER_FACTORY_CLASS_NAME_EDEFAULT == null ? packageAdapterFactoryClassName != null : !PACKAGE_ADAPTER_FACTORY_CLASS_NAME_EDEFAULT.equals(packageAdapterFactoryClassName);
			case EcnogenPackage.ECNO_GEN_MODEL__REQUIRED:
				return required != null && !required.isEmpty();
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
		result.append(" (basePathECNOEvents: ");
		result.append(basePathECNOEvents);
		result.append(", basePathECNOAutomata: ");
		result.append(basePathECNOAutomata);
		result.append(", AutomataFactoryClassName: ");
		result.append(automataFactoryClassName);
		result.append(", basePathModelClass: ");
		result.append(basePathModelClass);
		result.append(", ModelClassName: ");
		result.append(modelClassName);
		result.append(", PackageAdapterFactoryClassName: ");
		result.append(packageAdapterFactoryClassName);
		result.append(')');
		return result.toString();
	}

} //ECNOGenModelImpl

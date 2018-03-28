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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import dk.dtu.compute.se.emf.processalgebra.ActionDef;
import dk.dtu.compute.se.emf.processalgebra.ProcessDefinition;
import dk.dtu.compute.se.emf.processalgebra.ProcessDefinitions;
import dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage;
import dk.dtu.compute.se.emf.processalgebra.Setting;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Definitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.dtu.compute.se.emf.processalgebra.impl.ProcessDefinitionsImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link dk.dtu.compute.se.emf.processalgebra.impl.ProcessDefinitionsImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link dk.dtu.compute.se.emf.processalgebra.impl.ProcessDefinitionsImpl#getSetting <em>Setting</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessDefinitionsImpl extends EObjectImpl implements ProcessDefinitions {
	/**
	 * The cached value of the '{@link #getDefinitions() <em>Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessDefinition> definitions;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionDef> actions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessDefinitionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessalgebraPackage.Literals.PROCESS_DEFINITIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessDefinition> getDefinitions() {
		if (definitions == null) {
			definitions = new EObjectContainmentWithInverseEList<ProcessDefinition>(ProcessDefinition.class, this, ProcessalgebraPackage.PROCESS_DEFINITIONS__DEFINITIONS, ProcessalgebraPackage.PROCESS_DEFINITION__OWNER);
		}
		return definitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionDef> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentWithInverseEList<ActionDef>(ActionDef.class, this, ProcessalgebraPackage.PROCESS_DEFINITIONS__ACTIONS, ProcessalgebraPackage.ACTION_DEF__PROCDEFS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Setting getSetting() {
		if (eContainerFeatureID() != ProcessalgebraPackage.PROCESS_DEFINITIONS__SETTING) return null;
		return (Setting)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetting(Setting newSetting, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSetting, ProcessalgebraPackage.PROCESS_DEFINITIONS__SETTING, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetting(Setting newSetting) {
		if (newSetting != eInternalContainer() || (eContainerFeatureID() != ProcessalgebraPackage.PROCESS_DEFINITIONS__SETTING && newSetting != null)) {
			if (EcoreUtil.isAncestor(this, newSetting))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSetting != null)
				msgs = ((InternalEObject)newSetting).eInverseAdd(this, ProcessalgebraPackage.SETTING__DEFINITIONS, Setting.class, msgs);
			msgs = basicSetSetting(newSetting, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessalgebraPackage.PROCESS_DEFINITIONS__SETTING, newSetting, newSetting));
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
			case ProcessalgebraPackage.PROCESS_DEFINITIONS__DEFINITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDefinitions()).basicAdd(otherEnd, msgs);
			case ProcessalgebraPackage.PROCESS_DEFINITIONS__ACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActions()).basicAdd(otherEnd, msgs);
			case ProcessalgebraPackage.PROCESS_DEFINITIONS__SETTING:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSetting((Setting)otherEnd, msgs);
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
			case ProcessalgebraPackage.PROCESS_DEFINITIONS__DEFINITIONS:
				return ((InternalEList<?>)getDefinitions()).basicRemove(otherEnd, msgs);
			case ProcessalgebraPackage.PROCESS_DEFINITIONS__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case ProcessalgebraPackage.PROCESS_DEFINITIONS__SETTING:
				return basicSetSetting(null, msgs);
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
			case ProcessalgebraPackage.PROCESS_DEFINITIONS__SETTING:
				return eInternalContainer().eInverseRemove(this, ProcessalgebraPackage.SETTING__DEFINITIONS, Setting.class, msgs);
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
			case ProcessalgebraPackage.PROCESS_DEFINITIONS__DEFINITIONS:
				return getDefinitions();
			case ProcessalgebraPackage.PROCESS_DEFINITIONS__ACTIONS:
				return getActions();
			case ProcessalgebraPackage.PROCESS_DEFINITIONS__SETTING:
				return getSetting();
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
			case ProcessalgebraPackage.PROCESS_DEFINITIONS__DEFINITIONS:
				getDefinitions().clear();
				getDefinitions().addAll((Collection<? extends ProcessDefinition>)newValue);
				return;
			case ProcessalgebraPackage.PROCESS_DEFINITIONS__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends ActionDef>)newValue);
				return;
			case ProcessalgebraPackage.PROCESS_DEFINITIONS__SETTING:
				setSetting((Setting)newValue);
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
			case ProcessalgebraPackage.PROCESS_DEFINITIONS__DEFINITIONS:
				getDefinitions().clear();
				return;
			case ProcessalgebraPackage.PROCESS_DEFINITIONS__ACTIONS:
				getActions().clear();
				return;
			case ProcessalgebraPackage.PROCESS_DEFINITIONS__SETTING:
				setSetting((Setting)null);
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
			case ProcessalgebraPackage.PROCESS_DEFINITIONS__DEFINITIONS:
				return definitions != null && !definitions.isEmpty();
			case ProcessalgebraPackage.PROCESS_DEFINITIONS__ACTIONS:
				return actions != null && !actions.isEmpty();
			case ProcessalgebraPackage.PROCESS_DEFINITIONS__SETTING:
				return getSetting() != null;
		}
		return super.eIsSet(featureID);
	}

} //ProcessDefinitionsImpl

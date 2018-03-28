/**
 */
package workflow.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import workflow.Case;
import workflow.CaseI;
import workflow.Document;
import workflow.ProcessAspect;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case I</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link workflow.impl.CaseIImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link workflow.impl.CaseIImpl#getCore <em>Core</em>}</li>
 *   <li>{@link workflow.impl.CaseIImpl#getCaseDocuments <em>Case Documents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CaseIImpl extends EObjectImpl implements CaseI {
	/**
	 * The cached value of the '{@link #getProcess() <em>Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	protected ProcessAspect process;

	/**
	 * The cached value of the '{@link #getCaseDocuments() <em>Case Documents</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseDocuments()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Document> caseDocuments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaseIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.CASE_I;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessAspect getProcess() {
		if (process != null && process.eIsProxy()) {
			InternalEObject oldProcess = (InternalEObject)process;
			process = (ProcessAspect)eResolveProxy(oldProcess);
			if (process != oldProcess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.CASE_I__PROCESS, oldProcess, process));
			}
		}
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessAspect basicGetProcess() {
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcess(ProcessAspect newProcess) {
		ProcessAspect oldProcess = process;
		process = newProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.CASE_I__PROCESS, oldProcess, process));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Case getCore() {
		if (eContainerFeatureID() != WorkflowPackage.CASE_I__CORE) return null;
		return (Case)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCore(Case newCore, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCore, WorkflowPackage.CASE_I__CORE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCore(Case newCore) {
		if (newCore != eInternalContainer() || (eContainerFeatureID() != WorkflowPackage.CASE_I__CORE && newCore != null)) {
			if (EcoreUtil.isAncestor(this, newCore))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCore != null)
				msgs = ((InternalEObject)newCore).eInverseAdd(this, WorkflowPackage.CASE__ASPECTS, Case.class, msgs);
			msgs = basicSetCore(newCore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.CASE_I__CORE, newCore, newCore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Document> getCaseDocuments() {
		if (caseDocuments == null) {
			caseDocuments = new EcoreEMap<String,Document>(WorkflowPackage.Literals.STRING2_DOCUMENT_MAP, String2DocumentMapImpl.class, this, WorkflowPackage.CASE_I__CASE_DOCUMENTS);
		}
		return caseDocuments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkflowPackage.CASE_I__CORE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCore((Case)otherEnd, msgs);
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
			case WorkflowPackage.CASE_I__CORE:
				return basicSetCore(null, msgs);
			case WorkflowPackage.CASE_I__CASE_DOCUMENTS:
				return ((InternalEList<?>)getCaseDocuments()).basicRemove(otherEnd, msgs);
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
			case WorkflowPackage.CASE_I__CORE:
				return eInternalContainer().eInverseRemove(this, WorkflowPackage.CASE__ASPECTS, Case.class, msgs);
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
			case WorkflowPackage.CASE_I__PROCESS:
				if (resolve) return getProcess();
				return basicGetProcess();
			case WorkflowPackage.CASE_I__CORE:
				return getCore();
			case WorkflowPackage.CASE_I__CASE_DOCUMENTS:
				if (coreType) return getCaseDocuments();
				else return getCaseDocuments().map();
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
			case WorkflowPackage.CASE_I__PROCESS:
				setProcess((ProcessAspect)newValue);
				return;
			case WorkflowPackage.CASE_I__CORE:
				setCore((Case)newValue);
				return;
			case WorkflowPackage.CASE_I__CASE_DOCUMENTS:
				((EStructuralFeature.Setting)getCaseDocuments()).set(newValue);
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
			case WorkflowPackage.CASE_I__PROCESS:
				setProcess((ProcessAspect)null);
				return;
			case WorkflowPackage.CASE_I__CORE:
				setCore((Case)null);
				return;
			case WorkflowPackage.CASE_I__CASE_DOCUMENTS:
				getCaseDocuments().clear();
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
			case WorkflowPackage.CASE_I__PROCESS:
				return process != null;
			case WorkflowPackage.CASE_I__CORE:
				return getCore() != null;
			case WorkflowPackage.CASE_I__CASE_DOCUMENTS:
				return caseDocuments != null && !caseDocuments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CaseIImpl

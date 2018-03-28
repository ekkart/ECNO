/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.genmodel.ecnogen;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ECNO Gen Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel#getEmfGenModel <em>Emf Gen Model</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel#getEcnoModel <em>Ecno Model</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel#getBasePathECNOEvents <em>Base Path ECNO Events</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel#getBasePathECNOAutomata <em>Base Path ECNO Automata</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel#getAutomataFactoryClassName <em>Automata Factory Class Name</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel#getBehaviourModel <em>Behaviour Model</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel#getBasePathModelClass <em>Base Path Model Class</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel#getModelClassName <em>Model Class Name</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel#getPackageAdapterFactoryClassName <em>Package Adapter Factory Class Name</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel#getRequired <em>Required</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.imm.se.ecno.genmodel.ecnogen.EcnogenPackage#getECNOGenModel()
 * @model
 * @generated
 */
public interface ECNOGenModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Emf Gen Model</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.codegen.ecore.genmodel.GenModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emf Gen Model</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emf Gen Model</em>' reference list.
	 * @see dk.dtu.imm.se.ecno.genmodel.ecnogen.EcnogenPackage#getECNOGenModel_EmfGenModel()
	 * @model
	 * @generated
	 */
	EList<GenModel> getEmfGenModel();

	/**
	 * Returns the value of the '<em><b>Ecno Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecno Model</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecno Model</em>' reference.
	 * @see #setEcnoModel(dk.dtu.imm.se.ecno.model.ecno.Package)
	 * @see dk.dtu.imm.se.ecno.genmodel.ecnogen.EcnogenPackage#getECNOGenModel_EcnoModel()
	 * @model
	 * @generated
	 */
	dk.dtu.imm.se.ecno.model.ecno.Package getEcnoModel();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel#getEcnoModel <em>Ecno Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ecno Model</em>' reference.
	 * @see #getEcnoModel()
	 * @generated
	 */
	void setEcnoModel(dk.dtu.imm.se.ecno.model.ecno.Package value);

	/**
	 * Returns the value of the '<em><b>Base Path ECNO Events</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Path ECNO Events</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Path ECNO Events</em>' attribute.
	 * @see #setBasePathECNOEvents(String)
	 * @see dk.dtu.imm.se.ecno.genmodel.ecnogen.EcnogenPackage#getECNOGenModel_BasePathECNOEvents()
	 * @model
	 * @generated
	 */
	String getBasePathECNOEvents();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel#getBasePathECNOEvents <em>Base Path ECNO Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Path ECNO Events</em>' attribute.
	 * @see #getBasePathECNOEvents()
	 * @generated
	 */
	void setBasePathECNOEvents(String value);

	/**
	 * Returns the value of the '<em><b>Base Path ECNO Automata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Path ECNO Automata</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Path ECNO Automata</em>' attribute.
	 * @see #setBasePathECNOAutomata(String)
	 * @see dk.dtu.imm.se.ecno.genmodel.ecnogen.EcnogenPackage#getECNOGenModel_BasePathECNOAutomata()
	 * @model
	 * @generated
	 */
	String getBasePathECNOAutomata();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel#getBasePathECNOAutomata <em>Base Path ECNO Automata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Path ECNO Automata</em>' attribute.
	 * @see #getBasePathECNOAutomata()
	 * @generated
	 */
	void setBasePathECNOAutomata(String value);

	/**
	 * Returns the value of the '<em><b>Automata Factory Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Automata Factory Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Automata Factory Class Name</em>' attribute.
	 * @see #setAutomataFactoryClassName(String)
	 * @see dk.dtu.imm.se.ecno.genmodel.ecnogen.EcnogenPackage#getECNOGenModel_AutomataFactoryClassName()
	 * @model
	 * @generated
	 */
	String getAutomataFactoryClassName();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel#getAutomataFactoryClassName <em>Automata Factory Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automata Factory Class Name</em>' attribute.
	 * @see #getAutomataFactoryClassName()
	 * @generated
	 */
	void setAutomataFactoryClassName(String value);

	/**
	 * Returns the value of the '<em><b>Behaviour Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behaviour Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviour Model</em>' reference.
	 * @see #setBehaviourModel(EObject)
	 * @see dk.dtu.imm.se.ecno.genmodel.ecnogen.EcnogenPackage#getECNOGenModel_BehaviourModel()
	 * @model
	 * @generated
	 */
	EObject getBehaviourModel();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel#getBehaviourModel <em>Behaviour Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behaviour Model</em>' reference.
	 * @see #getBehaviourModel()
	 * @generated
	 */
	void setBehaviourModel(EObject value);

	/**
	 * Returns the value of the '<em><b>Base Path Model Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Path Model Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Path Model Class</em>' attribute.
	 * @see #setBasePathModelClass(String)
	 * @see dk.dtu.imm.se.ecno.genmodel.ecnogen.EcnogenPackage#getECNOGenModel_BasePathModelClass()
	 * @model
	 * @generated
	 */
	String getBasePathModelClass();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel#getBasePathModelClass <em>Base Path Model Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Path Model Class</em>' attribute.
	 * @see #getBasePathModelClass()
	 * @generated
	 */
	void setBasePathModelClass(String value);

	/**
	 * Returns the value of the '<em><b>Model Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Class Name</em>' attribute.
	 * @see #setModelClassName(String)
	 * @see dk.dtu.imm.se.ecno.genmodel.ecnogen.EcnogenPackage#getECNOGenModel_ModelClassName()
	 * @model
	 * @generated
	 */
	String getModelClassName();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel#getModelClassName <em>Model Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Class Name</em>' attribute.
	 * @see #getModelClassName()
	 * @generated
	 */
	void setModelClassName(String value);

	/**
	 * Returns the value of the '<em><b>Package Adapter Factory Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Adapter Factory Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Adapter Factory Class Name</em>' attribute.
	 * @see #setPackageAdapterFactoryClassName(String)
	 * @see dk.dtu.imm.se.ecno.genmodel.ecnogen.EcnogenPackage#getECNOGenModel_PackageAdapterFactoryClassName()
	 * @model
	 * @generated
	 */
	String getPackageAdapterFactoryClassName();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel#getPackageAdapterFactoryClassName <em>Package Adapter Factory Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Adapter Factory Class Name</em>' attribute.
	 * @see #getPackageAdapterFactoryClassName()
	 * @generated
	 */
	void setPackageAdapterFactoryClassName(String value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' reference list.
	 * The list contents are of type {@link dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' reference list.
	 * @see dk.dtu.imm.se.ecno.genmodel.ecnogen.EcnogenPackage#getECNOGenModel_Required()
	 * @model
	 * @generated
	 */
	EList<ECNOGenModel> getRequired();

} // ECNOGenModel

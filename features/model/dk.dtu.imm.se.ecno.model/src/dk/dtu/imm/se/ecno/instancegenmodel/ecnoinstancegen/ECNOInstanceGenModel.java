/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen;

import dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ECNO Instance Gen Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.ECNOInstanceGenModel#getInstance <em>Instance</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.ECNOInstanceGenModel#getEcnoGenModel <em>Ecno Gen Model</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.ECNOInstanceGenModel#getBasePathECNOInstance <em>Base Path ECNO Instance</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.ECNOInstanceGenModel#getInstanceClassName <em>Instance Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.EcnoinstancegenPackage#getECNOInstanceGenModel()
 * @model
 * @generated
 */
public interface ECNOInstanceGenModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' reference.
	 * @see #setInstance(EObject)
	 * @see dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.EcnoinstancegenPackage#getECNOInstanceGenModel_Instance()
	 * @model
	 * @generated
	 */
	EObject getInstance();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.ECNOInstanceGenModel#getInstance <em>Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' reference.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(EObject value);

	/**
	 * Returns the value of the '<em><b>Ecno Gen Model</b></em>' reference list.
	 * The list contents are of type {@link dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecno Gen Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecno Gen Model</em>' reference list.
	 * @see dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.EcnoinstancegenPackage#getECNOInstanceGenModel_EcnoGenModel()
	 * @model
	 * @generated
	 */
	EList<ECNOGenModel> getEcnoGenModel();

	/**
	 * Returns the value of the '<em><b>Base Path ECNO Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Path ECNO Instance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Path ECNO Instance</em>' attribute.
	 * @see #setBasePathECNOInstance(String)
	 * @see dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.EcnoinstancegenPackage#getECNOInstanceGenModel_BasePathECNOInstance()
	 * @model
	 * @generated
	 */
	String getBasePathECNOInstance();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.ECNOInstanceGenModel#getBasePathECNOInstance <em>Base Path ECNO Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Path ECNO Instance</em>' attribute.
	 * @see #getBasePathECNOInstance()
	 * @generated
	 */
	void setBasePathECNOInstance(String value);

	/**
	 * Returns the value of the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Class Name</em>' attribute.
	 * @see #setInstanceClassName(String)
	 * @see dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.EcnoinstancegenPackage#getECNOInstanceGenModel_InstanceClassName()
	 * @model
	 * @generated
	 */
	String getInstanceClassName();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.ECNOInstanceGenModel#getInstanceClassName <em>Instance Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Class Name</em>' attribute.
	 * @see #getInstanceClassName()
	 * @generated
	 */
	void setInstanceClassName(String value);

} // ECNOInstanceGenModel

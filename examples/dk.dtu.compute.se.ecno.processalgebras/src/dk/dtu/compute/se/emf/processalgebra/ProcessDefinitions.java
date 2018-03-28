/**
 */
package dk.dtu.compute.se.emf.processalgebra;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Definitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.compute.se.emf.processalgebra.ProcessDefinitions#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link dk.dtu.compute.se.emf.processalgebra.ProcessDefinitions#getActions <em>Actions</em>}</li>
 *   <li>{@link dk.dtu.compute.se.emf.processalgebra.ProcessDefinitions#getSetting <em>Setting</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage#getProcessDefinitions()
 * @model
 * @generated
 */
public interface ProcessDefinitions extends EObject {
	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link dk.dtu.compute.se.emf.processalgebra.ProcessDefinition}.
	 * It is bidirectional and its opposite is '{@link dk.dtu.compute.se.emf.processalgebra.ProcessDefinition#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitions</em>' containment reference list.
	 * @see dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage#getProcessDefinitions_Definitions()
	 * @see dk.dtu.compute.se.emf.processalgebra.ProcessDefinition#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<ProcessDefinition> getDefinitions();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link dk.dtu.compute.se.emf.processalgebra.ActionDef}.
	 * It is bidirectional and its opposite is '{@link dk.dtu.compute.se.emf.processalgebra.ActionDef#getProcdefs <em>Procdefs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage#getProcessDefinitions_Actions()
	 * @see dk.dtu.compute.se.emf.processalgebra.ActionDef#getProcdefs
	 * @model opposite="procdefs" containment="true"
	 * @generated
	 */
	EList<ActionDef> getActions();

	/**
	 * Returns the value of the '<em><b>Setting</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dk.dtu.compute.se.emf.processalgebra.Setting#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setting</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setting</em>' container reference.
	 * @see #setSetting(Setting)
	 * @see dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage#getProcessDefinitions_Setting()
	 * @see dk.dtu.compute.se.emf.processalgebra.Setting#getDefinitions
	 * @model opposite="definitions" transient="false"
	 * @generated
	 */
	Setting getSetting();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.se.emf.processalgebra.ProcessDefinitions#getSetting <em>Setting</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setting</em>' container reference.
	 * @see #getSetting()
	 * @generated
	 */
	void setSetting(Setting value);

} // ProcessDefinitions

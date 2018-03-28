/**
 */
package dk.dtu.compute.se.emf.processalgebra;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.compute.se.emf.processalgebra.ActionDef#getName <em>Name</em>}</li>
 *   <li>{@link dk.dtu.compute.se.emf.processalgebra.ActionDef#getUses <em>Uses</em>}</li>
 *   <li>{@link dk.dtu.compute.se.emf.processalgebra.ActionDef#getProcdefs <em>Procdefs</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage#getActionDef()
 * @model
 * @generated
 */
public interface ActionDef extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage#getActionDef_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.se.emf.processalgebra.ActionDef#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Uses</b></em>' reference list.
	 * The list contents are of type {@link dk.dtu.compute.se.emf.processalgebra.Action}.
	 * It is bidirectional and its opposite is '{@link dk.dtu.compute.se.emf.processalgebra.Action#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' reference list.
	 * @see dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage#getActionDef_Uses()
	 * @see dk.dtu.compute.se.emf.processalgebra.Action#getAction
	 * @model opposite="action"
	 * @generated
	 */
	EList<Action> getUses();

	/**
	 * Returns the value of the '<em><b>Procdefs</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dk.dtu.compute.se.emf.processalgebra.ProcessDefinitions#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procdefs</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procdefs</em>' container reference.
	 * @see #setProcdefs(ProcessDefinitions)
	 * @see dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage#getActionDef_Procdefs()
	 * @see dk.dtu.compute.se.emf.processalgebra.ProcessDefinitions#getActions
	 * @model opposite="actions" transient="false"
	 * @generated
	 */
	ProcessDefinitions getProcdefs();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.se.emf.processalgebra.ActionDef#getProcdefs <em>Procdefs</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procdefs</em>' container reference.
	 * @see #getProcdefs()
	 * @generated
	 */
	void setProcdefs(ProcessDefinitions value);

} // ActionDef

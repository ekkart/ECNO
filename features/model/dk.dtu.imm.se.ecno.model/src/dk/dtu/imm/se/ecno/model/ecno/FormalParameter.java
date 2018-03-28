/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.model.ecno;

import dk.dtu.imm.se.ecno.core.IFormalParameter;
import org.eclipse.emf.ecore.EParameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formal Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.FormalParameter#getLabel <em>Label</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.FormalParameter#isCollective <em>Collective</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getFormalParameter()
 * @model superTypes="org.eclipse.emf.ecore.EParameter dk.dtu.imm.se.ecno.model.ecno.IFormalParameter"
 * @generated
 */
public interface FormalParameter extends EParameter, IFormalParameter {

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getFormalParameter_Label()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Returns the value of the '<em><b>Collective</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collective</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collective</em>' attribute.
	 * @see #setCollective(boolean)
	 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getFormalParameter_Collective()
	 * @model default="false"
	 * @generated
	 */
	boolean isCollective();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.model.ecno.FormalParameter#isCollective <em>Collective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collective</em>' attribute.
	 * @see #isCollective()
	 * @generated
	 */
	void setCollective(boolean value);
} // FormalParameter

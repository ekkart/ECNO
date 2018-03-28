/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.compute.se.emf.processalgebra;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Inst</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.compute.se.emf.processalgebra.SequenceInst#getRemainder <em>Remainder</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage#getSequenceInst()
 * @model
 * @generated
 */
public interface SequenceInst extends ProcessInstance {

	/**
	 * Returns the value of the '<em><b>Remainder</b></em>' reference list.
	 * The list contents are of type {@link dk.dtu.compute.se.emf.processalgebra.Process}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remainder</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remainder</em>' reference list.
	 * @see dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage#getSequenceInst_Remainder()
	 * @model
	 * @generated
	 */
	EList<dk.dtu.compute.se.emf.processalgebra.Process> getRemainder();
} // SequenceInst

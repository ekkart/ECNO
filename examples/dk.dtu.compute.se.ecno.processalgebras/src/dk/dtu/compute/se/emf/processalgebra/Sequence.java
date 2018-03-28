/**
 */
package dk.dtu.compute.se.emf.processalgebra;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage#getSequence()
 * @model
 * @generated
 */
public interface Sequence extends Composite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='dk.dtu.compute.se.emf.processalgebra.SequenceInst instance = dk.dtu.compute.se.emf.processalgebra.ProcessalgebraFactory.eINSTANCE.createSequenceInst();\r\nif (!this.getSubprocess().isEmpty()) {\r\n\tinstance.getChild().add(this.getSubprocess().get(0).createInstance());\r\n}\r\nfor (int i = 1; i < this.getSubprocess().size(); i++) {\r\n\tinstance.getRemainder().add( this.getSubprocess().get(i));\r\n}\r\nreturn instance;'"
	 * @generated
	 */
	ProcessInstance createInstance();
} // Sequence

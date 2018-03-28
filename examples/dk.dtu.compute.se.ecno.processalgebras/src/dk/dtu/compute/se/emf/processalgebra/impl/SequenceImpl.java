/**
 */
package dk.dtu.compute.se.emf.processalgebra.impl;

import org.eclipse.emf.ecore.EClass;

import dk.dtu.compute.se.emf.processalgebra.ProcessInstance;
import dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage;
import dk.dtu.compute.se.emf.processalgebra.Sequence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SequenceImpl extends CompositeImpl implements Sequence {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessalgebraPackage.Literals.SEQUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessInstance createInstance() {
		dk.dtu.compute.se.emf.processalgebra.SequenceInst instance = dk.dtu.compute.se.emf.processalgebra.ProcessalgebraFactory.eINSTANCE.createSequenceInst();
		if (!this.getSubprocess().isEmpty()) {
			instance.getChild().add(this.getSubprocess().get(0).createInstance());
		}
		for (int i = 1; i < this.getSubprocess().size(); i++) {
			instance.getRemainder().add( this.getSubprocess().get(i));
		}
		return instance;
	}

} //SequenceImpl

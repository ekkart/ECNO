/**
 * This is an automatically generated class. It was generated by the
 * Petri net component of the ECNO framework. This class defines
 * the behaviour of a element, as defined by the Petri net.
 */
package dk.dtu.compute.se.ecno.processalgebras.localbehaviour;

import dk.dtu.imm.se.ecno.engine.ExecutionEngine;

import dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage;
import dk.dtu.imm.se.ecno.model.adapter.EMFBehaviourAdaptor;
import dk.dtu.imm.se.ecno.model.runtime.SimpleEMFBehaviour;

public class ProcessAlgebraBehaviourFactory extends EMFBehaviourAdaptor {

	public ProcessAlgebraBehaviourFactory(ExecutionEngine engine) {
		super(engine);		
		this.addElementBehaviour(ProcessalgebraPackage.eINSTANCE.getProcessDefinitions(), ProcessDefinitions.class);		
		this.addElementBehaviour(ProcessalgebraPackage.eINSTANCE.getProcessDefinition(), ProcessDefinition.class);		
		this.addElementBehaviour(ProcessalgebraPackage.eINSTANCE.getActionDef(), ActionDef.class);		
		this.addElementBehaviour(ProcessalgebraPackage.eINSTANCE.getAction(), Action.class);		
		this.addElementBehaviour(ProcessalgebraPackage.eINSTANCE.getActionInst(), ActionInst.class);		
		this.addElementBehaviour(ProcessalgebraPackage.eINSTANCE.getProcessInstance(), ProcessInstance.class);		
		this.addElementBehaviour(ProcessalgebraPackage.eINSTANCE.getSequenceInst(), SequenceInst.class);		
		this.addElementBehaviour(ProcessalgebraPackage.eINSTANCE.getParallelInst(), ParallelInst.class);		
		this.addElementBehaviour(ProcessalgebraPackage.eINSTANCE.getChoiceInst(), ChoiceInst.class);		
		this.addElementBehaviour(ProcessalgebraPackage.eINSTANCE.getHideInst(), HideInst.class);		
		
		this.addPackage(ProcessalgebraPackage.eINSTANCE, SimpleEMFBehaviour.class);
	}

}
/**
 * This is an automatically generated class. It was generated by the
 * Petri net component of the ECNO framework. This class defines
 * the behaviour of a element, as defined by the Petri net.
 */
package dk.dtu.imm.se.ecno.example.petrinets.automata;

import dk.dtu.imm.se.ecno.engine.ExecutionEngine;

import PetriNets.PetriNetsPackage;
import dk.dtu.imm.se.ecno.model.adapter.EMFBehaviourAdaptor;
import dk.dtu.imm.se.ecno.model.runtime.SimpleEMFBehaviour;

public class PetrinetsBehaviour extends EMFBehaviourAdaptor {

	public PetrinetsBehaviour(ExecutionEngine engine) {
		super(engine);		
		this.addElementBehaviour(PetriNetsPackage.eINSTANCE.getTransition(), Transition.class);		
		this.addElementBehaviour(PetriNetsPackage.eINSTANCE.getArc(), Arc.class);		
		this.addElementBehaviour(PetriNetsPackage.eINSTANCE.getPlace(), Place.class);		
		this.addElementBehaviour(PetriNetsPackage.eINSTANCE.getToken(), Token.class);		
		
		this.addPackage(PetriNetsPackage.eINSTANCE, SimpleEMFBehaviour.class);
	}

}
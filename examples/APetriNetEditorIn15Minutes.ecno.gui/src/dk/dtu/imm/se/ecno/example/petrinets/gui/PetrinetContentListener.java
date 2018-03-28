package dk.dtu.imm.se.ecno.example.petrinets.gui;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;

import PetriNets.PetriNetsPackage;
import PetriNets.Transition;

import dk.dtu.imm.se.ecno.engine.ExecutionEngine;

/**
 * Listener that propagates the addition and removal of transitions to and
 * from the Petri net to the ECNO execution engine (so that the GUI can
 * be updated with the corresponding buttons).
 * 
 * @author Ekkart Kindler, ekki@dtu.dk
 *
 */
public class PetrinetContentListener extends EContentAdapter {

	private ExecutionEngine engine;

	public PetrinetContentListener(ExecutionEngine engine) {
		super();
		this.engine = engine;
	}

	@Override
	public void notifyChanged(Notification notification) {
		if (notification.getFeature() == PetriNetsPackage.eINSTANCE.getPetriNet_Object()) {
			if (notification.getEventType() == Notification.ADD) {
				Object newObject = notification.getNewValue();
				if (newObject instanceof Transition) {
					engine.addElement(newObject);
				}
			} else if (notification.getEventType() == Notification.REMOVE) {
				Object oldObject = notification.getOldValue();
				if (oldObject instanceof Transition) {
					engine.removeElement(oldObject);
				}
			}
		}
	}

}

package dk.dtu.imm.se.ecno.example.workers.controller;

import org.eclipse.emf.ecore.EObject;

import dk.dtu.imm.se.ecno.core.IPackageAdapter;
import dk.dtu.imm.se.ecno.eclipse.configurators.IControllerConfigurator;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ControllerState;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ObjectReference;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.examples.workers.coordination.WorkersModel;
import dk.dtu.imm.se.ecno.examples.workers.gui.WorkersGUI;

/**
 * This is a controller configurator, which installs the worklist GUI.
 * 
 * @author Ekkart Kindler, ekki@dtu.dk
 *
 */
public class WorkersConfigurator implements IControllerConfigurator {

	@Override
	public void initializeControllers(ExecutionEngine engine,
			ControllerState state) {
		if (state instanceof ObjectReference) {
			EObject object = ((ObjectReference) state).getObject();
			IPackageAdapter adapter = engine.getPackageAdapter(object);
			if (adapter instanceof WorkersModel) {
				engine.addController(new WorkersGUI(engine, (WorkersModel) adapter));
				// engine.addController(this);
				return;
			}
		}
		
		throw new IllegalArgumentException();
	}

}

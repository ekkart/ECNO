package dk.dtu.imm.se.ecno.eclipse.configurators;

import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ControllerState;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;

public interface IControllerConfigurator {
	
	public void initializeControllers(ExecutionEngine engine, ControllerState state);

}

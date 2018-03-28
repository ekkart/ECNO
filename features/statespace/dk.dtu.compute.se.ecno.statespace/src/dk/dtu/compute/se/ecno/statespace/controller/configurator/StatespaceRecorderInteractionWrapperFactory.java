package dk.dtu.compute.se.ecno.statespace.controller.configurator;

import org.eclipse.emf.ecore.EObject;

import dk.dtu.compute.se.ecno.statespace.StateSpace;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.engine.IInteractionCommandWrapperFactory;
import dk.dtu.imm.se.ecno.runtime.IInteractionExecutionCommand;

public class StatespaceRecorderInteractionWrapperFactory implements
		IInteractionCommandWrapperFactory {
	
	private ExecutionEngine engine;
	private StateSpace statespace;
	private EObject container;

	public StatespaceRecorderInteractionWrapperFactory(ExecutionEngine engine, StateSpace statespace, EObject container) {
		super();
		this.engine = engine;
		this.statespace = statespace;
		this.container = container;
	}

	@Override
	public IInteractionExecutionCommand wrapInteractionCommand(
			IInteractionExecutionCommand command) {
		return new StateSpaceRecorderInteractionCommandWrapper(
				engine,
				command,
				statespace,
				container); 
	}

}

package dk.dtu.imm.se.ecno.engine;

import dk.dtu.imm.se.ecno.runtime.IInteractionExecutionCommand;

public interface IInteractionCommandWrapperFactory {
	
	public IInteractionExecutionCommand wrapInteractionCommand(IInteractionExecutionCommand command);

}

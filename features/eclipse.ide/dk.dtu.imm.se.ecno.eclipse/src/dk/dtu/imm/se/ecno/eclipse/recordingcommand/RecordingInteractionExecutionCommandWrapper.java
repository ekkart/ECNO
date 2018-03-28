package dk.dtu.imm.se.ecno.eclipse.recordingcommand;

import dk.dtu.imm.se.ecno.eclipse.enginesregistry.EngineWrapper;
import dk.dtu.imm.se.ecno.engine.IInteractionCommandWrapperFactory;
import dk.dtu.imm.se.ecno.runtime.IInteractionExecutionCommand;

public class RecordingInteractionExecutionCommandWrapper implements
		IInteractionCommandWrapperFactory {

	private EngineWrapper engineWrapper;
	
	public RecordingInteractionExecutionCommandWrapper(
			EngineWrapper engineWrapper) {
		super();
		this.engineWrapper = engineWrapper;
	}

	@Override
	public IInteractionExecutionCommand wrapInteractionCommand(
			IInteractionExecutionCommand command) {
		return new RecordingInteractionExecutionCommand(engineWrapper, command);
	}

}

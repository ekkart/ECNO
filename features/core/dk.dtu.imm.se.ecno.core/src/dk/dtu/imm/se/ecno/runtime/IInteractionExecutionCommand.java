package dk.dtu.imm.se.ecno.runtime;

public interface IInteractionExecutionCommand {
	
	public Interaction getInteraction();
	
	public void doExecute() throws InvalidStateException;

}

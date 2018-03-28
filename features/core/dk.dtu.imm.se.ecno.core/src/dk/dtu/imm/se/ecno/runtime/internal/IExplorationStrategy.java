package dk.dtu.imm.se.ecno.runtime.internal;

public interface IExplorationStrategy {
	
	public boolean isEmpty();
	
	public void add(InteractionComputation computation);
	
	public InteractionComputation remove();
	
	public void discard(InteractionComputation computation);

}

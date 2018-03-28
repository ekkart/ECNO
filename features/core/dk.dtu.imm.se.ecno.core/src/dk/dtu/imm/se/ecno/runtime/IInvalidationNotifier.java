package dk.dtu.imm.se.ecno.runtime;


public interface IInvalidationNotifier {
	
	public void registerListener(IInvalidationListener listener) throws InvalidStateException;
	
	public void unregisterListener(IInvalidationListener listener);

}

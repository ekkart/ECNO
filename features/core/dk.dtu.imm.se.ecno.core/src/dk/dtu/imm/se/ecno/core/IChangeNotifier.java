package dk.dtu.imm.se.ecno.core;

public interface IChangeNotifier {
	
	public void registerListener(IChangeListener listener);
	
	public void unregisterListener(IChangeListener listener);

}

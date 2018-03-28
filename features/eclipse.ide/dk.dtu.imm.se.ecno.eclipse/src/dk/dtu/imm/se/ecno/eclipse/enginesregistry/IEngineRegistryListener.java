package dk.dtu.imm.se.ecno.eclipse.enginesregistry;

public interface IEngineRegistryListener {
	
	public void add(EngineWrapper application);
	
	public void remove(EngineWrapper application);
	
	public void update(EngineWrapper application);

}

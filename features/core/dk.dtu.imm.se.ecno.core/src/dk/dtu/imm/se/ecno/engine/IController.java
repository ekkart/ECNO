package dk.dtu.imm.se.ecno.engine;

public interface IController {
	
	public void addElement(Object element);
	
	public void removeElement(Object element);
	
	public void elementEncountered(Object element); 
	
	public void dispose();

}

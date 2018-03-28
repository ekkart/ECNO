package dk.dtu.imm.se.ecno.core;

public interface IFormalParameter  {
		
	public String getName();
	
    public Class<?> getType();
    
    public boolean isCollective();
    
}

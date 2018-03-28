package dk.dtu.imm.se.ecno.pn.model;

import dk.dtu.imm.se.ecno.core.IFormalParameter;
import dk.dtu.imm.se.ecno.runtime.Parameter;

public class FormalParameter implements IFormalParameter {
		
	private String name;
	private Class<?> type;
	private boolean collective;

	public FormalParameter(String name, Class<?> type, boolean collective) {
		this.name = name;
		this.type = type;
		this.collective = collective;
	}
	
	public FormalParameter(String name, Class<?> type) {
		this(name,type,false);
	}
	
    public String getName() {
    	return name;
    }
	
	public Class<?> getType() {
		return type;
	}
	
	public boolean isCollective() {
		return collective;
	}
	
	public Parameter createParameter() {
		return new Parameter(this);
	}

}

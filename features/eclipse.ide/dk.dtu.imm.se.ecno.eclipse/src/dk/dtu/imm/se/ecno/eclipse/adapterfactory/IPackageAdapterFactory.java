package dk.dtu.imm.se.ecno.eclipse.adapterfactory;

import dk.dtu.imm.se.ecno.core.IPackageAdapter;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;

public interface IPackageAdapterFactory {
	
	public IPackageAdapter getModel(ExecutionEngine engine);
	
	public String getECNOPackageURI(); 

}

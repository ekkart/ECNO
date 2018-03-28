package coded.util;


import workflow.coordination.WorkflowEcnoModel;
import dk.dtu.imm.se.ecno.eclipse.adapterfactory.IPackageAdapterFactory;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;

//  TODO add this to code generator
//       also  add this class to the plugins (as an adapter factory
//       for the ECNO Execution Engine
public class WorkflowModelFactory implements IPackageAdapterFactory {
	
	public WorkflowEcnoModel getModel(ExecutionEngine engine) {
		return WorkflowEcnoModel.getModel(engine);
	}
	
	public String getECNOPackageURI() {
		return "dk.dtu.imm.se.ecno.workflow.engine";
	}

}
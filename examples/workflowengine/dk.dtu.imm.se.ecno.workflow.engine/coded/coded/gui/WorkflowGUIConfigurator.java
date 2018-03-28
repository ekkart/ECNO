package coded.gui;

import java.util.List;

import workflow.Case;
import workflow.CoreModel;
import workflow.ModelRegistry;
import workflow.RuntimeCoreModel;
import workflow.coordination.WorkflowEcnoModel;
import coded.util.ProcessUtil;
import dk.dtu.imm.se.ecno.core.IPackageAdapter;
import dk.dtu.imm.se.ecno.eclipse.configurators.IControllerConfigurator;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ControllerState;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ObjectReference;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;

public class WorkflowGUIConfigurator implements IControllerConfigurator {

	ProcessUtil util = coded.util.ProcessUtil.getInstance();
	
	@Override
	public void initializeControllers(ExecutionEngine engine,
			ControllerState state) {
		
		List<IPackageAdapter> adapters = engine.getPackageAdapters();
 		WorkflowEcnoModel workflowAdapter = null;
		
		for (IPackageAdapter adapter: adapters) {
			if (adapter instanceof WorkflowEcnoModel) {
				workflowAdapter = (WorkflowEcnoModel) adapter;
			}
		}
		
		if (workflowAdapter != null) {
			
			/* Start some controllers */

			
			
			new AgentTerminalGUI(engine, workflowAdapter);
			// ekki@dtu.dk, 4. 2. 2014: Implemented a button for the user to
			//    create a new AgentTerminalGUI; so, we do not need to create
			//    additional AgentTerminalGUIs in advance.
			//    
			// new AgentTerminalGUI(engine, workflowAdapter);
			// new AgentTerminalGUI(engine, workflowAdapter);
			
			/* Make sure all added processes have exactly one case in init state */

			workflow.ModelRegistry modelRegistry = (ModelRegistry) ((ObjectReference)state).getObject();
			List<workflow.CoreModel> coreModels = modelRegistry.getCoreModels();
			
			for (CoreModel coreModel : coreModels) {

				workflow.Process process = coreModel.getProcess();

				// Assume first that a case must be initialized 

				boolean initCaseNeeded = true; 

				List<RuntimeCoreModel> runtimeCoreModels = modelRegistry.getEngine().getRuntimeCoreModels();

				// TODO: Maybe check for null here. 

				RuntimeCoreModel runtimeCoreModel = null;

				for (RuntimeCoreModel ite : runtimeCoreModels) {
					if (ite.getCoreModel() == coreModel)
						runtimeCoreModel = ite;
				}

				// TODO: Maybe check for null here. 

				for (Case case_ : runtimeCoreModel.getCases())  {

					if (case_.getProcess() == process && !case_.isStarted())
						initCaseNeeded = false;

				}

				// If the assumption was true, initialize a new case

				util.createCase(engine, process);
				//coded.util.ProcessUtil.getInstance().createCase(engine, process);

			}
			


		} else {
			throw new RuntimeException("WorkflowAdapter not registered");
		}



	}

}




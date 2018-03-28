package coded.util;

import workflow.Agent;
import workflow.AgentContainer;
import workflow.Case;
import workflow.CaseC;
import workflow.CaseI;
import workflow.CaseO;
import workflow.CoreModel;
import workflow.Information;
import workflow.InformationRuntimeAspect;
import workflow.Marking;
import workflow.PetriNet;
import workflow.Place;
import workflow.Process;
import workflow.ProcessAspect;
import workflow.ProcessO;
import workflow.Role;
import workflow.RuntimeCoreModel;
import workflow.RuntimeGlobalAspect;
import workflow.RuntimeModelAspect;
import workflow.Token;
import workflow.WorkflowEngine;
import workflow.WorkflowFactory;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;


public class ProcessUtil {
	
	private static ProcessUtil instance;

	final WorkflowFactory factory = WorkflowFactory.eINSTANCE;
	
	public static ProcessUtil getInstance()  {
		if (instance != null)
			return instance;
		else 
			return new ProcessUtil();
		
	}

	public void createCase(ExecutionEngine engine, Process process) {
		
		/* TODO: Part of the model validation taking place here could be done via the editor */
		
		/* We assume the workflow engine element is there, e.g. the modeling user must have created it manually
		 * and made the required references to the ModelRegistry */
		
		WorkflowEngine workflowEngine = process.getCoreModel().getModelRegistry().getEngine();
		CoreModel coreModel = process.getCoreModel();
		
		/* The first time this method is called, there may not be a RuntimeCodeModel attached to the engine which
		 * have a reference to this particular process. That is the first thing to check:
		 */
		
		RuntimeCoreModel runtimeCoreModel = null;
		for (RuntimeCoreModel ite : workflowEngine.getRuntimeCoreModels()) {
			if (ite.getCoreModel() == coreModel)
				runtimeCoreModel = ite;
		}
		
		/* If the RuntimeCoreModel was not found for this process, we create it and attach it, before adding 
		 * the runtimeAspectModels to it, corresponding to the static aspects in the model: */
	
		if (runtimeCoreModel == null) {
			runtimeCoreModel = factory.createRuntimeCoreModel();
			workflowEngine.getRuntimeCoreModels().add(runtimeCoreModel);
			runtimeCoreModel.setCoreModel(process.getCoreModel());
		} 
			
		/* At this point, the runtime model could still be invalid if the modeling user created the RuntimeCoreModel but
		 * forgot to add one or more RuntimeAspects, so first we check if they exist.
		 */
		
		//OrganisationRuntimeAspect organisationRuntimeAspect = null;
		// ControlRuntimeAspect not used.
		InformationRuntimeAspect informationRuntimeAspect = null;
	
		for (RuntimeModelAspect runtimeModelAspect : runtimeCoreModel.getAspects()) {
			//if (runtimeModelAspect instanceof OrganisationRuntimeAspect) 
				//organisationRuntimeAspect = (OrganisationRuntimeAspect) runtimeModelAspect;
			if (runtimeModelAspect instanceof InformationRuntimeAspect) 
				informationRuntimeAspect = (InformationRuntimeAspect) runtimeModelAspect;
		}
		
		/* If a RuntimeModelAspect was missing it is created */
		
		//if (organisationRuntimeAspect == null)
			//runtimeCoreModel.getAspects().add(factory.createOrganisationRuntimeAspect());
		if (informationRuntimeAspect == null)
			runtimeCoreModel.getAspects().add(factory.createInformationRuntimeAspect());
		

		// Core
		
		
		Case case_ = factory.createCase();
		case_.setStarted(false);
		case_.setFinished(false);
		case_.setProcess(process);
		runtimeCoreModel.getCases().add(case_);
		case_.setId(runtimeCoreModel.getCases().size());
		
		
		
		// Control
		
		CaseC caseC = factory.createCaseC();
		case_.getAspects().add(caseC);
				
		Marking marking = factory.createMarking();
		caseC.setState(marking);
		
		for (ProcessAspect aspect : process.getAspects()) {
			if (aspect instanceof PetriNet) { // So far, the only known implementation of Control is PetriNet
				PetriNet petrinet = (PetriNet)aspect;
				Place initPlace = petrinet.getStart();
				Token token = factory.createToken();
				token.setPlace(initPlace);
				marking.getTokens().add(token);
				marking.setPetrinet(petrinet);
			}
		}
		
		// Organisation
		
		ProcessO processO = null;
		for (ProcessAspect aspect : process.getAspects()) {
			if (aspect instanceof ProcessO) { // So far, the only known implementation of Control is PetriNet
				processO = (ProcessO) aspect;
			}
		}
		
		CaseO caseO = factory.createCaseO();
		case_.getAspects().add(caseO);
		
		/* Involve agents that have roles which the model involves. 
		 * TODO: Find an optimized way to calculate this, and/or make 
		 * the problem more simple. 
		 */
		
		for (RuntimeGlobalAspect runtimeGlobalAspect : workflowEngine.getRuntimeGlobalAspects()) {
			if (runtimeGlobalAspect instanceof AgentContainer)  {
				AgentContainer agentContainer = (AgentContainer)runtimeGlobalAspect;
				for (Agent agent : agentContainer.getAgents()) {
					for (Role processRole : processO.getInvolved()) {
						for (Role agentRole : agent.getTakenRoles()) {
							if (agentRole == processRole)
								caseO.getInvolved().add(agent);
						}
					}		
				}
			}

		}

		

		// Information
		
		CaseI caseI = factory.createCaseI();
		case_.getAspects().add(caseI);
		for (ProcessAspect aspect : process.getAspects()) 
			if (aspect instanceof Information)
				caseI.setProcess(aspect);
	
		engine.addElement(case_);
	}

}

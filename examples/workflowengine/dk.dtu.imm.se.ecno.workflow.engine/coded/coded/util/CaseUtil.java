package coded.util;

import workflow.Activity;
import workflow.ActivityC;
import workflow.ActivityI;
import workflow.ActivityO;
import workflow.Agent;
import workflow.Case;
import workflow.DefaultDocument;
import workflow.DefaultDocumentDescriptor;
import workflow.Document;
import workflow.DocumentDescriptor;
import workflow.Task;
import workflow.TaskI;
import workflow.WorkflowFactory;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;


public class CaseUtil {
	
	private static CaseUtil instance;

	final WorkflowFactory factory = WorkflowFactory.eINSTANCE;
	
	GlobalUtil globalUtil = GlobalUtil.getInstance();
	DefaultDocumentDescriptorUtil descrUtil = DefaultDocumentDescriptorUtil.getInstance();
	
	public static CaseUtil getInstance()  {
		if (instance != null)
			return instance;
		else 
			return new CaseUtil();
	}

	public void createActivity(ExecutionEngine engine, Case case_, Task task, Agent agent) {

		// Core
		// ----

		Activity activity = factory.createActivity();
		activity.setStarted(false);
		activity.setFinished(false);
		activity.setTask(task);
		case_.getActivities().add(activity);

		// Organisation
		// ------------

		ActivityO activityO = factory.createActivityO();
		activity.getAspects().add(activityO);
		activityO.setTask(globalUtil.getTaskO(task));
		activityO.setAssignedTo(agent);

		// Control
		// -------
		
		ActivityC activityC = factory.createActivityC();
		activity.getAspects().add(activityC);
		activityC.setCase(globalUtil.getCaseC(case_));
		activityC.setTask(globalUtil.getTaskC(task));
		
		// Information
		// -----------
		
		ActivityI activityI = factory.createActivityI();
		activity.getAspects().add(activityI);
		TaskI taskI = globalUtil.getTaskI(task);
		activityI.setTask(taskI);
		
		// Attach input documents.
		
		
		for (DocumentDescriptor des : taskI.getIn()) {
			DefaultDocumentDescriptor descriptor = (DefaultDocumentDescriptor)des;
			Document document = descrUtil.getDocument(descriptor, globalUtil.getCaseI(case_));
			if (document != null) // this is checked once already by the condition in the StartActivity event
				activityI.getIn().add(document);
			else
				throw new RuntimeException("Could not attach input document named: "+descriptor.getProcessDocument().getName());
		}
		

		//Attach output documents
		
		for (DocumentDescriptor des : taskI.getOut()) {
			DefaultDocumentDescriptor descriptor = (DefaultDocumentDescriptor)des;
			DefaultDocument document = descrUtil.getDocument(descriptor, globalUtil.getCaseI(case_));
			if (document != null) {
				
				// The document existed within the case and will just be changed by the task.
				activityI.getOut().add(document);		
			} else {
				
				// The document did not exist within the case. The user should get the options to 
				// create a new document or to find one to use in the "database". 
				
				document = factory.createDefaultDocument();
				document.setPlaceholder(true); // to inform the GUI know this is not a real document.
				document.setName(descriptor.getProcessDocument().getName());
				document.setDocumentType(descriptor.getDocumentType());
				activityI.getOut().add(document);
				
			}
				
		}

		engine.addElement(activity);
	}




}

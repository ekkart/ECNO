package coded.util;

import java.util.List;

import workflow.Activity;
import workflow.ActivityAspect;
import workflow.ActivityO;
import workflow.Agent;
import workflow.Case;
import workflow.Role;
import workflow.Task;
import workflow.TaskAspect;
import workflow.TaskO;
import workflow.WorkflowFactory;
import workflow.impl.ActivityOImpl;
import workflow.impl.TaskOImpl;

public class AgentUtil {
	
	private static AgentUtil instance;

	final WorkflowFactory factory = WorkflowFactory.eINSTANCE;
	
	public static AgentUtil getInstance()  {
		if (instance != null)
			return instance;
		else 
			return new AgentUtil();
		
	}

	
	public boolean evaluateFollowupAndRole(Task task, Agent agent, Case case_) {
	
		return evaluateFollowup(task, agent, case_) && evaluateRole(task, agent);
		
	}
	
	
	private boolean evaluateRole(Task task, Agent agent) {
		
		for (Role requiredRole : GlobalUtil.getInstance().getTaskO(task).getRequiredRoles()) {
			for (Role takenRole : agent.getTakenRoles()) {
				if (requiredRole == takenRole) return true;
			}
			
		}
		
		return false;
	}


	public boolean evaluateFollowup(Task task, Agent agent, Case case_) {

		TaskO taskO = GlobalUtil.getInstance().getTaskO(task);
		TaskO followedUpTaskO = taskO.getFollowsUpOn();
		
		if (followedUpTaskO == null) return true;
		else {

			for (Activity activity : case_.getActivities()) {
				
				ActivityO activity0 = coded.util.GlobalUtil.getInstance().getActivityO(activity);
				
				if (activity0.getTask() == followedUpTaskO)
					if (activity0.getAssignedTo() == agent)
						return true;																	/* The agent also handled the other task */
					else
						return false;																	/* The agent did not handle the other task */
			}
	
		}

		throw new RuntimeException("Error in model: cannot follow up on task which are not in the past");
		
	}
	
	public List<Activity> getVisibleActivities(Agent agent) {
			/*	
		//WorkflowEngine workflowEngine = agent.getAgentRole().getRoleOrganisation().getCore().getWorkflowEngine();
		
		Object object = agent.eContainer().eContainer();
		
		RuntimeCoreModel coreRuntime = null;
		if (object instanceof RuntimeCoreModel)
			coreRuntime = (RuntimeCoreModel) object;
		else 
			System.out.println("Error in model");
			
		List<Activity> activities = new ArrayList<Activity>(); 
		
		for (Case caseModel : coreRuntime.getCases()) {
			Case case_ = (Case) caseModel;
			for (Activity activity : case_.getActivities()) {
				for (ActivityAspect aspect : activity.getAspects()) 
					if (aspect instanceof ActivityO) {
						ActivityO activityO = (ActivityO) aspect;
						if (((TaskO)activityO.getTask()).getRequiredRole() == agent.getAgentRole() && activityO.getAssignedTo() == null) 
							activities.add((Activity)activity);
					}
			}
		}
		
		return activities;*/
		return null;
	}
	
	public boolean isVisible(Activity activity, Agent agent) {
		/*
		// TODO: Refactor duplicate code
		
		if (agent == null) return false;
		
		for (ActivityAspect aspect : activity.getAspects())
			if (aspect instanceof ActivityOImpl) {
				ActivityOImpl activityO = (ActivityOImpl) aspect;
				if (((TaskO)activityO.getTask()).getRequiredRole() == agent.getAgentRole() && activityO.getAssignedTo() == null) 
					return true;
			}
		*/
		return false;
		
	}
	
	public ActivityO getActivityO(Activity activity) {
				
		for (ActivityAspect aspect : activity.getAspects()) 
			if (aspect instanceof ActivityOImpl) {
				return (ActivityO) aspect;

			}
		
		return null;
	}
	
	public TaskO getTaskO(Task task) {
		
		for (TaskAspect aspect : task.getAspects()) 
			if (aspect instanceof TaskOImpl) {
				return (TaskO) aspect;

			}
		
		return null;
	}
	
}


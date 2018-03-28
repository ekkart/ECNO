package dk.dtu.compute.se.ecno.statespace.generator.simulator;

import java.io.IOException;

import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

import dk.dtu.imm.se.ecno.engine.ExecutionEngine;

public class StateSpaceGenerationJob extends Job {

	private StateSpaceGenerator generator;
	private ExecutionEngine engine;
	private boolean aborted = false;
	
	public StateSpaceGenerationJob(StateSpaceGenerator generator, ExecutionEngine engine) {
		super("State space generator");
		this.generator = generator;
		this.engine = engine;
		IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		this.setRule(workspaceRoot);
		this.setUser(true);
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		monitor.beginTask("Generating Statespace", StateSpaceGenerator.WORK);
		generator.generate(monitor);
		int noStates = generator.generatorState.getStatespace().getStates().size();
		int noTransitions = generator.generatorState.getStatespace().getTransitions().size();
		monitor.setTaskName("Generated " + noStates + " states and " + noTransitions +" transitions -- saving now.");
		
		boolean error = false;
		try {
			generator.generatorState.getStatespace().eResource().save(null);
			generator.generatorState.eResource().save(null);
		} catch (IOException e) {
			error = true;
		} finally {
			engine.exit();
			if (error) {
				return new Status(Status.ERROR, "dk.dtu.compute.se.ecno.statespace.generator", "State space could not be saved!");
			}
		}
		if (!aborted) {
			return new Status(Status.OK, "dk.dtu.compute.se.ecno.statespace.generator", "State space generation completed!");
		} else {
			return new Status(Status.OK, "dk.dtu.compute.se.ecno.statespace.generator", "State space generation not complete!");
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.jobs.Job#canceling()
	 */
	@Override
	protected void canceling() {
		super.canceling();
		aborted = true;
		generator.abort();
	}

}

/*
class ExclusiveOnGeneratorState implements ISchedulingRule {

	final private GeneratorState generatorState;

	public ExclusiveOnGeneratorState(GeneratorState generatorState) {
		super();
		this.generatorState = generatorState;
	}

	@SuppressWarnings("restriction")
	public boolean isConflicting(ISchedulingRule rule) {
		// allow File operations (saving the resource) at the end of the Job (also when it is aborted).
		if (rule instanceof ExclusiveOnGeneratorState) {
			return ((ExclusiveOnGeneratorState) rule).generatorState == this.generatorState;
		} else if (rule instanceof File) {
			return true;
		}
		return false;
	}

	public boolean contains(ISchedulingRule rule) {
		return isConflicting(rule);
	}

}

*/

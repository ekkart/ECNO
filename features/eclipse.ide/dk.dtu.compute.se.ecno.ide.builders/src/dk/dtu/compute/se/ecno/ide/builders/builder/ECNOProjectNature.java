package dk.dtu.compute.se.ecno.ide.builders.builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;

/**
 * 
 * @author Jannik
 *
 */
public class ECNOProjectNature implements IProjectNature {

	/**
	 * ID of this project nature
	 */
	public static final String NATURE_ID = "dk.dtu.compute.se.ecno.ide.builders.ecnoProjectNature";

	private IProject project;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.resources.IProjectNature#configure()
	 */
	@Override
	public void configure() throws CoreException {
		IProjectDescription desc = project.getDescription();
		ICommand[] commands = desc.getBuildSpec();

		boolean hasEcnoProjectBuilderConfigured = false;
		boolean hasEcnoProjectMarkerBuilderConfigured = false;

		for (int i = 0; i < commands.length; ++i) {
			if (commands[i].getBuilderName().equals(ECNOProjectBuilder.BUILDER_ID)) {
				hasEcnoProjectBuilderConfigured = true;
			}
			if (commands[i].getBuilderName().equals(ECNOProjectMarkerBuilder.BUILDER_ID)) {
				hasEcnoProjectMarkerBuilderConfigured = true;
			}
		}

		List<ICommand> commandsList = new ArrayList<ICommand>(Arrays.asList(commands));

		if (!hasEcnoProjectBuilderConfigured) {
			ICommand command = desc.newCommand();
			command.setBuilderName(ECNOProjectBuilder.BUILDER_ID);
			commandsList.add(0, command); // At the top
		}

		if (!hasEcnoProjectMarkerBuilderConfigured) {
			ICommand command = desc.newCommand();
			command.setBuilderName(ECNOProjectMarkerBuilder.BUILDER_ID);
			commandsList.add(command); // At the end
		}

		desc.setBuildSpec(commandsList.toArray(new ICommand[commandsList.size()]));
		project.setDescription(desc, null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.resources.IProjectNature#deconfigure()
	 */
	@Override
	public void deconfigure() throws CoreException {
		IProjectDescription description = getProject().getDescription();
		ICommand[] commands = description.getBuildSpec();
		List<ICommand> commandsList = new ArrayList<ICommand>(Arrays.asList(commands));

		List<ICommand> newCommandsList = new ArrayList<ICommand>();
		for (ICommand command : commandsList) {
			if ( !command.getBuilderName().equals(ECNOProjectBuilder.BUILDER_ID)
					&& !command.getBuilderName().equals(ECNOProjectMarkerBuilder.BUILDER_ID) ) {
				newCommandsList.add(command);
			}
		}

		description.setBuildSpec(newCommandsList.toArray(new ICommand[newCommandsList.size()]));
		project.setDescription(description, null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.resources.IProjectNature#getProject()
	 */
	@Override
	public IProject getProject() {
		return project;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.resources.IProjectNature#setProject(org.eclipse.core.resources.IProject)
	 */
	@Override
	public void setProject(IProject project) {
		this.project = project;
	}

}

package dk.dtu.imm.se.ecno.pn.codegenerator;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.codegen.jet.JETEmitter;
import org.eclipse.emf.codegen.jet.JETException;

import org.osgi.framework.Bundle;
import org.pnml.tools.epnk.pnmlcoremodel.Name;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;

import dk.dtu.imm.se.ecno.pn.generator.Activator;

public class ECNOCodeGenerator {
	
	public static void generate(PetriNet net, IFolder folder) {
		Bundle bundle = Activator.getDefault().getBundle();
		final String uri = bundle.getEntry("templates/ECNOPN2Java.jet").toString();

		// instantiate the JET Engine for our template
		// final JETEmitter emitter = new JETEmitter(uri, net.getClass().getClassLoader());

		// specify filename and ask where to save the generated automaton
		Name name = net.getName();
		String className = name != null ? Utils.getClassName(name.getText()) : "Net";
		
		className += ".java";
		
		final IFile file = folder.getFile(className);
		final PetriNet petrinet = net;

		// run jet transformation in a job (separate thread)
		final Job job = new Job("Generating Java code for the Petri net: " + name) {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try {
					JETEmitter emitter = new JETEmitter(uri, petrinet.getClass().getClassLoader());
					// these are the plugins which contain imported packages in the template!
					emitter.addVariable("EPNK", "org.pnml.tools.epnk");
					emitter.addVariable("EPNK_PTNETS", "org.pnml.tools.epnk.pntypes");
					emitter.addVariable("ECNO_PN", "dk.dtu.imm.se.ecno.pn");
					emitter.addVariable("ECNO_PN_GEN", "dk.dtu.imm.se.ecno.pn.generator");
					emitter.addVariable("EMF_COMMON", "org.eclipse.emf.common");
					emitter.addVariable("EMF_ECORE", "org.eclipse.emf.ecore");

					// start the generation process with the appropriate argument ;-)
					String result = emitter.generate(monitor, new Object[] {petrinet});


					// store result in the specified file
					InputStream newContents = new ByteArrayInputStream(result.getBytes());
					if (file.exists()) {
						file.setContents(newContents, true, true, new SubProgressMonitor(monitor, 1));
					} else {
						file.create(newContents, true, new SubProgressMonitor(monitor, 1));
					}

					// some error handling...
				} catch (JETException e) {
					return new Status(Status.ERROR, Activator.PLUGIN_ID,
							"An exception occurred during the code generation! Please check the error view. "
							+ e.getMessage(), e);
				} catch (CoreException e) {
					return new Status(Status.ERROR, Activator.PLUGIN_ID,
							"An exception occurred saving the generated code! Please check the error view. "
							+ e.getMessage(), e);
				}
				monitor.worked(1);
				return new Status(Status.OK, Activator.PLUGIN_ID, "Code successfully generated");
			}
		};

		// enqueue the job
		job.setRule(ResourcesPlugin.getWorkspace().getRoot());
		job.setUser(true);
		job.schedule();

	}

}

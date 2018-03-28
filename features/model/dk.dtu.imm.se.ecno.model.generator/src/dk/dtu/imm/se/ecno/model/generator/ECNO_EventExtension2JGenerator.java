package dk.dtu.imm.se.ecno.model.generator;

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

import dk.dtu.imm.se.ecno.model.ecno.EventTypeExtension;
import dk.dtu.imm.se.ecno.model.ecno.Package;

public class ECNO_EventExtension2JGenerator {
	
	public static void generate(Context context, IFolder folder) {
		Package ecnopackage = context.getEcnopackage();
		for (EventTypeExtension eventTypeExtension: ecnopackage.getEventTypeExtensions()) {
			if (!eventTypeExtension.isImported()) {
				generate(context, eventTypeExtension, folder);
			}
		}
	}
	
	public static void generate(Context context, EventTypeExtension eventTypeExtension, IFolder folder) {		
		Bundle bundle = Activator.getDefault().getBundle();
		final String uri = bundle.getEntry("templates/ECNO_EventExtension2J.jet").toString();

		// instantiate the JET Engine for our template
		// final JETEmitter emitter = new JETEmitter(uri, context.getClass().getClassLoader());
		
		final EventExtensionContext evenExtensionContext = new EventExtensionContext(context,eventTypeExtension);
		
		// specify filename and ask where to save the generated automaton
		String className = evenExtensionContext.getClassName(); 
		className += ".java";
		
		final IFile file = folder.getFile(className);
		final Context c = context;


		// run jet transformation in a job (separate thread)
		final Job job = new Job("Generating Java code for the Event Extension: " + eventTypeExtension.getName()) {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try {
					JETEmitter emitter = new JETEmitter(uri, c.getClass().getClassLoader());
					// these are the plugins which contain imported packages in the template!
					emitter.addVariable("ECNO_MODEL", "dk.dtu.imm.se.ecno.model");
					emitter.addVariable("EMF_COMMON", "org.eclipse.emf.common");
					emitter.addVariable("EMF_ECORE", "org.eclipse.emf.ecore");

					// start the generation process with the appropriate argument ;-)
					String result = emitter.generate(monitor, new Object[] {evenExtensionContext});

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

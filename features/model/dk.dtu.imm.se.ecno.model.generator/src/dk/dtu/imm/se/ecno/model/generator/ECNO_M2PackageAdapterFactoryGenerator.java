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

public class ECNO_M2PackageAdapterFactoryGenerator {
	
	public static void generate(ECNOModelContext mcontext, IFolder folder) {
		Context context = mcontext.getContext();
		
		String className = context.getPackageAdapterFactoryClassName();
		if (className != null && !className.isEmpty() ) {

			Bundle bundle = Activator.getDefault().getBundle();
			final String uri = bundle.getEntry("templates/ECNO_M2PackageAdapterFactory.jet").toString();

			// ECNOGenModel gm = context.getEcnogenmodel();

			className += ".java";

			final IFile file = folder.getFile(className);
			final ECNOModelContext mc = mcontext;

			// run jet transformation in a job (separate thread)
			final Job job = new Job("Generating Java code for the Package Adapter Factory for: " + context.getPackageAdapterFactoryClassName()) {
				@Override
				protected IStatus run(IProgressMonitor monitor) {
					try {
						JETEmitter emitter = new JETEmitter(uri, mc.getClass().getClassLoader());
						// these are the plugins which contain imported packages in the template!
						emitter.addVariable("ECNO_CORE", "dk.dtu.imm.se.ecno.core");
						emitter.addVariable("ECNO_MODEL", "dk.dtu.imm.se.ecno.model");
						emitter.addVariable("EMF_COMMON", "org.eclipse.emf.common");
						emitter.addVariable("EMF_ECORE", "org.eclipse.emf.ecore");
						emitter.addVariable("EMF_ECORE_CODEGEN", "org.eclipse.emf.codegen.ecore");

						// start the generation process with the appropriate argument ;-)
						String result = emitter.generate(monitor, new Object[] {mc});


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

}

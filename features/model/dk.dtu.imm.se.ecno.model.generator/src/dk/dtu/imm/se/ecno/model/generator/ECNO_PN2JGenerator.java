package dk.dtu.imm.se.ecno.model.generator;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;

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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.osgi.framework.Bundle;
import org.pnml.tools.epnk.pnmlcoremodel.Name;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetDoc;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetType;

import dk.dtu.imm.se.ecno.pn.ecnonets.ECNONet;

public class ECNO_PN2JGenerator {
	
	public static void generate(Context context, PetriNetDoc doc, IFolder folder) {
		EPackage ePackage = context.getEpackage();
		ArrayList<EClass> classes = new ArrayList<EClass>();
		for (PetriNet net: doc.getNet()) {
			PetriNetType type = net.getType();
			Name name = net.getName();
			if (name != null && type != null && type instanceof ECNONet) {
				String text = name.getText();
				if (text != null) { 
					EClassifier classifier = ePackage.getEClassifier(name.getText());
					if (classifier != null && classifier instanceof EClass) {
						EClass eClass = (EClass) classifier;
						classes.add(eClass);
						generate(new PNContext(context, net, eClass), folder);
					}
				}
			}
		}
		
		generate(new BehaviourAdapterContext(context, classes), folder);
	}
	
	public static void generate(PNContext pncontext, IFolder folder) {
		Bundle bundle = Activator.getDefault().getBundle();
		String tmpuri = null;
		if (pncontext.usesNamedParametersOnly()) {
			tmpuri = bundle.getEntry("templates/ECNO_ENet2J.jet").toString();
		} else {
			tmpuri = bundle.getEntry("templates/ECNO_PN2J.jet").toString();
		}
		final String uri = tmpuri;

		// instantiate the JET Engine for our template
		// final JETEmitter emitter = new JETEmitter(uri, pncontext.getClass().getClassLoader());

		// specify filename and ask where to save the generated automaton
		String className = pncontext.getEClass().getName(); 
		
		className += ".java";
		
		final IFile file = folder.getFile(className);
		final PNContext pnc = pncontext;

		// run jet transformation in a job (separate thread)
		final Job job = new Job("Generating Java code for the Petri net: " + className) {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try {
					JETEmitter emitter = new JETEmitter(uri, pnc.getClass().getClassLoader());
					// these are the plugins which contain imported packages in the template!
					emitter.addVariable("EPNK", "org.pnml.tools.epnk");
					emitter.addVariable("EPNK_PTNETS", "org.pnml.tools.epnk.pntypes");
					emitter.addVariable("ECNO_PN", "dk.dtu.imm.se.ecno.pn");
					emitter.addVariable("ECNO_MODEL", "dk.dtu.imm.se.ecno.model");
					emitter.addVariable("ECNO_MODEL_GEN", "dk.dtu.imm.se.ecno.model.generator");
					emitter.addVariable("EMF_COMMON", "org.eclipse.emf.common");
					emitter.addVariable("EMF_ECORE", "org.eclipse.emf.ecore");

					// start the generation process with the appropriate argument ;-)
					String result = emitter.generate(monitor, new Object[] {pnc});

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
	
	public static void generate(BehaviourAdapterContext behContext, IFolder folder) {
		Bundle bundle = Activator.getDefault().getBundle();
		final String uri = bundle.getEntry("templates/ECNO_PN2BehaviourAdapter.jet").toString();

		// instantiate the JET Engine for our template
		// final JETEmitter emitter = new JETEmitter(uri, behContext.getClass().getClassLoader());

		// specify filename and ask where to save the generated automaton
		String className = behContext.getContext().getBehaviourClassName(); 
		className += ".java";

		final IFile file = folder.getFile(className);
		final BehaviourAdapterContext bhc = behContext;

		// run jet transformation in a job (separate thread)
		final Job job = new Job("Generating Java code for the Behaviour Adapter for: " + className) {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try {
					JETEmitter emitter = new JETEmitter(uri, bhc.getClass().getClassLoader());
					// these are the plugins which contain imported packages in the template!
					// emitter.addVariable("EPNK", "org.pnml.tools.epnk");
					// emitter.addVariable("EPNK_PTNETS", "org.pnml.tools.epnk.pntypes");
					// emitter.addVariable("ECNO_PN", "dk.dtu.imm.se.ecno.pn");
					emitter.addVariable("ECNO_MODEL", "dk.dtu.imm.se.ecno.model");
					emitter.addVariable("ECNO_MODEL_GEN", "dk.dtu.imm.se.ecno.model.generator");					
					emitter.addVariable("EMF_COMMON", "org.eclipse.emf.common");
					emitter.addVariable("EMF_ECORE", "org.eclipse.emf.ecore");
					emitter.addVariable("EMF_CODEGEN", "org.eclipse.emf.codegen.ecore");

					// start the generation process with the appropriate argument ;-)
					String result = emitter.generate(monitor, new Object[] {bhc});

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

package dk.dtu.compute.se.ecno.ide.builders.builder;

import static dk.dtu.compute.se.ecno.ide.builders.Activator.log;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;

import dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel;
import dk.dtu.imm.se.ecno.genmodel.ecnogen.EcnogenPackage;
import dk.dtu.imm.se.ecno.model.generator.util.ECNO_M2JGeneratorUtil;

/**
 * 
 * @author Jannik
 *
 */
public class ECNOProjectBuilder extends IncrementalProjectBuilder {

	public static String BUILDER_ID = "dk.dtu.compute.se.ecno.ide.builders.ecnoProjectBuilder";

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.internal.events.InternalBuilder#build(int,
	 *      java.util.Map, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	protected IProject[] build(int kind, Map<String, String> args, IProgressMonitor monitor)
			throws CoreException {
		if (kind == FULL_BUILD) {
			fullBuild(monitor);
		} else {
			IResourceDelta delta = getDelta(getProject());
			if (delta == null) {
				fullBuild(monitor);
			} else {
				incrementalBuild(delta, monitor);
			}
		}
		return null;
	}

	/**
	 * Does a full build
	 * @param monitor
	 * @throws CoreException
	 */
	protected void fullBuild(final IProgressMonitor monitor) throws CoreException {
		log().info("ECNO fullBuild");

		// Eventually delete all generated sources before regenerate.

		try {
			getProject().accept(new ECNOProjectResourceVisitor());
		} catch (CoreException e) {
			// ignore
		}
	}

	protected void incrementalBuild(IResourceDelta delta, IProgressMonitor monitor) throws CoreException {
		// the visitor does the work.
		delta.accept(new ECNOProjectResourceDeltaVisitor());
	}

	class ECNOProjectResourceVisitor implements IResourceVisitor {
		@Override
		public boolean visit(IResource resource) {
			if ("ecnogen".equalsIgnoreCase(resource.getFileExtension())) {
				log().info("Generating code for file: " + resource.getName());
				generateCodeFromEcnogenFile(resource);
			}
			//return true to continue visiting children.
			return true;
		}
	}

	class ECNOProjectResourceDeltaVisitor implements IResourceDeltaVisitor {

		private final List<String> ecnoFileExtensions = Arrays.asList("ecnogen", "pnml");
		private boolean hasPerformedBuild = false;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.core.resources.IResourceDeltaVisitor#visit(org.eclipse.core.resources.IResourceDelta)
		 */
		@Override
		public boolean visit(IResourceDelta delta) throws CoreException {
			// Only perform build once.
			if(hasPerformedBuild) {
				return false;
			}

			IResource resource = delta.getResource();
			if ( ecnoFileExtensions.contains(resource.getFileExtension()) ) {
				fullBuild(null); // At the moment we just do a full build.
				hasPerformedBuild = true;
				return false;
			} else {
				//return true to continue visiting children.
				return true;
			}

			//			switch (delta.getKind()) {
			//			case IResourceDelta.ADDED:
			//				// handle added resource
			//				checkXML(resource);
			//				break;
			//			case IResourceDelta.REMOVED:
			//				// handle removed resource
			//				break;
			//			case IResourceDelta.CHANGED:
			//				// handle changed resource
			//				checkXML(resource);
			//				break;
			//			}

		}
	}

	private void generateCodeFromEcnogenFile(IResource resource) {
		ECNOGenModel model = load(resource);
		IJavaProject javaProject = JavaCore.create(getProject());
		if (model != null && javaProject != null) {
			ECNO_M2JGeneratorUtil.generateEcnoCode(model, javaProject);
		}
	}

	private ECNOGenModel load(IResource resource) {
		// Initialize the model
		EcnogenPackage.eINSTANCE.eClass();

		// Register the XMI resource factory for the project
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("dk.dtu.compute.se.ecno.ide.builders", new XMIResourceFactoryImpl());
		
		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Get the resource
		URI platformUri = URI.createPlatformResourceURI(resource.getFullPath().toString(), true);
		Resource emfResource = resSet.getResource(platformUri, true);

		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		ECNOGenModel model = (ECNOGenModel) emfResource.getContents().get(0);
		return model;
	}

}

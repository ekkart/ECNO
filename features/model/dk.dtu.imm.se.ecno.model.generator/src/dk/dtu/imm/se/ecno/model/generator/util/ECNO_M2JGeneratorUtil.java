package dk.dtu.imm.se.ecno.model.generator.util;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaModelException;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetDoc;

import dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel;
import dk.dtu.imm.se.ecno.model.generator.Context;
import dk.dtu.imm.se.ecno.model.generator.ECNOModelContext;
import dk.dtu.imm.se.ecno.model.generator.ECNO_Event2JGenerator;
import dk.dtu.imm.se.ecno.model.generator.ECNO_M2JGenerator;
import dk.dtu.imm.se.ecno.model.generator.ECNO_PN2JGenerator;

public class ECNO_M2JGeneratorUtil {

	public static final String SEE_PNML_START = "@see-pnml-start";
	public static final String SEE_PNML_END = "@see-pnml-end";
	public static final String SEE_ECNOGEN = "@see-ecnogen";

	/**
	 * @author Jannik
	 * @param eObject
	 * @return
	 */
	public static String findURI(EObject eObject) {
		String objectURI = "";
		if (eObject != null && eObject.eResource() != null 
				&& eObject.eResource().getURI() != null) {
			URI resourceURI = eObject.eResource().getURI();
			if (resourceURI.isPlatformResource()) {
				objectURI = "" + resourceURI;
			}
		}
		return objectURI;
	}
	
	/**
	 * @author Jannik, s080031
	 * @param eObject
	 * @return URI to the given object
	 */
	public static String findObjectURI(EObject eObject) {
		String objectURI = "";
		EObject topEContainer = findTopContainer(eObject);
		if (topEContainer != null && topEContainer.eResource() != null 
				&& topEContainer.eResource().getURI() != null) {
			URI resourceURI = topEContainer.eResource().getURI();
			if (resourceURI.isPlatformResource()) {
				if (topEContainer.eResource().getURIFragment(eObject) != null &&
						!topEContainer.eResource().getURIFragment(eObject).isEmpty())
					objectURI = resourceURI + "#" + topEContainer.eResource().getURIFragment(eObject);
			}
		}
		return objectURI;
	}
	
	/**
	 * @author Jannik, s080031
	 * @param eObject the object from whom the top eContainer is needed
	 * @return eContainer
	 */
	public static EObject findTopContainer(EObject eObject) {
		if (eObject == null) {
			return null;
		} else if (eObject.eContainer() != null) {
			return findTopContainer(eObject.eContainer());
		} else {
			return eObject;
		}
	}
	
	/**
	 * 
	 * @param genModel
	 * @param javaProject
	 * @return true if everything went well, otherwise false.
	 */
	public static boolean generateEcnoCode(ECNOGenModel genModel, IJavaProject javaProject) {
		
		boolean succeded = false;
		
		try {
			boolean behaviourGenerated = false;
			boolean modelGenerated = false;
			boolean eventsGenerated = false;

			Context context = new Context(genModel);
			ECNOModelContext mcontext = new ECNOModelContext(context);

			IPackageFragmentRoot[] roots = javaProject.getPackageFragmentRoots(); 
			if (roots!= null && roots.length > 0) {
				for (IPackageFragmentRoot root: roots) {
					if (!root.isReadOnly()) {

						// Generate Behaviour
						// TODO should be done more flexible
						if (!behaviourGenerated) {
							IPackageFragment packageFragment = 
									root.createPackageFragment(genModel.getBasePathECNOAutomata(), false, null);
							IResource resource = packageFragment.getResource();
							if (resource instanceof IFolder) {
								IFolder folder =  (IFolder) resource;
								EObject behaviour = genModel.getBehaviourModel();
								if (behaviour != null && behaviour instanceof PetriNetDoc) {
									PetriNetDoc doc = (PetriNetDoc) behaviour;
									ECNO_PN2JGenerator.generate(context, doc, folder);
									behaviourGenerated = true;
								}
							}
						}

						// Generate ECNO Model/Adapter class
						if (!modelGenerated) {
							IPackageFragment packageFragment = 
									root.createPackageFragment(genModel.getBasePathModelClass(), false, null);
							IResource resource = packageFragment.getResource();
							if (resource instanceof IFolder) {
								IFolder folder =  (IFolder) resource;
								ECNO_M2JGenerator.generate(mcontext, folder);
								modelGenerated = true;
							}
						}

						// TODO add Generator for EventValueClasses 
						if (!eventsGenerated) {
							IPackageFragment packageFragment = 
									root.createPackageFragment(genModel.getBasePathECNOEvents(), false, null);
							IResource resource = packageFragment.getResource();
							if (resource instanceof IFolder) {
								IFolder folder =  (IFolder) resource;
								ECNO_Event2JGenerator.generate(context, folder);
								eventsGenerated = true;
							}
						}

						// TODO the return could be done a bit more clever
						if (behaviourGenerated && modelGenerated && eventsGenerated) {
							succeded = true;
						}
					}
				}
			}
		} catch (JavaModelException e) {
			// Ignore
		}
		
		return succeded;

	}

}

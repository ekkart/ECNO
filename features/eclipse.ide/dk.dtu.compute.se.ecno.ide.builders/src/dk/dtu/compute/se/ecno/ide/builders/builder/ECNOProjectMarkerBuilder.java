package dk.dtu.compute.se.ecno.ide.builders.builder;

import static dk.dtu.compute.se.ecno.ide.builders.Activator.log;

import java.util.Map;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.jdt.core.IJavaModelMarker;

import dk.dtu.compute.se.ecno.ide.builders.Activator;
import dk.dtu.compute.se.ecno.ide.builders.util.Util;

/**
 * 
 * @author Jannik
 *
 */
public class ECNOProjectMarkerBuilder extends IncrementalProjectBuilder {

	public static final String BUILDER_ID = "dk.dtu.compute.se.ecno.ide.builders.ecnoProjectMarkerBuilder";

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.internal.events.InternalBuilder#build(int,
	 * java.util.Map, org.eclipse.core.runtime.IProgressMonitor)
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
				// incrementalBuild(delta, monitor);
				fullBuild(monitor); // At the moment we only do full builds
			}
		}
		return null;
	}

	protected void fullBuild(final IProgressMonitor monitor)
			throws CoreException {
		log().info("ECNO Marker fullBuild");
		getProject().deleteMarkers(EValidator.MARKER, true,
				IResource.DEPTH_INFINITE);
		try {
			getProject().accept(new ECNOProjectResourceVisitor());
		} catch (CoreException e) {
			// ignore
		}
	}

	class ECNOProjectResourceVisitor implements IResourceVisitor {
		@Override
		public boolean visit(IResource resource) {
			mapMarkersToECNO(resource);
			// return true to continue visiting children.
			return true;
		}
	}

	private void mapMarkersToECNO(IResource resource) {
		try {
			IMarker[] problemMarkers = resource.findMarkers(
					IJavaModelMarker.JAVA_MODEL_PROBLEM_MARKER, false,
					IResource.DEPTH_ZERO);
			for (IMarker iMarker : problemMarkers) {
				
				createEmfMarker(iMarker);
			}
		} catch (CoreException e) {
			log().error("Couldn't find java markers", e);
		}
	}

	private void createEmfMarker(IMarker iMarker) {
	
		
		
		URI uri = Util.getEcnoUri(iMarker);
		
		if (uri != null && uri.isPlatformResource() && uri.hasFragment()) {
			String platformString = uri.toPlatformString(true);
			// Access the eclipse resource "behind" the above EMF resource
			IResource resource = ResourcesPlugin.getWorkspace().getRoot()
					.findMember(platformString);
			if (resource != null) {
				IMarker marker;
				try {
					marker = resource.createMarker(EValidator.MARKER);
					if (marker.exists()) {
						marker.setAttribute(
								IMarker.MESSAGE,
								iMarker.getAttribute(IMarker.MESSAGE,
										"No message available - You may check in the generated Java code!"));
						marker.setAttribute(IMarker.LOCATION, uri.fragment());

						// marker.setAttribute(IMarker.SEVERITY,
						// IMarker.SEVERITY_WARNING);
						marker.setAttribute(IMarker.SEVERITY,
								IMarker.SEVERITY_ERROR);

						marker.setAttribute(EValidator.URI_ATTRIBUTE, uri.toString());
					}
				} catch (CoreException e) {
					// Thrown if we can't initialize the marker.
					// This is unlikely, so we just log the error
					Activator.log().error("Couldn't create marker on resource: " + uri, e);
				}
			}
		}
	}
}

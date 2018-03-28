package PetriNets.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class PetriNetNavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public PetriNetNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<PetriNets.diagram.navigator.PetriNetNavigatorItem> result = new ArrayList<PetriNets.diagram.navigator.PetriNetNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			return result.toArray();
		}

		if (parentElement instanceof PetriNets.diagram.navigator.PetriNetNavigatorGroup) {
			PetriNets.diagram.navigator.PetriNetNavigatorGroup group = (PetriNets.diagram.navigator.PetriNetNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof PetriNets.diagram.navigator.PetriNetNavigatorItem) {
			PetriNets.diagram.navigator.PetriNetNavigatorItem navigatorItem = (PetriNets.diagram.navigator.PetriNetNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (PetriNets.diagram.part.PetriNetVisualIDRegistry
				.getVisualID(view)) {

		case PetriNets.diagram.edit.parts.PlaceEditPart.VISUAL_ID: {
			LinkedList<PetriNets.diagram.navigator.PetriNetAbstractNavigatorItem> result = new LinkedList<PetriNets.diagram.navigator.PetriNetAbstractNavigatorItem>();
			Node sv = (Node) view;
			PetriNets.diagram.navigator.PetriNetNavigatorGroup incominglinks = new PetriNets.diagram.navigator.PetriNetNavigatorGroup(
					PetriNets.diagram.part.Messages.NavigatorGroupName_Place_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PetriNets.diagram.navigator.PetriNetNavigatorGroup outgoinglinks = new PetriNets.diagram.navigator.PetriNetNavigatorGroup(
					PetriNets.diagram.part.Messages.NavigatorGroupName_Place_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					PetriNets.diagram.part.PetriNetVisualIDRegistry
							.getType(PetriNets.diagram.edit.parts.TokenEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					PetriNets.diagram.part.PetriNetVisualIDRegistry
							.getType(PetriNets.diagram.edit.parts.ArcEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					PetriNets.diagram.part.PetriNetVisualIDRegistry
							.getType(PetriNets.diagram.edit.parts.ArcEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PetriNets.diagram.edit.parts.ArcEditPart.VISUAL_ID: {
			LinkedList<PetriNets.diagram.navigator.PetriNetAbstractNavigatorItem> result = new LinkedList<PetriNets.diagram.navigator.PetriNetAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			PetriNets.diagram.navigator.PetriNetNavigatorGroup target = new PetriNets.diagram.navigator.PetriNetNavigatorGroup(
					PetriNets.diagram.part.Messages.NavigatorGroupName_Arc_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PetriNets.diagram.navigator.PetriNetNavigatorGroup source = new PetriNets.diagram.navigator.PetriNetNavigatorGroup(
					PetriNets.diagram.part.Messages.NavigatorGroupName_Arc_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					PetriNets.diagram.part.PetriNetVisualIDRegistry
							.getType(PetriNets.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					PetriNets.diagram.part.PetriNetVisualIDRegistry
							.getType(PetriNets.diagram.edit.parts.PlaceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					PetriNets.diagram.part.PetriNetVisualIDRegistry
							.getType(PetriNets.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					PetriNets.diagram.part.PetriNetVisualIDRegistry
							.getType(PetriNets.diagram.edit.parts.PlaceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case PetriNets.diagram.edit.parts.TransitionEditPart.VISUAL_ID: {
			LinkedList<PetriNets.diagram.navigator.PetriNetAbstractNavigatorItem> result = new LinkedList<PetriNets.diagram.navigator.PetriNetAbstractNavigatorItem>();
			Node sv = (Node) view;
			PetriNets.diagram.navigator.PetriNetNavigatorGroup incominglinks = new PetriNets.diagram.navigator.PetriNetNavigatorGroup(
					PetriNets.diagram.part.Messages.NavigatorGroupName_Transition_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PetriNets.diagram.navigator.PetriNetNavigatorGroup outgoinglinks = new PetriNets.diagram.navigator.PetriNetNavigatorGroup(
					PetriNets.diagram.part.Messages.NavigatorGroupName_Transition_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					PetriNets.diagram.part.PetriNetVisualIDRegistry
							.getType(PetriNets.diagram.edit.parts.ArcEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					PetriNets.diagram.part.PetriNetVisualIDRegistry
							.getType(PetriNets.diagram.edit.parts.ArcEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PetriNets.diagram.edit.parts.PetriNetEditPart.VISUAL_ID: {
			LinkedList<PetriNets.diagram.navigator.PetriNetAbstractNavigatorItem> result = new LinkedList<PetriNets.diagram.navigator.PetriNetAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			PetriNets.diagram.navigator.PetriNetNavigatorGroup links = new PetriNets.diagram.navigator.PetriNetNavigatorGroup(
					PetriNets.diagram.part.Messages.NavigatorGroupName_PetriNet_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					PetriNets.diagram.part.PetriNetVisualIDRegistry
							.getType(PetriNets.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					PetriNets.diagram.part.PetriNetVisualIDRegistry
							.getType(PetriNets.diagram.edit.parts.PlaceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					PetriNets.diagram.part.PetriNetVisualIDRegistry
							.getType(PetriNets.diagram.edit.parts.ArcEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return PetriNets.diagram.edit.parts.PetriNetEditPart.MODEL_ID
				.equals(PetriNets.diagram.part.PetriNetVisualIDRegistry
						.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<PetriNets.diagram.navigator.PetriNetNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<PetriNets.diagram.navigator.PetriNetNavigatorItem> result = new ArrayList<PetriNets.diagram.navigator.PetriNetNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new PetriNets.diagram.navigator.PetriNetNavigatorItem(
					nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof PetriNets.diagram.navigator.PetriNetAbstractNavigatorItem) {
			PetriNets.diagram.navigator.PetriNetAbstractNavigatorItem abstractNavigatorItem = (PetriNets.diagram.navigator.PetriNetAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}

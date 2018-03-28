package dk.dtu.imm.se.ecno.model.ecno.diagram.navigator;

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

import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.CoordinationSetEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.ElementTypeEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.ElementTypeSuperEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.EventTypeEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.EventTypeExtensionBaseEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.EventTypeExtensionEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.EventTypeExtensionParametersEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.EventTypeParametersEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.EventTypeSuperEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.FormalParameter2EditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.FormalParameterEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.PackageEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.ReferenceEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.String2EventTypeExtensionMapEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.SynchronisationEditPart;
import dk.dtu.imm.se.ecno.model.ecno.diagram.part.EcnoVisualIDRegistry;
import dk.dtu.imm.se.ecno.model.ecno.diagram.part.Messages;

/**
 * @generated
 */
public class EcnoNavigatorContentProvider implements ICommonContentProvider {

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
	public EcnoNavigatorContentProvider() {
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
			ArrayList<EcnoNavigatorItem> result = new ArrayList<EcnoNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			return result.toArray();
		}

		if (parentElement instanceof EcnoNavigatorGroup) {
			EcnoNavigatorGroup group = (EcnoNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof EcnoNavigatorItem) {
			EcnoNavigatorItem navigatorItem = (EcnoNavigatorItem) parentElement;
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
		switch (EcnoVisualIDRegistry.getVisualID(view)) {

		case EventTypeExtensionBaseEditPart.VISUAL_ID: {
			LinkedList<EcnoAbstractNavigatorItem> result = new LinkedList<EcnoAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			EcnoNavigatorGroup target = new EcnoNavigatorGroup(
					Messages.NavigatorGroupName_EventTypeExtensionBase_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EcnoNavigatorGroup source = new EcnoNavigatorGroup(
					Messages.NavigatorGroupName_EventTypeExtensionBase_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EcnoVisualIDRegistry.getType(EventTypeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EcnoVisualIDRegistry
							.getType(EventTypeExtensionEditPart.VISUAL_ID));
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

		case EventTypeSuperEditPart.VISUAL_ID: {
			LinkedList<EcnoAbstractNavigatorItem> result = new LinkedList<EcnoAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			EcnoNavigatorGroup target = new EcnoNavigatorGroup(
					Messages.NavigatorGroupName_EventTypeSuper_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EcnoNavigatorGroup source = new EcnoNavigatorGroup(
					Messages.NavigatorGroupName_EventTypeSuper_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EcnoVisualIDRegistry.getType(EventTypeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EcnoVisualIDRegistry.getType(EventTypeEditPart.VISUAL_ID));
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

		case String2EventTypeExtensionMapEditPart.VISUAL_ID: {
			LinkedList<EcnoAbstractNavigatorItem> result = new LinkedList<EcnoAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			EcnoNavigatorGroup target = new EcnoNavigatorGroup(
					Messages.NavigatorGroupName_String2EventTypeExtensionMap_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EcnoNavigatorGroup source = new EcnoNavigatorGroup(
					Messages.NavigatorGroupName_String2EventTypeExtensionMap_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EcnoVisualIDRegistry
							.getType(EventTypeExtensionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EcnoVisualIDRegistry
							.getType(EventTypeExtensionEditPart.VISUAL_ID));
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

		case PackageEditPart.VISUAL_ID: {
			LinkedList<EcnoAbstractNavigatorItem> result = new LinkedList<EcnoAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			EcnoNavigatorGroup links = new EcnoNavigatorGroup(
					Messages.NavigatorGroupName_Package_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EcnoVisualIDRegistry.getType(EventTypeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EcnoVisualIDRegistry.getType(ElementTypeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EcnoVisualIDRegistry
							.getType(EventTypeExtensionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					EcnoVisualIDRegistry.getType(ReferenceEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					EcnoVisualIDRegistry
							.getType(SynchronisationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					EcnoVisualIDRegistry
							.getType(ElementTypeSuperEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					EcnoVisualIDRegistry
							.getType(EventTypeSuperEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					EcnoVisualIDRegistry
							.getType(EventTypeExtensionBaseEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					EcnoVisualIDRegistry
							.getType(String2EventTypeExtensionMapEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case CoordinationSetEditPart.VISUAL_ID: {
			LinkedList<EcnoAbstractNavigatorItem> result = new LinkedList<EcnoAbstractNavigatorItem>();
			Node sv = (Node) view;
			EcnoNavigatorGroup incominglinks = new EcnoNavigatorGroup(
					Messages.NavigatorGroupName_CoordinationSet_3001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EcnoVisualIDRegistry
							.getType(SynchronisationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case EventTypeExtensionEditPart.VISUAL_ID: {
			LinkedList<EcnoAbstractNavigatorItem> result = new LinkedList<EcnoAbstractNavigatorItem>();
			Node sv = (Node) view;
			EcnoNavigatorGroup outgoinglinks = new EcnoNavigatorGroup(
					Messages.NavigatorGroupName_EventTypeExtension_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EcnoNavigatorGroup incominglinks = new EcnoNavigatorGroup(
					Messages.NavigatorGroupName_EventTypeExtension_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					EcnoVisualIDRegistry
							.getType(EventTypeExtensionParametersEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EcnoVisualIDRegistry
							.getType(FormalParameter2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EcnoVisualIDRegistry
							.getType(EventTypeExtensionBaseEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EcnoVisualIDRegistry
							.getType(String2EventTypeExtensionMapEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EcnoVisualIDRegistry
							.getType(String2EventTypeExtensionMapEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case EventTypeEditPart.VISUAL_ID: {
			LinkedList<EcnoAbstractNavigatorItem> result = new LinkedList<EcnoAbstractNavigatorItem>();
			Node sv = (Node) view;
			EcnoNavigatorGroup incominglinks = new EcnoNavigatorGroup(
					Messages.NavigatorGroupName_EventType_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EcnoNavigatorGroup outgoinglinks = new EcnoNavigatorGroup(
					Messages.NavigatorGroupName_EventType_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EcnoVisualIDRegistry
							.getType(EventTypeParametersEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EcnoVisualIDRegistry
							.getType(FormalParameterEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EcnoVisualIDRegistry
							.getType(EventTypeSuperEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EcnoVisualIDRegistry
							.getType(EventTypeSuperEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EcnoVisualIDRegistry
							.getType(EventTypeExtensionBaseEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ReferenceEditPart.VISUAL_ID: {
			LinkedList<EcnoAbstractNavigatorItem> result = new LinkedList<EcnoAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			EcnoNavigatorGroup target = new EcnoNavigatorGroup(
					Messages.NavigatorGroupName_Reference_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EcnoNavigatorGroup source = new EcnoNavigatorGroup(
					Messages.NavigatorGroupName_Reference_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EcnoNavigatorGroup outgoinglinks = new EcnoNavigatorGroup(
					Messages.NavigatorGroupName_Reference_4001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EcnoVisualIDRegistry.getType(ElementTypeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EcnoVisualIDRegistry.getType(ElementTypeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ElementTypeSuperEditPart.VISUAL_ID: {
			LinkedList<EcnoAbstractNavigatorItem> result = new LinkedList<EcnoAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			EcnoNavigatorGroup target = new EcnoNavigatorGroup(
					Messages.NavigatorGroupName_ElementTypeSuper_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EcnoNavigatorGroup source = new EcnoNavigatorGroup(
					Messages.NavigatorGroupName_ElementTypeSuper_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EcnoVisualIDRegistry.getType(ElementTypeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EcnoVisualIDRegistry.getType(ElementTypeEditPart.VISUAL_ID));
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

		case SynchronisationEditPart.VISUAL_ID: {
			LinkedList<EcnoAbstractNavigatorItem> result = new LinkedList<EcnoAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			EcnoNavigatorGroup target = new EcnoNavigatorGroup(
					Messages.NavigatorGroupName_Synchronisation_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EcnoNavigatorGroup source = new EcnoNavigatorGroup(
					Messages.NavigatorGroupName_Synchronisation_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EcnoVisualIDRegistry
							.getType(CoordinationSetEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ElementTypeEditPart.VISUAL_ID: {
			LinkedList<EcnoAbstractNavigatorItem> result = new LinkedList<EcnoAbstractNavigatorItem>();
			Node sv = (Node) view;
			EcnoNavigatorGroup incominglinks = new EcnoNavigatorGroup(
					Messages.NavigatorGroupName_ElementType_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EcnoNavigatorGroup outgoinglinks = new EcnoNavigatorGroup(
					Messages.NavigatorGroupName_ElementType_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EcnoVisualIDRegistry
							.getType(CoordinationSetEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EcnoVisualIDRegistry.getType(ReferenceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EcnoVisualIDRegistry.getType(ReferenceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EcnoVisualIDRegistry
							.getType(ElementTypeSuperEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EcnoVisualIDRegistry
							.getType(ElementTypeSuperEditPart.VISUAL_ID));
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
		return PackageEditPart.MODEL_ID.equals(EcnoVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<EcnoNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<EcnoNavigatorItem> result = new ArrayList<EcnoNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new EcnoNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof EcnoAbstractNavigatorItem) {
			EcnoAbstractNavigatorItem abstractNavigatorItem = (EcnoAbstractNavigatorItem) element;
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

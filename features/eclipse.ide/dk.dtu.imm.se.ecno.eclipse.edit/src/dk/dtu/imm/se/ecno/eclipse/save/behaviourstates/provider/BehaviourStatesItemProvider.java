/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.provider;


import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourStates;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourstatesFactory;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourstatesPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourStates} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviourStatesItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourStatesItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addAddedPropertyDescriptor(object);
			addPackagesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Added feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAddedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BehaviourStates_added_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BehaviourStates_added_feature", "_UI_BehaviourStates_type"),
				 BehaviourstatesPackage.Literals.BEHAVIOUR_STATES__ADDED,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Packages feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPackagesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BehaviourStates_packages_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BehaviourStates_packages_feature", "_UI_BehaviourStates_type"),
				 BehaviourstatesPackage.Literals.BEHAVIOUR_STATES__PACKAGES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(BehaviourstatesPackage.Literals.BEHAVIOUR_STATES__STATES);
			childrenFeatures.add(BehaviourstatesPackage.Literals.BEHAVIOUR_STATES__ORPHANS);
			childrenFeatures.add(BehaviourstatesPackage.Literals.BEHAVIOUR_STATES__CONTROLLER_CONFIG);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns BehaviourStates.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BehaviourStates"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_BehaviourStates_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(BehaviourStates.class)) {
			case BehaviourstatesPackage.BEHAVIOUR_STATES__PACKAGES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BehaviourstatesPackage.BEHAVIOUR_STATES__STATES:
			case BehaviourstatesPackage.BEHAVIOUR_STATES__ORPHANS:
			case BehaviourstatesPackage.BEHAVIOUR_STATES__CONTROLLER_CONFIG:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(BehaviourstatesPackage.Literals.BEHAVIOUR_STATES__STATES,
				 BehaviourstatesFactory.eINSTANCE.createElementBehaviourState()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourstatesPackage.Literals.BEHAVIOUR_STATES__ORPHANS,
				 BehaviourstatesFactory.eINSTANCE.createBehaviourStates()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourstatesPackage.Literals.BEHAVIOUR_STATES__ORPHANS,
				 BehaviourstatesFactory.eINSTANCE.createDefaultState()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourstatesPackage.Literals.BEHAVIOUR_STATES__ORPHANS,
				 BehaviourstatesFactory.eINSTANCE.createPTNetState()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourstatesPackage.Literals.BEHAVIOUR_STATES__ORPHANS,
				 BehaviourstatesFactory.eINSTANCE.createInheritedBehaviourState()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourstatesPackage.Literals.BEHAVIOUR_STATES__ORPHANS,
				 BehaviourstatesFactory.eINSTANCE.createDefaultContainer()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourstatesPackage.Literals.BEHAVIOUR_STATES__ORPHANS,
				 BehaviourstatesFactory.eINSTANCE.createElementBehaviourState()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourstatesPackage.Literals.BEHAVIOUR_STATES__ORPHANS,
				 BehaviourstatesFactory.eINSTANCE.createControllerConfigurator()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourstatesPackage.Literals.BEHAVIOUR_STATES__ORPHANS,
				 BehaviourstatesFactory.eINSTANCE.createObjectReference()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourstatesPackage.Literals.BEHAVIOUR_STATES__CONTROLLER_CONFIG,
				 BehaviourstatesFactory.eINSTANCE.createControllerConfigurator()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == BehaviourstatesPackage.Literals.BEHAVIOUR_STATES__STATES ||
			childFeature == BehaviourstatesPackage.Literals.BEHAVIOUR_STATES__ORPHANS ||
			childFeature == BehaviourstatesPackage.Literals.BEHAVIOUR_STATES__CONTROLLER_CONFIG;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

}

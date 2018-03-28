/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.model.ecno.provider;


import dk.dtu.imm.se.ecno.model.ecno.EcnoFactory;
import dk.dtu.imm.se.ecno.model.ecno.EcnoPackage;
import dk.dtu.imm.se.ecno.model.ecno.ElementType;
import dk.dtu.imm.se.ecno.model.ecno.Reference;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
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
 * This is the item provider adapter for a {@link dk.dtu.imm.se.ecno.model.ecno.Reference} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ReferenceItemProvider
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
	public ReferenceItemProvider(AdapterFactory adapterFactory) {
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

			addEReferencePropertyDescriptor(object);
			addTargetPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addUpperBoundPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/*
	 * This adds a property descriptor for the EReference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 *
	protected void addEReferencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Reference_eReference_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Reference_eReference_feature", "_UI_Reference_type"),
				 EcnoPackage.Literals.REFERENCE__EREFERENCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}
	*/

	/**
	 * This adds a property descriptor for the EReference feature. It reduces the choices to the ones
	 * that are valid for the given ECNO reference (if the types of the reference source is set).
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author ekki@dtu.dk
	 */
	protected void addEReferencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Reference_eReference_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Reference_eReference_feature", "_UI_Reference_type"),
				 EcnoPackage.Literals.REFERENCE__EREFERENCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null) {
				
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					// ekki: A quick (and dirty) implementation of filtering the choices
					//       of the references to the valid ones. This could be done
					//       more efficiently, but should do for small models.
					Collection<?> result = super.getChoiceOfValues(object);
					if (object instanceof Reference) {
						Reference reference = (Reference) object;
						ElementType source = reference.getSource();
						EClass eClassSource = null;
						if (source != null && (eClassSource = source.getEClass()) != null) {
							// the filter kicks in only, when the type of the source of
							// the (ECNO) reference is set
							Collection<Object> newResult = new ArrayList<Object>();
							for (Object choice: result) {
								if (choice instanceof EReference) {
									EReference eReference = (EReference) choice;
									EClass eClassChoiceSource = eReference.getEContainingClass();
									if (eClassChoiceSource.isSuperTypeOf(eClassSource)) {
										// chose feature only, if it is a feature of a super type
										// of the source class of the reference and ... 
										ElementType target = reference.getTarget();
										if (target != null && eReference.getEReferenceType() != null &&
												target.getEClass() != null && eReference.getEReferenceType().isSuperTypeOf(target.getEClass())) {
											// if the target class (type) of the feature  is a super type of the target class of the reference
											newResult.add(eReference);
										} else if (target != null && target.getEClass() == null && (target.getPackageURI() != null && !target.getPackageURI().equals(""))) {
											// or the target does not have an EClass but an import
											newResult.add(eReference);
										}
									}
								}
							}
							EReference eRef = reference.getEReference();
							// anyway the existing value will always be offered as a choice.
							if (eRef != null && !newResult.contains(eRef)) {
								newResult.add(eRef);
							}
						}
					}
					return result;
				}
				
			});
	}
	
	/**
	 * This adds a property descriptor for the Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Reference_target_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Reference_target_feature", "_UI_Reference_type"),
				 EcnoPackage.Literals.REFERENCE__TARGET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Reference_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Reference_name_feature", "_UI_Reference_type"),
				 EcnoPackage.Literals.REFERENCE__NAME,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Upper Bound feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpperBoundPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Reference_upperBound_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Reference_upperBound_feature", "_UI_Reference_type"),
				 EcnoPackage.Literals.REFERENCE__UPPER_BOUND,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
			childrenFeatures.add(EcnoPackage.Literals.REFERENCE__SYNCHRONISATIONS);
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
	 * This returns Reference.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Reference"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Reference)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Reference_type") :
			getString("_UI_Reference_type") + " " + label;
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

		switch (notification.getFeatureID(Reference.class)) {
			case EcnoPackage.REFERENCE__NAME:
			case EcnoPackage.REFERENCE__UPPER_BOUND:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EcnoPackage.REFERENCE__SYNCHRONISATIONS:
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
				(EcnoPackage.Literals.REFERENCE__SYNCHRONISATIONS,
				 EcnoFactory.eINSTANCE.createSynchronisation()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return EcnoEditPlugin.INSTANCE;
	}

}

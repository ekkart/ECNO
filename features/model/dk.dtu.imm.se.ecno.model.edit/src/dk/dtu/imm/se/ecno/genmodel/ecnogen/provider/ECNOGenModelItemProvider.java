/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.genmodel.ecnogen.provider;


import dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel;
import dk.dtu.imm.se.ecno.genmodel.ecnogen.EcnogenPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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
 * This is the item provider adapter for a {@link dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ECNOGenModelItemProvider
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
	public ECNOGenModelItemProvider(AdapterFactory adapterFactory) {
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

			addEmfGenModelPropertyDescriptor(object);
			addEcnoModelPropertyDescriptor(object);
			addBasePathECNOEventsPropertyDescriptor(object);
			addBasePathECNOAutomataPropertyDescriptor(object);
			addAutomataFactoryClassNamePropertyDescriptor(object);
			addBehaviourModelPropertyDescriptor(object);
			addBasePathModelClassPropertyDescriptor(object);
			addModelClassNamePropertyDescriptor(object);
			addPackageAdapterFactoryClassNamePropertyDescriptor(object);
			addRequiredPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Emf Gen Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmfGenModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ECNOGenModel_emfGenModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ECNOGenModel_emfGenModel_feature", "_UI_ECNOGenModel_type"),
				 EcnogenPackage.Literals.ECNO_GEN_MODEL__EMF_GEN_MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ecno Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEcnoModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ECNOGenModel_ecnoModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ECNOGenModel_ecnoModel_feature", "_UI_ECNOGenModel_type"),
				 EcnogenPackage.Literals.ECNO_GEN_MODEL__ECNO_MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Path ECNO Events feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBasePathECNOEventsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ECNOGenModel_basePathECNOEvents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ECNOGenModel_basePathECNOEvents_feature", "_UI_ECNOGenModel_type"),
				 EcnogenPackage.Literals.ECNO_GEN_MODEL__BASE_PATH_ECNO_EVENTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Path ECNO Automata feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBasePathECNOAutomataPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ECNOGenModel_basePathECNOAutomata_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ECNOGenModel_basePathECNOAutomata_feature", "_UI_ECNOGenModel_type"),
				 EcnogenPackage.Literals.ECNO_GEN_MODEL__BASE_PATH_ECNO_AUTOMATA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Automata Factory Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutomataFactoryClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ECNOGenModel_AutomataFactoryClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ECNOGenModel_AutomataFactoryClassName_feature", "_UI_ECNOGenModel_type"),
				 EcnogenPackage.Literals.ECNO_GEN_MODEL__AUTOMATA_FACTORY_CLASS_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Behaviour Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBehaviourModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ECNOGenModel_BehaviourModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ECNOGenModel_BehaviourModel_feature", "_UI_ECNOGenModel_type"),
				 EcnogenPackage.Literals.ECNO_GEN_MODEL__BEHAVIOUR_MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Path Model Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBasePathModelClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ECNOGenModel_basePathModelClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ECNOGenModel_basePathModelClass_feature", "_UI_ECNOGenModel_type"),
				 EcnogenPackage.Literals.ECNO_GEN_MODEL__BASE_PATH_MODEL_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Model Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModelClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ECNOGenModel_ModelClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ECNOGenModel_ModelClassName_feature", "_UI_ECNOGenModel_type"),
				 EcnogenPackage.Literals.ECNO_GEN_MODEL__MODEL_CLASS_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Package Adapter Factory Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPackageAdapterFactoryClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ECNOGenModel_PackageAdapterFactoryClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ECNOGenModel_PackageAdapterFactoryClassName_feature", "_UI_ECNOGenModel_type"),
				 EcnogenPackage.Literals.ECNO_GEN_MODEL__PACKAGE_ADAPTER_FACTORY_CLASS_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Required feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ECNOGenModel_required_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ECNOGenModel_required_feature", "_UI_ECNOGenModel_type"),
				 EcnogenPackage.Literals.ECNO_GEN_MODEL__REQUIRED,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns ECNOGenModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ECNOGenModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ECNOGenModel)object).getAutomataFactoryClassName();
		return label == null || label.length() == 0 ?
			getString("_UI_ECNOGenModel_type") :
			getString("_UI_ECNOGenModel_type") + " " + label;
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

		switch (notification.getFeatureID(ECNOGenModel.class)) {
			case EcnogenPackage.ECNO_GEN_MODEL__BASE_PATH_ECNO_EVENTS:
			case EcnogenPackage.ECNO_GEN_MODEL__BASE_PATH_ECNO_AUTOMATA:
			case EcnogenPackage.ECNO_GEN_MODEL__AUTOMATA_FACTORY_CLASS_NAME:
			case EcnogenPackage.ECNO_GEN_MODEL__BASE_PATH_MODEL_CLASS:
			case EcnogenPackage.ECNO_GEN_MODEL__MODEL_CLASS_NAME:
			case EcnogenPackage.ECNO_GEN_MODEL__PACKAGE_ADAPTER_FACTORY_CLASS_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return EcnogenEditPlugin.INSTANCE;
	}

}

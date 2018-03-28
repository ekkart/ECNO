/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package emf.bankingsystem.provider;


import emf.bankingsystem.BankingsystemFactory;
import emf.bankingsystem.BankingsystemPackage;
import emf.bankingsystem.Setting;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link emf.bankingsystem.Setting} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SettingItemProvider
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
	public SettingItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(BankingsystemPackage.Literals.SETTING__OBJECTS);
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
	 * This returns Setting.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Setting"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Setting_type");
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

		switch (notification.getFeatureID(Setting.class)) {
			case BankingsystemPackage.SETTING__OBJECTS:
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
				(BankingsystemPackage.Literals.SETTING__OBJECTS,
				 BankingsystemFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(BankingsystemPackage.Literals.SETTING__OBJECTS,
				 BankingsystemFactory.eINSTANCE.createNaturalPerson()));

		newChildDescriptors.add
			(createChildParameter
				(BankingsystemPackage.Literals.SETTING__OBJECTS,
				 BankingsystemFactory.eINSTANCE.createPhysicalBankCard()));

		newChildDescriptors.add
			(createChildParameter
				(BankingsystemPackage.Literals.SETTING__OBJECTS,
				 BankingsystemFactory.eINSTANCE.createBankNote()));

		newChildDescriptors.add
			(createChildParameter
				(BankingsystemPackage.Literals.SETTING__OBJECTS,
				 BankingsystemFactory.eINSTANCE.createHW()));

		newChildDescriptors.add
			(createChildParameter
				(BankingsystemPackage.Literals.SETTING__OBJECTS,
				 BankingsystemFactory.eINSTANCE.createATMController()));

		newChildDescriptors.add
			(createChildParameter
				(BankingsystemPackage.Literals.SETTING__OBJECTS,
				 BankingsystemFactory.eINSTANCE.createBankGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BankingsystemPackage.Literals.SETTING__OBJECTS,
				 BankingsystemFactory.eINSTANCE.createSwiftNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(BankingsystemPackage.Literals.SETTING__OBJECTS,
				 BankingsystemFactory.eINSTANCE.createAccountMngr()));

		newChildDescriptors.add
			(createChildParameter
				(BankingsystemPackage.Literals.SETTING__OBJECTS,
				 BankingsystemFactory.eINSTANCE.createAccount()));

		newChildDescriptors.add
			(createChildParameter
				(BankingsystemPackage.Literals.SETTING__OBJECTS,
				 BankingsystemFactory.eINSTANCE.createBankCard()));

		newChildDescriptors.add
			(createChildParameter
				(BankingsystemPackage.Literals.SETTING__OBJECTS,
				 BankingsystemFactory.eINSTANCE.createCustomer()));

		newChildDescriptors.add
			(createChildParameter
				(BankingsystemPackage.Literals.SETTING__OBJECTS,
				 BankingsystemFactory.eINSTANCE.createSession()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return BankingsystemEditPlugin.INSTANCE;
	}

}

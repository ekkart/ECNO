/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.pn.ecnonets.provider;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import org.pnml.tools.epnk.datatypes.pnmldatatypes.provider.PNMLDataTypesEditPlugin;

import org.pnml.tools.epnk.pnmlcoremodel.provider.PNMLCoreModelEditPlugin;

import org.pnml.tools.epnk.pntypes.ptnet.provider.PTnetEditPlugin;

import org.pnml.tools.epnk.structuredpntypemodel.provider.PNMLStructuredPNTypeModelEditPlugin;

/**
 * This is the central singleton for the ECNONets edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class ECNONetsEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ECNONetsEditPlugin INSTANCE = new ECNONetsEditPlugin();

	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECNONetsEditPlugin() {
		super
		  (new ResourceLocator [] {
		     PNMLCoreModelEditPlugin.INSTANCE,
		     PNMLDataTypesEditPlugin.INSTANCE,
		     PNMLStructuredPNTypeModelEditPlugin.INSTANCE,
		     PTnetEditPlugin.INSTANCE,
		   });
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipsePlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}
	}

}

package PetriNets.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		PetriNets.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		PetriNets.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		PetriNets.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		PetriNets.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		PetriNets.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return PetriNets.diagram.part.PetriNetDiagramEditorPlugin.getInstance()
				.getPreferenceStore();
	}
}

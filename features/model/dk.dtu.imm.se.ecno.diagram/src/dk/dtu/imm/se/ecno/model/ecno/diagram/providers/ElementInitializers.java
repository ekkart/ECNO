package dk.dtu.imm.se.ecno.model.ecno.diagram.providers;

import dk.dtu.imm.se.ecno.model.ecno.diagram.part.EcnoDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = EcnoDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			EcnoDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}

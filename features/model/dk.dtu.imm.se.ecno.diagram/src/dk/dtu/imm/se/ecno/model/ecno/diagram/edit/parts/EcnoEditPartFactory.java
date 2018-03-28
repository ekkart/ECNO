package dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

import dk.dtu.imm.se.ecno.model.ecno.diagram.part.EcnoVisualIDRegistry;

/**
 * @generated
 */
public class EcnoEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (EcnoVisualIDRegistry.getVisualID(view)) {

			case PackageEditPart.VISUAL_ID:
				return new PackageEditPart(view);

			case EventTypeEditPart.VISUAL_ID:
				return new EventTypeEditPart(view);

			case EventTypeNameEditPart.VISUAL_ID:
				return new EventTypeNameEditPart(view);

			case ElementTypeEditPart.VISUAL_ID:
				return new ElementTypeEditPart(view);

			case ElementTypeNameEditPart.VISUAL_ID:
				return new ElementTypeNameEditPart(view);

			case EventTypeExtensionEditPart.VISUAL_ID:
				return new EventTypeExtensionEditPart(view);

			case EventTypeExtensionNameEditPart.VISUAL_ID:
				return new EventTypeExtensionNameEditPart(view);

			case FormalParameterEditPart.VISUAL_ID:
				return new FormalParameterEditPart(view);

			case CoordinationSetEditPart.VISUAL_ID:
				return new CoordinationSetEditPart(view);

			case CoordinationSetTriggerEditPart.VISUAL_ID:
				return new CoordinationSetTriggerEditPart(view);

			case FormalParameter2EditPart.VISUAL_ID:
				return new FormalParameter2EditPart(view);

			case EventTypeParametersEditPart.VISUAL_ID:
				return new EventTypeParametersEditPart(view);

			case EventTypeExtensionParametersEditPart.VISUAL_ID:
				return new EventTypeExtensionParametersEditPart(view);

			case ReferenceEditPart.VISUAL_ID:
				return new ReferenceEditPart(view);

			case ReferenceUpperBoundEditPart.VISUAL_ID:
				return new ReferenceUpperBoundEditPart(view);

			case ReferenceUpperBound2EditPart.VISUAL_ID:
				return new ReferenceUpperBound2EditPart(view);

			case SynchronisationEditPart.VISUAL_ID:
				return new SynchronisationEditPart(view);

			case SynchronisationEventNameTypeEditPart.VISUAL_ID:
				return new SynchronisationEventNameTypeEditPart(view);

			case ElementTypeSuperEditPart.VISUAL_ID:
				return new ElementTypeSuperEditPart(view);

			case EventTypeSuperEditPart.VISUAL_ID:
				return new EventTypeSuperEditPart(view);

			case EventTypeExtensionBaseEditPart.VISUAL_ID:
				return new EventTypeExtensionBaseEditPart(view);

			case String2EventTypeExtensionMapEditPart.VISUAL_ID:
				return new String2EventTypeExtensionMapEditPart(view);

			case String2EventTypeExtensionMapKeyEditPart.VISUAL_ID:
				return new String2EventTypeExtensionMapKeyEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrappingLabel)
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				if (getWrapLabel().isTextWrapOn()
						&& getWrapLabel().getText().length() > 0) {
					rect.setSize(new Dimension(text.computeSize(rect.width,
							SWT.DEFAULT)));
				} else {
					int avr = FigureUtilities.getFontMetrics(text.getFont())
							.getAverageCharWidth();
					rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
							SWT.DEFAULT)).expand(avr * 2, 0));
				}
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}

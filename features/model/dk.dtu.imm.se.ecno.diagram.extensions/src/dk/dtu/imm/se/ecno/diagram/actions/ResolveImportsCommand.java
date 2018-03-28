package dk.dtu.imm.se.ecno.diagram.actions;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import dk.dtu.imm.se.ecno.model.ecno.EcnoPackage;
import dk.dtu.imm.se.ecno.model.ecno.ElementType;
import dk.dtu.imm.se.ecno.model.ecno.EventType;
import dk.dtu.imm.se.ecno.model.ecno.EventTypeExtension;
import dk.dtu.imm.se.ecno.model.ecno.ImportedType;
import dk.dtu.imm.se.ecno.model.ecno.Package;

public class ResolveImportsCommand extends CompoundCommand {
	
	public ResolveImportsCommand(EditingDomain domain, Package ecnoPackage) {
		super("Resolve imports", "Resolves URIs and names of imported event and element types");
		
		for (ElementType type: ecnoPackage.getElementTypes()) {
			ImportedType imported = type.getImport();
			if (imported instanceof ElementType) {
				ElementType importedElementType = (ElementType) imported;
				EObject container = imported.eContainer();
				if (container instanceof Package) {
					String uri = ((Package) container).getUri();
		            String name = importedElementType.getName();
					if (uri != null && !uri.isEmpty()) {
						append(new SetCommand(domain, type, EcnoPackage.eINSTANCE.getImportedType_PackageURI(), uri));
						append(new SetCommand(domain, type, EcnoPackage.eINSTANCE.getImportedType_TypeName(), name));
					}
				}
			}			
		}
		
		for (EventType type: ecnoPackage.getEventTypes()) {
			ImportedType imported = type.getImport();
			if (imported instanceof EventType) {
				EventType importedEventType = (EventType) imported;
				EObject container = imported.eContainer();
				if (container instanceof Package) {
					String uri = ((Package) container).getUri();
		            String name = importedEventType.getName();
					if (uri != null && !uri.isEmpty()) {
						append(new SetCommand(domain, type, EcnoPackage.eINSTANCE.getImportedType_PackageURI(), uri));
						append(new SetCommand(domain, type, EcnoPackage.eINSTANCE.getImportedType_TypeName(), name));
					}
				}
			}			
		}
		
		for (EventTypeExtension extension: ecnoPackage.getEventTypeExtensions()) {
			ImportedType imported = extension.getImport();
			if (imported instanceof EventTypeExtension) {
				EventTypeExtension importedEventTypeExtension = (EventTypeExtension) imported;
				EObject container = imported.eContainer();
				if (container instanceof Package) {
					String uri = ((Package) container).getUri();
		            String name = importedEventTypeExtension.getName();
					if (uri != null && !uri.isEmpty()) {
						append(new SetCommand(domain, extension, EcnoPackage.eINSTANCE.getImportedType_PackageURI(), uri));
						append(new SetCommand(domain, extension, EcnoPackage.eINSTANCE.getImportedType_TypeName(), name));
					}
				}
			}
		}
	}
	
}
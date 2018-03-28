package dk.dtu.imm.se.ecno.model.generator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel;
import dk.dtu.imm.se.ecno.model.ecno.ElementType;
import dk.dtu.imm.se.ecno.model.ecno.EventType;
import dk.dtu.imm.se.ecno.model.ecno.EventTypeExtension;
import dk.dtu.imm.se.ecno.model.ecno.FormalParameter;
import dk.dtu.imm.se.ecno.model.ecno.Package;
import dk.dtu.imm.se.ecno.model.ecno.Reference;

public class ECNOModelContext {
	
	final private Context context;

	final private List<ElementType> elements;
	final private List<EventType> events;
	final private List<EventTypeExtension> eventExtensions;
	final private List<FormalParameter> parameters;
	final private List<Reference> references;
	
	private boolean hasCoordinationSets;
	private boolean hasSynchronisations;
	
	final private Map<EPackage, GenPackage> ePackage2genPackage;

	public ECNOModelContext(Context context) {
		super();
		this.context = context;

		Package pack = context.getEcnopackage();
		elements = pack.getElementTypes();
		events = pack.getEventTypes();
		eventExtensions = pack.getEventTypeExtensions();

		parameters = new ArrayList<FormalParameter>();
		for (EventType type: events) {
			parameters.addAll(type.getParameters());
		}
		for (EventTypeExtension type: eventExtensions) {
			parameters.addAll(type.getParameters());
		}

		hasCoordinationSets = false;
		references = new ArrayList<Reference>();
		for (ElementType type: elements) {
			references.addAll(type.getReferences());
			if (!type.getCoordinationSets().isEmpty()) {
				hasCoordinationSets = true;
			}
		}

		hasSynchronisations = false;
		for (Reference reference: references) {
			if (!reference.getSynchronisations().isEmpty()) {
				hasSynchronisations = true;
				break;
			}
		}

		ePackage2genPackage = new HashMap<EPackage, GenPackage>();
		// read all EMF packages from other required ECNO packages
		for (ECNOGenModel ecnoGenModel: context.getEcnogenmodel().getRequired()) {
			for (GenModel emfGenModel: ecnoGenModel.getEmfGenModel()) {
				for (GenPackage emfGenPackage: emfGenModel.getGenPackages()) {
					EPackage emfPackage = emfGenPackage.getEcorePackage();
					if (ePackage2genPackage.get(emfPackage) == null) {
						ePackage2genPackage.put(emfPackage, emfGenPackage);
					}
				}
			}
		}
		// read extra EMF packages (typically used for event parameter declarations only)
		for (GenModel emfGenModel: context.getEcnogenmodel().getEmfGenModel()) {
			for (GenPackage emfGenPackage: emfGenModel.getGenPackages()) {
				EPackage emfPackage = emfGenPackage.getEcorePackage();
				if (ePackage2genPackage.get(emfPackage) == null) {
					ePackage2genPackage.put(emfPackage, emfGenPackage);
				}
			}
		}
	}

	public List<Reference> getReferences() {
		return references;
	}

	public Context getContext() {
		return context;
	}

	public Package getECNOPackage() {
		return context.getEcnopackage();
	}

	public List<ElementType> getElements() {
		return elements;
	}

	public List<EventType> getEvents() {
		return events;
	}

	public boolean hasCoordinationSets() {
		return hasCoordinationSets;
	}

	public boolean hasSynchronisations() {
		return hasSynchronisations;
	}

	public List<EventTypeExtension> getEventTypeExtensions() {
		return eventExtensions;
	}

	public List<FormalParameter> getParameters() {
		return parameters;
	}

	public String getModelClassName() {
		return context.getEcnogenmodel().getModelClassName();
	}

	public String getModelClassPath() {
		return context.getEcnogenmodel().getBasePathModelClass();
	}

	public String getVariableName(FormalParameter parameter) {
		EObject parent = parameter.eContainer();
		if (parent != null) {
			if (parent instanceof EventType) {
				EventType event = (EventType) parent;
				return "formalparameter_" + event.getName() + "_" + parameter.getName();
			} else if (parent instanceof EventTypeExtension) {
				EventTypeExtension eventExtension = (EventTypeExtension) parent;
				return "formalparameter_" + eventExtension.getName() + "_" + parameter.getName();
			}
		}

		return null;
	}

	public String getVariableName(EventType event) {
		return "eventtype_" + event.getName();
	}

	public String getVariableName(EventTypeExtension eventExtension) {
		return "eventtypeextension_" + eventExtension.getName();
	}

	public String getVariableName(ElementType element) {
		return "elementtype_" + element.getName();
	}


	private Map<Reference,String> reference2VariableName = new  HashMap<Reference,String>();
	
	public String getVariableName(Reference reference) {
		String name = reference2VariableName.get(reference);
		if (name != null) {
			return name;
		} else {
			name = "referencetype_" + reference.getSource().getName() + "_" + reference.getEReference().getName();
			if (!reference2VariableName.containsValue(name)) {
				reference2VariableName.put(reference, name);
				return name;
			} else {
				// Note that ECNO allows that there is more than one reference from the same element type
				// referring to the same reference of the underlying Ecore model. These would have the
				// same name. Here we make sure that the respective variables get an additional number 
				// in order to avoid duplicate names in the generated code (which would be a syntax error).
				String name1 = null;
				int i = 1;
				do {
					i++;
					name1 = name + "_" + i;
				} while (reference2VariableName.containsValue(name1));
				reference2VariableName.put(reference, name1);
				return name1;
			}
		}
	}

	private String getPackageAccess(EPackage pack) {
		if (context.getEpackage().equals(pack)) {
			return "pack";
		} else if (EcorePackage.eINSTANCE.equals(pack)) {
			return "org.eclipse.emf.ecore.EcorePackage.eINSTANCE";
		} else {
			GenPackage genPackage = this.ePackage2genPackage.get(pack);
			if (genPackage != null) {
				String basePackageName = genPackage.getBasePackage();
				if (basePackageName == null) {
					basePackageName = "";
				} else if (!basePackageName.isEmpty()) {
					basePackageName = basePackageName +".";
				}
				return basePackageName + 
						genPackage.getPackageName() + "." +
						genPackage.getPackageInterfaceName() +
						".eINSTANCE";
			}
		}
		return "null";
	}

	public String getPackageClassAccess(EClassifier classifier) {
		if (classifier != null) {
			String packageAccess = getPackageAccess(classifier.getEPackage());
			if (packageAccess != null) {
				return packageAccess + ".get" + classifier.getName() + "()";
			}
		} 
		return "null";
	}

	public String getPackageReferenceAccess(EReference reference) {
		EObject container = reference.eContainer();
		if (container instanceof EClass) {
			EClass eclass = (EClass) container;
			String packageAccess = getPackageAccess(eclass.getEPackage());
			if (packageAccess != null) {
				return packageAccess + ".get" + eclass.getName() + "_" + Utils.getClassName(reference.getName()) + "()";
			}
		}
		return "null";
	}

}

package dk.dtu.imm.se.ecno.model.generator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;

import dk.dtu.imm.se.ecno.core.IEventKind;
import dk.dtu.imm.se.ecno.core.IEventTypeExtension;
import dk.dtu.imm.se.ecno.core.INamedElement;
import dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel;
import dk.dtu.imm.se.ecno.model.ecno.EventType;
import dk.dtu.imm.se.ecno.model.ecno.EventTypeExtension;
import dk.dtu.imm.se.ecno.model.ecno.Package;
import dk.dtu.imm.se.ecno.model.ecno.helpers.EcorePrimitiveDatatypeMapping;

public class Context {
	
	final private ECNOGenModel ecnogenmodel;
	
	final private GenModel emfgenmodel;
	final private GenPackage emfgenpackage;

	final private EPackage epackage;
	final private Package ecnopackage;
	
	final private Map<EventType, ECNOGenModel> eventType2ecnoGenModel;
	final private Map<EventTypeExtension, ECNOGenModel> eventTypeExtension2ecnoGenModel;
	
	public Context(ECNOGenModel ecnogenmodel) {
		super();
		this.ecnogenmodel = ecnogenmodel;
		
		if (!ecnogenmodel.getEmfGenModel().isEmpty()) {
			emfgenmodel = ecnogenmodel.getEmfGenModel().get(0);
		} else {
			// This should actually not happen and code generation would
			// work in very special cases only. But for now, we do not
			// prevent code generation in this case.
			emfgenmodel = null;
		}
		// TODO: We assume here that there is only one EMF genmodel for now
		//       this should eventually be generalized
		emfgenpackage = emfgenmodel.getGenPackages().get(0);
		epackage = emfgenpackage.getEcorePackage();
		ecnopackage = ecnogenmodel.getEcnoModel();
		eventType2ecnoGenModel = new HashMap<EventType, ECNOGenModel>();
		eventTypeExtension2ecnoGenModel = new HashMap<EventTypeExtension, ECNOGenModel>();
		initializeEvents2GenModelMapping();	

	}
	
	private void initializeEvents2GenModelMapping() {
		addEvents2GenModelMapping(ecnogenmodel);
		for (ECNOGenModel ecnoGenModel: ecnogenmodel.getRequired()) {
			addEvents2GenModelMapping(ecnoGenModel);
		}
	}
	
	private void addEvents2GenModelMapping(ECNOGenModel ecnoGenModel) {
		Package pack = ecnoGenModel.getEcnoModel();
		for (EventType eventType: pack.getEventTypes()) {
			if (!eventType.isImported() && !eventType.getParameters().isEmpty()) {
				eventType2ecnoGenModel.put(eventType, ecnoGenModel);
			}
		}
		for (EventTypeExtension eventTypeExtension: pack.getEventTypeExtensions()) {
			if (!eventTypeExtension.isImported()) {
				eventTypeExtension2ecnoGenModel.put(eventTypeExtension, ecnoGenModel);
			}
		}
	}

	public GenPackage getEmfgenpackage() {
		return emfgenpackage;
	}
	
	public String getBehaviourClassName() {
		return ecnogenmodel.getAutomataFactoryClassName();
	}

	public String getBehaviourClassPath() {
		return ecnogenmodel.getBasePathECNOAutomata();
	}
	
	public String getPackageAdapterFactoryClassName() {
		return ecnogenmodel.getPackageAdapterFactoryClassName();
	}
	
	public String getQualifiedPackageAdapterFactoryClassName() {
		return ecnogenmodel.getBasePathModelClass() + "." + getPackageAdapterFactoryClassName();
	}

	public ECNOGenModel getEcnogenmodel() {
		return ecnogenmodel;
	}
	
	public String getClassName(EClassifier classifier) {
		Class<?> clazz = classifier.getInstanceClass();
		if (clazz != null) {
			return clazz.getSimpleName();
		}
		return classifier.getName();
		
		/*
		 TODO: should use the name from the genmodel (the code below uses the impl
		List<GenClass> genClasses = emfgenpackage.getGenClasses();
		for (GenClass genClass: genClasses) {
			if (genClass.getEcoreClass().equals(classifier)) {
				return genClass.getClassName();
			}
		}
		return null;
		*/
	}
	
	public String getClassPackage(EClassifier classifier) {
		// TODO should be made work for more than one package
		// return emfgenpackage.getClassPackageSuffix();
		if (classifier != null) {
			// TODO the situations in which this method is called with
			//      classifier == null, should be eliminated; this is
			//      a hack! 
			Class<?> clazz = classifier.getInstanceClass();
			if (clazz != null) {
				if (clazz.isPrimitive()) {
					return null;
				}
				java.lang.Package pckg = clazz.getPackage();
				if (pckg == null) {
					return null;
				} else {
					return pckg.getName();
					/* ekki: no special treatment of java.lang classes anymore
					 * if we wanted to do that, it should be done in the EcoreDatatpeMapping
					 * helper class
					
					String name = pckg.getName();
					if (name != null && name.equals("java.lang")) {
						return null;
					} else {
						return name;
					}
					
					*/
				}
			}
		}
		
		String prefix = emfgenpackage.getBasePackage();
		if (prefix == null) {
			return emfgenpackage.getPackageName();
		} else {
			return prefix + "." + emfgenpackage.getPackageName();
		}
	}
	
	public String getQualifiedClassName(EClassifier classifier) {
		String result = EcorePrimitiveDatatypeMapping.getQualifiedJavaClassName(classifier);
		if (result != null && !result.isEmpty()) {
			return result;
		}
		
		String packageName = getClassPackage(classifier);
		String className = getClassName(classifier);
		if (packageName == null || packageName.isEmpty()) {
			return className;
		} else {
			return packageName + "." + className;
		}
	}

	public GenModel getGenmodel() {
		return emfgenmodel;
	}

	public EPackage getEpackage() {
		return epackage;
	}

	public Package getEcnopackage() {
		return ecnopackage;
	}
	
	private EventType getClosestEventWithParameters(EventType eventType) {
		EventType result = eventType;
		Set<EventType> touched = new HashSet<EventType>();
		while (result != null && !touched.contains(result) && (result.isImported() || result.getParameters().isEmpty()) ) {
			touched.add(result);
			if (result.getSuper() != null) {
				result = result.getSuper();
			} else if (result.getImport() instanceof EventType) {
				result = (EventType) result.getImport();
			} else {
				result = null;
			}
		}
		
		if (touched.contains(result)) {
			return null;
		} else {
			return result;
		}
		
	}
	
	public String getEventValueClassQualifiedName(String eventType) {
		// TODO this is a minor hack since imported events cannot be looked
		//      up by name. This should probably be changed, so that we
		//      use the EventType directly instead of its name in the
		//      current package (which always requires to import the
		//      event types from which events in the package are derived.
		INamedElement element = ecnopackage.getElement(eventType);
		if (element == null) {
			// if the event cannot be looked up by name, we need to
			// check whether it is an imported event, which then
			// will be implicitly resolved by the 
			// getClosestEventWithParameters() method
			for (EventType type: ecnopackage.getEventTypes()) {
				if (eventType.equals(type.getName())) {
					element = type;
					break;
				}
			}
		}
		
		if (element == null) {
			// if there still was no element check, whether it was an imported
			// event type extension and resolve it
			for (EventTypeExtension type: ecnopackage.getEventTypeExtensions()) {
				if (eventType.equals(type.getName())) {
					element = this.resolve(type);
					break;
				}
			}
		}
		
		if (element instanceof EventType) {
			EventType event = this.getClosestEventWithParameters((EventType) element);
			ECNOGenModel ecnoGenModel = eventType2ecnoGenModel.get(event);
			if (ecnoGenModel != null) {
				String prefix = ecnoGenModel.getBasePathECNOEvents();
				if (prefix == null) {
					prefix = "";
				} else {
					prefix += ".";
				}
				
				return prefix + Utils.convert2ClassName(event.getName());
			}
		} else if (element instanceof EventTypeExtension) {
			ECNOGenModel ecnoGenModel = eventTypeExtension2ecnoGenModel.get(element);
			if (ecnoGenModel != null) {
				String prefix = ecnoGenModel.getBasePathECNOEvents();
				if (prefix == null) {
					prefix = "";
				} else {
					prefix += ".";
				}
				
				return prefix + Utils.convert2ClassName(element.getName());
			}
		}
		
		// TODO eventually the ECNO gen model should be extended so that the Event
		//      value class for IEventTypes coming from other technologies can
		//      be looked up there. For now, we just return the Event_Values class
		//      with the fully qualified name (indicating that some parameters from
		//      other technologies might be missing and cannot be
		//      accessed).
		return "dk.dtu.imm.se.ecno.runtime.Event_Values";
	}
	
	public boolean isEventAccessNeeded(String eventKind) {
		INamedElement element = ecnopackage.getElement(eventKind);
		if (element instanceof IEventTypeExtension) {
			return true;
		} else if (element instanceof IEventKind) {
			return !((IEventKind) element).getFormalParametersList().isEmpty();
		}
		return false;
	}
	
	public boolean hasEventTypeValueClasses() {
		for (EventType eventType: ecnopackage.getEventTypes()) {
			if (!eventType.isImported() && eventType.getParameters().size() > 0) {
				return true;
			}
		}
		return false;
	}
	
	private EventTypeExtension resolve(EventTypeExtension eventTypeExtension) {
		EventTypeExtension result = eventTypeExtension;
		Set<EventTypeExtension> touched = new HashSet<EventTypeExtension>();
		while (result != null && !touched.contains(result) && result.isImported()) {
			touched.add(result);
			if (result.getImport() instanceof EventTypeExtension) {
				result = (EventTypeExtension) result.getImport();
			} else {
				result = null;
			}
		}
		
		if (touched.contains(result)) {
			return null;
		} else {
			return result;
		}
		
	}
	
	public boolean hasEventTypeExtensionValueClasses() {
		for (EventTypeExtension eventTypeExtension: ecnopackage.getEventTypeExtensions()) {
			if (!eventTypeExtension.isImported()) {
				return true;
			}
		}
		return false;	
	}

	public String getQualifiedModelClassName() {
		return getEcnogenmodel().getBasePathModelClass() + "." + getEcnogenmodel().getModelClassName();
	}


}

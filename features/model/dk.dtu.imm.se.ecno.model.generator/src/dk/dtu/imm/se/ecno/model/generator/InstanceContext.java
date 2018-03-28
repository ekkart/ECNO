package dk.dtu.imm.se.ecno.model.generator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.StringEscapeUtils;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel;
import dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.ECNOInstanceGenModel;
import dk.dtu.imm.se.ecno.model.ecno.ElementType;

public class InstanceContext {
	
	final private ECNOInstanceGenModel instGenModel;
	final private EObject instance;
	
	private List<EObject> contents;
	private Map<EObject,String> object2name;
	
	private List<EObject> guiobjects;
	
	private Map<String, Context> emfPackage2context;
	private Map<String, String> emfPackage2packageVariable;
	private List<String>  emfPackageURIs;
	private List<Context> contexts;

	public InstanceContext(ECNOInstanceGenModel instGenModel) {
		super();
		this.instGenModel = instGenModel;
		this.instance = instGenModel.getInstance();
		this.emfPackage2context = new HashMap<String, Context>();
		this.emfPackage2packageVariable = new HashMap<String, String>();
		this.emfPackageURIs = new ArrayList<String>();
		this.contexts = new ArrayList<Context>();
		
		initializeContents();
	}

	public ECNOInstanceGenModel getInstGenModel() {
		return instGenModel;
	}

	public EObject getInstance() {
		return instance;
	}
	
	public String getInstanceClassName() {
		return instGenModel.getInstanceClassName();
	}
	
	public String getInstanceClassPackage() {
		return instGenModel.getBasePathECNOInstance();
	}
	
	public List<EObject> getContainedEObjects() {
		return contents;
	}
	
	public List<EObject> getGUIObjects() {
		return guiobjects;
	}
	
	public String getObjectName(EObject object) {
		return object2name.get(object);
	}
	
	private void initializeContents() {
		HashMap<String, Set<EClass>> guiClasses = new HashMap<String, Set<EClass>>();
		int count = 1;
		for (ECNOGenModel ecnoGenModel: instGenModel.getEcnoGenModel()) {
			Context context = new Context(ecnoGenModel);
			contexts.add(context);
			String uri = ecnoGenModel.getEcnoModel().getEPackage().getNsURI();
			if (!this.emfPackageURIs.contains(uri)) {
				emfPackageURIs.add(uri);
				emfPackage2context.put(uri, context);
				emfPackage2packageVariable.put(uri, "factory"+count++);	
			}
			for (ElementType element: context.getEcnopackage().getElementTypes()) {
				if (element.isGui()) {
					Set<EClass> set = guiClasses.get(element.getEClass().getName());
					if (set == null) {
						set = new HashSet<EClass>();
						guiClasses.put(element.getEClass().getName(), set);
					}
					set.add(element.getEClass());
				}
			}
		}
		
		// this.contents = instance.eContents();
		this.contents = new ArrayList<EObject>();
		Iterator<EObject> iterator = instance.eAllContents();
		this.contents.add(this.instance);
		while (iterator.hasNext()) {
			this.contents.add(iterator.next());
		}

		this.guiobjects = new ArrayList<EObject>();
		this.object2name = new HashMap<EObject,String>();

		int i = 1;
		for (EObject object: contents) {
			EClass eclass = object.eClass();
			Set<EClass> set = guiClasses.get(eclass.getName());
			if (set != null) {
				for (EClass eclass2: set) {
					// In some situations, the models are not identical copies (when there is a
					// reference to an ecore model, which is also running as a plugin). Therefore,
					// we need compare the elements by name and the NsURI of the respective package.
					if (eclass.getEPackage().getNsURI().equals(eclass2.getEPackage().getNsURI())) {
						guiobjects.add(object);
						break;
					}
				}
			}
			object2name.put(object, "o"+i);
			i++;
		}
	}
	
	public Map<String, String> getAttributes(EObject object) {
		Map<String, String> attributes = new HashMap<String, String>(); 
		for (EAttribute attribute: object.eClass().getEAllAttributes()) {
			if (!attribute.isMany() && attribute.isChangeable()) {
				Object value = object.eGet(attribute);
				if (value != null) {
					if (value instanceof Number) {
						if (value instanceof Float) {
							attributes.put(Utils.convert2ClassName(attribute.getName()), "(float) " + value.toString());
						} else if (value instanceof Byte) {
							attributes.put(Utils.convert2ClassName(attribute.getName()), "(byte) " + value.toString());
						} else {
							attributes.put(Utils.convert2ClassName(attribute.getName()), value.toString());
						}
					} else if (value instanceof String) {
						attributes.put(Utils.convert2ClassName(attribute.getName()), "\"" + StringEscapeUtils.escapeJavaScript((String) value) + "\"");
					} else if (value instanceof Boolean) {
						attributes.put(Utils.convert2ClassName(attribute.getName()), value.toString());
					}
				}
			}
		}
		return attributes;		
	}
	
	public Map<String, String> getSingleLinks(EObject object) {
		Map<String, String> links = new HashMap<String, String>(); 
		for (EReference reference: object.eClass().getEAllReferences()) {
			if (!reference.isMany()) {
				Object value = object.eGet(reference);
				EReference opposite = reference.getEOpposite();
				if (value != null && value instanceof EObject && 
						// make sure that in case of opposite references the resp. link is only created once
						(opposite == null || opposite.isMany() || 
						reference.getName().compareTo(opposite.getName()) < 0  ||
						( reference.getName().compareTo(opposite.getName()) == 0 &&
						System.identityHashCode(reference) <= System.identityHashCode(opposite)))) {
					links.put(Utils.convert2ClassName(reference.getName()), getObjectName((EObject) value)); 
				}
			}
		}
		return links;
	}
	
	@SuppressWarnings("rawtypes")
	public Map<String, List<String>> getMultiLinks(EObject object) {
		Map<String,  List<String>> links = new HashMap<String, List<String>>(); 
		for (EReference reference: object.eClass().getEAllReferences()) {
			if (reference.isMany()) {
				Object contents = object.eGet(reference);
				EReference opposite = reference.getEOpposite();
				if (contents != null && contents instanceof List && 
						// make sure that in case of opposite references the resp. link is only created once
						(opposite == null || (opposite.isMany() &&
								(reference.getName().compareTo(opposite.getName()) < 0  ||
										( reference.getName().compareTo(opposite.getName()) == 0 &&
										System.identityHashCode(reference) <= System.identityHashCode(opposite)))))) {
					List list = (List) contents;
					if (list.size() > 0) {
						List<String> values = new ArrayList<String>();
						for (Object value: list) {
							if (value instanceof EObject) {
								values.add(getObjectName((EObject) value));
							}
						}
						links.put(Utils.convert2ClassName(reference.getName()), values);
					}
				}
			}
		}
		return links;
	}
	
	public Collection<String> getPackageURIs() {
		return Collections.unmodifiableCollection(this.emfPackageURIs);
	}
	
	public String getPackageVariable(String uri) {
		return emfPackage2packageVariable.get(uri);
	}
	
	public String getPackageVariable(EObject object) {
		String uri = object.eClass().getEPackage().getNsURI();
		return emfPackage2packageVariable.get(uri);
	}

	public Context getContext(String uri) {
		return emfPackage2context.get(uri);
	}
	
	public Context getContext(EObject object) {
		String uri = object.eClass().getEPackage().getNsURI();
		return getContext(uri);
	}
	
	public List<Context> getContexts() {
		return Collections.unmodifiableList(contexts);
	}
}

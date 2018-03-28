package dk.dtu.imm.se.ecno.pn.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dk.dtu.imm.se.ecno.core.INamedElement;
import dk.dtu.imm.se.ecno.core.INamespace;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;

public abstract class Namespace extends NamedElement implements INamespace {
	
	private List<NamedElement> elements;
	private Map<String,NamedElement> elementTypeMapping;

	public Namespace(Namespace container, String name) {
		super(container, name);
		elements = new ArrayList<NamedElement>();
		elementTypeMapping = new HashMap<String,NamedElement>();

	}
	
	void addElement(NamedElement element) {
		if (element.getNamespace() == this) {
			this.elements.add(element);
			if (element.getName() != null) {
				elementTypeMapping.put(element.getName(), element);
			}
		}
	}
	
	public List<INamedElement> getElements() {
		List<INamedElement> result = new ArrayList<INamedElement>();
		for (NamedElement element: elements) {
				result.add(element);
		}
		return result;
	}
	
	public NamedElement getElement(String name) {
		return elementTypeMapping.get(name);
	}
	
	@Override
	public String getURI() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean resolveImportedElements(ExecutionEngine engine) {
		// TODO Auto-generated method stub
		return false;
	}

}

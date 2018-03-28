package dk.dtu.imm.se.ecno.core;

import java.util.List;

import dk.dtu.imm.se.ecno.engine.ExecutionEngine;

public interface INamespace extends INamedElement {

	/**
	 * Returns the unique URI of this namespace.
	 * @return
	 */
    public String getURI();
    
	/**
	 * Returns all the elements of the name space.
	 * 
	 * @return all elements of the name space
	 */
	public List<INamedElement> getElements();

	/**
	 * Returns the element with the given name, if an 
	 * element with this name exits.
	 * 
	 * @param name
	 * @return returns the element with the given name
	 */
	public INamedElement getElement(String name);
	
	/**
	 * Resolves the imported elements from the packages that are registered with the
	 * execution engine. The call should return true if all imports could be resolved,
	 * false otherwise.
	 * 
	 * @param engine
	 * @return
	 */
	public boolean resolveImportedElements(ExecutionEngine engine);

}

package dk.dtu.imm.se.ecno.runtime;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import dk.dtu.imm.se.ecno.core.IFormalParameter;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;

public class Parameter {
	
	private IFormalParameter type;
	
	private Object value;
	
	private ExecutionEngine engine;
	
	private boolean isSorted;

	/**
	 * @deprecated
	 */
	public Parameter(IFormalParameter type) {
		super();
		this.type = type;
		this.isSorted = true;
		
		if (type != null && type.isCollective()) {
			value = new ArrayList<Object>();
		}
	}
	
	public Parameter(IFormalParameter type, ExecutionEngine engine) {
		super();
		this.type = type;
		this.engine = engine;
		
		if (type != null && type.isCollective()) {
			value = new ArrayList<Object>();
			this.isSorted = true;
		}
	}

	public IFormalParameter getType() {
		return type;
	}

	public Object getValue() {
		if (type != null && type.isCollective()) {
			// Make sure that a collective parameter is always returned as
			// unmodifiable collection, so that the parameter is not changed
			// unintentionally.
			if (!isSorted && engine != null && value instanceof List<?>) {
				Comparator<Object> elementOrder = engine.getElementOrder();
				// TODO this is a very ad hoc way to sort the list of collective
				//      parameters, if an elementOrder is provided. This could
				//      be done a bit more efficient using SortedLists (if they
				//      existed in java.utils). But we make sure that we only
				//      sort once (after an update of the list).
				if (elementOrder != null) {
					Collections.sort((List<?>) value, elementOrder);
					isSorted = true;
				}
			}
			return Collections.unmodifiableCollection((Collection<?>) value);

		} else {
			return value;
		}
	}

	/**
	 * Sets the value of the parameter, if it is not set yet. If
	 * the value is set or the value is equal to the already set
	 * value, the result is true -- false otherwise.
	 * @param value
	 * @return if the value could be set
	 */
	
	@SuppressWarnings("unchecked")
	public boolean setValue(Object value) {
		
		Class<?> clazz = null;
		
		if (type != null) {
			clazz = type.getType();
		}
		if (type == null || clazz == null || clazz.isInstance(value)) {
			if (type != null && type.isCollective()) {
				if (this.value == null) {
					// TODO here we would rather want to create a list
					//      ArrayList<type.getType()>
					this.value = new ArrayList<Object>();
				}
				if (this.value instanceof List) {
					((List<Object>) this.value).add(value);
					// mark list as unsorted if we add an element 
					// (so the list will be sorted before it is returned)
					// see comment in constructor
					isSorted = false;
					return true;
				} 
			} else if (this.value == null) {
				this.value = value;
				return true;
			} else if (this.value.equals(value)) {
				return true;
			}
		}
		return false;
	}

}

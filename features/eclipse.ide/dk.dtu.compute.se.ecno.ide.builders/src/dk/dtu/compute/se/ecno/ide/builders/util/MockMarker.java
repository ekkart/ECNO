package dk.dtu.compute.se.ecno.ide.builders.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;

import dk.dtu.compute.se.ecno.ide.builders.Activator;

/**
 * @author Tobias
 */
public class MockMarker implements IMarker {


	private final String type;
	private final Map<String, Object> attributes = new HashMap<String, Object>();

	public MockMarker(final String type) {
		this.type = type;
	}

	public MockMarker(final String type, final Map<String, Object> attributes) {
		this.type = type;
		this.attributes.putAll(attributes);
	}

	/*
	 * These methods are implemented
	 */

	@Override
	public String getType() throws CoreException {
		return type;
	}

	@Override
	public void setAttributes(final String[] attributeNames, final Object[] values)
			throws CoreException {
		if (attributeNames.length != values.length) {
			throw new IndexOutOfBoundsException("Unequal number of attributes (" + attributeNames.length
					+ ") and values (" + values.length + ")");
		}

		for (int i = 0; i < values.length; i++) {
			attributes.put(attributeNames[i], values[i]);
		}
	}

	@Override
	public void setAttributes(final Map<String, ? extends Object> attributes)
			throws CoreException {
		this.attributes.putAll(attributes);
	}

	@Override
	public void setAttribute(final String attributeName, final boolean value)
			throws CoreException {
		attributes.put(attributeName, value);
	}

	@Override
	public void setAttribute(final String attributeName, final Object value)
			throws CoreException {
		attributes.put(attributeName, value);
	}

	@Override
	public void setAttribute(final String attributeName, final int value)
			throws CoreException {
		attributes.put(attributeName, value);
	}

	@Override
	public Object[] getAttributes(final String[] attributeNames) throws CoreException {
		final Object[] values = new Object[attributeNames.length];
		for (int i = 0; i < values.length; i++) {
			values[i] = getAttribute(attributeNames[i]);
		}
		return values;
	}

	@Override
	public Map<String, Object> getAttributes() throws CoreException {
		return Collections.unmodifiableMap(attributes);
	}

	@Override
	public boolean getAttribute(final String attributeName, final boolean defaultValue) {
		try {
			final Object value = getAttribute(attributeName);
			if (value == null) {
				return defaultValue;
			} else {
				return (Boolean) value;
			}
		} catch (final CoreException e) {
			return defaultValue;
		}

	}

	@Override
	public String getAttribute(final String attributeName, final String defaultValue) {
		try {
			final Object value = getAttribute(attributeName);
			if (value == null) {
				return defaultValue;
			} else {
				return (String) value;
			}
		} catch (final CoreException e) {
			return defaultValue;
		}

	}

	@Override
	public int getAttribute(final String attributeName, final int defaultValue) {
		try {
			final Object value = getAttribute(attributeName);
			if (value == null) {
				return defaultValue;
			} else {
				return (Integer) value;
			}
		} catch (final CoreException e) {
			return defaultValue;
		}

	}

	@Override
	public Object getAttribute(final String attributeName) throws CoreException {
		final Object value = attributes.get(attributeName);
		if (value == null) {
			// We log any request for attributes which isn't supported
			// so we can catch any bugs due to missing attributes.
			log("getAttribute", attributeName);
		}
		return value;
	}

	private void log(final String methodName, final Object... arguments) {
		final String msg = "Unhandled call to mock marker. Method: '"
				+ methodName + ". Args: " + Arrays.toString(arguments);
		final RuntimeException e = new UnsupportedOperationException(msg);
		Activator.log().error(msg, e);
	}


	/*
	 * Methods below this comment is not implemented, and will log an error
	 */

	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") final Class adapter) {
		log("getAdapter", adapter);
		return null;
	}

	@Override
	public boolean isSubtypeOf(final String superType) throws CoreException {
		log("isSubtypeOf", superType);
		return false;
	}

	@Override
	public IResource getResource() {
		log("getResource");
		return null;
	}

	@Override
	public long getId() {
		log("getId");
		return 0;
	}

	@Override
	public long getCreationTime() throws CoreException {
		log("getCreationTime");
		return 0;
	}

	@Override
	public boolean exists() {
		log("exists");
		return false;
	}

	@Override
	public void delete() throws CoreException {
		log("delete");
	}
}

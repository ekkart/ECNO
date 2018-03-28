package dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.presentation;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;

/**
 * A package registry, which filters out packages that are plugged in to
 * the eclipse, but use the ecore model the instance model is referring to.
 * This way problems of using two different copies of the same underlying
 * ecore model (which results in not recognizing the GUI events) is solved.
 * 
 * All methods except getEPackage() delegate their function to the standard
 * package registry. Only getEPackage() restricts the use of the standard
 * registry to the packages mentioned above.
 * 
 * @generated NOT
 * @author Ekkart Kindler, ekki@dtu.dk
 */

// XXX: 28. 4. 2013: This class can be deleted now, since the problem that
//         these FilteredPackageRegistry solved, is solved now in a different
//         way (in the InstanceContext)
public class FilteredPackageRegistry implements Registry {

	private Registry delegate;

	public FilteredPackageRegistry(Registry delegate) {
		this.delegate = delegate;
	}

	@Override
	public void clear() {
		delegate.clear();
		
	}

	@Override
	public boolean containsKey(Object key) {
		return delegate.containsKey(key);
	}

	@Override
	public boolean containsValue(Object value) {
		return delegate.containsValue(value);
	}

	@Override
	public Set<java.util.Map.Entry<String, Object>> entrySet() {
		return delegate.entrySet();
	}

	@Override
	public Object get(Object key) {
		return delegate.get(key);
	}

	@Override
	public boolean isEmpty() {
		return delegate.isEmpty();
	}

	@Override
	public Set<String> keySet() {
		return delegate.keySet();
	}

	@Override
	public Object put(String key, Object value) {
		return delegate.put(key, value);
	}

	@Override
	public void putAll(Map<? extends String, ? extends Object> m) {
		// TODO Auto-generated method stub
		delegate.putAll(m);
		
	}

	@Override
	public Object remove(Object key) {
		return delegate.remove(key);
	}

	@Override
	public int size() {
		return delegate.size();
	}

	@Override
	public Collection<Object> values() {
		return delegate.values();
	}

	@Override
	public EFactory getEFactory(String arg0) {
		return delegate.getEFactory(arg0);
	}

	@Override
	public EPackage getEPackage(String arg0) {
		if (isInFilter(arg0)) {
			EPackage result = delegate.getEPackage(arg0);
			return result;
		} else {
			return null;
		}
	}
	
	/**
	 * Filters the package for which this registry should provide the
	 * packages. Right now these are the EMF Ecore and GenModel, and ECNO and
	 * ECNO gen model and the ECNO instance gen model.
	 * 
	 * @param arg
	 * @return
	 */
	private boolean isInFilter(String arg) {
		/* These are the packages we need right now
		 *   http://www.eclipse.org/emf/2002/Ecore
		 *   http://www.eclipse.org/emf/2002/GenModel
		 *   http://ecno.se.imm.dtu.dk/ecno/instancegen
		 *   http://ecno.se.imm.dtu.dk/ecno
		 *   http://ecno.se.imm.dtu.dk/ecno/gen
		 *   
		 * All others should be filtered out (in order to make sure that we
		 * use the dynamic model of them and not another plugged in copy
		 * (which would get some stuff wrong due to two different instances
		 * of the same ecore model).
		 *   
		 * But, the filter is slightly more general in order to cater for future
		 * versions and extensions (hoping that the prefix does not change).
		 */
		return arg.startsWith("http://www.eclipse.org/emf/") ||
				arg.startsWith("http://ecno.se.imm.dtu.dk/ecno");
	}
	
	
}

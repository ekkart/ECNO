package dk.dtu.imm.se.ecno.eclipse.emf.utils;

import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class WeakList<E> extends AbstractList<E> {

	private ArrayList<WeakReference<E>> weakReferences;
	private ArrayList<E> strongReferences;
	
	public WeakList() {
		weakReferences = null;
		// initially, all references are strong
		strongReferences = new ArrayList<E>();
	}
	
	public WeakList(Collection<E> collection) {
		this();
		addAll(collection);
	}
	
	@Override
	public void add(int index, E element) {
		if (weakReferences != null) {
			weakReferences.add(index, new WeakReference<E>(element));
		} else if (strongReferences != null) {
			strongReferences.add(index, element);
		}
	}

	@Override
	public E set(int index, E element) {
		if (weakReferences != null) {
			WeakReference<E> oldRef = weakReferences.set(index, new WeakReference<E>(element));
			if (oldRef != null) {
				return oldRef.get();
			} else {
				return null;
			}
		} else if (strongReferences != null) {
			return strongReferences.set(index, element);
		}
		
	    return null;
	}
	
	@Override
	public E get(int index) {
		if (weakReferences != null) {
			WeakReference<E> ref =  weakReferences.get(index);
			if (ref != null) {
				return ref.get();
			} else {
				return null;
			}
		} else if (strongReferences != null) {
			return strongReferences.get(index);
		}
		
		return null;
	}
	
	

	/* (non-Javadoc)
	 * @see java.util.AbstractList#remove(int)
	 */
	@Override
	public E remove(int index) {
		if (weakReferences != null) {
			WeakReference<E> ref = weakReferences.remove(index);
			return ref.get();
		} else if (strongReferences != null) {
			return strongReferences.remove(index);
		} else {
			return null;
		}
	}
	
	

	@Override
	public int size() {
		if (weakReferences != null) {
			return weakReferences.size();
		} else if (strongReferences != null) {
			return strongReferences.size();
		}
		
		return 0;
	}
	
	synchronized boolean cleanPhantoms() {
		if (weakReferences != null) {
			boolean removed = false;
			List<WeakReference<E>> phantoms = new ArrayList<WeakReference<E>>();
			for (WeakReference<E> ref: weakReferences) {
				if (ref.get() == null) {
					phantoms.add(ref);
					removed = true;
				}
			}
			if (removed) {
				weakReferences.removeAll(phantoms);
			}
			return removed;
		} else if (strongReferences != null) {
			List<E> nulList = new ArrayList<E>();
			nulList.add(null);
			return strongReferences.removeAll(nulList);
		}
		
		return false;
	}
	
	synchronized void makeWeak() {
		if (strongReferences != null) {
			weakReferences = new ArrayList<WeakReference<E>>();
			for (E element: strongReferences) {
				weakReferences.add(new WeakReference<E>(element));
			}
			strongReferences = null;
		}
	}
	
	synchronized void makeStrong() {
		if (weakReferences != null) {
			strongReferences = new ArrayList<E>();
			for (WeakReference<E> ref: weakReferences) {
				E element = ref.get();
				// In order not to implicitly change the list, we copy phantoms
				// (element = null) here too; 
				strongReferences.add(element);
                // phantoms are removed only by calling the cleanPhantoms method.
			}
			weakReferences = null;
		}		
	}

}

package dk.dtu.imm.se.ecno.runtime.transactions;

import java.util.Comparator;

/**
 * A Comparator that brings all objects in some strict total order.
 * The implementation here uses the System.identityHashCoded() method.
 * 
 * Note that this comparator returns values different from 0 if the
 * objects are not identical -- even if the two objects are equal!
 * The value 0 is returned if and only if both objects are the same.
 * 
 * @author eki
 *
 */
public class CanonicalComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		if (o1 == o2) {
			return 0;
		}
		int n1 = System.identityHashCode(o1);
		int n2 = System.identityHashCode(o2);
		if (n1 < n2) {
			return -1;
		} else {
			return +1;
		}
	}

}

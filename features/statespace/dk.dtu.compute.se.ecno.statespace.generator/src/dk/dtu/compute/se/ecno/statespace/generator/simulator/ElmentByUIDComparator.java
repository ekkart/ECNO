package dk.dtu.compute.se.ecno.statespace.generator.simulator;

import java.util.Comparator;

import dk.dtu.compute.se.ecno.statespace.Element;

public class ElmentByUIDComparator implements Comparator<Object> {

	@Override
	public int compare(Object object1, Object object2) {
		if (object1 instanceof Element && object2 instanceof Element) {
			Element element1 = (Element) object1;
			Element element2 = (Element) object2;
			if (element1.getUid() < element2.getUid()) {
				return -1;
			} else if (element1.getUid() > element2.getUid()) {
				return 1;
			}
		}
		return 0;
	}

}

package dk.dtu.imm.se.ecno.model.ecno.helpers;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

/**
 * Class with helper methods that map the primitive data types of Ecore to the
 * respective "object" classes. ECNO uses these object classes instead of the
 * primitive types in order to properly deal with values that are not yet assigned.
 * With Java's type system and automatic type casting, this use of object classes
 * should smoothly integrate with the primitive types. In order to make this
 * mapping consistent, this mapping is defined once and for all in this helper
 * class, and it should be changed only here. 
 *  
 * @author ekki@dtu.dk
 * 
 * @generated NOT
 */
public class EcorePrimitiveDatatypeMapping {
	
	public static Class<?> getJavaClass(EClassifier classifier) {
		EPackage pack = classifier.getEPackage();
		if (EcorePackage.eINSTANCE.equals(pack) && classifier instanceof EDataType) {
			switch (classifier.getClassifierID()) {
			case EcorePackage.EINT:
				return Integer.class;
			case EcorePackage.EDOUBLE:
				return Double.class;
			case EcorePackage.EBOOLEAN:
				return Boolean.class;
			case EcorePackage.EFLOAT:
				return Float.class;
			case EcorePackage.EBYTE:
				return Byte.class;
			case EcorePackage.ELONG:
				return Long.class;
			case EcorePackage.ESHORT:
				return Short.class;
			case EcorePackage.ECHAR:
				return Character.class;
			}
		}
		return null;
	}
	
	public static String getQualifiedJavaClassName(EClassifier classifier) {
		Class<?> clazz = getJavaClass(classifier);
		if (clazz != null) {
			return clazz.getCanonicalName();
		}
		return null;
	}

}

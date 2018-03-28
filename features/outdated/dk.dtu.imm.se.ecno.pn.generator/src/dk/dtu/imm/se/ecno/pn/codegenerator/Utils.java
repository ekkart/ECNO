package dk.dtu.imm.se.ecno.pn.codegenerator;

public class Utils {
	
	/**
	 * Converts a String to a reasonable class name. If the String is empty, the
	 * String "Petrinet" is used.
	 * 
	 * @param name
	 * @return a class name
	 */
	public static String convert2ClassName(String name) {
		if (name != null && name.length() > 0) {
			String result = "";
			if (Character.isJavaIdentifierStart(name.charAt(0))) {
				result = ("" + name.charAt(0)).toUpperCase();
			} else {
				result = "_";
			}
			for (int i = 1; i < name.length(); i++) {
				if (Character.isJavaIdentifierPart(name.charAt(i))) {
					result = result + name.charAt(i);
				} else {
					result = result + "_";
				}				
			}
			return result;
		} else {
			return "Petrinet";
		}
	}
	
	public static String getClassName(String name) {
		String result = null;
		if (name.lastIndexOf('.') >= 0) {
			result = convert2ClassName(name.substring(name.lastIndexOf('.')+1));
		} else {
			result = convert2ClassName(name.substring(name.lastIndexOf('.')+1));
		}
		return result;
	}
	
	public static String getPath(String name) {
		String result = null;
		if (name.lastIndexOf('.') >= 0) {
			result = name.substring(0,name.lastIndexOf('.'));
		} else {
			result = "";
		}
		return result; 
	}

}

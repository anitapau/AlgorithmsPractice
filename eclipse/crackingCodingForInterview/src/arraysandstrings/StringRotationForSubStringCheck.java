package arraysandstrings;

public class StringRotationForSubStringCheck {
	
	public static void main (String[] theArgs) {
		System.out.println(isRotation("waterbottle", "erbottlewat"));
	}
	
	public static boolean isRotation(String theValue1, String theValue2) {
		if(theValue1.length() != theValue2.length()) {
			return false;
		}
		String newValue = theValue2+theValue2;
		return isSubString(newValue, theValue1);
	}
	
	public static boolean isSubString(String theLongValue, String theShorter) {
		boolean result = false;
		int count = 0;
		for(int i = 0; i< theLongValue.length(); i++) {
			if(theLongValue.charAt(i) == theShorter.charAt(count)) {
				count++;
				if(count == theShorter.length()) {
				return true;
				}
			}
			else {
				count = 0;
			}
		}
		return result;
	}

}

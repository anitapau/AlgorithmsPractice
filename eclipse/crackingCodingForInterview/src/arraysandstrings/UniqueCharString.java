package arraysandstrings;
/**
 * Class to solve problems related to Arrays and Strings.
 * @author anita paudel
 *
 */
public class UniqueCharString {
	/**
	 * The main method to run the program.
	 * @param args Arguments passed through command line
	 */
	public static void main(String[] args) {
		//System.out.println(hasUniqueCharacters("Aanitita"));
		System.out.println(isUniqueCharacters("A.nil,"));
	}
	
	/**
	 * Implements an algorithm to determine if a string has all unique characters. 
	 */
	public static boolean hasUniqueCharacters(final String theInput) {
		boolean result = true;
		for(int i = 0; i< theInput.length();i++) {
			for (int j = i+1; j<theInput.length(); j++) {
				if(theInput.charAt(i) == theInput.charAt(j)) {
					result = false;
					break;
				}
			}
		}
		return result;
	}
	public static boolean isUniqueCharacters(final String theInput) {
		boolean result = true;
		boolean[] charArray = new boolean[256];
		for(int i = 0; i< theInput.length(); i++) {
			int asciiValue = theInput.charAt(i);
			if(charArray[asciiValue]) {
				result = false;
				break;
			}
			charArray[asciiValue] = true;
		}
		return result;
	} 
	
}

package arraysandstrings;

public class ConvertStringToInt {

	
	public static void main (String[] theArgs) {
		convertToNumber("-5");
	}
	
	public static void convertToNumber(String theInput) {
		boolean isBoolean = false;
		int number = 0;
		if(theInput.length() >= 1) {
			int i = 0;
			if(theInput.charAt(i) == '-') {
				isBoolean = true;
				i++;
			}
			
			int value = 10;
			int length = theInput.length()-1;
			number = theInput.charAt(length) - 48;
			length--;
			while(length >= i) {
				number += (theInput.charAt(length) - 48) * value;
				value*=10;
				length--;
			}
		}
		if(isBoolean) {
			number = -number;
		}
		System.out.println(number);
	}
}

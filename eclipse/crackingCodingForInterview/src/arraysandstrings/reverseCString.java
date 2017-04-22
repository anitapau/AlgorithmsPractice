package arraysandstrings;

public class reverseCString {

	public static void main(String[] args) {
		
	}
	public static char[] stringReverse(char[] theInput) {
		int i = 0;
		int j = theInput.length-1;
		while(i<j) {
			char temp  = theInput[i];
			theInput[i] = theInput[j];
			theInput[j] = temp;
			i++;
			j--;
		}
		return theInput;
	} 
	
	

}

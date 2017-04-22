package arraysandstrings;

public class ReplaceStringWithChar {

	public static void main(String[] args) {
		System.out.println(replaceSpace("what is your name "));
	}
	
	public static String replaceSpace(String theInput) {
		int spaceCount = 0;
		for(int i = 0; i<theInput.length(); i++) {
			if(theInput.charAt(i)== ' ') {
				spaceCount++;
			}
		}
		
		int index = (theInput.length() + spaceCount*2) -1;
		char[] splitString = new char[index+1];
		for(int i = theInput.length()-1; i>=0; i--) {
			if(theInput.charAt(i) == ' ') {
				splitString[index] = '0';
				splitString[index-1] = '2';
				splitString[index-2] = '%';
				index = index -3;
			}
			else {
				splitString[index] = theInput.charAt(i);
				index = index-1;
			}
		}
		theInput = String.valueOf(splitString);
		return theInput;
	}

}

package arraysandstrings;

public class removeDuplicateCharacters {

	public static void main(String[] theArgs) {
		removeDuplicateCharacters input = new removeDuplicateCharacters();
		System.out.println(input.removeDuplicates("WhatIsMynamee"));
	}
	/**
	 * Design an algorithm and write code to remove the duplicate characters in a string

		without using any additional buffer. NOTE: One or two additional variables are fine.

		An extra copy of the array is not.

		FOLLOW UP

		Write the test cases for this method.
	 */
	public String removeDuplicates(String theInput) {
		if(theInput == null || theInput.length() < 2) {
			return theInput;
		}
		StringBuilder tempValue = new StringBuilder();
		for(int i = 0; i< theInput.length(); i++) {
			boolean isDuplicate = false;
			int j = i+1;
			while(j < theInput.length() && !isDuplicate) {
				if(theInput.charAt(i) == theInput.charAt(j)) {
					isDuplicate = true;
					break;

				}
				j++;
			}
			if(!isDuplicate) {
				tempValue.append(theInput.charAt(i));
			}
		}
		//System.out.println(tempValue);
		return tempValue.toString();
	}
	
}

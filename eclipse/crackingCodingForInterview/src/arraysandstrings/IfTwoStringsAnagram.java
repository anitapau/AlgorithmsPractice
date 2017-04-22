package arraysandstrings;

import java.util.HashMap;

public class IfTwoStringsAnagram {
	public static void main(String[] theArgs) {
		IfTwoStringsAnagram anagram = new IfTwoStringsAnagram();
		System.out.println(anagram.anagramOrNot("anita", "tiina"));
	}
	
	public boolean isAnagram(String theInput1, String theInput2) {
		if(theInput1.length() != theInput2.length()) {
			return false;
		}
		int[] letters = new int[256];
		int uniqueNumCount = 0;
		int numCompleted = 0;
		char[] input1Array = theInput1.toCharArray();
		for(char c: input1Array) {
			if(letters[c] == 0) {
				++uniqueNumCount;//Because we keep the uniqueCharacters
				++letters[c];
			}
			
		}
		for(int i = 0; i < theInput2.length(); i++) {
		 int value = (int) theInput2.charAt(i);
			if(letters[value] == 0){
				return false;
			}
			--letters[value];

			 if (letters[value] == 0) {

				 ++numCompleted;

			 if (numCompleted == uniqueNumCount) {

				 return true;
			 }
		 }
		}
		 return false;
	}
	
	
	
	public boolean anagramOrNot(String theInput1, String theInput2) {
		boolean result = false;
		int count = 0;
		if(theInput1.length()!= theInput2.length() || (theInput1 == null || theInput2 == null)) {
			return result;
		}
		HashMap<Character, Integer> table = new HashMap<>();
		for(int i = 0; i< theInput1.length(); i++) {
			if(table.containsKey(theInput1.charAt(i))) {
				table.put(theInput1.charAt(i), table.get(theInput1.charAt(i))+1);
			}
			else{
				table.put(theInput1.charAt(i), 1);
				count++;
			}
			
		}
		
		for(int j = 0; j < theInput2.length(); j++) {
			if(!table.containsKey(theInput2.charAt(j))) {
				return result;
			}
			else {
				if(table.containsKey(theInput2.charAt(j))) {
					table.put(theInput2.charAt(j), table.get(theInput2.charAt(j))-1);
					if(table.get(theInput2.charAt(j)) == 0) {
						count--;
					}
				}
			}
		}
		if(count == 0) {
			result = true;
		}
		
		
		return result;
		
	}
}

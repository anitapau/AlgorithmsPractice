package arraysandstrings;
import java.util.HashMap;
import java.util.Map;

public class PalindromePermutation {
	
	public static void main(String[] theArgs) {
		System.out.println(isPalindromePermutation(frequencyTable("taco coat")));
	}
	
	public static boolean isPalindromePermutation(Map<Character, Integer> theTable) {
		boolean oddFound = false;
		for(Character c: theTable.keySet()) {
			if(theTable.get(c) % 2 == 1) {
				if(oddFound) {
					return false;
				}
				oddFound = true;
			}
		}
		return true;
	}
	
	public static Map<Character, Integer> frequencyTable(String theInput) {
		Map<Character, Integer> table = new HashMap<Character, Integer>();
		for(int i = 0; i< theInput.length(); i++) {
			if(table.containsKey(theInput.charAt(i))) {
				table.put(theInput.charAt(i), (table.get(theInput.charAt(i))+1));
			}
			else {
				table.put(theInput.charAt(i), 1);
			}
		}
		return table;
	}

}

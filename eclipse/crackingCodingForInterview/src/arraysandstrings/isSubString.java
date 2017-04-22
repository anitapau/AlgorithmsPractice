package arraysandstrings;

public class isSubString {

	public static void main(String[] args) {
		
		System.out.println(isSubS("waterbottle", "terbottlewa"));
	}
	
	public static boolean isSubS(String input1, String input2) {
			if(input1.length() >0 && input2.length() > 0 && (input1.length() == input2.length())) {
				String input = input1 + input1;
				if(input.indexOf(input2) >=0) {
					return true;
				}
				
			}
			return false;
	}
}

package arraysandstrings;

public class OneAway {

	public static void main(String[] args) {
		System.out.println(ifOneEditAway("ale", "pale"));

	}
	
	public static boolean ifOneEditAway(String theInput1, String theInput2) {
		int len1 = theInput1.length();
		int len2 = theInput2.length();
		boolean result = false;
		if(len1 - len2 == 0) {
			return replace(theInput1, theInput2);
		}
		else if(len1 - len2 == 1 || len1 - len2 == -1) {
			return insertOrRemove(theInput1, theInput2);
		}
		return result;
	}

	private static boolean insertOrRemove(String theInput1, String theInput2) {
		
				boolean differentChar = false;
				int len1 = theInput1.length();
				int len2 = theInput2.length();
				int index2=0;
				int index1 = 0;
				
				while(index1<theInput1.length()&&index2<theInput2.length())
					if( theInput1.charAt(index1) != theInput2.charAt(index2)) {
						if(differentChar) {
							return false;
						}
						differentChar = true;
						if(len1 > len2) {
							index1++;
						}
						else {
							index2++;
						}
					}
					else {
						index1++;
						index2++;
					}
				return true;
	}

	private static boolean replace(String theInput1, String theInput2) {
		// TODO Auto-generated method stub
		boolean differentChar = false;
		for(int i = 0; i< theInput1.length(); i++) {
			if(theInput1.charAt(i) != theInput2.charAt(i)) {
				if(differentChar) {
					return false;
				}
				differentChar = true;
			}
		}
		return true;
		
	}

}

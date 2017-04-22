package arraysandstrings;

public class StringCompression {
	public static void main(String[] theArgs) {
		System.out.println(stringCompress("aaaavbbbzzv"));
	}
	
	public static String stringCompress(String theInput) {
		//we can also give the builder initial fixed capacity.
		StringBuilder builder = new StringBuilder();
		int compressedLength = 1;
		for(int i = 0; i < theInput.length(); i++) {
			if(i+1 >= theInput.length() || theInput.charAt(i) != theInput.charAt(i+1)){ 
				builder.append(theInput.charAt(i));
				builder.append(compressedLength);
				compressedLength = 1;
			}
			else {
				compressedLength++;
			}
		}
		
		return builder.toString().length() < theInput.length() ? builder.toString() : theInput;
	}
	
}

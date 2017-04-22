package practicefromhackerrank;
import java.util.*;

public class HowManySubStrings {
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int q = in.nextInt();
	        in.nextLine();
	        String s = in.nextLine();
	        for(int a0 = 0; a0 < q; a0++){
	            int left = in.nextInt();
	            int right = in.nextInt();
	            System.out.println(countSubStrings(s, left, right));
	            // your code goes here
	    }
	        in.close();
	}
	    
	    public static int countSubStrings(String theInput, int theLeft, int theRight) {
	    	Set<String> set = new HashSet<>();
	    	for(int i = theLeft; i<=theRight; i++) {
	    		String value = "";
	    		for(int j = i; j<=theRight; j++) {
	    			value+=theInput.charAt(j);
	    			set.add(value);
	    		}
	    	}
 	    	return set.size();
	    }
}

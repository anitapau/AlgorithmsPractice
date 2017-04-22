package practicefromhackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Twin {
	


	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter: ");
	        int n = scan.nextInt();
	        int m = scan.nextInt();
	        scan.close();
	       System.out.println(countTwinsMain(n, m));
	   
	    }
	    public static int countTwinsMain(int theNumber, int theSecondNum) {
	    	int previosPrime = 2;
	    	int count = 0;
	    	for(int k = theNumber; k<= theSecondNum; k++) {
	    		boolean isPrime = true;
	    		int j = 2;
	    		while(isPrime && (j < k)) {
	    			if(k % j == 0) {
	    				isPrime = false;
	    			}
	    			j++;
	    		}
	    		if(isPrime) {
	    			if(k - previosPrime == 2){
	    				count++;
	    			}
	    			previosPrime = k;
	    		}
	    	}
	    	
	    	return count;
	    }
}

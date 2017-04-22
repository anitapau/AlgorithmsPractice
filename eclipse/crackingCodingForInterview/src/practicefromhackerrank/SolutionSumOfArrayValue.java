package practicefromhackerrank;

import java.util.Scanner;

public class SolutionSumOfArrayValue {
	  public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter the size: ");
	        int size = scan.nextInt();
	        //Prompt to next line
	        scan.nextLine();
	        System.out.println("Enter the data");
	        String Line = scan.nextLine();
	        String[] data = Line.split(" ");
	      System.out.println(sum(data, size));
	        scan.close();
	        
	        		
	    }
	    public static Long sum(String[] theArray, int theSize) {
	        long sumOfValue = 0;
	        for(int i = 0; i<theSize; i++) {
	            sumOfValue+= Long.valueOf(theArray[i]);
	        }
	        return sumOfValue;
	        
	    }
}

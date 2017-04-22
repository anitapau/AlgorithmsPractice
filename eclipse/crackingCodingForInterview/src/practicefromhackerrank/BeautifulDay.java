package practicefromhackerrank;

import java.util.Scanner;

public class BeautifulDay {
	public static void main(String[] theArgs) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int end = scan.nextInt();
        int number = scan.nextInt();
        int count = 0;
        for(int i = start; i<= end; i++) {
            int reverseValue = reverse(i);
            if(findBeautifulDay(i, reverseValue, number)) {
                count++;
            }
        }
        System.out.println(count);
        scan.close();
	}
	
	public static int reverse(int theValue) {
		int newReverse = 0;
		if(theValue < 10) {
			return theValue;
		}
		while(theValue > 0) {
			newReverse *= 10;
			newReverse += theValue %10;
			theValue = theValue /10;
		}
		return newReverse;
	}
	
	public static boolean findBeautifulDay(int theValue1, int theValue2, int theNumber) {
		boolean ifBeautyDay = false;    
		double valueAfterDiv = (((double)(theValue1 - theValue2)) / theNumber);
		System.out.println("double " + valueAfterDiv);
		if((valueAfterDiv * 10 ) % 10 == 0) {
			ifBeautyDay = true;
		}
		    return ifBeautyDay;
	}
}

package algorithmpractice;

import java.util.ArrayList;
import java.util.Arrays;

public class JobSelectionDynamic {
	public static void main(String[] theArgs) {
		int[] payments = {5,9,12, 7, 5,13,7, 5, 4, 9, 8, 7,5,8,4,3,5,10,4,6,8,12, 5, 6,3,7,16, 2, 2,16};
		maxPayout(payments);
	} 
	
	public static void maxPayout(int[] thePayments) {
		int[] theNewPayments = new int[thePayments.length];
		int[] recover = new int[thePayments.length];
		//int[] daysWork = new int[thePayments.length];
		
		theNewPayments[0] = thePayments[0];
		recover[0] = 1;
		theNewPayments[1] = thePayments[0] + thePayments[1];
		recover[1] = 1;
		theNewPayments[2] = 21;
		if(theNewPayments[2] == thePayments[1] + thePayments[2]) {
			recover[2] = 1;
		}
		else {
			recover[2] = 0;
		}
		
		for(int k = 3; k<thePayments.length; k++) {
			int a = theNewPayments[k -1];
			int b = thePayments[k] + theNewPayments[k-2];
			int c = thePayments[k] + thePayments[k-1] + theNewPayments[k-3];
			theNewPayments[k] = Math.max(a, Math.max(b, c));
			if(a>=b && a>=c){
				
				recover[k] = 0;
			}else{
				recover[k] = 1;
			}
		}
		System.out.println(Arrays.toString(theNewPayments));
		System.out.println(Arrays.toString(recover));
		int l = recover.length-1;
		ArrayList<Integer> daysWork = new ArrayList<Integer>(); 
		int A = recover.length - 1;
		while(A>0) {
			if(recover[A] == 1){
				if(recover[A-1] == 1) {
					daysWork.add(A+1); // daysWork[k] = A;
					System.out.print(A+1 +  ", ");
					daysWork.add(A); // daysWork[k++] = A-1;
					System.out.print(A +  ", ");
					A-=3;
				}
				else {
					A-=2;
				}
			}
			else {
				A-=1;
			}
		}
	}
}

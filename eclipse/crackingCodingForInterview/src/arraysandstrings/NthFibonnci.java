package arraysandstrings;

public class NthFibonnci {
	public static void main(String[] theArgs) {
		int[] array = new int[6];
		System.out.println(fiboDynamicPro(5, array));
	}
	
	public static int fibo(int theValue) {
		if(theValue<= 0) {
			return 0;
		}
		else if(theValue == 1) {
			return 1;
		}
		else{
			return fibo(theValue - 1) + fibo(theValue - 2);
		}
	}
	
	public static int fiboDynamicPro(int theValue, int[] theArray) {
		if(theValue <= 0) {
			return 0;
		}
		else if(theValue == 1) {
			return 1;
		}
		else if(theArray[theValue] > 0) {
			return theArray[theValue];
		}
		else {
			theArray[theValue] = fiboDynamicPro(theValue -1, theArray) + fiboDynamicPro(theValue - 2, theArray);
			return theArray[theValue];
		}
	}
}



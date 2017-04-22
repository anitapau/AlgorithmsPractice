package arraysandstrings;

public class Factorial {
	public static void main(String[] theArgs) {
		System.out.println(factorial(5));
	}
	
	
	public static int factorial(int theValue) {
		if(theValue<=0 || theValue == 1) {
			return 1;
		}
		else {
			return theValue * factorial(theValue-1);
		}
	}

}

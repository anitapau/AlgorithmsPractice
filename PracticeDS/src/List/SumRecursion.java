package List;

public class SumRecursion {
	public static void main (String[] theArgs){
		int[] array = {1, 2, 3};
		System.out.println(sum(array, 0, 2));
	}
	
	public static int sum(int[] theArray,int a, int n) {
		int mid = a+n / 2;
		if(a == n) {
			return theArray[a];
		}
		else {
				
			return  sum (theArray, a, mid) + sum (theArray, mid+1, n) ;
		}
	}
}

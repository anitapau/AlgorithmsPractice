package searching;

public class AllSearch {
	public static void main(String[] theArgs) {
		//int[] array = {5, 6, 2, 3, 2, 9, 5, 4};
		int[] array1 = {5, 6,7, 8,9, 10, 11, 15, 20, 25, 21};
		//System.out.println(linearSearch(array1, 9));
		System.out.println(binarySearch(array1, 21));
	}
	public static int linearSearch(final int[] theArray, final int theValue) {
		int index = -1;
		for(int i = 0; i < theArray.length; i++) {
			if(theArray[i] == theValue) {
				index = i;
			}
		}
		return index;
	}
	public static int binarySearch(final int[] theArray, final int theValue) {
		if(theArray.length == 0) {
			return -1;
		}
		int high = theArray.length;
		int low = 0;
		while(low < high) {
		  int mid = (high + low) / 2;
		  if(theArray[mid] == theValue) {
			  return mid;
		  }
		  else if(theArray[mid] < theValue) {
			  low = mid + 1;
		  }
		  else if(theArray[mid] > theValue) {
			  high = mid - 1;
		  }
		}
		return -1;
	}
}

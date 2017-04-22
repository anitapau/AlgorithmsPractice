package algorithmpractice;

import java.util.Arrays;

public class SeparateOddAndEven {
	public static void main (String[] theArgs) {
		int[] array = new int[15];
		for(int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		SeparateOddAndEven move = new SeparateOddAndEven();
	
		move.moveEvenOdd(array);
		System.out.print(Arrays.toString(array));
		
	}
	
	public void moveEvenOdd(int[] theArray) {
		int size = theArray.length - 1;
		int i = 0;
		while (i < size)
		 {
			if(theArray[i] % 2 != 0 && theArray[size] % 2 != 0) {
				size--;
			}
			else if (theArray[i] % 2 == 0 && theArray[size] % 2 != 0) {
				size--;
				i++;
			}
			else if (theArray[i] % 2 != 0 && theArray[size] % 2 == 0) { //swap
				int tempValue = theArray[size];
				theArray[size] = theArray[i];
				theArray[i] = tempValue;
				size--;
				i++;
			}
			else {
				i++;
			}
		}
		
	}
}

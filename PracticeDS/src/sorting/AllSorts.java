package sorting;

import java.util.Arrays;

public class AllSorts {
	public static void main(String[] theArgs) {
		int[] array = {4, 6, 3, 3, 2, 1, 0, 9, 4};
		//selectionSort(array);
		//insertionSort(array);
		bubbleSort(array);
		System.out.println(Arrays.toString(array));
	}
	public static void selectionSort(final int[] theArray) {
		for(int i = 0; i < theArray.length; i++) {
			int small = i;
			for(int j = i + 1; j < theArray.length; j++) {
				if(theArray[j] < theArray[small]) {
					small = j;
				}
			}
			int temp = theArray[small];
			theArray[small] = theArray[i];
			theArray[i] = temp;
		}
	}
	public static void insertionSort(final int[] theArray) {
		for(int i = 1; i < theArray.length; i++) {
			int j = i;
			int temp = theArray[j];
			while (j > 0 && temp < theArray[j - 1]) {
				theArray[j] = theArray[j - 1];
				j--;
			}
			theArray[j] = temp;
		}
	}
	public static void bubbleSort(final int[] theArray) {
		int k = 0;
		for(int i = 0; i < theArray.length; i++) {
			for(int j = 0; j < theArray.length -1 - k; j++) {
				if(theArray[j] > theArray[j + 1]) {
					int temp = theArray[j];
					theArray[j] = theArray[j + 1];
					theArray[j + 1] = temp;
				}
			}
			k++;
		}
	}
	public static void mergeSort(final int[] theArray) {
		
	}
	
}

package arraysandstrings;
public class Rotate90 {
	public static void main(String[] theArgs) {
		int[][] array = {{0, 1, 4}, {2, 1, 5}, {5, 0, 9}};
		for (int i = 0; i< array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("answer");
		rotate90(array);
	}
	
	
	// not in place - using temporary array
	public static void rotate90 (int[][] theArray) {
		int[][] tempArray= new int[theArray.length][theArray.length];
		for(int i = 0; i < theArray.length; i++) {
			for(int column = 0; column < theArray.length ; column++) {
				tempArray[column][theArray.length-i-1] = theArray[i][column];
			}
		}
		for (int i = 0; i< tempArray.length; i++) {
			for(int j = 0; j < tempArray.length; j++) {
				System.out.print(tempArray[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	//In place
	public static void rotate_90_Pic (int[][] theArray) {
		
		
	}
}

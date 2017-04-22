package arraysandstrings;
public class SetRowAndColumnZero {

	public static void main(String[] args) {
		int[][] array = {{0, 1, 4}, {2, 1, 5}, {5, 0, 9}};
		for (int i = 0; i< array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		setZero(array);
		for (int i = 0; i< array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void setZero(int[][] matrix) {
		int[] row = new int [matrix.length];
		int[] column = new int[matrix[0].length];
		for(int i = 0; i < matrix.length; i++) {
			for (int j = 0; j< matrix[0].length; j++) {
				if(matrix[i][j] == 0) {
					row[i] = 1;
					column[j] = 1;
				}
			}
		}
		for(int i = 0; i< matrix.length; i++) {
			for(int j = 0; j< matrix[0].length; j++) {
				if(row[i] == 1 || column[j] ==1) {
					matrix[i][j] = 0;
				}
			}
		}
		
	}

}

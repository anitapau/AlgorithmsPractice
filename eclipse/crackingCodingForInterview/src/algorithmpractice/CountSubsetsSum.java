package algorithmpractice;

public class CountSubsetsSum {
		public static void main(String[] theArgs) {
			int[] array = {2, 1,3,4};
			System.out.println(getmNumberOfSubsets(array, array.length, 5));
		}
	public static int getmNumberOfSubsets(int[] a, int n, int sum) {
	
	
		int[][] m = new int [n][sum +1];
		for(int i = 0; i < n ; i++) {
			m[i][0] = 1;
			for(i = 0; i<sum; i++) {
				for(int j = 0; j<n; j++) {
					m[i][j] = m[i-1][j-a[i]];
					
				}
			}
			
		}
	
	
		return m[n-1][sum];
	
	
	}
	
}

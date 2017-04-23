package arraysandstrings;

public class FindExcludeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindExcludeSum object = new FindExcludeSum();
		int[] array = {1, 2, 5, 3, 4};
		System.out.println(object.findExceludeSum(array));
	}
	
	public int findExceludeSum(int[] theArray) {
		int excl=0;
		int incl = theArray[0];
		int newExcl = 0;
		for(int i = 1; i < theArray.length; i++) {
			if(incl > excl) {
				newExcl = incl;
			}
			else {
				newExcl = excl;
			}
			
			incl = excl + theArray[i];
			excl = newExcl;
		}
		return Math.max(excl, incl);
	}

}

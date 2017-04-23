package algorithmpractice;

public class SubstringsNumSum {
	
	public static void main(String[] theArgs) {
		String value = "this12this2this3this";
		String delm = "this";
		SubstringsNumSum sum = new SubstringsNumSum();
		System.out.println("Total Sum: " + sum.findNumSumBetweenDigit(value, delm));
			
	}
	//find num sum by single digit
	public int findNumSum(String theValue, String theDelm) {
		int sum = 0;
		int length = theValue.length();
		int delLen = theDelm.length();
		for(int i = 0; i < length; i++) {
			if(theValue.charAt(i) != theDelm.charAt(0)) {
				sum+=parseInt(theValue.charAt(i));
			}
			else {
				i+=delLen-1;
			}
		}
		
		return sum;		
	}
	
	//parse the character to int
	public int parseInt(char theValue) {
		int value = theValue - '0';
		return value;
	}
	
	//find num sum by digits between delimiter
	public int  findNumSumBetweenDigit(String theValue, String theDelm) {
		int sum = 0;
		int length = theValue.length();
		int delLen = theDelm.length();
		int j= 0;
		for(int i = 0; i < length; i++) {
			if(theValue.charAt(length-1-i) != theDelm.charAt(delLen -1)) {
				sum += parseInt(theValue.charAt(length-1-i))* Math.pow(10, j++);
				
			}
			else {
				j = 0;
				i += delLen -1;
			}
			
		}
		return sum;
	}
	

}

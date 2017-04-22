package algorithmpractice;

public class GCDProblem {
	
	public static void main (String[] args) {
		System.out.println(gcd(60, 24));
	}
	public static int gcd(int m, int n) {
		while(n > 0) {
			int remainder = m %n;
			m= n;
			n= remainder;
		}
		return m;
	}

}

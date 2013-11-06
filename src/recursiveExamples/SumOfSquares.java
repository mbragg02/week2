package recursiveExamples;

public class SumOfSquares {


	public static void main(String[] args) {
		sumSquares(-1);
		sumSquares(0);
		System.out.println(sumSquares(5));
	}
	
	public static int sumSquares(int n) {
		
		if ( n < 1) {
			return 0;
		}
		return n * n + sumSquares(n -1);
		
		
	}

}

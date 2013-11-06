package recursiveExamples;

public class Hanoi {


	public static void main(String[] args) {
		hanoi(-1);
		hanoi(0);
		hanoi(1);
		hanoi(2);
		hanoi(3);
	}
	
	
	
	public static void hanoi(int nDisks) {
		if (nDisks < 0 || nDisks == 0) {
			System.out.println("not valid input");
			return;
		}
		hanoi(nDisks, 1, 3);
		return;
		
	}
	
	public static void hanoi(int nDisks, int from, int to) {
		if (nDisks == 1) {
			System.out.println(from + " --> " + to);
			return;
		}
		
		int temp = 6 - from - to;
		int moves = 0;
		
		hanoi(nDisks -1, from, temp);
		System.out.println(from + " --> " + to);
		hanoi(nDisks -1, temp, to);
		
		return;
		
		
		
		
	}

}

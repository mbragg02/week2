
public class ABitMoreDoubles {

	/**
	 * 3) A bit more practice with doubles:
	 * Write a program that asks the user for the total amount borrowed for a mortgage, the number of years 
	 * to pay it back, and the interest rate (in this exercise, we assume it is a fixed rate). 
	 * The program can then calculate how much must be paid at the end.
	 * t = c ( 1 + (r / 100))
	 * Where: t = total, c = cost, r = the rate as a percentage.
	 * The program should print:
	 *  - The total amount to be paid.
	 *  - The money to be paid every year.
	 *  - The number of years before the interest is paid and only the initial capital remains.
	 *  Write a method to calculate each piece of data.
	 * @param args
	 */
	public static void main(String[] args) {
		// Test with static data
		double c = 100000.00;
		int y = 12;
		double r = 15.8;
		
		double total = total(c, r);
		
		System.out.printf("Total repayable = " + "%.2f\n", total);
		System.out.printf("Yearly sum = " + "%.2f\n", yearly(total, y));
		System.out.println("Number of years until the interest has been paided off =  " + numberOfYears(c, total, yearly(total, y) ));
		
	}
	
	public static double total (double amountBorrowed, double interestRate) {		
		return (amountBorrowed * (1 + (interestRate / 100.00)));
		
	}
	
	public static double yearly (double total, int years) {
		return (total / years);
	}
	
	public static int numberOfYears(double amountBorrowed, double total, double yearly) {
		int counter = 0;
		boolean flag = true;
		while(flag) {
			if (total >= amountBorrowed) {
				total = total - yearly;
				counter++;
			} else {
				flag = false;
			}			
		}
		return counter;
	}

}

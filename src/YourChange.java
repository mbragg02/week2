import java.util.Scanner;


public class YourChange {

	/**
	 * Write a program that reads the total cost of a purchase and an amount of money that is paid to buy it. 
	 * Your program should output the correct change specifying the amount of notes (50, 20, 10, 5) 
	 * and coins (2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01) needed.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Price: ");
		double price = in.nextDouble();
		
		System.out.print("Payment: ");
		double payment = in.nextDouble();
		
		// testing values
		//final double price = 2.84;
		//final double payment = 10.00;
		
		double price_pennies = price * 100;
		int payment_pennies = (int) (payment * 100);

		
		System.out.println("Total price: £" + price);
		System.out.println("Total payment recieved: £" + payment);
		
		int total_change = (int) (payment_pennies - price_pennies);
		double total_change_in_pounds = total_change / 100.00;
		
		System.out.println("Totel change due: £" + total_change_in_pounds);
		//System.out.println("Totel change due: " + total_change);

		//NOTES
		
		//compute pounds
		int pounds = (int) (total_change / 100);
		
		System.out.println("Total Pounds due: " + pounds);
		int fifties = 0;
		int twenties = 0;
		int tens = 0;
		int fives = 0;
		
		while (pounds >= 5 ) {			
		 if (pounds >= 50) {
			fifties = pounds / 50;
			System.out.println("fifties due: " + fifties);
			pounds = pounds % 50;
		} else if (pounds >= 20 && pounds < 50) {
			twenties = pounds / 20;
			System.out.println("twenties due: " + twenties);
			pounds = pounds % 20;
		} else if (pounds >= 10 && pounds < 20) {
			tens = pounds / 10;
			System.out.println("tens due: " + tens);
			pounds = pounds % 10;
		} else {
			fives = pounds / 5;
			System.out.println("fives due: " + fives);
			pounds = pounds % 5;
		}
		}
		
		//COINS		
		int twoPoundCoin = 0;
		int onePoundCoin = 0;
		
		if (pounds == 1) {
			onePoundCoin = pounds;
			System.out.println("One pound coins due: " + onePoundCoin);

		}
		
		if (pounds > 1) {
			twoPoundCoin = pounds / 2;
			System.out.println("Two pound coins due: " + twoPoundCoin);		
			onePoundCoin = pounds % 2;
			System.out.println("One pound coins due: " + onePoundCoin);

		} 

		//compute pennies
		int pennies = total_change % 100;
		System.out.println("Total Pence due: " + pennies);
		
		int onePence = 0;
		int twoPence = 0;
		int fivePence = 0;
		int tenPence = 0;
		int twentyPence = 0;
		int fiftyPence = 0;
		
		while (pennies > 0) {
			
		if (pennies >= 1 && pennies < 2) {
			onePence = pennies;
			System.out.println("One pence coins due: " + onePence);			
			break;
			
		} else if (pennies >= 2 && pennies < 5) {
			twoPence = pennies / 2;
			System.out.println("Two pence coins due: " + twoPence);	
			pennies = pennies % 2;
			
		}else if (pennies >= 5 && pennies < 10) {
			fivePence = pennies / 5;
			System.out.println("Five pence coins due: " + fivePence);	
			pennies = pennies % 5;
			
		}else if (pennies >= 10 && pennies < 20) {
			tenPence = pennies / 10;
			System.out.println("Ten pence coins due: " + tenPence);	
			pennies = pennies % 10;
			
		}else if (pennies >= 20 && pennies < 50) {
			twentyPence = pennies / 20;
			System.out.println("Twenty pence coins due: " + twentyPence);	
			pennies = pennies % 20;
			
		}else {
			fiftyPence = pennies / 50;
			System.out.println("Fifty pence coins due: " + fiftyPence);	
			pennies = pennies % 50;
			
		}
		}

	}

}

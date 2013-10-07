
//import java.util.Scanner;


public class Text2Number {

	/**
	 * Write a program that reads a number with commas and decimal dots (such as Ò23,419.34Ó) 
	 * and then prints a number that is half of it. 
	 * Do not use Double.parseDouble().
	 * @param args
	 */
	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.print("Please enter some text: ");
//		String input = in.nextLine();
		
		String input = "23,419.34"; //test input
		
		input = input.replace(",", "");
		
		int counter = 0;
		for (int i = 0; i < input.length(); i ++ ) {
			if (input.charAt(i) == '.') { break; }
			counter ++;
		}
		String wholeNumber = input.substring(0, counter);
		String decimal = input.substring(counter + 1);
		
//		System.out.println(wholeNumber);
//		System.out.println(decimal);
		
		int wholeNumberInteger = Integer.parseInt(wholeNumber);
		int decimalInteger = Integer.parseInt(decimal);
		
		double wholeNumberHalf = wholeNumberInteger / 2.00;
		double decimalHalf = (decimalInteger / 2.00) / 100;
		
		double finalTotal = wholeNumberHalf + decimalHalf;
		
		System.out.println(finalTotal);
		
		
		

	}

}

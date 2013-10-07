import java.util.Scanner;


public class Command_Line_Calculator {

	/**
	 * Write a program that reads a text representing a mathematical operation 
	 * (one of the four basic ones) with two operands, and then execute it. 
	 * For example, if the user enters Ò3/5Ó the program outputs Ò0.6Ó; if the user enters Ò23 * 4Ó the program outputs Ò92Ó.
	 * @param args
	 */
	public static void main(String[] args) {
		int counter = 0;
		boolean addition = false;
		boolean division = false;
		boolean multiplication = false;
		boolean subtraction = false;
		String text = "";
		boolean valid = false;
		
		
		while (!valid) {
			System.out.print("Please enter a mathematical operation. eg '3/5' : ");
			Scanner in = new Scanner(System.in);
			
			text = in.nextLine();
			
			for (int i = 0; i < text.length(); i ++ ) {
				char x = text.charAt(i);
				if (x == '+') {
					addition = true;
					valid = true;
					break;
				}
				if (x == '-') {
					subtraction = true;
					valid = true;
					break;
				}
				if (x == '/') {
					division = true;
					valid = true;
					break;
				}	
				if (x == '*') {
					multiplication = true;
					valid = true;
					break;
				}
				counter ++;
			}
			
			if (valid) { break; } 
			else {
				System.out.println("Not a valid operation.");
			}
		}
		
		String x = text.substring(0, counter).trim();
		String y = text.substring(counter + 1).trim();
		
		int a = Integer.parseInt(x);
		int b = Integer.parseInt(y);
		
		if(addition) {
			System.out.println(a + b);
		}
		if(subtraction) {
			System.out.println(a - b);
		}
		if(multiplication) {
			System.out.println(a * b);
		}
		if (division) {
			System.out.println((double) a / b);
		} 
		
	}

}

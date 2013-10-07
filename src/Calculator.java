import java.util.Scanner;

public class Calculator {

	/**
	 * Write a program that reads two numbers from the user 
	 * and then offers a menu with the four basic operations: addition, subtraction, multiplication, and division. 
	 * Once the user has selected an operation from the menu, the calculator performs the operation.
	 * @param args
	 * @author Michael Bragg
	 */
	
//	 public enum Operation {
//
//		 ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION;
//	    }
	 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		while(!in.hasNextDouble()) {
			System.out.print("Invlaid input. Please enter a number: ");
			in.next();
		}
		double inputA = in.nextDouble();
			
		System.out.print("Please enter a second number: ");
		while(!in.hasNextDouble()) {
			System.out.print("Invlaid input. Please enter a number: ");
			in.next();
		}
		double inputB = in.nextDouble();
			
		boolean invalidInput = true;
		
		while(invalidInput) {
			invalidInput = false;
			
			System.out.print("Would you like to perform addition (1), subtraction (2), multiplication (3) or division (4): ");
			int operator = in.nextInt();
			
			// Operation userChoice = Operation.ADDITION;
			 
			switch (operator) {
		    case 1:
		            System.out.println("ADDITION");
		            System.out.println(inputA + " + " + inputB + " = " + (inputA + inputB));
		            break;
		    case 2:
		            System.out.println("SUBTRACTION");
		            System.out.println(inputA + " - " + inputB + " = " + (inputA - inputB));
		            break;
		    case 3:
		            System.out.println("MULTIPLICATION");
		            System.out.println(inputA + " x " + inputB + " = " + (inputA * inputB));
		            break;
		    case 4:
		            System.out.println("DIVISION");
		            System.out.println(inputA + " / " + inputB + " = " + (inputA / inputB));
		            break;
		    default: 
		    	invalidInput = true;
		    	System.out.println("Invalid input");
			}
			
		}
			

	}
	
	

}



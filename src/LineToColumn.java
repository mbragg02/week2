import java.util.Scanner;


public class LineToColumn {

	/**
	 * Write a program that reads some text from the user and then writes the same text on screen, 
	 * but each letter on a different line.
	 * Now modify your program to write each word (as defined by spaces) rather than letter on a different line.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter some text: ");
		String text = in.nextLine();
		
		// Display each letter on a new line
		for (int i = 0; i < text.length(); i ++ ) {
			char x = text.charAt(i);
			System.out.println(x);
		}
		
		// Display each word on a new line (as defined by spaces)
		for (int i = 0; i < text.length(); i ++) {
			char x = text.charAt(i);
			System.out.print(x);
			if (x == ' ') {
				System.out.println("");
			}
			
		}
		
		in.close();
	}

}

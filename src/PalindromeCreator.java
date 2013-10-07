import java.util.Scanner;


public class PalindromeCreator {

	/**
	 * Write a program that reads a text and then writes on the screen a palindrome by writing 
	 * the same text followed by the same text in reversed order. 
	 * For example, if the user enters the text �It was a dark and stormy night� the program 
	 * must output �It was a dark and stormy nightthgin ymrots dna krad a saw tI�.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter some text: ");
		String text = in.nextLine();
		
		//String text = "It was a dark and stormy night"; //test input
		
		String textReversed = "";
		int z = text.length() - 1;
		
		for (int i = z; i >= 0; i--) {
			textReversed += text.charAt(i);
		}
		System.out.println(text + textReversed );
	
	}

}

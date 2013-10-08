import java.util.Scanner;


public class Palindrome {

	/**
	 * A palindrome is a word, phrase, number, or other sequence of units that may be read 
	 * the same way in either direction. 
	 * Examples of strict palindromes include “ABBA”, “madam”, “radar”, “kayak”, and “step on no pets”. 
	 * Write a program that reads a text and detects whether the text is a strict palindrome.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter some text: ");
		String text = in.nextLine();
		//String text = "radar"; //test input
		int z = text.length() - 1;
		boolean palindrome = false;
		
		for (int i = 0; i < text.length(); i ++) {
			char x = text.charAt(i);
			char y = text.charAt(z);
			if (x == y) {
				palindrome = true;
			} else {
				palindrome = false;
				break;
			}
			
			z --;
			
		}
		if (palindrome) {
			System.out.println("Yes is is a palindrome.");
		} else {
			System.out.println("No it is not a palindrome.");
		}
		in.close();
	}

}

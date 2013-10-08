import java.util.Scanner;


public class Palindrome_Redux {
	
	/**
	 * A strict palindrome is difficult to see in every day language. A relaxed palindrome, a text that is a
	 * palindrome if you ignore punctuation marks such as commas or spaces, is easier to see. 
	 * Examples include “A man, a plan, a canal - Panama!”, “Was it a car or a cat I saw?”, and “Rise to vote, sir”.
	 * Write a program that reads a text from the user and then says whether the text is a relaxed palindrome. Note
     * that all strict palindromes are relaxed palindromes by definition.
     * Hint: Use Character.isLetter() and Character.toLowerCase() methods.
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter some text: ");
		String text = in.nextLine();
			
		String text_edit = "";
		
		// First loop to strip out non-characters, format lower-case & create new string.
		for (int i = 0; i < text.length(); i ++ ) {
			char x = text.charAt(i);
			if (Character.isLetter(x)) {
				x = Character.toLowerCase(x);
				text_edit += Character.toString(x);
			}
				
		}
		
		int z = text_edit.length() - 1;
		boolean palindrome = false;
		
		// Second loop to check for a palindrome.
		for (int i = 0; i < text_edit.length(); i ++) {
			
			char x = text_edit.charAt(i);
			char y = text_edit.charAt(z);
		
			
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

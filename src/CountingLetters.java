import java.util.Scanner;


public class CountingLetters {

	/**
	 * Write a program that reads some text from the user and then says how many letters ’e’ are there in that text. 
	 * Then modify the program so that it reads the text from the user and then asks for a letter. 
	 * The program should then say how many times you can find the letter in the text.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("PLease enter some text: ");
		String text = in.nextLine();
		System.out.print("Please enter a letter to search for: ");
		char z = in.next().charAt(0);
		int counter = 0;
		
		for (int i = 0; i < text.length(); i ++ ) {
			char x = text.charAt(i);
			if (x == z) {
				counter ++;
			}
		}
		System.out.println(z + " occurs " + counter + " times in the text.");
		in.close();
	}

}

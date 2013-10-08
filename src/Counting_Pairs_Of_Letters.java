import java.util.Scanner;


public class Counting_Pairs_Of_Letters {
	/**
	 * Write a program that reads a short string and then some longer text. The program must say how many times you
	 * can find the short string in the text. You cannot use any method of String apart from charAt() and length().
	 * @param args
	 */

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter a short string: ");
		
		String short_text = in.nextLine();
		
		System.out.print("Now please enter a longer string: ");
		
		String long_text = in.nextLine();
		
		in.close();
		
		int counter = 0;
		boolean match = false;
		
		//loops through each char in the long text string
		for (int i = 0; i < long_text.length(); i ++ ) {
			char x = long_text.charAt(i);
			
			// If the current character in the long string matches the first character in the short string.
			if (x == short_text.charAt(0)) {
				
				// loop through each character in the short string.
				for (int j = 0; j < short_text.length(); j ++) {
					char y = short_text.charAt(j);
					
					// check that the inner loop isn't going to check past the size of the longer string.
					if (i + j >= long_text.length()) {
						match = false;
						break;
					}
					
					// check if the characters in both string match
					if (long_text.charAt((i + j)) == y) {
						match = true;
					} else {
						match = false;
					}	
				}
				
				if (match) {
					counter ++;
				}
				
			}
			
		}
		
		System.out.println("'" + short_text + "' occurs " + counter + " times in the string: '" + long_text + "'");
	}

}

import java.util.Scanner;


public class Counting_Letters_Redux {
	
	/**
	 * Write a program that reads a text from the user and then enter a loop of requesting letters and counting them.
	 * The program stops if the user asks for the same letter twice.
	 * @param args
	 */

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please write some text: ");
		
		String text = in.nextLine();
		
		String user_options = "";
		
		boolean flag = true;
		
		while (flag) {
			System.out.print("Which letter would you like to count?: ");
			
						
			char user_character = in.next().charAt(0);
			
			user_options += Character.toString(user_character);
			
			if(User_option_test(user_options)) {
				flag = false;
				System.out.println("Repeated character. Exiting the program...");
				break;
			}
			
			int counter = Character_counter(text, user_character);
		
			System.out.println(counter);
			
		}
		System.out.println("Thank you for your cooperation. Good bye!");
		in.close();

	}
	
	/**
	 * Test to see if the user has input repeated characters.
	 * @param user_options String The string containing all the users inputed characters
	 * @return boolean repeated characters, true or false.
	 */
	public static boolean User_option_test(String user_options) {
		boolean repeated_character = false;
		
		for (int i = 0; i < user_options.length(); i ++ ) {
			int counter = Character_counter(user_options, user_options.charAt(i));
			if (counter > 1) {
				repeated_character = true;
				break;
			}
		}
		
		return repeated_character;
	}
	
	
	/**
	 * Method to count how many times a character appears in a string.
	 * @param text String
	 * @param user_character char The character to check in the text.
	 * @return
	 */
	public static int Character_counter(String text, char user_character) {
		int counter = 0;
		for (int i = 0; i < text.length(); i++) {
			char x = text.charAt(i);
			if (x == user_character ) {
				counter ++;
			}
		}
		return counter;
	}

}

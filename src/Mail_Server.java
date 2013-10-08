import java.util.Scanner;


public class Mail_Server {
	
	/**
	 * When your program starts, it should provide a command prompt to the user. Then it must read the return
	 * address of the email using a command of the form “MAIL FROM: <email-address>”. The program must check
	 * that the command is properly written and that the email address is valid (i.e. contains one and only one “@” sign
	 * which is neither the first nor the last character). There is no need for the email address to actually exist, it only
	 * needs to be valid. If there is an error, the program must say so and wait for a correct return address.
	 * Once the destination is correct, the program must say “OK” and wait for the recipient. The recipient must be
	 * introduced by the user with a command of the form “RCPT FROM: <email-address>”. Once again, if the user
	 * enters an invalid command or email address, the program must wait for a correct one.
	 * Once the return address and recipient are correct, and only then, the user can enter the command “DATA”.
	 * The program reads then the body of the email, line after line, until the user enters a line that consists of only a dot.
	 * At that point, the email is ready and the program must write on the screen who is sending the email, to whom,
	 * and what the email says.
	 * If at any point the users types “QUIT” the program must terminate. If the user enters any other command,
	 * or types one of these commands at the wrong time (e.g. RCPT before MAIL), the program must say “Invalid
	 * command” on screen.
	 * @param args
	 */

	public static void main(String[] args) {
		
		System.out.println("Welcome to my mail server!");
		
		Scanner in = new Scanner(System.in);
		
		boolean running = true;
		while(running) {
			System.out.print(">>> ");
			String command = in.nextLine();
			running = command_classifier(command);
		}
		System.out.print("Goodbye");
		in.close();
	}
	
	public static boolean command_classifier(String command) {
		boolean running = true;
		boolean rcpt_address_present = false;
		boolean mail_address_present = false;

		String mail_from_command = "MAIL FROM:";
		String mail_address = "";
		String rcpt_to = "RCPT TO:";
		String rcpt_address = "";
		String data = "DATA";
		String quit = "QUIT";
		
		if (command.equals(quit)) {
			running = false;
		 } else if (command.length() >= mail_from_command.length() && command.substring(0, 10).equals(mail_from_command)) {
			 
			 if(email_check(command.substring(10).trim())) {
				System.out.println("OK");	
				mail_address = command.substring(10).trim();
				mail_address_present = true;
				} else {
				mail_address_present = false;
				System.out.println("Invalid email");
			}

		} else if (command.length() >= rcpt_to.length() && command.substring(0, 8).equals(rcpt_to)) {
			
			if(email_check(command.substring(8).trim())) {
				System.out.println("OK");
				rcpt_address = command.substring(8).trim();
				rcpt_address_present = true;
			} else {
				rcpt_address_present = false;
				System.out.println("Invalid email");
			}
			
			
		} else if (command.equals(data)) {
//			System.out.println(rcpt_address_present);
//			System.out.println(mail_address_present);

			
			if (rcpt_address_present && mail_address_present) {
				String email_text = email_data();
				System.out.println("Sending email...");
				System.out.println("From: " + mail_address);
				System.out.println("To: " + rcpt_address);
				System.out.println(email_text);
				System.out.println("...done!");	
			} else {
				System.out.println("Please enter a two & from email address first...");
			}

			
		} else {
			System.out.println("Invalid command");
		}
		return running;
		
	}
	
	/**
	 * Method to check the validity of an email address
	 * @param email String The address to be checked
	 * @return boolean
	 */
	public static boolean email_check(String email) {
		boolean valid = true;
		// System.out.println(email);
		int at_counter = 0;
		
		// check for @ sign at the beginning or at the end.
		if (email.charAt(0) == '@' || email.charAt(email.length() - 1) == '@') {
			return false;
		}
		
		// check for only one @ sign.
		for (int i = 0; i < email.length(); i ++) {
			char x = email.charAt(i);
			if (x == '@') {
				at_counter ++;
			}
		}
		if (at_counter > 1 || at_counter == 0) {
			valid = false;
		}
		
		return valid;
	}
	
	
	public static String email_data() {
		Scanner in = new Scanner(System.in);
		String email_text = "";
		// (in.nextLine().charAt(0) != '.')
		boolean flag = true;
		 while(flag) {
			 String line = in.nextLine();
			 if (line.equals(".")) {
				 flag = false;
				 break;
			 } else {
				 email_text += line + "\n";
			 }
		}
		
		in.close();
		return email_text;
		 
		
	}
	

}

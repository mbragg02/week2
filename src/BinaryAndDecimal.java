
public class BinaryAndDecimal {

	/**
	 * Create a program in which you define the following methods:
	 * 
	 *  - binary2decimal(String): takes from the user a binary number (with digits 0 and 1) and returns the corresponding 
	 * number in decimal (base-10, with digits between 0 and 9). 
	 * Hint: in the same way that you know that 35 = 3 á 101 + 5 á 100, you can find that 100011 = 1 á 25 + 1 á 21 + 1 á 20.
	 *  
	 *  - decimal2binary(int): the opposite of the previous one: takes a decimal number and returns the corresponding binary number. 
	 * Hint: instead of multiplying by 2, you will need to divide by two this time.
	 * 
	 * The program must offer a menu to the user with two options. 
	 *  - The first one takes a binary number from the user and returns the corresponding decimal number. 
	 *  - The second one does the opposite: takes a decimal number and returns a binary number. 
	 * @param args
	 */
	public static void main(String[] args) {
		
		String binarySample = "10010101101";
		int decimalSample = 1197;
		
		System.out.println("Binary = " + binarySample);
		System.out.println("Decmial = " + decimalSample);
		
		System.out.println("Binary converted to decimal = " + binary2decimal(binarySample));
		System.out.println("Decimal converted to binary = " + decimal2binary(decimalSample));	

	}
	
	public static int binary2decimal(String binaryString) {
		int priorValue = 0;		
		for (int i = 0; i < binaryString.length(); i ++) {
			String s = Character.toString(binaryString.charAt(i));
			int x = Integer.parseInt(s); 
			priorValue = (priorValue * 2) + x;			
		}
		return priorValue;
	}
	
	public static String decimal2binary(int decimalNumber) {
		String binaryString = "";
		String output = "";
		int x = 0;
		
		while (decimalNumber > 0) {
			x = decimalNumber % 2;
			decimalNumber = decimalNumber / 2;
			binaryString += x;
			
		}
		
		for (int i = binaryString.length() - 1; i >= 0; i--) {
			char y = binaryString.charAt(i);
			output += y;
		}
		
		
		
		return output;
	}

}

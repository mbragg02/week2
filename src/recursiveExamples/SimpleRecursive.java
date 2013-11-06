package recursiveExamples;

public class SimpleRecursive {


	public static void main(String[] args) {
		String str1 = null;
		recurs(str1);
		String str2 = "";
		recurs(str2);
		String str3 = "ABCDEFGH";
		recurs(str3);

	}
	
	public static void recurs(String str) {
		if(str == null || str.length() < 1) {
			return;
		}
		System.out.println(str);
		
		recurs(str.substring(0, str.length() - 1));
		
		if(str.length() > 1) {
			System.out.println(str);
		}
		
		
	}

}

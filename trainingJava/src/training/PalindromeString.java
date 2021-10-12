package training;

public class PalindromeString {

	public static void main(String[] args) {
		
		String s1 = "Java";
		String s2 = "malayalam";
		String rev1 = "", rev2 = "";

		for (int i = s1.length() - 1; i >= 0; i--) {
			rev1 = rev1 + s1.charAt(i);

		}
		//System.out.println(rev1);
		if (s1.equals(rev1)) {
			System.out.println("The given string " + s1 + " is a Palindrome");
		} else {
			System.out.println("The given string " + s1 + " is  not a Palindrome");
		}
		for (int j = s2.length() - 1; j >= 0; j--) {
			rev2 = rev2 + s2.charAt(j);

		}
		//System.out.println(rev2);
		if (s2.equals(rev2)) {
			System.out.println("The given string " + s2 + " is a Palindrome");
		} else {
			System.out.println("The given string " + s2 + " is  not a Palindrome");
		}
	}

}

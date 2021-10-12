package training;

import java.util.Scanner;

public class StringRev {

	private static String s1;

	public static String getS1() {
		return s1;
	}

	public static void setS1(String s1) {
		StringRev.s1 = s1;
	}

	public static void reverse(String s2) {
		String rev = "";
		for (int i = s2.length() - 1; i >= 0; i--) {

			rev += s2.charAt(i);

		}
		System.out.println("The reverse of the string \" " + s2 + "\" is " + rev);
	}

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string to be reversed :");
		setS1(in.nextLine());
		reverse(getS1());
		in.close();

	}

}

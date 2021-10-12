package training;

import java.util.Scanner;

public class VowelOrConsonant {

	private static String s1;

	public static String getS1() {
		return s1;
	}

	public static void setS1(String s1) {
		VowelOrConsonant.s1 = s1;
	}

	public static void check(String s2) {
		int countVowel = 0, countConsonant = 0;
		for (int i = 0; i < s2.length(); i++) {
			if (s2.charAt(i) == 'a' || s2.charAt(i) == 'A' || s2.charAt(i) == 'e' || s2.charAt(i) == 'E'
					|| s2.charAt(i) == 'i' || s2.charAt(i) == 'I' || s2.charAt(i) == 'o' || s2.charAt(i) == 'O'
					|| s2.charAt(i) == 'u' || s2.charAt(i) == 'U') {
				countVowel += 1;
			} else {
				countConsonant += 1;
			}
		}
		System.out.println("The count of vowels in the string is :" + countVowel);
		System.out.println("The count of consonant in the string is :" + countConsonant);

	}

	public static void main(String args[]) {

		System.out.println("Enter the String to be checked :");
		Scanner in = new Scanner(System.in);
		setS1(in.nextLine());
		check(getS1());
		in.close();

	}

}

package training;

import java.util.Scanner;

public class VowelCheck {

	public void checking(char c) {

		switch (c) {
		case 'a':
			System.out.println("The given input " + c + " is a vowel");
			break;
		case 'A':
			System.out.println("The given input " + c + " is a vowel");
			break;
		case 'e':
			System.out.println("The given input " + c + " is a vowel");
			break;
		case 'E':
			System.out.println("The given input " + c + " is a vowel");
			break;
		case 'i':
			System.out.println("The given input " + c + " is a vowel");
			break;
		case 'I':
			System.out.println("The given input " + c + " is a vowel");
			break;
		case 'o':
			System.out.println("The given input " + c + " is a vowel");
			break;
		case 'O':
			System.out.println("The given input " + c + " is a vowel");
			break;
		case 'u':
			System.out.println("The given input " + c + " is a vowel");
			break;
		case 'U':
			System.out.println("The given input " + c + " is a vowel");
			break;
		default:
			System.out.println("The given input " + c + " is a consonant");
		}

	}

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Alphabet for checking :");
		char c = in.next().charAt(0);
		VowelCheck v = new VowelCheck();
		v.checking(c);
		in.close();

	}

}

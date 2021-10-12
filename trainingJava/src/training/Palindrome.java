package training;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String args[]) {
		
		int r, sum = 0, temp1 = 0;
		
		System.out.println("Enter the number to be checked as Palindrome");
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		
		temp1 = num1;
		
		while (num1 > 0) {
			
			r = num1 % 10;
			sum = (sum * 10) + r;
			num1 = num1 / 10;
			
		}
		if (temp1 == sum)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");

		in.close();
	}

}

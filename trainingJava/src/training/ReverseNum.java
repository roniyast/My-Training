package training;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String args[]) {

		int num, num1;
		int rev = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number to be reversed :");
		num = in.nextInt();
		in.close();
		int length = (int) (Math.log10(num) + 1);
		num1 = num;
		for (int i = 0; i < length; i++) {
			int a = num1;
			int b = a % 10;
			num1 = a / 10;
			rev = (rev * 10) + b;

		}
		System.out.print("The reverse of the number is :" + rev);

	}
}

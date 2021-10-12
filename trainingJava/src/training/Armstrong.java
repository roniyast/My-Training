package training;

import java.util.Scanner;

public class Armstrong {
	public static void main(String args[]) {

		int cube = 0;
		System.out.println("Enter the number to be checked as Armstrong :");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
		int temp = num;
		while (num != 0) {
			int a = num % 10;
			cube = cube + (int) Math.pow(a, 3);
			num = num / 10;
		}
		if (temp == cube) {
			System.out.println("Entered number is Armstrong");
		} else {
			System.out.println("Entered number is not Armstrong");

		}

	}

}
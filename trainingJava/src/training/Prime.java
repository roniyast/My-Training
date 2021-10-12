package training;

import java.util.Scanner;

public class Prime {

	public boolean isPrime(int n) {
		boolean flag = false;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	public static void main(String args[]) {

		Prime p = new Prime();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = in.nextInt();
		in.close();
		if (!(p.isPrime(n))) {
			System.out.println(n + " is a prime number");
		} else {
			System.out.println(n + " is not a prime number");
		}
	}

}

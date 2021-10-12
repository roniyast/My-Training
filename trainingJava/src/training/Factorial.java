package training;

public class Factorial {

	public static void fact(int x) {

		int fac = 1;

		for (int i = 1; i <= x; i++) {

			fac = fac * i;
		}

		System.out.println("Factorial of " + x + " is " + fac);

	}

	public static void main(String args[]) {

		Factorial.fact(6);

	}

}

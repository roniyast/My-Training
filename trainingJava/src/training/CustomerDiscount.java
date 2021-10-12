package training;

import java.util.Scanner;

public class CustomerDiscount {

	public  static float total(float[] a) {
		float total = 0.0f;
		for (int i = 0; i < a.length; i++) {

			total += a[i];
		}
		return total;

	}

	public static float chkDiscound(float tot) {
		float totalAfrDiscount;
		if (tot >= 5000) {
			System.out.println("You are eligible for the 20 % discount!!! Hoorayy");
			totalAfrDiscount = tot - ((tot * 20) / 100);
		} else {
			System.out.println("Purchase for 5000 rs and more for getting 20 % discount !!!");
			totalAfrDiscount = tot;
		}
		return totalAfrDiscount;

	}

	public static void main(String args[]) {

		
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the number of items purchased :");
		int count = in.nextInt();
		float a[] = new float[count];
		System.out.println("Enter the price of items :");
		for (int i = 0; i < count; i++) {

			a[i] = in.nextFloat();

		}
		in.close();
		float t = total(a);
		float realTotal = chkDiscound(t);
		System.out.println("Total amount to be payed by the customer :" + realTotal);

	}
}

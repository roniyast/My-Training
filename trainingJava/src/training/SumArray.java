package training;

public class SumArray {
	public static void main(String args[]) {
		int sum = 0;
		int a[] = { 1, 2, 3, 4, 5 };
		int size = a.length;
		for (int i = 0; i < size; i++) {
			sum += a[i];
		}
		System.out.println("sum of array values is : " + sum);

	}

}

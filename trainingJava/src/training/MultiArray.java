package training;

public class MultiArray {
	public static void main(String args[]) {

		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = i + j;
				b[i][j] = i * j;
				// c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("First Array is as follows :");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("Second Array is as follows :");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("Sum of the two arrays is as follows :");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print((c[i][j] = a[i][j] + b[i][j]) + " ");
			}
			System.out.println();
		}

	}

}

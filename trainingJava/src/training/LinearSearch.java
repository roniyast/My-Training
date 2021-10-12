package training;

public class LinearSearch {

	public void search(int k) {

		int a[] = { 1, 2, 3, 4, 5 };
		int size = a.length;
		for (int i = 0; i < size; i++) {

			if (a[i] == k) {
				System.out.println("The position of the given number is " + i);
				break;
			}
			else {
				System.out.println();
			}

		}

	}

	public static void main(String args[]) {

		LinearSearch ls = new LinearSearch();
		ls.search(2);
	}

}

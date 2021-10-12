package training;

public class BubbleSort {
	public static void main(String args[]) {

		int arr[] = { 10, 5, 23, 4, 1 };
		int n = arr.length;

		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

		for (int j = 0; j < n; j++) {
			System.out.print(arr[j] + " ");
		}

	}
}

package training;

public class EvenOdd {

	public void count() {
		
		int evenCount = 0;
		int oddCount = 0;
		for (int i = 10; i <= 20; i++) {

			if (i % 2 == 0) {
				evenCount++;

			} else {
				oddCount++;

			}

		}

		System.out.println("Count of even numbers is " + evenCount);
		System.out.println("Count of odd numbers is " + oddCount);

	}

	public static void main(String args[]) {
		EvenOdd eo = new EvenOdd();
		eo.count();

	}

}

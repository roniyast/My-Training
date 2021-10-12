package training.collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortArray extends ArrayListCreation {

	public static void main(String[] args) {
		SortArray sa = new SortArray();
		ArrayList<String> colours = sa.createArraylist();
		
		System.out.println("***Sorting of the array Ascending***");
		Collections.sort(colours);
		sa.display(colours);
		System.out.println();
		
		// sorting of the array in descending
		System.out.println("***Sorting of the array in Descending***");
		Collections.sort(colours, Collections.reverseOrder());
		sa.display(colours);

	}

}

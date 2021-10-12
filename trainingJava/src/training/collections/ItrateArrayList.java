package training.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ItrateArrayList extends ArrayListCreation {

	// Display of the list values
	public void display(List<String> colours) {
		for (String c : colours) {

			System.out.print(c + " ");

		}

		System.out.println();
	}

	public static void main(String[] args) {

		ItrateArrayList ia = new ItrateArrayList();
		ArrayList<String> colours = ia.createArraylist();
		ia.display(colours);

		// itrating using function

		Iterator<String> itr = colours.iterator();// getting the Iterator
		while (itr.hasNext()) {// check if iterator has the elements
			System.out.print(itr.next() + " ");// printing the element and move to next
		}

	}
}

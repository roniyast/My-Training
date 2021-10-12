package training.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {

	// Retrieving an elemet from a given index
	public void retrievingElement(int position, List<String> colours) {

		if (position <= colours.size()) {

			String value = colours.get(position);
			System.out.println("The value at the position " + position + " is " + value);

		} else {
			System.out.println("No element to be retrieved from the given index");
		}

	}

	// Removing an element from an index

	public void removeIndex(int position, List<String> colours) {

		if (position <= colours.size()) {

			colours.remove(position);
			System.out.println("Elements after deleting :");
			display(colours);
		} else {
			System.out.println("No element to be deleted from the given index");
		}

	}

	// Searching an given string in the array list
	public void searchElemet(String string, List<String> colours) {
		for (String s : colours) {
			if (string.equals(s)) {
				System.out.println("The String " + string + " is found at the position " + colours.indexOf(string));
				break;
			}

		}

	}

	public void convertArrayList(List<String> colours) {

		// Converting to Array manually
		System.out.print("Manual Conversion : ");
		String colourArray[] = new String[colours.size()];

		for (int i = 0; i < colours.size(); i++) {
			colourArray[i] = colours.get(i);
		}

		for (int i = 0; i < colours.size(); i++) {
			System.out.print(colourArray[i] + " ");
		}

		System.out.println();

		System.out.print("Inbuilt Conversion : ");

		// Inbuilt method to convert to Array

		Object[] colour = colours.toArray();// creating an object array of name colour from arraylist colours

		for (Object o : colour) { // Iterate and convert to desired type
			String s = (String) o;

			System.out.print(s + " ");
		}

	}

	// Display of the list values
	public void display(List<String> colours) {
		for (String c : colours) {

			System.out.print(c + " ");

		}
		System.out.println();
	}

	public static void main(String args[]) {

		CollectionsExample c = new CollectionsExample();
		// Creation of an Arraylist of String type
		List<String> colours = new ArrayList<String>();

		// Adding values in to the list colours
		colours.add("RED");
		colours.add("YELLOW");
		colours.add("PURPLE");
		colours.add("GREEN");
		colours.add("BROWN");

		// Display of the list values
		System.out.println("***Display of the list values***");
		c.display(colours);
		System.out.println();
		// Retrieving elemet from a given index
		System.out.println("***Retrieving elemet from a given index***");
		c.retrievingElement(2, colours);
		System.out.println();
		// Deleting Element from a given index
		System.out.println("***Deleting Element from a given index***");
		c.removeIndex(3, colours);
		System.out.println();
		// Searching an elemet
		System.out.println("***Searching an Element***");
		c.searchElemet("PURPLE", colours);
		System.out.println();
		// Sorting of the array ascending
		System.out.println("***Sorting of the array Ascending***");
		Collections.sort(colours);
		c.display(colours);
		System.out.println();
		// sorting of the array in descending
		System.out.println("***Sorting of the array in Descending***");
		Collections.sort(colours, Collections.reverseOrder());
		c.display(colours);
		System.out.println();
		// Conversion
		System.out.println("***Conversion from Arraylist to Array***");
		c.convertArrayList(colours);
		System.out.println();

	}

}

package training.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray extends ArrayListCreation {

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

		Object[] colour = colours.toArray();
		for (Object o : colour) { // Iterate and convert to desired type
			String s = (String) o;

			System.out.print(s + " ");
		}

	}

	public static void main(String[] args) {

		ArrayListToArray a = new ArrayListToArray();
		ArrayList<String> colours = a.createArraylist();
		a.convertArrayList(colours);

	}

}

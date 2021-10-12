package training.collections;

import java.util.ArrayList;

public class RetrieveIndex extends ArrayListCreation {
	

	// Retrieving an elemet from a given index
	public void retrievingElement(int position, ArrayList<String> colours) {

		if (position <= colours.size()) {

			String value = colours.get(position);
			System.out.println("The value at the position " + position + " is " + value);

		} else {
			System.out.println("No element to be retrieved from the given index");
		}

	}

	public static void main(String[] args) {
		RetrieveIndex ri = new RetrieveIndex();
		ArrayList<String> colours =ri.createArraylist();
		ri.retrievingElement(3, colours);
		
	}

	
}

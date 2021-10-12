package training.collections;

import java.util.ArrayList;

public class RemoveIndex extends ArrayListCreation {

	// Removing an element from an index

	public void removeIndex(int position, ArrayList<String> colours) {

		if (position <= colours.size()) {

			colours.remove(position);
			System.out.println("Elements after deleting :");
		} else {
			System.out.println("No element to be deleted from the given index");
		}

	}

	public static void main(String[] args) {
		
		RemoveIndex ri = new RemoveIndex();
		ArrayList<String> colours = ri.createArraylist();
		ri.removeIndex(3, colours);
		ri.display(colours);

	}

}

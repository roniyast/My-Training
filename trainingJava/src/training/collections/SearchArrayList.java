package training.collections;

import java.util.ArrayList;

public class SearchArrayList extends ArrayListCreation {

	// Searching an given string in the array list
	public void searchElemet(String string, ArrayList<String> colours) {
		for (String s : colours) {
			if (string.equals(s)) {
				System.out.println("The String " + string + " is"
						+ " found at the position " + colours.indexOf(string));
				break;
			}

		}

	}

	public static void main(String[] args) {

		SearchArrayList sa = new SearchArrayList();
		ArrayList<String> colours = sa.createArraylist();
		sa.display(colours);
		sa.searchElemet("PURPLE", colours);

	}

}

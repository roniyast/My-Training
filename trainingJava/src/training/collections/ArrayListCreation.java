package training.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreation {

	public ArrayList<String> createArraylist() {

		List<String> colours = new ArrayList<String>();

		// Adding values in to the list colours
		colours.add("RED");
		colours.add("YELLOW");
		colours.add("PURPLE");
		colours.add("GREEN");
		colours.add("BROWN");

		return (ArrayList<String>) colours;

	}

	public void display(List<String> colours) {
		for (String c : colours) {
			System.out.print(c + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		ArrayListCreation ac = new ArrayListCreation();
		ArrayList<String> a = ac.createArraylist();
		ac.display(a);

	}

}

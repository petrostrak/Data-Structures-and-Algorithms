package model;

public class Main {

	public static void main(String[] args) {
		int x = 18; // Element to be searched
		int index = InterpolationSearch.interpolationSearch(x);

		// If element was found
		if (index != -1)
			System.out.println("Element found at index " + index);
		else
			System.out.println("Element not found.");
	}

}

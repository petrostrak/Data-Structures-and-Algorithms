package model;

public class Main {

	public static void main(String[] args) {

		int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610 };
		int x = 55;

		// Find the index of 'x' using Jump Search
		int index = JumpSearch.jumpSearch(arr, x);

		// Print the index where 'x' is located
		System.out.println("\nNumber " + x + " is at index " + index);
	}

}

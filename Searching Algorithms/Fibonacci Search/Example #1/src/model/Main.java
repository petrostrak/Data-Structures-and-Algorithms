package model;

public class Main {

	public static void main(String[] args) {

		int arr[] = { 10, 22, 35, 40, 45, 50, 80, 82, 85, 90, 100 };
		int n = 11;
		int x = 85;
		System.out.print("Found at index: " + FibonacciSearch.fibMonaccianSearch(arr, x, n));
	}

}

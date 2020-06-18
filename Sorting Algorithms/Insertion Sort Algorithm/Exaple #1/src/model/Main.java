package model;

import java.util.Arrays;

public class Main {
	 // Driver code
	  public static void main(String args[]) {
	    int[] data = { 9, 5, 1, 4, 3 };
	    InsertionSort is = new InsertionSort();
	    is.insertionSort(data);
	    System.out.println("Sorted Array in Ascending Order: ");
	    System.out.println(Arrays.toString(data));
	  }
}

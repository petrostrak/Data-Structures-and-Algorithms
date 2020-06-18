package model;

public class Main {

	public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 }; 
        
        System.out.println("Given Array"); 
        MergeSort.printArray(arr); 
  
        MergeSort ob = new MergeSort(); 
        ob.sort(arr, 0, arr.length - 1); 
  
        System.out.println("\nSorted array"); 
        MergeSort.printArray(arr); 
	}

}

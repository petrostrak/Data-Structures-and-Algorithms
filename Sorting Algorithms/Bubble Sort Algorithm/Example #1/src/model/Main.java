package model;

public class Main {

	public static void main(String[] args) {
		
        BubbleSort ob = new BubbleSort(); 
        int arr[] = {64, 34, 25, 12, 22, 11, 90}; 
        ob.bubbleSort(arr); 
        System.out.println("Sorted array"); 
        ob.printArray(arr); 
	}

}

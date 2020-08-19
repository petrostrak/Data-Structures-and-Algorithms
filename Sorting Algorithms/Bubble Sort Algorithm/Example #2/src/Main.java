public class Main {

	/*
	 * 	Bubble Sort
	 * 
	 *  In-place algorithm
	 *  O(n^2) time complexity - quadratic
	 *  It will take 100 steps to sort 10 items, 10000 steps to sort 100 items 1000000 steps to sort 1000 items.
	 *  Algorithm degrades quickly
	 * */
	
	public static void main(String[] args) {
		
		int[] intArray = {20, 35, -15, 7, 55, 1, -22};
		
		// the last index is will store the largest number so we decrement in every iteration
		for (int lastUnsortedIndex = intArray.length -1; lastUnsortedIndex > 0; lastUnsortedIndex --) {
			// we traverse from index 0 until the last unsorted index
			for (int i = 0; i < lastUnsortedIndex; i ++) {
				// and we compare if the current index is greater than the next on (i + 1)
				if (intArray[i] > intArray[i + 1]) {
					swap(intArray, i, i +1);
				}
			}
		}
		
		for (int i = 0; i < intArray.length; i ++) {
			System.out.println(intArray[i]);
		}
	}

	public static void swap(int[] array, int i, int j) {
		
		if (i == j) 
			return;
		
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}

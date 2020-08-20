
public class Main {

	/*
	 * 	Selection Sort
	 * In-place algorithm
	 * O(n^2) time complexity
	 * It will take 100 steps to sort 10 items, 10000 steps to sort 100 items 1000000 steps to sort 1000 items.
	 * Doesn't require as much swapping as bubble sort
	 * Unstable algorithm
	 * */
	public static void main(String[] args) {

		int[] intArray = {20, 35, -15, 7, 55, 1, -22};
		
		// the last index will store the largest number so we decrement in every iteration
		for(int lastUnorderedIndex = intArray.length - 1; lastUnorderedIndex > 0;
				lastUnorderedIndex--) {
			// initialize largest index to 0
			int largest = 0;
			// we traverse from index 0 until the last unsorted index
			// we compare the last element as well, that's why we traverse i <= lastUnorderedIndex
			for(int i = 0; i <= lastUnorderedIndex; i++) {
				if(intArray[i] > intArray[largest]) {
					largest = i; 
				}
			}
			swap(intArray, largest, lastUnorderedIndex);
		}
		
		for(int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

		
	}
	
	public static void swap(int[] array, int i, int j) {
		if(i == j) return;
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}


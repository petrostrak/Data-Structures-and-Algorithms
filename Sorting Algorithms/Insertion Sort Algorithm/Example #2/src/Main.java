
public class Main {
	/*
	 * 	Insertion Sort
	 * In-place algorithm
	 * O(n^2) time complexity
	 * It will take 100 steps to sort 10 items, 10000 steps to sort 100 items 1000000 steps to sort 1000 items.
	 * Doesn't require as much swapping as bubble sort
	 * Stable algorithm
	 * */
	public static void main(String[] args) {
		int[] intArray = {20, 35, -15, 7, 55, 1, -22};
		//we assuming that index 0 is in the sorted partition so we start from index 1
		for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex ++) {
			//we save the value we are going to insert
			int newElement = intArray[firstUnsortedIndex];
			//we declare i outside the loop because we need it after it
			int i;
			//loop that does the traversal of the sorted partition and looks the correct position to put new elements
			//we search until the start of the array (i>0). If so, this would be the smallest element 've seen so far
			//AND we are gonna keep looking as long as the element of the sorted partition is greater than the new element
			//we want to put
			for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i --) {
				// we are shifting from left to right the element
				intArray[i] = intArray[i - 1];
			}
			intArray[i] = newElement;
		}
		for (int i = 0; i < intArray.length; i ++) {
			System.out.println(intArray[i]);
		}
	}

}

package model;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		BucketSort bucket = new BucketSort();
		
        int[] intArr = {47, 85, 10, 45, 16, 34, 67, 80, 34, 4, 0, 99};
        //int[] intArr = {21,11,33,70,5,25,65,55};
        System.out.println("Original array- " + Arrays.toString(intArr));
        bucket.bucketSort(intArr, 10);
        System.out.println("Sorted array after bucket sort- " + Arrays.toString(intArr));
	}

}

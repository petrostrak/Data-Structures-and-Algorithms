package model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BucketSort {
	
	public void bucketSort(int[] intArr, int noOfBuckets ) {
        // Create bucket array
        List<Integer>[] buckets = new List[noOfBuckets];
        // Associate a list with each index 
        // in the bucket array         
        for(int i = 0; i < noOfBuckets; i++){
            buckets[i] = new LinkedList<>();
        }
        // Assign numbers from array to the proper bucket
        // by using hashing function
        for(int num : intArr){
            //System.out.println("hash- " + hash(num));
            buckets[hash(num)].add(num);
        }
        // sort buckets
        for(List<Integer> bucket : buckets){
            Collections.sort(bucket);
        }
        int i = 0;
        // Merge buckets to get sorted array
        for(List<Integer> bucket : buckets){
            for(int num : bucket){
                intArr[i++] = num;
            }
        }
	}
	
    // A very simple hash function
    public int hash(int num){
        return num/10;
    }
}

package collections;

import java.util.List;

public class ArrayList {

	/*
	 * 	This is one of the implementation of the List interface!
	 * 	An array stores the values on the background
	 * 
	 * 	int[] array = new int[10];
	 * 
	 * 	-Random access / very fast O(1) (Constant time) ---> Random access: accessing items by the index -list.get(0)
	 * 
	 *  -It is equivalent to Vector BUT arrayList is not synchronized
	 *  
	 *  -All operations run in O(n) time approximately (Linear time)
	 *  
	 *  -But if we want to remove items, this operation is not so efficient. We have to shift each items in our list - O(n)
	 *  
	 *  If our application is just about adding elements to a list and getting elements with known indexes -> an arrayList is perfect
	 *  
	 *  Capacity: It is a parameter we can define when we instantiate an ArrayList
	 *  	It is the initial size of the array
	 *  		- If we know that we will store 5 million items in a list we should use it
	 *  			list = new Arraylist(5000000) Why? This may reduce the amount of inrrementa reallocation
 	 */
	
	public static void main(String[] args) {
		
		List<String> list = new java.util.ArrayList<>();
		
		list.add("Petros");
		list.add("Maggie");
		list.add("Maria");
		list.add("George");
		
//		list.remove(1);
		
		for(int i = 0; i < list.size(); i ++) {
			System.out.println(list.get(i));
		}
		
		Object[] toArray = list.toArray();
		
		for(Object s : toArray) {
			System.out.println(s);
		}
		
	}

}

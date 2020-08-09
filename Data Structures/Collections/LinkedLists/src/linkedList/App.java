package linkedList;

public class App {
/*
 *  It is another implementation of the List interface
 *  		- implements List, Queue, Deque interfaces 
 *  It uses references -> eachitem has a reference to the next item + stores the data itself
 *  
 *  			43  -> 100  -> -12  -> 1 -> NULL	Singly Linked List
 *  	NULL <-	43 <-> 100 <-> -12 <-> 1 -> NULL	Doubly Linked List
 *  
 *  - NO RANDOM ACCESS !!!
 *  - Not synchronized
 *  - We can remove items very efficiently / O(1)
 *  - No sequential access !!! If we find an item we have to iterate through the list  until we find it / O(n)
 *  - Remove operation is very efficient: Just update the references / pointers O(1)
 *  - We should use a linkedList for remove heavy applications !
 *  
 */
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();

		list.insert(10);
		list.insert(-2);
		list.insert(3);
		list.insert(100);

//		list.remove(3);

		System.out.println(list.size());

		list.traverseList();
	}

}
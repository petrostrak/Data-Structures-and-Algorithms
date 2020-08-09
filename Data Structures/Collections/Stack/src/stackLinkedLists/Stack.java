package stackLinkedLists;

public class Stack<T extends Comparable<T>> {
	
	private Node<T> root;
	private int count;
	
	// O(1) constant time complexity
	public void push(T newData) {
		this.count ++;
		
		if(this.root == null) {
			this.root = new Node<>(newData);
		} else {
			Node<T> oldRoot = this.root;
			this.root = new Node<>(newData);
			this.root.setNextNode(oldRoot); // Updating reference
		}
	}
	
	// O(1) constant time complexity
	public T pop() {
		T itemToPop = this.root.getData();
		this.root = this.root.getNextNode(); // Updating reference
		this.count--;
		return itemToPop;
	}
	
	// O(1) constant time complexity
	public T peek() {
		return this.root.getData();
	}
	
	// O(1) constant time complexity
	public int size() {
		return this.count;
	}
	
	// O(1) constant time complexity
	public boolean isEmplty() {
		return this.root == null;
	}

}

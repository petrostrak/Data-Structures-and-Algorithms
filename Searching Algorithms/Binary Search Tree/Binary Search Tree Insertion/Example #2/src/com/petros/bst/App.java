package com.petros.bst;

public class App {
	public static void main(String[] args) {
		
		Tree<Integer> bst = new BinarySearchTree<>();
		
		bst.insert(10);
		bst.insert(-1);
		bst.insert(1);
		bst.insert(0);
		bst.insert(1000);
		bst.insert(-22);
		
//		bst.delete(43);
		bst.traversal();
//		System.out.println(bst.getMinValue());
	}
}

package com.petros.bst;

public class App {
	public static void main(String[] args) {
		
		Tree<Integer> bst = new BinarySearchTree<>();
		
		bst.insert(10);
		bst.insert(3);
		bst.insert(0);
		bst.insert(43);
		bst.insert(-6);
		bst.insert(22);
		bst.insert(22);
		
		System.out.println(bst.getMinValue());
	}
}

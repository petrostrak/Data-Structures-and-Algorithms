package com.petros.bst;

public interface Tree<T> {

	public void traversal();
	public void insertNode(T data, Node<T> root);
	public void delete(T data);
	public T getMax();
	public T getMin();
}

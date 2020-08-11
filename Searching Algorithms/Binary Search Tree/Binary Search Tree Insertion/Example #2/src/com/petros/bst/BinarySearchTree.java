package com.petros.bst;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {
	
	private Node<T> root;

	@Override
	public void traversal() {
		// TODO Auto-generated method stub
		
	}

	// help method
	@Override
	public void insert(T data) {
		if(root == null) {
			root = new Node<T>(data);
		} else {
			insertNode(data, root);
		}
	}
	
	@Override
	public T getMaxValue() {
		if(root == null) return null;
		return getMax(root);
	}
	
	@Override
	public T getMinValue() {
		if(root == null) return null;
		return getMin(root);
	}

	private void insertNode(T newData, Node<T> node) {
		if(newData.compareTo(node.getData()) < 0) {
			if(node.getLeftChild() != null) {
				insertNode(newData, node.getLeftChild());
			} else {
				Node<T> newNode = new Node<T>(newData);
				node.setLeftChild(newNode);
			}
		} else {
			if(node.getRightChild() != null) {
				insertNode(newData, node.getRightChild());
			} else {
				Node<T> newNode = new Node<T>(newData);
				node.setRightChild(newNode);
			}
		}
	}
	
	@Override
	public void delete(T data) {
		if(root != null) {
			root = delete(root, data);
		}
	}

	private Node<T> delete(Node<T> node, T data) {
		
		if(node == null) return node;
		
		if(data.compareTo(node.getData()) < 0) {
			node.setLeftChild(delete(node.getLeftChild(), data));
		} else if (data.compareTo(node.getData()) > 0) {
			node.setRightChild(delete(node.getRightChild(), data));
		} else {
			// We have found the node we want to delete
			if(node.getLeftChild() == null && node.getRightChild() == null) {
				System.out.println("Removing a leaf node...");
				return null;
			}
			
			if (node.getLeftChild() == null) {
				System.out.println("Removing the right child...");
				Node<T> tempNode = node.getRightChild();
				node = null;
				return tempNode;
			} else if(node.getRightChild() == null) {
				System.out.println("Removing the left child...");
				Node<T> tempNode = node.getLeftChild();
				node = null;
				return tempNode;
			}
			
			// This is the node with two children case!
			System.out.println("Removing node with two children case...");
			Node<T> tempNode = getPredecessor(node.getLeftChild());
			
			node.setData(tempNode.getData());
			node.setLeftChild(delete(node.getLeftChild(), tempNode.getData()));
		}
		
		
		return null;
	}

	private Node<T> getPredecessor(Node<T> node) {
		if (node.getRightChild() != null)
			return getPredecessor(node.getRightChild());
		
		System.out.println("Predecessor is " + node);
		return node;
	}

	private T getMax(Node<T> node) {
		if(node.getRightChild() != null) {
			return getMax(node.getRightChild());
		}
		
		return node.getData();
	}

	private T getMin(Node<T> node) {
		if(node.getLeftChild() != null) {
			return getMin(node.getLeftChild());
		}
		
		return node.getData();
	}

}

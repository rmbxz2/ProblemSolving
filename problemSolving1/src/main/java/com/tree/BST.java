package com.tree;

public class BST {
	Node root;

	public BST() {
		root = null;
	}

	/** 
	 * 
	 * @param value
	 * @return
	*/
	public Node NodeCreate(int value) {
		return new Node(value, null, null);
	}

	/**
	 * 
	 * @param start
	 * @param newNode
	*/
	public void add(Node start, Node newNode) {
		if (root == null) {
			root = newNode;
			return;
		}
		if (newNode.value > start.value) {
			if (start.right == null)
				start.right = newNode;
			add(start.right, newNode);
		}
		if (newNode.value < start.value) {
			if (start.left == null)
				start.left = newNode;
			add(start.left, newNode);
		}
	}

	/**
	 * 
	 * @param value
	 * @param start
	*/
	public void Search(int value, Node start) {

		if (start == null) {
			System.out.println("node isnot found");
			return;
		}
		if (start.value == value) {
			System.out.println("node is found");
			return;
		}
		if (value > start.value) {
			Search(value, start.right);
		}
		if (value < start.value) {
			Search(value, start.left);
		}
	}

	/**
	 * Binary Tree traverse by pre-in-post orders
	 * @param node
	*/
	public void preoderBT(Node nodex) {
		if (nodex != null) {
			System.out.println(" : " + nodex.value); // print as pre Order   8 4 2 1 3 6 5 7 12 10 9 11 14 13 15
			preoderBT(nodex.left);
			// System.out.println(" :: " + nodex.value); // print as in Order   1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 
			preoderBT(nodex.right);
			//System.out.println(" ::: " + nodex.value); // print as post Order  1 3 2 5 7 6 4 9 11 10 13 15 14 12 8
		}
	}
}




























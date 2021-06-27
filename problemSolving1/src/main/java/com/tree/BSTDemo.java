package com.tree;

public class BSTDemo {

	public static void main(String[] args) {
		BST bt = new BST();

		bt.add(bt.root, bt.NodeCreate(8));
		bt.add(bt.root, bt.NodeCreate(4));
		bt.add(bt.root, bt.NodeCreate(12));
		bt.add(bt.root, bt.NodeCreate(2));
		bt.add(bt.root, bt.NodeCreate(6));
		bt.add(bt.root, bt.NodeCreate(10));
		bt.add(bt.root, bt.NodeCreate(14));
		bt.add(bt.root, bt.NodeCreate(1));
		bt.add(bt.root, bt.NodeCreate(3));
		bt.add(bt.root, bt.NodeCreate(5));
		bt.add(bt.root, bt.NodeCreate(7));
		bt.add(bt.root, bt.NodeCreate(9));
		bt.add(bt.root, bt.NodeCreate(11));
		bt.add(bt.root, bt.NodeCreate(13));
		bt.add(bt.root, bt.NodeCreate(15));
		//		bt.Search(5, bt.root);
		bt.preoderBT(bt.root);
	}

}

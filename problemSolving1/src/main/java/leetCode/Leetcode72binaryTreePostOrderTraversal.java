package leetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
* Describe class here.
*
*
*
*
*
*/
public class Leetcode72binaryTreePostOrderTraversal {

	/**
	*
	*  DFS post order  by recursion
	*/
	public void dfs1(TreeNode root) {
		if (root == null)
			return;
		dfs1(root.left);
		dfs1(root.right);
		System.out.println(root.val);

	}

	/**
	*
	*  DFS post order  by stack
	*/
	public void dfs2(TreeNode root) {
		Stack<TreeNode> stack1 = new Stack<TreeNode>();
		Stack<TreeNode> stack2 = new Stack<TreeNode>();

		stack1.push(root);
		while (!stack1.isEmpty()) {
			TreeNode node = stack1.pop();
			stack2.push(node);
			if (node.left != null)
				stack1.push(node.left);
			if (node.right != null)
				stack1.push(node.right);
		}
		for (TreeNode element : stack2)
			System.out.println(element);
	}



	/**
	 * 
	 * @param args
	*/
	public static void main(String[] args) {
		TreeNode node7 = new TreeNode(7);
		TreeNode node3 = new TreeNode(3);
		TreeNode node5 = new TreeNode(5);
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2, node1, node3);
		TreeNode node6 = new TreeNode(6, node5, node7);
		TreeNode node4 = new TreeNode(4, node2, node6);

		Leetcode72binaryTreePostOrderTraversal postOrder = new Leetcode72binaryTreePostOrderTraversal();
		//		System.out.println(postOrder.isBST(node4));
	}
}

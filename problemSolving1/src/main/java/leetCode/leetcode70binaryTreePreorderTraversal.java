package leetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
* leetcode number 70 in my book
* leetcode number 144 in the website
* solve pre-order binary search tree traversal with and without recursion
*
*
*
*/
public class leetcode70binaryTreePreorderTraversal {
	List<Integer> list = new ArrayList<>();

	/**
	 * 
	 * @param root
	 * @return
	*/
	public void preorderTraversal(TreeNode2 root) {
		dfs(root);
	}

	/**
	 * dfs by recursion
	 * @return
	*/
	public void dfs(TreeNode2 root) {
		if (root == null)
			return;
		System.out.println("first " + root.val);
		dfs(root.left);
		dfs(root.right);
	}

	/**
	 * dfs by recursion
	 * @return
	*/
	public void dfs2(TreeNode2 root) {
		if (root == null)
			return;
		list.add(root.val);
		dfs2(root.left);
		dfs2(root.right);
	}

	/**
	 * dfs by stack
	 * @return
	*/
	public List<Integer> dfs3(TreeNode2 root) {
		List<Integer> list2 = new ArrayList<>();

		if (root == null)
			return list2;

		Stack<TreeNode2> stack = new Stack<>();
		stack.add(root);

		while (!stack.isEmpty()) {
			TreeNode2 node = stack.pop();
			if (node.right != null)
				stack.push(node.right);
			if (node.left != null)
				stack.push(node.left);
			list2.add(node.val);
			//System.out.println(node.val);
		}
		return list2;
	}

	/**
	 * 
	 * @param args
	*/
	public static void main(String[] args) {
		leetcode70binaryTreePreorderTraversal binaryTreeTraversl = new leetcode70binaryTreePreorderTraversal();

		TreeNode2 node7 = new TreeNode2(7);
		TreeNode2 node6 = new TreeNode2(6);
		TreeNode2 node3 = new TreeNode2(3);
		TreeNode2 node4 = new TreeNode2(4);
		TreeNode2 node5 = new TreeNode2(5, node6, node7);
		TreeNode2 node2 = new TreeNode2(2, node3, node4);
		TreeNode2 node1 = new TreeNode2(1, node2, node5);

		//		binaryTreeTraversl.dfs(treeNode1);

		//		binaryTreeTraversl.dfs2(treeNode1);
		//		System.out.println("list =" + binaryTreeTraversl.list);

		System.out.println(binaryTreeTraversl.dfs3(node1));

	}
}

/**
 * 
 * 
 */

class TreeNode2 {
	int val;
	TreeNode2 left;
	TreeNode2 right;

	TreeNode2() {
	}

	TreeNode2(int val) {
		this.val = val;
	}

	TreeNode2(int val, TreeNode2 left, TreeNode2 right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

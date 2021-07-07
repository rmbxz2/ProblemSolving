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
public class Leetcode71binaryTreeInOrderTraversal {

	/**
	*
	*
	*/
	public void dfs1(TreeNode root) {
		if (root == null) {
			return;
		}
		dfs1(root.left);
		System.out.println("hi " + root.val);
		dfs1(root.right);
	}

	List<Integer> list4 = new ArrayList<>();

	/**
	 * 
	 * @param root
	*/
	public List<Integer> dfs4(TreeNode root) {
		if (root == null) {
			return list4;
		}
		dfs4(root.left);
		list4.add(root.val);
		dfs4(root.right);
		return list4;
	}

	/**
	 * 
	 * @param root
	*/
	public List<Integer> dfsByRecursion(TreeNode root) {
		return dfs3(root, new ArrayList<>());
	}

	public List<Integer> dfs3(TreeNode root, List<Integer> list) {
		if (root == null) {
			return list;
		}
		list = dfs3(root.left, list);
		list.add(root.val);
		list = dfs3(root.right, list);
		return list;
	}

	/**
	 * 
	 * @param node
	*/
	public List<Integer> dfs2(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<>();
		TreeNode current = root;
	
		while (current != null || !stack.isEmpty()) {
			if (current != null) {
				stack.push(current);
				current = current.left;
			} else {
				current  = stack.pop();
				list.add(current.val);
				current = current.right;
			}
		}
		return list;
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

		Leetcode71binaryTreeInOrderTraversal inOrder = new Leetcode71binaryTreeInOrderTraversal();
		//		inOrder.dfs1(node4);
				System.out.println(inOrder.dfs2(node4));
		//		System.out.println(inOrder.dfs2(null));
		//		System.out.println(inOrder.dfsByRecursion(node4));
		//	        System.out.println(inOrder.dfs4(node4));

	}
}

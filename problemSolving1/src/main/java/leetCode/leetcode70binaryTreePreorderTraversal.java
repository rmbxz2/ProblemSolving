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
		List<Integer> list3 = new ArrayList<>();

		if (root == null)
			return list3;

		Stack<TreeNode2> stack = new Stack<>();
		stack.add(root);

		while (!stack.isEmpty()) {
			TreeNode2 node = stack.pop();
			list3.add(node.val);

			if (node.right != null)
				stack.push(node.right);
			if (node.left != null)
				stack.push(node.left);
			//System.out.println(node.val);
		}
		return list3;
	}

	/**
	*
	*
	*/
	private List<Integer> list4 = new ArrayList<>();

	public List<Integer> dfs4(TreeNode2 root) {
		if (root == null)
			return list4;

		Stack<TreeNode2> stack = new Stack<>();
		stack.push(root);

		while (!stack.isEmpty()) {
			TreeNode2 node = stack.pop();
			list4.add(node.val);

			if (node.right != null)
				stack.push(node.right);

			if (node.left != null)
				stack.push(node.left);
		}
		return list4;
	}

	/**
	 * dfs 5
	 * listM in stack like transporter == talea nazel  == it is almost like an instance variable
	 * String,Integer,Double(all immutable object) will create new objects if changed, so it is local variable and local objects
	 * StringBuilder and mutable Object will not create new objects if changed so it is act like instance var in recursion
	 *
	*/
	public List<Integer> dfs5(TreeNode2 root, List<Integer> listM) {
		if (root == null)
			return listM;
		listM.add(root.val);
		listM = dfs5(root.left, listM);
		listM = dfs5(root.right, listM);
		return listM;
	}

	/**
	 * dfs 6
	 * String,Integer,Double(all immutable object) will create new objects if changed, so it is local variable and local objects
	 * StringBuilder and mutable Object will not create new objects if changed so it is act like instance var in recursion
	*/
	public String dfs6(TreeNode2 root, String string) {
		if (root == null)
			return string;
		string = string + root.val;
		string = dfs6(root.left , string);
		string = dfs6(root.right, string);
		return string;
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

		//System.out.println(binaryTreeTraversl.dfs3(node1));

		//		binaryTreeTraversl.dfs4(node1);
		//		System.out.println("list4 = " + binaryTreeTraversl.list4);

		//	System.out.println(binaryTreeTraversl.dfs5(node1, new ArrayList<Integer>()));
		System.out.println(binaryTreeTraversl.dfs6(node1, " hi "));

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

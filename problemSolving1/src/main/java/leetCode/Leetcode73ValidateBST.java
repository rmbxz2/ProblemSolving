package leetCode;

import java.util.Stack;

/**
* Validate Binary Search Tree
* leetcode 73 in my book
* leetcode 98 in website
* https://leetcode.com/problems/validate-binary-search-tree/
*
*
*/
public class Leetcode73ValidateBST {

	/**
	*
	*
	*/
	TreeNode last = null;

	public void dfs(TreeNode root) {
		if (root == null) {
			return;
		}
		dfs(root.left);
		System.out.print(" " + root.val + " ");
		dfs(root.right);
	}

	/**
	 *  in order BST
	 * @param root
	*/
	public boolean isBST(TreeNode root) {

		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode current = root;
		TreeNode last = null;
		while (!(stack.isEmpty() && current == null)) {
			if (current != null) {
				stack.push(current);
				current = current.left;
			} else {
				current = stack.pop();
				if (last != null && last.val > current.val)
					return false;

				last = current;
				current = current.right;
			}
		}
		return true;
	}

	/**
	 *  in order BST
	 * @param root
	*/
	private boolean isBST2 = true;

	public boolean isBSTbyRecursion(TreeNode root) {
		dfsInorder(root, Long.MIN_VALUE);
		return isBST2;
	}

	public long dfsInorder(TreeNode root, long prev) {
		if (root == null)
			return prev;
		prev = dfsInorder(root.left, prev);
		// in-order

		if (prev >= root.val)
			isBST2 = false;
		prev = root.val;
		// in-order

		prev = dfsInorder(root.right, prev);
		return prev;
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
		Leetcode73ValidateBST bst = new Leetcode73ValidateBST();

		// bst.dfs(node4);
		// System.out.println(bst.isBST(node4));

		// demorgan's theorem
		//		System.out.println("===== demorgan's theorem =====");
		//		System.out.println(!(false || true));
		//		System.out.println((true && false));

		// print hashcode as class@hashCodeByHex convert it to class@HashCodeByDecimal by Integer.parse(int,16)
		//		System.out.println("===== print hashcode class@HashCodeByHex =====");
		//		System.out.println(" node4 = " + node4); // print hashcode as class@hashCodeByHex convert it to class@HashCodeByDecimal by Integer.parse(int,16)

		System.out.println("===== print  isBST by Recursion=====");
		bst.dfs(node4);
		System.out.println("result = " + bst.isBSTbyRecursion(node4));


	}
}

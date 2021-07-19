package leetCode;

import java.util.Stack;

/**
* Describe class here.
*
*
*
*
*
*/
public class Leetcode82Symmetric {

	/**
	*
	*
	*/
	public boolean isSymmetricRecursion(TreeNode root) {
		if (root == null)
			return true;

		if (root.left == null && root.right == null)
			return true;

		isSymmetricFromLeft(root);
		isSymmetricFromRight(root);
		while ((!stackLeft.isEmpty()) && (!stackRight.isEmpty())) {
			TreeNode left = stackLeft.pop();
			TreeNode right = stackRight.pop();
			if (left == null && right != null)
				return false;
			else if (left != null && right == null)
				return false;
			else if (left == null && right == null)
				continue;
			else if (left.val != right.val)
				return false;
			else if (left.val == right.val)
				continue;
		}
		if (!stackLeft.isEmpty() || !stackRight.isEmpty())
			return false;
		return true;
	}

	/**
	*
	*
	*/
	Stack<TreeNode> stackLeft = new Stack<>();

	public TreeNode isSymmetricFromLeft(TreeNode node) {
		if (node == null) {
			//stackLeft.push(null);
			return null;
		}

		TreeNode left = isSymmetricFromLeft(node.left);
		TreeNode right = isSymmetricFromLeft(node.right);
		stackLeft.push(left);
		stackLeft.push(right);

		return node;
	}

	/**
	*
	*
	*/

	Stack<TreeNode> stackRight = new Stack<>();

	public TreeNode isSymmetricFromRight(TreeNode node) {
		if (node == null) {
			//stackLeft.push(null);
			return null;
		}

		TreeNode right = isSymmetricFromRight(node.right);
		TreeNode left = isSymmetricFromRight(node.left);
		stackRight.push(right);
		stackRight.push(left);
		return node;

	}

	/**
	 * 
	 * @param args
	*/
	public static void main(String[] args) {

		// TreeNode node33 = new TreeNode(3, null, null);
		// TreeNode node3 = new TreeNode(3, null, null);
		// TreeNode node22 = new TreeNode(2, null, node33);
		// TreeNode node2 = new TreeNode(2, node3, null);
		// TreeNode node1 = new TreeNode(1, node2, node22);

		//  [1,2,2,null,3,null,3]
		TreeNode node33 = new TreeNode(3, null, null);
		TreeNode node3 = new TreeNode(3, null, null);
		TreeNode node22 = new TreeNode(2, node33, null);
		TreeNode node2 = new TreeNode(2, null, node3);
		TreeNode node1 = new TreeNode(1, node2, node22);

		Leetcode82Symmetric symmetric = new Leetcode82Symmetric();
		System.out.println(symmetric.isSymmetricRecursion(node1));

	}
}

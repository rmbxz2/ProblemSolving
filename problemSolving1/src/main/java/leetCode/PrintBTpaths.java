package leetCode;

import java.util.HashMap;
import java.util.Stack;

/**
* Describe class here.
*
*
*
*
*
*/

public class PrintBTpaths {

	/**
	*
	*
	*/
	public void printPath(TreeNode node, HashMap<TreeNode, TreeNode> family) {
		Stack<TreeNode> stackPath = new Stack<TreeNode>();

		while (node != null) { // stacked full path for leaf
			stackPath.push(node);
			node = family.get(node);
		}

		// print stack path for leaf 
		System.out.println(stackPath.toString());

	}

	/**
	*
	*
	*/
	public void buildHashMap(TreeNode root) {
		HashMap<TreeNode, TreeNode> family = new HashMap<>();

		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		family.put(root, null);

		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();

			if (node.right != null) {
				family.put(node.right, node);
				stack.push(node.right);
			}

			if (node.left != null) {
				family.put(node.left, node);
				stack.push(node.left);
			}
			if (node.left == null && node.right == null) { // found leaf then print path
				printPath(node, family);
			}

		}
	}

	/**
	 * 
	 * @param args
	*/
	public static void main(String[] args) {
		TreeNode node7 = new TreeNode(7);
		TreeNode node3 = new TreeNode(3);
		TreeNode node6 = new TreeNode(6);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5, node6, node7);
		TreeNode node2 = new TreeNode(2, node3, node4);
		TreeNode node1 = new TreeNode(1, node2, node5);
		PrintBTpaths paths = new PrintBTpaths();
		paths.buildHashMap(node1);
	}
}

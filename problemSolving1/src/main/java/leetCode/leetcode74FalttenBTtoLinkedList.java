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
public class leetcode74FalttenBTtoLinkedList {

	public TreeNode BTtoLinkdeList(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		TreeNode linkedList = root;
		stack.push(root);

		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();

			if (node.right != null)
				stack.push(node.right);

			if (node.left != null)
				stack.push(node.left);
			linkedList.right = node;
			linkedList = linkedList.right;
		}
		System.out.println(root);
		return root;
	}

	/**
	 * 
	 * @param args
	*/
         public static void main(String[] args) {
         
         }

}

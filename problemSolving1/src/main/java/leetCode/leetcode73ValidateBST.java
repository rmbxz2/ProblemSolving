package leetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
* Validate Binary Search Tree
* leetcode 73 in my book
* leetcode 98 in website
* https://leetcode.com/problems/validate-binary-search-tree/
*
*
*/
public class leetcode73ValidateBST {

	/**
	*
	*
	*/
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
		List<Integer> list= new ArrayList<>();
		TreeNode last = null;

		while (current != null || !stack.isEmpty()) {
			if (current != null) {
				stack.push(current);
				current = current.left;
			} else {
				current = stack.pop();
				
				//list.add(current.val);
				if(last !=null  && last.val >= current.val)
					return false;
				last = current;

				current = current.right;
			}
		}
		//         System.out.println("list =" + list);
		return true;
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
		leetcode73ValidateBST bst = new leetcode73ValidateBST();
		bst.dfs(node4);
		System.out.println(bst.isBST(node4));
	}
}

package leetCode;

import java.util.ArrayDeque;
import java.util.Queue;

/**
*  balanced tree 
*  https://leetcode.com/problems/balanced-binary-tree/
*  https://www.youtube.com/watch?v=IAVj3OThMnY
*  leetcode website  102. Binary Tree Level Order Traversal (BFS)
*  https://leetcode.com/problems/binary-tree-level-order-traversal/
*  leetcode website  110. Balanced Binary Tree
*/
public class BalancedBT {

	/**
	* 
	* @param root
	*/
	public void dfsPrint(TreeNode root) {
		if (root == null) {
			System.out.println(" null ");
			return;
		}
		System.out.println(root);
		dfsPrint(root.left);
		dfsPrint(root.right);
	}

	private boolean balanced = true;

	public boolean isBalancedBTbyRecursion(TreeNode root) {
		if (root == null)
			return true;
		getHight(root);
		return balanced;
	}

	/**
	* 
	* @param root
	* @return
	*/
	public int getHight(TreeNode root) {
		if (root == null)
			return -1;
		int leftH = getHight(root.left);
		int rightH = getHight(root.right);
		if (Math.abs(leftH - rightH) > 1)
			balanced = false;
		return Math.max(leftH, rightH) + 1;
	}

	/**
	*  BFS breadth first search using two queues.
	*  https://www.geeksforgeeks.org/level-order-traversal-line-line-set-2-using-two-queues/
	*/

	public int printBTlevels(TreeNode root) {
		int counterLevel = 0;
		Queue<TreeNode> q2 = new ArrayDeque<>();
		Queue<TreeNode> q1 = new ArrayDeque<>();
		q1.offer(root);

		while (!q1.isEmpty() || !q2.isEmpty()) {
			while (!q1.isEmpty()) {
				TreeNode node = q1.poll();
				if (node.left != null)
					q2.offer(node.left);
				if (node.right != null)
					q2.offer(node.right);
				System.out.print(" q1=" + node.val);
			}
			System.out.println(" aa level = " + counterLevel);
			if (q1.isEmpty() && !q2.isEmpty()) {
				counterLevel++;
			}
			while (!q2.isEmpty()) {
				TreeNode node2 = q2.poll();
				if (node2.left != null)
					q1.offer(node2.left);
				if (node2.right != null)
					q1.offer(node2.right);
				System.out.print(" q2=" + node2.val);
			}
			System.out.println(" bb level = " + counterLevel);
			if (q2.isEmpty() && !q1.isEmpty()) {
				counterLevel++;
			}
		}
		return counterLevel;
	}


	/**
	 * 
	 * @param args
	*/
	public static void main(String[] args) {
		//TreeNode node3 = new TreeNode(3, new TreeNode(10), null);
		//TreeNode node5 = new TreeNode(5, null, new TreeNode(11));
		TreeNode node7 = new TreeNode(7);
		TreeNode node3 = new TreeNode(3);
		TreeNode node5 = new TreeNode(5);
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2, node1, node3);
		TreeNode node6 = new TreeNode(6, node5, node7);
		TreeNode node4 = new TreeNode(4, node2, node6);
		BalancedBT bbt = new BalancedBT();
		System.out.println("====== print tree levels , level by level ====================");
		bbt.dfsPrint(node4);
		System.out.println("\n counter = " + bbt.printBTlevels(node4));
		//System.out.println(bbt.isBT(node4));

		System.out.println("======= the correct solution ===================");
 
		TreeNode xnode4 = new TreeNode(4);
		TreeNode xnode44 = new TreeNode(44);
		TreeNode xnode33 = new TreeNode(33, null, xnode44);
		TreeNode xnode3 = new TreeNode(3, xnode4, null);
		TreeNode xnode22 = new TreeNode(22, null, xnode33);
		TreeNode xnode2 = new TreeNode(2, xnode3, null);
		TreeNode xnode1 = new TreeNode(1, xnode2, xnode22);
		BalancedBT bt = new BalancedBT();
		boolean result = bt.isBalancedBTbyRecursion(node1);
		System.out.println("result = " + result);

	}
}

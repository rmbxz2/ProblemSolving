package leetCode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;

/**
* Describe class here.
*
*
*
*
*
*/
public class Leetcode75pathSum {

	/**
	* leetcode 75 in my book
	* https://leetcode.com/problems/path-sum/
	*/
	public void dfsPrint(TreeNode root) {
		if (root == null) {
			//System.out.println(" null ");
			return;
		}
		System.out.println(root);
		dfsPrint(root.left);
		dfsPrint(root.right);
	}

	/**
	*  change the nodes' values	
	*
	*/
	public boolean hasPathSum(TreeNode root, int sum) {
		TreeNode ptr = root;

		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);

		while (!stack.isEmpty()) {
			ptr = stack.pop();
			// not leaf
			if (ptr.right != null) {
				ptr.right.val += ptr.val;
				stack.push(ptr.right);
			}
			// not leaf 
			if (ptr.left != null) {
				ptr.left.val += ptr.val;
				stack.push(ptr.left);
			}
			// check the leaf
			if (ptr.left == null && ptr.right == null && ptr.val == sum) {
				return true;
			}
		}
		return false;
	}

	public boolean hasPathSumRecursion(TreeNode root, int sum) {
		return dfsSum(root, sum, false);
	}

	/**
	*  change the nodes' values	
	* @param root
	* @param sum
	*/
	public boolean dfsSum(TreeNode root, int sum, boolean isFound) {
		if (root == null)
			return isFound;
		// start of pre-order
		if (root.right != null) // not leaf, so add  the parent value to children
			root.right.val += root.val;

		if (root.left != null) // not leaf, so add  the parent value to children
			root.left.val += root.val;

		if (root.left == null && root.right == null && root.val == sum) // check leaf's value after summation
			return true;
		// end of pre-order

		isFound = dfsSum(root.left, sum, isFound);
		isFound = dfsSum(root.right, sum, isFound);

		return isFound;
	}

	/**
	* 
	* @param root
	* @param sum
	* @return
	*/
	public boolean hasPathSumRecursion2(TreeNode root, int sum) {
		return dfsSum2(root, sum, false);
	}

	/**
	*  don't change nodes' values
	* @param root
	* @param sum
	*/
	public boolean dfsSum2(TreeNode root, int sum, boolean isFound) {
		if (root == null)
			return isFound;
		// start of pre-order
		if (root.left != null)
			root.left.val += root.val;

		if (root.right != null)
			root.right.val += root.val;

		if (root.left == null && root.right == null && (sum == root.val))
			return true;
		// end of pre-order

		isFound = dfsSum2(root.left, sum, isFound);
		isFound = dfsSum2(root.right, sum, isFound);

		return isFound;
	}

	/**
	* 
	* @param root
	* @param sum
	* @return
	*/
	public boolean hasPathSumRecursion3(TreeNode root, int sum) {
		return dfsSum3(root, sum, false);
	}

	/**
	*  don't change nodes' values
	* @param root
	* @param sum
	*/
	public boolean dfsSum3(TreeNode root, int sum, boolean isFound) {
		if (root == null)
			return isFound;
		// start of pre-order

		sum -= root.val;

		if (root.left == null && root.right == null && (sum == 0))
			return true;
		// end of pre-order

		isFound = dfsSum3(root.left, sum, isFound);
		isFound = dfsSum3(root.right, sum, isFound);

		return isFound;
	}

	/**
	*
	*
	*/
	public boolean pathSumByBFS(TreeNode root, int sum) {
		Queue<TreeNode> queue = new ArrayDeque<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();

			if (node.left != null) { // 
				node.left.val += node.val;
				queue.offer(node.left);
			}

			if (node.right != null) {
				node.right.val += node.val;
				queue.offer(node.right);
			}

			if (node.right == null && node.left == null && node.val == sum) { // leaf
				return true;
			}

		}
		return false;
	}

	/**
	*
	*
	*/
	public boolean pathSumByStackAndFullPath(TreeNode root, int sum) {

		return false;
	}

	/**
	 * 
	 * @param args
	*/
	static int  sum = 11;

	public static void main(String[] args) {
		TreeNode node7 = new TreeNode(7);
		TreeNode node3 = new TreeNode(3);
		TreeNode node6 = new TreeNode(6);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5, node6, node7);
		TreeNode node2 = new TreeNode(2, node3, node4);
		TreeNode node1 = new TreeNode(1, node2, node5);
		Leetcode75pathSum pathSum = new Leetcode75pathSum();
		System.out.println("======== print as pre-order ============= ");
		pathSum.dfsPrint(node1);

		// System.out.println("======== path sum ============= ");
		// System.out.println("has path sum = " + sum + " " + pathSum.hasPathSum(node1, sum));
		// System.out.println("======== print as pre-order ============= ");
		// pathSum.dfsPrint(node1);

		// System.out.println("======== path sum by recursion ============= ");
		// System.out.println("has path sum = " + sum + " " + pathSum.hasPathSumRecursion(node1, sum));
		// System.out.println("======== print as pre-order  ============= ");
		// pathSum.dfsPrint(node1);

		// System.out.println("======== path sum by recursion summation ============= ");
		// System.out.println("has path sum = " + sum + " " + pathSum.hasPathSumRecursion2(node1, sum));
		// System.out.println("======== print as pre-order  ============= ");
		// pathSum.dfsPrint(node1);

		System.out.println("======== path sum by recursion subtraction ============= ");
		System.out.println("has path sum = " + sum + " " + pathSum.hasPathSumRecursion3(node1, sum));
		System.out.println("======== print as pre-order  ============= ");
		pathSum.dfsPrint(node1);

		// System.out.println("======== path sum by BFS ============= ");
		// System.out.println("has path sum = " + sum + " " + pathSum.pathSumByBFS(node1, sum));
		// System.out.println("======== print as pre-order  ============= ");
		// pathSum.dfsPrint(node1);

	}
}

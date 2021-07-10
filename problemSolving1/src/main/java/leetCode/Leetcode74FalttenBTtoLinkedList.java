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
public class Leetcode74FalttenBTtoLinkedList {

	/**
	* leetcode 74 in my book
	* https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
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

	/**
	*   solved by reversed pre-order 7654321 which is equals negate-post
	*  
	*      1
	*    2     5
	*   3 4   6 7
	*  
	*  pre         1234567 ===== just put the output in the stack then you will get Negate-post
	*  Negate-post 7654321
	*
	*  post        3426751  ===== just put the output in the stack then you will get Negate-pre
	*  Negate-pre  1576243 
	*   
	*  negate  pre-order  ==  inverse post-order
	*  negate  post-order ==  inverse pre-order
	*
	* @param root
	* @return
	*/
	public void BTtoLinkdeListByReversedPostOrder(TreeNode root) {
		TreeNode ptr1 = null;
		TreeNode ptr2 = null;
		Stack<TreeNode> stack1 = new Stack<TreeNode>();
		Stack<TreeNode> stack2 = new Stack<TreeNode>();
		stack1.push(root);
		while (!stack1.isEmpty()) { // pre-order by stack1 , put the output in stack2
			root = stack1.pop();
			stack2.push(root);
			if (root.right != null)
				stack1.push(root.right);
			if (root.left != null)
				stack1.push(root.left);
		}

		while (!stack2.isEmpty()) { // reassign the nodes right, and put left to null
			ptr1 = stack2.pop();
			if (!stack2.isEmpty()) {
				ptr2 = stack2.peek();
				ptr2.right = ptr1;
				ptr2.left = null;
			}
		}
		//
		//		for (TreeNode node : stack2) {
		//			System.out.println(node.val);
		//	}
	}

	/**
	*   solved by  pre-order 1234567 by two pointers 2ptr
	*   
	*      1
	*    2     5
	*   3 4   6 7
	* 
	* @param root
	* @return
	*/
	public void BTtoLinkdeListByPreOrder(TreeNode root) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode ptr1 = root;
		TreeNode ptr2 = root;
		stack.push(root);
		while (!stack.isEmpty()) {
			ptr1 = stack.pop();
			if (ptr1.right != null)
				stack.push(ptr1.right);

			if (ptr1.left != null)
				stack.push(ptr1.left);

			//set right pointers, null left
			ptr2.right = ptr1;
			ptr2.left = null;

			// ptr2 refers to last ptr1 
			ptr2 = ptr1;
		}
	}

	/**
	*   solved by  pre-order 1234567 by one  pointer ptr1 only
	*   
	*      1
	*    2     5
	*   3 4   6 7
	* 
	* @param root
	* @return
	*/
	public void BTtoLinkdeListByPreOrderByOnePtr(TreeNode root) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode ptr1 = root;
		stack.push(root);
		while (!stack.isEmpty()) {
			ptr1 = stack.pop();
			if (ptr1.right != null)
				stack.push(ptr1.right);

			if (ptr1.left != null)
				stack.push(ptr1.left);

			//set right pointers, null left
			if (!stack.isEmpty())
				ptr1.right = stack.peek();
			ptr1.left = null;
		}
	}

	/**
	*   solved by  pre-order 1234567 by recursion
	*   
	*      1
	*    2     5
	*   3 4   6 7
	* 
	* @param root
	* @return
	*/
	public void BTtoLinkdeListByPreOrderByRecursion(TreeNode root) {
		dfs(root);
	}

	/**
	*  dfs
	*
	*/

	TreeNode prevptr1 = null;

	public void dfs(TreeNode root) {
		if (root == null)
			return;

		dfs(root.right); // negate post-order, first element printed will be 7 6 54321 
		dfs(root.left);
		root.right = prevptr1;
		root.left = null;
		prevptr1 = root;

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

		Leetcode74FalttenBTtoLinkedList flatten = new Leetcode74FalttenBTtoLinkedList();

		// System.out.println("\n ======== origin tree reversed pre-order =================");
		// flatten.dfsPrint(node1);
		// System.out.println("\n ======== flatten tree reversed pre-order =================");
		// flatten.BTtoLinkdeListByReversedPostOrder(node1);
		// flatten.dfsPrint(node1);

		// System.out.println("\n ======== origin tree pre-order by two pointers=================");
		// flatten.dfsPrint(node1);
		// System.out.println("\n ======== flatten tree pre-order by two pointers=================");
		// flatten.BTtoLinkdeListByPreOrder(node1);
		// flatten.dfsPrint(node1);

		// System.out.println("\n ======== origin tree pre-order by one pointer=================");
		// flatten.dfsPrint(node1);
		// System.out.println("\n ======== flatten tree pre-order by one pointer=================");
		// flatten.BTtoLinkdeListByPreOrderByOnePtr(node1);
		// flatten.dfsPrint(node1);

		System.out.println("\n ======== origin tree pre-order by recursion=================");
		flatten.dfsPrint(node1);
		System.out.println("\n ======== flatten tree pre-order by recursion =================");
		flatten.BTtoLinkdeListByPreOrderByRecursion(node1);
		flatten.dfsPrint(node1);

	}
}

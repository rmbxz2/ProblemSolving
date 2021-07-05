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
public class Leetcode70binaryTreePreorderTraversal {
	List<Integer> list = new ArrayList<>();

	/**
	 * 
	 * @param root
	 * @return
	*/
	public void preorderTraversal(TreeNode root) {
		dfs(root);
	}

	/**
	 * dfs by recursion
	 * @return
	*/








	public void dfs(TreeNode root) {
            
		if (root == null)
			return;
		System.out.println("second  "+root.val);
		dfs(root.left);
		dfs(root.right);


	}


	/**
	 * dfs by recursion
	 * @return
	*/
	public void dfs2(TreeNode root) {
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
	public List<Integer> dfs3(TreeNode root) {
		List<Integer> list3 = new ArrayList<>();

		if (root == null)
			return list3;

		Stack<TreeNode> stack = new Stack<>();
		stack.add(root);

		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
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

	public List<Integer> dfs4(TreeNode root) {
		if (root == null)
			return list4;

		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);

		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
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
	public List<Integer> dfs5(TreeNode root, List<Integer> listM) {
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
	public StringBuilder dfs6(TreeNode root, StringBuilder string) {
		if (root == null)
			return string;
		string.append(" " +root.val);
		string = dfs6(root.left, string);
		string = dfs6(root.right, string);
		return string;
	}

	/**
	 * 
	 * @param args
	*/
	public static void main(String[] args) {
		Leetcode70binaryTreePreorderTraversal binaryTreeTraversl = new Leetcode70binaryTreePreorderTraversal();

		TreeNode node7 = new TreeNode(7);
		TreeNode node6 = new TreeNode(6);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5, node6, node7);
		TreeNode node2 = new TreeNode(2, node3, node4);
		TreeNode node1 = new TreeNode(1, node2, node5);

		//				binaryTreeTraversl.dfs(node1);

		//		binaryTreeTraversl.dfs2(treeNode1);
		//		System.out.println("list =" + binaryTreeTraversl.list);

		//System.out.println(binaryTreeTraversl.dfs3(node1));

		//		binaryTreeTraversl.dfs4(node1);
		//		System.out.println("list4 = " + binaryTreeTraversl.list4);

		//	System.out.println(binaryTreeTraversl.dfs5(node1, new ArrayList<Integer>()));
		System.out.println(binaryTreeTraversl.dfs6(node1, new StringBuilder(" hi ")));

	}
}


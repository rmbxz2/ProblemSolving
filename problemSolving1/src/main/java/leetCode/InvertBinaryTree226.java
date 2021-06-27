package leetCode;

/**
 * 
 * 
*/
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

/**
* Describe class here.
*
*
*
*
*
*/
public class InvertBinaryTree226 {
	int leavesSum;

	/**
	*
	*
	*/
	public void dfs(TreeNode root) {
		if (root != null) {
			System.out.println(root.val); // dfs preorder
			dfs(root.left);
			//System.out.println(root.val); // dfs inorder
			dfs(root.right);
			//System.out.println(root.val); // dfs postorder
		}
	}

	/**
	 * 
	 * this is not a part of the solution,
	*/
	public TreeNode dfsParamWithReturn(TreeNode root, int parentValue) {
		if (root == null) {
			return null;
		}
		root.val = (parentValue * 10) + root.val;
		System.out.println(root.val); // DFS preorder
		TreeNode left = dfsParamWithReturn(root.left, root.val);
		//System.out.println(root.val);  // DFS inorder
		TreeNode right = dfsParamWithReturn(root.right, root.val);
		//		System.out.println(root.val);  // DFS postorder
		if (left != null && right != null)
			System.out.println("root = " + root.val + " left= " + left.val + " right =  " + right.val);
		if (root.left == null && root.right == null) {
			leavesSum += root.val;
		}
		return root;
	}

	/**
	 * 
	 * 
	*/
	public TreeNode invertTree(TreeNode root) {
		if (root == null) {
			return null;
		}
		TreeNode left = invertTree(root.left);
		TreeNode right = invertTree(root.right);
		root.right = left;
		root.left = right;
		return root;
	}

	/**
	* 
	* 
	*/
	public static void main(String[] args) {
		InvertBinaryTree226 invertBinaryTree = new InvertBinaryTree226();

		TreeNode t7 = new TreeNode(7);
		TreeNode t6 = new TreeNode(6);
		TreeNode t5 = new TreeNode(5);
		TreeNode t4 = new TreeNode(4);
		TreeNode t3 = new TreeNode(3, t6, t7);
		TreeNode t2 = new TreeNode(2, t4, t5);
		TreeNode t1 = new TreeNode(1, t2, t3);
		System.out.println("====DFS preorder========");
		invertBinaryTree.dfs(t1);
		invertBinaryTree.dfsParamWithReturn(t1, 0);
		System.out.println("leavesSum = " + invertBinaryTree.leavesSum);
		System.out.println("=====invert Tree=======");
		invertBinaryTree.invertTree(t1);
		System.out.println("====DFS preorder========");
		invertBinaryTree.dfs(t1);
		//invertBinaryTree.dfsParamWithReturn(t1, 0);
	}
}

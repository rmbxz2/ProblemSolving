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
public class Leetcode77ConvertArrayToBSTbyReference {

	public void dfsPrint(TreeNode root) {
		if (root == null) {
			System.out.println(" null ");
			return;
		}
		dfsPrint(root.left);
		System.out.println(root);
		dfsPrint(root.right);
	}

	/**
	*
	*
	*/
	public TreeNode buildBSTByRecursion(int[] array) {
		if (array.length == 0)
			return null;

		int low = 0;
		int high = array.length - 1;
		return buildBSTByRecursionDFSpreOrder(array, low, high);

	}

	/**
	* 
	* @param root
	*/
	public TreeNode buildBSTByRecursionDFSpreOrder(int[] array, int low, int high) {
		if (low > high) {
			//System.out.println(" null ");
			return null;
		}
		int mid = (low + high) >>> 1;
		TreeNode root = new TreeNode(array[mid], null, null);

		TreeNode left = buildBSTByRecursionDFSpreOrder(array, low, mid - 1);
		TreeNode right = buildBSTByRecursionDFSpreOrder(array, mid + 1, high);

		// connect vertices by post-order
		root.left = left;
		root.right = right;

		return root;
	}

	/**
	*
	*
	*/
	private MyTreeNode myTreeRoot = null;
	private TreeNode treeRoot = null;

	public TreeNode buildBSTbyStack(int[] array) {
		int low = 0;
		int high = array.length - 1;
		int mid = (low + high) >>> 1;
		myTreeRoot = new MyTreeNode(array[mid], null, null, low, high, mid);
		treeRoot = myTreeRoot.treeNode;

		Stack<MyTreeNode> stack = new Stack<MyTreeNode>();
		stack.push(myTreeRoot);
		while (!stack.isEmpty()) {
			MyTreeNode node = stack.pop();
			if (node.treeNode.right == null) {
				int lowRight = node.getMid() + 1;
				int highRight = node.getHigh();
				int midRight = (lowRight + highRight) >>> 1;
				if (lowRight <= highRight) {
					MyTreeNode nodeRight = new MyTreeNode(array[midRight], null, null, lowRight, highRight, midRight);
					node.treeNode.right = nodeRight.treeNode;
					stack.push(nodeRight);
				}
			}
			if (node.treeNode.left == null) {
				int lowLeft = node.getLow();
				int highLeft = node.getMid() - 1;
				int midLeft = (lowLeft + highLeft) >>> 1;
				if (lowLeft <= highLeft) {
					MyTreeNode nodeLeft = new MyTreeNode(array[midLeft], null, null, lowLeft, highLeft, midLeft);
					node.treeNode.left = nodeLeft.treeNode;
					stack.push(nodeLeft);
				}
			}
			System.gc(); //  call GC to clean t1 , but before calling it cat finalizer 
		}
		return treeRoot;
	}

	/**
	 * 
	 * @param args
	*/
	public static void main(String[] args) {
		int[] array = { 0, 1, 2, 3, 4, 5, 6 };
		Leetcode77ConvertArrayToBSTbyReference converter = new Leetcode77ConvertArrayToBSTbyReference();

		// TreeNode treeRoot = converter.buildBSTbyStack(array);
		// converter.dfsPrint(treeRoot);
		// converter.myTreeRoot = null; // activate it to make root eligable for GC, so can view the fianalize message about 33
		// System.gc(); //  call GC to clean t1 , but before calling it cat finalizer 

		// // test calling finalizer 
		// MyTreeNode t1 = new MyTreeNode(999999, null, null, 0, 0, 0);
		// t1 = null;
		// System.gc(); //  call GC to clean t1 , but before calling it call finalizer 

		converter.dfsPrint(converter.buildBSTByRecursion(array));

	}
}

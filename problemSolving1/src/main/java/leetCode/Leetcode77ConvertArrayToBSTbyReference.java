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
	private MyTreeNode myTreeRoot = null;
	private TreeNode treeRoot = null;

	public TreeNode buildBST(int[] array) {
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
		int[] array = { 0, 11, 22, 33, 44, 55, 66 };
		Leetcode77ConvertArrayToBSTbyReference converter = new Leetcode77ConvertArrayToBSTbyReference();
		TreeNode treeRoot = converter.buildBST(array);
		converter.dfsPrint(treeRoot);
		converter.myTreeRoot = null; // activate it to make root eligable for GC, so can view the fianalize message about 33
		System.gc(); //  call GC to clean t1 , but before calling it cat finalizer 

		// test calling finalizer 
		MyTreeNode t1 = new MyTreeNode(999999, null, null, 0, 0, 0);
		t1 = null;
		//System.gc(); //  call GC to clean t1 , but before calling it call finalizer 
	}
}

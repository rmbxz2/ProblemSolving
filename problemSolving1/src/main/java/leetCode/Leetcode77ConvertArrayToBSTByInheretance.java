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
public class Leetcode77ConvertArrayToBSTByInheretance {

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
	private MyTreeNode2 myTreeRoot = null;

	public MyTreeNode2 buildBST(int[] array) {
		int low = 0;
		int high = array.length - 1;
		int mid = (low + high) >>> 1;
		myTreeRoot = new MyTreeNode2(array[mid], null, null, low, high, mid);
		Stack<MyTreeNode2> stack = new Stack<MyTreeNode2>();
		stack.push(myTreeRoot);
		while (!stack.isEmpty()) {
			MyTreeNode2 node = stack.pop();
			if (node.right == null) {
				int lowRight = node.getMid() + 1;
				int highRight = node.getHigh();
				int midRight = (lowRight + highRight) >>> 1;
				if (lowRight <= highRight) {
					MyTreeNode2 nodeRight = new MyTreeNode2(array[midRight], null, null, lowRight, highRight, midRight);
					node.right = nodeRight;
					stack.push(nodeRight);
				}
			}
			if (node.left == null) {
				int lowLeft = node.getLow();
				int highLeft = node.getMid() - 1;
				int midLeft = (lowLeft + highLeft) >>> 1;
				if (lowLeft <= highLeft) {
					MyTreeNode2 nodeLeft = new MyTreeNode2(array[midLeft], null, null, lowLeft, highLeft, midLeft);
					node.left = nodeLeft;
					stack.push(nodeLeft);
				}
			}
		}
		return myTreeRoot;
	}

	/**
	 * 
	 * @param args
	*/
	public static void main(String[] args) {
		int[] array = { 0, 1, 2, 3, 4, 5, 6 };
		Leetcode77ConvertArrayToBSTByInheretance converter = new Leetcode77ConvertArrayToBSTByInheretance();
		TreeNode treeRoot = converter.buildBST(array);
		converter.dfsPrint(treeRoot);
		//converter.myTreeRoot = null; // activate it to make root eligable for GC, so can view the fianalize message about 33
		//System.gc(); //  call GC to clean t1 , but before calling it cat finalizer 

		// test calling finalizer 
		//MyTreeNode2 t1 = new MyTreeNode2(999999, null, null, 0, 0, 0);
		//t1 = null;
		//System.gc(); //  call GC to clean t1 , but before calling it call finalizer 


	}
}

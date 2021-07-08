package leetCode;

/**
* Describe class here.
*
*
*
*
*
*/
public class TreeNode {
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
		
	 @Override
	 public String toString() {
	 	return " " + val;
	 }

	/**
	* 
	* 
	*/
	@Override
	public int hashCode() {
		return Integer.parseInt("" + (val), 16); // return class@HashCodeByDecimal
		//		return val * 10; // hash code by hex  class@HashcodeByHex
	}
}

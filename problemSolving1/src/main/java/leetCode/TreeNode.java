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
	* @see java.lang.Object#equals(java.lang.Object)
	*/

	/**
	 * @return the val
	 */
	public int getVal() {
		return val;
	}

	/**
	 * @param val the val to set
	 */
	public void setVal(int val) {
		this.val = val;
	}

	/**
	 * @return the left
	 */
	public TreeNode getLeft() {
		return left;
	}

	/**
	 * @param left the left to set
	 */
	public void setLeft(TreeNode left) {
		this.left = left;
	}

	/**
	 * @return the right
	 */
	public TreeNode getRight() {
		return right;
	}

	/**
	 * @param right the right to set
	 */
	public void setRight(TreeNode right) {
		this.right = right;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TreeNode other = (TreeNode) obj;
		if (left == null) {
			if (other.left != null)
				return false;
		} else if (!left.equals(other.left))
			return false;
		if (right == null) {
			if (other.right != null)
				return false;
		} else if (!right.equals(other.right))
			return false;
		if (val != other.val)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return " " + val;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */

	@Override
	public int hashCode() {
		return val;
	}
}

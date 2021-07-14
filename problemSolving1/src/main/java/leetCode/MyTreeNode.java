package leetCode;

/**
* 
*
*
*
*
*
*/
public class MyTreeNode  {
	private int low;
	private int high;
	private int mid;
	TreeNode treeNode;

	/**
	* 
	* 
	*/
	public MyTreeNode(int val, TreeNode left, TreeNode right, int low, int high, int mid) {
		treeNode = new TreeNode(val, left, right);
		this.low = low;
		this.high = high;
		this.mid = mid;
	}

	/**
	* 
	* @return
	*/
	public TreeNode getTreeNodeRoot() {
		//	    this.
		return null;
	}

	/**
	 * @return the low
	 */
	public int getLow() {
		return low;
	}

	/**
	 * @param low the low to set
	 */
	public void setLow(int low) {
		this.low = low;
	}

	/**
	 * @return the high
	 */
	public int getHigh() {
		return high;
	}

	/**
	 * @param high the high to set
	 */
	public void setHigh(int high) {
		this.high = high;
	}

	/**
	 * @return the mid
	 */
	public int getMid() {
		return mid;
	}

	/**
	 * @param mid the mid to set
	 */
	public void setMid(int mid) {
		this.mid = mid;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

	@Override
	public String toString() {
		return "[ val = " + treeNode.val + " high=" + high + ", low=" + low + ", mid=" + mid + "]";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(
				"GC will kill MyTreeNode Object, the last words for object is said by finalizer   which val = " + treeNode.val);
	}

}

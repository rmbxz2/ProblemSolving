package leetCode;

/**
* Describe class here.
*
*
*
*
*
*/
public class MyTreeNode2 extends TreeNode {
	private int low;
	private int high;
	private int mid;

	public MyTreeNode2(int val, TreeNode left, TreeNode right, int low, int high, int mid) {
		super(val, left, right);
		this.low = low;
		this.high = high;
		this.mid = mid;
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



	@Override
	public int hashCode() {
		return val;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */

	@Override
	public boolean equals(Object obj) {
		return this.val == ((MyTreeNode2) obj).val;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	@Override
	public String toString() {
		return "[val = " + val+  " high=" + high + ", low=" + low + ", mid=" + mid + "]";
	}


}

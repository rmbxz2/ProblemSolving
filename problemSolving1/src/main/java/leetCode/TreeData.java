package leetCode;

/**
* Describe class here.
*
*
*
*
*
*/
public class TreeData {
	private boolean flag;
	private TreeNode left;
	private TreeNode right;
	private boolean isSymmetric = true;

	/**
	 * @return the isSymmetric
	 */
	public synchronized boolean isSymmetric() {
		return isSymmetric;
	}

	/**
	 * @param isSymmetric the isSymmetric to set
	 */
	public synchronized void setSymmetric(boolean isSymmetric) {
		this.isSymmetric = isSymmetric;
	}

	/**
	* 
	* 
	*/
	public synchronized void checkLeft(TreeNode node) {
		if (!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("checkLeft() producer node = " + node);
		left = node;
		flag = false;
		notify();
	}

	/**
	* 
	* 
	*/
	public synchronized void checkRight(TreeNode node) {
		if (flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("checkRight() consumer  node = " + node);
		if (left == null && right != null)
			isSymmetric = false;
		else if (left != null && right == null)
			isSymmetric = false;
		else if (left == null && right == null) {
			//System.out.println("node is Symmetric it is leaf");
		} else if (left.val == right.val) {
			//	System.out.println("node is Symmetric");
		} else if (left.val != right.val)
			isSymmetric = false;

		right = node;
		flag = true;
		notify();
	}
}

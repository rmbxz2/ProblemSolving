package leetCode;

/**
* Describe class here.
*
*
*
*
*
*/
public class ConsumerTreeNode extends Thread {
	private String name;
	private TreeNode node;
	private TreeData treeData;

	/**
	 * 
	 */
	public ConsumerTreeNode(String name, TreeNode node, TreeData treeData) {
		this.name = name;
		this.node = node;
		this.treeData = treeData;
	}

	@Override
	public void run() {
		Thread.currentThread().setName(name);
		dfsPrint(node);
		System.out.println("Final result isSymmetric tree =" + treeData.isSymmetric());
	}

	/**
	* 
	* 
	*/
	public void dfsPrint(TreeNode node) {
		if (node == null) {
			treeData.checkRight(null);
			return;
		}
		treeData.checkRight(node);
		dfsPrint(node.right);
		dfsPrint(node.left);
	}
}

package leetCode;

/**
* Describe class here.
*
*
*
*
*
*/
public class ProducerTreeNode extends Thread {
	private String name;
	private TreeNode node;
	private TreeData treeData;

	/**
	 * 
	 */
	public ProducerTreeNode(String name, TreeNode node, TreeData treeData) {
		this.name = name;
		this.node = node;
		this.treeData = treeData;
	}

	@Override
	public void run() {
		Thread.currentThread().setName(name);
		dfsPrint(node);
	}

	/**
	* 
	* 
	*/
	public void dfsPrint(TreeNode node) {
		if (node == null) {
			treeData.checkLeft(null);
			return;
		}
		treeData.checkLeft(node);
		dfsPrint(node.left);
		dfsPrint(node.right);
	}
}

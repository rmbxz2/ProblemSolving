package leetCode;

/**
* Describe class here.
*
*
*
*
*
*/
public class Leetcode82SymmetricBTbyThreads {

	/**
	 * 
	 * @param args
	*/
	public static void main(String[] args) {

		// TreeNode node33 = new TreeNode(3, null, null);
		// TreeNode node3 = new TreeNode(3, null, null);
		// TreeNode node22 = new TreeNode(2, null, node33);
		// TreeNode node2 = new TreeNode(2, node3, null);
		// TreeNode node1 = new TreeNode(1, node2, node22);

		//  [1,2,2,null,3,null,3]
		TreeNode node33 = new TreeNode(3, null, null);
		TreeNode node3 = new TreeNode(3, null, null);
		TreeNode node22 = new TreeNode(2, node33, null);
		TreeNode node2 = new TreeNode(2, null, node3);
		TreeNode node1 = new TreeNode(1, node2, node22);

		TreeData treeData = new TreeData();
		ProducerTreeNode producer = new ProducerTreeNode("producerTreeNode", node1, treeData);
		ConsumerTreeNode consumer = new ConsumerTreeNode("ConsumerTreeNode", node1, treeData);
		producer.start();
		consumer.start();
		try {
			consumer.join();
			producer.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//must join to print the correct result of isSymmetric()
		System.out.println("from main Final result isSymmetric tree =" + treeData.isSymmetric());
	}
}

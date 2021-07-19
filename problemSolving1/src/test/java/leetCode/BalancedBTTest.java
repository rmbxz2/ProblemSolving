package leetCode;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
* Describe class here.
*
*
*
*
*
*/
public class BalancedBTTest {

	/**
	*
	*
	*/
	@Test(timeout = 1000)
	public void test1() {
		TreeNode node7 = new TreeNode(7);
		TreeNode node3 = new TreeNode(3);
		TreeNode node5 = new TreeNode(5);
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2, node1, node3);
		TreeNode node6 = new TreeNode(6, node5, node7);
		TreeNode node4 = new TreeNode(4, node2, node6);
		Leetcode81BalancedBT bt = new Leetcode81BalancedBT();
		int counterLevel = bt.printBTlevels(node4);
		assertEquals(2, counterLevel);
		//      4      level = 0
		//   2     6   level = 1
		// 1  3  5  7  level = 2
		//
	}

	/**
	*
	*
	*/
	@Test(timeout = 1000)
	public void test2() {
		TreeNode node3 = new TreeNode(3);
		TreeNode node6 = new TreeNode(6);
		TreeNode node1 = new TreeNode(1, new TreeNode(11), null);
		TreeNode node2 = new TreeNode(2, node1, node3);
		TreeNode node4 = new TreeNode(4, node2, node6);
		Leetcode81BalancedBT bt = new Leetcode81BalancedBT();
		int counterLevel = bt.printBTlevels(node4);
		assertEquals(3, counterLevel);
		//       4    level = 0
		//     2   6  level = 1
		//   1  3     level = 2
		// 11 N       level = 3
		//
	}

	/**
	*
	*
	*/
	@Test(timeout = 1000)
	public void test3() {
		// BFS = [1,2,2,3,null,null,3,4,null,null,4] 
		TreeNode node4 = new TreeNode(4);
		TreeNode node44 = new TreeNode(44);
		TreeNode node33 = new TreeNode(33, null, node44);
		TreeNode node3 = new TreeNode(3, node4, null);
		TreeNode node22 = new TreeNode(22, null, node33);
		TreeNode node2 = new TreeNode(2, node3, null);
		TreeNode node1 = new TreeNode(1, node2, node22);
		Leetcode81BalancedBT bt = new Leetcode81BalancedBT();
		int counterLevel = bt.printBTlevels(node1);
		assertEquals(3, counterLevel);
		//        1         level 0
		//       2 22       level 1
		//      3 N N 33    level 2
		//     4 N    N 44  level 3
		//
	}

	/**
	*
	*
	*/
	@Test(timeout = 1000)
	public void test4() {
		// BFS = [1,2,2,3,null,null,3,4,null,null,4]
		TreeNode node4 = new TreeNode(4);
		TreeNode node44 = new TreeNode(44);
		TreeNode node33 = new TreeNode(33, null, node44);
		TreeNode node3 = new TreeNode(3, node4, null);
		TreeNode node22 = new TreeNode(22, null, node33);
		TreeNode node2 = new TreeNode(2, node3, null);
		TreeNode node1 = new TreeNode(1, node2, node22);
		Leetcode81BalancedBT bt = new Leetcode81BalancedBT();
		boolean result = bt.isBalancedBTbyRecursion(node1);
		assertEquals(false, result);
	}

}

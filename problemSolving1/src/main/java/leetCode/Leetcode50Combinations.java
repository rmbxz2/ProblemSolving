package leetCode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
* Describe class here.
*
*
*
*
*
*/
public class Leetcode50Combinations {
	/**
	* 
	* @param root
	*/
	public void printFullCombinationTree(TreeComb root) {
		System.out.println("========== print full Tree by DFS method in TreeComb ============");
		root.printFullTree();
	}

	/**
	* n=4 {1,2,3,4}
	* k=2 
	*    [1,1]x
	*[1,2]
	*[1,3]
	*[1,4]
	*  [2,1]d
	*  [2,2]x
	*[2,3]
	*[2,4]
	*  [3,1]d
	*  [3,2]d
	*  [3,3]x
	*[3,4]
	*  [4,1]d
	*  [4,2]d
	*  [4,3]d
	*  [4,4]x
	*/
	TreeComb root = null;

	public List<List<Integer>> combinations(int n, int k) {
		int[] nums = new int[n];
		for (int x = 0, i = 1; x < n; x++, i++)
			nums[x] = i;

		List<List<Integer>> result = new ArrayList<>(); //correct  since java 1.7
		List<Integer> listOfInt = new ArrayList<Integer>(k);
		root = new TreeComb(listOfInt, 0);
		Deque<TreeComb> stack = new ArrayDeque<>(); // faster than stack
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeComb node = stack.pop(); // DFS by pre-order
			System.out.println(node.toString());
			while ((node.getListOfInt().size() < k) && (node.getFromIndex() <= nums.length - 1)) {
				TreeComb child = new TreeComb(node.getListOfInt(), node.getFromIndex());
				child.getListOfInt().add(nums[node.getFromIndex()]);
				//				if (child.getSumOfListOfInt() <= target) { // works correct  without this condition
				node.getListOfTree().add(child);
				//stack.push(child);
				//				}
				node.setFromIndex(node.getFromIndex() + 1);
			}
			if (!node.getListOfTree().isEmpty()) { // add children to stack reversed without change the children sort
				node.getListOfTree().stream() // Stream
						.collect(Collectors.toCollection(LinkedList::new)) // LinkedList
						.descendingIterator() // Iterator
						.forEachRemaining(stack::push);

				// for (TreeComb element : node.getListOfTree()) { // above same as below but it is changet the children sort
				// 	stack.push(element);
				// }
			}
			if (node.getListOfInt().size() == k && node.passListNoDuplicateElements())
				result.add(node.getListOfInt());

			// if (node.getSumOfListOfInt() == target) {
			// 	result.add(node.getListOfInt());
			// 	System.out.println("node == target " + node.getListOfInt().toString());
			// }
			// if (node.getSumOfListOfInt() > target) {
			// 	// remove above condition  (child.getSumOfListOfInt() <= target)
			// 	// then uncomment these lines
			// 	// System.out.println("node >  target " + node.getListOfInt().toString());
			// }
		} // end of if
			//Collections.reverse(result); // result = [[2, 2, 2, 2], [2, 3, 3], [3, 5]]
		return result;
	}

	/**
	* 
	* 
	*/
	List<List<Integer>> results;

	public List<List<Integer>> combine(int n, int k) {
		results = new ArrayList<List<Integer>>();

		recurse(new ArrayList<Integer>(), 1, n, k);
		return results;
	}

	/**
	* 
	* @param intList
	* @param curr
	* @param n
	* @param k
	*/
	public void recurse(List<Integer> intList, int curr, int n, int k) {
		if (k == intList.size()) {
			results.add(new ArrayList<>(intList));
			return;
		}

		// 1 2 3 4 5 6
		for (int i = curr; i < n + 1; i++) {
			if (k - intList.size() <= n - i + 1) {
				intList.add(i);
				System.out.println(intList);
				recurse(intList, i + 1, n, k);
				intList.remove(intList.size() - 1);
			}
		}
	}

	/**
	 * 
	 * @param args
	*/
	public static void main(String[] args) {
		Leetcode50Combinations comb = new Leetcode50Combinations();
		int n = 5;
		int k = 4;

		List<List<Integer>> result = comb.combinations(n, k);
		System.out.println("========== print result  ================ ");
		System.out.println("result = " + result.toString());

		System.out.println("========== print full tree ================ ");
		comb.printFullCombinationTree(comb.root);
		System.out.println("the End");

		System.out.println("========== print results by recursion ================ ");
		System.out.println("results" + comb.combine(n, k));
	}
}

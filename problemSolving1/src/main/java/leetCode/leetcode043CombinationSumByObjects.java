package leetCode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
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
public class leetcode043CombinationSumByObjects {

	public void printCombinationTree(TreeSum root) {
		System.out.println("========== print full Tree by DFS method in TreeSum ============");
		root.printFullTree();
	}

	/**
	*
	*
	*/
	TreeSum root = null;

	public List<List<Integer>> createCombinationTree(int[] xnums, int target) {
		//		List<List<Integer>> result = new ArrayList<ArrayList<Integer>>(); // wrong because generic type is not caveriant 
		//		List<List<Integer>> result = new ArrayList<List<Integer>>(); // correct
		List<List<Integer>> result = new ArrayList<>(); //correct  since java 1.7
		List<Integer> listOfInt = new ArrayList<Integer>();
		TreeSum parent = null;
		int[] nums = xnums;
		root = new TreeSum(0, nums, parent, listOfInt);
		//Stack<TreeSum> stack = new Stack<TreeSum>();
		Deque<TreeSum> stack = new ArrayDeque<>(); // faster than stack
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeSum node = stack.pop(); // DFS by pre-order 
			while ((node.getSumOfListOfInt() < target) && (node.getFromIndex() <= nums.length - 1)) {
				TreeSum child = new TreeSum(node.getFromIndex(), nums, node, node.getListOfInt());
				child.getListOfInt().add(nums[node.getFromIndex()]);
				if (child.getSumOfListOfInt() <= target) { // works correct  without this condition
					node.getListOfTree().add(child);
				}
				node.setFromIndex(node.getFromIndex() + 1);
			}
			if (!node.getListOfTree().isEmpty()) { // add children to stack reversed without change the children sort
				node.getListOfTree().stream() // Stream
						.collect(Collectors.toCollection(LinkedList::new)) // LinkedList
						.descendingIterator() // Iterator
						.forEachRemaining(stack::push);

				// for (TreeSum element : node.getListOfTree()) { // above same as below but it is changet the children sort
				// 	stack.push(element);
				// }
			}
			if (node.getSumOfListOfInt() == target) {
				result.add(node.getListOfInt());
				System.out.println("node == target " + node.getListOfInt().toString());
			}
			if (node.getSumOfListOfInt() > target) {
				// remove above condition  (child.getSumOfListOfInt() <= target)
				// then uncomment these lines
				// System.out.println("node >  target " + node.getListOfInt().toString());
			}
		} // end of if
			//Collections.reverse(result); // result = [[2, 2, 2, 2], [2, 3, 3], [3, 5]]

		//return min list size from list of list 

		System.out.println("min list size from list of list = "
				   +Collections.min(result, (list1, list2) -> ((Integer.valueOf(list1.size())).compareTo(Integer.valueOf(list2.size())))));



		// return sorted list of list by size
		Collections.sort(result, (list1, list2) -> ((Integer.valueOf(list1.size())).compareTo(list2.size())));
		return result;
	}

	/**
	 * 
	 * @param args
	*/
	public static void main(String[] args) {
		int[] nums = { 1, 2, 5 };
		int target = 11;

		leetcode043CombinationSumByObjects combination = new leetcode043CombinationSumByObjects();
		List<List<Integer>> result = combination.createCombinationTree(nums, target);
		System.out.println("========= print from main ========");
		System.out.println("result = " + result.toString());
		System.out.println("========= print from main ========");
		combination.printCombinationTree(combination.root);
	}

}

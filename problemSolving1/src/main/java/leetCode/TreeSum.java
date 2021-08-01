package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
* Describe class here.
*
*
*
*
*
*/
public class TreeSum {
	private List<Integer> listOfInt;
	private List<TreeSum> listOfTree;
	private TreeSum parent;
	private int[] nums;
	private int fromIndex;

	/**
	 * @param listOfInt
	 * @param listOfList
	 */
	public TreeSum(int fromIndex, int[] nums, TreeSum parent, List<Integer> parentListOfInt) {
		this.listOfInt = new ArrayList<>(parentListOfInt);
		this.listOfTree = new ArrayList<>();
		this.parent = parent;
		this.nums = nums;
		this.fromIndex = fromIndex;
	}

	/**
	 * @return the nums
	 */
	public int[] getNums() {
		return nums;
	}

	/**
	 * @param nums the nums to set
	 */
	public void setNums(int[] nums) {
		this.nums = nums;
	}

	/**
	 * @return the fromIndex
	 */
	public int getFromIndex() {
		return fromIndex;
	}

	/**
	 * @param fromIndex the fromIndex to set
	 */
	public void setFromIndex(int fromIndex) {
		this.fromIndex = fromIndex;
	}

	/**
	 * @return the listOfInt
	 */
	public List<Integer> getListOfInt() {
		return listOfInt;
	}

	/**
	 * @param listOfInt the listOfInt to set
	 */
	public void setListOfInt(List<Integer> listOfInt) {
		this.listOfInt = listOfInt;
	}

	/**
	 * @return the listOfTree
	 */
	public List<TreeSum> getListOfTree() {
		return listOfTree;
	}

	/**
	 * @param listOfTree the listOfTree to set
	 */
	public void setListOfTree(List<TreeSum> listOfTree) {
		this.listOfTree = listOfTree;
	}

	/**
	 * @return the parent
	 */
	public TreeSum getParent() {
		return parent;
	}

	/**
	 * @param parent the parent to set
	 */
	public void setParent(TreeSum parent) {
		this.parent = parent;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + fromIndex;
		result = prime * result + ((listOfInt == null) ? 0 : listOfInt.hashCode());
		result = prime * result + ((listOfTree == null) ? 0 : listOfTree.hashCode());
		result = prime * result + Arrays.hashCode(nums);
		result = prime * result + ((parent == null) ? 0 : parent.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TreeSum other = (TreeSum) obj;
		if (fromIndex != other.fromIndex)
			return false;
		if (listOfInt == null) {
			if (other.listOfInt != null)
				return false;
		} else if (!listOfInt.equals(other.listOfInt))
			return false;
		if (listOfTree == null) {
			if (other.listOfTree != null)
				return false;
		} else if (!listOfTree.equals(other.listOfTree))
			return false;
		if (!Arrays.equals(nums, other.nums))
			return false;
		if (parent == null) {
			if (other.parent != null)
				return false;
		} else if (!parent.equals(other.parent))
			return false;
		return true;
	}

	/**
	 * @return the nums
	 */
	public int getSumOfListOfInt() {
		int sum = 0;
		for (Integer element : listOfInt) {
			sum += element;
		}
		return sum;
	}

	@Override
	public String toString() {
		return "" + listOfInt.toString();
	}

	/*
	 * DFS (depth first search)
	 * 
	 * 
	 */
	public void printFullTree() {
		System.out.println(listOfInt.toString()); // DFS as pre-order   trunk : branch1 : leaf1 : leaf2 : branch2 : branch4 : branch3 : leaf4 : leaf5 : leaf6 : 
		for (TreeSum child : listOfTree) { // children.forEach(Root::display); // or in java8
			child.printFullTree();
		}
	}

}

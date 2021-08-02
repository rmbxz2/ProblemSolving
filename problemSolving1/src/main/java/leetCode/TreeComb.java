package leetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
* Describe class here.
*
*
*
*
*
*/
public class TreeComb {
	private List<Integer> listOfInt;
	private List<TreeComb> listOfTree;
	private int fromIndex;

	/**
	 * @param listOfInt
	 * @param listOfTree
	 * @param fromIndex
	 */
	public TreeComb(List<Integer> parentListOfInt, int fromIndex) {
		this.listOfInt = new ArrayList<>(parentListOfInt);
		this.listOfTree = new ArrayList<>();
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
	public List<TreeComb> getListOfTree() {
		return listOfTree;
	}

	/**
	 * @param listOfTree the listOfTree to set
	 */
	public void setListOfTree(List<TreeComb> listOfTree) {
		this.listOfTree = listOfTree;
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
		return result;
	}

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
		TreeComb other = (TreeComb) obj;
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
		return true;
	}

	@Override
	public String toString() {
		return "" + listOfInt.toString();
	}

	/**
	* 
	* 
	*/
	public void printFullTree() {
		System.out.println(listOfInt.toString()); // DFS as pre-order   trunk : branch1 : leaf1 : leaf2 : branch2 : branch4 : branch3 : leaf4 : leaf5 : leaf6 : 
		for (TreeComb child : listOfTree) { // children.forEach(Root::display); // or in java8
			child.printFullTree();
		}
	}

	/**
	* 
	* @return
	*/
	public boolean passListNoDuplicateElements() {
		// check if arrayList have duplicate elements
		Set<Integer> set = new HashSet<Integer>(listOfInt);
		if (set.size() < listOfInt.size())
			return false;

		return true;
	}
}

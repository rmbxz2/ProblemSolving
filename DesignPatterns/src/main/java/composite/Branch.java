package composite;

import java.util.ArrayList;

public class Branch extends Root {
	private String name;
	private ArrayList<Root> children = new ArrayList<Root>();

	/**
	 * @param name
	 */
    public Branch(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see composite.Root#add(composite.Root)
	 */
	public void add(Root root) {
		children.add(root);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see composite.Root#remove(composite.Root)
	 */
	public void remove(Root root) {
		children.remove(root);
	}

	/**
	 * @param root
	 * @return
	 */
	public Root getChild(String name) {
		Root child = new Branch(name);
		Root result = null;
		// 1-first way to find element in arraylist by equals
		// for (Root root : children)
		// 	if (root.equals(child))
		// 		result = root;

		// 2-second way to find element in arraylist by equlas
		//result = children.get(children.indexOf(child));

		// 3-third way to check if  element exisit in arraylist by equals  O(n^2)
		//if (children.contains(child))
		//	result = children.get(children.indexOf(child));

		// 3-third way to find  arraylist by equals
		int index = -1;
		if ((index = children.indexOf(child)) != -1)
			result = children.get(index);

		// 4-fourth way find elemnt by stream API
		// result = children.stream().filter(tempRoot -> tempRoot.equals(child)).findAny().orElse(null);

		return result;
	}

	/**
	*
	*
	*/
	public ArrayList<Root> getAllChildren() {
		return children;
	}

	/*
	 * DFS (depth first search)
	 * 
	 * 
	 */
	@Override
	public void display() {
		System.out.print(name + " : "); // DFS as pre-order   trunk : branch1 : leaf1 : leaf2 : branch2 : branch4 : branch3 : leaf4 : leaf5 : leaf6 : 
		for (Root root : children) { // children.forEach(Root::display); // or in java8
			root.display();
		}
		// System.out.print(name + " : "); // DFS as post-order  leaf1 : leaf2 : branch1 : leaf4 : leaf5 : leaf6 : branch3 : branch4 : branch2 : trunk : 
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see composite.Root#getName()
	 */
	public String getName() {
		return this.name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

	@Override
	public String toString() {
		return " " + name;
	}
}

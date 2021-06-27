package composite;

import java.util.ArrayList;

public abstract class Root {
	public void add(Root root) {

	}

	public void remove(Root root) {

	}

	public Root getChild(String name) {
		return null;
	}

	public String getName() {
		return null;
	}

 	public abstract void display();

	public ArrayList<Root> getAllChildren() {
 		return null;
	}

	/**
	 * @param root1
	 * @return
	 */
	
	public boolean equals(Object root) {
		boolean result = false;
		if ((root != null) && (root instanceof Root)) {
			Root newRoot = (Root) root;
			if (this.getName()==(newRoot.getName()))
				result = true;
			return result;
		}
		return result;
		// return (this.getName() == root.getName() ? true : false);
	}
}

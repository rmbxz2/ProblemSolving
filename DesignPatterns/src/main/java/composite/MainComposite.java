package composite;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
 * @startuml image1.png
 *   ' !include compositeClass.html
 *     !include compositeObject.html
 * @enduml
 */

public class MainComposite {
    // Hi
  	public static void main(String[] args) {

		//		Root leaf1 = new Leaf("leaf1");
		//		Root leaf2 = new Leaf("leaf2");
		//		Root leaf3 = new Leaf("leaf3");
		//		Root leaf4 = new Leaf("leaf4");
		//		Root leaf5 = new Leaf("leaf5");
		//		Root leaf6 = new Leaf("leaf6");

		Root bleaf1 = new Branch("bleaf1");
		Root bleaf2 = new Branch("bleaf2");
		Root bleaf3 = new Branch("bleaf3");
		Root bleaf4 = new Branch("bleaf4");
		Root bleaf5 = new Branch("bleaf5");
		Root bleaf6 = new Branch("bleaf6");

		Root branch1 = new Branch("branch1");
		Root branch2 = new Branch("branch2");
		Root branch3 = new Branch("branch3");
		Root branch4 = new Branch("branch4");
		Root trunk = new Branch("trunk");

		//		branch1.add(leaf1);
		//		branch1.add(leaf2);

		branch1.add(bleaf1);
		branch1.add(bleaf2);

		branch2.add(branch4);
		branch4.add(branch3);

		//		branch3.add(leaf4);
		//		branch3.add(leaf5);
		//		branch3.add(leaf6);

		branch3.add(bleaf4);
		branch3.add(bleaf5);
		branch3.add(bleaf6);

		trunk.add(branch1);
		trunk.add(branch2);

		// Root branch22 = trunk.getChild("branch 2");
		// Root branch22 = trunk.getChild("branch 2");
		// System.out.println("branch222= " + branch22.getName());
		System.out.println("print as DFS");
		trunk.display(); // DFS(depth first search)
		//DFS as pre-order  trunk : branch1 : leaf1 : leaf2 : branch2 : branch4 : branch3 : leaf4 : leaf5 : leaf6 : 
		//DFS as post-order leaf1 : leaf2 : branch1 : leaf4 : leaf5 : leaf6 : branch3 : branch4 : branch2 : trunk : 

		System.out.println("\n==========");

		// BFS (breadth first search)
		System.out.println("print as BFS");
		Queue<Root> queue = new LinkedList<Root>();
		queue.offer(trunk);
		System.out.println(trunk);

		while (!queue.isEmpty()) {
			Root x = queue.poll();
			ArrayList<Root> allChildren = x.getAllChildren();
			if (allChildren != null) {
				for (Root root : allChildren) {
					System.out.println(root);
					queue.offer(root);
					//System.out.println(queue);
				}
			}
		}
		System.out.println("==== get Child ====");
		//Root oldRoot = new Branch("trunk");
		Root newRoot = trunk.getChild("branch1");
		//		System.out.println("branch1 children = "+ newRoot.getAllChildren());
		System.out.println("branch1 children = "+ newRoot.getAllChildren());
	}
}

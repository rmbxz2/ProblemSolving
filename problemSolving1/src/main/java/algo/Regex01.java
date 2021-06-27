package algo;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.regex.Pattern;

/**
* Describe class here.
*
*
*
*
*
*/
public class Regex01 {
	public static void main(String[] args) {

		boolean b3 = Pattern.matches(".s", "as");
		System.out.println("pattern " + b3);


		TreeSet<Integer> treeSet = new TreeSet<Integer>();

		System.out.println(treeSet.add(123));
		System.out.println(treeSet.add(23));
		System.out.println(treeSet.add(23));
		System.out.println(treeSet.add(2));
		System.out.println(treeSet.add(12));

	
		System.out.println("set = " + treeSet);
		System.out.println("set = " + treeSet.descendingSet());
		System.out.println("set = " + treeSet.headSet(23));
		System.out.println("set = " + treeSet.tailSet(23));
		

		Iterator<Integer> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("===================");
		Iterator<Integer> iterator2 = treeSet.descendingIterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
	}
}

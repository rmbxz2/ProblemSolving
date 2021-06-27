package leetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
* Describe class here.
*
*
*
*
*
*/
public class HashCodeSetMap {
	/**
	 * 
	 * 
	*/
	public static void main(String[] args) {
		int[] names = { 1, 2, 2, 2 };
		System.out.println("========= set ===============");
		Set<MyInteger> set = new HashSet<>();
		System.out.println("0 = " + set.add(new MyInteger(names[0])));
		System.out.println("1 = " + set.add(new MyInteger(names[1])));
		System.out.println("2 = " + set.add(new MyInteger(names[2])));
		System.out.println("3 = " + set.add(new MyInteger(names[3])));
		System.out.println(set);
		System.out.println(set.size());
		System.out.println("set contains 2 =" + set.contains(new MyInteger(names[2])));
		System.out.println("========== set2 ==============");
		Set<Integer> set2 = new HashSet<>();
		System.out.println("0 = " + set2.add((names[0])));
		System.out.println("1 = " + set2.add((names[1])));
		System.out.println("2 = " + set2.add((names[2])));
		System.out.println("3 = " + set2.add((names[3])));
		System.out.println(set2);
		System.out.println(set2.size());
		System.out.println("=========== set3  =============");
		Set<String> set3 = new HashSet<>();
		System.out.println("0 = " + set3.add("" + (names[0])));
		System.out.println("1 = " + set3.add("" + (names[1])));
		System.out.println("2 = " + set3.add("" + (names[2])));
		System.out.println("3 = " + set3.add("" + (names[3])));
		System.out.println(set3);
		System.out.println(set3.size());
		System.out.println("=========== map  =============");
		Map<MyInteger, MyInteger> map = new HashMap<>();
		System.out.println("1 = " + map.put(new MyInteger(1), new MyInteger(11)));
		System.out.println("2 = " + map.put(new MyInteger(2), new MyInteger(22)));
		System.out.println("3 = " + map.put(new MyInteger(3), new MyInteger(33)));
		System.out.println("4 = " + map.put(new MyInteger(4), new MyInteger(44)));
		System.out.println("5 = " + map.put(new MyInteger(5), new MyInteger(55)));
		System.out.println("6 = " + map.put(new MyInteger(6), new MyInteger(66)));
		System.out.println(map);
		System.out.println(map.size());
		System.out.println("map.get 2  value =>  " + map.get((new MyInteger(2))));
		System.out.println("map.get 4  value =>  " + map.get((new MyInteger(4))));
		System.out.println("map.get 6  value =>  " + map.get((new MyInteger(6))));

		/////////////
		int n = 100;
		int x = 10;
		int y = 1;

		long bb = (int) Math.round((n * x * y) / (float) (x + y));
		long cc = (int) Math.floor((n * x * y) / (float) (x + y));
		if (n == (bb / x) + (bb / y))
			System.out.println(bb);
		if (n == (cc / x) + (cc / y))
			System.out.println(cc);
		/////////
	}
}

class MyInteger {
	int x;

	MyInteger(int x) {
		this.x = x;
	}

	@Override
	public int hashCode() {
		return ((x % 2)); // table has  2 bucket only
	}

	@Override
	public boolean equals(Object obj) {
		if (this.x % 2 == ((MyInteger) obj).x % 2) // no duplicate keys, checks by equals 
			return true; // but but but when same keys it  override the value
		return false;
	}

	@Override
	public String toString() {
		return " " + x;
	}

}

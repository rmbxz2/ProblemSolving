package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
* Longest Consecutive SequenceJava page 47
*
*
*
*
*
*/
public class LongestConsecutiveSequenceJava47 {
	/**
	 * 
	 * 
	*/
	public static void main(String[] args) {
		//		String[][] phones = { { "Apple", "iPhone" }, { "Samsung", "Galaxy" }, { "Sony", "Xperia" } };
		//		System.out.println(Arrays.deepToString(phones)); // print 2d array very fast
		int[] array = { 8, 7, 5, 0, 2, 1, 3, 4, 9 };
		System.out.println("\n=======solution 1========");
		longestConsecutiveSequenceSolution1(array);
		System.out.println("\n=======solution 2========");
		System.out.println("Max longest sequenct is = " + longestConsecutiveSequenceSolution2(array));
		//		System.out.println(Arrays.toString(array)); // print 1d array very fast
		System.out.println("\n=======solution 3========");
		System.out.println("Max longest sequenct is = " + longestConsecutiveSequenceSolution3(array));
	}

	/**
	*   
	*   my solution, with all sequence arrays
	*   
	*/
	public static int longestConsecutiveSequenceSolution3(int[] num) {
		if (num.length == 0) {
			return 0;
		}
		Set<Integer> set = new HashSet<>();
		int max = 1;
		for (int e : num) {
			set.add(e);
		}
		for (int e : num) {
			int left = e - 1;
			int right = e + 1;
			int count = 1;
			ArrayList<Integer> arrayList = new ArrayList<>();
			arrayList.add(e);
			while (set.contains(left)) {
				arrayList.add(left);
				set.remove(left);
				left--;
				count++;
			}
			while (set.contains(right)) {
				arrayList.add(right);
				set.remove(right);
				right++;
				count++;
			}
			Collections.sort(arrayList);
			System.out.println(arrayList);
			max = Integer.max(max, count);
		} //for end
		return max;
	}

	/**
	 *  my solution
	 * 
	*/
	public static void longestConsecutiveSequenceSolution1(int[] array) {
		Arrays.sort(array);
		int[] fromArray = new int[array.length];
		int toArray = 0;
		boolean isSqeuence = false;
		for (int index = 0, i = 0; index < array.length; index++) {
			if ((index < array.length - 1) && array[index] + 1 == array[index + 1]) {
				fromArray[i++] = index;
				toArray = index + 1;
			}
		}
		System.out.print("longest array = ");
		for (int index = fromArray[0]; index <= toArray; index++) {
			System.out.print(array[index] + ",");
		}
		System.out.print("\n from array contains = ");
		for (int i : fromArray) {
			System.out.print(i + ",");
		}
	}

	/**
	*   leetcode solution page 47
	*   O(n) complexity 
	*   hashset take O(1) for add remove and contains methods have constant time complexity 
	*
	*/
	public static int longestConsecutiveSequenceSolution2(int[] num) {
		// return 0 if empty array
		if (num.length == 0) {
			return 0;
		}

		Set<Integer> set = new HashSet<Integer>();
		int max = 1;
		for (int e : num) {
			set.add(e);
		}

		for (int e : num) {
			int left = e - 1;
			int right = e + 1;
			int count = 1;

			while (set.contains(left)) {
				count++;
				set.remove(left);
				left--;
			}
			while (set.contains(right)) {
				count++;
				set.remove(right);
				right++;
			}
			max = Integer.max(max, count);
		} // end for
		return max;
	}
}

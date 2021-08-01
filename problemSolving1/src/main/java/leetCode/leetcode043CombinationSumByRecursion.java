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
public class leetcode043CombinationSumByRecursion {

	/**
	* candidates [2,3,6,7]
	* target = 7
	* output = [2,2,3] [7]
	* 
	*/
	public void combinationByDynamicProgramming(int[] num, int target) {
		Arrays.sort(num);
		List<Integer> list = new ArrayList<>();
		combination(num, target, list, num.length - 1, 0, 0);
	}

	/**
	*
	*
	*/
	int state = 1;
	int backIndex = 0;

	public void combination(int[] num, int target, List<Integer> list, int arrayLength, int sum, int fromIndex) {

		if (sum > target && state == 1) {
			state = -1;
			list.remove(list.size()-1);
			return;

		}

		if (backIndex == arrayLength) {
			state = -2;
			list.remove(list.size()-1);
			return;
		}

		if (sum < target && state == 1) {
			list.add(num[fromIndex]);
			combination(num, target, list, arrayLength, sumMethod(list), fromIndex); // [2,2,2,2]
		}

		if (sum == target) {
			System.out.println("\n list = " + list.toString());
			state = 0;
			list.remove(list.size()-1);
			backIndex = fromIndex;
			backIndex++;
			return;
		}

		if (sum < target && state == 0) {
			state = 1;
			fromIndex = backIndex;
			combination(num, target, list, arrayLength, sumMethod(list), fromIndex++); // [2,2,2]
		}

		if (state == -1) {
			backIndex = fromIndex;
			state = -2;
			list.remove(list.size()-1);
			return;
		}

		if (state == -2) {
			fromIndex = backIndex;
			state = 1;
			combination(num, target, list, arrayLength, sumMethod(list), fromIndex++); // [2,2,2]
		}
	}

	/**
	*
	*
	*/
	public int sumMethod(List<Integer> list) {
		int sum = 0;
		for (Integer number : list) {
			sum += number;
		}
		return sum;
	}

	/**
	 * 
	 * @param args
	*/
	public static void main(String[] args) {
		int[] num = { 2, 3, 5 };
		int target = 8;
		leetcode043CombinationSumByRecursion comaCombinationSum = new leetcode043CombinationSumByRecursion();
		comaCombinationSum.combinationByDynamicProgramming(num, target);

	}
}

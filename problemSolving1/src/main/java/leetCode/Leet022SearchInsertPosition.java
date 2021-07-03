package leetCode;

import java.util.Arrays;

/**
* Describe class here.
* https://leetcode.com/problems/search-insert-position/
* leetcode in mybook number  22
* leetcode in website number 35
* see image problemSolving1/src/main/java/images/leetcode_22.ora
*
*
*/
public class Leet022SearchInsertPosition {

	/**
	*
	*
	*/
	public int searchInsert2(int[] nums, int target) {
		int low = Arrays.binarySearch(nums, target);
		if (low < 0)
			low = (-1 * low) - 1;
		return low;
	}

	/**
	*
	*
	*/
	public int searchInsert3(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;
		int mid = -985558;
		while (low <= high) {
			mid = (low + high) >>> 1; // my divide x / pow(2,1) 
			int midVal = nums[mid];

			if (midVal < target)
				low = mid + 1;
			else if (midVal > target)
				high = mid - 1;
			else
				return mid; // key found
		}
		return low;

		//		if (high < mid)
		//			return mid; // key not found.
		//		return mid + 1;

		//		return high + 1;

		//		if (low == mid)
		//			return mid; // key not found.
		//		if (high == mid)
		//			return low;
		//		return 12345;

		//		if (high == -1)
		//			return mid; // key not found.
		//		if (low == nums.length)
		//			return nums.length;
		//		return 12345;

	}

	/**
	 * 
	 * @param nums
	 * @param target
	 * @return
	*/
	public int searchInsert4(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;
		int mid = -1;
		while (low <= high) {
			mid = (low + high) / 2; // x/2 must positive
			if (target > nums[mid])
				low = mid + 1;
			else if (target < nums[mid])
				high = mid - 1;
			else if (target == nums[mid])
				return mid;
		}
		return low;
	}

	/**
	 * 
	 * @param nums
	 * @param target
	 * @return
	*/
	public int searchInsert5(int[] nums, int target) {

		return searchByRecursion(nums, target, 0, nums.length - 1, (0 + nums.length - 1) / 2);
	}

	/**
	 * cal_3 =          ml h
	 * cal_2 =       m  l  h
	 * cal_1 = l     m     h
	 * array = 3 ,5 ,7 ,9 ,11
	 * index = 0 ,1 ,2 ,3 ,4
	 * 
	 * target = 9
	 * 
	*/
	public int searchByRecursion(int[] nums, int target, int low, int high, int mid) {
		if (high < low) {
			return low;
		}

		int result = -1;
		if (target > nums[mid]) {
			low = mid + 1;
			mid = (low + high) / 2;
			result = searchByRecursion(nums, target, low, high, mid);

		} else if (target < nums[mid]) {
			high = mid - 1;
			mid = (low + high) / 2;
			result = searchByRecursion(nums, target, low, high, mid);

		} else if (target == nums[mid]) {
			return mid;
		}
		return result;
	}

	/**
	 * 
	 * @param args
	*/
	public static void main(String[] args) {

		//System.out.println(-8 >>> 1); //   -8 * pow(2,1)
		Leet022SearchInsertPosition t1 = new Leet022SearchInsertPosition();

		//    index =  0  1  2  3  4  
		int[] nums = { 2, 4, 5, 7, 9 };
		//		int[] nums = { 1, 3, 5, 6, 8 };
		System.out.println("index = " + t1.searchInsert4(nums, 3));
		//System.out.println("index = " + t1.searchInsert4(nums, 2));
	}
}
// T 2

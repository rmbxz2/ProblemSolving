package leetCode;

import java.util.Arrays;

/**
* Describe class here.
*
*
*
*
*
*/
public class Leet022SearchInsertPosition {

	/**
	*
	*
	*/
	public static int searchInsert2(int[] nums, int target) {
		int result = java.util.Arrays.binarySearch(nums, target);
		if (result == -1)
			result = 0;
		if (result < 0)
			result = -(result) - 1;
		return result;
	}

	/**
	*
	*
	*/
	public int searchInsert3(int[] nums, int target) {

		int low = 0;
		int high = nums.length - 1;

		while (low <= high) {
			int mid = (low + high) >>> 1; // divide x / pow(2,1) ;;
			int midVal = nums[mid];

			if (midVal < target)
				low = mid + 1;
			else if (midVal > target)
				high = mid - 1;
			else
				return mid; // key found
		}
		return low; // key not found.
	}

	/**
	 * 
	 * @param args
	*/
	public static void main(String[] args) {

		int[] nums = { 1, 3, 5, 7, 9 };
		Leet022SearchInsertPosition t1 = new Leet022SearchInsertPosition();
		System.out.println("==========");
   		System.out.println(t1.searchInsert3(nums, 11));

		//
		//		System.out.println(searchInsert2(nums, 0));
		//		System.out.println(searchInsert2(nums, 1));
		//		System.out.println(searchInsert2(nums, 6));

		//		System.out.println("-1 ==> "+ searchInsert2(nums, -1));
		//		System.out.println("0 ==> "+ searchInsert2(nums, 0));
		//		System.out.println("1 ==> "+ searchInsert2(nums, 1));
		//		System.out.println("2 ==> "+ searchInsert2(nums, 2));
		//		System.out.println("3 ==> "+ searchInsert2(nums, 3));
		//		System.out.println("4 ==> "+ searchInsert2(nums, 4));
		//		System.out.println("5 ==> "+ searchInsert2(nums, 5));
		//		System.out.println("6 ==> "+ searchInsert2(nums, 6));
		//		System.out.println("7 ==> "+ searchInsert2(nums, 7));
		//		System.out.println("8 ==> "+ searchInsert2(nums, 8));
		//		System.out.println("9 ==> "+ searchInsert2(nums, 9));
		//		System.out.println("10 ==> "+ searchInsert2(nums, 10));
		//		System.out.println("11 ==> "+ searchInsert2(nums, 11));
		//		System.out.println("11 ==> "+ searchInsert2(nums, 12));
	}
}

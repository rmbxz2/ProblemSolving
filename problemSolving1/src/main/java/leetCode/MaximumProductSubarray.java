package leetCode;

/**
* Maximum Product Subarray leetcode 152
* My Submissions Question
* Total Accepted: 46331 Total Submissions: 223319 Difficulty: Medium
* Find the contiguous subarray within an array (containing at least one number) 
* which has the largest product.
* 
* For example, given the array [2,3,-2,4],
* the contiguous subarray [2,3] has the largest product = 6..
*/
public class MaximumProductSubarray {
	/**
	 * 
	 * 
	*/
	public int maxProduct(int[] nums) {

		if (nums == null || nums.length <= 0) {
			return 0;
		}

		int n = nums.length;
		int result = nums[0];
		int min = nums[0];
		int max = nums[0];

		for (int i = 1; i < n; i++) {

			int temp = max;
			max = Math.max(max * nums[i], Math.max(min * nums[i], nums[i]));
			min = Math.min(temp * nums[i], Math.min(min * nums[i], nums[i]));
			result = Math.max(max, result);
		}

		return result;
	}

	/**
	 * 
	 * 
	*/
	public static void main(String[] args) {
		int[] nums = { 2, 3, -2, 4, -1 };
		MaximumProductSubarray mps = new MaximumProductSubarray();
		System.out.println(mps.maxProduct(nums));
	}
}

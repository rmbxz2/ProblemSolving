package leetCode;

import java.util.Arrays;

/**
* Merge Sorted Array page 18
*
*
*
*
*
*/
public class MergeSortedArray18 {

	/**
	*   leetcode solution page 40
	*
	*/
	public static void merge(int[] A, int m, int[] B, int n, int[] C, int k) {

		while (m > 0 && n > 0) {
			if (A[m - 1] > B[n - 1]) {
				C[k - 1] = A[m - 1];
				m--;
				k--;
			} else {
				C[k - 1] = B[n - 1];
				n--;
				k--;
			}
		}
		while (n > 0) {
			C[k - 1] = B[n - 1];
			n--;
			k--;
		}
		while (m > 0) {
			C[k - 1] = A[m - 1];
			m--;
			k--;
		}
	}

	/**
	 * 
	 * @param args
	*/
	public static void main(String[] args) {

		int[] A = { 1, 3, 5, 7, 9 };
		int[] B = { 2, 4, 6, 8, 10, 11, 12 };
		int[] C = new int[A.length + B.length];
		merge(A, A.length, B, B.length, C, A.length + B.length);

		for (int i : C) {
			System.out.println(i);
		}

		System.out.println("=========== second solution ==================");
		System.arraycopy(A, 0, C, 0, A.length);
		System.arraycopy(B, 0, C, A.length, B.length);
		Arrays.sort(C);

		for (int i : C) {
			System.out.println(i);
		}
	}
}

package leetCode;

import java.util.Iterator;
import java.util.Stack;

/**
* Describe class here.
*
*
*
*
*
*/
public class leetcode026Search2Dmatrix {

	public boolean searchMatrix(int[][] matrix, int target) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
			return false;

		int M = matrix.length;
		int N = matrix[0].length;
		System.out.println("M =" + M);
		System.out.println("N =" + N);

		int low = 0;
		int high = N * M - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			int midx = mid / N;
			int midy = mid % N;

			if (target > matrix[midx][midy])
				low = mid + 1;
			else if (target < matrix[midx][midy])
				high = mid - 1;
			else if (target == matrix[midx][midy])
				return true;
		}
		return false;
	}

	/**
	 * 
	 * @param matrix
	 * @param target
	 * @return
	*/
	public int searchMatrix2(int[][] matrix, int target) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
			return -1;

		int M = matrix.length;
		int N = matrix[0].length;
		System.out.println("M =" + M);
		System.out.println("N =" + N);

		int low = 0;
		int high = N * M - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			int midx = mid / N;
			int midy = mid % N;

			if (target > matrix[midx][midy])
				low = mid + 1;
			else if (target < matrix[midx][midy])
				high = mid - 1;
			else if (target == matrix[midx][midy])
				return mid;
		}
		return -1;
	}

	/**
	 * 
	 * @param args
	*/
	public static void main(String[] args) {
		int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };

		leetcode026Search2Dmatrix leetcode026Search2Dmatrix = new leetcode026Search2Dmatrix();
		//boolean result = leetcode026Search2Dmatrix.searchMatrix(matrix, 3);
		//System.out.println("result =" + result);

		int result2 = leetcode026Search2Dmatrix.searchMatrix2(matrix, 1);
		System.out.println("search of =" + 1 + " position  =" + result2);

		result2 = leetcode026Search2Dmatrix.searchMatrix2(matrix, 3);
		System.out.println("search of =" + 3 + " position  =" + result2);

		result2 = leetcode026Search2Dmatrix.searchMatrix2(matrix, 7);
		System.out.println("search of =" + 7 + " position  =" + result2);

		result2 = leetcode026Search2Dmatrix.searchMatrix2(matrix, 10);
		System.out.println("search of =" + 10 + " position  =" + result2);

		result2 = leetcode026Search2Dmatrix.searchMatrix2(matrix, 34);
		System.out.println("search of =" + 34 + " position  =" + result2);

		result2 = leetcode026Search2Dmatrix.searchMatrix2(matrix, 60);
		System.out.println("search of =" + 60 + " position  =" + result2);

		System.out.println("===================");

		//		int M = matrix.length;
		//		int N = matrix[0].length;
		//		int low = 0;
		//		int high = N * M - 1;
		//		//	int mid = (low + high) / 2;
		//		int mid = 11;
		//		int midx = mid / N;
		//		int midy = mid % N;
		//		System.out.println("mid  =" + mid);
		//		System.out.println("midx =" + midx);
		//		System.out.println("midy =" + midy);

		//		int N = 5;
		//		int mid = 14;
		//		int midx = mid / N;
		//		int midy = mid % N;
		//		System.out.println("mid  =" + mid);
		//		System.out.println("midx =" + midx); // 2
		//		System.out.println("midy =" + midy); // 4

		//declare and initialize a stack object
		//		Stack<String> stack = new Stack<String>();
		//		stack.push("PUNE");
		//		stack.push("MUMBAI");
		//		stack.push("NASHIK");
		//		System.out.println("Stack elements:");
		//		//get an iterator for the stack
		    //		Iterator<String> iterator = stack.iterator();
		//		Iterator<String> iterator2 = stack.iterator();
		//		Iterator<String> iterator3 = stack.iterator();
		//		//traverse the stack using iterator in a loop and print each element
		    //		while (iterator.hasNext()) {
		    //			System.out.print(iterator.next() + " ");
		    //		}
		//		System.out.println("stack size = " + stack.size());
		//
		    //		while (iterator2.hasNext()) {
		    //			System.out.print(iterator2.next() + " ");
		    //		}
		//		System.out.println("stack size = " + stack.size());
		//		System.out.println("=============");
		//
		    //		for (String string : stack) {
		    //			System.out.println(string);
		    //		}
		//		System.out.println("=======2=========");
		//		iterator3.forEachRemaining(val -> {
		//			System.out.println(val);
		//		});

	}
}

package leetCode;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
* Describe class here.
*
*
*
*
*
*/
public class leetcode026Search2DmatrixTest {
	//    index =  0  1  2  3  4 
	private int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
	private leetcode026Search2Dmatrix searchMatrix = new leetcode026Search2Dmatrix();

	/**
	*
	*
	*/
	@Test(timeout = 1000)
	public void test1() {
		boolean pos = searchMatrix.searchMatrix(matrix, 3);
		assertEquals(true, pos);
	}

	/**
	*
	*
	*/
	@Test(timeout = 1000)
	public void test2() {
		boolean pos = searchMatrix.searchMatrix(matrix, 16);
		assertEquals(true, pos);
	}

	/**
	*
	*
	*/
	@Test(timeout = 1000)
	public void test3() {
		boolean pos = searchMatrix.searchMatrix(matrix, 60);
		assertEquals(true, pos);
	}

}

// B2

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
public class Leet022SearchInsertPositionTest {
	//    index =  0  1  2  3  4 
	private int[] nums = { 2, 4, 5, 7, 9 };
	private Leet022SearchInsertPosition searchInsertPosition = new Leet022SearchInsertPosition();

	/**
	*
	*
	*/
	@Test(timeout = 1000)
	public void test1() {
		//                    index =  0  1  2  3  4 
		//	private int[] nums = { 2, 4, 5, 7, 9 };
		int pos = -1;
		pos = searchInsertPosition.searchInsert3(nums, 1);
		assertEquals(0, pos);
	}

	/**
	*
	*
	*/
	@Test(timeout = 1000)
	public void test2() {
		//                    index =  0  1  2  3  4 
		//	private int[] nums = { 2, 4, 5, 7, 9 };
		int pos = -1;
		pos = searchInsertPosition.searchInsert3(nums, 2);
		assertEquals(0, pos);
	}

	/**
	*
	*
	*/
	@Test(timeout = 1000)
	public void test3() {
		//                    index =  0  1  2  3  4 
		//	private int[] nums = { 2, 4, 5, 7, 9 };
		int pos = -1;
		pos = searchInsertPosition.searchInsert3(nums, 11);
		assertEquals(5, pos);
	}

	@Test(timeout = 1000)
	public void test4() {
		//                    index =  0  1  2  3  4 
		//	private int[] nums = { 2, 4, 5, 7, 9 };
		int pos = -1;
		pos = searchInsertPosition.searchInsert4(nums, 1);
		assertEquals(0, pos);
	}

	@Test(timeout = 1000)
	public void test5() {
		//                    index =  0  1  2  3  4 
		//	private int[] nums = { 2, 4, 5, 7, 9 };
		int pos = -1;
		pos = searchInsertPosition.searchInsert4(nums, 2);
		assertEquals(0, pos);
	}

	@Test(timeout = 1000)
	public void test6() {
		//                    index =  0  1  2  3  4 
		//	private int[] nums = { 2, 4, 5, 7, 9 };
		int pos = -1;
		pos = searchInsertPosition.searchInsert4(nums, 4);
		assertEquals(1, pos);
	}

	@Test(timeout = 1000)
	public void test7() {
		//                    index =  0  1  2  3  4 
		//	private int[] nums = { 2, 4, 5, 7, 9 };
		int pos = -1;
		pos = searchInsertPosition.searchInsert4(nums, 9);
		assertEquals(4, pos);
	}

	@Test(timeout = 1000)
	public void test8() {
		//                    index =  0  1  2  3  4 
		//	private int[] nums = { 2, 4, 5, 7, 9 };
		int pos = -1;
		pos = searchInsertPosition.searchInsert4(nums, 11);
		assertEquals(5, pos);
	}

	@Test(timeout = 1000)
	public void test9() {
		//                    index =  0  1  2  3  4 
		//	private int[] nums = { 2, 4, 5, 7, 9 };
		int pos = -1;
		pos = searchInsertPosition.searchInsert5(nums, 1);
		assertEquals(0, pos);
	}

	@Test(timeout = 1000)
	public void test10() {
		//                    index =  0  1  2  3  4 
		//	private int[] nums = { 2, 4, 5, 7, 9 };
		int pos = -1;
		pos = searchInsertPosition.searchInsert5(nums, 2);
		assertEquals(0, pos);
	}

	@Test(timeout = 1000)
	public void test11() {
		//                    index =  0  1  2  3  4 
		//	private int[] nums = { 2, 4, 5, 7, 9 };
		int pos = -1;
		pos = searchInsertPosition.searchInsert5(nums, 5);
		assertEquals(2, pos);
	}

	@Test(timeout = 1000)
	public void test12() {
		//                    index =  0  1  2  3  4 
		//	private int[] nums = { 2, 4, 5, 7, 9 };
		int pos = -1;
		pos = searchInsertPosition.searchInsert5(nums, 9);
		assertEquals(4, pos);
	}

	@Test(timeout = 1000)
	public void test13() {
		//                    index =  0  1  2  3  4 
		//	private int[] nums = { 2, 4, 5, 7, 9 };
		int pos = -1;
		pos = searchInsertPosition.searchInsert5(nums, 15);
		assertEquals(5, pos);
	}

	@Test(timeout = 1000)
	public void test14() {
		//                    index =  0  1  2  3  4 
		//	private int[] nums = { 2, 4, 5, 7, 9 };
		int pos = -1;
		pos = searchInsertPosition.searchInsert5(nums, 3);
		assertEquals(1, pos);
	}

	@Test(timeout = 1000)
	public void test15() {
		//                    index =  0  1  2  3  4 
		//	private int[] nums = { 2, 4, 5, 7, 9 };
		int pos = -1;
		pos = searchInsertPosition.searchInsert4(nums, 2);
		assertEquals(0, pos);
	}

	@Test(timeout = 1000)
	public void test16() {
		//                    index =  0  1  2  3  4 
		//	private int[] nums = { 2, 4, 5, 7, 9 };
		int pos = -1;
		pos = searchInsertPosition.searchInsert4(nums, 4);
		assertEquals(1, pos);
	}

	@Test(timeout = 1000)
	public void test17() {
	    //    => java.lang.AssertionError: expected:<3> but was:<4>
		//                    index =  0  1  2  3  4 
		//	private int[] nums = { 2, 4, 5, 7, 9 };
		int pos = -1;
		pos = searchInsertPosition.searchInsert4(nums, 6);
		assertEquals(3, pos);
	}

	@Test(timeout = 1000)
	public void test18() {
		//                    index =  0  1  2  3  4 
		//	private int[] nums = { 2, 4, 5, 7, 9 };
		int pos = -1;
		pos = searchInsertPosition.searchInsert4(nums, 8);
		assertEquals(4, pos);
	}

	@Test(timeout = 1000)
	public void test19() {
		//                    index =  0  1  2  3  4 
		//	private int[] nums = { 2, 4, 5, 7, 9 };
		int pos = -1;
		pos = searchInsertPosition.searchInsert4(nums, 10);
		assertEquals(5, pos);
	}

	@Test(timeout = 1000)
	public void test20() {
		//                    index =  0  1  2  3  4 
		//	private int[] nums = { 2, 4, 5, 7, 9 };
		int pos = -1;
		pos = searchInsertPosition.searchInsert4(nums, 14);
		assertEquals(5, pos);
	}

	@Test(timeout = 1000)
	public void test21() {
		//                    index =  0  1  2  3  4 
		//	private int[] nums = { 2, 4, 5, 7, 9 };
		int pos = -1;
		pos = searchInsertPosition.searchInsert4(nums, 3);
		assertEquals(1, pos);
	}

	@Test(timeout = 1000)
	public void test22() {
		//                    index =  0  1  2  3  4 
		//	private int[] nums = { 2, 4, 5, 7, 9 };
		int pos = -1;
		pos = searchInsertPosition.searchInsert4(nums, 1);
		assertEquals(0, pos);
	}

	@Test(timeout = 1000)
	public void test23() {
		//                    index =  0  1  2  3  4 
		//	private int[] nums = { 2, 4, 5, 7, 9 };
		int pos = -1;
		pos = searchInsertPosition.searchInsert4(nums, -2);
		assertEquals(0, pos);
	}

	@Test(timeout = 1000)
	public void test24() {
		//                    index =  0  1  2  3  4 
		//	private int[] nums = { 2, 4, 5, 7, 9 };
		int pos = -1;
		pos = searchInsertPosition.searchInsert4(nums, 10);
		assertEquals(5, pos);
	}

	@Test(timeout = 1000)
	public void test25() {
		//                    index =  0  1  2  3  4 
		//	private int[] nums = { 2, 4, 5, 7, 9 };
		int pos = -1;
		pos = searchInsertPosition.searchInsert4(nums, 13);
		assertEquals(5, pos);
	}

	@Test(timeout = 1000)
	public void test26() {
		//    index =  0  1  2  3 
		int[] nums = { 2, 5, 6, 7 };
		int pos = -1;
		pos = searchInsertPosition.searchInsert4(nums, 1);
		assertEquals(0, pos);
	}

	@Test(timeout = 1000)
	public void test27() {
		//    index =  0  1  2  3  4 
		int[] nums = { 0, 4, 5, 7, 9 };
		int pos = -1;
		pos = searchInsertPosition.searchInsert4(nums, -2);
		assertEquals(0, pos);
	}

	@Test(timeout = 1000)
	public void test28() {
		//    index =  0  1  2  3  4 
		int[] nums = { 1, 4, 5, 6, 8 };
		int pos = -1;
		pos = searchInsertPosition.searchInsert4(nums, 9);
		assertEquals(5, pos);
	}

	@Test(timeout = 1000)
	public void test29() {
		//    index =  0  1  2  3  4  5
		int[] nums = { 1, 4, 5, 6, 7, 22 };
		int pos = -1;
		pos = searchInsertPosition.searchInsert4(nums, 33);
		assertEquals(6, pos);
	}

	@Test(timeout = 1000)
	public void test30() {
		//    index =  0  1  2  3  4  5
		int[] nums = { 0, 0, 0, 0, 7, 10 };
		int pos = -1;
		pos = searchInsertPosition.searchInsert4(nums, 44);
		assertEquals(6, pos);
	}

	@Test(timeout = 1000)
	public void test31() {
		//    index =  0  1  2  3  4  5   6
		int[] nums = { 0, 0, 0, 0, 7, 10, 12 };
		int pos = -1;
		pos = searchInsertPosition.searchInsert4(nums, 333);
		assertEquals(7, pos);
	}

	@Test(timeout = 1000)
	public void test32() {
		//    index =  0  1  2  3}
		int[] nums = { 1, 3, 5, 6 };
		int pos = -1;
		pos = searchInsertPosition.searchInsert4(nums, 2);
		assertEquals(1, pos);
	}




}

// B2

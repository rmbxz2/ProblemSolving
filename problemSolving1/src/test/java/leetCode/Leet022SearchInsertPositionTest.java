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
	private Leet022SearchInsertPosition searchInsertPosition = new Leet022SearchInsertPosition();
	private int[] nums = { 2, 4, 5, 7, 9 };

	/**
	*
	*
	*/
	@Test(timeout = 1000)
	public void test1() {
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
		int pos = -1;
		pos = searchInsertPosition.searchInsert3(nums, 11);
		assertEquals(5, pos);
	}

	@Test(timeout = 1000)
	public void test4() {
		int pos = -1;
		pos = searchInsertPosition.searchInsert4(nums, 1);
		assertEquals(0, pos);
	}

	@Test(timeout = 1000)
	public void test5() {
		int pos = -1;
		pos = searchInsertPosition.searchInsert4(nums, 2);
		assertEquals(0, pos);
	}

	@Test(timeout = 1000)
	public void test6() {
		int pos = -1;
		pos = searchInsertPosition.searchInsert4(nums, 4);
		assertEquals(1, pos);
	}

	@Test(timeout = 1000)
	public void test7() {
		//	private int[] nums = { 2, 4, 5, 7, 9 };
		int pos = -1;
		pos = searchInsertPosition.searchInsert4(nums, 9);
		assertEquals(4, pos);
	}

	@Test(timeout = 1000)
	public void test8() {
		int pos = -1;
		pos = searchInsertPosition.searchInsert4(nums, 11);
		assertEquals(5, pos);
	}
}
// what 5

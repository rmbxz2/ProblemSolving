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
	@Test
	public void test1() {
		int pos = -1;
		pos = searchInsertPosition.searchInsert3(nums, 1);
		assertEquals(0, pos);
	}

	/**
	*
	*
	*/
	@Test
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
}

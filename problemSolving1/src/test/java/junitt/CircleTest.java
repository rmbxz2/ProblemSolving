package junitt;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Test;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertThrows;
// import org.junit.jupiter.api.Test;

/**
* Describe class here.
*
*
*
*
*
*/
public class CircleTest {
	private Shape shape = new Circle();

	@Test
	public void test() {
		String myDraw = shape.draw("ahmed");
		//		assertEquals(myDraw,"ok ahmed");
		assertEquals("x1=10", myDraw);
	}

	@Test(timeout = 100) // 100 ms
	public void test2() {
		String myDraw = shape.draw2("ahmed");
		//		assertEquals(myDraw,"ok ahmed");
		assertEquals("x2=5", myDraw);
	}

	@Test
	public void test3() {
		assertThrows(MyDivideByZeroException.class, () -> shape.myDivid(1, 0));
	}

}

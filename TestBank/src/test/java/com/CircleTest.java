package com;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

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
	void test() {
		String myDraw = shape.draw("ahmed");
			//		assertEquals(myDraw,"ok ahmed");
		assertEquals("x1=10",myDraw);
	}

	@Test
	void test2() {
		String myDraw = shape.draw2("ahmed");
		//		assertEquals(myDraw,"ok ahmed");
		assertEquals("x2=5",myDraw);
	}


    /*
	@Test
	void test3() {
		assertThrows(MyDivideByZeroException.class, () -> shape.myDivid(1, 0));
	}
    */
}

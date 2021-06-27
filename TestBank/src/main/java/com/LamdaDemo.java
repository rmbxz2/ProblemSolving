package com;

/**
* Describe class here.
*
*
*
*
*
*/
public class LamdaDemo {

	public static void main(String[] args) {
		Shape shape = new Circle();
		//		shape.draw("hi");
		//		shape.draw2("hi");
		System.out.println(shape.draw("hi"));
		System.out.println(shape.draw2("hi"));

	}

	/*
	public static void main(String[] args) {
		Shape circle = new Shape() {
			public String draw(String str) {
			    return ("hi " + str);
			}
		};
		System.out.println(circle.draw("ahmed"));
	
	
		Shape circle2 = (String str2) -> {
			    return ("hi " + str2);
		};
		System.out.println(circle2.draw("ali"));
	}
	*/
}

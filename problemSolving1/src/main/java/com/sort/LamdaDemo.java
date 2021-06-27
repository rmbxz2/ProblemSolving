package com.sort;

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
}

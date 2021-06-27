package algo;

/**
* Describe class here.
*
*
*
*
*
*/
public class MyCompareTo {
	public static void main(String[] args) {
		String first = "a";
		String second ="b";
		String third = "f";
		String fourth = "Ahmad";
		String fifth = "Ahmed";
		String sixth = "Ahmid";
		
		System.out.println(first.compareTo(second));  // -1
		System.out.println(second.compareTo(first));  // +1
		System.out.println(first.compareTo(third));  // -5
		System.out.println(fourth.compareTo(fifth));  // Ahmad Ahmed -4
		System.out.println(fourth.compareTo(sixth));  // Ahmed Ahmid -8

		String a1 = "bac"; // abc --> sort then compare 
		String a2 = "bad"; // abd --> sort then compare 
		String a3 = "bae"; // abe --> sort then compare 
		String a4 = "baf"; // abf --> sort then compare 

	}
}

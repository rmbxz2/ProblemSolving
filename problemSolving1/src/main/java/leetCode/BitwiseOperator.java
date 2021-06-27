package leetCode;
	/**
	 * 
	 * 
	*/
public class BitwiseOperator {
	/**
	 * 
		
	*/
	public static void main(String[] args) {
	        System.out.println("" + (25 >>> 1)); // 25 / 2
		System.out.println("" + (25 / (Math.pow(2, 1)) ));

		System.out.println("====================");
	        System.out.println("" + (25 >> 1)); // 25 / 2
		System.out.println("" + (25 / (Math.pow(2, 1)) ));

		System.out.println("====================");
	       	System.out.println("" + (250 << 3));    // 250 * 8
		System.out.println("" + (250 * Math.pow(2, 3))  );

	}
}

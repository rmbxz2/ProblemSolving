package generic;

/**
* Describe class here.
*
*
*
*
*
*/
public class Generic3 {

	/**
	 * 
	 * @param <N>
	 * @param x
	 * @param y
	 * @return
	*/
    public static <N extends Number> N max(N x, N y) { // Number and kids ==>> N
		if (x.doubleValue() > y.doubleValue())
			return x;
		else
			return y;

	}

	/**
	 * 
	 * @param args
	*/
	public static void main(String[] args) {
		System.out.println(max(2, 3.1F));
		System.out.println(max(2D, 3.1F));
		System.out.println(max(2L, 1.1F));
	}
}

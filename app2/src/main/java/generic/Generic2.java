package generic;

/**
* Describe class here.
*
*
*
*
*
*/
class GenericBox<T> {
	private T x;

	/**
	 * 
	 * @param x
	*/
	public void setValue(T x) {
		this.x = x;
	}

	/**
	*
	*
	*/
	public T getValue() {
		return this.x;
	}

}

public class Generic2 {
	public static void main(String[] args) {
	    GenericBox objBox = new GenericBox(); // without <> will store as Object
	    objBox.setValue(2);
	    System.out.println(objBox.getValue()); //object



	    GenericBox<Integer> intBox = new GenericBox<Integer>(); // with <> will store as Integer
	    intBox.setValue(2);
	    System.out.println(intBox.getValue()); //Integer


	}
}

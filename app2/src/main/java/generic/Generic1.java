package generic;

/**
* Describe class here.
*
*
*
*
*
*/
public class Generic1 {

	/**
	 * 
	 * @param <E>
	 * @param array
	*/
	public static <E> void printArray(E[] array) {
		for (E e : array) {
			System.out.print(e);
		}
		System.out.println("\n==================");
	}

	/**
	 * 
	 * @param args
	*/
	public static void main(String[] args) {
		Integer[] array1 = { 1, 2, 3, 4 };
		Long[] array2 = {1L,2L,3L,4L};
		Float[] array3 = {1.1f, 2.1f, 3.4f};
		Double[] array4 = {1D, 2D, 3D};
		Character[] array5 = {'a','b','c','d'};
		String[] array6 = {"Ahemd", "Ali", "omar"};
		
		printArray(array1);
		printArray(array2);
		printArray(array3);
		printArray(array4);
		printArray(array5);
		printArray(array6);
	}
}

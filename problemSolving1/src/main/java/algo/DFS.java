package algo;

/**
* Describe class here.
*
*
*
*  
*
*/
public class DFS {
	int size;
	AdjList[] array;

	/**
	 * @param size
	 * @param array
	 */
	public DFS(int size) {
		this.size = size;
		array = new AdjList[size];
		for (int i = 0; i < size; i++) {
			array[i] = new AdjList();
			//		array[i].head = null; // by defult is null
		}
	}


	/**
	* 
	*
	*/
	public static void main(String[] args) {
	    new DFS(5);  // 
	}
}

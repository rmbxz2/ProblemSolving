package builder;

/**
* Describe class here.
*
*
*
*
*
*/
public class MainBuilder {
	/**
	 * 
	 * @param args
	*/
	public static void main(String[] args) {
		Builder builder = new FirstBuilder();
		Director director = new Director(builder);
		director.assembleHome();
		System.out.println(director.getCompleteHome());
	}
}

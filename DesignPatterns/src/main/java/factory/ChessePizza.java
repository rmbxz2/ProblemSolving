package factory;

/**
* Describe class here.
*
*
*
*
*
*/
public class ChessePizza implements Pizza {

	private String name;
	private String condiments;

	/**
	 * 
	 */
	public ChessePizza() {
		name = "cheese pizza";
		condiments = "cheese";
	}

	@Override
	public void makeUp() {
		System.out.println(name + " is prepared with condiments " + condiments);
	}
}

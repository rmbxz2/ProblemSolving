package factory;

/**
* Describe class here.
*
*
*
*
*
*/
public class ClamPizza implements Pizza {
    
	private String condiments;
	private String name;

	/**
	 * 
	 */
	public ClamPizza() {
		name = "Clam Pizza";
		condiments = "clam";
	}

	@Override
	public void makeUp() {
		System.out.println(name + " is prepared with  condiments " + condiments );
	}
}

package factory;

/**
* Describe class here.
*
*
*
*
*
*/
public class CheeseBurger implements Sandwich {
	private String name;
	private int calories;

	/**
	 * 
	 */
	public CheeseBurger() {
		name = "Cheese Burger";
		calories = 1;
	}

	@Override
	public void makeUp() {
		System.out.println(name + " is prepared with " + calories + " Calories");
	}

}

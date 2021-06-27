package factory;

/**
* Describe class here.
*
*
*
*
*
*/
public class ChickenBurger implements Sandwich {
	private String name;
	private int calories;

	/**
	 * 
	 */
	public ChickenBurger() {
		name = "Chicken Burger";
		calories = 2;
	}

	/**
	 * 
	 * 
	*/
	@Override
	public void makeUp() {
		System.out.println(name + " is prepared with " + calories + " Calories");
	}
}

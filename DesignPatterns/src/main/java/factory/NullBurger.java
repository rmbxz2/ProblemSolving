package factory;

public class NullBurger implements Sandwich {
	private String name;
	private int calories;

	public NullBurger() {
		name = "Null Burger";
		calories = 0;
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

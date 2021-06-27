package factory;

public class NullPizza implements Pizza{

	private String name;
	private String condiments;

	/**
	 * 
	 */
	public NullPizza() {
		name = "Null pizza";
		condiments = "Null";
	}

	@Override
	public void makeUp() {
		System.out.println(name + " is prepared with condiments " + condiments);		
	}
}

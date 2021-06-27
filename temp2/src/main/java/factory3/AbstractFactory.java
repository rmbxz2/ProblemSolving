package factory3;

/**
* Describe class here.
*
*
*
*
*
*/
public interface AbstractFactory {
	int CHEESE_PIZZA = 1;
	int CLAM_PIZZA = 2;
	int CHICKEN_SANDWICH = 3;
	int CHEESE_SANDWICH = 4;

	/**
	*
	*
	*/
	public Sandwich createSandwich(int type);

	/**
	*
	*
	*/
	public Pizza createPizza(int type);
}

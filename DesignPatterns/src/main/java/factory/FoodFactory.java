package factory;

/**
* Describe class here.
*
*
*
*
*
*/
public class FoodFactory implements AbstractFactory {

	/**
	 * 
	 * 
	*/
	@Override
	public Sandwich createSandwich(int type) {
		switch (type) {
			case AbstractFactory.CHICKEN_BURGER:
				return new ChickenBurger();
			case AbstractFactory.CHEESE_BURGER:
				return new CheeseBurger();
			default:
				return new NullBurger();
		}
	}

	/**
	 * 
	 * 
	*/
	@Override
	public Pizza createPizza(int type) {
		switch (type) {
			case AbstractFactory.CLAM_PIZZA:
				return new ClamPizza();
			case AbstractFactory.CHEESE_PIZZA:
				return new ChessePizza();
			default:
				return new NullPizza();
		}
	}

}

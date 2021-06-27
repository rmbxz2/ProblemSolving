package factory3;

/**
* Describe class here.
*
*
*
*
*
*/
public class Factory implements AbstractFactory {

	@Override
	public Sandwich createSandwich(int type) {
		switch (type) {
		case AbstractFactory.CHICKEN_SANDWICH:
			return new ChickenSandwich();
		case AbstractFactory.CHEESE_SANDWICH:
			return new CheeseSandwich();
		default:
			return null;
		}

	}

	@Override
	public Pizza createPizza(int type) {
		switch (type) {
		case AbstractFactory.CHEESE_PIZZA:
			return new CheesePizza();
		case AbstractFactory.CLAM_PIZZA:
			return new ClamPizza();
		default:
			return null;
		}
	}
}

package factory;

/**
* Describe class here.
*
*
*
*
*
*/
public class MainFactory {
	public static void main(String[] args) {
		AbstractFactory sandwichFactory = new FoodFactory();
		Sandwich cheese = sandwichFactory.createSandwich(FoodFactory.CHEESE_BURGER);
		cheese.makeUp();
		Sandwich chicken = sandwichFactory.createSandwich(FoodFactory.CHICKEN_BURGER);
		chicken.makeUp();
		Sandwich noChicken = sandwichFactory.createSandwich(44);
		noChicken.makeUp();
		System.out.println("================================================================");
		AbstractFactory PizzaFactory = new FoodFactory();
		Pizza clamPizza = PizzaFactory.createPizza(AbstractFactory.CLAM_PIZZA);
		clamPizza.makeUp();
		Pizza cheesePizza = PizzaFactory.createPizza(AbstractFactory.CHEESE_PIZZA);
		cheesePizza.makeUp();
		Pizza noPizza = PizzaFactory.createPizza(55);
		noPizza.makeUp();
	}
}

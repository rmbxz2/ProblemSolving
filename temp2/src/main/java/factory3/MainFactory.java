package factory3;

import javax.swing.*;

/**
* Describe class here.
*
*
*
*
*
*/
public class MainFactory {

	public MainFactory() {
		JButton button = new JButton();
		button.setSize(22, 22);
	}

	public static void main(String[] args) {
	    MainFactory mm = new MainFactory();

		AbstractFactory factory = new Factory();
		Pizza cheesePizza = factory.createPizza(AbstractFactory.CHEESE_PIZZA);
		Pizza clamPizza = factory.createPizza(AbstractFactory.CLAM_PIZZA);
		Sandwich chickenSandwich = factory.createSandwich(AbstractFactory.CHICKEN_SANDWICH);
		Sandwich cheeseSandwich = factory.createSandwich(AbstractFactory.CHEESE_SANDWICH);
		cheesePizza.makePizzaUp();
		clamPizza.makePizzaUp();
		chickenSandwich.makeSandwichUp();
		cheeseSandwich.makeSandwichUp();
	}
}

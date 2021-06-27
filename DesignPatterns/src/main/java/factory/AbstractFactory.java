package factory;

/**
* Describe class here.
*
*
*
*
*
*/
public interface AbstractFactory {
	int CHICKEN_BURGER = 1;
	int CHEESE_BURGER = 2;
	int CLAM_PIZZA = 3;
	int CHEESE_PIZZA = 4;

	Sandwich createSandwich(int type);

	Pizza createPizza(int type);

}

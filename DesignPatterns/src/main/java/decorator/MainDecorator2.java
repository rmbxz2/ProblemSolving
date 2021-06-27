package decorator;

/**
* Describe class here.
*
*
*
*
*
*/
public class MainDecorator2 {
	/**
	 * 
	 * 
	*/
	public static void main(String[] args) {
		// CarDecorator.description() ==> invoked many times in stack;
		Car car = new LuxCar(new SportCar(new LuxCar(new SportCar(new BasicCar()))));
		car.description();
	}
}

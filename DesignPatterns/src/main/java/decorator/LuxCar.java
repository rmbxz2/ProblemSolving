package decorator;

/**
* Describe class here.
*
*
*
*
*
*/
public class LuxCar extends CarDecorator {
	public LuxCar(Car car) {
		super(car);
	}

	/**
	 * 
	 * 
	*/
	@Override
	public void description() {
		super.description();
		System.out.println("Lux Car");
	}
}

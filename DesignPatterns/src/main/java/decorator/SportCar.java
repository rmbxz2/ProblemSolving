package decorator;

/**
* Describe class here.
*  
*
*
*
*
*/
public class SportCar extends CarDecorator {

	/**
	 * 
	 * @param car
	*/
	public SportCar(Car car) {
		super(car);

	}

	/**
	 * 
	 * 
	*/
	@Override
	public void description() {
		super.description();
		System.out.println("Sport Car");
	}
}

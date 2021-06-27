package decorator;

/**
* Describe class here.
*
*
*
*
*
*/
public class CarDecorator implements Car {
	private Car car;

	/**
	*
	*
	*/
	public CarDecorator(Car car) {
		this.car = car;
	}

	/**
	* 
	* 
	*/
	@Override
	public void description() {
		this.car.description();
	}
}

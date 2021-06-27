package proxy;

public class Proxy implements CarIF {
	private CarIF car ;

	public Proxy() {
			car = new Car();
	}

	public void drive(int age) {
		if (age < 18)
				System.out.println("age " + age + " cant move the car");
		 else 
			car.drive(age);
		}
	}



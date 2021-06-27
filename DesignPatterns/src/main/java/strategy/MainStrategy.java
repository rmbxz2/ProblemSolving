package strategy;

public class MainStrategy {
	public static void main(String[] args) {

		System.out.println("===============  strategy pattern    ================");
		Vehicle car = new Car();
		GoAlgorithm driving = new Driving();
		car.setGoAlgorithm(driving);
		System.out.println(car.go());

		Vehicle helicopter = new Helicopter();
		GoAlgorithm flying = new Flying();
 		helicopter.setGoAlgorithm(flying);
		System.out.println(helicopter.go());
	}
}


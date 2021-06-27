package compund;

public class DuckSimulator {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		simulator.simulate(duckFactory);
	}

	/**
	 * 
	 */
	public void simulate(AbstractDuckFactory duckFactory) {

		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());
		Flock flockOfDucks = new Flock();

		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);

		Flock flockOfMallards = new Flock();

		Quackable mallardOne = duckFactory.createMallardDuck();
		Quackable mallardTwo = duckFactory.createMallardDuck();
		Quackable mallardThree = duckFactory.createMallardDuck();
		Quackable mallardfour = duckFactory.createMallardDuck();

		flockOfMallards.add(mallardOne);
		flockOfMallards.add(mallardTwo);
		flockOfMallards.add(mallardThree);
		flockOfMallards.add(mallardfour);

		flockOfDucks.add(flockOfMallards);

		Quackologist quackologist = new Quackologist();
		flockOfDucks.registerObserver(quackologist);

		System.out.println("duck simulator : whole flock simulation ");
		simulate(flockOfDucks);

		// System.out.println("duck simulator : mallard flock simulation ");
		// simulate(flockOfMallards);

		System.out.println(" the ducks quacked  " + QuackCounter.getQuacks());
	}

	/**
	 * @param duck
	 */
	public void simulate(Quackable duck) {
		duck.quack();
	}
}

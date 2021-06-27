package compund2;

/**
* Describe class here.
*
*
*
*
*
*/
public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		simulator.simulate(duckFactory);
	}

	private void simulate(AbstractDuckFactory duckFactory) {
		Quackable redheadDuck = duckFactory.createRedHeadDuck();
		Quackable malardDuck = duckFactory.createMalardDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable goose = new QuackCounter(new GooseAdapter(new Goose()));
		Flock flock = new Flock();
		flock.addQuacker(redheadDuck);
		flock.addQuacker(malardDuck);
		flock.addQuacker(duckCall);
		flock.addQuacker(rubberDuck);
		flock.addQuacker(goose);
		System.out.println("quack counter = "+ QuackCounter.getQuckCounter());

		QuackLogist logist = new QuackLogist();
		flock.addObserver(logist);
		flock.quack();
		logist.update(flock);
 	}
}


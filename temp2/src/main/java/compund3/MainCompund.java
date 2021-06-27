package compund3;

/**
* Describe class here.
*
*
*
*
*
*/
public class MainCompund {
	public static void main(String[] args) {
		AbstractFactory duckFactory = new DuckFactory();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable malardDuck = duckFactory.createMalardDuck();
		Quackable redHeadDuck = duckFactory.createRedHeadDuck();
		Quackable gooseAdapter = new GooseAdapter(new Goose());
		Flock flock = new Flock();
		flock.addQuacker(redHeadDuck);
		flock.addQuacker(rubberDuck);
		flock.addQuacker(duckCall);
		flock.addQuacker(malardDuck);
		flock.addQuacker(gooseAdapter);
		Logist logist = new Logist();
		flock.registerObserver(logist);
 		flock.quack();
	}
}

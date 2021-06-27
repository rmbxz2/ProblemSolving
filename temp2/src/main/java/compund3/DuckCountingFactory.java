package compund3;

/**
* Describe class here.
*
*
*
*
*
*/
public class DuckCountingFactory implements AbstractFactory {

	@Override
	public Quackable createMalardDuck() {
		return new DuckCounting(new MalardDuck());
	}

	@Override
	public Quackable createDuckCall() {
		return new DuckCounting(new DuckCall());
	}

	@Override
	public Quackable createRubberDuck() {
		return new DuckCounting(new RubberDuck());
	}

	@Override
	public Quackable createRedHeadDuck() {
		return new DuckCounting(new RedHeadDuck());
	}
}

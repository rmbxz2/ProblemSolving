package compund2;

/**
* Describe class here.
*
*
*
*
*
*/
public class CountingDuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable createMalardDuck() {
		return new QuackCounter(new MalardDuck());
	}

	@Override
	public Quackable createDuckCall() {
		return new QuackCounter(new DuckCall());
	}

	@Override
	public Quackable createRedHeadDuck() {
		return new QuackCounter(new RedHeadDuck());
	}

	@Override
	public Quackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}
}

package compund2;

/**
* Describe class here.
*
*
*
*
*
*/
public class DuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable createMalardDuck() {
		return new MalardDuck();
	}

	@Override
	public Quackable createDuckCall() {
		return new DuckCall();
	}

	@Override
	public Quackable createRedHeadDuck() {
		return new RedHeadDuck();
	}

	@Override
	public Quackable createRubberDuck() {
		return new RubberDuck();
	}
}

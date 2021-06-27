package compund3; 

/**
* Describe class here.
*
*
*
*
*
*/
public class DuckFactory implements AbstractFactory{

	@Override
	public Quackable createMalardDuck() {
	    return new MalardDuck();
	}

	@Override
	public Quackable createDuckCall() {
		return new DuckCall();
	}

	@Override
	public Quackable createRubberDuck() {
		return new RubberDuck();
	}

	@Override
	public Quackable createRedHeadDuck() {
		return new RedHeadDuck();
	}
}

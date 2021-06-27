package compund;

/**
 * @author Ahmed
 * 
 */
public class CountingDuckFactory extends AbstractDuckFactory {

	/*
	 * (non-Javadoc)
	 * 
	 * @see pattern_OF_Patterns.AbstractDuckFactory#createDuckCall()
	 */
	@Override
	public Quackable createDuckCall() {
		return new QuackCounter(new DuckCall());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see pattern_OF_Patterns.AbstractDuckFactory#createMallaredDuck()
	 */
	@Override
	public Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see pattern_OF_Patterns.AbstractDuckFactory#createRedheadDuck()
	 */
	@Override
	public Quackable createRedheadDuck() {
		return new QuackCounter(new RedheadDuck());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see pattern_OF_Patterns.AbstractDuckFactory#createRubberDuck()
	 */
	@Override
	public Quackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}

}

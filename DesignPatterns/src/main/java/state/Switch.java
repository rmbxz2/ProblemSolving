package state;

public class Switch {
	final static int s1 = 1;
	final static int s2 = 2;
	final static int s3 = 3;
	final static int s4 = 4;

	private StateIF state;
	private StateIF state1;
	private StateIF state2;
	private StateIF state3;
	private StateIF state4;
	

	/**
	 * 
	 */
	public Switch() {
		state1 = new State1();
		state2 = new State2();
		state3 = new State3();
		state4 = new State4();
		state = state1;
	}

	/**
	 * 
	 */
	public void handle() {
		state.handle();
	}

	public void changeState(int x) {
		switch (x) {
		case s1:
			state=state1;
			break;

		case s2:
			state=state2;
			break;

		case s3:
			state=state3;
			break;

		case s4:
			state=state4;
			break;

		default:
			break;
		}
		
	
	}
}

package builder;

/**
* Describe class here.
*
*
*
*
*
*/
public class FirstBuilder implements Builder {

	private Home home = new SimpleHome();

	@Override
	public void buildFloor() {
		home.createFloor();
	}

	@Override
	public void buildWalls() {
		home.createWalls();

	}

	@Override
	public void buildDoors() {
		home.createDoors();

	}

	@Override
	public Home getCompleteHome() {
		return home;
	}

}

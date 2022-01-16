package builder;

/**
* Describe class here.
*
*
*
*
*
*/
public class SimpleHome implements Home {
	private String floor;
	private String walls;
	private String doors;

	@Override
	public void createFloor() {
		this.floor = "create floor";
	}

	@Override
	public void createWalls() {
		this.walls = "create walls";
	}

	@Override
	public void createDoors() {
		this.doors = "create doors";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	@Override
	public String toString() {
		return "SimpleHome [doors=" + doors + ", floor=" + floor + ", walls=" + walls + "]";
	}




}

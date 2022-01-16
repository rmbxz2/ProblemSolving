package builder;

/**
* Describe class here.
*
*
*
*
*
*/
public class Director {
	private Builder builder;

	/**
	 * @param builder
	 */
	public Director(Builder builder) {
		this.builder = builder;
	}

	/**
	*
	*
	*/
	public Home getCompleteHome() {
		return this.builder.getCompleteHome();
	}

	/**
	*
	*
	*/
	public void assembleHome() {
		this.builder.buildFloor();
		this.builder.buildWalls();
		this.builder.buildDoors();
	}
}

package builder;

public interface Builder {
	/**
	*
	*
	*/
	public void buildFloor();

	public void buildWalls();

	public void buildDoors();

	public Home getCompleteHome();

}

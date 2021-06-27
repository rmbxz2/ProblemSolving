package adapter_03;

public class FullName implements FullNameIF {

	private String name;

	/**
	 * @param name
	 */
	public FullName(String name) {
		this.name = name;
	
			
	}

	public String getName() {
		return this.name;

	}

	public void setName(String name) {
		this.name = name;
	}

}


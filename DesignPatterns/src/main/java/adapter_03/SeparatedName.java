package adapter_03;

/**
 * @author Ahmed
 * 
 */
public class SeparatedName implements SeparatedNameIF {

	private String firstName;
	private String secondName;
	private String thirdName;

	/**
	 * 
	 */
	public SeparatedName() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adapter_03.SeparatedNameIF#getFirstName()
	 */

	/**
	 * @param firstName
	 * @param secondName
	 * @param thirdName
	 */
	public SeparatedName(String firstName, String secondName, String thirdName) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.thirdName = thirdName;
	}

	/* (non-Javadoc)
	 * @see adapter_03.SeparatedNameIF#getFirstName()
	 */
	public String getFirstName() {
		return firstName;
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see adapter_03.SeparatedNameIF#setFirstName(java.lang.String)
	 */

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adapter_03.SeparatedNameIF#getSecondName()
	 */

	public String getSecondName() {
		return secondName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adapter_03.SeparatedNameIF#setSecondName(java.lang.String)
	 */

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adapter_03.SeparatedNameIF#getThirdName()
	 */

	public String getThirdName() {
		return thirdName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adapter_03.SeparatedNameIF#setThirdName(java.lang.String)
	 */
	public void setThirdName(String thirdName) {
		this.thirdName = thirdName;
	}

}

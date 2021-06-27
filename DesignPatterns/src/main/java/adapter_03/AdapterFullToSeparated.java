package adapter_03;

import java.util.StringTokenizer;

/**
 * @author Ahmed
 * 
 */
public class AdapterFullToSeparated implements FullNameIF {
	private String firstName;
	private String secondName;
	private String thirdName;
	private SeparatedNameIF seperatedName;

	/**
	 * 
	 */
	public AdapterFullToSeparated(String name) {
		convertFullToSeperatedName(name);
		seperatedName = new SeparatedName(firstName, secondName, thirdName);
		
	}

		
	
	/**
	 * 
	 */
	public void convertFullToSeperatedName(String name) {
		
		StringTokenizer strTokenizer = new StringTokenizer(name);
		String[] str = new String[3];
	    		
		for (int index = 0; strTokenizer.hasMoreTokens(); index++) {
			str[index] = strTokenizer.nextToken();
		}
 
		firstName = str[0];
		secondName = str[1];
		thirdName = str[2];
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adapter_03.FullNameIF#getName()
	 */
	public String getName() {
		this.firstName = this.seperatedName.getFirstName();
		this.secondName = this.seperatedName.getSecondName();
		this.thirdName = this.seperatedName.getThirdName();
		return this.firstName +" "+ this.secondName + " "+ this.thirdName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adapter_03.FullNameIF#setName(java.lang.String)
	 */
	public void setName(String name) {
		convertFullToSeperatedName(name);
		this.seperatedName.setFirstName(firstName);
		this.seperatedName.setSecondName(secondName);
		this.seperatedName.setThirdName(thirdName);
	}

}

package model;

/**
* Describe class here.
*
*
*
*
*
*/
public class Player {

	private int pid;
	private String name;
	private String address;
	private String city;
	private String province;
	private String postalCode;

	/**
	 * 
	 */
	public Player() {
	}

	/**
	 * @param name
	 * @param address
	 * @param city
	 * @param province
	 * @param postalCode
	 */
	public Player(String name, String address, String city, String province, String postalCode) {
		this.name = name;
		this.address = address;
		this.city = city;
		this.province = province;
		this.postalCode = postalCode;
	}

	/**
	 * @param pid
	 * @param name
	 * @param address
	 * @param city
	 * @param province
	 * @param postalCode
	 */
	public Player(int pid, String name, String address, String city, String province, String postalCode) {
		this.pid = pid;
		this.name = name;
		this.address = address;
		this.city = city;
		this.province = province;
		this.postalCode = postalCode;
	}

	/**
	 * @return the pid
	 */
	public int getPid() {
		return pid;
	}

	/**
	 * @param pid the pid to set
	 */
	public void setPid(int pid) {
		this.pid = pid;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the province
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * @param province the province to set
	 */
	public void setProvince(String province) {
		this.province = province;
	}

	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + pid;
		result = prime * result + ((postalCode == null) ? 0 : postalCode.hashCode());
		result = prime * result + ((province == null) ? 0 : province.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pid != other.pid)
			return false;
		if (postalCode == null) {
			if (other.postalCode != null)
				return false;
		} else if (!postalCode.equals(other.postalCode))
			return false;
		if (province == null) {
			if (other.province != null)
				return false;
		} else if (!province.equals(other.province))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

	@Override
	public String toString() {
		return "Player [address=" + address + ", city=" + city + ", name=" + name + ", pid=" + pid + ", postalCode="
				+ postalCode + ", province=" + province + "]";
	}

}

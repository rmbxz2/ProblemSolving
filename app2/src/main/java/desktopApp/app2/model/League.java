package desktopApp.app2.model;


/**
 * Describe class League here.
 *
 *
 * Created: Mon Sep 18 16:17:07 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class League {
    private String name;
    private String age;    
    private String gender;

    public League( String name, String age, String gender) {
	this.name=name;
	this.age=age;
	this.gender=gender;
    }

    /**
     * Gets the value of name
     *
     * @return the value of name
     */
    public final String getName() {
	return this.name;
    }

    /**
     * Sets the value of name
     *
     * @param argName Value to assign to this.name
     */
    public final void setName(final String argName) {
	this.name = argName;
    }

    /**
     * Gets the value of age
     *
     * @return the value of age
     */
    public final String getAge() {
	return this.age;
    }

    /**
     * Sets the value of age
     *
     * @param argAge Value to assign to this.age
     */
    public final void setAge(final String argAge) {
	this.age = argAge;
    }

    /**
     * Gets the value of gender
     *
     * @return the value of gender
     */
    public final String getGender() {
	return this.gender;
    }

    /**
     * Sets the value of gender
     *
     * @param argGender Value to assign to this.gender
     */
    public final void setGender(final String argGender) {
	this.gender = argGender;
    }

    /**
     * Check if this object is equal (equivalent) to another object.
     */
    public final boolean equals(final Object obj) {
	if (obj == this) return true;
	if ((obj == null) || !getClass().equals(obj.getClass())) return false;
	
	League o = (League) obj;
	
	return (name == null ? o.name == null : name.equals(o.name))
	    && (age == null ? o.age == null : age.equals(o.age))
	    && (gender == null ? o.gender == null : gender.equals(o.gender));
    }

    /**
     * Calculate the hash code for this object.
     * 
     * <p>The rules laid out in J. Blosh's Effective Java are used
     * for the hash code calculation.</p>
     * 
     * @return the hash code.
     * 
     * @see java.lang.Object#hashCode
     */
    public final int hashCode() {
	int code = 11;
	
	code = code * 37 + (name == null ? 13 : name.hashCode());
	code = code * 37 + (age == null ? 17 : age.hashCode());
	code = code * 37 + (gender == null ? 19 : gender.hashCode());
	
	return code;
    }

    /**
     * Get a string representation of this object.
     * 
     * @return a string representation of this object.
     * 
     * @see java.lang.Object#toString
     */
    public final String toString() {
	return new StringBuilder("name=" + name)
	    .append(", age=" + age)
	    .append(", gender=" + gender)
	    .toString();
    }
    
}

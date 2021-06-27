package mySpring;

/**
 * Describe class User here.
 *
 *
 * Created: Sat Oct 20 13:24:23 2018
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class User {

    private String name;    
    private String password;

    
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
     * Gets the value of password
     *
     * @return the value of password
     */
    public final String getPassword() {
	return this.password;
    }

    /**
     * Sets the value of password
     *
     * @param argPassword Value to assign to this.password
     */
    public final void setPassword(final String argPassword) {
	this.password = argPassword;
    }


}

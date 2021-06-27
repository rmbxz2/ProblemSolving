package mySort;

/**
 * Describe class DVD here.
 *
 *
 * Created: Sun Jul 22 00:22:02 2018
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */

public class DVD implements Comparable<DVD> {
    private String name;
    private int first;
    private int second;
    private int third;

    /**
     * Creates a new <code>DVD</code> instance.
     *
     * @param name a <code>String</code> value
     * @param first an <code>int</code> value
     * @param second an <code>int</code> value
     * @param third an <code>int</code> value
     */
    public DVD(String name, int first, int second, int third) {
        this.name   = name;
        this.first  = first;
        this.second = second;
        this.third  = third;
    }

    /**
     * Describe <code>getName</code> method here.
     *
     * @return a <code>String</code> value
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
     * Gets the value of first
     *
     * @return the value of first
     */
    public final int getFirst() {
        return this.first;
    }

    /**
     * Sets the value of first
     *
     * @param argFirst Value to assign to this.first
     */
    public final void setFirst(final int argFirst) {
        this.first = argFirst;
    }

    /**
     * Gets the value of second
     *
     * @return the value of second
     */
    public final int getSecond() {
        return this.second;
    }

    /**
     * Sets the value of second
     *
     * @param argSecond Value to assign to this.second
     */
    public final void setSecond(final int argSecond) {
        this.second = argSecond;
    }

    /**
     * Gets the value of third
     *
     * @return the value of third
     */
    public final int getThird() {
        return this.third;
    }

    /**
     * Sets the value of third
     *
     * @param argThird Value to assign to this.third
     */
    public final void setThird(final double argThird) {
        this.third = (int) argThird;
    }

    /**
     * Sets the value of third
     *
     * @param argThird Value to assign to this.third
     */
    public final void setThird(final int argThird) {
        this.third = argThird;
    }

    /**
     * Check if this object is equal (equivalent) to another object.
     */
    public boolean equals(final Object obj) {
        if (obj == this) return true;
        if ((obj == null) || !getClass().equals(obj.getClass())) return false;

        DVD o = (DVD) obj;

        return (first == o.first) && (second == o.second) && (third == o.third)
                && (name == null ? o.name == null : name.equals(o.name));
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

        code = code * 37 + first;
        code = code * 37 + second;
        code = code * 37 + third;
        code = code * 37 + (name == null ? 13 : name.hashCode());

        return code;
    }

    /**
     * Get a string representation of this object.
     *
     * @return a string representation of this object.
     *
     * @see java.lang.Object#toString
     */
    public String toString() {
        return "name =" + name + " first = " + first + " second = " + second + " third = " + third
                + "\n";
    }

    /**
     * Describe <code>compareTo</code> method here.
     *
     * @param dvd a <code>DVD</code> value
     * @return an <code>int</code> value
     */
    public final int compareTo(DVD dvd) {
        int comp = name.compareTo(dvd.getName());
        if (comp == 0) comp = (new Integer(first)).compareTo(dvd.getFirst());
        if (comp == 0) comp = (new Integer(second)).compareTo(dvd.getSecond());
        if (comp == 0) comp = (new Integer(third)).compareTo(dvd.getThird());
        return comp;
    }
}

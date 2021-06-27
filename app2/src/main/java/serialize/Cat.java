package serialize;

import java.io.Serializable;
import serialize.Cat;


/**
 * Describe class Cat here.
 *
 * 
 * Created: Thu Nov  9 02:17:10 2017
 *  
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class Cat implements Serializable {

    private int x1=1;    
    private int x2=2;
    private int x3=3;

    public Cat(){
	
    }

    /**
     * Check if this object is equal (equivalent) to another object.
     */
    public final boolean equals(final Object obj) {
	if (obj == this) return true;
	if ((obj == null) || !getClass().equals(obj.getClass())) return false;
	
	Cat o = (Cat) obj;
	
	return (x1 == o.x1)
	    && (x2 == o.x2)
	    && (x3 == o.x3);
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
	int code = 13;
	code = code * 37 + x1;
	code = code * 37 + x2;
	code = code * 37 + x3;
	
	return code;
    }

    /**
     * Get a string representation of this object.
     * 
     * @return a string representation of this object.
     * 
     * @see java.lang.Object#toString
     */
     public final String toString(int x) {
	return new StringBuilder("x1=" + x1)
	    .append(", x2=" + x2)
	    .append(", x3=" + x3)
	    .toString();

    }

   public final String toString() {

	return new StringBuilder("x1=" + x1)
	    .append(", x2=" + x2)
	    .append(", x3=" + x3)
	    .toString();
    }


    /**
     * Describe <code>hi</code> method here.
     *
     * @return a <code>String</code> value
     */
    public static  String hi() {
	return "hi";
    }
}

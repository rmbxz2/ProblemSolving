package mySpring;




/**
 * Describe class ReadingDB here.
 *
 *
 * Created: Thu Oct 18 12:57:50 2018
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class ReadingDB implements ReadingList {

    
    // Implementation of mySpring.ReadingList

    /**
     * Describe <code>read</code> method here.
     *
     */
    @Override
    public final void read() {
	System.out.println(" reading from DB ");
    }
    
    
}

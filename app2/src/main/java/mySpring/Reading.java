package mySpring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;



/**
 * Describe class Reading here.
 *
 *
 * Created: Thu Oct 18 12:59:18 2018
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class Reading implements DisposableBean, InitializingBean {
    
    private ReadingList readingList;

    /**
     * Creates a new <code>Reading</code> instance.
     *
     */
    public Reading(){
	
    }

    
    // Implementation of org.springframework.beans.factory.DisposableBean

    /**
     * Describe <code>destroy</code> method here.
     *
     * @exception Exception if an error occurs
     */
    public final void destroy() throws Exception {

    }


    // Implementation of org.springframework.beans.factory.InitializingBean

    /**
     * Describe <code>afterPropertiesSet</code> method here.
     *
     * @exception Exception if an error occurs
     */
    public final void afterPropertiesSet() throws Exception {
	
    }


    /**
     * Describe <code>init</code> method here.
     *
     */
    public void init() {
	System.out.println("run init method");
    }

    public void clean() {
	System.out.println("run clean method");
    }

    /**
     * Creates a new <code>Reading</code> instance.
     *
     */
    public  Reading(ReadingList readingList){
	this.readingList = readingList;
    }
    
    /**
     * Gets the value of readingList
     *
     * @return the value of readingList
     */
    public final ReadingList getReadingList() {
	return this.readingList;
    }

    /**
     * Sets the value of readingList
     *
     * @param argReadingList Value to assign to this.readingList
     */
    public final void setReadingList(final ReadingList argReadingList) {
	this.readingList = argReadingList;
    }

}

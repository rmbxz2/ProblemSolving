package scjpThread;


/**
 * Describe class NameRunnable here.
 *
 *
 * Created: Thu Feb  2 19:22:11 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class NameRunnable implements Runnable {

    /**
     * Creates a new <code>NameRunnable</code> instance.
     *
     */
    public NameRunnable() {

    }

    // Implementation of java.lang.Runnable

    /**
     * Describe <code>run</code> method here.
     *
     */
    public final void run() {
	for (int index = 0; index < 4; index++) {
	    System.out.println(""+Thread.currentThread().getName()+ " index = "+ index);
	}
    }
}

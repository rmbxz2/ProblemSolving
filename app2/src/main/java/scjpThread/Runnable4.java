package scjpThread;


/**
 * Describe class Runnable4 here.
 *
 *
 * Created: Sat Feb 18 08:39:31 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class Runnable4 implements Runnable {
    private int counter=0;
    /**
     * Creates a new <code>Runnable4</code> instance.
     *
     */
    public Runnable4() {

    }

    // Implementation of java.lang.Runnable

    /**
     * Describe <code>run</code> method here.
     *
     */
    public final void run() {
	Thread.yield();
	System.out.println("run my runnble " + (counter++) + " thread name  " + Thread.currentThread().getName() +" getId =  " +Thread.currentThread().getId());
	
    }

}

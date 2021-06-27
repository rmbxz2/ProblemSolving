package scjpThread;

/**
 * Describe class Thread13 here.
 *
 *
 * Created: Sat Feb 18 08:59:13 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class Thread13 extends Thread {

    /**
     * Creates a new <code>Thread13</code> instance.
     *
     */
    public Thread13() {

    }

    /**
     * Describe <code>run</code> method here.
     *
     */
    public final void run() {
	System.out.println(" thread 13 run its own run" +  "thread name  " + Thread.currentThread().getName() );
    }


}

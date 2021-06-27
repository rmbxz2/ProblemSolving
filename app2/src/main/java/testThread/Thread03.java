package testThread;


/**
 * Describe class Thread03 here.
 *
 *
 * Created: Sun Oct  8 10:31:11 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class Thread03 implements Runnable {
    /**
     * Describe <code>run</code> method here.
     *
     */
    public  final void run() {

	try {

	    for (int index = 0; index < 5; index++) {
		System.out.println("hiiii-"+index  +" ==>> "+ Thread.currentThread().getName());
		Thread.sleep(1000); 
	    }
	} catch (Exception e) {
	    System.out.println("interrupted thread03 thread");
	}
    }

}

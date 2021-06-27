package scjpThread;

/**
 * Describe class Thread2 here.
 *
 *
 * Created: Sun Jan 22 13:08:14 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class Thread2 {

    /**
     * Describe <code>main</code> method here.
     *
     * @param args a <code>String</code> value
     */
    public static void main(String[] args) {
	MyThread ahmedThread = new MyThread(" Ahmed this  ");
	MyThread2 aliThread  = new MyThread2(" Ali ");
	Thread    mainThread = Thread.currentThread();
	try {
	    for (int index = 0; index < 10; index++) {
		// first and last thread startup and shutdown  is the main thread 
		System.out.println("Main thread name = "+ mainThread.getName());
		Thread.sleep(500);  // sleep 0.5  second
	    }
	} catch (InterruptedException  e) {
	    System.out.println("Main thread is Interrupted ");
	}
	
    }


}

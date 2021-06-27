package scjpThread;

/**
 * Describe class Thread12 here.
 *
 *
 * Created: Sat Feb 18 08:40:32 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class Thread12 {

    /**
     * Creates a new <code>Thread12</code> instance.
     *
     */
    public Thread12() {

    }
    
    /**
     * Describe <code>main</code> method here.
     *
     * @param args a <code>String</code> value
     */
    public static void main(String[] args) {
	Runnable4 runnable4 = new Runnable4( );
	Thread thread12 = new Thread(runnable4);
	// thread12 in new state, at this line 
	thread12.start();


	Thread13 thread13 = new Thread13(); // thre thread12x will run it is own run();
	thread13.start();

	// multi threads with one target runnable
	// thread( worker), runnable(job)
	Thread thread1 =new Thread(runnable4);
	Thread thread2 =new Thread(runnable4);
	Thread thread3 =new Thread(runnable4);
	// not started yet, so not  a live threads (still in the new state)
	thread1.start();
	thread2.start();
	thread3.start();
	//	thread3.start(); // java.lang.IllegalThreadStateException which is type of runTimeException

	System.out.println("thread main is  name =   " + Thread.currentThread().getName() +"thread main getId =  "  + Thread.currentThread().getId());
	// cliams
    }
}


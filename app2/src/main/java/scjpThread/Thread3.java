package scjpThread;

/**
 * Describe class Thread3 here.
 *
 *
 * Created: Mon Jan 23 08:45:39 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class Thread3 {

    public static void main(String[] args) {
	// t1.join() stop t2  until t1 terminates?
	// t1.join() stop main_thread  until t1 terminates?
	// t1.join() stop main_thread  until t1 terminates?
	Runnable1 run1 = new Runnable1("first",1000);
	Runnable1 run2 = new Runnable1("second",2000);	
	Runnable1 run3 = new Runnable1("third",3000);
	Thread    mainThread = Thread.currentThread();
	try {
	    // run3.join() stop main_thread  until run3  terminates?
	    System.out.println("thread run3 is alive(true) ==>"+ run3.thread.isAlive()); // run3 true
	    run3.thread.join(); // run3.thread.join() stop stop stop stop stop (current thread mainThread)  until run3  terminates 
	    System.out.println("thread run3 is dead(false) ==> "+ run3.thread.isAlive()); // run3 false
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

package testThread;

/**
 * Describe class Thread05 here.
 *
 *
 * Created: Sun Oct  8 11:06:16 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class Thread05 {

    public static void main(String[] args) {
	// main thread
	Thread thread01 = Thread.currentThread(); 

	Runnable runnable06 = new Thread06(); // job
	Thread thread06 = new Thread(runnable06,"thread06");// worker, stack
	    
	// this is the join, stop(waiting) thread07, then run and finish thread06
	Runnable runnable07 = new Thread07(thread06); // job
	Thread thread07 = new Thread(runnable07,"thread07"); // worker,stack

	thread06.start();
	thread07.start();

	// try {
	//     for (int index = 0; index < 5; index++) {
	// 	Thread.sleep(3000);
	// 	System.out.println("=================");	    
	// 	System.out.println("thread01 thread live =  "+ thread01.isAlive());
	// 	System.out.println("thread06 thread live =  "+ thread06.isAlive());
	// 	System.out.println("thread07 thread live =  "+ thread07.isAlive());
	// 	System.out.println("=================");	    
	//     }
	// } catch (Exception e) {
	//     System.out.println("main thread interrupted");
	// }

    }
}

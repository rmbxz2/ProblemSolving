package scjpThread;



/**
 * Describe class <code>Thread8Deadlock</code> here.
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */

public class Thread8Deadlock {
    public static Object Lock1 = new Object();
    public static Object Lock2 = new Object();
    public static Object Lock3 = new Object();
   
    /**
     * Describe <code>main</code> method here.
     *
     * @param args a <code>String</code> value
     */
    public static void main(String args[]) {
	ThreadDemo1 T1 = new ThreadDemo1();
	ThreadDemo2 T2 = new ThreadDemo2();
	T1.start();
	T2.start();
    }
   


    /**
     * Describe class <code>ThreadDemo1</code> here.
     *
     */
    private static class ThreadDemo1 extends Thread {
	public void run() {
	    synchronized (Lock1) {
		System.out.println("Thread 1: Holding lock 1...");
            
		try { Thread.sleep(10); }
		catch (InterruptedException e) {}
		System.out.println("Thread 1: Waiting for lock 2...");
            
		synchronized (Lock2) {
		    System.out.println("Thread 1: Holding lock 1 & 2...");
		}

		synchronized (Lock3) {
		    System.out.println("Thread 1: Holding lock 1 & 2...");
		}

	    }
	}
    }



    /**
     * Describe class <code>ThreadDemo2</code> here.
     *
     */

    private static class ThreadDemo2 extends Thread {
	/**
	 * Describe <code>run</code> method here.
	 *
	 */
	public void run() {
	    synchronized (Lock2) {
		System.out.println("Thread 2: Holding lock 2...");
            
		try { Thread.sleep(10); }
		catch (InterruptedException e) {}
		System.out.println("Thread 2: Waiting for lock 1...");
            
		synchronized (Lock1) {
		    System.out.println("Thread 2: Holding lock 1 & 2...");
		}
	    }
	}
    } 
}








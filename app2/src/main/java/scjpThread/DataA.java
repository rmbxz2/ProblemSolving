package scjpThread;

/**
 * Describe class DataA here.
 *
 *
 * Created: Tue Jan 24 14:05:28 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class DataA {

        private int sum=0;

    /**
     * Describe <code>print</code> method here.
     *
     * @param name a <code>String</code> value
     */
    //    public synchronized  void print(String name) {
    synchronized    public  void printA(String name,DataB dataB) {
	System.out.println("");
	System.out.print("["+ name );
	System.out.print(": "+ sum++ );
	try {
	    Thread.sleep(1000);
	} catch (InterruptedException e) {
	    System.out.println("interrupted print ");
	}
	System.out.print(" : "+name + "] ");
	System.out.println("");
	dataB.printBDeadLock();
    }

    /**
     * Describe <code>printDeadLock</code> method here.
     *
     */
    synchronized    public void printADeadLock( ) {
	System.out.println("deadlock 1");
    }

    
}

package scjpThread;

/**
 * Describe class MyThread2 here.
 *
 *
 * Created: Mon Jan 23 07:24:41 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class MyThread2 extends Thread {

    private int counter=0;
    /**
     * Creates a new <code>MyThread2</code> instance.
     *
     */
    public MyThread2(String name) {
	super(name);
	System.out.println("Ali thread start  "+this);
	this.start();
    }

    /**
     * Describe <code>run</code> method here.
     *
     */
    public final void run() {
	try {

	    for (int index = 0; index <10; index++) {
		try {
		    System.out.println("Ali thread name  ="+this.getName()+" "+ counter);
		} finally {
		}
		Thread.sleep(4000); // (interrupt thread-id)  will throw the exception InterruptedException 
	    }
	} catch (InterruptedException e) {
	    System.out.println("Ali thread interrupted ");
	}
    }
}



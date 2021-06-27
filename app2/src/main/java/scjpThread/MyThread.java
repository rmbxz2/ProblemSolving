package scjpThread;

/**
 * Describe class MyThread here.
 *
 *
 * Created: Sun Jan 22 13:08:53 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class MyThread extends Thread {

    /**
     * Creates a new <code>MyThread</code> instance.
     *
     */
    public MyThread(String name) {
	super(name);  
	System.out.println("Ahhhhhhhhhmed thread started  "+this);
	this.start(); // run thread 
    }

    /**
     * Describe <code>run</code> method here.
     * override run method 
     */
       public void run() {
	try {

	    for (int index = 0; index < 10; index++) {
		System.out.println("Ahmed thread name  = "+ this.getName());
		Thread.sleep(1000); // (interrupt thread-id)  will throw the exception InterruptedException
	    }  
	} catch (InterruptedException e) {
	    System.out.println("Ahmed Thread Interrupted  ");
	}

    }

}


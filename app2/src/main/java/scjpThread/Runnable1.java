package scjpThread;


/**
 * Describe class Runnable1 here.
 *
 *
 * Created: Mon Jan 23 08:49:20 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class Runnable1 implements Runnable {

    private  long sleepDuration;
    public  Thread thread;
    private  int counter =0;
    /**
     * Creates a new <code>Runnable1</code> instance.
     *
     */
    public Runnable1(String name,long sleepDuration ) {
	//Thread ( ThreadGroup group, Runnable target, String name,long stackSize)
	this.sleepDuration = sleepDuration;
	thread = new Thread(this,name);
	thread.start();
    }

    // Implementation of java.lang.Runnable

    /**
     * Describe <code>run</code> method here.
     *
     */
    public final void run() {
	try {
	    for (int index = 0; index < 10; index++) {
       		System.out.println("thread name is "+ thread.getName()+ " "+ counter);
		Thread.sleep(sleepDuration);
	    }
	} catch (InterruptedException e) {
	    System.out.println("interrupted thread name "+thread.getName());
	}
    }

}


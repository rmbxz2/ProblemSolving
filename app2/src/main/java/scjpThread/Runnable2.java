package scjpThread;


/**
 * Describe class Runnable2 here.
 *
 *
 * Created: Mon Jan 23 13:07:35 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class Runnable2 implements Runnable {

    long sleepDuration;
    Thread thread;
    Runnable2 runnable;
    int counter=0;
    /**
     * Creates a new <code>Runnable2</code> instance.
     *
     */
    public Runnable2(String name,long sleepDuration,Runnable2 runnable) {
       	this.sleepDuration = sleepDuration;
	this.runnable = runnable;
	thread =new Thread(this,name);
	thread.start();
    }

    // Implementation of java.lang.Runnable

    /**
     * Describe <code>run</code> method here.
     *
     */
    public final void run() {
	try {
	    if(runnable !=null){
		System.out.println("thread "+runnable.thread.getName()+" life =  "+runnable.thread.isAlive());
		runnable.thread.join();
		System.out.println("thread "+runnable.thread.getName()+" life =  "+runnable.thread.isAlive());
	    }
	    for (int index = 0; index < 10; index++) {
		System.out.println("thread name is "+ thread.getName() + " "+ counter++);
		Thread.sleep(sleepDuration);
	    }
	} catch (InterruptedException e) {
	    System.out.println("interrupted thread "+ thread.getName());
	}
    }

}

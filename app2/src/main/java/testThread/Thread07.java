package testThread;


public class Thread07 implements Runnable {

    private Thread thread;
    public Thread07(Thread thread){
	this.thread=thread;
    }
    /**
     * Describe <code>run</code> method here.
     *
     */
    public final void run() {
	try {
	    // thread06 is working and stop thread07, then thread06 is die then   thread 07 will enter runnable state,
	    thread.join(0);  // 4s not die, 6s is die, 0(wait for ever)
	    System.out.println("thread06 is live = "+thread.isAlive());// worker thread06 live

	    for (int index = 0; index < 5; index++) {
		System.out.println("bye-"+index +" ==>> "+ Thread.currentThread().getName());
		Thread.sleep(1000);
	    }
	} catch (Exception e) {
	    System.out.println("interrupted thread");
	}
    }
}

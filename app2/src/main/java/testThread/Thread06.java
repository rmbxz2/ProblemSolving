package testThread;


public class Thread06 implements Runnable {
    /**
     * Describe <code>run</code> method here.
     *
     */
    public final void run() {
	try {

	    for (int index = 0; index < 5; index++) {
		System.out.println("hiiii-"+index +" ==>> "+ Thread.currentThread().getName());
		Thread.sleep(1000);
	    }
	} catch (Exception e) {
	    System.out.println("interrupted thread");
	}
    }
}

package testThread; 

/**
 * Describe class DataC here.
 *   *nmap | grep -e sxV only
 *    nmap | grep    sV only
 *
 * Created: Thu Jan 26 14:25:10 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class DataC {

    private int number;
    private boolean state=false;

    /**
     * Describe <code>setData</code> method here.
     *
     * @param d an <code>int</code> value
     */
      public synchronized void setData(int d ) {
	if (state) {
	    try {
		System.out.println("a make thread waiting "+ " ==>> "+ Thread.currentThread().getName());
		wait(); //enter me(as producer) to waiting pool, and release locks  // 2
	    } catch (InterruptedException  e) {
		System.out.println("ineterrupted wait in setData");
	    }
	}
	number= d ;
	System.out.println("set :- "+ number  +" ==>> "+ Thread.currentThread().getName()); // set 1
	state=true; // so then next loop for i will go to wait() to release locks, i(thread) will wait my self
	notify();  // if removed, thread producer will not wake up
	// notify keep locks, so must go to wait to release locks
    }

    /**
     * Describe <code>getData</code> method here.
     *
     * @return an <code>int</code> value
     */
    public synchronized void getData() {
	if (!state) {
	    try {
		System.out.println("make thread waiting"+ " ==>> "+ Thread.currentThread().getName());
		wait(); //enter me(as consumer) to waiting pool, and release locks
	    } catch (InterruptedException e) {
		System.out.println("interrupted wait in getData");
	    }
	}
	System.out.println("Get:- "+number  +" ==>> "+ Thread.currentThread().getName()); // get 0 consumer ,get 1 
	state=false; // so then next loop for i will go to wait() to release locks, i(thread) will wait my self
	notify();  // if removed, thread consumer  will not wake up
	// notify keep locks, so must go to wait() to release locks
    }
}

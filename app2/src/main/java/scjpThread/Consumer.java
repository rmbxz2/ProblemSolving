package scjpThread;

/**
 * Describe class Consumer here.
 *
 *
 * Created: Thu Jan 26 14:53:35 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class Consumer extends Thread {

    private DataC dataC;
    private int count= 10;

    /**
     * Creates a new <code>Consumer</code> instance.
     *
     */
    public  Consumer(DataC dataC,String name) {
	super(name);
	this.dataC=dataC;
     }

    /**
     * Describe <code>run</code> method here.
     *
     */
    public final void run() {

	while (count-- >0) {
	    dataC.getData();
	}
    }
}

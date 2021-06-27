package testThread; // Generated package name



/**
 * Describe class Producer here.
 *
 *
 * Created: Thu Jan 26 14:52:39 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class Producer extends Thread {


    private DataC dataC;
    /**
     * Creates a new <code>Producer</code> instance.
     *
     */
    public Producer(DataC dataC,String name) {
	super(name);// new Thread("producer");
	this.dataC=dataC;
    }

    /**
     * Describe <code>run</code> method here.
     *
     */
    public final void run() {
	for (int index = 0; index < 10; index++) { 
	    dataC.setData(index);  // 0 , 1 ,2 
	}
    }
}

package scjpThread;


/**
 * Describe class Runnable3 here.
 *
 *
 * Created: Tue Jan 24 11:19:26 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class Runnable3 implements Runnable {

    private String name;
    private Data data ;
    private Thread thread;
    /**
     * Creates a new <code>Runnable3</code> instance.
     *
     */
    public Runnable3(Data data, String name) {
	this.name = name;
	this.data = data;
	thread=new Thread(this,name);
	thread.start();
    }

    // Implementation of java.lang.Runnable

    /**
     * Describe <code>run</code> method here.
     *
     */
    public final void run() {
	synchronized(data){
	    data.print(name);
	}
    }

}

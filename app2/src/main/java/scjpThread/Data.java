package scjpThread;

/**
 * Describe class Data here.
 *
 *
 * Created: Tue Jan 24 11:14:24 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class Data {

    private int sum=0;

    /**
     * Describe <code>print</code> method here.
     *
     * @param name a <code>String</code> value
     */
    //    public synchronized  void print(String name) {
    public  void print(String name) {
	System.out.println("");
	System.out.print("["+ name );
	System.out.print(": "+ sum++ );
	try {
	    System.out.print(": sleep 1 sec for thread  "+name);
	    Thread.sleep(1000);
	} catch (InterruptedException e) {
	    System.out.println("interrupted print ");
	}
	System.out.print(" : "+name + "] ");
	System.out.println("");
    }
}

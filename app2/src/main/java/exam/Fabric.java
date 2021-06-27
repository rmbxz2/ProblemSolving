package exam;

/**
 * Describe class Fabric here.
 *
 *
 * Created: Sun Jul  1 13:54:15 2018
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class Fabric extends Thread {

    /**
     * Describe <code>main</code> method here.
     *
     * @param args a <code>String</code> value
     */
    public static void main(String[] args) {
	Thread t1 = new Thread(new Fabric());
	Thread t2 = new Thread(new Fabric());
	t1.start();
	t2.start();
    }
    
    public  void run() { // cant be static 
	for (int index = 0; index < 10; index++) {
	    System.out.println(Thread.currentThread().getName());
	}
    }
    
}

package testThread;

/**
 * Describe class Thread02 here.
 *
 *
 * Created: Sun Oct  8 10:30:43 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class Thread02 {

	public static void main(String[] args) {
	    Runnable runnable03 = new Thread03(); // job 1
	    Runnable runnable04 = new Thread04(); // job 2

	    Thread thread03 = new Thread(runnable03,"thread03"); // worker ,stack
 	    Thread thread04 = new Thread(runnable04,"thread04"); // worker ,stack

	    // Thread thread03 = new Thread(new Thread03());
 	    // Thread thread04 = new Thread(new Thread04());
	    
	    thread03.start();
	    thread04.start();
	}
}

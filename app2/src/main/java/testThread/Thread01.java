package testThread;


/**
 * Describe class Thread01 here.
 *
 *
 * Created: Sun Oct  8 07:36:32 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class Thread01 {
    
    public static void main(String[] args) {

	Thread thread1 = Thread.currentThread(); // worker, stack

	System.out.println("current thread=> "+thread1); 
	thread1.setName("my_thread_main");
	System.out.println("current thread name=> "+ thread1.getName());
	thread1.setPriority(9); //1-10 ,5 default
	System.out.println("current thread priority=> "+ thread1.getPriority());
	System.out.println("current thread=> "+thread1);
	try {
	    for (int index = 0; index < 5; index++) {
		System.out.println("welcome-"+index);
		Thread.sleep(1000*1); // 1 second
	    }	    
	} catch (Exception ex) {
	    System.out.println("main thread interrupted first ");
	}
    }
}

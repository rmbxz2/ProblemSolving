package scjpThread;

/**
 * Describe class <code>Thread10</code> here.
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class Thread10 {
    public static void main(String[] args) {
	NameRunnable rn = new NameRunnable();
	Thread thread1 = new Thread(rn);
	Thread thread2 = new Thread(rn);
	Thread thread3 = new Thread(rn);
	thread1.setName("first");
        thread2.setName("second");
        thread3.setName("third");
        thread1.start();
	thread2.start();
	thread3.start();
    }
}

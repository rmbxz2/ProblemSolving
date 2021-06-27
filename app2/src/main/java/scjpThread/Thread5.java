package scjpThread;

/**
 * Describe class Thread5 here.
 *
 *
 * Created: Mon Jan 23 13:04:23 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class Thread5 {

    /**
     * Creates a new <code>Thread5</code> instance.
     *
     */
    public Thread5() {

    }

    /**
     * Describe <code>main</code> method here.
     *
     * @param args a <code>String</code> value
     */
    public static void main(String[] args) {
	//	Runnable  run1 = new Runnable1("first" ,2000);
	// run1.join()run2;; stop run2 until run1 terminates 
	Runnable2  run1 = new Runnable2("first",500,null);
	Runnable2  run2 = new Runnable2("second",500,run1);
	Runnable2  run3 = new Runnable2("third",500 ,run2);
	Runnable2  run4 = new Runnable2("fourth",500,run3);

	//	run1.thread.start();
	
	}

    }


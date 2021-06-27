package scjpThread;

/**
 * Describe class Thread11 here.
 *
 *
 * Created: Sat Feb 18 07:34:44 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class Thread11 extends Thread {

    /**
     * Describe <code>run</code> method here.
     *
     */
    public final void run() {
	System.out.println(" 1- important job running in my thread");
    }

    /**
     * Describe <code>run</code> method here.
     *
     * @param s a <code>String</code> value
     */
    public final void run(String s) {
	System.out.println(" 2- overloaded method run, cant run unitl you call it by yourself");
    }


    /**
     * Describe <code>main</code> method here.
     *
     * @param args a <code>String</code> value
     */
    public static void main(String[] args) {
	Thread11 thread11 = new Thread11( );
	thread11.start();
	thread11.run("hi sir");
    }
}

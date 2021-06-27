package scjpThread;

/**
 * Describe class Thread6 here.
 *
 *
 * Created: Tue Jan 24 11:09:25 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class Thread6 {

    public static void main(String[] args) {
	Data data = new Data( );
	Runnable3 run1 = new Runnable3(data,"first");
	Runnable3 run2 = new Runnable3(data,"second");
	Runnable3 run3 = new Runnable3(data,"third");
	Runnable3 run4 = new Runnable3(data,"fourth");
	Runnable3 run5 = new Runnable3(data,"fifth");
	System.out.println("main finished");
    }
}

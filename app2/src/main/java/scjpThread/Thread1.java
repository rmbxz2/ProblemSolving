package scjpThread;



/**
 * Describe class Thread1 here.
 *
 *
 * Created: Sat Jan 21 14:15:29 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class Thread1  {

    static int y=1;
    static int z=1;
    /**
     * Creates a new <code>Thread1</code> instance.
     *
     */
    public Thread1() {

    }

    public static void main(String[] args) {
	method1();
    }
    
    /**
     * Describe <code>method1</code> method here.
     *
     */
    public static void method1() {
	int x=1;
	y=2;
	z=3;
	System.out.println("x="+ x);
	method2();
    }
    /**
     * Describe <code>method2</code> method here.
     *
     */
    public static void method2() {
	int x=2;
	y=3;
	z=4;
	System.out.println("x="+ x);
	method3();
    }
    /**
     * Describe <code>method2</code> method here.
     *
     */
    public static void method3() {
	int x=2;
	y=4;
	z=5;
	System.out.println("x="+ x);
    }
}

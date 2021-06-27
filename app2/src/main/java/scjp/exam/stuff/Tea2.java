package scjp.exam.stuff;
/**
 * Describe class Tea2 here.
 *
 *
 * Created: Fri Jul 14 23:29:00 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class Tea2 extends Car implements Callable {
    
    //private   int x;
    protected int y;

    /**
     * Describe <code>goSpeed</code> method here.
     *
     */
    public final void goSpeed() {
	//    Callable.YEAR=22;
	 
    }
    
    // Implementation of scjp.exam.stuff.Callable

    /**
     * Describe <code>goFirst</code> method here.
     *
     */
    public final void goFirst() {
	// 	price=22;
 	//String s =go();
	System.out.println(Callable.YEAR);
	

    }

    /**
     * Describe <code>goSlow</code> method here.
     *
     */
    public final void goSlow() {

    }

    /**
     * Describe <code>goFast</code> method here.
     *
     */
    public final void goFast() {

    }
    
    public static void main(String[] args) {
	//Car car = new Car();
	System.out.println("hi2");
	
    }
    
}


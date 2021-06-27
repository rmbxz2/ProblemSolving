package scjp;

import scjp.exam.stuff.SmallTea;
import scjp.exam.stuff.Tea;

import static java.lang.System.out;
import static java.lang.Integer.*;

// import static java.lang.Long.*;
/**
 * Describe class Java1 here.
 *
 *
 * Created: Fri Jul 14 21:07:08 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class Java1 extends SmallTea {
    // transient
    int _a;
    int $b;
    // strictfp    int $b;  // error, Illegal modifier for the field $b; only public, protected, private, static, final, transient & volatile are permitted

    /**
     * Describe <code>main</code> method here.
     *
     */
    public static void main(String...  x) {
	out.println("x0 = "+ x[0]);
	out.println("x1 = "+ x[1]);
	out.println("x2 = "+ x[2]);
	out.println("max =   "+ MAX_VALUE);
    }

    /**
     * Describe <code>main</code> method here.
     *
     * @param args an <code>int</code> value
     */
    // overloading main 
    public static void main(int x, String [] args) {

    }

    /**
     * Describe <code>name</code> method here.
     *
     */
    public void name( ) {
	out.println("max =   "+ MAX_VALUE);
	//Tea tea = new Tea( );
	//		 tea.getSmallAge();
	
	//		 this.smallAge=22;
	//       final protected  int xyz;

	//SmallTea smallTea = new SmallTea( );
	//	smallTea.getSmallAge();
	
    }


    /**
     * Describe <code>getSmallAge</code> method here.
     *
     * @return an <code>int</code> value
     */
    public int getSmallAge() { 
	//	 Beverage bb = new Beverage();
	//bb.smallAge=88;
	return 5;
    }


}

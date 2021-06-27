package ch3;

/**
 * Describe class Example2 here.
 *
 *
 * Created: Wed Oct 25 19:29:06 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class Example2 {

    /**
     * Describe <code>main</code> method here.
     *
     * @param args a <code>String</code> value
     */
    public static void main(String[] args) {



	try {
	    doStuff(1);
	} catch (MyException  e) {
	    //	    e.myMessage();  // catch caught,
	    //System.out.println(e.getMessage());
	    e.printStackTrace();
	}
    }    
    /**
     * Describe <code>doStuff</code> method here.
     *
     */
    static void doStuff(int x) throws MyException{

	doMoreStuff(x);
    }
    /**
     * Describe <code>doMoreStuff</code> method here.
     *
     */
    // what is the checked exception
    // exception must have decleared or catch(handle), not runtimeException, not Nullpex
    // you are free to declare the Error extends Throwable, Exception extends Throwable
    static void doMoreStuff(int x) throws MyException {
	if (x >= 10)
 	    throw   new MyException("Ahmed Ali x cant be more than 10");
     }
}

package ch3;

/**
 * Describe class MyException here.
 *
 *
 * Created: Wed Oct 25 19:35:00 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class MyException extends Exception{
private static final long serialVersionUID = 6666345634567760070L;
    //private  String message;

    /**
     * Creates a new <code>MyException</code> instance.
     *
     */
    public MyException() {

    }
    /**
     * Creates a new <code>MyException</code> instance.
     *
     */
    public  MyException(String message){
		super(message);
	//	this.message=message;
    }

    /**
     * Describe <code>myMessage</code> method here.
     *
     */
    public void myMessage() {
	//	System.out.println("no no no no, cant be more than 10  Mr. Ahmed Ali");
	//	System.out.println("Mr. ahmed message = "+ message);
    }

}

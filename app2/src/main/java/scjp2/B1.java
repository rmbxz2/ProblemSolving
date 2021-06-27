package scjp2;

/**
 * Describe class B1 here.
 *
 *
 * Created: Mon Apr  8 19:41:17 2019
 *
 * @author <a href="mailto:root@zink">root</a>
 * @version 1.0
 */
public class B1 {

    private int c;
    /**
     * Creates a new <code>B1</code> instance.
     *
     */
    public B1() {
	c=3;
    }

    static{
	System.out.println("static init block for B1");
    }

    // instance init block for B1
    {
	System.out.println("instance init block for B1");
    }



}

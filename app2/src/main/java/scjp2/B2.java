package scjp2;

/**
 * Describe class B2 here.
 *
 *
 * Created: Mon Apr  8 19:41:38 2019
 *
 * @author <a href="mailto:root@zink">root</a>
 * @version 1.0
 */
public class B2 extends B1 {

    private int y;
    /**
     * Creates a new <code>B2</code> instance.
     *
     */
    public B2() {
	y=2;
    }

    static{
	System.out.println("static init block for B2");
    }

    // instance init block for B2
    {
	System.out.println("instance init block for B2");
    }

}

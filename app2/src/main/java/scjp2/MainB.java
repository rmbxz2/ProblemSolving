package scjp2;

/**
 * Describe class MainB here.
 *
 *
 * Created: Mon Apr  8 19:42:03 2019
 *
 * @author <a href="mailto:root@zink">root</a>
 * @version 1.0
 */
public class MainB extends B2 {
    private int x;
    /**
     * Creates a new <code>MainB</code> instance.
     *
     */
    public MainB() {
        x = 1;
    }

    public MainB(int x) {
        x = 1;
    }

    // instance init blocks
    {
        System.out.println("instance init blocks run every time new instance "
                + "is created, run after all super() and before constructor cod has run");
    }

    // instance init blocks
    static {
        System.out.println("static init blocks run once  when the class first loaded");
        // flymake-log-level
    }

    /**
     * Describe <code>main</code> method here.
     *
     * @param args a <code>String</code> value
     */
    public static void main(String[] args) {
        MainB mainB1 = new MainB();
        MainB mainB2 = new MainB(6);
        MainB mainB3 = new MainB();
    }
}

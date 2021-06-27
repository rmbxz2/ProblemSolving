package scjp2;

/**
 * Describe class MyByte here.
 *
 *
 * Created: Tue Apr  9 09:23:56 2019
 *
 * @author <a href="mailto:root@zink">root</a>
 * @version 1.0
 */
public class MyByte {
    Byte a1 = (byte) 128; // (a1 == a2) true, have same object
    Byte a2 = (byte) 128;
    Integer b1 = 126; // (b1==b2) true, have same object
    Integer b2 = 126;
    Boolean c1 = true; // (c1==c2) true, have same object
    Boolean c2 = true;

    Byte aa1 = new Byte("126"); // (a11 == aa2) false
    Byte aa2 = new Byte("126");
    Integer bb1 = new Integer(125); // (bb1==bb2) false
    Integer bb2 = new Integer(125);
    Boolean cc1 = new Boolean(true); // (cc1==cc2) false
    Boolean cc2 = new Boolean(true);

    /**
     * Creates a new <code>MyByte</code> instance.
     *
     */
    public MyByte() {}

    /**
     * Describe <code>noEqual</code> method here.
     *
     */
    public void noEqual() {
        System.out.println("less than 127 will be equal ");
        System.out.println("a1  == a2 " + (a1 == a2)); // true
        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);
        System.out.println("b1  == b2 " + (b1 == b2)); // true
        System.out.println("c1  == c2 " + (c1 == c2)); // true
        System.out.println("aa1  == aa2 " + (aa1 == aa2)); // false
        System.out.println("bb1  == bb2 " + (bb1 == bb2)); // false
        System.out.println("cc1  == cc2 " + (cc1 == cc2)); // false
    }

    /**
     * Describe <code>main</code> method here.
     *
     * @param args a <code>String</code> value
     */
    public static void main(String[] args) {
        MyByte myByte = new MyByte();
        myByte.noEqual(); 
    }
}

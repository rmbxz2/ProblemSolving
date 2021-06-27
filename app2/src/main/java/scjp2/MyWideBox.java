package scjp2;

/**
 * Describe class MyWideBox here.
 *
 *
 * Created: Tue Apr  9 11:54:36 2019
 *
 * @author <a href="mailto:root@zink">root</a>
 * @version 1.0
 */
public class MyWideBox {

    /**
     * Describe <code>go</code> method here.
     *
     * @param x an <code>int</code> value
     */
    public void go(int x) {
	System.out.println(x+ " = x is an int");
    }

    /**
     * Describe <code>go</code> method here.
     *
     * @param x an <code>Integer</code> value
     */
    public void go(Integer x) {
	System.out.println(x+ " = x is an Integer");
    }


    /**
     * Describe <code>go</code> method here.
     *
     * @param x a <code>loing</code> value
     */
    public void go(long x) {
	System.out.println(x+ " = x is an long");
    }

    /**
     * Describe <code>go</code> method here.
     *
     * @param x a <code>long</code> value
     */
    public void go(Long x) {
	System.out.println(x+ " = x is an Long");
    }    

    /**
     * Describe <code>go</code> method here.
     *
     */
    public void go(Float... x ) {
	System.out.println(x+ " = x is an Folat... x");
    }    


    public static void main(String[] args) {
	MyWideBox myWideBox = new MyWideBox();
	byte b=1;
	int i=2;;
	long l=3;
	Byte b2=4;
	Integer i2=5;
	Long l2 = 6L;
	float f1=2.0f;
	myWideBox.go(b);// int
	myWideBox.go(i);// int
	myWideBox.go(l);// Long
	myWideBox.go(b2);// int
	myWideBox.go(i2);// Integer
	myWideBox.go(l2);// Long
	myWideBox.go(f1);// int
    }
}

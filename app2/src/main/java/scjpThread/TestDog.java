package scjpThread;

/**
 * Describe class Animal here.
 *
 *
 * Created: Tue Feb 28 10:05:05 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class TestDog {
    TestDog i;
    public static void main(String[] args) {
	TestDog t1 = new TestDog();
	TestDog t2 = new TestDog();
	TestDog t3 = new TestDog();
	t1.i=t2;
	t2.i=t3;
	t3.i=t1;
	t1 = null;
	t2 = null;
	t3 = null;
    }
}

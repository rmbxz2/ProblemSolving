package upDownCast;

/**
 * Describe class MainA here.
 *
 *
 * Created: Wed Apr  3 17:31:42 2019
 *
 * @author <a href="mailto:root@zink">root</a>
 * @version 1.0
 */

public class MainA {

  /**
   * Creates a new <code>MainA</code> instance.
   *
   */

  public MainA() {}

  /**
   * Describe <code>main</code> method here.
   *
   * @param args a <code>String</code> value
   */

  public static void main(String[] args) {
    // System.out.println(Integer.MAX_VALUE);
    A1 a1 = new A3();
    A2 a2 = new A3();
    A3 a3 = new A3();
    A4 a4 = new A4();
    // A4 a4 = new A3(); // ref of subType cant refrer to super Type

    // (jdee-package-generate-package-statement)

    A1 u1 = (A1)a1; // upcast
    A1 u2 = (A1)a2; // upcast
    A1 u3 = (A1)a3; // upcast
    A1 u4 = (A1)a4; // upcast
    //      (A1)ref    upcast
    //      (A1)A1     upcast
    //      (A1)A2     upcast
    //      (A1)A3     upcast
    //      (A1)A4     upcast

    A2 d2 = (A2)a1; // downcast
    //  (obj)(A2)ref
    //   (A3)(A2)A1

    A3 d3 = (A3)a1; // downcast
    //  (obj)(A3)ref
    //   (A3)(A3)A1

    // A4 d4 =(A4)a1 ; // illegal downcat, compiles fine, but fail at runTime
    //  (obj)(A4)ref
    //   (A3)(A4)A1
    System.out.println("illegal downcat, compiles fine, but fail at runTime");

    // final rule to detect the illegal downcast is
    // A1 a1 = new A3();
    // A4 d4 =(A4)a1
    //        (A4)obj
    //        (A4)A3 if it is Tree down from A3 to A4 then it is illegal
    //        downcast
  }
}

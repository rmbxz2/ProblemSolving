package upDownCast;

/**
 * Describe class MyTest here.
 *
 *
 * Created: Tue Jan  8 22:24:19 2019
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class MyTest {

  public static void main(String[] args) {

    MyAnimal a = new MyDog();
    a.bbb(); // bbb

    // upcast
    MyObject obj1 = (MyObject)a;
    obj1.aaa(); // aaa

    // downcast
    MyDog d1 = (MyDog)a;
    d1.ccc(); // aaa(obj)   ,bbb(Animal),  ccc(Dog)

    if (a instanceof MyCat) { // false
      MyCat c1 = (MyCat)a;    // illegal downcast
      c1.ddd();               // ddd
    } else {
      System.out.println("illegal downcast");
    }
  }
}

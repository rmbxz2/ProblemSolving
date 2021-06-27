package ch2;


/**
 * Describe class Dog here.
 *
 *
 * Created: Tue Oct 17 07:15:58 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class Dog extends Animal {
    /**
     * Creates a new <code>Dog</code> instance.
     *
     */
    public Dog() {

    }


    /**
     * Describe <code>m1</code> method here.
     *
     */
    void m1(){
       System.out.println("m1 in Dog");
   }
    /**
     * Describe <code>m2</code> method here.
     *
     */
    public void m2(){
	System.out.println("m2 in Dog");
    }
    /**
     * Describe <code>m3</code> method here.
     *
     */
    public void m3(){
	System.out.println("m3 in Dog");
    }

    /**
     * Describe <code>main</code> method here.
     *
     * @param args a <code>String</code> value
     */

    public Animal m44() {
	return new Dog();
    }

    public static void main(String[] args) {

	 Animal a = new Dog();
	 //Dog d=(Dog)a; // must cast a-->d  in downcast
	// d.m1();
	// // d.m3();
	((Dog)a).m3();
	
	// Dog d = new Dog();
	// Animal a = d; // no need casting d-->a in upcast
	// a.m1();

	// Animal a = new Animal();
	// Dog d =(Dog) a; // compile fine, then at runtime classCastException
	// d.m1();

	// dog.m4();
	// super.m1(); //cant invoked in a static method
	  Dog dog = new Dog();
	 dog.m4ThatIsIt();
    }


    /**
     * Describe <code>m4</code> method here.
     *
     */
    public void m4ThatIsIt()  {
  	//	Dog d = new Dog();
	super.m1(); // cant use super in static context
   }
}

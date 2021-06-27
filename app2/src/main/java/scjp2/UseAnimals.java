package scjp2;

import java.util.Date;


/**
 * Describe class UseAnimals here.
 *
 *
 * Created: Sat Apr  6 11:00:56 2019
 *
 * @author <a href="mailto:root@zink">root</a>
 * @version 1.0
 */
public class UseAnimals {
    int globalx;

    /**
     * Describe <code>doStuff</code> method here.
     *
     * @param a an <code>Animal</code> value
     */
    public  void doStuff(Animal a) {
	System.out.println("Hi Animal");
    }
    
    /**
     * Describe <code>doStuff</code> method here.
     *
     * @param h a <code>Horse</code> value
     */
    public  void doStuff(Horse h) {
	System.out.println("Hi Horse");
    }
    /**
     * Describe <code>main</code> method here.
     *
     * @param args a <code>String</code> value
     */
    public static void main(String[] args) {
	int[][] x1 = new int[5][5];
	int[]   x2 = new int[5];
	x1[1][0]  = x2[1];
	x1[1][1]  = x2[1];
	x1[1][0]  = 'a';

	UseAnimals useAnimals = new UseAnimals();
	Animal animalRef = new Animal();
	Horse horseRef = new Horse();
	System.out.println("sound = " + horseRef.sound());
	System.out.println("sound = " + animalRef.sound());
	System.out.println("sound = " + horseRef.animalSound());
    	System.out.println("sound = " + horseRef.sound("hi welcome"));
	// Date  date ;
	// if(date  = null){
	//     System.out.println("date is equal null");
	// }
	Animal animalRefToHorseObject = new Horse();
	useAnimals.doStuff(animalRef);
	useAnimals.doStuff(horseRef);
	useAnimals.doStuff(animalRefToHorseObject);
	//	Object object = null;
	System.out.println("======immutable objects, no ref between them ==============");
	Integer t1=5;
	Integer t2=t1;
	System.out.println("t1 == t2 "+ (t1==t2)+" t1="+t1+" t2="+t2);
	t1=6;
	System.out.println("t1 == t2 "+ (t1==t2)+" t1="+t1+" t2="+t2);
	System.out.println("======immutable objects, no ref between them==============");
	String s1="ok";
	String s2=s1;
	System.out.println("s1 == s2 "+ (s1==s2)+" s1="+s1+" s2="+s2);
	s1="noo";
	System.out.println("s1 == s2 "+ (s1==s2)+" s1="+s1+" s2="+s2);


	

    }
}

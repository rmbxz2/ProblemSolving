package scjp.exam.stuff;

/*
enum CoffeSizeOk {
    BIG(11), HUGE(11,22), OVERTHREE(11,22,33);

    private int first;
    private int second;
    private int third;
    
    CoffeSizeOk(int first){
	this.first=first;
    }

    CoffeSizeOk(int first,int second){
	this.first=first;
	this.second=second;
    }

    CoffeSizeOk(int first,int second,int third){
	this.first=first;
	this.second=second;
	this.third=third;
    }

    public int getFirst(){
	return first;
    }

    public int getSecond(){
	return second;
    }

    public int getThird(){
	return third;
    }
}
*/

/**
 * Describe CLASS COFFETESTONE HERE.
 *
 *
 * Created: Sat Mar 30 13:57:05 2019
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class CoffeTestOne {
    CoffeSizeOk coffeSize;
    int counter=0;
    public static void main(String[] args) {
	CoffeTestOne coffeTestOne = new CoffeTestOne();
	coffeTestOne.counter =1;
	//System.out.println("coffeTestOne.coffeSize =  "+coffeTestOne.coffeSize);
	//System.out.println("coffeTestOne.coffeSize =  "+coffeTestOne.coffeSize.getFirst());
	coffeTestOne.coffeSize = CoffeSizeOk.OVERTHREE;
	coffeTestOne.counter = 2;
	System.out.println("coffeTestOne.coffeSize =  "+coffeTestOne.coffeSize);
	System.out.println("coffeTestOne.coffeSize =  "+coffeTestOne.coffeSize.getFirst());
	System.out.println("coffeTestOne.coffeSize =  "+coffeTestOne.coffeSize.getSecond());
	System.out.println("coffeTestOne.coffeSize =  "+coffeTestOne.coffeSize.getThird());
	coffeTestOne.coffeSize = CoffeSizeOk.HUGE;
	coffeTestOne.counter =3;
	System.out.println("coffeTestOne.coffeSize =  "+coffeTestOne.coffeSize);
	System.out.println("coffeTestOne.coffeSize =  "+coffeTestOne.coffeSize.getFirst());
	System.out.println("coffeTestOne.coffeSize =  "+coffeTestOne.coffeSize.getSecond());
	System.out.println("coffeTestOne.coffeSize =  "+coffeTestOne.coffeSize.getThird());
	coffeTestOne.coffeSize = CoffeSizeOk.BIG;
	coffeTestOne.counter =4;
	System.out.println("coffeTestOne.coffeSize =  "+coffeTestOne.coffeSize);
	System.out.println("coffeTestOne.coffeSize =  "+coffeTestOne.coffeSize.getFirst());
	System.out.println("coffeTestOne.coffeSize =  "+coffeTestOne.coffeSize.getSecond());
	System.out.println("coffeTestOne.coffeSize =  "+coffeTestOne.coffeSize.getThird());

    }
}

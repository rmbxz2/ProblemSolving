package scjp.exam.stuff;



enum CoffeSize {
    HUGE(22), OVER(33), TOO(1,2), TOOO(3,4), THREE(11,22,"MAN"), THREEE(44,55,"WOMAN"), BIG(1)  ;
    // CoffeSize THREE = new CoffeSize(11,22,"MAN");
    private int once;		 
    private int twice;
    private String third;

    CoffeSize(int once){
	this.once = once;
    }

    CoffeSize(int once, int twice) {
	this.once=once;
	this.twice=twice;
    }

    CoffeSize(int once, int twice, String third) {
	this.once=once;
	this.twice=twice;
	this.third=third;
    }


    public int getOnce(){
	return once;
    }


    public int getTwice(){
	return twice;
    }

    public String getThird(){
	return third;
    }
}


// class Coffe {
//     CoffeSize size;
// }
//    BIG(1), HUGE(22), OVER(33), TOO(1,2), TOOO(3,4), THREE(11,22,"MAN"), THREEE(44,55,"WOMAN");

public class CoffeTest1 {
     CoffeSize size;

    public static void main(String[] args) {
	// cant invoke enum constructor directly
	// CoffeSize name = new CoffeSize(10);
	//	Coffe drink = new Coffe();
	CoffeTest1 drink = new CoffeTest1();
	drink.size = CoffeSize.THREE;
	//	drink.size = CoffeSize.BIG;
	// THREE(11,22,"MAN")
	// System.out.println(CoffeSize.TOO.getThird());
	//      System.out.println(CoffeSize.TOO);
	//	System.out.println(drink.size);
	//             Big(1)
	System.out.println(CoffeSize.BIG.getTwice());
	//	System.out.println(drink.size.getThird());
	//	System.out.println(CoffeSize.BIG.getOnce());

	//	System.out.println(CoffeSize.values());

	// for (CoffeSize cs  : CoffeSize.values()) {
	//     //	    System.out.println(cs +"  "+cs.getOnce());
	//     //      System.out.println(cs +"  "+cs.getTwice());
	//     System.out.println(cs
	// 		       +"  "+cs.getOnce()
	// 		       +" "+cs.getTwice()
	// 		       +" "+cs.getThird()
	// 		       );
	// }
    }
}

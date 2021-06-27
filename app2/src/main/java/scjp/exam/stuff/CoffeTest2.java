package scjp.exam.stuff;

// enum outside class can be default or public(own class) 

class Coffee {
    enum CoffeeSize { BIG , HUSE ,OVER };
// enum outside class can be all access modifiers
    CoffeeSize coffeeSize;
}

public class CoffeTest2 {
    public static void main(String[] args) {


	Coffee	coffee = new Coffee();

	// enum outside the class
	 coffee.coffeeSize = Coffee.CoffeeSize.BIG;
	// System.out.println(CoffeeSize.BIG);
	// System.out.println(coffee.coffeeSize);

	// enum inside the class 
	 //	coffee.coffeeSize = Coffee.CoffeeSize.BIG;
	System.out.println(coffee.coffeeSize);

	
    }

}

package exam;

/**
 * Describe class BarnCat2 here.
 *
 *
 * Created: Sun Jul  1 14:36:23 2018
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */

class Feline {}

public class BarnCat2 extends Feline{
    public static void main(String[] args) {
	Feline ff = new Feline();
	//BarnCat2 b = new BarnCat2();
        //Feline b = new BarnCat2();
	if(ff  instanceof BarnCat2){
	    //	    BarnCat2 b=(BarnCat2)ff;
	    System.out.println("True");
	}else{
	    System.out.println("False");
	    System.out.println("\u0628\u0633\u0645 \u0627\u0644\u0644\u0647 \u0627\u0644\u0631\u062d\u0645\u0646 \u0627\u0644\u0631\u062d\u064a\u0645");
	}
    }
}

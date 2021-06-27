package scjp.exam.stuff;

/**
 * Describe class SmallTea here.
 *
 *
 * Created: Sun Jul 30 11:19:58 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class SmallTea extends Tea  {
    String[][] array ={
	{"what", "is", "your", "name"},
	{"what", "is", "your", "name"},
	{"20what", "is", "your", "23name"}
    };

    public void modifySmallTea() {
        int x=2;
	System.out.println(x);
	
	Tea tt = new Tea();
	//tt.smallAge=2;
        smallAge=22;
    }

   public int getSmallAge() { 
	 //	 Beverage bb = new Beverage();
	//bb.smallAge=88;
	 return	 smallAge;
}


}

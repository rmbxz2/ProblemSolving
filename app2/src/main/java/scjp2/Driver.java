package scjp2;


/**
 * Describe class Driver here.
 *
 *
 * Created: Fri Mar 22 15:57:09 2019
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class Driver extends FinalCar  {

    /**
     * Describe <code>goSpeed</code> method here.
     *
     */
    public final void goSpeed() {

    }


    /**
     * Describe <code>goDrive2</code> method here.
     *
     */
    public final void goDrive2() {

    }

    /**
     * Describe <code>goOne5</code> method here.
     *
     */
    public final void goOne5() {

    }
    
    public  String getCarName() {
     	return "Kia overriden";
    }


    public static void main(String[] args) {
	//Car car = new Car();
	//FinalCar car1 = new Driver();
	//Driver car2 = new Driver();
	//System.out.println(car1.getCarName()); // kia original but if no static => kia overriden
	//System.out.println(car2.getCarName()); // kia overriden
	// members are methods and instance variables
    } 
}

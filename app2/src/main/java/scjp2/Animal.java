package scjp2;

/**
 * Describe class Animal here.
 *
 *
 * Created: Sat Apr  6 10:59:27 2019
 *
 * @author <a href="mailto:root@zink">root</a>
 * @version 1.0
 */
public class Animal {

    Animal(){

    }
    /**
     * Describe <code>sound</code> method here.
     *
     * @return a <code>String</code> value
     */
    public String sound() {
	return "Animal sound";
    }

    /**
     * Describe <code>sound</code> method here.
     *
     * @param welcome a <code>String</code> value
     * @return a <code>String</code> value
     */
    public String sound(String welcome) {
	return ("method in superClass can be overloadded in a subclass "+ welcome);
    }
}

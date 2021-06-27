package exam;

/**
 * Describe class Twine here.
 *
 *
 * Created: Sun Jul  1 15:50:46 2018
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class Twine {

    public static void main(String[] args) {
	StringBuffer  sb1 = new StringBuffer ("hi");
	StringBuffer  sb2 = new StringBuffer ("hi");
	StringBuffer  sb3 = sb2;

	if (sb1.equals(sb2)) {
	    System.out.println(sb2);	
	}else{
	    System.out.println("not equals");	// output
	}

	if (sb2.equals(sb3)) {
	    System.out.println("sb2  equals sb3 ");	// output
	}
    }
}

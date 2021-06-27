package exam;

/**
 * Describe class Choosy here.
 *
 *
 * Created: Sun Jul  1 15:08:28 2018
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class Choosy {
    public static void main(String[] args) {
	String result = "";
	int x=7;
	if (x==3) {result +="1";
	} else if(x<9){
	    result +="1";
	} else if(x==7){
	    result +="2";
	} else {
	    result +="3";
	}
	System.out.println(result);
    }
}

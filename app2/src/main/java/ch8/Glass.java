package ch8;

/**
 * Describe class Glass here.
 *
 *
 * Created: Tue Oct 31 14:37:53 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class Glass<T> {
    public T liquid;
     
    public  <U extends Juice>  String getLiquidTaste(U juice){
	return juice.taste();
    }
}

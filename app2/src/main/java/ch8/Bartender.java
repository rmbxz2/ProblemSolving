package ch8;

/**
 * Describe class Bartender here.
 *
 *
 * Created: Tue Oct 31 15:08:40 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class Bartender {

    /**
     * Creates a new <code>Bartender</code> instance.
     *
     */
    public Bartender() {

    }

    public <J,W> CockTail mix(J juice,W water) {
	return new CockTail();
  }


    public   <J,W> void  mix2(J juice, W water) {

  }

    public static <J,W> void  mix3(J juice, W water) {
	
  }


}

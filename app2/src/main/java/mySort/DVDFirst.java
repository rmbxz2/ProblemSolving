package mySort;

import java.util.Comparator;

/**
 * Describe class DVDFirst here.
 *  
 *
 * Created: Sun Jul 22 00:39:12 2018
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class DVDFirst implements Comparator<DVD> {
    /**
     * Describe <code>compare</code> method here.
     *
     * @param object an <code>Object</code> value
     * @param object1 an <code>Object</code> value
     * @return an <code>int</code> value
     */
    public final int compare(DVD dvd1,  DVD dvd2) {

	Integer k = dvd1.getFirst();
	Integer v = dvd2.getFirst();
 	int comp =  k.compareTo(v);
	return comp;
    }
}


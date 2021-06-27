package mySort;

import java.util.Comparator;

/**
 * Describe class DVDSecond here.
 *
 *
 * Created: Sun Jul 22 01:12:08 2018
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class DVDSecond implements Comparator<DVD> {
    /**
     * Describe <code>compare</code> method here.
     *
     * @param object an <code>Object</code> value
     * @param object1 an <code>Object</code> value
     * @return an <code>int</code> value
     */

    public final int compare(DVD dvd1, DVD dvd2) {
        Integer a = dvd1.getSecond();
        Integer b = dvd2.getSecond();

        return a.compareTo(b);
    }
}

package mySort;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JFrame;

/**
 * Describe class DVDTest here.
 *
 *
 * Created: Sun Jul 22 00:28:45 2018
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class DVDTest {
    // private static final int BINARYSEARCH_THRESHOLD   = 5000;
    // private static final int REVERSE_THRESHOLD        = 18;
    // private static final int SHUFFLE_THRESHOLD        = 5;
    // private static final int FILL_THRESHOLD           = 25;
    // private static final int ROTATE_THRESHOLD         = 100;
    // private static final int COPY_THRESHOLD           = 10;
    // private static final int REPLACEALL_THRESHOLD     = 11;
    // private static final int INDEXOFSUBLIST_THRESHOLD = 35;

    public static void main(String[] args) {
        System.out.println("hiiii");
        // Scanner input = new Scanner(System.in);
        JFrame hii2 = new JFrame("hi");
        // hii2.setBackground(Color.RED);
        // hii2.setSize(100, 100);
        // hii2.setVisible(true);
        // PriorityQueue pq = new PriorityQueue();

        System.out.println("hiiii");
        System.out.println("max integer = " + Integer.MAX_VALUE);
        System.out.println("min integer = " + Integer.MIN_VALUE);
        System.out.println("hiiii");
        DVD a0 = new DVD("khalel0", 10, 50, 9);
        DVD a1 = new DVD("khalel1", 11, 51, 9);
        DVD a2 = new DVD("khalel2", 12, 52, 9);
        DVD a3 = new DVD("khalel4", 13, 53, 5);
        DVD a4 = new DVD("khalel4", 13, 53, 9);
        DVD a5 = new DVD("khalel0", 15, 55, 9);
        DVD a6 = new DVD("khalel0", 1, 5, 7);
        DVD a7 = new DVD("khalel0", 1, 1, 2);
        DVD a8 = new DVD("khalel0", 1, 1, 1);
        DVD a9 = new DVD("khalel0", 1, 1, 3);

        a1.getName();
        a2.getFirst();
        a3.getThird();
        a4.getThird();
        a4.setThird(55);
        a5.getSecond();

        //	int ax= a9.hashCode();
        //	DVD[] dvdArray = { a6,a7,a0,a8,a1,a4,a9,a5,a3,a2};
        List<DVD> dvdList = new LinkedList<DVD>();
        dvdList.add(a0);
        dvdList.add(a1);
        dvdList.add(a2);
        dvdList.add(a3);
        dvdList.add(a4);
        dvdList.add(a5);
        dvdList.add(a6);
        dvdList.add(a7);
        dvdList.add(a8);
        dvdList.add(a9);
        dvdList.add(a8);

        for (DVD dvd : dvdList) {
            System.out.println(dvd);
        }

        // for (DVD dvd : dvdArray) {
        //     System.out.println(dvd);
        // }

        int xyz[][] = new int[10][10];
        for (int[] row : xyz) {
            Arrays.fill(row, -1);
        }

        for (int indexf = 0; indexf < 10; indexf++) {
            for (int index = 0; index < 10; index++) {
                System.out.println(xyz[indexf][index]);
            }
        }

        System.out.println("are equals " + (a7.equals(a8)));

        System.out.println("sorted by name");

        // default  sort
        // Arrays.sort(dvdArray);

        // reverse sort  Comparator
        //	Arrays.sort(dvdArray,Collections.reverseOrder());
        Collections.sort(dvdList, Collections.reverseOrder());

        // for (DVD dvd : dvdArray) {
        //     System.out.println(dvd);
        // }

        for (DVD dvd : dvdList) {
            System.out.println(dvd);
        }

        // System.out.println("find object by name");
        // DVD dvdName = new DVD("khalel0",1,5,7); // will not not not found
        // System.out.println("result is =
        // "+dvdArray[Arrays.binarySearch(dvdArray,dvdName)]);

        System.out.println("sorted by first integer");
        DVDFirst dvdFirst = new DVDFirst();

        // sort by comparator
        //	Arrays.sort(dvdArray,dvdFirst);

        // reverse sort  Comparator
        //	Arrays.sort(dvdArray,Collections.reverseOrder(dvdFirst));
        Collections.sort(dvdList, Collections.reverseOrder(dvdFirst));

        // for (DVD dvd : dvdArray) {
        //     System.out.println(dvd);
        // }

        System.out.println("sorted by second int");
        DVDSecond dvdSecond = new DVDSecond();

        //	Arrays.sort(dvdArray,dvdSecond);
        Collections.sort(dvdList, dvdSecond);

        for (DVD dvd : dvdList) {
            System.out.println(dvd);
            System.out.println(dvd.getName());
        }

        // for (DVD dvd : dvdArray) {
        //     System.out.println(dvd);
        // }

        // System.out.println("find object by second int");
        // DVD dvdName2 = new DVD("a",0,5,0); // will found
        // System.out.println("result is =
        // "+Arrays.binarySearch(dvdArray,dvdName2,dvdSecond));
        // System.out.println("object is = "+ dvdArray
        // [Arrays.binarySearch(dvdArray,dvdName2,dvdSecond)]);

        // ApplicationContext context = new
        // ClassPathXmlApplicationContext("services.xml", "daos.xml");

        /*

    Comparator

    Set
    HashSet
    TreeSet
    SortedSet
    LinkedHashSet


    Map
    HashMap
    Hashtable
    TreeMap
    SortedMap
    LinkedHashMap

    List
    LinkedList
    Vector
    Stack
    Queue


        */

        String a = "aaa";
        String b = "bbb";
        long x11 = 6;
        // Long x22 = 6; //error, must be 6L

        System.out.println("a compareTo b " + a.compareTo(b)); // -1
        System.out.println("b compareTo a " + b.compareTo(a)); // +1
        System.out.println("a compareTo  " + a.compareTo(a)); // 0

        // The JDE does not recognize JDK 1.10 javac. Assume JDK 10.0 javac? y
    }
}

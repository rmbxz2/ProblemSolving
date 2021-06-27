package ch2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Describe class Fib here.
 *
 *
 * Created: Thu Mar  8 03:28:30 2018
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class Fib {
    /**
     * Describe <code>main</code> method here.
     *
     * @param args a <code>String</code> value
     */
    private static LinkedList<String> list = new LinkedList<String>();
    //    private int counterx;

    /**
     * Describe <code>hix</code> method here.
     *
     */
    public static void hix() {
 	System.out.println("hi");
    }

    
    /**
     * Describe <code>main</code> method here.
     *
     * @param args a <code>String</code> value
     */
    public static void main(String [] args) {


	String[] x1={"dd","bb","aa","cc"};
	System.out.println("not sorted");
	for (String a : x1) {
	    System.out.print(a+" ");
	}
	Arrays.sort(x1);
	System.out.println("sorted");
	for (String a : x1) {
	    System.out.print(a+" ");
	}
	System.out.print("=======end of sort=========");


	Test.hisir444();
	System.out.println(";;;;;;;;;;");
	System.out.println(Math.round(5.2f));
	System.out.println(";;;;;;;;;;");
	list.add("3");
	list.add("0");
	list.add("1");
	list.add("a");
	System.out.println("========");
	ListIterator<String> it = list.listIterator();
	while(it.hasPrevious()){
	    System.out.print("------");
	    System.out.println(it.previous());
	}

	System.out.println("========");
	System.out.println("this is the First "+list.getFirst());
	System.out.println("this is the Last "+list.getLast());
	System.out.println(list.contains("d"));
	System.out.println("========");
       	System.out.println(list);
	Collections.reverse(list);
	System.out.println(list);
	Collections.sort(list); 
	System.out.println(list);
	System.out.println(Collections.max(list));
	System.out.println(Collections.binarySearch(list, "3"));
	System.out.println("==================== ====================");
	Hashtable<String,String>  table = new Hashtable<String,String>();
	table.put("22", "bb");
	table.put("11", "aa");
	table.put("33", "cc");
	Enumeration<String> en= table.keys(); 
	while (en.hasMoreElements()) {
	    String e=en.nextElement();
	    System.out.println(e+" "+table.get(e));
	}
    }
}


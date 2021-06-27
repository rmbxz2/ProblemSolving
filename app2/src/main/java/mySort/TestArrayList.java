package mySort;

import java.util.ArrayList;
import java.util.Vector;

/**
 * Describe class TestArrayList here.
 *
 *
 * Created: Fri Aug 10 15:02:54 2018
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class TestArrayList {
    public static void main(String[] args) {
        // note :-  list , vector, ArrayList, LinkedList are shifting index when remove element

        ArrayList<String> leagueList = new ArrayList<String>();
        // Vector<String> leagueList = new Vector<String>();
        // LinkedList<String> leagueList = new LinkedList<String>();
        leagueList.add("league0");
        leagueList.add("league1");
        leagueList.add("league2");
        leagueList.add("league3");
        leagueList.add("league4");

        // print all element in list
        System.out.println("print all element, list size = " + leagueList.size());
        for (int index = 0; index < leagueList.size(); index++) {
            System.out.println(" " + index + " " + leagueList.get(index));
        }

        leagueList.remove(0); // remove first element
        leagueList.remove(0); // remove second element, because shifting in arraylist

        // print all elements in list after remove first and second element
        System.out.println("print all element, list size = " + leagueList.size());
        for (int index = 0; index < leagueList.size(); index++) {
            System.out.println(" " + index + " " + leagueList.get(index));
        }

        // [[ not work correctly ]] remove  all elements in list, the right way is using
        // leagueList.clear();
        //	for (int index = 0; index < leagueList.size() ; index++) {
        //	    leagueList.remove(0);
        //	}

        // [work correctly] remove  all elements in list, the right way is using leagueList.clear();
        // clear delete all element and every object will be =null
        leagueList.clear();

        // print all elements in list after remove all elements
        System.out.println(
                "print all element after remove all elements , list size = " + leagueList.size());
        for (int index = 0; index < leagueList.size(); index++) {
            System.out.println(" " + index + " " + leagueList.get(index));
        }
    }
}

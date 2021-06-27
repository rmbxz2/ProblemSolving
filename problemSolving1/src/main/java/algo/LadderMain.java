package algo;

import java.util.ArrayList;
import java.util.Collections;

/**
* Describe class here.
*   
*
*
*
*
*/
public class LadderMain {
	public static void main(String[] args) {
	    String[] ladder = { "hit","cog","hot","dot", "dog","lot", "log"};

		ArrayList<Ladder> ladderList = new ArrayList<Ladder>();

		for (String str : ladder) {
			ladderList.add(new Ladder(str));
		}
		Collections.sort(ladderList);
		for (Ladder lad : ladderList) {
			System.out.println(lad.getLadderString1());
		}

	}
}

/*
dog
dot
hit
hot

dog
dot
hit
hot

dog
hit
dot
hot

 */

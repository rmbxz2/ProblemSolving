package algo;

import java.util.Arrays;

/**
* Describe class here.
*
*
*
*
*
*/
public class Ladder implements Comparable<Ladder> {

	private String ladderString1;

	public Ladder(String ladderString1) {
		this.ladderString1 = ladderString1;
	}

	/*
	@Override
	public int compareTo(Ladder ladder) {
		return ladderString1.compareTo(ladder.getLadderString1());
	}
	
	*/

	/**
	* 
	*
	*/
	@Override
	public int compareTo(Ladder ladder) {

		char[] char1 = ladderString1.toCharArray();
		char[] char2 = ladder.ladderString1.toCharArray();

		char[] char11 = new char[char1.length - 1];
		char[] char22 = new char[char2.length - 1];

		for (int i = 0, j = 0; i < char2.length - 1; i++, j++)
			if (char1[i] == char2[i]) {
				char11[j] = char1[i];
				char22[j] = char2[i];
				// swapChar(char1, i, char1.length - i - 1);
				// swapChar(char2, i, char2.length - i - 1);
			}

		int comp = String.valueOf(char11).compareTo(String.valueOf(char22));

		if (comp == 0) {
		    // Arrays.sort(char1);
		    // Arrays.sort(char2);
			comp = (String.valueOf(char1).compareTo(String.valueOf(char2)));
		}
		return comp;
	}


	/**
	* 
	*
	*/
	private void swapChar(char[] arrayChar, int index1, int index2) {
		char temp = arrayChar[index1];
		arrayChar[index1] = arrayChar[index2];
		arrayChar[index2] = temp;
	}

	/**
	 * @return the ladderString1
	 */
	public String getLadderString1() {
		return ladderString1;
	}

	/**
	 * @param ladderString1 the ladderString1 to set
	 */
	public void setLadderString1(String ladderString1) {
		this.ladderString1 = ladderString1;
	}

}
 

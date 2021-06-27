package leetCode;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
* Describe class here.
*
*
*
*
*
*/
public class WordBreak4 {
	/** https://regex101.com/
	 * 
	 * 
	*/
	public static void main(String[] args) {
		WordBreak4 wordBreak = new WordBreak4();
		System.out.println("==== workBreak0 solution leetcode 4 ===========");
		wordBreak.wordBreak0();
		System.out.println("==== workBreak00 solution leetcode 5 ===========");
		wordBreak.wordBreak00();
		System.out.println("==== workBreak1 ===========");
		wordBreak.wordBreak1();
		System.out.println("===== wordBreak2 ==========");
		wordBreak.wordBreak2();
		System.out.println("===== wordBreak3 ==========");
		wordBreak.wordBreak3();
		System.out.println("===== wordBreak4 ==========");
		wordBreak.wordBreak4();
	}

	/**
	* solution of leetcode 5 in the book 
	* word break II
	*/
	public void wordBreak00() {
		Set<String> dic1 = new TreeSet<String>();
		Set<String> dic2 = new TreeSet<String>(Collections.reverseOrder());
		String data = "catsanddog";
		System.out.println("data = " + data);
		dic1.add("cat");
		dic2.add("cat");
		dic1.add("cats");
		dic2.add("cats");
		dic1.add("sand");
		dic2.add("sand");
		dic1.add("and");
		dic2.add("and");
		dic1.add("dog");
		dic2.add("dog");

		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();

		for (String s : dic1) {
			sb1.append(s + "|");
		}

		for (String s : dic2) {
			sb2.append(s + "|");
		}

		String regex1 = sb1.toString().substring(0, sb1.length() - 1);
		String regex2 = sb2.toString().substring(0, sb2.length() - 1);
		regex1 = "(" + regex1 + ")";
		regex2 = "(" + regex2 + ")";

		// String regex = "(special|goals|goal|go)";
		System.out.println("regex = " + regex1);
		System.out.println("regex = " + regex2);
		Pattern p1 = Pattern.compile(regex1);
		Pattern p2 = Pattern.compile(regex2);
		Matcher m1 = p1.matcher(data);
		Matcher m2 = p2.matcher(data);

		System.out.println("\n---------");
		while (m1.find()) {
			System.out.print(m1.group()+" "); //default group(0)
		}
		System.out.println("\n---------");
		while (m2.find()) {
			System.out.print(m2.group()+" "); //default group(0)
		}
		System.out.println("\n---------");

	}

	/**
	* solution of leetcode 4 on book , word break 
	* solution of leetcode 139 website
	*/
	public void wordBreak0() {
		Set<String> dic = new TreeSet<String>(Collections.reverseOrder());
		String data = "catsandog";
		System.out.println("data = " + data);
		dic.add("dog");
		dic.add("cats");
		dic.add("and");
		dic.add("sand");
		dic.add("cat");

		StringBuilder sb = new StringBuilder();

		for (String s : dic) {
			sb.append(s + "|");
		}

		String regex = sb.toString().substring(0, sb.length() - 1);
		//		regex = "(?=(" + regex + "))"; // use lookahead (?= elements) instead of sorting element
		//		String regex = "(special|goals|goal|go)";
		System.out.println("regex = " + regex);
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(data);

		while (m.find()) {
			System.out.println("Full match: " + m.group(0) + " start = " + m.start() + " end = " + m.end());
			for (int i = 1; i <= m.groupCount(); i++) { // m.groupCount() == 0 
				System.out.println("Group " + i + ": " + m.group(i));
			}
		}
	}

	/**
	*
	*
	*/
	public void wordBreak1() {
		Set<String> dic = new TreeSet<String>();
		dic.add("that");
		String data = "thathat";
		System.out.println("data = " + data);
		//		dic.add("go");
		//		dic.add("goal");
		//		dic.add("goals");
		//		dic.add("special");

		StringBuilder sb = new StringBuilder();

		for (String s : dic) {
			sb.append(s + "|");
		}

		String regex = sb.toString().substring(0, sb.length() - 1);
		regex = "(?=(" + regex + "))"; // use lookahead (?= elements) instead of sorting element

		//		String regex = "(special|goals|goal|go)";
		System.out.println("regex = " + regex);
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(data);

		while (m.find()) {
			int start = m.start();
			int end = 4; //that 
			System.out.println(" " + start + " - " + end + " " + data.substring(start, start + end));
		}

	}

	/**
	*
	*
	*/
	public void wordBreak2() {
		Set<String> dic = new TreeSet<String>(Collections.reverseOrder());
		String data = "gogoalspecial";
		System.out.println("data = " + data);
		dic.add("go");
		dic.add("goal");
		dic.add("goals");
		dic.add("special");

		StringBuilder sb = new StringBuilder();

		for (String s : dic) {
			sb.append(s + "|");
		}

		String regex = sb.toString().substring(0, sb.length() - 1);
		regex = "(" + regex + ")";

		//		String regex = "(special|goals|goal|go)";
		System.out.println("regex = " + regex);
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(data);

		while (m.find()) {
			System.out.println(m.group()); //default group(0)
		}

	}

	/**
	*
	*
	*/
	public void wordBreak3() {
		// lookahead  (?= elements)
		Set<String> dic = new TreeSet<String>();
		String data = "goxgoalspecial";
		System.out.println("data = " + data);
		dic.add("special");
		dic.add("goal");
		dic.add("goals");
		dic.add("go");

		StringBuilder sb = new StringBuilder();

		for (String s : dic) {
			sb.append(s + "|");
		}

		String regex = sb.toString().substring(0, sb.length() - 1);
		regex = "(?=" + regex + ")";

		//		String regex = "(special|goals|goal|go)";
		System.out.println("regex = " + regex);
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(data);

		//		int end=0;
		while (m.find()) {
			//  end = m.start();
			System.out.println("" + m.start() + " - " + "");
		}
	}

	/**
	 *  generated from https://regex101.com/
	 * 
	*/
	public void wordBreak4() {
		final String regex = "(?<=special|goals|goal|go)";
		final String string = "goxgoalspecial";

		System.out.println("date = " + string);
		System.out.println("regex = " + regex);

		final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
		final Matcher matcher = pattern.matcher(string);

		while (matcher.find()) {
			//			System.out.println("Full match: " + matcher.group(0));
			System.out.println("start = " + matcher.start());
			for (int i = 1; i <= matcher.groupCount(); i++) {
				System.out.println("Group " + i + ": " + matcher.group(i));
			}
		}
	}
	/**
	 * 
	 * 
	*/
    	public void wordBreak5() {
		final String regex = "(dog|cats|cat|sand|and)";
		final String string = "catsanddog";

		System.out.println("date = " + string);
		System.out.println("regex = " + regex);

		final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
		final Matcher matcher = pattern.matcher(string);

		while (matcher.find()) {
			//			System.out.println("Full match: " + matcher.group(0));
			System.out.println("start = " + matcher.start());
			for (int i = 1; i <= matcher.groupCount(); i++) {
				System.out.println("Group " + i + ": " + matcher.group(i));
			}
		}
	}
}

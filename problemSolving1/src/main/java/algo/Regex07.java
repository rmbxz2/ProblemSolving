package algo;

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
public class Regex07 {
	public static void main(String[] args) {

		String regex = "(Ahmed|Ali|omar)";
		String string = "Ahmed sami Ahmed SAAli";
		Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(string);
		// count matches by matcher.results().count()
		/*
		if (matcher.results().count() == 1)
			System.out.println("YES");
		else {
			System.out.println("NO");
		}
		
		*/
		System.out.println("matches =" + matcher.results().count());  // 3
		System.out.println("matches =" + matcher.results().count());  // 0
	}
}

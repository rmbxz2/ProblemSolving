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
public class RegexRegex06 {

	public static void main(String[] args) {

		String regex = "(Ahmed|Ali|omar)";
		String string = "hi Ahmed sami SAhmed";


		Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(string);

		// counter for matched string 
		int counter = 0;
		// second way to count matches is matcher.results().count()
		// 

		while (matcher.find()) {
			for (int i = 1; i <= matcher.groupCount(); i++) {
				counter++;
			}
		}

		if (counter == 1)
			System.out.println("YES");
		else {
			System.out.println("NO");
		}

	}
}

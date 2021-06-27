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
public class Regex04 {
	public static void main(String[] args) {
		String line = "aaaAbCbbbcCc";
		//		String regex = "(?:(?<=is))(?:([cat])(?!.*\\1)){3}"; 
		String regex = "(?ims)a(?-ims)b(?i)c";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(line);
		// using Matcher find(), group(), start() and end() methods
		while (matcher.find()) {
			System.out.println(line.substring(0, (((matcher.start() - 1) < 0) ? 0 : (matcher.start()))) + "["
					+ matcher.group() + "]" + line.substring(matcher.end() - 1, line.length() - 1));
			System.out.println("==============");
			//			System.out.println("from " + matcher.start() + " to " + matcher.end());
			//System.out.println(line.substring(matcher.start(), matcher.end() ));
		}
	}
}
 

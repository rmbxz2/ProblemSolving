package leetCode;

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
public class LookaheadOverlapping {
public static void main (String[] args) throws java.lang.Exception
	{
		final String kw = "dad";
		final String regex = "(?=" + Pattern.quote(kw) + ")";
		final String string = "dadadsaddadadads";
		

		final Pattern pattern = Pattern.compile(regex);
		final Matcher matcher = pattern.matcher(string);

		int count = 0;
		while (matcher.find())
		{
		    System.out.printf("Start: %d\tEnd:%d", matcher.start(), matcher.start() + kw.length() -1);
		    System.out.print(" "+ string.substring(matcher.start(), matcher.start()+kw.length()));
		    System.out.println("");
		    count++;
		}

		System.out.printf("Match count: %d%n", count);
	}
}


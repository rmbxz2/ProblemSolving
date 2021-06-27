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
public class Regex05 {
	public static void main(String[] args) {
	    // (?{*code}) and (??{code*}),
	    //		boolean b3 = Pattern.matches("(??{*hi})", "hi");
	    //	    		boolean b3 = Pattern.matches("(??{*hi})", "hi");
	    // boolean b3 = Pattern.compile("<a\\b[^>]*href=\"[^>]*>(.*?)</a>").matcher("hi").matches();
		boolean b3 = Pattern.compile("(??{*hi})").matcher("hi").matches();
		System.out.println("pattern " + b3);


		Pattern p = Pattern.compile("(??{*hi})"); //. represents single character  
		Matcher m = p.matcher("as");
		boolean b = m.matches();
		System.out.println("pattern " + b);
		


	}
}

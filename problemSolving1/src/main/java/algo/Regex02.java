package algo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex02 {
	public static void main(String args[]) {
	    /*
		 String line = "<TransactionList>\n"
		     +"    <Transaction type=\"C\" amount=\"1000\" narration=\"salary\" />\n"
		     + "    <Transaction type=\"D\" amount=\"200.1\" narration=\"rent\" />\n"
					+ "    <Transaction type=\"D\" amount=\"800\" narration=\"other\" />\n";

			String regex = "(?:type=\\\")([a-zA-Z])(?:\\\")\s+(?:amount=\\\")(\\w+\\.?\\w+)(?:\\\")\\s+(?:narration=\\\")([a-zA-Z ]+)(?:\\\")";
		 //			String regex = "(?:type=\\\")([C|D])(?:\\\")\\s+(?:amount=\\\")(\\d+\\.?\\d*)(?:\\\")\\s+(?:narration=\\\")([a-zA-Z ]+)(?:\\\")";
		 //		 String line = "<Transaction type=\"C\"amount=\"1000\"narration=\"salary\" />";
		 //		 String regex = "(?<=type=\\\")([C|D])(?<=amount=\\\")(\\\"d+.?\\d+)(?<=narration=\\\")(\\\"[a-zA-Z ]+)";
		 //	            String regex = "(?<=type)([C|D])(?=amount)(\\d+)";
		    //	            String regex = "(?<=type=\\\")([C|D])(?<=(\\\"amount=\\\"))(\\d+.?\\d+)";
		 // String regex = "(?<=type=\\\")([C|D])";
	    //		String line = "abc123efg";
	    //		String regex = "([a-z]+)(\\d\\d\\d)([a-z]+)";
		// Create a Pattern object
		Pattern pattern = Pattern.compile(regex);

		// Now create matcher object.
		Matcher m = pattern.matcher(line);
		if (m.find()) {
		    //		    System.out.println("Found value goup1: " + m.group(0));// complete line
			System.out.println("Found value goup1: " + m.group(1));
			System.out.println("Found value goup2: " + m.group(2));
			System.out.println("Found value goup3: " + m.group(3));
		} else {
			System.out.println("NO MATCH");
		}

	    */
	}

}

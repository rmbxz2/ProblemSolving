package sl314.tags;

public class TextFunctions {

  public static String reverse(String theString) {
    StringBuffer buf = new StringBuffer(theString);
    buf.reverse();
    return buf.toString();
  }

  public static String randomize(String theString) {
    StringBuffer buf1 = new StringBuffer(theString);
    StringBuffer buf2 = new StringBuffer();

    while(buf1.length() > 0) {
      int i = (int) (Math.random() * buf1.length());
      char c = buf1.charAt(i);
      buf1.deleteCharAt(i);
      buf2.append(c);
    }
    return buf2.toString();

  }

  public static String uppercase(String theString) {
    return theString.toUpperCase();
  }

  public static String lowercase(String theString) {
    return theString.toLowerCase();
  }

}



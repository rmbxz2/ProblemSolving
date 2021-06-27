package exam;

import java.security.MessageDigest;

/**
 * Describe class MD5Digest here.
 *
 *
 * Created: Sat Jul  7 16:56:26 2018
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class MD5Digest {

    public static void main(String[] args) throws Exception {
	// md5 for ahmed ali 2000 times 
	String original = "Ahmed Ali";
	StringBuffer sb = new StringBuffer();

	for (int index = 0; index < 2000; index++) {

	    MessageDigest md = MessageDigest.getInstance("MD5");
	    md.update(original.getBytes());
	    byte[] digest = md.digest();
	    sb = new StringBuffer();
	    for (byte b : digest) {
		sb.append(String.format("%02x", b & 0xff));
	    }
	    original=sb.toString();
	    System.out.println("digested(hex):" + sb.toString());

	}

    }
}

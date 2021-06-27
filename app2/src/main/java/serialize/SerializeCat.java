package serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/**
 * Describe class SerializeCat here.
 *
 *
 * Created: Thu Nov  9 02:18:53 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class SerializeCat {
    Cat cat = new Cat();
    Cat caty = new Cat();
    Cat catx = new Cat();
    
    // (setq tags-revert-without-query 't)
    public static void main(String[] args) {
	SerializeCat sc = new SerializeCat();
	sc.serializeIt();
	sc.deSerializeIt();
    }
    
    public void serializeIt(int x) {
	int sum= 5;
    }

    /**
     * Describe <code>serializeIt</code> method here.
     * (global-flycheck-mode '1)
     */  
    public void serializeIt() {
	try {
	    FileOutputStream fs = new FileOutputStream("testSer.ser");
	    ObjectOutputStream os = new ObjectOutputStream(fs);
	    os.writeObject(cat); 
	    os.close();
	}  catch (Exception ex) {
	    ex.printStackTrace(); 
	} 
	System.out.println("cat befor serializeIt = "+ cat.toString());
	System.out.println((new SerializeCat()).toString());
    }

    /**
     * Describe <code>deSerializeIt</code> method here.
     *
     */
    public void deSerializeIt() {
	System.out.println("cat befor  deSerializeIt = "+ cat); 
	try {
	    FileInputStream fis = new FileInputStream("testSer.ser");
	    ObjectInputStream ois = new ObjectInputStream(fis);
	    cat =(Cat) ois.readObject();
	    ois.close();
	} catch (Exception e) {
	    e.printStackTrace();
	} 
	System.out.println("cat after deSerializeIt = "+ cat.toString());
    }


    /**
     * Describe <code>toString</code> method here.
     *
     * @return a <code>String</code> value
     */
    public final String toString() {
	return "hi";
    }
}

//  x1= (#X6e) = 110
//  x2= (#Xdc) =220
//  x3= (#X14a) = 330

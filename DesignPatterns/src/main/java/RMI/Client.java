package RMI; 

/**
* Describe class here.
*
*
*
*
*
*/

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

    private Client() {}

    public static void main(String[] args) {

        String host = (args.length < 1) ? null : args[0];
        try {
            Registry registry = LocateRegistry.getRegistry(host);
            Hello stub = (Hello) registry.lookup("Hello");
            String response1 = stub.sayHello();
	    int response2 = stub.sum(2,3);
            System.out.println("response: " + response1);
	    System.out.println("response: " + response2);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}

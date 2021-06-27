package RMI; 

/**
* Describe class here.
*
*
*
*
*
*/
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote {
    String sayHello() throws RemoteException;
    int sum(int a,int b) throws RemoteException;
}



package scjpThread;

/**
 * Describe class DataC here.
 *   *nmap | grep -e sxV only
 *    nmap | grep    sV only
 *
 * Created: Thu Jan 26 14:25:10 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class DataC {

	private int number;
	private boolean state = false;

	/**
	* 
	* @param d
	*/
	public synchronized void setData(int d) {
		if (state) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("ineterrupted wait in setData");
			}
		}
		number = d;
		System.out.println("set :- " + number);
		state = true;
		notify();
	}


	/**
	* 
	* 
	*/
	public synchronized void getData() {
		if (!state) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("interrupted wait in getData");
			}
		}
		System.out.println("Get:- " + number);
		state = false;
		notify();
	}
}

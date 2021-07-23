package scjpThread;

/**
 * Describe class Producer here.
 *
 *
 * Created: Thu Jan 26 14:52:39 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class Producer extends Thread {

	private DataC dataC;
	private int count = 10;

	/**
	* 
	* @param dataC
	* @param name
	*/
	public Producer(DataC dataC, String name) {
		super(name);
		this.dataC = dataC;
	}

	/**
	* 
	* 
	*/
	public final void run() {
		int i = 0;
		while (count-- > 0) {
			dataC.setData(i++);
		}
	}

}

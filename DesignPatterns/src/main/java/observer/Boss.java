package observer;

public class Boss implements observer.Observer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see observer_04.Observer#update(java.lang.String, java.lang.String)
	 */
	public void update(String operation, String record) {
		System.out.println("update Boss" + operation + record);
	}
}
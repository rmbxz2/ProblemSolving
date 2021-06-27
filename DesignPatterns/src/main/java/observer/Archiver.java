package observer;

public class Archiver implements observer.Observer {

	public void update(String operation, String record) {
		System.out.println("update Archiver" + operation + record);

	}
}
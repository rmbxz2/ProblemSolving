package observer;
/*
 * @startuml
 *   !include ObserverClass.html
 *   '!include ObserverObject.html
 * @enduml
 * 
 * 
 */
public class MainObserver {
	public static void main(String[] args) {
		Observer client = new Client();
		Observer archiver = new Archiver();
		Observer boss = new Boss();

		Subject subject = new DBobserver();
		subject.addObserver(boss);
		subject.addObserver(archiver);
		subject.addObserver(client);
		subject.notifyObservers();

		subject.removeObserver(boss);
		subject.notifyObservers();

		DBobserver dbObserver = (DBobserver) subject;
		dbObserver.editObserver(" sum ", " + ");
		
	    dbObserver.addObserver(boss);
	    dbObserver.notifyObservers();

	}
}

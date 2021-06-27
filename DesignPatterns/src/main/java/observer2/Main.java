package observer2;

/**
* Describe class here.
*
*
*
*
*
*/
public class Main {
	public static void main(String[] args) {
	    Observer observer1 = new Student("ahmad");
	    Observer observer2 = new Student("ali");
	    Observer observer3 = new Student("omar");
	    Subject java = new Course("java");
	    java.addObserver(observer1);
	    java.addObserver(observer2);
	    java.addObserver(observer3);
	    java.removeObserver(observer3);
	    java.notifyObservers();
	}
}

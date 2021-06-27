package observer3;

/**
* Describe class here.
*
*
*
*
*
*/
public class MainObserver {
	public static void main(String[] args) {
		Subject course = new Course("java");
		Observer student1 = new Student("Ahmad");
		Observer student2 = new Student("Ali");
		Observer student3 = new Student("Omar");
		course.registerObserver(student1);
		course.registerObserver(student2);
		course.registerObserver(student3);
		course.notifyAllObservers();
	}
}

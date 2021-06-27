package observer3;

import java.util.ArrayList;

/**
* Describe class here.
*
*
*
*
*
*/
public class Course implements Subject {
	String course;
	private ArrayList<Observer> observers;

	/**
	 * @param course
	 */
	public Course(String course) {
		this.course = course;
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update(course);
		}
	}
}

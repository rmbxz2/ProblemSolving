package observer2;

import java.util.ArrayList;

public class Course implements Subject {

	private ArrayList<Observer> students;
	private String course;

	public Course(String string) {
		this.course = string;
		students = new ArrayList<Observer>();
	}

	@Override
	public void addObserver(Observer observer) {
		students.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		students.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer student : students) {
			student.update(course);
		}
	}

}

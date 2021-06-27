package observer2;

public class Student implements Observer {

	private String name;

	public Student(String string) {
		this.name = string;
	}

	@Override
	public void update(String course) {
	    System.out.println(name+"  "+course);
		
	}

}

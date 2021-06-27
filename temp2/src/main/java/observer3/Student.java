package observer3;

/**
* Describe class here.
*
*
*
*
*
*/
public class Student implements Observer {

	private String name;

    //  (call-interactively 'lsp-make-java-constructor)
	public Student(String name) {
	    this.name = name;
	}
	@Override
	public void update(String course) {
		System.out.println("student " + name + " has the course " + course);
	}
}

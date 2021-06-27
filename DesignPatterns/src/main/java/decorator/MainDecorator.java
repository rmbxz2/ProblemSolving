package decorator;

public class MainDecorator {

	/**
	 * 
	 * @param args
	*/
	public static void main(String[] args) {
		Computer cp = new Computer();
		cp = new HD(new Monitor(new Mouse(cp)));
		System.out.println(cp.description());
	}
}


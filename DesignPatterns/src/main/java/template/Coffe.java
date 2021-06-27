package template;

public class Coffe extends Template {

	public void getParts() {
		System.out.println("get parts of coffe => coffe ,sugar ");
	}

	public void assemble() {
		System.out.println("assemble coffe ,sugar");
	}

	public void additional() {
		System.out.println("add the bin");

	}

	@Override
	public void test() {
		System.out.println("coffe is ok");
	}
}
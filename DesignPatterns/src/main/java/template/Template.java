package template;

public abstract class Template {

	public final void go(String string) {
		start(string);
		getParts();
		assemble();
		additional();
		test();
		stop(string);
	}

	public final void start(String string) {
		System.out.println("=============start making " + string + "=============\n");
	}

	public void getParts() {
		System.out.println("get parts of tea => tea and sugar ");
	}

	public void assemble() {
		System.out.println("assemble of tea and sugar");
	}

	public abstract void test();

	public void additional() {
	}

	public final void stop(String string) {
		System.out.println("=============stop making " + string + "=============\n");
	}
}
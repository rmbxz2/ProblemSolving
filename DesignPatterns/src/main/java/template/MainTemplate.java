package template;

public class MainTemplate {
	public static void main(String[] args) {
		Template tea = new Tea();
		tea.go("tea");
		Template coffe = new Coffe();
		coffe.go("coffe");

	}

}

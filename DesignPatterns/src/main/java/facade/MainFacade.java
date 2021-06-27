package facade;

public class MainFacade {
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.setName("123456789a");
		System.out.println(facade.getName());
	}
}

package adapter_03;

public class MainAdapter {
	public static void main(String[] args) {

		FullNameIF fullName = new FullName("ahmad ali omar");
		System.out.println(fullName.getName());

		FullNameIF adapter = new AdapterFullToSeparated("yusuf ali omar");
		System.out.println(adapter.getName());
		adapter.setName("sara ali omar");
		System.out.println(adapter.getName());
	}
}

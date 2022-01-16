package adapter_03;

public class MainAdapter {
	public static void main(String[] args) {

		FullNameIF fullName = new FullName("ahmad ali omar");
		System.out.println(fullName.getName());

		AdapterFullToSeparated adapter = new AdapterFullToSeparated("yusuf ali omar");
		System.out.println(adapter.getName());
		System.out.println(adapter.getFirstName());
		System.out.println(adapter.getSecondName());
		System.out.println(adapter.getThirdName());

	}
}

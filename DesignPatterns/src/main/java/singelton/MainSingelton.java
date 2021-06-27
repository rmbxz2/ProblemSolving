package singelton;

public class MainSingelton {
	public static void main(String[] args) {
		Singleton singelton1 = Singleton.getSingleton("hi ahmad 1");
		Singleton singelton2 = Singleton.getSingleton("hi ahmad 2");
		Singleton singelton3 = Singleton.getSingleton("hi ahmad 3");

	}
}

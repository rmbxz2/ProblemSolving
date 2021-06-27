package singelton;

public class Singleton {
	private static volatile Singleton singleton;
	private String name;

	private Singleton(String name) {
		this.name = name;
	}

	public static synchronized Singleton getSingleton(String name) {
		if (singleton == null) {
			synchronized (Singleton.class) {
				if (singleton == null) {
					singleton = new Singleton(name);
				}
			}
		}
		return singleton;
	}

	public String toString() {
		return this.name;

	}

}
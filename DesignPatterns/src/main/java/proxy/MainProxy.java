package proxy;
/*
 * @startuml
 * !include ProxyObject.html
 * '!include ProxyClass.html
 * 
 * @enduml
 * 
 */
public class MainProxy {
	public static void main(String[] args) {
		CarIF proxy = new Proxy();
		proxy.drive(20);

	}
}

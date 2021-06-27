package factory_method;
/*
 * @startuml
 * !include factoryMethodObject.html
 * '!include factoryMethodClass.html
 * @enduml
 * 
 */
public class MainFactoryMethod {
	public static void main(String[] args) {
		CreatorIF creator1 = new Creator1();
		ProductIF product1 = creator1.factoryMethod();
		product1.action();
		
		CreatorIF creator2 = new Creator2();
		ProductIF product2 = creator2.factoryMethod();
		product2.action();
		
		CreatorIF creator3 = new Creator3();
		ProductIF product3 = creator3.factoryMethod();
		product3.action();
		
	}
}

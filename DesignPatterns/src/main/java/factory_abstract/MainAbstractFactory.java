package factory_abstract;

/*
 * @startuml
 *   !include abstractFactoryObject.html
 *   '!include abstractFactoryClass.html
 * @enduml
 */

public class MainAbstractFactory {
	public static void main(String[] args) {
		Factory win = new Windows();
		Connection winOracle = win.createOracle();
		Connection winMysql = win.createMySql();

		Factory linux = new Linux();
		Connection linuxOracle = linux.createOracle();
		Connection linuxMysql = linux.createMySql();

		System.out.println(winMysql.description());
		System.out.println(winOracle.description());
		System.out.println(linuxMysql.description());
		System.out.println(linuxOracle.description());

	}
}

package state;
/*
 * @startuml
 * !include stateObject.html
 * '!include stateClass.html
 * @enduml
 * 
 * 
 */
public class MainState {
	public static void main(String[] args) {
		Switch switcher = new Switch();
		switcher.handle();
		switcher.changeState(Switch.s2);
		switcher.handle();
		switcher.changeState(Switch.s3);
		switcher.handle();
		switcher.changeState(Switch.s4);
		switcher.handle();

	}
}

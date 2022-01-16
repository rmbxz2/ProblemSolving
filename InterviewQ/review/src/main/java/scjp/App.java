package scjp;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("hi");

		FinalizeMethod finalizeMethod = new FinalizeMethod();
		finalizeMethod = null;
		System.gc();

		// thread safe , but not faster 
		// mutable,
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("what ");
		stringBuffer.append("is ");
		stringBuffer.append("your ");
		stringBuffer.append("Name ");
		System.out.println("stringBuffer = " + stringBuffer);


		// not thread safe , but faster
		// mutable,
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("how ");
		stringBuilder.append("can ");
		stringBuilder.append("i help ");
		stringBuilder.append("you ");
		System.out.println("stringBuilder = " + stringBuilder);

		// Immutable,(create new object when changed)
		// not thread safe
		String string = new String("Hi..");
		string.concat("ok..");
		string.concat("ok2..");
		string.concat("ok3..");
		System.out.println("string = " + string);  

	}
}

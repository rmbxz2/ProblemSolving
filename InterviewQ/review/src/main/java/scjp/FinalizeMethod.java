package scjp;

/**
* Describe class here.
*
*
*
*
*
*/
public class FinalizeMethod {

	@Override
	protected void finalize() throws Throwable {
		System.out.println("object will dead By GC");
	}
}

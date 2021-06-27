package junitt;

/**
* Describe class here.
*
*
*
*
*
*/
public class Circle implements Shape {

	int x = 0;

	@Override
	public String draw(String string) {
		x += 10;
		System.out.println("x1 =" + x);
		return ("x1=" + x);
	}

	@Override
	public String draw2(String string) {
		x += 5;
		System.out.println("x2 =" + x);

		// waste time
		for (int i = 0; i < 1000000; i++) {

		}

		return ("x2=" + x);
	}

	@Override
	public int myDivid(int first, int second) throws MyDivideByZeroException {
		if (second == 0) {
			throw new MyDivideByZeroException("O ahmed, cant divide by zero ");
		}
		return first / second;
	}
}

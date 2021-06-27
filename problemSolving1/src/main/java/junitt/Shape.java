package junitt;

/**
* Describe class here.
*
*
*
*
*
*/
interface Shape {
	public String draw(String string);
    public String draw2(String string);

	public int myDivid(int first, int second) throws MyDivideByZeroException;
}

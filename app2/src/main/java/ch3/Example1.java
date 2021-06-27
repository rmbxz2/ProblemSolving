package ch3;

/**
 * Describe class Example1 here.
 *  live
 *
 * Created: Sun Oct 22 14:56:58 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class Example1 {

    public static void main(String[] args)  {


	String number ="a";
	int x=Integer.parseInt(number);
	System.out.println(x);


	Example1 example1 = new Example1();
	example1.getIt();

	example1=null;
	System.gc();

	Example1 example2 = new Example1();
	example2.getIt();

   }    


    /**
     * Describe <code>getIt</code> method here.
     *
     */
    public void getIt() {
	int sum=0;
	int[][] a = {  {0,1,2},{3,4},{5,6,7} };
	for (int[] x : a)
	    for (int y : x)
		sum+=y;
	System.out.println(sum);


	// outer:
    	// for (int z = 0; z < 5; z++) 
    	//     for (int i = 0; i < 5 ; i++) {
    	// 	while (i>=0) {
    	// 	    System.out.println("hellow i= "+ i);
    	// 	    break outer;
    	// 	}
    	//     System.out.println("cant print this");
    	// } 
   	// System.out.println("out of for");



	// int x=1;
	// assert(x!=1):"Ahmed assert false"; // assert(false):"hiiiiiii"; java -ea => AssertException
	// System.out.println("x= "+x);  // java -ea this will not printed

    }

    /**
     * Describe <code>finalize</code> method here.
     * dont overrid finalize;
     */
    protected void finalize() {  // no gurantee to be run 
    
	System.out.println("finalize is called Mr. Ahmed Ali");
    }
}







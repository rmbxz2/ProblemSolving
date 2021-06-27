package exam;
// https://www.geeksforgeeks.org/program-for-newton-raphson-method/


// Java program for implementation of 
// Newton Raphson Method for solving 
// equations
// f(x)= x^3 + 2x^2 + 10x - 20 where f(x) = 0 
class RaphSonMethod {

    // EPSILON = 10^-10
    // EPSILON =  0.0000000001 
    static final double EPSILON = 0.0000000001;
     
    // An example function whose solution
    // is determined using Bisection Method.
     // f(x)= x^3 + 2x^2 + 10x - 20 where f(x) = 0  
    static double func(double x)
    {

        return (x * x * x) + (2*(x * x)) + (10 * x);
    }
     
    // Derivative of the above function 
    // which is 3x^2 + 4x + 10
    static double derivFunc(double x)
    {
        return (3*(x*x)) + (4*x) +10;
    }


    // Function to find the root
    static void newtonRaphson(double x)
    {
        double h = func(x) / Math.sqrt(  ( (Math.pow((Math.abs((derivFunc(x)))),2))  - (func(x)) * (Math.pow(func(x), x))) );
	System.out.println("  h= "+ h);     

        while (Math.abs(h) >= EPSILON)
        {
            h = func(x) / Math.sqrt(  ( (Math.pow((Math.abs((derivFunc(x)))),2))  - (func(x)) * (Math.pow(func(x), x))) );
	    System.out.println("h= "+ h);     
            // x(i+1) = x(i) - f(x) / sqrt ((f'(x)^2 - f(x)fn(x)))
            x = x - h;
	    //	    System.out.println("x=x-h "+x);
        }
     
        System.out.println(" The value of the"
			   + " root is : "+x);
			   //             + Math.round(x * 100.0) / 100.0);
	//                + Math.round(x * 100.0) / 100.0);

    }

     
    // Driver code test
    public static void main (String[] args)
    {
	int x=0;
    	double xx= Math.log(100);
        // Initial values  X0=2 up to 20

	for (int x0 = 2; x0 <= 20 ; x0++) {
	    System.out.print("when x0="+x0);
	    newtonRaphson(x0);

	}
    }
}
 

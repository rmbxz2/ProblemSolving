package binarysearch;

/**
 * Describe class First1 here.
 *
 *
 * Created: Sat Apr  1 13:23:11 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class First1 {


    public static void main(String[] args) {
	int [] A = {47,1900,-10,90,45};

	int sum=0;
       for(int i=0; i< A.length; i++ ){
	   boolean isTwoDigits = ((Integer.toString(A[i]).charAt(0) == '-') && (Integer.toString(A[i]).length() ==3)) ||  ((Integer.toString(A[i]).charAt(0) != '-') && (Integer.toString(A[i]).length() == 2)) ;
	   if(isTwoDigits){
	       //	System.out.println("number is = "+ A[i] );
	sum+=A[i];
	   }
	}
       	System.out.println("the summation is  = "+ sum);





    }



}

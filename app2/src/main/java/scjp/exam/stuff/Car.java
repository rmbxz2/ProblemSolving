package scjp.exam.stuff;

/**
 * Describe class Car here.
 *
 *
 * Created: Sun Jul 16 23:38:32 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
 public abstract class Car {

    public final int age=22;
     private  double price;
     private String model;
     private String year;
     private String table ;

   //    public abstract void goFast();
    //    public abstract void goSlow();
      public abstract  void goSpeed();
         protected  String go(){
        	return "what is your name";
    }
}

package chain_of_Responsibility;


public class MainChain {

    /**
     * Describe <code>main</code> method here.
     *
     * @param args a <code>String</code> value
     */
    public static void main(String[] args) {
 	Help help = new Teacher(new Manager(new Minister(new King())));
	help.getHelp(2);    // inister will help
	//      help.getHelp(1);    //  King will help 
	//	help.getHelp(2);    //  Minister will help 
	//	help.getHelp(3);    //  Manager will help 
	//	help.getHelp(4);    //  Teacher will help 
	System.out.println("the end man 1");
	System.out.println("the end man 2");
	System.out.println("the end man 3");
	System.out.println("the end man 4");
    }
}
















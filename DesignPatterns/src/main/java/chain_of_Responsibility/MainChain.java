package chain_of_Responsibility;

public class MainChain {
	public static void main(String[] args) {
	 	Help help = new Teacher(new Manager(new Minister(new King())));
		help.getHelp(2);
	}




}


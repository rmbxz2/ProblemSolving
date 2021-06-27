package chain_of_Responsibility;


public class Teacher implements chain_of_Responsibility.Help {

	private Help help;

	public Teacher(Help help) {
		this.help = help;
	}

	public void getHelp(int constantHelp) {
		if (constantHelp == TEACHER_HELP) {
			System.out.println("teacher will help you ");
		} else {
			this.help.getHelp(constantHelp);
		}

	} 
}

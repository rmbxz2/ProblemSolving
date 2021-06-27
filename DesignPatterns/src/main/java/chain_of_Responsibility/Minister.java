package chain_of_Responsibility;

public class Minister implements chain_of_Responsibility.Help {

	/**
	 * 
	 */
	private Help help;

	public Minister(chain_of_Responsibility.Help help) {
		this.help = help;
	}

	public void getHelp(int constantHelp) {
		if (constantHelp == MINISTER_HELP) {
			System.out.println("Minister will help");
		} else {
			this.help.getHelp(constantHelp);
		}
	}
}

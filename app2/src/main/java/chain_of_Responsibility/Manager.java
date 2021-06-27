package chain_of_Responsibility;

public class Manager implements chain_of_Responsibility.Help {

	private Help help;

	/**
	 * @param help
	 */
	public Manager(Help help) {
		this.help = help;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see chain_of_Responsibility.Help#getHelp(int)
	 */
	public void getHelp(int constantHelp) {
		if (constantHelp == MANAGER_HELP) {
			System.out.println("manger will help you");
		} else {
			this.help.getHelp(constantHelp);
		}
	}
}
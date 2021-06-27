package chain_of_Responsibility;

public interface Help {
	int KING_HELP = 1;
	int MINISTER_HELP = 2;
	int MANAGER_HELP = 3;
	int TEACHER_HELP = 4;
	
	public void getHelp(int constantHelp);	 

}

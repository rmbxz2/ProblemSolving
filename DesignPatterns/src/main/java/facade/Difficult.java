package facade;

public class Difficult {
	private char[] charName;

	public Difficult() {
		 charName = new char[10];
		for (int x = 0; x < charName.length; x++)
			charName[x] = ' ';
	}

	public void setChar1(char chr) {
		charName[0] = chr;
	}

	public void setChar2(char chr) {
		charName[1] = chr;
	}

	public void setChar3(char chr) {
		charName[2] = chr;
	}

	public void setChar4(char chr) {
		charName[3] = chr;
	}

	public void setChar5(char chr) {
		charName[4] = chr;
	}

	public void setChar6(char chr) {
		charName[5] = chr;
	}

	public void setChar7(char chr) {
		charName[6] = chr;
	}

	public void setChar8(char chr) {
		charName[7] = chr;
	}

	public void setChar9(char chr) {
		charName[8] = chr;
	}

	public void setChar10(char chr) {
		charName[9] = chr;
	}

	public String getName() {
		return new String(charName);
	}
}
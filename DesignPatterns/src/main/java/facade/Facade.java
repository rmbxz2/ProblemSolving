package facade;

public class Facade {
	Difficult difficult;
	private char[] charName = new char[10];

	public Facade() {
	    	difficult = new Difficult();
	}


		public void setName(String name) {
		charName = name.toCharArray();
		if (charName.length > 0)
			difficult.setChar1(charName[0]);
		if (charName.length > 1)
			difficult.setChar2(charName[1]);
		if (charName.length > 2)
			difficult.setChar3(charName[2]);
		if (charName.length > 3)
			difficult.setChar4(charName[3]);
		if (charName.length > 4)
			difficult.setChar5(charName[4]);
		if (charName.length > 5)
			difficult.setChar6(charName[5]);
		if (charName.length > 6)
			difficult.setChar7(charName[6]);
		if (charName.length > 7)
			difficult.setChar8(charName[7]);
		if (charName.length > 8)
			difficult.setChar9(charName[8]);
		if (charName.length > 9)
			difficult.setChar10(charName[9]);

	}

	public String getName() {
		return difficult.getName();
	}
}

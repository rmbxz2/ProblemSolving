package composite;

public class Leaf extends Root {
	private String name;

	/**
	 * 
	 * 
	*/
	public Leaf(String name) { 
		this.name = name;
	}

	/**
	 * 
	 * 
	*/
	@Override 
	public void display() {
		System.out.print(name + " : ") ;
	}

	/**
	 * 
	 * 
	*/
	public String getName() {
		return name;
	}

	/**
	 * 
	 * 
	*/
	@Override
	public String toString() {
		return name;
	}
}

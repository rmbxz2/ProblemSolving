package strategy;

public class Vehicle {

	private GoAlgorithm goAlgorithm;

	public void setGoAlgorithm(GoAlgorithm goAlgorithm) {
		this.goAlgorithm = goAlgorithm;

	}

	public String go() {
		// TODO Auto-generated method stub
		return this.goAlgorithm.go();
	}

}

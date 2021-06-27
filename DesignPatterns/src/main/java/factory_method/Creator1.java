package factory_method;

public class Creator1 implements CreatorIF{

	public ProductIF factoryMethod() {
		// TODO Auto-generated method stub
		return new Product1();
	}

}

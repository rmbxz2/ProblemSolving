package factory_method;

public class Creator2 implements CreatorIF{

	public ProductIF factoryMethod() {
		// TODO Auto-generated method stub
		return new Product2();
	}

}

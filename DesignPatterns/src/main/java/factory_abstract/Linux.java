package factory_abstract;

public class Linux implements Factory{
	

	public Mysql createMySql() {
		// TODO Auto-generated method stub
		return new MySqlLinux();
	}

	public Oracle createOracle() {
		// TODO Auto-generated method stub
		return new OracleLinux();
	}


}

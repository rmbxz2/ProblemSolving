package factory_abstract;

public class Windows implements Factory {

	public Mysql createMySql() {
		// TODO Auto-generated method stub
		return new MysqlWin();
	}

	public Oracle createOracle() {
		// TODO Auto-generated method stub
		return new OracleWin();
	}

}

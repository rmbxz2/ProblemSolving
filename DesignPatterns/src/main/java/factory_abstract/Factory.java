package factory_abstract;

public interface Factory {
	Oracle createOracle();

	Mysql createMySql();
}
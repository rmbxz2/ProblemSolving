package company.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import company.beans.Employee;
import company.exception.DaoException;
import company.exception.RecordNotFoundException;

/**
 * @author root
 * 
 */
public class EmployeeDao {

	String url;
	String userName;
	String password;

	/**
	 * we put the class.forname() because the constructor create the object once
	 * only once we put the class.forname() because the constructor create the
	 * object once only once. file config.properties located beside the
	 * EmployeeDao.java
	 * 
	 * @throws ClassNotFoundException
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public EmployeeDao() throws ClassNotFoundException, FileNotFoundException, IOException {
		Class.forName("com.mysql.jdbc.Driver");
		Properties properties = new Properties();
		properties.load(new FileInputStream("config.properties"));
		// properties.load(new FileInputStream("d:/work/config.properties"));

		this.url = properties.getProperty("dburl", "jdbc:mysql://localhost:3306/emp");
		this.userName = properties.getProperty("user", "default value if not exist in config.properties");
		this.password = properties.getProperty("password");
	}

	/**
	 * @return
	 * @throws DaoException
	 */

	protected Connection getConnection() throws SQLException {
		return DriverManager.getConnection(this.url, this.userName, this.password);
	}

	/**
	 * @param employee
	 * @throws DaoException
	 */
	public void addEmployee(Employee employee) throws DaoException {
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			connection = getConnection();
			String sql = "INSERT INTO employee(name,salary) VALUES(?,?)";
			ps = connection.prepareStatement(sql);
			ps.setString(1, employee.getName());
			ps.setInt(2, employee.getSalary());
			if (ps.executeUpdate() == 0) {
				throw new DaoException();
			}
		} catch (SQLException e) {
			throw new DaoException(e);
		} finally {
			DaoUtil.closeDBObjcets(connection, ps);
		}
	}

	/**
	 * @param employeeID
	 * @return
	 * @throws DaoException
	 */
	public Employee findEmployee(int employeeID) throws DaoException {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			connection = getConnection();
			String sql = "SELECT  * FROM employee WHERE id=? ";
			ps = connection.prepareStatement(sql);
			ps.setInt(1, employeeID);
			rs = ps.executeQuery();
			Employee employee = null;
			if (rs.next()) {
				employee = populateEmployee(rs);
			} else {
				throw new RecordNotFoundException();
			}
			return employee;
		} catch (SQLException e) {
			throw new DaoException(e);
		} finally {
			DaoUtil.closeDBObjcets(connection, ps, rs);
		}
	}

	/**
	 * @param rs
	 * @return
	 * @throws DaoException
	 */

	private Employee populateEmployee(ResultSet rs) throws DaoException {
		Employee employee = new Employee();
		try {
			employee.setId(rs.getInt("id"));
			employee.setName(rs.getString("name"));
			employee.setSalary(rs.getInt("salary"));
		} catch (SQLException e) {
			throw new DaoException(e);
		}
		return employee;
	}

	/**
	 * @param employeeID
	 * @throws DaoException
	 */
	public void deleteEmployee(int employeeID) throws DaoException {
		Connection connection = null;
		PreparedStatement ps = null;

		try {
			connection = getConnection();
			String sql = "DELETE FROM employee WHERE id=?";
			ps = connection.prepareStatement(sql);
			ps.setInt(1, employeeID);
			if (ps.executeUpdate() == 0) {
				throw new DaoException();
			}
		} catch (SQLException e) {
			throw new DaoException(e);
		} finally {
			DaoUtil.closeDBObjcets(connection, ps);
		}
	}

	/**
	 * @param employee
	 * @throws DaoException
	 */
	public void updateEmployee(Employee employee) throws DaoException {
		Connection connection = null;
		PreparedStatement ps = null;

		try {
			connection = getConnection();
			String sql = "UPDATE employee SET name=?, salary=?    WHERE id=?";
			ps = connection.prepareStatement(sql);
			ps.setString(1, employee.getName());
			ps.setInt(2, employee.getSalary());
			ps.setInt(3, employee.getId());
			if (ps.executeUpdate() == 0) {

			}
		} catch (SQLException e) {
			throw new DaoException();
		} finally {
			DaoUtil.closeDBObjcets(connection, ps);
		}
	}

	/**
	 * @return
	 * @throws DaoException
	 */
	public ArrayList<Employee> lstEmployees() throws DaoException {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			connection = getConnection();
			String sql = "select * from employee";
			ps = connection.prepareStatement(sql);
			rs = ps.executeQuery();
			ArrayList<Employee> employeeList = new ArrayList<Employee>();
			Employee employee = null;
			while (rs.next()) {
				employee = populateEmployee(rs);
				employeeList.add(employee);
			}
			return employeeList;
		} catch (SQLException e) {
			throw new DaoException();

		} finally {
			DaoUtil.closeDBObjcets(connection, ps, rs);
		}
	}

	/**
	 * @param args
	 * @throws DaoException
	 * @throws ClassNotFoundException
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws DaoException, ClassNotFoundException, FileNotFoundException, IOException {

		try {
			EmployeeDao employeeDao = new EmployeeDao();
			Employee employee1 = new Employee();

			employee1.setName("sami");
			employee1.setSalary(111);

			// id=6 koko 9
			employeeDao.addEmployee(employee1);
			Employee emp6 = employeeDao.findEmployee(6);
			System.out.println(emp6.toString());
			System.out.println();
			// id =8 sara
			employeeDao.deleteEmployee(5);

			// id=1 ahmad 333
			Employee employee2 = new Employee();
			employee2.setId(1);
			employee2.setName("Ahmed");
			employee2.setSalary(444);
			employeeDao.updateEmployee(employee2);

			ArrayList<Employee> employeeList = employeeDao.lstEmployees();
			for (Employee employee : employeeList) {
				System.out.println(employee.getId());
				System.out.println(employee.getName());
				System.out.println(employee.getSalary());
			}
		} catch (DaoException e) {
			throw new DaoException();
		}
	}
}
package company.table;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

import company.beans.Employee;
import company.dao.EmployeeDao;
import company.exception.DaoException;

public class EmployeeTableModel extends AbstractTableModel {
	private String[] columnNames = { "Employee ID", "Employee name", "salary" };
	private ArrayList<Employee> employeeList;

	/**
	 * @throws IOException
	 * @throws FileNotFoundException
	 * @throws ClassNotFoundException
	 * @throws DaoException
	 * 
	 */
	public EmployeeTableModel() throws ClassNotFoundException, FileNotFoundException, IOException, DaoException {
		EmployeeDao employeeDao = new EmployeeDao();
		this.employeeList = employeeDao.lstEmployees();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.table.AbstractTableModel#getColumnName(int)
	 */
	@Override
	public String getColumnName(int col) {
		return this.columnNames[col];
	}

	@Override
	public int getRowCount() {
		return this.employeeList.size();
	}

	@Override
	public int getColumnCount() {
		return this.columnNames.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Employee employee = this.employeeList.get(rowIndex);
		switch (columnIndex) {
		case 0:
			return employee.getId();
		case 1:
			return employee.getName();
		case 2:
			return employee.getSalary();
		}
		return null;// not reachable
	}

	/**
	 * @param args
	 * @throws DaoException
	 * @throws IOException
	 * @throws FileNotFoundException
	 * @throws ClassNotFoundException
	 */

	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, IOException, DaoException {
		JFrame jframe = new JFrame();
		jframe.setSize(500, 500);
		jframe.setLocationRelativeTo(null);
		JTable jtable = new JTable(new EmployeeTableModel());
		jframe.add(new JScrollPane(jtable));
		jframe.setVisible(true);
		// System.out.println();
	}
}

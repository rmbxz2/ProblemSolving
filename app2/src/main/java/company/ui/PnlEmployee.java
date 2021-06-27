package company.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import company.beans.Employee;
import company.dao.EmployeeDao;
import company.exception.DaoException;

public class PnlEmployee extends JPanel {

	private static final long serialVersionUID = 1L;
	public int MODE_ADD = 0;
	public int MODE_VIEW = 1;
	public int MODE_EDIT = 2;
	public int MODE_FIND = 3;

	private JTextField txtId = new JTextField(20);
	private JTextField txtName = new JTextField(20);
	private JTextField txtSalary = new JTextField(20);

	private JButton btnAdd = new JButton("add");
	private JButton btnClose = new JButton("close");
	private JButton btnSave = new JButton("save");
	private JButton btnDelete = new JButton("delete");
	private JButton btnCancel = new JButton("cancel");
	private JButton btnEdit = new JButton("edit");
	private JButton btnFind = new JButton("find");
	int mode;
	private static JFrame frame;

	public PnlEmployee() {
		init();
	}

	/**
	 * @param mode
	 */
	public PnlEmployee(int mode) {
		setMode(mode);
		init();
	}

	private void setMode(int mode) {
		this.mode = mode;
		setButtonsVisibltyTxtEditable();
	}

	private void setButtonsVisibltyTxtEditable() {

		if (this.mode == this.MODE_ADD) {
			this.btnAdd.setVisible(true);
			this.btnClose.setVisible(true);
			this.btnSave.setVisible(true);
			this.btnDelete.setVisible(true);
			this.btnCancel.setVisible(true);
			this.btnEdit.setVisible(true);
			this.btnFind.setVisible(true);
			this.txtId.setVisible(true);
			this.txtName.setVisible(true);
			this.txtSalary.setVisible(true);

		}
		if (this.mode == this.MODE_VIEW) {
			this.btnAdd.setVisible(true);
			this.btnClose.setVisible(true);
			this.btnSave.setVisible(true);
			this.btnDelete.setVisible(true);
			this.btnCancel.setVisible(true);
			this.btnEdit.setVisible(true);
			this.btnFind.setVisible(true);
			this.txtId.setVisible(true);
			this.txtName.setVisible(true);
			this.txtSalary.setVisible(true);

		}
		if (this.mode == this.MODE_EDIT) {
			this.btnAdd.setVisible(true);
			this.btnClose.setVisible(true);
			this.btnSave.setVisible(true);
			this.btnDelete.setVisible(true);
			this.btnCancel.setVisible(true);
			this.btnEdit.setVisible(true);
			this.btnFind.setVisible(true);
			this.txtId.setVisible(true);
			this.txtName.setVisible(true);
			this.txtSalary.setVisible(true);
		}
		if (this.mode == this.MODE_FIND) {
			this.btnAdd.setVisible(true);
			this.btnClose.setVisible(true);
			this.btnSave.setVisible(true);
			this.btnDelete.setVisible(true);
			this.btnCancel.setVisible(true);
			this.btnEdit.setVisible(true);
			this.btnFind.setVisible(true);
			this.txtId.setVisible(true);
			this.txtName.setVisible(true);
			this.txtSalary.setVisible(true);
		}

	}

	private void init() {
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(700, 600));
		JPanel pnlLabeledTxtPanel = new JPanel();
		pnlLabeledTxtPanel.add(getEmployeeInfPnl());
		add(pnlLabeledTxtPanel, BorderLayout.CENTER);
		add(getButtonsPanel(), BorderLayout.SOUTH);
		this.btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					handleAdd();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (DaoException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		this.btnClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				handleClose();
			}
		});
		this.btnSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					handleSave();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (DaoException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		this.btnDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					handleDelete();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (DaoException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		this.btnCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				handleCancel();
			}
		});

		this.btnEdit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					handleEdit();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (DaoException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		this.btnFind.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					handleFind();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (DaoException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

	}

	protected void handleFind() throws DaoException, ClassNotFoundException, FileNotFoundException, IOException {
		Employee employee = new Employee();
		EmployeeDao employeeDao = new EmployeeDao();
		employee = employeeDao.findEmployee(viewToModel(this.MODE_FIND).getId());
		modelToView(employee);
		setMode(this.MODE_VIEW);
	}

	protected void handleEdit() throws DaoException, ClassNotFoundException, FileNotFoundException, IOException {
		EmployeeDao employeeDao = new EmployeeDao();
		employeeDao.updateEmployee(viewToModel(this.MODE_EDIT));
		setMode(this.MODE_EDIT);

	}

	protected void handleCancel() {
		setMode(this.MODE_VIEW);
	}

	/**
	 * @throws DaoException
	 * @throws ClassNotFoundException
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	protected void handleDelete() throws DaoException, ClassNotFoundException, FileNotFoundException, IOException {

		EmployeeDao employeeDao = new EmployeeDao();
		employeeDao.deleteEmployee(viewToModel(this.MODE_FIND).getId());
		setMode(this.MODE_EDIT);
		cleanTxtFields();
	}

	/**
	 * 
	 */
	private void cleanTxtFields() {
		this.txtId.setText("");
		this.txtName.setText("");
		this.txtSalary.setText("");
	}

	protected void handleSave() throws DaoException, ClassNotFoundException, FileNotFoundException, IOException {
		EmployeeDao employeeDao = new EmployeeDao();
		employeeDao.updateEmployee(viewToModel(this.MODE_EDIT));
		setMode(this.MODE_EDIT);

	}

	protected void handleClose() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	protected void handleAdd() throws ClassNotFoundException, FileNotFoundException, IOException, DaoException {
		EmployeeDao employeeDao = new EmployeeDao();
		employeeDao.addEmployee(viewToModel(this.MODE_ADD));

	}

	private Employee viewToModel(int mode) {
		Employee employee = new Employee();
		if (mode == this.MODE_ADD) {
			if (testTextField(this.txtName, "please enter Employee Name !")) {
				employee.setName(this.txtName.getText());
			}
			if (testTextField(this.txtSalary, "please enter Employee Salary !")) {
				employee.setSalary(Integer.parseInt(this.txtSalary.getText()));
			}
		}
		if (mode == this.MODE_FIND) {
			if (testTextField(this.txtId, "please enter Employee Id !")) {
				employee.setId(Integer.parseInt(this.txtId.getText()));
			}
		}
		if (mode == this.MODE_EDIT) {

			if (testTextField(this.txtId, "please enter Employee id !")) {
				employee.setId(Integer.parseInt(this.txtId.getText()));
			}

			if (testTextField(this.txtName, "please enter Employee Name !")) {
				employee.setName(this.txtName.getText());
			}

			if (testTextField(this.txtSalary, "please enter Employee Salary !")) {
				employee.setSalary(Integer.parseInt(this.txtSalary.getText()));
			}
		}
		// if (mode == MODE_VIEW) {
		// }
		return employee;
	}

	private void modelToView(Employee employee) {
		this.txtId.setText("" + employee.getId());
		this.txtName.setText("" + employee.getName());
		this.txtSalary.setText("" + employee.getSalary());
	}

	private Boolean testTextField(JTextField txtName, String ErrorMsg) {
		if (txtName.getText().trim().equals("")) {
			JOptionPane.showMessageDialog(this, ErrorMsg);
			return false;
		} else {
			return true;
		}
	}

	private JPanel getButtonsPanel() {
		JPanel pnlButtons = new JPanel();
		pnlButtons.setBorder(BorderFactory.createTitledBorder("Edit of Employee"));
		pnlButtons.add(this.btnAdd);
		pnlButtons.add(this.btnClose);
		pnlButtons.add(this.btnSave);
		pnlButtons.add(this.btnDelete);
		pnlButtons.add(this.btnCancel);
		pnlButtons.add(this.btnEdit);
		pnlButtons.add(this.btnFind);
		return pnlButtons;
	}

	private JPanel getEmployeeInfPnl() {
		JPanel pnl = new JPanel();
		pnl.setBorder(BorderFactory.createTitledBorder("Employee Info"));
		pnl.setLayout(new BoxLayout(pnl, BoxLayout.Y_AXIS));
		pnl.add(SwingUtil.buildLableTextPanel("Id", this.txtId));
		pnl.add(SwingUtil.buildLableTextPanel("Name", this.txtName));
		pnl.add(SwingUtil.buildLableTextPanel("Salary", this.txtSalary));
		return pnl;
	}

	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, DaoException, IOException {

		frame = new JFrame();
		PnlEmployee pnlEmployee = new PnlEmployee();
		frame.setSize(new Dimension(600, 600));
		frame.add(pnlEmployee, BorderLayout.CENTER);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		System.out.println("");

		// hi sir

		/*
				// handleFind 2 khawla 66
				pnlEmployee.txtId.setText("2");
				pnlEmployee.handleFind();
				pnlEmployee.txtName.setText("sami");
				pnlEmployee.txtSalary.setText("999");
				pnlEmployee.handleSave();
		*/

	}
}

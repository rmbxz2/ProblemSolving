package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;

import spring.model.Employee;

/**
* Describe class here.
*
*
*
*
*
*/
public class EmpController {

	@Autowired
	private Employee emp;

	/**
	*
	*
	*/
	public void printEmp() {
		System.out.println("emp by annotation = " + emp);

	}

}

package com.example.demo3.services;

import java.util.List;

import com.example.demo3.Repository.EmployeeRepository;
import com.example.demo3.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* Describe class here.
*
*
*
*
*
*/
@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	/**
	* 
	* @return
	*/
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	/**
	* 
	* @param id
	* @return
	*/
	public Employee findEmpByID(long id) {
		return employeeRepository.findById(id).orElseThrow();
	}

	/**
	* 0
	* @param firstName
	* @return
	*/
	public List<Employee> findEmpByFirstName(String firstName) {
		return employeeRepository.findByFirstName(firstName);
	}

	/**
	* 
	* @param firstName
	* @return
	*/
	public List<Employee> findEmpByFirstNameQuery(String firstName) {
		return employeeRepository.findEmpByFirstName(firstName);
	}

	/**
	* 
	* @param lastName
	* @return
	*/
	public List<Employee> findEmpByLastNameQueryNative(String lastName) {
		return employeeRepository.findNativeEmpByLastName(lastName);
	}

	/**
	* 
	* @param emp
	* @return
	*/
	public Employee saveEmp(Employee emp) {
		return employeeRepository.save(emp);
	}

	/**
	* 
	* @param emp
	* @return
	*/
	public Employee saveEmpByPost(Employee emp) {
		return employeeRepository.save(emp);
	}

	/**
	* 
	* @param emp
	* @return
	*/
	public Employee saveEmpByPut(Employee emp) {
		return employeeRepository.save(emp);
	}

	/**
	* 
	* @param id
	*/
	public void delByID(long id) {
		employeeRepository.deleteById(id);
	}

	/**
	* 
	* @param emp
	*/
	public void delByEmp(Employee emp) {
		employeeRepository.delete(emp);
	}

	/**
	* 
	* @return
	*/
	public List<Employee> getAllEmployeesOfDeptId(long id) {
		return employeeRepository.findAllEmpOfDeptId(id);
	}

	/**
	* 
	* @return
	*/
	public List<Employee> getAllEmployeesOfDeptId2(long id) {
		return employeeRepository.findByDepartementId(id);

	}

}

package com.example.demo3.control;

import java.util.List;

import com.example.demo3.model.Employee;
import com.example.demo3.services.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
* Describe class here.
*
*
*
*
*
*/

// @RequestMapping("/emp/api/") 
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeservice;

	/**
	
	#
	GET http://localhost:8080/employees
	#
	
	* http://localhost:8080/employees
	* @return
	*/
	@GetMapping(value = "/employees")
	public List<Employee> getAllEmployees() {

		//List<Employee> emplList = new ArrayList<Employee>();
		// emplList.add(new Employee(1, "ahmad", "ali", "jordan", 100));
		// emplList.add(new Employee(2, "moh", "ali", "jordan", 200));
		// emplList.add(new Employee(3, "saad", "ali", "jordan", 33300));
		// emplList.add(new Employee(4, "khawla", "omar", "KSA", 400));
		//return emplList;
		return employeeservice.getAllEmployees();
	}

	/**
	
	#
	GET http://localhost:8080/employee?id=17
	#
	
	* 
	* @param id
	* @return
	*/
	@GetMapping(value = "/employee")
	public Employee getMethodNameByRequest(@RequestParam long id) {
		return employeeservice.findEmpByID(id);
	}

	/**
	
	#
	GET http://localhost:8080/employee/17
	#
	
	* 
	* @param id
	* @return
	*/
	@GetMapping(value = "/employee/{id}")
	public Employee getMethodNameByPath(@PathVariable long id) {
		return employeeservice.findEmpByID(id);
	}

	/**
	
	#
	GET http://localhost:8080/employeeName/ahmad
	#
	
	* 
	* @param firstName
	* @return
	*/
	@GetMapping(value = "/employeeName/{firstName}")
	public List<Employee> getMethodNameByPath(@PathVariable String firstName) {
		return employeeservice.findEmpByFirstName(firstName);
	}

	/**
	
	#
	GET http://localhost:8080/employeeFN/ahmad
	#
	
	* 
	* @param firstName
	* @return
	*/
	@GetMapping(value = "/employeeFN/{firstName}")
	public List<Employee> getFirstNameByPath(@PathVariable String firstName) {
		return employeeservice.findEmpByFirstNameQuery(firstName);
	}

	/**
	#
	GET http://localhost:8080/employeeLN/ali
	#
	
	* GET http://localhost:8080/employeeLN/ali
	* @param lastName
	* @return
	*/
	@GetMapping(value = "/employeeLN/{lastName}")
	public List<Employee> getLastNameByPathNative(@PathVariable String lastName) {
		return employeeservice.findEmpByLastNameQueryNative(lastName);
	}

	/**
	#	
	
	:first_name   =abd
	:last_name    =karem
	:address      =germany
	:salary       =999
	GET http://localhost:8080/employeeSave?firstName=:first_name&lastName=:last_name&address=:address&salary=:salary
	
	#	
	
	GET http://localhost:8080/employeeSave?firstName=ibrahem&lastName=zaid&address=amman&salary=300
	
	#	
	* @param firstName
	* @param lastName
	* @param address
	* @param salary
	* @return
	*/
	@GetMapping(value = "/employeeSave")
	public Employee saveEmployee(@RequestParam String firstName, @RequestParam String lastName,
			@RequestParam String address, @RequestParam double salary) {
		Employee emp = new Employee(firstName, lastName, address, salary);
		return employeeservice.saveEmp(emp);
	}

	/**
	 *
	update == send id 
	create == dont send id
	
	#
	POST http://localhost:8080/employeeSaveByPost
	Content-Type: application/json
	{
	"id": 8,
	"firstName": "hamed6",
	"lastName": "aliD6",
	"address": "jordanD5",
	"salary": 4400.0
	}
	#	
	* 
	* 
	*/
	@PostMapping(value = "/employeeSaveByPost")
	public Employee saveEmployeeByPost(@RequestBody Employee employee) {
		return employeeservice.saveEmp(employee);
	}

	/**
	update == send id 
	create == dont send id
	
	
	#
	PUT http://localhost:8080/employeeSaveByPut
	Content-Type: application/json
	{
	"id": 8,
	"firstName": "hamedAli",
	"lastName": "ali",
	"address": "jordan",
	"salary": 4400.0
	}
	#
	
	* @param param
	* @return
	*/
	@PutMapping(value = "/employeeSaveByPut")
	public Employee saveEmployeeByPut(@RequestBody Employee employee) {
		return employeeservice.saveEmpByPut(employee);
	}

	/**
	
	#
	GET http://localhost:8080/employeeDelByid?id=9
	#
	
	 * 
	 * @param id
	*/
	@GetMapping(value = "/employeeDelByid")
	public String delEmployeeById(@RequestParam long id) {
		employeeservice.delByID(id);
		return "delete emp id =" + id;
	}

	/**
	
	#
	POST http://localhost:8080/employeeDelByEmp
	Content-Type: application/json
	{
	"id": 23
	}
	#	
	
	 * 
	 * @param emp
	*/
	@PostMapping(value = "/employeeDelByEmp")
	public String delEmployeeByEmp(@RequestBody Employee emp) {
		employeeservice.delByEmp(emp);
		return "delete emp " + emp;

	}

}
